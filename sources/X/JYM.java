package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Callable;

public final class JYM implements Callable {
    public static final Bitmap.CompressFormat A05 = Bitmap.CompressFormat.JPEG;
    public final Medium A00;
    public final Integer A01;
    public final ContentResolver A02;
    public final Context A03;
    public final UserSession A04;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01aa, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ad, code lost:
        throw r0;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C352218Cl call() {
        /*
            r13 = this;
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options
            r11.<init>()
            r5 = 1
            r11.inJustDecodeBounds = r5
            com.instagram.common.gallery.Medium r3 = r13.A00
            java.lang.String r0 = r3.A0X
            android.graphics.BitmapFactory.decodeFile(r0, r11)
            java.lang.String r0 = r3.A0X
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)
            boolean r4 = X.0mf.A01(r0)
            int r10 = r11.outWidth
            int r9 = r11.outHeight
            com.instagram.common.session.UserSession r7 = r13.A04
            java.lang.Integer r8 = r13.A01
            X.0wj r2 = X.0wj.A01
            r1 = 817892667(0x30c00d3b, float:1.3973599E-9)
            java.lang.String r0 = "PhotoImportCallable_call"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = r11.outMimeType
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = "null"
        L_0x0032:
            java.lang.String r0 = "mime_type"
            r2.ABQ(r0, r1)
            int r1 = r11.outWidth
            java.lang.String r0 = "width"
            r2.ABO(r0, r1)
            int r1 = r11.outHeight
            java.lang.String r0 = "height"
            r2.ABO(r0, r1)
            java.lang.String r1 = X.JYN.A00(r8)
            java.lang.String r0 = "source"
            r2.ABQ(r0, r1)
            r2.report()
            java.lang.Boolean r0 = r3.A0I
            if (r0 != 0) goto L_0x0067
            X.Q0F r2 = X.Q0F.A00
            java.lang.String r1 = r3.A0X
            int r0 = r3.hashCode()
            boolean r0 = r2.A00(r7, r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A0I = r0
        L_0x0067:
            java.lang.String r1 = r11.outMimeType
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r0.equals(r1)
            r6 = 0
            if (r0 == 0) goto L_0x0116
            if (r4 != 0) goto L_0x0116
            java.lang.String r1 = r3.A03()
            java.lang.String r0 = "image/png"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0116
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322791825484193(0x810b63000229a1, double:3.0340180383546735E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r1 = r3.A03()
            java.lang.String r0 = "image/webp"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0116
            java.lang.String r1 = r3.A03()
            java.lang.String r0 = "image/heic"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0116
        L_0x00a5:
            X.8Cl r4 = new X.8Cl
            r4.<init>(r3, r10, r9)
            java.lang.String r0 = r4.A06()
            int r0 = X.C364678lo.A01(r0)
            r4.A07 = r0
            java.lang.String r0 = r4.A06()
            java.lang.String r0 = X.C364678lo.A06(r0)
            r4.A0j = r0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r0)
            android.graphics.ColorSpace r0 = r11.outColorSpace
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00cf
            r0 = -1
            r4.A01 = r0
        L_0x00cf:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r0 != r8) goto L_0x00d5
            r4.A18 = r6
        L_0x00d5:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r4.A01()
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r3.A0G
            r1.A01(r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r4.A01()
            java.lang.String r0 = r3.A0X
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.C59778JXx.A03(r7, r0)
            r1.A00(r0)
            X.0v6 r0 = r4.A0I
            if (r0 != 0) goto L_0x0182
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r8.inJustDecodeBounds = r5
            java.lang.String r0 = r4.A06()
            android.graphics.BitmapFactory.decodeFile(r0, r8)
            r7 = 4
            int r1 = r8.outHeight
            int r0 = r8.outWidth
            r3 = 1
            if (r1 > r7) goto L_0x0107
            if (r0 <= r7) goto L_0x0159
        L_0x0107:
            int r2 = r1 / 2
            int r1 = r0 / 2
        L_0x010b:
            int r0 = r2 / r3
            if (r0 < r7) goto L_0x0159
            int r0 = r1 / r3
            if (r0 < r7) goto L_0x0159
            int r3 = r3 * 2
            goto L_0x010b
        L_0x0116:
            r11.inJustDecodeBounds = r6
            java.lang.String r0 = r3.A0X
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFile(r0, r11)     // Catch:{ OutOfMemoryError -> 0x01ae }
            java.lang.String r0 = "unknown"
            if (r12 == 0) goto L_0x01b0
            android.content.Context r0 = r13.A03
            java.io.File r4 = X.0mb.A04(r0)
            android.content.ContentResolver r1 = r13.A02
            android.net.Uri r0 = android.net.Uri.fromFile(r4)
            java.io.OutputStream r2 = r1.openOutputStream(r0)
            if (r2 == 0) goto L_0x019b
            android.graphics.Bitmap$CompressFormat r0 = A05     // Catch:{ all -> 0x01a7 }
            X.JZK.A00(r0, r12, r2)     // Catch:{ all -> 0x01a7 }
            r12.recycle()     // Catch:{ all -> 0x01a7 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x01a7 }
            com.instagram.common.gallery.Medium r0 = X.C282665Eg.A02(r3, r4)     // Catch:{ all -> 0x01a7 }
            X.8Cl r4 = new X.8Cl     // Catch:{ all -> 0x01a7 }
            r4.<init>(r0, r10, r9)     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = r3.A0X     // Catch:{ all -> 0x01a7 }
            int r0 = X.C364678lo.A01(r0)     // Catch:{ all -> 0x01a7 }
            r4.A07 = r0     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = r3.A0X     // Catch:{ all -> 0x01a7 }
            r4.A0k = r0     // Catch:{ all -> 0x01a7 }
            r2.close()
            goto L_0x00d5
        L_0x0159:
            r8.inSampleSize = r3
            r8.inJustDecodeBounds = r6
            java.lang.String r0 = r4.A06()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0, r8)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r2 != 0) goto L_0x0183
            java.lang.String r2 = "PhotoImportCallable"
            java.lang.String r1 = "BitmapFactory.decodeFile() couldn't decode image data, gradient colors were not extracted"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0173:
            com.instagram.common.util.gradient.BackgroundGradientColors r1 = new com.instagram.common.util.gradient.BackgroundGradientColors
            r1.<init>(r3, r0)
            int r0 = r4.A07
            X.0v6 r0 = X.0oY.A01(r1, r0)
            if (r0 == 0) goto L_0x0196
            r4.A0I = r0
        L_0x0182:
            return r4
        L_0x0183:
            int r3 = r2.getPixel(r6, r6)
            int r1 = r2.getWidth()
            int r1 = r1 - r5
            int r0 = r2.getHeight()
            int r0 = r0 - r5
            int r0 = r2.getPixel(r1, r0)
            goto L_0x0173
        L_0x0196:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x019b:
            java.lang.String r0 = "null_output_stream"
            X.C63158KsR.A00(r11, r3, r8, r0)     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "OutputStream is null"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x01a7 }
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a9 }
        L_0x01a9:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x01ae:
            java.lang.String r0 = "oom_decoding_image"
        L_0x01b0:
            X.C63158KsR.A00(r11, r3, r8, r0)
            java.lang.String r0 = "bitmap is null"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYM.call():X.8Cl");
    }

    public JYM(ContentResolver contentResolver, Context context, Medium medium, UserSession userSession, Integer num) {
        AnonymousClass7TG.A1Q(contentResolver, medium);
        0qQ.A0B(userSession, 5);
        this.A03 = context;
        this.A02 = contentResolver;
        this.A00 = medium;
        this.A01 = num;
        this.A04 = userSession;
    }
}
