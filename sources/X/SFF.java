package X;

public final class SFF {
    public int A00;
    public long A01;
    public Object A02;
    public final SQg A03;

    public SFF(SQg sQg) {
        sQg.getClass();
        this.A03 = sQg;
    }

    public SFF() {
        this.A03 = SQg.A00();
    }
}
