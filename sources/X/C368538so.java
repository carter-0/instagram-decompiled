package X;

import android.opengl.Matrix;

/* renamed from: X.8so  reason: invalid class name and case insensitive filesystem */
public class C368538so {
    public static final float[] A06;
    public long A00;
    public C346337v0 A01 = null;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public float[] A05;

    public C368538so() {
        float[] fArr = A06;
        this.A04 = fArr;
        this.A05 = fArr;
        this.A03 = fArr;
    }

    public final void A01(C346337v0 r8, float[] fArr, long j) {
        A02(r8, (float[]) null, fArr, (float[]) null, j);
    }

    public final void A02(C346337v0 r9, float[] fArr, float[] fArr2, float[] fArr3, long j) {
        A03(r9, fArr, fArr2, fArr3, (float[]) null, j);
    }

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final C346337v0 A00() {
        C346337v0 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public final void A03(C346337v0 r1, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        this.A01 = r1;
        if (fArr == null) {
            fArr = A06;
        }
        this.A04 = fArr;
        if (fArr2 == null) {
            fArr2 = A06;
        }
        this.A05 = fArr2;
        if (fArr3 == null) {
            fArr3 = A06;
        }
        this.A03 = fArr3;
        if (fArr4 == null) {
            fArr4 = A06;
        }
        this.A02 = fArr4;
        this.A00 = j;
    }

    public final boolean A05() {
        C346337v0 r0 = this.A01;
        if (r0 == null || r0.A01 != 36197) {
            return false;
        }
        return true;
    }

    public final void A04(C368538so r9) {
        A03(r9.A00(), r9.A04, r9.A05, r9.A03, r9.A02, r9.A00);
    }
}
