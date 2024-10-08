package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: X.VZy  reason: case insensitive filesystem */
public final class C17545VZy {
    public int A00;
    public int A01;
    public C20565Wui A02;
    public C17398VTz A03;
    public boolean A04;

    public static int A00(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        if (i != 0) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        if (iArr[0] == 0) {
            0wb.A03("IGDrawKit", "Error loading texture");
        }
        return iArr[0];
    }
}
