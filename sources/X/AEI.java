package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;

public abstract class AEI {
    public static 1GK A01(Context context, Bitmap bitmap, UserSession userSession, boolean z) {
        return OX4.A00(0nY.A00(), new C41358Asf(context, bitmap, userSession, z), 205);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043 A[SYNTHETIC, Splitter:B:26:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Bitmap r7, java.io.File r8, boolean r9) {
        /*
            java.lang.String r6 = "Failed while trying to save decor image"
            java.lang.String r5 = "Failed to close outputStream"
            java.lang.String r4 = "ImageOverlayUtil"
            r3 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0022, all -> 0x0020 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x001e }
            r0 = 100
            X.0fO.A02(r1, r7, r2, r0)     // Catch:{ Exception -> 0x001e }
            if (r9 == 0) goto L_0x0031
            r7.recycle()
            goto L_0x0031
        L_0x001e:
            r0 = move-exception
            goto L_0x0024
        L_0x0020:
            r1 = move-exception
            goto L_0x003c
        L_0x0022:
            r0 = move-exception
            r2 = r3
        L_0x0024:
            X.0kD.A07(r4, r6, r0)     // Catch:{ all -> 0x003a }
            X.0KC.A0F(r4, r6, r0)     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x002f
            r7.recycle()
        L_0x002f:
            if (r2 == 0) goto L_0x0039
        L_0x0031:
            r2.close()     // Catch:{ IOException -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            X.0KC.A0F(r4, r5, r0)
        L_0x0039:
            return
        L_0x003a:
            r1 = move-exception
            r3 = r2
        L_0x003c:
            if (r9 == 0) goto L_0x0041
            r7.recycle()
        L_0x0041:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x0047 }
            throw r1
        L_0x0047:
            r0 = move-exception
            X.0KC.A0F(r4, r5, r0)
        L_0x004b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AEI.A02(android.graphics.Bitmap, java.io.File, boolean):void");
    }

    public static Bitmap A00(Bitmap bitmap, float f) {
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        if (AnonymousClass7TE.A00(1.0f, f / width) > 0.001f) {
            int width2 = (int) (((float) bitmap.getWidth()) / f);
            int height = (bitmap.getHeight() / 2) - (width2 / 2);
            if (height < 0) {
                Throwable th = new Throwable(002.A0O("croppedTop: ", height));
                0kD.A07("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th);
                0KC.A0F("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th);
            } else if (height + width2 > bitmap.getHeight()) {
                Throwable th2 = new Throwable(002.A0a("bitmapAspectRatio: ", ", videoAspectRatio: ", width, f));
                0kD.A07("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th2);
                0KC.A0F("ImageOverlayUtil", "Failed while trying to cropDecorBitmap", th2);
                return bitmap;
            } else {
                int width3 = bitmap.getWidth();
                0fO.A03(bitmap);
                return Bitmap.createBitmap(bitmap, 0, height, width3, width2);
            }
        }
        return bitmap;
    }
}
