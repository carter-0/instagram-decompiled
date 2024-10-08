package X;

import android.opengl.GLES20;

public abstract class V6K {
    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                V6L.A00("compileShader");
                return glCreateShader;
            }
            0KC.A0C("GlShaderES30", 002.A0u("Compile error ", GLES20.glGetShaderInfoLog(glCreateShader), " in shader:\n", str));
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        throw C13989Tnp.A0k("glCreateShader() failed. GLES30 error: ", GLES20.glGetError());
    }
}
