package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;
import java.util.Map;

/* renamed from: X.SNm  reason: case insensitive filesystem */
public final class C11333SNm {
    public int A00;
    public SurfaceTexture A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final FloatBuffer A05;
    public final FloatBuffer A06;
    public final Map A07 = AnonymousClass7TE.A1E();
    public final float[] A08;
    public final float[] A09;
    public final float[] A0A;

    public C11333SNm(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
        float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        this.A0A = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        this.A09 = fArr2;
        FloatBuffer asFloatBuffer = Pxg.A13(48).asFloatBuffer();
        0qQ.A07(asFloatBuffer);
        this.A06 = asFloatBuffer;
        float[] fArr3 = new float[16];
        this.A08 = fArr3;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        FloatBuffer asFloatBuffer2 = Pxg.A13(32).asFloatBuffer();
        this.A05 = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        Matrix.setIdentityM(fArr3, 0);
    }

    public static final int A00(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        A01(002.A0O("glCreateShader type=", i));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        0KC.A09(C11333SNm.class, "Could not compile shader %d:", AnonymousClass7TF.A1b(i));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static final void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            0KC.A09(C11333SNm.class, "%s: glError %d", C51968G9o.A1Z(str, glGetError));
            throw AnonymousClass7TE.A15(002.A0b(str, ": glError ", glGetError));
        }
    }
}
