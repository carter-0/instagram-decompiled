package X;

public enum RDG {
    A04(0),
    A01(1),
    A02(2),
    A03(3);
    
    public RIn A00;

    /* access modifiers changed from: public */
    static {
        A04 = new RDG(RIn.VIEWED, "VIEWED", 0);
        A01 = new RDG(RIn.TAPPED_LEARN_MORE, "TAPPED_LEARN_MORE", 1);
        A02 = new RDG(RIn.TAPPED_NEXT, "TAPPED_NEXT", 2);
        A03 = new RDG(RIn.UPLOAD_FAILED, "UPLOAD_FAILED", 3);
    }

    /* access modifiers changed from: public */
    RDG(int i) {
        this.A00 = r1;
    }
}
