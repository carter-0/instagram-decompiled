package X;

public final class GA2 implements AnonymousClass3TK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public GA2(2V5 r1, 2V5 r2, 2V5 r3, int i) {
        this.A00 = i;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
    }

    public final /* synthetic */ void CvC() {
    }

    public final void CvR(boolean z, float f) {
        int i = this.A00;
        Float valueOf = Float.valueOf(f);
        ((2V5) this.A02).A00(valueOf);
        ((2V5) this.A03).A00(valueOf);
        2V5 r6 = (2V5) this.A01;
        if (3 - i != 0) {
            if (!z) {
                f = 1.0f;
            }
        } else if (z) {
            f = (float) Math.min(Math.max((double) f, (double) C51970G9q.A02(r6)), 1.0d);
        }
        C51967G9n.A19(r6, f);
    }
}
