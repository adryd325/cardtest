package com.adryd.cardtest;

import java.util.HashMap;

public class TLVTags {
    public static HashMap<String, TLVTag> TagMap = new HashMap<>();

    public static TLVTag _9F01 = new TLVTag("9F01", TLVDataType.BINARY, "Acquirer Identifier", "Uniquely identifies the acquirer within each payment system");
    public static TLVTag _9F40 = new TLVTag("9F40", TLVDataType.BINARY, "Additional Terminal Capabilities", "Indicates the data input and output capabilities of the terminal");
    public static TLVTag _81 = new TLVTag("81", TLVDataType.BINARY, "Amount, Authorised (Binary)", "Authorised amount of the transaction (excluding adjustments)");
    public static TLVTag _9F02 = new TLVTag("9F02", TLVDataType.BINARY, "Amount, Authorised (Numeric)", "Authorised amount of the transaction (excluding adjustments)");
    public static TLVTag _9F04 = new TLVTag("9F04", TLVDataType.BINARY, "Amount, Other (Binary)", "Secondary amount associated with the transaction representing a cashback amount");
    public static TLVTag _9F03 = new TLVTag("9F03", TLVDataType.BINARY, "Amount, Other (Numeric)", "Secondary amount associated with the transaction representing a cashback amount");
    public static TLVTag _9F3A = new TLVTag("9F3A", TLVDataType.BINARY, "Amount, Reference Currency", "Authorised amount expressed in the reference currency");
    public static TLVTag _9F26 = new TLVTag("9F26", TLVDataType.BINARY, "Application Cryptogram", "Cryptogram returned by the ICC in response of the GENERATE AC command");
    public static TLVTag _9F42 = new TLVTag("9F42", TLVDataType.BINARY, "Application Currency Code", "Indicates the currency in which the account is managed according to ISO 4217");
    public static TLVTag _9F44 = new TLVTag("9F44", TLVDataType.BINARY, "Application Currency Exponent", "Indicates the implied position of the decimal point from the right of the amount represented according to ISO 4217");
    public static TLVTag _9F05 = new TLVTag("9F05", TLVDataType.BINARY, "Application Discretionary Data", "Issuer or payment system specified data relating to the application");
    public static TLVTag _5F25 = new TLVTag("5F25", TLVDataType.BINARY, "Application Effective Date", "Date from which the application may be used");
    public static TLVTag _5F24 = new TLVTag("5F24", TLVDataType.BINARY, "Application Expiration Date", "Date after which application expires");
    public static TLVTag _94 = new TLVTag("94", TLVDataType.BINARY, "Application File Locator (AFL)", "Indicates the location (SFI, range of records) of the AEFs related to a given application");
    public static TLVTag _4F = new TLVTag("4F", TLVDataType.BINARY, "Application Identifier (AID) – card", "Identifies the application as described in ISO/IEC 7816-5");
    public static TLVTag _9F06 = new TLVTag("9F06", TLVDataType.BINARY, "Application Identifier (AID) – terminal", "Identifies the application as described in ISO/IEC 7816-5");
    public static TLVTag _82 = new TLVTag("82", TLVDataType.BINARY, "Application Interchange Profile", "Indicates the capabilities of the card to support specific functions in the application");
    public static TLVTag _50 = new TLVTag("50", TLVDataType.STRING, "Application Label", "Mnemonic associated with the AID according to ISO/IEC 7816-5");
    public static TLVTag _9F12 = new TLVTag("9F12", TLVDataType.BINARY, "Application Preferred Name", "Preferred mnemonic associated with the AID");
    public static TLVTag _5A = new TLVTag("5A", TLVDataType.BINARY, "Application Primary Account Number (PAN)", "Valid cardholder account number");
    public static TLVTag _5F34 = new TLVTag("5F34", TLVDataType.BINARY, "Application Primary Account Number (PAN) Sequence Number", "Identifies and differentiates cards with the same PAN");
    public static TLVTag _87 = new TLVTag("87", TLVDataType.BINARY, "Application Priority Indicator", "Indicates the priority of a given application or group of applications in a directory");
    public static TLVTag _9F3B = new TLVTag("9F3B", TLVDataType.BINARY, "Application Reference Currency", "1–4 currency codes used between the terminal and the ICC when the Transaction Currency Code is different from the Application Currency Code; each code is 3 digits according to ISO 4217");
    public static TLVTag _9F43 = new TLVTag("9F43", TLVDataType.BINARY, "Application Reference Currency Exponent", "Indicates the implied position of the decimal point from the right of the amount, for each of the 1–4 reference currencies represented according to ISO 4217");
    public static TLVTag _61 = new TLVTag("61", TLVDataType.NESTED, "Application Template", "Contains one or more data objects relevant to an application directory entry according to ISO/IEC 7816-5");
    public static TLVTag _9F36 = new TLVTag("9F36", TLVDataType.BINARY, "Application Transaction Counter (ATC)", "Counter maintained by the application in the ICC (incrementing the ATC is managed by the ICC)");
    public static TLVTag _9F07 = new TLVTag("9F07", TLVDataType.BINARY, "Application Usage Control", "Indicates issuer’s specified restrictions on the geographic usage and services allowed for the application");
    public static TLVTag _9F08 = new TLVTag("9F08", TLVDataType.BINARY, "Application Version Number", "Version number assigned by the payment system for the application");
    public static TLVTag _9F09 = new TLVTag("9F09", TLVDataType.BINARY, "Application Version Number", "Version number assigned by the payment system for the application");
    public static TLVTag _89 = new TLVTag("89", TLVDataType.BINARY, "Authorisation Code", "Value generated by the authorisation authority for an approved transaction");
    public static TLVTag _8A = new TLVTag("8A", TLVDataType.BINARY, "Authorisation Response Code", "Code that defines the disposition of a message");
    public static TLVTag _5F54 = new TLVTag("5F54", TLVDataType.BINARY, "Bank Identifier Code (BIC)", "Uniquely identifies a bank as defined in ISO 9362.");
    public static TLVTag _8C = new TLVTag("8C", TLVDataType.BINARY, "Card Risk Management Data Object List 1 (CDOL1)", "List of data objects (tag and length) to be passed to the ICC in the first GENERATE AC command");
    public static TLVTag _8D = new TLVTag("8D", TLVDataType.BINARY, "Card Risk Management Data Object List 2 (CDOL2)", "List of data objects (tag and length) to be passed to the ICC in the second GENERATE AC command");
    public static TLVTag _5F20 = new TLVTag("5F20", TLVDataType.BINARY, "Cardholder Name", "Indicates cardholder name according to ISO 7813");
    public static TLVTag _9F0B = new TLVTag("9F0B", TLVDataType.BINARY, "Cardholder Name Extended", "Indicates the whole cardholder name when greater than 26 characters using the same coding convention as in ISO 7813");
    public static TLVTag _8E = new TLVTag("8E", TLVDataType.BINARY, "Cardholder Verification Method (CVM) List", "Identifies a method of verification of the cardholder supported by the application");
    public static TLVTag _9F34 = new TLVTag("9F34", TLVDataType.BINARY, "Cardholder Verification Method (CVM) Results", "Indicates the results of the last CVM performed");
    public static TLVTag _8F = new TLVTag("8F", TLVDataType.BINARY, "Certification Authority Public Key Index", "Identifies the certification authority’s public key in conjunction with the RID");
    public static TLVTag _9F22 = new TLVTag("9F22", TLVDataType.BINARY, "Certification Authority Public Key Index", "Identifies the certification authority’s public key in conjunction with the RID");
    public static TLVTag _83 = new TLVTag("83", TLVDataType.BINARY, "Command Template", "Identifies the data field of a command message");
    public static TLVTag _9F27 = new TLVTag("9F27", TLVDataType.BINARY, "Cryptogram Information Data", "Indicates the type of cryptogram and the actions to be performed by the terminal");
    public static TLVTag _9F45 = new TLVTag("9F45", TLVDataType.BINARY, "Data Authentication Code", "An issuer assigned value that is retained by the terminal during the verification process of the Signed Static Application Data");
    public static TLVTag _84 = new TLVTag("84", TLVDataType.BINARY, "Dedicated File (DF) Name", "Identifies the name of the DF as described in ISO/IEC 7816-4");
    public static TLVTag _9D = new TLVTag("9D", TLVDataType.BINARY, "Directory Definition File (DDF) Name", "Identifies the name of a DF associated with a directory");
    public static TLVTag _73 = new TLVTag("73", TLVDataType.BINARY, "Directory Discretionary Template", "Issuer discretionary part of the directory according to ISO/IEC 7816-5");
    public static TLVTag _9F49 = new TLVTag("9F49", TLVDataType.BINARY, "Dynamic Data Authentication Data Object List (DDOL)", "List of data objects (tag and length) to be passed to the ICC in the INTERNAL AUTHENTICATE command");
    public static TLVTag _70 = new TLVTag("70", TLVDataType.BINARY, "EMV Proprietary Template", "Template proprietary to the EMV specification");
    public static TLVTag _BF0C = new TLVTag("BF0C", TLVDataType.NESTED, "File Control Information (FCI) Issuer Discretionary Data", "Issuer discretionary part of the FCI");
    public static TLVTag _A5 = new TLVTag("A5", TLVDataType.NESTED, "File Control Information (FCI) Proprietary Template", "Identifies the data object proprietary to this specification in the FCI template according to ISO/IEC 7816-4");
    public static TLVTag _6F = new TLVTag("6F", TLVDataType.NESTED, "File Control Information (FCI) Template", "Identifies the FCI template according to ISO/IEC 7816-4");
    public static TLVTag _9F4C = new TLVTag("9F4C", TLVDataType.BINARY, "ICC Dynamic Number", "Time-variant number generated by the ICC, to be captured by the terminal");
    public static TLVTag _9F2D = new TLVTag("9F2D", TLVDataType.BINARY, "Integrated Circuit Card (ICC) PIN Encipherment Public Key Certificate", "ICC PIN Encipherment Public Key certified by the issuer");
    public static TLVTag _9F2E = new TLVTag("9F2E", TLVDataType.BINARY, "Integrated Circuit Card (ICC) PIN Encipherment Public Key Exponent", "ICC PIN Encipherment Public Key Exponent used for PIN encipherment");
    public static TLVTag _9F2F = new TLVTag("9F2F", TLVDataType.BINARY, "Integrated Circuit Card (ICC) PIN Encipherment Public Key Remainder", "Remaining digits of the ICC PIN Encipherment Public Key Modulus");
    public static TLVTag _9F46 = new TLVTag("9F46", TLVDataType.BINARY, "Integrated Circuit Card (ICC) Public Key Certificate", "ICC Public Key certified by the issuer");
    public static TLVTag _9F47 = new TLVTag("9F47", TLVDataType.BINARY, "Integrated Circuit Card (ICC) Public Key Exponent", "ICC Public Key Exponent used for the verification of the Signed Dynamic Application Data");
    public static TLVTag _9F48 = new TLVTag("9F48", TLVDataType.BINARY, "Integrated Circuit Card (ICC) Public Key Remainder", "Remaining digits of the ICC Public Key Modulus");
    public static TLVTag _9F1E = new TLVTag("9F1E", TLVDataType.BINARY, "Interface Device (IFD) Serial Number", "Unique and permanent serial number assigned to the IFD by the manufacturer");
    public static TLVTag _5F53 = new TLVTag("5F53", TLVDataType.BINARY, "International Bank Account Number (IBAN)", "Uniquely identifies the account of a customer at a financial institution as defined in ISO 13616.");
    public static TLVTag _9F0D = new TLVTag("9F0D", TLVDataType.BINARY, "Issuer Action Code – Default", "Specifies the issuer’s conditions that cause a transaction to be rejected if it might have been approved online, but the terminal is unable to process the transaction online");
    public static TLVTag _9F0E = new TLVTag("9F0E", TLVDataType.BINARY, "Issuer Action Code – Denial", "Specifies the issuer’s conditions that cause the denial of a transaction without attempt to go online");
    public static TLVTag _9F0F = new TLVTag("9F0F", TLVDataType.BINARY, "Issuer Action Code – Online", "Specifies the issuer’s conditions that cause a transaction to be transmitted online");
    public static TLVTag _9F10 = new TLVTag("9F10", TLVDataType.BINARY, "Issuer Application Data", "Contains proprietary application data for transmission to the issuer in an online transaction");
    public static TLVTag _91 = new TLVTag("91", TLVDataType.BINARY, "Issuer Authentication Data", "Data sent to the ICC for online issuer authentication");
    public static TLVTag _9F11 = new TLVTag("9F11", TLVDataType.BINARY, "Issuer Code Table Index", "Indicates the code table according to ISO/IEC 8859 for displaying the Application Preferred Name");
    public static TLVTag _5F28 = new TLVTag("5F28", TLVDataType.BINARY, "Issuer Country Code", "Indicates the country of the issuer according to ISO 3166");
    public static TLVTag _5F55 = new TLVTag("5F55", TLVDataType.BINARY, "Issuer Country Code (alpha2 format)", "Indicates the country of the issuer as defined in ISO 3166 (using a 2 character alphabetic code)");
    public static TLVTag _5F56 = new TLVTag("5F56", TLVDataType.BINARY, "Issuer Country Code (alpha3 format)", "Indicates the country of the issuer as defined in ISO 3166 (using a 3 character alphabetic code)");
    public static TLVTag _42 = new TLVTag("42", TLVDataType.BINARY, "Issuer Identification Number (IIN)", "The number that identifies the major industry and the card issuer and that forms the first part of the Primary Account Number (PAN)");
    public static TLVTag _90 = new TLVTag("90", TLVDataType.BINARY, "Issuer Public Key Certificate", "Issuer public key certified by a certification authority");
    public static TLVTag _9F32 = new TLVTag("9F32", TLVDataType.BINARY, "Issuer Public Key Exponent", "Issuer public key exponent used for theverification of the Signed Static Application Data and the ICC Public Key Certificate");
    public static TLVTag _92 = new TLVTag("92", TLVDataType.BINARY, "Issuer Public Key Remainder", "Remaining digits of the Issuer Public Key Modulus");
    public static TLVTag _86 = new TLVTag("86", TLVDataType.BINARY, "Issuer Script Command", "Contains a command for transmission to the ICC");
    public static TLVTag _9F18 = new TLVTag("9F18", TLVDataType.BINARY, "Issuer Script Identifier", "Identification of the Issuer Script");
    public static TLVTag _71 = new TLVTag("71", TLVDataType.BINARY, "Issuer Script Template 1", "Contains proprietary issuer data for transmission to the ICC before the second GENERATE AC command");
    public static TLVTag _72 = new TLVTag("72", TLVDataType.BINARY, "Issuer Script Template 2", "Contains proprietary issuer data for transmission to the ICC after the second GENERATE AC command");
    public static TLVTag _5F50 = new TLVTag("5F50", TLVDataType.BINARY, "Issuer URL", "The URL provides the location of the Issuer’s Library Server on the Internet.");
    public static TLVTag _5F2D = new TLVTag("5F2D", TLVDataType.BINARY, "Language Preference", "1–4 languages stored in order of preference, each represented by 2 alphabetical characters according to ISO 639 Note: EMVCo strongly recommends that cards be personalised with data element '5F2D' coded in lowercase, but that terminals accept the data element whether it is coded in upper or lower case.");
    public static TLVTag _9F13 = new TLVTag("9F13", TLVDataType.BINARY, "Last Online Application Transaction Counter (ATC) Register", "ATC value of the last transaction that went online");
    public static TLVTag _9F4D = new TLVTag("9F4D", TLVDataType.BINARY, "Log Entry", "Provides the SFI of the Transaction Log file and its number of records");
    public static TLVTag _9F4F = new TLVTag("9F4F", TLVDataType.BINARY, "Log Format", "List (in tag and length format) of data objects representing the logged data elements that are passed to the terminal when a transaction log record is read");
    public static TLVTag _9F14 = new TLVTag("9F14", TLVDataType.BINARY, "Lower Consecutive Offline Limit", "Issuer-specified preference for the maximum number of consecutive offline transactions for this ICC application allowed in a terminal with online capability");
    public static TLVTag _9F15 = new TLVTag("9F15", TLVDataType.BINARY, "Merchant Category Code", "Classifies the type of business being done by the merchant, represented according to ISO 8583:1993 for Card Acceptor Business Code");
    public static TLVTag _9F16 = new TLVTag("9F16", TLVDataType.BINARY, "Merchant Identifier", "When concatenated with the Acquirer Identifier, uniquely identifies a given merchant");
    public static TLVTag _9F4E = new TLVTag("9F4E", TLVDataType.BINARY, "Merchant Name and Location", "Indicates the name and location of the merchant");
    public static TLVTag _9F17 = new TLVTag("9F17", TLVDataType.BINARY, "Personal Identification Number (PIN) Try Counter", "Number of PIN tries remaining");
    public static TLVTag _9F39 = new TLVTag("9F39", TLVDataType.BINARY, "Point-of-Service (POS) Entry Mode", "Indicates the method by which the PAN was entered, according to the first two digits of the ISO 8583:1987 POS Entry Mode");
    public static TLVTag _9F38 = new TLVTag("9F38", TLVDataType.BINARY, "Processing Options Data Object List (PDOL)", "Contains a list of terminal resident data objects (tags and lengths) needed by the ICC in processing the GET PROCESSING OPTIONS command");
    public static TLVTag _80 = new TLVTag("80", TLVDataType.BINARY, "Response Message Template Format 1", "Contains the data objects (without tags and lengths) returned by the ICC in response to a command");
    public static TLVTag _77 = new TLVTag("77", TLVDataType.BINARY, "Response Message Template Format 2", "Contains the data objects (with tags and lengths) returned by the ICC in response to a command");
    public static TLVTag _5F30 = new TLVTag("5F30", TLVDataType.BINARY, "Service Code", "Service code as defined in ISO/IEC 7813 for track 1 and track 2");
    public static TLVTag _88 = new TLVTag("88", TLVDataType.BINARY, "Short File Identifier (SFI)", "Identifies the SFI to be used in the commands related to a given AEF or DDF. The SFI data object is a binary field with the three high order bits set to zero.");
    public static TLVTag _9F4B = new TLVTag("9F4B", TLVDataType.BINARY, "Signed Dynamic Application Data", "Digital signature on critical application parameters for DDA or CDA");
    public static TLVTag _93 = new TLVTag("93", TLVDataType.BINARY, "Signed Static Application Data", "Digital signature on critical application parameters for SDA");
    public static TLVTag _9F4A = new TLVTag("9F4A", TLVDataType.BINARY, "Static Data Authentication Tag List", "List of tags of primitive data objects defined in this specification whose value fields are to be included in the Signed Static or Dynamic Application Data");
    public static TLVTag _9F33 = new TLVTag("9F33", TLVDataType.BINARY, "Terminal Capabilities", "Indicates the card data input, CVM, and security capabilities of the terminal");
    public static TLVTag _9F1A = new TLVTag("9F1A", TLVDataType.BINARY, "Terminal Country Code", "Indicates the country of the terminal, represented according to ISO 3166");
    public static TLVTag _9F1B = new TLVTag("9F1B", TLVDataType.BINARY, "Terminal Floor Limit", "Indicates the floor limit in the terminal in conjunction with the AID");
    public static TLVTag _9F1C = new TLVTag("9F1C", TLVDataType.BINARY, "Terminal Identification", "Designates the unique location of a terminal at a merchant");
    public static TLVTag _9F1D = new TLVTag("9F1D", TLVDataType.BINARY, "Terminal Risk Management Data", "Application-specific value used by the card for risk management purposes");
    public static TLVTag _9F35 = new TLVTag("9F35", TLVDataType.BINARY, "Terminal Type", "Indicates the environment of the terminal, its communications capability, and its operational control");
    public static TLVTag _95 = new TLVTag("95", TLVDataType.BINARY, "Terminal Verification Results", "Status of the different functions as seen from the terminal");
    public static TLVTag _9F1F = new TLVTag("9F1F", TLVDataType.BINARY, "Track 1 Discretionary Data", "Discretionary part of track 1 according to ISO/IEC 7813");
    public static TLVTag _9F20 = new TLVTag("9F20", TLVDataType.BINARY, "Track 2 Discretionary Data", "Discretionary part of track 2 according to ISO/IEC 7813");
    public static TLVTag _57 = new TLVTag("57", TLVDataType.BINARY, "Track 2 Equivalent Data", "Contains the data elements of track 2 according to ISO/IEC 7813, excluding start sentinel, end sentinel, and Longitudinal Redundancy Check (LRC), as follows: Primary Account Number (n, var. up to 19) Field Separator (Hex 'D') (b) Expiration Date (YYMM) (n 4) Service Code (n 3) Discretionary Data (defined by individual payment systems) (n, var.) Pad with one Hex 'F' if needed to ensure whole bytes (b)");
    public static TLVTag _98 = new TLVTag("98", TLVDataType.BINARY, "Transaction Certificate (TC) Hash Value", "Result of a hash function specified in Book 2, Annex B3.1");
    public static TLVTag _97 = new TLVTag("97", TLVDataType.BINARY, "Transaction Certificate Data Object List (TDOL)", "List of data objects (tag and length) to be used by the terminal in generating the TC Hash Value");
    public static TLVTag _5F2A = new TLVTag("5F2A", TLVDataType.BINARY, "Transaction Currency Code", "Indicates the currency code of the transaction according to ISO 4217");
    public static TLVTag _5F36 = new TLVTag("5F36", TLVDataType.BINARY, "Transaction Currency Exponent", "Indicates the implied position of the decimal point from the right of the transaction amount represented according to ISO 4217");
    public static TLVTag _9A = new TLVTag("9A", TLVDataType.BINARY, "Transaction Date", "Local date that the transaction was authorised");
    public static TLVTag _99 = new TLVTag("99", TLVDataType.BINARY, "Transaction Personal Identification Number (PIN) Data", "Data entered by the cardholder for the purpose of the PIN verification");
    public static TLVTag _9F3C = new TLVTag("9F3C", TLVDataType.BINARY, "Transaction Reference Currency Code", "Code defining the common currency used by the terminal in case the Transaction Currency Code is different from the Application Currency Code");
    public static TLVTag _9F3D = new TLVTag("9F3D", TLVDataType.BINARY, "Transaction Reference Currency Exponent", "Indicates the implied position of the decimal point from the right of the transaction amount, with the Transaction Reference Currency Code represented according to ISO 4217");
    public static TLVTag _9F41 = new TLVTag("9F41", TLVDataType.BINARY, "Transaction Sequence Counter", "Counter maintained by the terminal that is incremented by one for each transaction");
    public static TLVTag _9B = new TLVTag("9B", TLVDataType.BINARY, "Transaction Status Information", "Indicates the functions performed in a transaction");
    public static TLVTag _9F21 = new TLVTag("9F21", TLVDataType.BINARY, "Transaction Time", "Local time that the transaction was authorised");
    public static TLVTag _9C = new TLVTag("9C", TLVDataType.BINARY, "Transaction Type", "Indicates the type of financial transaction, represented by the first two digits of ISO 8583:1987 Processing Code");
    public static TLVTag _9F37 = new TLVTag("9F37", TLVDataType.BINARY, "Unpredictable Number", "Value to provide variability and uniqueness to the generation of a cryptogram");

    public static class TLVTag {
        private final byte[] tag;
        private final String name;
        private final String description;
        private final TLVDataType type;

        public TLVTag(String tag, TLVDataType type, String name, String description) {
            this.tag = Util.hexStringToByteArray(tag);
            this.name = name;
            this.description = description;
            this.type = type;
            TagMap.put(tag, this);
        }

        public byte[] getTag() {
            return tag;
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return name;
        }

        public TLVDataType getDataType() {
            return type;
        }
    }

    public enum TLVDataType {
        BINARY,
        INTEGER,
        STRING,
        NESTED;
    }

}
