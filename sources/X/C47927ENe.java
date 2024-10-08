package X;

/* renamed from: X.ENe  reason: case insensitive filesystem */
public final class C47927ENe extends EDF {
    public 0hq A00;

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(35090361);
        super.onFinish();
        0SM A0R = this.A00.A0R("ProgressDialog");
        if (A0R != null) {
            A0R.A08();
        }
        AnonymousClass0fD.A0A(651220930, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(2096236740);
        super.onStart();
        0hq r4 = this.A00;
        if (r4.A0R("ProgressDialog") == null) {
            new R8F().A0G(new 0s1(r4), "ProgressDialog", true);
        }
        AnonymousClass0fD.A0A(1944442239, A03);
    }
}
