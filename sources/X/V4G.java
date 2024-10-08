package X;

import android.opengl.GLES20;

public final class V4G {
    public int A00;

    public final int A00(String str) {
        int i = this.A00;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            throw C13989Tnp.A0l("Could not locate uniform '", str);
        }
        throw new RuntimeException("The program has been released");
    }
}
