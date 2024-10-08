package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

public abstract class SCW {
    public static Bitmap A00;
    public static C7375Q9j A01;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0081 A[Catch:{ IOException -> 0x008c, all -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r10, android.graphics.Bitmap r11) {
        /*
            X.SOG r5 = X.SOG.A06
            android.net.Uri r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L_0x009e
            android.graphics.Bitmap r9 = X.SOG.A00(r10, r0)
            if (r9 == 0) goto L_0x009e
            int r1 = r9.getWidth()
            int r0 = r9.getHeight()
            int r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            android.graphics.Bitmap r7 = X.0fO.A00(r11, r0, r0, r2)
            int r3 = r9.getWidth()
            int r1 = r9.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r1, r0)
            android.graphics.Canvas r6 = X.JTO.A0B(r3)
            r6.drawARGB(r2, r2, r2, r2)
            r0 = 0
            r6.drawBitmap(r9, r0, r0, r4)
            r9.recycle()
            int r8 = r9.getWidth()
            int r0 = r9.getHeight()
            int r1 = r9.getWidth()
            if (r8 <= r0) goto L_0x0063
            int r0 = r9.getHeight()
            int r1 = r1 - r0
            int r2 = r1 / 2
        L_0x004f:
            r0 = 0
        L_0x0050:
            float r1 = (float) r2
            float r0 = (float) r0
            r6.drawBitmap(r7, r1, r0, r4)
            r7.recycle()
            X.Ni4 r0 = X.Pxk.A0E(r10, r4)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r5.A01 = r0
            goto L_0x0075
        L_0x0063:
            int r0 = r9.getHeight()
            if (r1 >= r0) goto L_0x004f
            int r1 = r9.getHeight()
            int r0 = r9.getWidth()
            int r1 = r1 - r0
            int r0 = r1 / 2
            goto L_0x0050
        L_0x0075:
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ IOException -> 0x008c }
            android.net.Uri r0 = r5.A01     // Catch:{ IOException -> 0x008c }
            java.io.OutputStream r2 = r1.openOutputStream(r0)     // Catch:{ IOException -> 0x008c }
            if (r2 == 0) goto L_0x0099
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x008c }
            r0 = 100
            X.0fO.A02(r1, r3, r2, r0)     // Catch:{ IOException -> 0x008c }
            r2.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x0099
        L_0x008c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0094 }
            r3.recycle()
            goto L_0x009e
        L_0x0094:
            r0 = move-exception
            r3.recycle()
            throw r0
        L_0x0099:
            r3.recycle()
            android.net.Uri r4 = r5.A01
        L_0x009e:
            X.Q9j r0 = A01
            if (r0 == 0) goto L_0x00ac
            if (r4 == 0) goto L_0x00ac
            r0.setImageURI(r4)
            X.Q9j r0 = A01
            r0.invalidate()
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SCW.A00(android.content.Context, android.graphics.Bitmap):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.TfS, java.lang.Object] */
    public static void A01(Context context, String str) {
        String A002;
        boolean z;
        String str2 = str;
        if ("LOAD_PROPIC_FOR_PREVIEW".equals(str)) {
            SCZ.A01("ON_LOCAL_MEDIA_FETCH_INITIATED");
            A002 = SS4.A00(35);
            z = true;
        } else if ("LOAD_FRAME".equals(str)) {
            A002 = SS4.A00(49);
            if (A002 == null || A002.isEmpty()) {
                A00 = null;
                SOG sog = SOG.A06;
                sog.A01 = null;
                Uri uri = sog.A00;
                C7375Q9j q9j = A01;
                if (!(q9j == null || uri == null)) {
                    q9j.setImageURI(uri);
                    A01.invalidate();
                }
            }
            z = false;
        } else {
            return;
        }
        if (A002 != null && !A002.isEmpty()) {
            SOG.A06.A01(context, 0cp.A03(A002), new Object(), str2, true, z);
        }
    }
}
