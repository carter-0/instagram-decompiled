package X;

public enum RFE {
    UNKNOWN(0),
    DELETED(1),
    FAILED(2),
    CANCELED(3),
    PENDING(4);
    
    public final int A00;

    /* access modifiers changed from: public */
    RFE(int i) {
        this.A00 = i;
    }
}
