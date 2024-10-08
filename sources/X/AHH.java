package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Looper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class AHH {
    public static Bitmap A00(Bitmap bitmap, C343047pa r9, int i, boolean z) {
        C343047pa A01;
        int i2;
        int i3;
        Bitmap bitmap2;
        if (!A03()) {
            Bitmap bitmap3 = bitmap;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (r9 == null) {
                A01 = null;
            } else {
                A01 = AAH.A01(new C343047pa(width, height), r9);
            }
            if (!z && A01 == null && i == 0) {
                return bitmap;
            }
            Matrix A0U = AnonymousClass7TE.A0U();
            if (A01 != null) {
                i2 = A01.A02;
                i3 = A01.A01;
            } else {
                i2 = width;
                i3 = height;
            }
            if (i != 0) {
                A0U.postRotate((float) i);
            }
            if (z) {
                A0U.preScale(-1.0f, 1.0f);
            }
            int i4 = (width - i2) / 2;
            int i5 = (height - i3) / 2;
            try {
                0fO.A03(bitmap3);
                bitmap2 = Bitmap.createBitmap(bitmap3, i4, i5, i2, i3, A0U, false);
            } catch (Throwable unused) {
                bitmap2 = null;
            }
            if (bitmap3 != bitmap2) {
                bitmap3.recycle();
            }
            return bitmap2;
        }
        throw AnonymousClass7TE.A15("Method processBitmap must be invoked on a background thread");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r2 != 270) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(X.C343047pa r9, X.C343047pa r10, byte[] r11, boolean r12) {
        /*
            boolean r0 = A03()
            if (r0 != 0) goto L_0x006b
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            int r7 = r11.length
            r6 = 0
            X.0fP.A00(r11, r6, r7, r1)
            int r2 = r1.outWidth
            int r1 = r1.outHeight
            X.7pa r0 = new X.7pa
            r0.<init>(r2, r1)
            if (r9 != 0) goto L_0x001f
            r9 = r0
        L_0x001f:
            int r5 = r9.A02
            r8 = r5
            int r4 = r9.A01
            int r3 = r0.A02
            int r2 = r0.A01
            int r1 = r3 - r2
            int r0 = r5 - r4
            int r1 = r1 * r0
            r0 = 0
            if (r1 < 0) goto L_0x0031
            r0 = 1
        L_0x0031:
            if (r0 != 0) goto L_0x0035
            r5 = r4
            r4 = r8
        L_0x0035:
            r1 = r3
        L_0x0036:
            int r0 = r1 / 2
            if (r0 < r5) goto L_0x0040
            int r2 = r2 / 2
            if (r2 < r4) goto L_0x0040
            r1 = r0
            goto L_0x0036
        L_0x0040:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            int r3 = r3 / r1
            r0.inSampleSize = r3
            r0.inJustDecodeBounds = r6
            android.graphics.Bitmap r3 = X.0fP.A00(r11, r6, r7, r0)     // Catch:{ all -> 0x004f }
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 != 0) goto L_0x0054
            r0 = 0
            return r0
        L_0x0054:
            int r2 = X.C364138kv.A00(r11)
            if (r12 == 0) goto L_0x0062
            r1 = 270(0x10e, float:3.78E-43)
            r0 = 90
            if (r2 == r0) goto L_0x0068
            if (r2 == r1) goto L_0x0063
        L_0x0062:
            r0 = r2
        L_0x0063:
            android.graphics.Bitmap r0 = A00(r3, r10, r0, r12)
            return r0
        L_0x0068:
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0063
        L_0x006b:
            java.lang.String r0 = "Method generateBitmap must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHH.A01(X.7pa, X.7pa, byte[], boolean):android.graphics.Bitmap");
    }

    public static IOException A02(Bitmap bitmap, File file) {
        if (!A03()) {
            IOException e = null;
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    0fO.A02(Bitmap.CompressFormat.JPEG, bitmap, bufferedOutputStream, 90);
                    bufferedOutputStream.flush();
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        bufferedOutputStream.close();
                        throw th;
                    } catch (IOException unused) {
                        throw th;
                    }
                }
                try {
                    bufferedOutputStream.close();
                    return e;
                } catch (IOException unused2) {
                    return e;
                }
            } catch (IOException e3) {
                return e3;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } else {
            throw AnonymousClass7TE.A15("Method processBitmapToBitmapFile must be invoked on a background thread");
        }
    }

    public static boolean A03() {
        return AnonymousClass7TF.A1W(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
