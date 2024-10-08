package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

public abstract class AEB {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ee, code lost:
        if ((r5 % 2) == 0) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.Bitmap r34, int r35) {
        /*
            r12 = 0
            r24 = 1
            int[] r3 = new int[]{r12}
            r1 = 3317(0xcf5, float:4.648E-42)
            android.opengl.GLES20.glGetIntegerv(r1, r3, r12)
            java.lang.String r0 = "glGetIntegerv"
            A02(r0)
            r2 = r34
            int r5 = r2.getRowBytes()
            int r0 = A00(r2)
            if (r5 == 0) goto L_0x00f2
            if (r0 > r5) goto L_0x00f2
            int r0 = r5 % 8
            if (r0 != 0) goto L_0x00e7
            r4 = 8
        L_0x0025:
            android.opengl.GLES20.glPixelStorei(r1, r4)
            java.lang.String r6 = "glPixelStorei"
            A02(r6)
            int r0 = A00(r2)
            int r5 = r2.getRowBytes()
            int r5 = r5 / r0
            int r0 = r2.getWidth()
            java.lang.String r4 = "GLUtils.texImage2D"
            r11 = 3553(0xde1, float:4.979E-42)
            if (r5 <= r0) goto L_0x004d
            r0 = 3
            r7 = r35
            if (r7 < r0) goto L_0x0059
            r0 = 3314(0xcf2, float:4.644E-42)
            android.opengl.GLES20.glPixelStorei(r0, r5)
            A02(r6)
        L_0x004d:
            android.opengl.GLUtils.texImage2D(r11, r12, r2, r12)
            A02(r4)
        L_0x0053:
            r0 = r3[r12]
            android.opengl.GLES20.glPixelStorei(r1, r0)
            return
        L_0x0059:
            android.graphics.Bitmap$Config r4 = r2.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r4 != r0) goto L_0x00f5
            r13 = 6408(0x1908, float:8.98E-42)
            int r14 = r2.getWidth()
            int r15 = r2.getHeight()
            r18 = 5121(0x1401, float:7.176E-42)
            r19 = 0
            r16 = r12
            r17 = r13
            android.opengl.GLES20.glTexImage2D(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = "glTexImage2D"
            A02(r0)
            int r0 = A00(r2)
            int r5 = r5 * r0
            int r6 = r5 / 4
            int[] r5 = new int[r6]
            java.nio.IntBuffer r27 = java.nio.IntBuffer.wrap(r5)
            int r0 = r2.getHeight()
            int r4 = r0 + -1
            if (r4 < 0) goto L_0x0053
            r0 = 0
        L_0x0091:
            r27.clear()
            int r31 = r2.getWidth()
            int r34 = r2.getWidth()
            r28 = r2
            r29 = r5
            r30 = r12
            r32 = r12
            r33 = r0
            r35 = r24
            r28.getPixels(r29, r30, r31, r32, r33, r34, r35)
            r8 = 0
        L_0x00ac:
            if (r8 >= r6) goto L_0x00ca
            r9 = r5[r8]
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10 = r10 & r9
            int r10 = r10 >>> r12
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r7 = r7 & r9
            int r7 = r7 >>> 16
            r10 = r10 | r7
            r7 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r9
            int r7 = r7 << r12
            r10 = r10 | r7
            r7 = r9 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r7 = r7 | r10
            r5[r8] = r7
            int r8 = r8 + 1
            goto L_0x00ac
        L_0x00ca:
            int r23 = r2.getWidth()
            r19 = r11
            r20 = r12
            r21 = r12
            r22 = r0
            r25 = r13
            r26 = r18
            android.opengl.GLES20.glTexSubImage2D(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r7 = "glTexSubImage2D"
            A02(r7)
            if (r0 == r4) goto L_0x0053
            int r0 = r0 + 1
            goto L_0x0091
        L_0x00e7:
            int r0 = r5 % 4
            r4 = 4
            if (r0 == 0) goto L_0x0025
            r4 = 2
            int r5 = r5 % r4
            if (r5 != 0) goto L_0x00f2
            goto L_0x0025
        L_0x00f2:
            r4 = 1
            goto L_0x0025
        L_0x00f5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "bitmap pixel format not supported = "
            r1.append(r0)
            android.graphics.Bitmap$Config r0 = r2.getConfig()
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEB.A01(android.graphics.Bitmap, int):void");
    }

    public static final int A00(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return 4;
        }
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("unsupported bitmap config ");
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(bitmap.getConfig(), A1A));
    }

    public static final void A02(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                0KC.A0O("TextureWithAlignmentUploadUtil", "GL error 0x%x after %s: %s", new Object[]{Integer.valueOf(glGetError), str, GLUtils.getEGLErrorString(glGetError)});
            } else {
                return;
            }
        }
    }
}
