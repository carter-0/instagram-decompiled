package X;

/* renamed from: X.Lmr  reason: case insensitive filesystem */
public final class C65071Lmr implements C66508MUm {
    public final /* synthetic */ C64711Lgk A00;

    public C65071Lmr(C64711Lgk lgk) {
        this.A00 = lgk;
    }

    public final void Coh(int i, int i2) {
        C60398Jkr jkr = this.A00.A0M;
        jkr.A05(i, i2);
        jkr.A04(i2);
        jkr.notifyItemMoved(i, i2);
    }

    public final void DSS(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int i3 = i2 / 2;
            int i4 = i / 2;
            C64711Lgk lgk = this.A00;
            lgk.A0N.A0S(i4, i3);
            C64706Lge lge = lgk.A0H;
            lge.A07.A06(lgk.A03().A01(i3));
            27p.A01(lgk.A0F).A0q((long) i4, (long) i3);
        }
        JTT.A1L(this.A00.A0Q, false);
    }

    public final void DST(int i) {
        C64711Lgk lgk = this.A00;
        lgk.A0H.A04();
        JTT.A1L(lgk.A0Q, true);
        lgk.A0M.A04(i);
    }
}
