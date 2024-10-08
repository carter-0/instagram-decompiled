package X;

public enum EWS {
    A06(false, false, false),
    LOADING(true, false, false),
    LOAD_MORE(false, true, false),
    RETRY(false, false, true);
    
    public boolean A00;
    public boolean A01;
    public boolean A02;

    /* access modifiers changed from: public */
    EWS(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
    }
}
