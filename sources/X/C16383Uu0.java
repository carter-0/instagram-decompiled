package X;

/* renamed from: X.Uu0  reason: case insensitive filesystem */
public final class C16383Uu0 extends C57460Ib4 {
    public final int A00;
    public final Object A01;

    public C16383Uu0(C18065Vkr vkr, int i) {
        this.A00 = i;
        this.A01 = vkr;
    }

    public final void onVideoViewPrepared(C263754Nf r4) {
        int i = this.A00;
        C20930X4v x4v = ((C18065Vkr) this.A01).A05;
        if (i != 0) {
            x4v.DyR((1Xj) null, (C270194gL) r4.A03);
        } else {
            x4v.DyR((1Xj) r4.A03, (C270194gL) null);
        }
    }
}
