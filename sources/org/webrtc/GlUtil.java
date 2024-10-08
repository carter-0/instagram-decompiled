package org.webrtc;

import X.002;
import X.C13990Tnq;
import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class GlUtil {
    public static FloatBuffer createFloatBuffer(float[] fArr) {
        FloatBuffer A0e = C13990Tnq.A0e(fArr, fArr.length * 4);
        A0e.position(0);
        return A0e;
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, 10240, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        if (glGetError == 1285) {
            throw new RuntimeException(str);
        }
        throw new RuntimeException(002.A0b(str, ": GLES20 error: ", glGetError));
    }

    public class GlOutOfMemoryException extends RuntimeException {
        public GlOutOfMemoryException(String str) {
            super(str);
        }
    }
}
