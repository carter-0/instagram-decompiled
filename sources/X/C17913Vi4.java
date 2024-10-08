package X;

import com.facebook.live.livestreaming.opengl.GLUtil;
import java.nio.FloatBuffer;

/* renamed from: X.Vi4  reason: case insensitive filesystem */
public final class C17913Vi4 {
    public static final FloatBuffer A07;
    public static final FloatBuffer A08;
    public static final FloatBuffer A09;
    public static final FloatBuffer A0A;
    public static final FloatBuffer A0B;
    public static final FloatBuffer A0C;
    public static final FloatBuffer A0D;
    public static final float[] A0E;
    public static final float[] A0F;
    public static final float[] A0G;
    public static final float[] A0H;
    public static final float[] A0I;
    public static final float[] A0J;
    public static final float[] A0K;
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public FloatBuffer A04;
    public FloatBuffer A05;
    public FloatBuffer A06;

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        A0G = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0K = fArr2;
        float[] fArr3 = GLUtil.A00;
        FloatBuffer A0e = C13990Tnq.A0e(fArr, 24);
        A0e.position(0);
        A0C = A0e;
        FloatBuffer A0e2 = C13990Tnq.A0e(fArr2, 24);
        A0e2.position(0);
        A0D = A0e2;
        float[] fArr4 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        A0F = fArr4;
        float[] fArr5 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        A0J = fArr5;
        FloatBuffer A0e3 = C13990Tnq.A0e(fArr4, 32);
        A0e3.position(0);
        A0A = A0e3;
        FloatBuffer A0e4 = C13990Tnq.A0e(fArr5, 32);
        A0e4.position(0);
        A0B = A0e4;
        float[] fArr6 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0E = fArr6;
        float[] fArr7 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0H = fArr7;
        float[] fArr8 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        A0I = fArr8;
        FloatBuffer A0e5 = C13990Tnq.A0e(fArr6, 32);
        A0e5.position(0);
        A07 = A0e5;
        FloatBuffer A0e6 = C13990Tnq.A0e(fArr8, 32);
        A0e6.position(0);
        A09 = A0e6;
        FloatBuffer A0e7 = C13990Tnq.A0e(fArr7, 32);
        A0e7.position(0);
        A08 = A0e7;
    }

    public final String toString() {
        String str;
        Integer num = this.A03;
        if (num == null) {
            return "[Drawable2d: ...]";
        }
        switch (num.intValue()) {
            case 1:
                str = "RECTANGLE";
                break;
            case 2:
                str = "FULL_RECTANGLE";
                break;
            case 3:
                str = "FULL_SQUARE";
                break;
            default:
                str = "TRIANGLE";
                break;
        }
        return 002.A0g("[Drawable2d: ", str, "]");
    }
}
