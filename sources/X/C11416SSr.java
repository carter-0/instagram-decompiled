package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.SSr  reason: case insensitive filesystem */
public final class C11416SSr {
    public static final SJ8 A05;
    public static final SJ8 A06;
    @Deprecated
    public static final SJ8 A07 = C10977S3l.A00;
    public static final SJ8 A08;
    public static final SJ8 A09;
    public static final C13699TfH A0A = new C11967Sji();
    public static final Queue A0B = new ArrayDeque(0);
    public static final Set A0C = Pxg.A18(new String[]{"image/vnd.wap.wbmp", "image/x-ico"});
    public static final Set A0D = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
    public final DisplayMetrics A00;
    public final C13813Thg A01;
    public final ST0 A02;
    public final SO9 A03 = SO9.A00();
    public final List A04;

    public static void A03(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    static {
        C8875RDr rDr = C8875RDr.A00;
        C13530Tc2 tc2 = SJ8.A04;
        A06 = new SJ8(tc2, rDr, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
        A09 = new SJ8(tc2, (Object) null, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
        A08 = new SJ8(tc2, false, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        A05 = new SJ8(tc2, false, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.graphics.BitmapFactory.Options r8, X.C13813Thg r9, X.C13699TfH r10, X.C13799ThI r11) {
        /*
            java.lang.String r3 = "Downsampler"
            boolean r0 = r8.inJustDecodeBounds
            if (r0 != 0) goto L_0x000c
            r10.DUv()
            r11.EyD()
        L_0x000c:
            int r7 = r8.outWidth
            int r6 = r8.outHeight
            java.lang.String r5 = r8.outMimeType
            java.util.concurrent.locks.Lock r4 = X.SQc.A02
            r4.lock()
            android.graphics.Bitmap r0 = r11.ANg(r8)     // Catch:{ IllegalArgumentException -> 0x001c }
            goto L_0x005e
        L_0x001c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "Exception decoding bitmap, outWidth: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            r1.append(r7)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = ", outHeight: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            r1.append(r6)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = ", outMimeType: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            r1.append(r5)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = ", inBitmap: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            android.graphics.Bitmap r0 = r8.inBitmap     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = A02(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ all -> 0x0064 }
            java.io.IOException r1 = X.Pxe.A0c(r0, r2)     // Catch:{ all -> 0x0064 }
            r0 = 3
            android.util.Log.isLoggable(r3, r0)     // Catch:{ all -> 0x0064 }
            android.graphics.Bitmap r0 = r8.inBitmap     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0063
            r9.E5H(r0)     // Catch:{ IOException -> 0x0062 }
            r0 = 0
            r8.inBitmap = r0     // Catch:{ IOException -> 0x0062 }
            android.graphics.Bitmap r0 = A00(r8, r9, r10, r11)     // Catch:{ IOException -> 0x0062 }
        L_0x005e:
            r4.unlock()
            return r0
        L_0x0062:
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0063:
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11416SSr.A00(android.graphics.BitmapFactory$Options, X.Thg, X.TfH, X.ThI):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (X.AnonymousClass7TE.A1a(r2.A00(r1)) == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        if (r11 == 270) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        if (r11 == 270) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (r11 == 270) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0290 A[Catch:{ IOException -> 0x0282, all -> 0x03d3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11911Sik A01(X.C11856Shi r35, X.C13699TfH r36, X.C11416SSr r37, X.C13799ThI r38, int r39, int r40) {
        /*
            r34 = r37
            r9 = r40
            r10 = r39
            r0 = r34
            X.ST0 r0 = r0.A02
            r32 = r0
            java.lang.Class<byte[]> r2 = byte[].class
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r31 = r0.A04(r1, r2)
            r0 = r31
            byte[] r0 = (byte[]) r0
            r31 = r0
            java.lang.Class<X.SSr> r1 = X.C11416SSr.class
            monitor-enter(r1)
            java.util.Queue r8 = A0B     // Catch:{ all -> 0x03ea }
            monitor-enter(r8)     // Catch:{ all -> 0x03ea }
            java.lang.Object r7 = r8.poll()     // Catch:{ all -> 0x03e7 }
            android.graphics.BitmapFactory$Options r7 = (android.graphics.BitmapFactory.Options) r7     // Catch:{ all -> 0x03e7 }
            monitor-exit(r8)     // Catch:{ all -> 0x03e7 }
            if (r7 != 0) goto L_0x0031
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x03ea }
            r7.<init>()     // Catch:{ all -> 0x03ea }
            A03(r7)     // Catch:{ all -> 0x03ea }
        L_0x0031:
            monitor-exit(r1)
            r7.inTempStorage = r0
            X.SJ8 r0 = A06
            r2 = r35
            java.lang.Object r30 = r2.A00(r0)
            X.SJ8 r0 = A09
            java.lang.Object r29 = r2.A00(r0)
            X.SJ8 r0 = X.C10977S3l.A00
            java.lang.Object r3 = r2.A00(r0)
            X.S3l r3 = (X.C10977S3l) r3
            X.SJ8 r0 = A08
            java.lang.Object r0 = r2.A00(r0)
            boolean r28 = X.AnonymousClass7TE.A1a(r0)
            X.SJ8 r1 = A05
            java.lang.Object r0 = r2.A00(r1)
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r2.A00(r1)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r27 = 1
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            r27 = 0
        L_0x006a:
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x03d3 }
            r0 = r34
            X.Thg r6 = r0.A01     // Catch:{ all -> 0x03d3 }
            r26 = 1
            r0 = r26
            r7.inJustDecodeBounds = r0     // Catch:{ all -> 0x03d3 }
            r35 = r36
            r33 = r38
            r1 = r35
            r0 = r33
            A00(r7, r6, r1, r0)     // Catch:{ all -> 0x03d3 }
            r25 = 0
            r0 = r25
            r7.inJustDecodeBounds = r0     // Catch:{ all -> 0x03d3 }
            r24 = 2
            int r1 = r7.outWidth     // Catch:{ all -> 0x03d3 }
            int r0 = r7.outHeight     // Catch:{ all -> 0x03d3 }
            r23 = r0
            int[] r0 = new int[]{r1, r0}     // Catch:{ all -> 0x03d3 }
            r22 = r0[r25]     // Catch:{ all -> 0x03d3 }
            r1 = -1
            r0 = r22
            if (r0 == r1) goto L_0x009f
            r0 = r23
            if (r0 != r1) goto L_0x00a1
        L_0x009f:
            r27 = 0
        L_0x00a1:
            int r21 = r33.BGB()     // Catch:{ all -> 0x03d3 }
            switch(r21) {
                case 3: goto L_0x00b0;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00aa;
                default: goto L_0x00a8;
            }     // Catch:{ all -> 0x03d3 }
        L_0x00a8:
            r11 = 0
            goto L_0x00b2
        L_0x00aa:
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x00b2
        L_0x00ad:
            r11 = 90
            goto L_0x00b2
        L_0x00b0:
            r11 = 180(0xb4, float:2.52E-43)
        L_0x00b2:
            java.util.concurrent.locks.Lock r0 = X.SQc.A02     // Catch:{ all -> 0x03d3 }
            switch(r21) {
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b8;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b8;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00b8;
                default: goto L_0x00b7;
            }     // Catch:{ all -> 0x03d3 }
        L_0x00b7:
            goto L_0x00bb
        L_0x00b8:
            r20 = 1
            goto L_0x00bd
        L_0x00bb:
            r20 = 0
        L_0x00bd:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r1) goto L_0x00cd
            r0 = 90
            if (r11 == r0) goto L_0x00cb
            r0 = 270(0x10e, float:3.78E-43)
            r10 = r22
            if (r11 != r0) goto L_0x00cd
        L_0x00cb:
            r10 = r23
        L_0x00cd:
            if (r9 != r1) goto L_0x00db
            r0 = 90
            if (r11 == r0) goto L_0x00d9
            r0 = 270(0x10e, float:3.78E-43)
            r9 = r23
            if (r11 != r0) goto L_0x00db
        L_0x00d9:
            r9 = r22
        L_0x00db:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r14 = r33.BGI()     // Catch:{ all -> 0x03d3 }
            java.lang.String r5 = "]"
            java.lang.String r19 = "Downsampler"
            java.lang.String r1 = "x"
            if (r22 <= 0) goto L_0x0246
            if (r23 <= 0) goto L_0x0246
            r0 = 90
            if (r11 == r0) goto L_0x00f6
            r0 = 270(0x10e, float:3.78E-43)
            r2 = r22
            r4 = r23
            if (r11 != r0) goto L_0x00fa
        L_0x00f6:
            r4 = r22
            r2 = r23
        L_0x00fa:
            float r13 = r3.A00(r2, r4, r10, r9)     // Catch:{ all -> 0x03d3 }
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x020d
            java.lang.Integer r12 = r3.A01(r2, r4, r10, r9)     // Catch:{ all -> 0x03d3 }
            if (r12 == 0) goto L_0x0206
            float r11 = (float) r2     // Catch:{ all -> 0x03d3 }
            float r0 = r13 * r11
            double r0 = (double) r0     // Catch:{ all -> 0x03d3 }
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r17
            int r5 = (int) r0     // Catch:{ all -> 0x03d3 }
            r16 = r5
            float r5 = (float) r4     // Catch:{ all -> 0x03d3 }
            float r0 = r13 * r5
            double r0 = (double) r0     // Catch:{ all -> 0x03d3 }
            double r0 = r0 + r17
            int r15 = (int) r0     // Catch:{ all -> 0x03d3 }
            int r1 = r2 / r16
            int r15 = r4 / r15
            java.lang.Integer r16 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03d3 }
            r0 = r16
            if (r12 != r0) goto L_0x0138
            int r0 = java.lang.Math.max(r1, r15)     // Catch:{ all -> 0x03d3 }
        L_0x0129:
            int r1 = java.lang.Integer.highestOneBit(r0)     // Catch:{ all -> 0x03d3 }
            r0 = r26
            int r15 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x03d3 }
            r0 = r16
            if (r12 != r0) goto L_0x0147
            goto L_0x013d
        L_0x0138:
            int r0 = java.lang.Math.min(r1, r15)     // Catch:{ all -> 0x03d3 }
            goto L_0x0129
        L_0x013d:
            float r1 = (float) r15     // Catch:{ all -> 0x03d3 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r13
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0147
            int r15 = r15 << 1
        L_0x0147:
            r7.inSampleSize = r15     // Catch:{ all -> 0x03d3 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch:{ all -> 0x03d3 }
            if (r14 != r0) goto L_0x0175
            r0 = 8
            int r0 = java.lang.Math.min(r15, r0)     // Catch:{ all -> 0x03d3 }
            float r4 = (float) r0     // Catch:{ all -> 0x03d3 }
            float r11 = r11 / r4
            double r0 = (double) r11     // Catch:{ all -> 0x03d3 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x03d3 }
            int r2 = (int) r0     // Catch:{ all -> 0x03d3 }
            float r5 = r5 / r4
            double r0 = (double) r5     // Catch:{ all -> 0x03d3 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x03d3 }
            int r4 = (int) r0     // Catch:{ all -> 0x03d3 }
            int r0 = r15 / 8
            if (r0 <= 0) goto L_0x0168
            int r2 = r2 / r0
            int r4 = r4 / r0
        L_0x0168:
            float r0 = r3.A00(r2, r4, r10, r9)     // Catch:{ all -> 0x03d3 }
            double r4 = (double) r0     // Catch:{ all -> 0x03d3 }
            r11 = r4
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c6
            goto L_0x01c4
        L_0x0175:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ all -> 0x03d3 }
            if (r14 == r0) goto L_0x01b4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch:{ all -> 0x03d3 }
            if (r14 == r0) goto L_0x01b4
            boolean r0 = r14.isWebp()     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x018f
            float r0 = (float) r15     // Catch:{ all -> 0x03d3 }
            float r11 = r11 / r0
            int r2 = java.lang.Math.round(r11)     // Catch:{ all -> 0x03d3 }
            float r5 = r5 / r0
            int r4 = java.lang.Math.round(r5)     // Catch:{ all -> 0x03d3 }
            goto L_0x0168
        L_0x018f:
            int r0 = r2 % r15
            if (r0 != 0) goto L_0x019a
            int r0 = r4 % r15
            if (r0 != 0) goto L_0x019a
            int r2 = r2 / r15
            int r4 = r4 / r15
            goto L_0x0168
        L_0x019a:
            r0 = r26
            r7.inJustDecodeBounds = r0     // Catch:{ all -> 0x03d3 }
            r1 = r35
            r0 = r33
            A00(r7, r6, r1, r0)     // Catch:{ all -> 0x03d3 }
            r0 = r25
            r7.inJustDecodeBounds = r0     // Catch:{ all -> 0x03d3 }
            int r0 = r7.outWidth     // Catch:{ all -> 0x03d3 }
            int r4 = r7.outHeight     // Catch:{ all -> 0x03d3 }
            int[] r0 = new int[]{r0, r4}     // Catch:{ all -> 0x03d3 }
            r2 = r0[r25]     // Catch:{ all -> 0x03d3 }
            goto L_0x0168
        L_0x01b4:
            float r4 = (float) r15     // Catch:{ all -> 0x03d3 }
            float r11 = r11 / r4
            double r0 = (double) r11     // Catch:{ all -> 0x03d3 }
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x03d3 }
            int r2 = (int) r0     // Catch:{ all -> 0x03d3 }
            float r5 = r5 / r4
            double r0 = (double) r5     // Catch:{ all -> 0x03d3 }
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x03d3 }
            int r4 = (int) r0     // Catch:{ all -> 0x03d3 }
            goto L_0x0168
        L_0x01c4:
            double r11 = r1 / r4
        L_0x01c6:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r11 = r11 * r0
            long r0 = java.lang.Math.round(r11)     // Catch:{ all -> 0x03d3 }
            int r2 = (int) r0     // Catch:{ all -> 0x03d3 }
            double r0 = (double) r2     // Catch:{ all -> 0x03d3 }
            double r0 = r0 * r4
            double r0 = r0 + r17
            int r11 = (int) r0     // Catch:{ all -> 0x03d3 }
            float r1 = (float) r11     // Catch:{ all -> 0x03d3 }
            float r0 = (float) r2     // Catch:{ all -> 0x03d3 }
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch:{ all -> 0x03d3 }
            double r2 = r4 / r0
            double r0 = (double) r11     // Catch:{ all -> 0x03d3 }
            double r2 = r2 * r0
            double r2 = r2 + r17
            int r11 = (int) r2     // Catch:{ all -> 0x03d3 }
            r7.inTargetDensity = r11     // Catch:{ all -> 0x03d3 }
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01eb
            double r4 = r1 / r4
        L_0x01eb:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r4 = r4 * r0
            long r0 = java.lang.Math.round(r4)     // Catch:{ all -> 0x03d3 }
            int r2 = (int) r0     // Catch:{ all -> 0x03d3 }
            r7.inDensity = r2     // Catch:{ all -> 0x03d3 }
            if (r11 <= 0) goto L_0x01ff
            if (r2 <= 0) goto L_0x01ff
            if (r11 == r2) goto L_0x01ff
            goto L_0x024d
        L_0x01ff:
            r0 = r25
            r7.inTargetDensity = r0     // Catch:{ all -> 0x03d3 }
            r7.inDensity = r0     // Catch:{ all -> 0x03d3 }
            goto L_0x0251
        L_0x0206:
            java.lang.String r0 = "Cannot round with null rounding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ all -> 0x03d3 }
            goto L_0x0245
        L_0x020d:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x03d3 }
            java.lang.String r0 = "Cannot scale with factor: "
            r2.append(r0)     // Catch:{ all -> 0x03d3 }
            r2.append(r13)     // Catch:{ all -> 0x03d3 }
            java.lang.String r0 = " from: "
            r2.append(r0)     // Catch:{ all -> 0x03d3 }
            r2.append(r3)     // Catch:{ all -> 0x03d3 }
            java.lang.String r0 = ", source: ["
            r2.append(r0)     // Catch:{ all -> 0x03d3 }
            r0 = r22
            r2.append(r0)     // Catch:{ all -> 0x03d3 }
            r2.append(r1)     // Catch:{ all -> 0x03d3 }
            r0 = r23
            r2.append(r0)     // Catch:{ all -> 0x03d3 }
            java.lang.String r0 = "], target: ["
            r2.append(r0)     // Catch:{ all -> 0x03d3 }
            r2.append(r10)     // Catch:{ all -> 0x03d3 }
            r2.append(r1)     // Catch:{ all -> 0x03d3 }
            r2.append(r9)     // Catch:{ all -> 0x03d3 }
            java.lang.IllegalArgumentException r0 = X.Pxg.A0d(r5, r2)     // Catch:{ all -> 0x03d3 }
        L_0x0245:
            throw r0     // Catch:{ all -> 0x03d3 }
        L_0x0246:
            r1 = 3
            r0 = r19
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x03d3 }
            goto L_0x0258
        L_0x024d:
            r0 = r26
            r7.inScaled = r0     // Catch:{ all -> 0x03d3 }
        L_0x0251:
            r1 = r19
            r0 = r24
            android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x03d3 }
        L_0x0258:
            r0 = r34
            X.SO9 r2 = r0.A03     // Catch:{ all -> 0x03d3 }
            r1 = r27
            r0 = r20
            boolean r0 = r2.A01(r10, r9, r1, r0)     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x026f
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x03d3 }
            r7.inPreferredConfig = r0     // Catch:{ all -> 0x03d3 }
            r0 = r25
            r7.inMutable = r0     // Catch:{ all -> 0x03d3 }
            goto L_0x0299
        L_0x026f:
            X.RDr r1 = X.C8875RDr.PREFER_ARGB_8888     // Catch:{ all -> 0x03d3 }
            r0 = r30
            if (r0 == r1) goto L_0x0295
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r33.BGI()     // Catch:{ IOException -> 0x0282 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x0282 }
            if (r0 == 0) goto L_0x0288
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x03d3 }
            goto L_0x028a
        L_0x0282:
            r1 = 3
            r0 = r19
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x03d3 }
        L_0x0288:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x03d3 }
        L_0x028a:
            r7.inPreferredConfig = r1     // Catch:{ all -> 0x03d3 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x03d3 }
            if (r1 != r0) goto L_0x0299
            r0 = r26
            r7.inDither = r0     // Catch:{ all -> 0x03d3 }
            goto L_0x0299
        L_0x0295:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x03d3 }
            r7.inPreferredConfig = r0     // Catch:{ all -> 0x03d3 }
        L_0x0299:
            if (r22 < 0) goto L_0x02a4
            if (r23 < 0) goto L_0x02a4
            if (r28 == 0) goto L_0x02a4
        L_0x029f:
            if (r10 <= 0) goto L_0x02ee
            if (r9 <= 0) goto L_0x02ee
            goto L_0x02dd
        L_0x02a4:
            int r1 = r7.inTargetDensity     // Catch:{ all -> 0x03d3 }
            if (r1 <= 0) goto L_0x02b2
            int r0 = r7.inDensity     // Catch:{ all -> 0x03d3 }
            if (r0 <= 0) goto L_0x02b2
            if (r1 == r0) goto L_0x02b2
            float r5 = (float) r1     // Catch:{ all -> 0x03d3 }
            float r0 = (float) r0     // Catch:{ all -> 0x03d3 }
            float r5 = r5 / r0
            goto L_0x02b4
        L_0x02b2:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x02b4:
            int r1 = r7.inSampleSize     // Catch:{ all -> 0x03d3 }
            r0 = r22
            float r0 = (float) r0     // Catch:{ all -> 0x03d3 }
            float r2 = (float) r1     // Catch:{ all -> 0x03d3 }
            float r0 = r0 / r2
            double r0 = (double) r0     // Catch:{ all -> 0x03d3 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x03d3 }
            int r4 = (int) r0     // Catch:{ all -> 0x03d3 }
            r0 = r23
            float r0 = (float) r0     // Catch:{ all -> 0x03d3 }
            float r0 = r0 / r2
            double r0 = (double) r0     // Catch:{ all -> 0x03d3 }
            double r2 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x03d3 }
            int r1 = (int) r2     // Catch:{ all -> 0x03d3 }
            float r0 = (float) r4     // Catch:{ all -> 0x03d3 }
            int r10 = X.AnonymousClass7TE.A05(r0, r5)     // Catch:{ all -> 0x03d3 }
            float r0 = (float) r1     // Catch:{ all -> 0x03d3 }
            int r9 = X.AnonymousClass7TE.A05(r0, r5)     // Catch:{ all -> 0x03d3 }
            r1 = r19
            r0 = r24
            android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x03d3 }
            goto L_0x029f
        L_0x02dd:
            android.graphics.Bitmap$Config r1 = r7.inPreferredConfig     // Catch:{ all -> 0x03d3 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x03d3 }
            if (r1 == r0) goto L_0x02ee
            android.graphics.Bitmap$Config r0 = r7.outConfig     // Catch:{ all -> 0x03d3 }
            if (r0 != 0) goto L_0x02e8
            r0 = r1
        L_0x02e8:
            android.graphics.Bitmap r0 = r6.AxL(r10, r9, r0)     // Catch:{ all -> 0x03d3 }
            r7.inBitmap = r0     // Catch:{ all -> 0x03d3 }
        L_0x02ee:
            if (r29 == 0) goto L_0x0308
            X.RDZ r1 = X.RDZ.DISPLAY_P3     // Catch:{ all -> 0x03d3 }
            r0 = r29
            if (r0 != r1) goto L_0x0329
            android.graphics.ColorSpace r0 = r7.outColorSpace     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x0329
            boolean r0 = r0.isWideGamut()     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x0329
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3     // Catch:{ all -> 0x03d3 }
        L_0x0302:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch:{ all -> 0x03d3 }
            r7.inPreferredColorSpace = r0     // Catch:{ all -> 0x03d3 }
        L_0x0308:
            r1 = r35
            r0 = r33
            android.graphics.Bitmap r2 = A00(r7, r6, r1, r0)     // Catch:{ all -> 0x03d3 }
            r1.D7y(r2, r6)     // Catch:{ all -> 0x03d3 }
            r1 = r19
            r0 = r24
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x032c
            A02(r2)     // Catch:{ all -> 0x03d3 }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x03d3 }
            A02(r0)     // Catch:{ all -> 0x03d3 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x03d3 }
            goto L_0x032c
        L_0x0329:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB     // Catch:{ all -> 0x03d3 }
            goto L_0x0302
        L_0x032c:
            if (r2 == 0) goto L_0x03bf
            r0 = r34
            android.util.DisplayMetrics r0 = r0.A00     // Catch:{ all -> 0x03d3 }
            int r0 = r0.densityDpi     // Catch:{ all -> 0x03d3 }
            r2.setDensity(r0)     // Catch:{ all -> 0x03d3 }
            if (r20 != 0) goto L_0x033b
            r3 = r2
            goto L_0x038e
        L_0x033b:
            android.graphics.Matrix r4 = X.AnonymousClass7TE.A0U()     // Catch:{ all -> 0x03d3 }
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r3 = 1127481344(0x43340000, float:180.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r21) {
                case 2: goto L_0x03a0;
                case 3: goto L_0x03a4;
                case 4: goto L_0x03a8;
                case 5: goto L_0x03ac;
                case 6: goto L_0x03b0;
                case 7: goto L_0x03b4;
                case 8: goto L_0x03bb;
                default: goto L_0x034c;
            }     // Catch:{ all -> 0x03d3 }
        L_0x034c:
            float r3 = X.JTO.A02(r2)     // Catch:{ all -> 0x03d3 }
            float r1 = X.JTO.A01(r2)     // Catch:{ all -> 0x03d3 }
            r0 = 0
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ all -> 0x03d3 }
            r5.<init>(r0, r0, r3, r1)     // Catch:{ all -> 0x03d3 }
            r4.mapRect(r5)     // Catch:{ all -> 0x03d3 }
            float r0 = r5.width()     // Catch:{ all -> 0x03d3 }
            int r3 = java.lang.Math.round(r0)     // Catch:{ all -> 0x03d3 }
            float r0 = r5.height()     // Catch:{ all -> 0x03d3 }
            int r1 = java.lang.Math.round(r0)     // Catch:{ all -> 0x03d3 }
            android.graphics.Bitmap$Config r0 = r2.getConfig()     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x039d
            android.graphics.Bitmap$Config r0 = r2.getConfig()     // Catch:{ all -> 0x03d3 }
        L_0x0377:
            android.graphics.Bitmap r3 = r6.AWz(r3, r1, r0)     // Catch:{ all -> 0x03d3 }
            float r0 = r5.left     // Catch:{ all -> 0x03d3 }
            float r1 = -r0
            float r0 = r5.top     // Catch:{ all -> 0x03d3 }
            float r0 = -r0
            r4.postTranslate(r1, r0)     // Catch:{ all -> 0x03d3 }
            boolean r0 = r2.hasAlpha()     // Catch:{ all -> 0x03d3 }
            r3.setHasAlpha(r0)     // Catch:{ all -> 0x03d3 }
            X.SQc.A02(r2, r3, r4)     // Catch:{ all -> 0x03d3 }
        L_0x038e:
            boolean r0 = r2.equals(r3)     // Catch:{ all -> 0x03d3 }
            if (r0 != 0) goto L_0x0397
            r6.E5H(r2)     // Catch:{ all -> 0x03d3 }
        L_0x0397:
            X.Sik r2 = new X.Sik     // Catch:{ all -> 0x03d3 }
            r2.<init>(r3, r6)     // Catch:{ all -> 0x03d3 }
            goto L_0x03c0
        L_0x039d:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x03d3 }
            goto L_0x0377
        L_0x03a0:
            r4.setScale(r0, r1)     // Catch:{ all -> 0x03d3 }
            goto L_0x034c
        L_0x03a4:
            r4.setRotate(r3)     // Catch:{ all -> 0x03d3 }
            goto L_0x034c
        L_0x03a8:
            r4.setRotate(r3)     // Catch:{ all -> 0x03d3 }
            goto L_0x03b7
        L_0x03ac:
            r4.setRotate(r5)     // Catch:{ all -> 0x03d3 }
            goto L_0x03b7
        L_0x03b0:
            r4.setRotate(r5)     // Catch:{ all -> 0x03d3 }
            goto L_0x034c
        L_0x03b4:
            r4.setRotate(r9)     // Catch:{ all -> 0x03d3 }
        L_0x03b7:
            r4.postScale(r0, r1)     // Catch:{ all -> 0x03d3 }
            goto L_0x034c
        L_0x03bb:
            r4.setRotate(r9)     // Catch:{ all -> 0x03d3 }
            goto L_0x034c
        L_0x03bf:
            r2 = 0
        L_0x03c0:
            A03(r7)
            monitor-enter(r8)
            r8.offer(r7)     // Catch:{ all -> 0x03d0 }
            monitor-exit(r8)     // Catch:{ all -> 0x03d0 }
            r1 = r32
            r0 = r31
            r1.A05(r0)
            return r2
        L_0x03d0:
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03d0 }
            throw r2
        L_0x03d3:
            r2 = move-exception
            A03(r7)
            monitor-enter(r8)
            r8.offer(r7)     // Catch:{ all -> 0x03e4 }
            monitor-exit(r8)     // Catch:{ all -> 0x03e4 }
            r1 = r32
            r0 = r31
            r1.A05(r0)
            throw r2
        L_0x03e4:
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03e4 }
            throw r2
        L_0x03e7:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03e7 }
            throw r0     // Catch:{ all -> 0x03ea }
        L_0x03ea:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11416SSr.A01(X.Shi, X.TfH, X.SSr, X.ThI, int, int):X.Sik");
    }

    public static String A02(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String A0c = 002.A0c(" (", ")", bitmap.getAllocationByteCount());
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxh.A1P(A1A);
        A1A.append(bitmap.getWidth());
        A1A.append("x");
        A1A.append(bitmap.getHeight());
        A1A.append("] ");
        A1A.append(bitmap.getConfig());
        return AnonymousClass7TF.A0l(A0c, A1A);
    }

    public C11416SSr(DisplayMetrics displayMetrics, C13813Thg thg, ST0 st0, List list) {
        this.A04 = list;
        C9217RTu.A00(displayMetrics);
        this.A00 = displayMetrics;
        C9217RTu.A00(thg);
        this.A01 = thg;
        C9217RTu.A00(st0);
        this.A02 = st0;
    }
}
