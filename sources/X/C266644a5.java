package X;

import android.opengl.Matrix;
import com.facebook.common.math.matrix.Matrix4;

/* renamed from: X.4a5  reason: invalid class name and case insensitive filesystem */
public final class C266644a5 {
    public static final float[] A0B = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public float A00 = 1.0f;
    public float A01;
    public float A02 = 1.0f;
    public float A03 = 1.0f;
    public float A04;
    public float A05;
    public int A06;
    public boolean A07;
    public final Matrix4 A08 = new Matrix4();
    public final boolean A09;
    public final boolean A0A;

    public static final void A00(C266644a5 r7) {
        Matrix4 matrix4 = r7.A08;
        Matrix.setIdentityM(matrix4.A01, 0);
        float f = 0.5f;
        if (r7.A0A) {
            f = 0.0f;
        }
        matrix4.A03(f, f, 0.0f);
        float f2 = 1.0f;
        if (r7.A07) {
            f2 = -1.0f;
        }
        int i = r7.A06 % 180;
        float f3 = r7.A00;
        if (i == 0) {
            matrix4.A02(f2, f3 * 1.0f);
        } else {
            matrix4.A02(f3, f2 * 1.0f);
        }
        matrix4.A01(r7.A01);
        matrix4.A02(1.0f / r7.A02, 1.0f / (r7.A00 * r7.A03));
        matrix4.A03((-r7.A04) * r7.A02, r7.A05 * r7.A03, 0.0f);
        if (r7.A09) {
            matrix4.A05(A0B);
        }
        float f4 = -f;
        matrix4.A03(f4, f4, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  # translationX=");
        sb.append(this.A04);
        sb.append("\n  # translationY=");
        sb.append(this.A05);
        sb.append("\n  # scaleX=");
        sb.append(this.A02);
        sb.append("\n  # scaleY=");
        sb.append(this.A03);
        sb.append("\n  # rotateZ=");
        sb.append(this.A01);
        sb.append("\n  # mediaAspectRatio=");
        sb.append(this.A00);
        sb.append("\n  # orientation=");
        sb.append(this.A06);
        sb.append("\n  # isMirrored=");
        sb.append(this.A07);
        sb.append("\n  ");
        return 0rw.A0u(sb.toString(), "#");
    }

    public C266644a5(boolean z, boolean z2) {
        this.A0A = z;
        this.A09 = z2;
        A00(this);
    }
}
