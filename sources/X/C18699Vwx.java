package X;

import android.content.res.Resources;
import android.opengl.GLES20;

/* renamed from: X.Vwx  reason: case insensitive filesystem */
public abstract class C18699Vwx {
    public static final C14261Tsj A01(C17872VhP vhP, int i, int i2) {
        0qQ.A0B(vhP, 0);
        Resources resources = vhP.A00.getResources();
        0qQ.A0A(resources);
        return A02(C9874Rin.A00(resources, i), C9874Rin.A00(resources, i2));
    }

    public static final int A00(int i, String str) {
        AnonymousClass9S9.A05("before creating shader");
        int glCreateShader = GLES20.glCreateShader(i);
        AnonymousClass9S9.A05("before setting shader source");
        GLES20.glShaderSource(glCreateShader, str);
        AnonymousClass9S9.A05("before compiling");
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        0KC.A0C("ShaderUtil", glGetShaderInfoLog);
        throw Pxg.A0k("shader compile failed:", glGetShaderInfoLog);
    }

    public static final C14261Tsj A02(String str, String str2) {
        int A00 = A00(35633, str);
        int A002 = A00(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, A00);
        GLES20.glAttachShader(glCreateProgram, A002);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return new C14261Tsj(glCreateProgram);
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        0KC.A0C("ShaderUtil", glGetProgramInfoLog);
        throw Pxg.A0k("program link failed:", glGetProgramInfoLog);
    }
}
