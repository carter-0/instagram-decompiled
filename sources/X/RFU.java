package X;

public enum RFU {
    CREDIT_CARD_NAME("cc-name"),
    CREDIT_CARD_GIVEN_NAME("cc-given-name"),
    CREDIT_CARD_ADDITIONAL_NAME("cc-additional-name"),
    CREDIT_CARD_FAMILY_NAME("cc-family-name"),
    CREDIT_CARD_NUMBER("cc-number"),
    CREDIT_CARD_EXP("cc-exp"),
    CREDIT_CARD_EXP_MONTH("cc-exp-month"),
    CREDIT_CARD_EXP_YEAR("cc-exp-year"),
    CREDIT_CARD_SECURITY_CODE("cc-csc");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        RFU[] rfuArr;
        A01 = 0oU.A00(rfuArr);
    }

    /* access modifiers changed from: public */
    RFU(String str) {
        this.A00 = str;
    }
}
