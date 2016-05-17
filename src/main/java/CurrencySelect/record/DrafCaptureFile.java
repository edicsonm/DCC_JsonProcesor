package CurrencySelect.record;

import java.util.List;

public class DrafCaptureFile {

	private Record6200 headerRecord;
	private Record6240 trailerRecord;
	private List<Object> transactionRecords;

	public Record6200 getHeaderRecord() {
		return headerRecord;
	}

	public void setHeaderRecord(Record6200 headerRecord) {
		this.headerRecord = headerRecord;
	}

	public Record6240 getTrailerRecord() {
		return trailerRecord;
	}

	public void setTrailerRecord(Record6240 trailerRecord) {
		this.trailerRecord = trailerRecord;
	}

	public List<Object> getTransactionRecords() {
		return transactionRecords;
	}

	public void setTransactionRecords(List<Object> transactionRecords) {
		this.transactionRecords = transactionRecords;
	}

	@Override
	public String toString() {
		return "DrafCaptureFile [headerRecord=" + headerRecord + ", trailerRecord=" + trailerRecord
				+ ", transactionRecords=" + transactionRecords + "]";
	}

}
