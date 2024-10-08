package X;

import android.opengl.Matrix;

/* renamed from: X.8qq  reason: invalid class name and case insensitive filesystem */
public final class C367498qq {
    public final C345077st A00 = new C345077st();
    public final float[] A01 = new float[16];
    public final float[] A02 = new float[16];

    public final void A00(C345057sr r13, C345067ss r14, int i, int i2) {
        r13.A09(r14.A01, r14.A00, i, i2, 0, false, false);
        C345067ss A08 = r13.A08();
        float[] fArr = this.A02;
        Matrix.multiplyMM(fArr, 0, r14.A03, 0, A08.A03, 0);
        Matrix.multiplyMM(this.A01, 0, r14.A02, 0, A08.A02, 0);
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
    }

    public final void A01(C345067ss r11, C345067ss r12) {
        float[] fArr = this.A02;
        Matrix.multiplyMM(fArr, 0, r11.A03, 0, r12.A03, 0);
        Matrix.multiplyMM(this.A01, 0, r11.A02, 0, this.A00.A08().A02, 0);
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
    }
}
