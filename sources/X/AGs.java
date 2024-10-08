package X;

import android.opengl.GLES20;
import android.util.Log;
import com.instagram.common.session.UserSession;
import java.nio.FloatBuffer;

public final class AGs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public FloatBuffer A08;
    public final float[] A09 = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    public final float[] A0A = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    public final UserSession A0B;

    public AGs(UserSession userSession) {
        this.A0B = userSession;
    }

    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("GradientBackgGLUtil", 002.A0I(AnonymousClass000.A00(4329), ':', i));
        Log.e("GradientBackgGLUtil", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static final void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String A072 = 002.A07(glGetError, "GL step error: ", str, C66579MXk.A00(188));
            0f9 A002 = 0wj.A00("GradientBackgGLUtil", 817892933, true);
            A002.ABQ("error: ", A072);
            A002.report();
        }
    }
}
