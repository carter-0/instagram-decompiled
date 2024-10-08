package X;

public enum EWM {
    INDEFINITE(2131959354, -1),
    ONE_DAY(2131959347, (int) r5.toSeconds(1)),
    ONE_WEEK(2131959346, (int) r5.toSeconds(7)),
    ONE_MONTH(2131959345, (int) r5.toSeconds(29)),
    THREE_MONTHS(2131959348, (int) r5.toSeconds(90));
    
    public final int A00;
    public final int A01;

    /* access modifiers changed from: public */
    static {
        EWM[] ewmArr;
        A02 = 0oU.A00(ewmArr);
    }

    /* access modifiers changed from: public */
    EWM(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
