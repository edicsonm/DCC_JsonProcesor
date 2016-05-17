package CurrencySelect.record;

public class Record6240 {

	private String recordType;
	private String fileName;
	private String acquirerICA;
	private String settlementDate;
	private String NumberOfFinancialTransactions;
	private String reserved;

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

	public String getNumberOfFinancialTransactions() {
		return NumberOfFinancialTransactions;
	}

	public void setNumberOfFinancialTransactions(String numberOfFinancialTransactions) {
		NumberOfFinancialTransactions = numberOfFinancialTransactions;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	@Override
	public String toString() {
		return "Record6240 [recordType=" + recordType + ", fileName=" + fileName + ", acquirerICA=" + acquirerICA
				+ ", settlementDate=" + settlementDate + ", NumberOfFinancialTransactions="
				+ NumberOfFinancialTransactions + ", reserved=" + reserved + "]";
	}

}
