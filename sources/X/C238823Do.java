package X;

/* renamed from: X.3Do  reason: invalid class name and case insensitive filesystem */
public final class C238823Do {
    public int A00;
    public C241313Os A01;
    public Long A02;
    public String A03;
    public boolean A04;

    public final void A00(C241313Os r3) {
        this.A01 = r3;
        this.A02 = Long.valueOf(System.currentTimeMillis());
        if (r3 == C241313Os.NEEDS_RETRY) {
            this.A00++;
        }
    }
}
