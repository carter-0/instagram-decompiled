package X;

import android.graphics.drawable.Drawable;

public abstract class A9E {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public final int A0A;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.8Pu, X.8Pt] */
    public final C355388Pu A00() {
        C386379kV r3 = (C386379kV) this;
        int i = r3.A0A;
        ? r2 = new C355378Pt(i, r3.A01, r3.A05, r3.A00);
        int i2 = r3.A03;
        if (i2 > 0) {
            C386399kX r4 = new C386399kX(i2, i, r3.A05, r3.A00, true);
            r4.A00(r3.A06, 0);
            r2.A08(r4);
        }
        int i3 = r3.A04;
        if (i3 > 0) {
            C386399kX r42 = new C386399kX(i3, i, r3.A05, r3.A00, false);
            r42.A00(r3.A08, r3.A05);
            r2.A09(r42);
        }
        r2.A06(r3.A02);
        return r2;
    }

    public A9E(int i, int i2) {
        this.A0A = i;
        this.A05 = i2;
    }
}
