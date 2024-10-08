package X;

/* renamed from: X.RFg  reason: case insensitive filesystem */
public enum C8913RFg {
    INIT(false, 0),
    IN_PROGRESS(false, 1),
    COMPLETE_SUCCESS(true, 2),
    COMPLETE_WITH_ERRORS(true, 3),
    COMPLETE_WITH_SPECIAL_ERRORS(true, 4),
    FAILURE(false, 5);
    
    public final boolean A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        C8913RFg[] rFgArr;
        A02 = 0oU.A00(rFgArr);
    }

    /* access modifiers changed from: public */
    C8913RFg(boolean z, int i) {
        this.A01 = r2;
        this.A00 = z;
    }
}
