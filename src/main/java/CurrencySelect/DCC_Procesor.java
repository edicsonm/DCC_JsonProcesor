package CurrencySelect;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.json.JsonValue;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import CurrencySelect.record.DrafCaptureFile;
import CurrencySelect.record.Record6200;
import CurrencySelect.record.Record6220;
import CurrencySelect.record.Record6221;
import CurrencySelect.record.Record6223;
import CurrencySelect.record.Record6240;

/**
 * Hello world!
 *
 */
public class DCC_Procesor extends JFrame implements ActionListener {
	private static Logger logger = Logger.getLogger(DCC_Procesor.class.getName());
	private static final long serialVersionUID = -3873129658285344498L;
	final static String LOOKANDFEEL = "Metal";
	private JTree tree;
	
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem;
	JFileChooser originalFilefc = new JFileChooser();

	public DCC_Procesor() {
		this.setTitle("Java AWT Examples");

		menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("Load Files");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);
		
		JMenuItem newMenuItem = new JMenuItem("Load Original File", KeyEvent.VK_N);
	    newMenuItem.addActionListener(this);
	    
	    fileMenu.add(newMenuItem);
		
	    JMenu themeMenu = new JMenu("Themes");
	    JMenuItem defaulTheme = new JMenuItem("Defaul", KeyEvent.VK_D);
	    defaulTheme.addActionListener(this);
	    themeMenu.add(defaulTheme);
	    
	    JMenuItem oceanTheme = new JMenuItem("Ocean", KeyEvent.VK_O);
	    oceanTheme.addActionListener(this);
	    themeMenu.add(oceanTheme);
	    
	    JMenuItem greenTheme = new JMenuItem("Green", KeyEvent.VK_G);
	    greenTheme.addActionListener(this);
	    themeMenu.add(greenTheme);
	    
	    JMenuItem aquaTheme = new JMenuItem("Aqua", KeyEvent.VK_A);
	    aquaTheme.addActionListener(this);
	    themeMenu.add(aquaTheme);
	    
	    //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        //create the child nodes
        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
 
        //add the child nodes to the root node
        root.add(vegetableNode);
        root.add(fruitNode);
         
        //create the tree by passing in the root node
        tree = new JTree(root);
//        add(tree);
        
//        this.setLayout(null);
        this.setJMenuBar(menuBar);
        this.setSize(500, 500);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
//		logger.info("Presiono click");
		 if(e.getActionCommand().equalsIgnoreCase("Load Original File")){			
			 int returnVal = originalFilefc.showOpenDialog(DCC_Procesor.this);
//			 logger.info("returnVal:  " + returnVal);
			 if (returnVal == JFileChooser.APPROVE_OPTION) {
				FileReader fr = null;
				BufferedReader br = null;
				File file = originalFilefc.getSelectedFile();
//				logger.info("Opening: " + file.getName() );
				try {
					ObjectMapper mapper = new ObjectMapper();
					DrafCaptureFile drafCaptureFile = new DrafCaptureFile();
					List<Object> transactionDetails = new ArrayList<Object>();
					List<Object> transactionDetail = null;
					
					Record6200 record6200 = new Record6200();
					Record6240 record6240 = new Record6240();
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					String line;
					while ((line = br.readLine()) != null) {
						if (line != null && line.substring(0, 4).equalsIgnoreCase("6200")) {//HeaderRecord
							record6200 = (Record6200)Utils.getData(line, new Record6200());
							drafCaptureFile.setHeaderRecord(record6200);
						} else if (line != null && line.substring(0, 4).equalsIgnoreCase("6220")) {//Transaction Detail
							if(transactionDetail != null){
								transactionDetails.add(transactionDetail);
								transactionDetail = new ArrayList<Object>();
							}else{
								transactionDetail = new ArrayList<Object>();
							}
							transactionDetail.add(Utils.getData(line, new Record6220()));
						} else if (line != null && line.substring(0, 4).equalsIgnoreCase("6221")) {
							transactionDetail.add(Utils.getData(line, new Record6221()));
						} else if (line != null && line.substring(0, 4).equalsIgnoreCase("6223")) {
							transactionDetail.add(Utils.getData(line, new Record6223()));
						
						} else if (line != null && line.substring(0, 4).equalsIgnoreCase("6240")) {//TrailerRecord
							record6240 = (Record6240)Utils.getData(line, new Record6240());
							drafCaptureFile.setTrailerRecord(record6240);
						}
					}
					transactionDetails.add(transactionDetail);
					
					drafCaptureFile.setTransactionRecords(transactionDetails);
					//logger.info(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(drafCaptureFile));
					
					
					JsonReader jsonReader = Json.createReader(new StringReader(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(drafCaptureFile)));
				    JsonObject object = jsonReader.readObject();
				    navigateTree(object, null);
				    
//					JsonReader reader = Json.createReader(new FileReader("jsondata.txt"));
					
					//showThree();
				} catch (FileNotFoundException e1) {
					logger.error("Error !!! ", e1);
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
					logger.error("Error !!! ", e1);
				}
			} else {
				logger.info("Open command cancelled by user.");
			}
		 }else{
			 logger.info("No action to take");
		 }
    }
	
	public static void navigateTree(JsonValue tree, String key) {
		if (key != null) System.out.print("Key " + key + ": ");
		switch (tree.getValueType()) {
		case OBJECT:
			System.out.println("OBJECT");
			JsonObject object = (JsonObject) tree;
			for (String name : object.keySet())
				navigateTree(object.get(name), name);
			break;
		case ARRAY:
			System.out.println("ARRAY");
			JsonArray array = (JsonArray) tree;
			for (JsonValue val : array)
				navigateTree(val, null);
			break;
		case STRING:
			JsonString st = (JsonString) tree;
			System.out.println("STRING " + st.getString());
			break;
		case NUMBER:
			JsonNumber num = (JsonNumber) tree;
			System.out.println("NUMBER " + num.toString());
			break;
		case TRUE:
		case FALSE:
		case NULL:
			System.out.println(tree.getValueType().toString());
			break;
		}
	}
	
	
	private void showThree() {
		tree.
		add(tree);
		this.revalidate();
		this.repaint();
		
	}

	public static void main(String[] args) {
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame.setDefaultLookAndFeelDecorated(true);
		Toolkit.getDefaultToolkit().setDynamicLayout(true);
		try {
			UIManager.setLookAndFeel(new MetalLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			logger.info("MetalLookAndFeel no es soportada por esta plataforma. \nPrograma terminado");
			System.exit(0);
		}
		new DCC_Procesor();
	}

}

/*class loadFileListener implements ActionListener {
	
    public void actionPerformed(ActionEvent e) {            
    	 System.out.println("Presiono click en le menu de cargar archivo");
    	 int returnVal = fc.showOpenDialog(DCC_Procesor.this);
    }    
 }
*/