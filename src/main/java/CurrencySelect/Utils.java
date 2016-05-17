package CurrencySelect;

import org.apache.log4j.Logger;

import CurrencySelect.record.Record6200;
import CurrencySelect.record.Record6220;
import CurrencySelect.record.Record6221;
import CurrencySelect.record.Record6223;
import CurrencySelect.record.Record6224;
import CurrencySelect.record.Record6240;

public class Utils {
	
	private static Logger logger = Logger.getLogger(Utils.class.getName());
	
	public static Object getData(String line, Object obj) {
		if (obj instanceof Record6200) {
			Record6200 record6200 = new Record6200();
			record6200.setRecordType(line.substring(0,4));
			record6200.setFileName(line.substring(3,36));
			record6200.setAcquirerICA(line.substring(35,42));
			record6200.setSettlementDate(line.substring(41,48));
			record6200.setDetailRecordsSize(line.substring(47,51));
			record6200.setReserved(line.substring(50,256));
//			logger.info(record6200.toString());
			obj = record6200;
		} else if (obj instanceof Record6220) {
			Record6220 record6220 = (Record6220)obj;
			record6220.setRecordType(line.substring(0,4));
			record6220.setMessageTypeIdentifier(line.substring(4,8));
			record6220.setPrimaryAccountNumber(line.substring(8,28));
			record6220.setProcessingCode(line.substring(28,34));
			record6220.setAmountTransaction(line.substring(34,46));
			record6220.setAmountSettlement(line.substring(46,58));
			record6220.setAmountCardholderBilling(line.substring(58,70));
			record6220.setTransmissionDateandTime(line.substring(70,80));
			record6220.setSystemTraceAuditNumber(line.substring(80,86));
			record6220.setDateLocalTransaction(line.substring(86,90));
			record6220.setTimeLocalTransaction(line.substring(90,96));
			record6220.setDateExpiration(line.substring(96,100));
			record6220.setDateSettlement(line.substring(100,104));
			record6220.setMerchantType(line.substring(104,108));
			record6220.setPointofServicePOSEntryMode(line.substring(108,111));
			record6220.setPointofServicePOSConditionCode(line.substring(111,113));
			record6220.setRetrievalReferenceNumber(line.substring(113,125));
			record6220.setAuthorizationIDResponse(line.substring(125,131));
			record6220.setResponseCode(line.substring(131,133));
			record6220.setTerminalID(line.substring(133,141));
			record6220.setCardAcceptorIDCode(line.substring(141,156));
			record6220.setElectronicCommerceSecurityLevelIndicator(line.substring(156,159));
			record6220.setaVSResponse(line.substring(159,160));
			record6220.setcVV2andCVC2ResultCode(line.substring(160,161));
			record6220.setVisa3DSecureElectronicCommerceTransactionIndicator(line.substring(161,162));
			record6220.setCurrencyCodeTransaction(line.substring(162,165));
			record6220.setCurrencyCodeSettlement(line.substring(165,168));
			record6220.setCurrencyCodeCardholderBilling(line.substring(168,171));
			record6220.setAdviceReasonCode(line.substring(171,174));
			record6220.setrFU(line.substring(174,175));
			record6220.setpOSCardholderPresenceIndicator(line.substring(175,176));
			record6220.setpOSTransactionStatusIndicator(line.substring(176,177));
			record6220.setCardholderactivatedTerminalLevelIndicator(line.substring(177,178));
			record6220.setNetworkReferenceNumber(line.substring(178,187));
			record6220.setOriginalSTAN(line.substring(187,193));
			record6220.setOriginalDate(line.substring(193,197));
			record6220.setAcquirerspecificPrivateData(line.substring(197,246));
//			logger.info(record6220.toString());
			obj = record6220;
		} else if (obj instanceof Record6221) {
			Record6221 record6221 = (Record6221)obj;
			record6221.setRecordType(line.substring(0,4));
			record6221.setMerchantName(line.substring(4,26));
			record6221.setMerchantStreetAddress(line.substring(26,71));
			record6221.setMerchantCity(line.substring(71,84));
			record6221.setMerchantStateProvinceCode(line.substring(84,87));
			record6221.setMerchantPOSCountryCode(line.substring(87,90));
			record6221.setMerchantPOSZipCode(line.substring(90,100));
			record6221.setFinancialNetworkCode(line.substring(100,103));
			record6221.setTransactionCategoryCode(line.substring(103,104));
			record6221.setMerchantAdviceCode(line.substring(104,106));
			record6221.setMagneticStripeComplianceStatusIndicator(line.substring(106,107));
			record6221.setMagneticStripeComplianceErrorIndicator(line.substring(107,108));
			record6221.setWalletProgramData(line.substring(108,111));
			record6221.setrFU(line.substring(111,255));
//			logger.info(record6221.toString());
			obj = record6221;
		
		} else if (obj instanceof Record6223) {
			
			Record6223 record6223 = new Record6223();
			record6223.setRecordType(line.substring(0, 4));
			record6223.setvISACAVVResultsCode(line.substring(4,5));
			record6223.setvISACardLevelResults(line.substring(5,7));
			record6223.setuSDeferredBillingIndicator(line.substring(7,8));
			record6223.setvISAUSExistingDebtIndicator(line.substring(8,9));
			record6223.setvISARelationshipParticipantIndicator(line.substring(9,10));
			record6223.setvISAACIIndicator(line.substring(10,11));
			record6223.setvISATransactionIdentification(line.substring(11,26));
			record6223.setvISAValidationCode(line.substring(26,30));
			record6223.setvISACommercialCardInquiryResponse(line.substring(30,31));
			record6223.setVisaMarketSpecificDataIdentifier(line.substring(31,32));
			record6223.setPrestigiousPropertiesIndicator(line.substring(32,33));
			record6223.setMerchantVerificationValue(line.substring(33,43));
			record6223.setSpendQualifiedIndicator(line.substring(43,44));
			record6223.setReserved(line.substring(44,256));
//			logger.info(record6223.toString());
			obj = record6223;
		} else if (obj instanceof Record6224) {
			Record6224 record6224 = new Record6224();
			record6224.setRecordType(line.substring(0,4));
			record6224.setAcquirerReferenceData(line.substring(4,19));
			record6224.setrFU(line.substring(19,256));
			obj = record6224;
		} else if (obj instanceof Record6240) {
			Record6240 record6240 = new Record6240();
			record6240.setRecordType(line.substring(0,4));
			record6240.setFileName(line.substring(4,36));
			record6240.setAcquirerICA(line.substring(36,42));
			record6240.setSettlementDate(line.substring(42,48));
			record6240.setNumberOfFinancialTransactions(line.substring(48,56));
			record6240.setReserved(line.substring(56,256));
			obj = record6240;
		}
		return obj;
	}
}
