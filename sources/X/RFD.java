package X;

public enum RFD {
    NONE((String) null),
    CLASS("@class"),
    MINIMAL_CLASS("@c"),
    DEDUCTION((String) null);
    
    public final String A00;

    /* access modifiers changed from: public */
    RFD(String str) {
        this.A00 = str;
    }
}
