package X;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8fu  reason: invalid class name and case insensitive filesystem */
public final class C361248fu {
    public int A00 = GLES20.glCreateProgram();
    public String A01;
    public String A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final C361258fv A06;

    public final C361258fv A01() {
        int i = this.A00;
        if (i != 0) {
            GLES20.glUseProgram(i);
            C345907uH.A02("gl.Program::use, programHandle=%d, vertexShaderSource=%s , fragmentShaderSource=%s", Integer.valueOf(this.A00), this.A02, this.A01);
            return this.A06;
        }
        throw new IllegalStateException("Program not initialized");
    }

    public final void A02() {
        if (this.A00 != 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(35725, iArr, 0);
            if (this.A00 == iArr[0]) {
                GLES20.glUseProgram(0);
            }
            GLES20.glDeleteProgram(this.A00);
            this.A00 = 0;
        }
    }

    public C361248fu(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glAttachShader(this.A00, glCreateShader);
        GLES20.glAttachShader(this.A00, glCreateShader2);
        A00(glCreateShader, str);
        A00(glCreateShader2, str2);
        GLES20.glLinkProgram(this.A00);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.A00, 35714, iArr, 0);
        if (iArr[0] != 0) {
            if (glCreateShader != 0) {
                GLES20.glDetachShader(this.A00, glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
            }
            if (glCreateShader2 != 0) {
                GLES20.glDetachShader(this.A00, glCreateShader2);
                GLES20.glDeleteShader(glCreateShader2);
            }
            this.A06 = new C361258fv(this);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.A00);
        A02();
        throw new RuntimeException(002.A0R("Failed to link program: ", glGetProgramInfoLog));
    }

    public static void A00(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        if (iArr[0] == 0) {
            throw new RuntimeException(002.A0u("Failed to compile shader:\n", GLES20.glGetShaderInfoLog(i), "\n\n", str));
        }
    }
}
