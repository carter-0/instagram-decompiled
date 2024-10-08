package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;

/* renamed from: X.9S9  reason: invalid class name */
public final class AnonymousClass9S9 {
    public static final BitmapFactory.Options A00;

    public static final C365358my A03(Bitmap bitmap, boolean z) {
        C367428qj r5;
        Gainmap gainmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A002 = A00();
        AEB.A01(bitmap, 2);
        if (!z || Build.VERSION.SDK_INT < 34 || (gainmap = bitmap.getGainmap()) == null) {
            r5 = null;
        } else {
            r5 = null;
            Bitmap gainmapContents = gainmap.getGainmapContents();
            0qQ.A07(gainmapContents);
            int width2 = gainmapContents.getWidth();
            int height2 = gainmapContents.getHeight();
            int A003 = A00();
            AEB.A01(gainmapContents, 2);
            if (!A05("makeBitmapTexture")) {
                r5 = C365338mw.A00(gainmap, A003, width2, height2);
            }
        }
        bitmap.recycle();
        if (!A05("makeBitmapTexture")) {
            return C365338mw.A01(r5, A002, width, height);
        }
        return null;
    }

    public static final boolean A05(String str) {
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return z;
            }
            0KC.A09(AnonymousClass9S9.class, "GL error 0x%x after %s: %s", new Object[]{Integer.valueOf(glGetError), str, GLUtils.getEGLErrorString(glGetError)});
            z = true;
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A00 = options;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    public static final int A00() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[SYNTHETIC, Splitter:B:29:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C365358my A01(android.content.Context r8, java.lang.String r9, int r10, boolean r11, boolean r12) {
        /*
            java.lang.String r3 = "Failed to close input stream"
            r7 = 0
            r4 = 0
            java.lang.String r0 = "/"
            boolean r0 = X.00p.A0k(r9, r0, r7)     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            if (r0 == 0) goto L_0x001d
            java.io.File r0 = X.AnonymousClass7TE.A0t(r9)     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            java.io.InputStream r5 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            goto L_0x002b
        L_0x001d:
            android.content.res.AssetManager r1 = r8.getAssets()     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            java.lang.String r0 = "filters/"
            java.lang.String r0 = X.002.A0R(r0, r9)     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
            java.io.InputStream r5 = r1.open(r0)     // Catch:{ IOException -> 0x0087, all -> 0x00ae }
        L_0x002b:
            if (r11 == 0) goto L_0x0055
            android.opengl.ETC1Util$ETC1Texture r11 = android.opengl.ETC1Util.createTexture(r5)     // Catch:{ IOException -> 0x0085 }
            r6 = 3553(0xde1, float:4.979E-42)
            int r2 = A00()     // Catch:{ IOException -> 0x0085 }
            r9 = 6407(0x1907, float:8.978E-42)
            r10 = 33635(0x8363, float:4.7133E-41)
            r8 = r7
            android.opengl.ETC1Util.loadTexture(r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0085 }
            java.lang.String r0 = "makeETC1Texture"
            boolean r0 = A05(r0)     // Catch:{ IOException -> 0x0085 }
            if (r0 != 0) goto L_0x0091
            int r1 = r11.getWidth()     // Catch:{ IOException -> 0x0085 }
            int r0 = r11.getHeight()     // Catch:{ IOException -> 0x0085 }
            X.8mx r0 = X.C365338mw.A01(r4, r2, r1, r0)     // Catch:{ IOException -> 0x0085 }
            goto L_0x0092
        L_0x0055:
            android.graphics.BitmapFactory$Options r1 = A00     // Catch:{ IOException -> 0x0085 }
            r0 = 0
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r4, r1)     // Catch:{ IOException -> 0x0085 }
            if (r6 == 0) goto L_0x0092
            r1 = 3553(0xde1, float:4.979E-42)
            int r2 = A00()     // Catch:{ IOException -> 0x0085 }
            if (r12 == 0) goto L_0x0081
            X.AEB.A01(r6, r10)     // Catch:{ IOException -> 0x0085 }
        L_0x0069:
            r6.recycle()     // Catch:{ IOException -> 0x0085 }
            java.lang.String r1 = "makeBitmapTexture"
            boolean r1 = A05(r1)     // Catch:{ IOException -> 0x0085 }
            if (r1 != 0) goto L_0x0092
            int r1 = r6.getWidth()     // Catch:{ IOException -> 0x0085 }
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x0085 }
            X.8mx r0 = X.C365338mw.A01(r4, r2, r1, r0)     // Catch:{ IOException -> 0x0085 }
            goto L_0x0092
        L_0x0081:
            android.opengl.GLUtils.texImage2D(r1, r7, r6, r7)     // Catch:{ IOException -> 0x0085 }
            goto L_0x0069
        L_0x0085:
            r2 = move-exception
            goto L_0x0089
        L_0x0087:
            r2 = move-exception
            r5 = r4
        L_0x0089:
            java.lang.Class<X.9S9> r1 = X.AnonymousClass9S9.class
            java.lang.String r0 = "Failed to open input stream"
            X.0KC.A05(r1, r0, r2)     // Catch:{ all -> 0x00a0 }
            goto L_0x0093
        L_0x0091:
            r0 = 0
        L_0x0092:
            r4 = r0
        L_0x0093:
            if (r5 == 0) goto L_0x009f
            r5.close()     // Catch:{ IOException -> 0x0099 }
            return r4
        L_0x0099:
            r1 = move-exception
            java.lang.Class<X.9S9> r0 = X.AnonymousClass9S9.class
            X.0KC.A05(r0, r3, r1)
        L_0x009f:
            return r4
        L_0x00a0:
            r2 = move-exception
            if (r5 == 0) goto L_0x00af
            r5.close()     // Catch:{ IOException -> 0x00a7 }
            throw r2
        L_0x00a7:
            r1 = move-exception
            java.lang.Class<X.9S9> r0 = X.AnonymousClass9S9.class
            X.0KC.A05(r0, r3, r1)
            throw r2
        L_0x00ae:
            r2 = move-exception
        L_0x00af:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9S9.A01(android.content.Context, java.lang.String, int, boolean, boolean):X.8my");
    }

    public static final C365358my A02(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A002 = A00();
        AEB.A01(bitmap, i);
        if (!A05("makeBitmapTexture")) {
            return C365338mw.A01((C367428qj) null, A002, width, height);
        }
        return null;
    }

    public static final void A04(String str) {
        if (A05(str)) {
            throw AnonymousClass7TE.A15(002.A0R("OpenGL Error:", str));
        }
    }
}
