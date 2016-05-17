package CurrencySelect.record;

import java.util.ArrayList;
import java.util.List;

public class Record6200 {
	
	private String recordType;
	private String fileName;
	private String acquirerICA;
	private String settlementDate;
	private String detailRecordsSize;
	private String reserved;
	private List<Object> listTrxInformation = new ArrayList<Object>();

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAcquirerICA() {
		return acquirerICA;
	}

	public void setAcquirerICA(String acquirerICA) {
		this.acquirerICA = acquirerICA;
	}

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getDetailRecordsSize() {
		return detailRecordsSize;
	}

	public void setDetailRecordsSize(String detailRecordsSize) {
		this.detailRecordsSize = detailRecordsSize;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	

	public List<Object> getListTrxInformation() {
		return listTrxInformation;
	}

	public void setListTrxInformation(List<Object> listTrxInformation) {
		this.listTrxInformation = listTrxInformation;
	}

	@Override
	public String toString() {
		return "Record6200 [recordType=" + recordType + ", fileName=" + fileName + ", acquirerICA=" + acquirerICA
				+ ", settlementDate=" + settlementDate + ", detailRecordsSize=" + detailRecordsSize + ", reserved="
				+ reserved + ", listTrxInformation=" + listTrxInformation + "]";
	}

}
