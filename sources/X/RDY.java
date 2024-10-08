package X;

public enum RDY {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);
    
    public final int A00;

    public final int A00() {
        return this.A00;
    }

    public final String toString() {
        return Integer.toString(this.A00);
    }

    /* access modifiers changed from: public */
    RDY(int i) {
        this.A00 = i;
    }
}
