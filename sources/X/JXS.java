package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Size;
import com.instagram.common.session.UserSession;

public abstract class JXS {
    public static final AssetFileDescriptor A00(ContentResolver contentResolver, Uri uri, CancellationSignal cancellationSignal, Size size, UserSession userSession) {
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.content.extra.SIZE", new Point(size.getWidth(), size.getHeight()));
            return contentResolver.openTypedAssetFile(uri, "image/*", bundle, cancellationSignal);
        } catch (IllegalArgumentException unused) {
            if (userSession == null) {
                return null;
            }
            0f9 AEf = 0wj.A01.AEf("ContentResolverUtil error in openTypedAssetFile", 817898072);
            AEf.ABQ("uri", uri.toString());
            AEf.report();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        X.1zE.A00(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        X.1zE.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A01(android.content.ContentResolver r25, android.net.Uri r26, android.os.CancellationSignal r27, android.util.Size r28, X.C348297yD r29, com.instagram.common.session.UserSession r30) {
        /*
            r18 = 1
            r1 = 0
            android.system.Int64Ref r9 = new android.system.Int64Ref
            r9.<init>(r1)
            r24 = r26
            r23 = r27
            r22 = r28
            r10 = r30
            r5 = r25
            r4 = r24
            r3 = r23
            r0 = r22
            android.content.res.AssetFileDescriptor r8 = A00(r5, r4, r3, r0, r10)
            r17 = 0
            if (r8 == 0) goto L_0x0032
            android.os.Bundle r4 = r8.getExtras()
            if (r4 == 0) goto L_0x0098
            java.lang.String r3 = "android.provider.extra.ORIENTATION"
            r0 = r17
            int r0 = r4.getInt(r3, r0)
            long r3 = (long) r0
        L_0x0030:
            r9.value = r3
        L_0x0032:
            r0 = r29
            java.util.concurrent.ConcurrentLinkedQueue r6 = r0.A01
            int r3 = r6.size()
            r0 = 12
            if (r3 > r0) goto L_0x0091
            int r4 = r22.getWidth()
            int r3 = r22.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r4, r3, r0)
        L_0x004c:
            int r3 = r6.size()
            r0 = 25
            r7 = 817898072(0x30c02258, float:1.39796E-9)
            if (r3 <= r0) goto L_0x006d
            if (r30 == 0) goto L_0x006d
            X.0wj r3 = X.0wj.A01
            java.lang.String r0 = "ContentResolverUtil bitmap size exceeds threshold"
            X.0f9 r4 = r3.AEf(r0, r7)
            int r3 = r6.size()
            java.lang.String r0 = "bitmapPoolSize"
            r4.ABO(r0, r3)
            r4.report()
        L_0x006d:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options
            r6.<init>()
            int r16 = r22.getWidth()
            int r11 = r22.getHeight()
            r12 = r25
            r4 = r24
            r3 = r23
            r0 = r22
            android.content.res.AssetFileDescriptor r15 = A00(r12, r4, r3, r0, r10)
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r13 = 1
            r4.inJustDecodeBounds = r13
            if (r15 == 0) goto L_0x00b3
            goto L_0x009b
        L_0x0091:
            java.lang.Object r5 = r6.remove()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            goto L_0x004c
        L_0x0098:
            r3 = 0
            goto L_0x0030
        L_0x009b:
            java.io.FileInputStream r0 = r15.createInputStream()     // Catch:{ all -> 0x00a9 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00a9 }
            r3.<init>(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r0, r4)     // Catch:{ all -> 0x00a9 }
            goto L_0x00b0
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.1zE.A00(r15, r1)
            throw r0
        L_0x00b0:
            r15.close()
        L_0x00b3:
            int r12 = r4.outHeight
            int r4 = r4.outWidth
            if (r12 <= 0) goto L_0x00bb
            if (r4 > 0) goto L_0x00e6
        L_0x00bb:
            if (r30 == 0) goto L_0x00e6
            X.0wj r3 = X.0wj.A01
            java.lang.String r0 = "ContentResolverUtil output dimensions are invalid"
            X.0f9 r14 = r3.AEf(r0, r7)
            java.lang.String r3 = r24.toString()
            java.lang.String r0 = "uri"
            r14.ABQ(r0, r3)
            r3 = 0
            if (r15 != 0) goto L_0x00d2
            r3 = 1
        L_0x00d2:
            java.lang.String r0 = "assetFileDescriptor is null"
            r14.ABR(r0, r3)
            java.lang.String r3 = "requestWidth"
            r0 = r16
            r14.ABO(r3, r0)
            java.lang.String r0 = "requestHeight"
            r14.ABO(r0, r11)
            r14.report()
        L_0x00e6:
            if (r12 > r11) goto L_0x00fb
            r0 = r16
            if (r4 > r0) goto L_0x00fb
            r6.inSampleSize = r13
            r0 = r17
            r6.inJustDecodeBounds = r0
            r0 = r18
            r6.inMutable = r0
            r6.inBitmap = r5
            if (r8 == 0) goto L_0x0197
            goto L_0x0102
        L_0x00fb:
            int r13 = r13 * 2
            int r12 = r12 / 2
            int r4 = r4 / 2
            goto L_0x00e6
        L_0x0102:
            java.io.FileInputStream r0 = r8.createInputStream()     // Catch:{ all -> 0x0156 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0156 }
            r3.<init>(r0)     // Catch:{ all -> 0x0156 }
            r0 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3, r0, r6)     // Catch:{ all -> 0x0156 }
            if (r0 == r5) goto L_0x011f
            if (r30 == 0) goto L_0x011f
            X.0wj r4 = X.0wj.A01     // Catch:{ all -> 0x0156 }
            java.lang.String r3 = "ContentResolverUtil inBitmap is not used"
            X.0f9 r3 = r4.AEf(r3, r7)     // Catch:{ all -> 0x0156 }
            r3.report()     // Catch:{ all -> 0x0156 }
        L_0x011f:
            long r3 = r9.value     // Catch:{ all -> 0x0156 }
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x0152
            if (r0 == 0) goto L_0x0152
            int r11 = r0.getWidth()     // Catch:{ all -> 0x0156 }
            int r7 = r0.getHeight()     // Catch:{ all -> 0x0156 }
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ all -> 0x0156 }
            r6.<init>()     // Catch:{ all -> 0x0156 }
            long r1 = r9.value     // Catch:{ all -> 0x0156 }
            float r4 = (float) r1     // Catch:{ all -> 0x0156 }
            float r3 = (float) r11     // Catch:{ all -> 0x0156 }
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r2
            float r1 = (float) r7     // Catch:{ all -> 0x0156 }
            float r1 = r1 / r2
            r6.setRotate(r4, r3, r1)     // Catch:{ all -> 0x0156 }
            X.0fO.A03(r0)     // Catch:{ all -> 0x0156 }
            r15 = r0
            r16 = r17
            r18 = r11
            r19 = r7
            r20 = r6
            r21 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0156 }
        L_0x0152:
            r8.close()     // Catch:{ IllegalArgumentException -> 0x015d }
            return r0
        L_0x0156:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            X.1zE.A00(r8, r1)     // Catch:{ IllegalArgumentException -> 0x015d }
            throw r0     // Catch:{ IllegalArgumentException -> 0x015d }
        L_0x015d:
            r3 = move-exception
            if (r30 == 0) goto L_0x0197
            if (r5 == 0) goto L_0x0197
            X.0wj r2 = X.0wj.A01
            r1 = 817903564(0x30c037cc, float:1.3985697E-9)
            java.lang.String r0 = "ContentResolverUtil Problem decoding into existing bitmap"
            X.0f9 r2 = r2.AEf(r0, r1)
            int r1 = r22.getWidth()
            java.lang.String r0 = "thumbnailWidth"
            r2.ABO(r0, r1)
            int r1 = r22.getHeight()
            java.lang.String r0 = "thumbnailHeight"
            r2.ABO(r0, r1)
            int r1 = r5.getWidth()
            java.lang.String r0 = "inBitmapWidth"
            r2.ABO(r0, r1)
            int r1 = r5.getHeight()
            java.lang.String r0 = "inBitmapHeight"
            r2.ABO(r0, r1)
            r2.ERJ(r3)
            r2.report()
        L_0x0197:
            r3 = r25
            r2 = r24
            r1 = r22
            r0 = r23
            android.graphics.Bitmap r0 = r3.loadThumbnail(r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXS.A01(android.content.ContentResolver, android.net.Uri, android.os.CancellationSignal, android.util.Size, X.7yD, com.instagram.common.session.UserSession):android.graphics.Bitmap");
    }
}
