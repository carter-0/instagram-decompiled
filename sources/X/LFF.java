package X;

import android.graphics.Matrix;

public final class LFF {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;

    public final void A00(Matrix matrix) {
        0qQ.A0B(matrix, 0);
        float f = this.A02;
        if (f != 1.0f) {
            matrix.postScale(f, f, this.A03, this.A04);
        }
        float f2 = this.A00;
        if (f2 != 0.0f || this.A01 != 0.0f) {
            matrix.postTranslate(f2, this.A01);
        }
    }

    public final boolean A01() {
        float f = this.A02 - 1.0f;
        if (f <= -1.0E-5f || f >= 1.0E-5f) {
            return false;
        }
        float f2 = this.A00;
        if (f2 <= -1.0E-5f || f2 >= 1.0E-5f) {
            return false;
        }
        float f3 = this.A01;
        if (f3 <= -1.0E-5f || f3 >= 1.0E-5f) {
            return false;
        }
        return true;
    }
}
