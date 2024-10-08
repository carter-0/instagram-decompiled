package X;

import android.opengl.GLES20;

/* renamed from: X.Q0o  reason: case insensitive filesystem */
public abstract class C7242Q0o {
    public static final void A01(String str) {
        0qQ.A0B(str, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            0KC.A0O("GLProgramUtil", "%s: glError %d", new Object[]{str, Integer.valueOf(glGetError)});
            throw new RuntimeException(002.A0b(str, ": glError ", glGetError));
        }
    }

    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A01(002.A0O("glCreateShader type=", i));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        0KC.A0O("GLProgramUtil", "Could not compile shader %d:", AnonymousClass7TF.A1b(i));
        0KC.A0O("GLProgramUtil", " %s", new Object[]{GLES20.glGetShaderInfoLog(glCreateShader)});
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
