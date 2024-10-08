package X;

import android.opengl.GLES20;
import android.opengl.GLException;

public abstract class V6L {
    public static final void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        if (glGetError == 1285) {
            throw new RuntimeException(str);
        }
        throw new GLException(glGetError, 002.A0b(str, ": GLES30 error: ", glGetError));
    }
}
