package X;

public enum RFF {
    UNKNOWN(0),
    NO_ERROR(1),
    INTERNAL_UNRECOVERABLE(2),
    INTERNAL_RECOVERABLE(3),
    NETWORK_CONNECTION(4);
    
    public final int A00;

    /* access modifiers changed from: public */
    RFF(int i) {
        this.A00 = i;
    }
}
