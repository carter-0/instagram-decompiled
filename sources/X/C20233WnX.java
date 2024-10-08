package X;

/* renamed from: X.WnX  reason: case insensitive filesystem */
public final class C20233WnX implements Runnable {
    public final /* synthetic */ C15938Ul5 A00;
    public final /* synthetic */ C15357Ub9 A01;

    public C20233WnX(C15938Ul5 ul5, C15357Ub9 ub9) {
        this.A01 = ub9;
        this.A00 = ul5;
    }

    public final void run() {
        1Xj A0U;
        int AVI;
        C15357Ub9 ub9 = this.A01;
        if (ub9.mView != null && (A0U = DbV.A0U(ub9.A02, this.A00.A02)) != null && ub9.A07.A04 != null) {
            HAI hai = ub9.A08;
            C296935qt A04 = HAI.A00(hai.A00, hai).A04(A0U);
            if (A04 != null && (AVI = ub9.A06.AVI(A04)) != -1) {
                ub9.A07.A04.A0p(AVI);
            }
        }
    }
}
