package CurrencySelect.record;

public class Record6221 {

	private String recordType;
	private String merchantName;
	private String merchantStreetAddress;
	private String merchantCity;
	private String merchantStateProvinceCode;
	private String merchantPOSCountryCode;
	private String merchantPOSZipCode;
	private String financialNetworkCode;
	private String transactionCategoryCode;
	private String merchantAdviceCode;
	private String magneticStripeComplianceStatusIndicator;
	private String magneticStripeComplianceErrorIndicator;
	private String walletProgramData;
	private String rFU;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantStreetAddress() {
		return merchantStreetAddress;
	}

	public void setMerchantStreetAddress(String merchantStreetAddress) {
		this.merchantStreetAddress = merchantStreetAddress;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantStateProvinceCode() {
		return merchantStateProvinceCode;
	}

	public void setMerchantStateProvinceCode(String merchantStateProvinceCode) {
		this.merchantStateProvinceCode = merchantStateProvinceCode;
	}

	public String getMerchantPOSCountryCode() {
		return merchantPOSCountryCode;
	}

	public void setMerchantPOSCountryCode(String merchantPOSCountryCode) {
		this.merchantPOSCountryCode = merchantPOSCountryCode;
	}

	public String getMerchantPOSZipCode() {
		return merchantPOSZipCode;
	}

	public void setMerchantPOSZipCode(String merchantPOSZipCode) {
		this.merchantPOSZipCode = merchantPOSZipCode;
	}

	public String getFinancialNetworkCode() {
		return financialNetworkCode;
	}

	public void setFinancialNetworkCode(String financialNetworkCode) {
		this.financialNetworkCode = financialNetworkCode;
	}

	public String getTransactionCategoryCode() {
		return transactionCategoryCode;
	}

	public void setTransactionCategoryCode(String transactionCategoryCode) {
		this.transactionCategoryCode = transactionCategoryCode;
	}

	public String getMerchantAdviceCode() {
		return merchantAdviceCode;
	}

	public void setMerchantAdviceCode(String merchantAdviceCode) {
		this.merchantAdviceCode = merchantAdviceCode;
	}

	public String getMagneticStripeComplianceStatusIndicator() {
		return magneticStripeComplianceStatusIndicator;
	}

	public void setMagneticStripeComplianceStatusIndicator(String magneticStripeComplianceStatusIndicator) {
		this.magneticStripeComplianceStatusIndicator = magneticStripeComplianceStatusIndicator;
	}

	public String getMagneticStripeComplianceErrorIndicator() {
		return magneticStripeComplianceErrorIndicator;
	}

	public void setMagneticStripeComplianceErrorIndicator(String magneticStripeComplianceErrorIndicator) {
		this.magneticStripeComplianceErrorIndicator = magneticStripeComplianceErrorIndicator;
	}

	public String getWalletProgramData() {
		return walletProgramData;
	}

	public void setWalletProgramData(String walletProgramData) {
		this.walletProgramData = walletProgramData;
	}

	public String getrFU() {
		return rFU;
	}

	public void setrFU(String rFU) {
		this.rFU = rFU;
	}

	@Override
	public String toString() {
		return "Record6221 [recordType=" + recordType + ", merchantName=" + merchantName + ", merchantStreetAddress="
				+ merchantStreetAddress + ", merchantCity=" + merchantCity + ", merchantStateProvinceCode="
				+ merchantStateProvinceCode + ", merchantPOSCountryCode=" + merchantPOSCountryCode
				+ ", merchantPOSZipCode=" + merchantPOSZipCode + ", financialNetworkCode=" + financialNetworkCode
				+ ", transactionCategoryCode=" + transactionCategoryCode + ", merchantAdviceCode=" + merchantAdviceCode
				+ ", magneticStripeComplianceStatusIndicator=" + magneticStripeComplianceStatusIndicator
				+ ", magneticStripeComplianceErrorIndicator=" + magneticStripeComplianceErrorIndicator
				+ ", walletProgramData=" + walletProgramData + ", rFU=" + rFU + "]";
	}

}
