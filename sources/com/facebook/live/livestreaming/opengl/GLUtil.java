package com.facebook.live.livestreaming.opengl;

import X.002;
import X.0KC;
import X.AnonymousClass7TF;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C51968G9o;
import X.Pxd;
import android.opengl.GLES20;
import android.opengl.Matrix;

public abstract class GLUtil {
    public static final float[] A00;

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A01(int i, String str) {
        if (i < 0) {
            throw C13989Tnp.A0l("Unable to locate '", str);
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(002.A0O("glCreateShader type=", i));
        if (C13990Tnq.A06(glCreateShader, str) != 0) {
            return glCreateShader;
        }
        0KC.A0O("com.facebook.live.livestreaming.opengl.GLUtil", Pxd.A00(463), AnonymousClass7TF.A1b(i));
        0KC.A0O("com.facebook.live.livestreaming.opengl.GLUtil", " %s", new Object[]{GLES20.glGetShaderInfoLog(glCreateShader)});
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            0KC.A0O("com.facebook.live.livestreaming.opengl.GLUtil", Pxd.A00(302), C51968G9o.A1Z(str, glGetError));
            throw new RuntimeException(002.A0b(str, ": glError ", glGetError));
        }
    }
}
