package X;

import android.opengl.GLES20;

/* renamed from: X.VuN  reason: case insensitive filesystem */
public final class C18571VuN {
    public static final C18571VuN A06 = new C18571VuN(1, 1, 32779);
    public static final C18571VuN A07 = new C18571VuN(1, 771, 32776);
    public static final C18571VuN A08 = new C18571VuN(1, 771, 32774);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final void A00() {
        GLES20.glBlendFuncSeparate(this.A05, this.A03, this.A02, this.A00);
        GLES20.glBlendEquationSeparate(this.A04, this.A01);
    }

    public C18571VuN(int i, int i2, int i3) {
        this.A05 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
