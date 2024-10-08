package X;

import android.media.MediaCodecInfo;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.TNo  reason: case insensitive filesystem */
public final class C13156TNo implements Callable {
    public int A00;
    public File A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Medium A05;
    public final UserSession A06;
    public final CameraSpec A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARNING: type inference failed for: r11v3, types: [X.Q0n, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0261, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.1zE.A00(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0265, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026c, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0277, code lost:
        r11 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0278, code lost:
        r12 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x032c A[Catch:{ all -> 0x0451, IllegalStateException -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03c4 A[Catch:{ all -> 0x0451, IllegalStateException -> 0x0480 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03d8 A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04dd A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x051d A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081 A[Catch:{ Exception -> 0x0522 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x026c A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:35:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0288 A[SYNTHETIC, Splitter:B:94:0x0288] */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C349307zv call() {
        /*
            r42 = this;
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0522 }
            r7.<init>()     // Catch:{ Exception -> 0x0522 }
            r33 = 1
            r0 = r33
            r7.inJustDecodeBounds = r0     // Catch:{ Exception -> 0x0522 }
            r6 = r42
            com.instagram.common.gallery.Medium r5 = r6.A05     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            android.graphics.BitmapFactory.decodeFile(r0, r7)     // Catch:{ Exception -> 0x0522 }
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r8 = r6.A07     // Catch:{ Exception -> 0x0522 }
            int r10 = r8.A03     // Catch:{ Exception -> 0x0522 }
            int r9 = r8.A02     // Catch:{ Exception -> 0x0522 }
            int r4 = java.lang.Math.max(r10, r9)     // Catch:{ Exception -> 0x0522 }
            int r1 = r7.outHeight     // Catch:{ Exception -> 0x0522 }
            int r0 = r7.outWidth     // Catch:{ Exception -> 0x0522 }
            r3 = 1
            if (r1 > r4) goto L_0x0027
            if (r0 <= r4) goto L_0x0036
        L_0x0027:
            int r2 = r1 / 2
            int r1 = r0 / 2
        L_0x002b:
            int r0 = r2 / r3
            if (r0 < r4) goto L_0x0036
            int r0 = r1 / r3
            if (r0 < r4) goto L_0x0036
            int r3 = r3 * 2
            goto L_0x002b
        L_0x0036:
            r7.inSampleSize = r3     // Catch:{ Exception -> 0x0522 }
            r4 = 0
            r7.inJustDecodeBounds = r4     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0, r7)     // Catch:{ Exception -> 0x0522 }
            com.instagram.common.session.UserSession r2 = r6.A06     // Catch:{ Exception -> 0x0522 }
            boolean r0 = X.C11103SAe.A00()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0078
            X.0Tu r7 = X.0Tu.A05     // Catch:{ Exception -> 0x0522 }
            r0 = 36317362986685527(0x81067300001457, double:3.030584818838218E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0078
            X.RFa r12 = X.C8907RFa.CODEC_VIDEO_HEVC     // Catch:{ Exception -> 0x0522 }
            r14 = 2048(0x800, float:2.87E-42)
            X.SJA r32 = new X.SJA     // Catch:{ Exception -> 0x0522 }
            r11 = r32
            r13 = r33
            r15 = r4
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0522 }
            r0 = 36598837963459881(0x82067300010d29, double:3.208590727559077E-306)
            int r0 = X.DbS.A04(r7, r2, r0)     // Catch:{ Exception -> 0x0522 }
            r6.A00 = r0     // Catch:{ Exception -> 0x0522 }
        L_0x0071:
            java.lang.String r31 = ", length="
            java.lang.String r30 = ", fileExists="
            if (r3 == 0) goto L_0x04dd
            goto L_0x007f
        L_0x0078:
            java.lang.String r0 = r8.A04     // Catch:{ Exception -> 0x0522 }
            X.SJA r32 = X.SJA.A00(r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x0071
        L_0x007f:
            if (r32 == 0) goto L_0x04dd
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            int r0 = X.C364678lo.A01(r0)     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0099
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()     // Catch:{ Exception -> 0x0522 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0522 }
            r1.preRotate(r0)     // Catch:{ Exception -> 0x0522 }
            android.graphics.Bitmap r0 = X.Pxh.A0H(r3, r1)     // Catch:{ Exception -> 0x0522 }
            r3.recycle()     // Catch:{ Exception -> 0x0522 }
            r3 = r0
        L_0x0099:
            float r11 = X.JTO.A02(r3)     // Catch:{ Exception -> 0x0522 }
            float r8 = X.JTO.A01(r3)     // Catch:{ Exception -> 0x0522 }
            float r0 = (float) r10     // Catch:{ Exception -> 0x0522 }
            float r12 = r11 / r0
            float r0 = (float) r9     // Catch:{ Exception -> 0x0522 }
            float r7 = r8 / r0
            float r0 = java.lang.Math.min(r12, r7)     // Catch:{ Exception -> 0x0522 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = java.lang.Math.max(r0, r1)     // Catch:{ Exception -> 0x0522 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0522 }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0522 }
            int r10 = r6.A03     // Catch:{ Exception -> 0x0522 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0522 }
            int r9 = r6.A02     // Catch:{ Exception -> 0x0522 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0522 }
            float r0 = r11 / r14
            int r0 = (int) r0     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 / r10
            int r0 = r0 * r10
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0522 }
            float r0 = r8 / r14
            int r0 = (int) r0     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 / r9
            int r0 = r0 * r9
            android.util.Pair r0 = X.Pxf.A0K(r13, r0)     // Catch:{ Exception -> 0x0522 }
            java.lang.Object r13 = r0.first     // Catch:{ Exception -> 0x0522 }
            X.0qQ.A06(r13)     // Catch:{ Exception -> 0x0522 }
            int r15 = X.AnonymousClass7TE.A0M(r13)     // Catch:{ Exception -> 0x0522 }
            java.lang.Object r13 = r0.second     // Catch:{ Exception -> 0x0522 }
            X.0qQ.A06(r13)     // Catch:{ Exception -> 0x0522 }
            int r14 = X.AnonymousClass7TE.A0M(r13)     // Catch:{ Exception -> 0x0522 }
            android.media.MediaCodecInfo$CodecCapabilities r13 = X.SSg.A00()     // Catch:{ Exception -> 0x0522 }
            if (r13 == 0) goto L_0x00fe
            android.media.MediaCodecInfo$VideoCapabilities r13 = r13.getVideoCapabilities()     // Catch:{ Exception -> 0x0522 }
            boolean r13 = r13.isSizeSupported(r15, r14)     // Catch:{ Exception -> 0x0522 }
            if (r13 == 0) goto L_0x00fe
        L_0x00f9:
            int r1 = X.Pxf.A05(r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x0117
        L_0x00fe:
            float r0 = java.lang.Math.max(r12, r7)     // Catch:{ Exception -> 0x0522 }
            float r7 = java.lang.Math.max(r0, r1)     // Catch:{ Exception -> 0x0522 }
            float r11 = r11 / r7
            int r0 = (int) r11     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 / r10
            int r0 = r0 * r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0522 }
            float r8 = r8 / r7
            int r0 = (int) r8     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 / r9
            int r0 = r0 * r9
            android.util.Pair r0 = X.Pxf.A0K(r1, r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x00f9
        L_0x0117:
            if (r1 <= 0) goto L_0x04bc
            int r1 = X.Pxf.A04(r0)     // Catch:{ Exception -> 0x0522 }
            if (r1 <= 0) goto L_0x04bc
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x0522 }
            X.0qQ.A06(r1)     // Catch:{ Exception -> 0x0522 }
            int r1 = X.AnonymousClass7TE.A0M(r1)     // Catch:{ Exception -> 0x0522 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0522 }
            X.0qQ.A06(r0)     // Catch:{ Exception -> 0x0522 }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ Exception -> 0x0522 }
            android.graphics.Bitmap r29 = X.AnonymousClass7TF.A0B(r1, r0)     // Catch:{ Exception -> 0x0522 }
            android.graphics.Canvas r10 = X.JTO.A0B(r29)     // Catch:{ Exception -> 0x0522 }
            float r7 = X.JTO.A02(r3)     // Catch:{ Exception -> 0x0522 }
            float r0 = X.JTO.A02(r29)     // Catch:{ Exception -> 0x0522 }
            float r7 = r7 / r0
            float r1 = X.JTO.A01(r3)     // Catch:{ Exception -> 0x0522 }
            float r0 = X.JTO.A01(r29)     // Catch:{ Exception -> 0x0522 }
            float r1 = r1 / r0
            float r1 = java.lang.Math.min(r7, r1)     // Catch:{ Exception -> 0x0522 }
            float r0 = X.JTO.A02(r29)     // Catch:{ Exception -> 0x0522 }
            float r0 = r0 * r1
            int r7 = (int) r0     // Catch:{ Exception -> 0x0522 }
            float r0 = X.JTO.A01(r29)     // Catch:{ Exception -> 0x0522 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ Exception -> 0x0522 }
            int r0 = r3.getWidth()     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 - r7
            int r9 = r0 / 2
            int r7 = r3.getWidth()     // Catch:{ Exception -> 0x0522 }
            int r7 = r7 - r9
            int r0 = r3.getHeight()     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 - r1
            int r1 = r0 / 2
            int r0 = r3.getHeight()     // Catch:{ Exception -> 0x0522 }
            int r0 = r0 - r1
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ Exception -> 0x0522 }
            r8.<init>(r9, r1, r7, r0)     // Catch:{ Exception -> 0x0522 }
            int r7 = r29.getWidth()     // Catch:{ Exception -> 0x0522 }
            int r1 = r29.getHeight()     // Catch:{ Exception -> 0x0522 }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x0522 }
            r0.<init>(r4, r4, r7, r1)     // Catch:{ Exception -> 0x0522 }
            r7 = 0
            r10.drawBitmap(r3, r8, r0, r7)     // Catch:{ Exception -> 0x0522 }
            r3.recycle()     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r6.A08     // Catch:{ Exception -> 0x0522 }
            r36 = r0
            int r10 = r29.getWidth()     // Catch:{ Exception -> 0x0522 }
            int r9 = r29.getHeight()     // Catch:{ Exception -> 0x0522 }
            long r0 = r6.A04     // Catch:{ Exception -> 0x0522 }
            r16 = r0
            int r3 = r6.A00     // Catch:{ Exception -> 0x0522 }
            r28 = r7
            r27 = 3
            r26 = 0
            long r0 = (long) r3     // Catch:{ Exception -> 0x0522 }
            r18 = r0
            long r0 = r16 * r0
            long r20 = X.AnonymousClass7TE.A0P(r0)     // Catch:{ Exception -> 0x0522 }
            r25 = -1
            X.S70 r8 = new X.S70     // Catch:{ Exception -> 0x0522 }
            r0 = r25
            r8.<init>(r2, r0)     // Catch:{ Exception -> 0x0522 }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r36)     // Catch:{ Exception -> 0x0522 }
            r6.A01 = r0     // Catch:{ Exception -> 0x0522 }
            java.lang.String r11 = r0.getParent()     // Catch:{ Exception -> 0x0522 }
            if (r11 == 0) goto L_0x0290
            java.lang.String r13 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            java.lang.String r24 = "PhotoImportForClipCallable"
            r22 = 0
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            r12.<init>()     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            r0 = r33
            r12.inJustDecodeBounds = r0     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            android.graphics.BitmapFactory.decodeFile(r13, r12)     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            r14 = 1080(0x438, float:1.513E-42)
            int r0 = r12.outHeight     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            int r15 = r12.outWidth     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            r1 = 1
            if (r0 > r14) goto L_0x01df
            if (r15 <= r14) goto L_0x01f0
        L_0x01df:
            int r0 = r0 / 2
            r23 = r0
            int r15 = r15 / 2
        L_0x01e5:
            int r0 = r23 / r1
            if (r0 < r14) goto L_0x01f0
            int r0 = r15 / r1
            if (r0 < r14) goto L_0x01f0
            int r1 = r1 * 2
            goto L_0x01e5
        L_0x01f0:
            r12.inSampleSize = r1     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            r12.inJustDecodeBounds = r4     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFile(r13, r12)     // Catch:{ IOException -> 0x0277, Exception -> 0x026c }
            int r0 = X.C364678lo.A01(r13)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            if (r0 == 0) goto L_0x0214
            android.graphics.Matrix r1 = X.AnonymousClass7TE.A0U()     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            float r0 = (float) r0     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            r1.preRotate(r0)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            android.graphics.Bitmap r22 = X.Pxh.A0H(r12, r1)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            r12.recycle()     // Catch:{ IOException -> 0x020e, Exception -> 0x026c }
            goto L_0x0212
        L_0x020e:
            r11 = move-exception
            r12 = r22
            goto L_0x0279
        L_0x0212:
            r12 = r22
        L_0x0214:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.lang.String r0 = "photo_import_"
            r1.append(r0)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            r1.append(r0)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.io.File r14 = new java.io.File     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            r14.<init>(r11, r0)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            r14.createNewFile()     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.io.FileOutputStream r0 = X.JTO.A0t(r14)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.io.BufferedOutputStream r13 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            X.0Tu r11 = X.0Tu.A05     // Catch:{ all -> 0x025f }
            r0 = 36609382109222764(0x82100a0011176c, double:3.215258887797391E-306)
            int r1 = X.DbS.A04(r11, r2, r0)     // Catch:{ all -> 0x025f }
            if (r1 != 0) goto L_0x024b
            r1 = 90
        L_0x024b:
            if (r12 == 0) goto L_0x0252
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x025f }
            X.0fO.A02(r0, r12, r13, r1)     // Catch:{ all -> 0x025f }
        L_0x0252:
            r13.close()     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            java.lang.String r7 = r14.getCanonicalPath()     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            if (r12 == 0) goto L_0x0290
            r12.recycle()     // Catch:{ Exception -> 0x0522 }
            goto L_0x0290
        L_0x025f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0261 }
        L_0x0261:
            r1 = move-exception
            X.1zE.A00(r13, r0)     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
            throw r1     // Catch:{ IOException -> 0x026a, Exception -> 0x0266 }
        L_0x0266:
            r2 = move-exception
            r22 = r12
            goto L_0x026d
        L_0x026a:
            r11 = move-exception
            goto L_0x0279
        L_0x026c:
            r2 = move-exception
        L_0x026d:
            java.lang.String r1 = "Error resizing imported photo"
            r0 = r24
            X.0KC.A0F(r0, r1, r2)     // Catch:{ all -> 0x0275 }
            throw r2     // Catch:{ all -> 0x0275 }
        L_0x0275:
            r1 = move-exception
            goto L_0x0286
        L_0x0277:
            r11 = move-exception
            r12 = r7
        L_0x0279:
            java.lang.String r1 = "Error accessing photo"
            r0 = r24
            X.0KC.A0F(r0, r1, r11)     // Catch:{ all -> 0x0283 }
            if (r12 == 0) goto L_0x0290
            goto L_0x028d
        L_0x0283:
            r1 = move-exception
            r22 = r12
        L_0x0286:
            if (r22 == 0) goto L_0x0521
            r22.recycle()     // Catch:{ Exception -> 0x0522 }
            goto L_0x0521
        L_0x028d:
            r12.recycle()     // Catch:{ Exception -> 0x0522 }
        L_0x0290:
            boolean r0 = r6.A0A     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x02ad
            boolean r0 = r6.A09     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x02ad
            if (r7 == 0) goto L_0x02ad
            long r13 = X.Pxf.A0F(r7)     // Catch:{ Exception -> 0x0522 }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ad
            java.io.File r0 = X.AnonymousClass7TE.A0t(r36)     // Catch:{ IOException -> 0x03cc }
            r0.createNewFile()     // Catch:{ IOException -> 0x03cc }
            goto L_0x03d4
        L_0x02ad:
            X.Q0h r35 = X.Q12.A00     // Catch:{ Exception -> 0x0522 }
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = new com.facebook.ffmpeg.FFMpegMediaMuxer     // Catch:{ Exception -> 0x0522 }
            r34 = r0
            r37 = r4
            r38 = r28
            r39 = r25
            r40 = r4
            r41 = r28
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0522 }
            r8.A02 = r0     // Catch:{ Exception -> 0x0522 }
            r0.initialize()     // Catch:{ Exception -> 0x0522 }
            X.Q0n r11 = new X.Q0n     // Catch:{ Qe1 -> 0x04b4 }
            r11.<init>()     // Catch:{ Qe1 -> 0x04b4 }
            int r0 = r10 * r9
            int r0 = r0 * r3
            int r0 = r0 * 2
            float r1 = (float) r0     // Catch:{ Qe1 -> 0x04b4 }
            r0 = 1032805417(0x3d8f5c29, float:0.07)
            int r13 = X.AnonymousClass7TE.A05(r1, r0)     // Catch:{ Qe1 -> 0x04b4 }
            r0 = r32
            X.RFa r0 = r0.A04     // Catch:{ Qe1 -> 0x04b4 }
            java.lang.String r0 = r0.A00     // Catch:{ Qe1 -> 0x04b4 }
            android.media.MediaFormat r12 = android.media.MediaFormat.createVideoFormat(r0, r10, r9)     // Catch:{ Qe1 -> 0x04b4 }
            X.0qQ.A07(r12)     // Catch:{ Qe1 -> 0x04b4 }
            java.lang.String r1 = "color-format"
            r0 = 2130708361(0x7f000789, float:1.701803E38)
            r12.setInteger(r1, r0)     // Catch:{ Qe1 -> 0x04b4 }
            java.lang.String r0 = "bitrate"
            r12.setInteger(r0, r13)     // Catch:{ Qe1 -> 0x04b4 }
            java.lang.String r0 = "frame-rate"
            r12.setInteger(r0, r3)     // Catch:{ Qe1 -> 0x04b4 }
            java.lang.String r1 = "i-frame-interval"
            r0 = 10
            r12.setInteger(r1, r0)     // Catch:{ Qe1 -> 0x04b4 }
            X.JYY.A00(r2)     // Catch:{ Qe1 -> 0x04b4 }
            X.Q0p r0 = r11.A01(r12, r2)     // Catch:{ Qe1 -> 0x04b4 }
            android.media.MediaCodec r12 = r0.A03     // Catch:{ Qe1 -> 0x04b4 }
            android.view.Surface r0 = r12.createInputSurface()     // Catch:{ Exception -> 0x0522 }
            X.QLz r11 = new X.QLz     // Catch:{ Exception -> 0x0522 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0522 }
            r0 = -773548210(0xffffffffd1e4974e, float:-1.22723877E11)
            X.0fX.A05(r12, r0)     // Catch:{ all -> 0x0451 }
            r11.A00()     // Catch:{ all -> 0x0451 }
            X.S52 r3 = new X.S52     // Catch:{ all -> 0x0451 }
            r3.<init>(r10, r9)     // Catch:{ all -> 0x0451 }
            r26 = r3
            r1 = 3553(0xde1, float:4.979E-42)
            r0 = r29
            android.opengl.GLUtils.texImage2D(r1, r4, r0, r4)     // Catch:{ all -> 0x0451 }
            r9 = 0
            int r0 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x03a0
            r13 = 0
        L_0x032e:
            r3.A01()     // Catch:{ all -> 0x0451 }
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 * r13
            long r0 = r0 / r18
            android.opengl.EGLDisplay r10 = r11.A01     // Catch:{ all -> 0x0451 }
            android.opengl.EGLSurface r9 = r11.A02     // Catch:{ all -> 0x0451 }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r10, r9, r0)     // Catch:{ all -> 0x0451 }
            android.opengl.EGLDisplay r1 = r11.A01     // Catch:{ all -> 0x0451 }
            android.opengl.EGLSurface r0 = r11.A02     // Catch:{ all -> 0x0451 }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ all -> 0x0451 }
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            r10 = 0
            if (r0 != 0) goto L_0x034e
            r10 = 1
            r12.signalEndOfInputStream()     // Catch:{ all -> 0x0451 }
        L_0x034e:
            android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo     // Catch:{ all -> 0x0451 }
            r9.<init>()     // Catch:{ all -> 0x0451 }
        L_0x0353:
            r0 = 50000(0xc350, double:2.47033E-319)
            int r1 = r12.dequeueOutputBuffer(r9, r0)     // Catch:{ all -> 0x0451 }
            r0 = -2
            if (r1 != r0) goto L_0x0375
            android.media.MediaFormat r0 = r12.getOutputFormat()     // Catch:{ all -> 0x0451 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0451 }
            r8.A03(r0)     // Catch:{ all -> 0x0451 }
            boolean r0 = r8.A03     // Catch:{ all -> 0x0451 }
            if (r0 != 0) goto L_0x0353
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = r8.A02     // Catch:{ all -> 0x0451 }
            r0.A00()     // Catch:{ all -> 0x0451 }
            r0 = r33
            r8.A03 = r0     // Catch:{ all -> 0x0451 }
            goto L_0x0353
        L_0x0375:
            if (r1 < 0) goto L_0x038d
            java.nio.ByteBuffer r0 = r12.getOutputBuffer(r1)     // Catch:{ all -> 0x0451 }
            if (r0 == 0) goto L_0x039b
            X.Pxg.A1D(r9, r0)     // Catch:{ all -> 0x0451 }
            r8.A01(r9, r0)     // Catch:{ all -> 0x0451 }
            r12.releaseOutputBuffer(r1, r4)     // Catch:{ all -> 0x0451 }
            int r0 = r9.flags     // Catch:{ all -> 0x0451 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0353
            goto L_0x0393
        L_0x038d:
            r0 = r25
            if (r1 != r0) goto L_0x0353
            if (r10 != 0) goto L_0x0353
        L_0x0393:
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x03a0
            r0 = 1
            long r13 = r13 + r0
            goto L_0x032e
        L_0x039b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x0451 }
            throw r0     // Catch:{ all -> 0x0451 }
        L_0x03a0:
            r0 = 890821753(0x3518dc79, float:5.694524E-7)
            X.0fX.A06(r12, r0)     // Catch:{ IllegalStateException -> 0x03ad }
            r0 = 1666278776(0x63516578, float:3.862681E21)
            X.0fX.A03(r12, r0)     // Catch:{ IllegalStateException -> 0x03ad }
            goto L_0x03ba
        L_0x03ad:
            r1 = move-exception
            java.lang.Class<X.RPj> r0 = X.C9112RPj.class
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ IllegalStateException -> 0x0480 }
            X.0qQ.A07(r0)     // Catch:{ IllegalStateException -> 0x0480 }
            X.0wb.A07(r0, r1)     // Catch:{ IllegalStateException -> 0x0480 }
        L_0x03ba:
            r3.A00()     // Catch:{ IllegalStateException -> 0x0480 }
            r11.release()     // Catch:{ IllegalStateException -> 0x0480 }
            boolean r0 = r8.A03     // Catch:{ IllegalStateException -> 0x0480 }
            if (r0 == 0) goto L_0x03d4
            r8.A03 = r4     // Catch:{ IllegalStateException -> 0x0480 }
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = r8.A02     // Catch:{ IllegalStateException -> 0x0480 }
            r0.A01()     // Catch:{ IllegalStateException -> 0x0480 }
            goto L_0x03d4
        L_0x03cc:
            r3 = move-exception
            java.lang.String r1 = "PhotoImportForClipCallable"
            java.lang.String r0 = "failed to create stub file for photo import"
            X.0kD.A07(r1, r0, r3)     // Catch:{ Exception -> 0x0522 }
        L_0x03d4:
            java.io.File r3 = r6.A01     // Catch:{ Exception -> 0x0522 }
            if (r3 == 0) goto L_0x051d
            r0 = r16
            int r6 = (int) r0     // Catch:{ Exception -> 0x0522 }
            r0 = r27
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r3, r0, r6)     // Catch:{ Exception -> 0x0522 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r8.A0G     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            X.0qQ.A0B(r0, r4)     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = X.C364678lo.A05(r0)     // Catch:{ Exception -> 0x0522 }
            r1.A0A = r0     // Catch:{ Exception -> 0x0522 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A0G     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r0.A03     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x03fa
            boolean r0 = X.00l.A0W(r0)     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0420
        L_0x03fa:
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0420
            boolean r0 = X.00l.A0W(r0)     // Catch:{ Exception -> 0x0522 }
            if (r0 != 0) goto L_0x0420
            boolean r0 = r5.A05()     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x0420
            java.lang.String r3 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            r1 = r28
            r0 = r33
            X.Kp0 r0 = X.C59737JVv.A00(r1, r2, r3, r0)     // Catch:{ Exception -> 0x0522 }
            if (r0 == 0) goto L_0x041a
            java.lang.String r28 = r0.A01()     // Catch:{ Exception -> 0x0522 }
        L_0x041a:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r5.A0G     // Catch:{ Exception -> 0x0522 }
            r0 = r28
            r1.A03 = r0     // Catch:{ Exception -> 0x0522 }
        L_0x0420:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r5.A0G     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.C59778JXx.A03(r2, r0)     // Catch:{ Exception -> 0x0522 }
            r1.A00(r0)     // Catch:{ Exception -> 0x0522 }
            int r1 = r29.getWidth()     // Catch:{ Exception -> 0x0522 }
            int r0 = r29.getHeight()     // Catch:{ Exception -> 0x0522 }
            X.7zv r2 = new X.7zv     // Catch:{ Exception -> 0x0522 }
            r2.<init>(r8, r1, r0, r4)     // Catch:{ Exception -> 0x0522 }
            r0 = r33
            r2.A1L = r0     // Catch:{ Exception -> 0x0522 }
            r2.A0r = r7     // Catch:{ Exception -> 0x0522 }
            r2.A07 = r6     // Catch:{ Exception -> 0x0522 }
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A0G     // Catch:{ Exception -> 0x0522 }
            r2.A0S = r0     // Catch:{ Exception -> 0x0522 }
            boolean r1 = r0.A0B     // Catch:{ Exception -> 0x0522 }
            r0 = 0
            if (r1 == 0) goto L_0x044b
            r0 = 54
        L_0x044b:
            r2.A0F = r0     // Catch:{ Exception -> 0x0522 }
            r29.recycle()     // Catch:{ Exception -> 0x0522 }
            return r2
        L_0x0451:
            r2 = move-exception
            r0 = 890821753(0x3518dc79, float:5.694524E-7)
            X.0fX.A06(r12, r0)     // Catch:{ IllegalStateException -> 0x045f }
            r0 = 1666278776(0x63516578, float:3.862681E21)
            X.0fX.A03(r12, r0)     // Catch:{ IllegalStateException -> 0x045f }
            goto L_0x046c
        L_0x045f:
            r1 = move-exception
            java.lang.Class<X.RPj> r0 = X.C9112RPj.class
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ IllegalStateException -> 0x0480 }
            X.0qQ.A07(r0)     // Catch:{ IllegalStateException -> 0x0480 }
            X.0wb.A07(r0, r1)     // Catch:{ IllegalStateException -> 0x0480 }
        L_0x046c:
            if (r26 == 0) goto L_0x0471
            r26.A00()     // Catch:{ IllegalStateException -> 0x0480 }
        L_0x0471:
            r11.release()     // Catch:{ IllegalStateException -> 0x0480 }
            boolean r0 = r8.A03     // Catch:{ IllegalStateException -> 0x0480 }
            if (r0 == 0) goto L_0x047f
            r8.A03 = r4     // Catch:{ IllegalStateException -> 0x0480 }
            com.facebook.ffmpeg.FFMpegMediaMuxer r0 = r8.A02     // Catch:{ IllegalStateException -> 0x0480 }
            r0.A01()     // Catch:{ IllegalStateException -> 0x0480 }
        L_0x047f:
            throw r2     // Catch:{ IllegalStateException -> 0x0480 }
        L_0x0480:
            r2 = move-exception
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ Exception -> 0x0522 }
            java.lang.StringBuilder r2 = X.JTQ.A0d(r2)     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = ", path="
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            r0 = r30
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0522 }
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            r0 = r31
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            long r0 = r1.length()     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = X.Pxe.A10(r2, r0)     // Catch:{ Exception -> 0x0522 }
            X.HP2 r1 = new X.HP2     // Catch:{ Exception -> 0x0522 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x0521
        L_0x04b4:
            java.lang.String r0 = "failed to prepare photoToClipHelper"
            X.HP2 r1 = new X.HP2     // Catch:{ Exception -> 0x0522 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x0521
        L_0x04bc:
            int r0 = r3.getWidth()     // Catch:{ Exception -> 0x0522 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0522 }
            int r0 = r3.getHeight()     // Catch:{ Exception -> 0x0522 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0522 }
            java.lang.Object[] r1 = new java.lang.Object[]{r14, r15, r16, r17, r18, r19}     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = "photo size is invalid. image (%d, %d). cameraSpec (%d, %d). alignment (%d, %d)"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)     // Catch:{ Exception -> 0x0522 }
            X.HP2 r1 = new X.HP2     // Catch:{ Exception -> 0x0522 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x0521
        L_0x04dd:
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x0522 }
            if (r3 != 0) goto L_0x0513
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ Exception -> 0x0522 }
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = "photo is null. path="
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            java.lang.String r0 = r5.A0X     // Catch:{ Exception -> 0x0522 }
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            r0 = r30
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0522 }
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            r0 = r31
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            long r0 = r1.length()     // Catch:{ Exception -> 0x0522 }
            r2.append(r0)     // Catch:{ Exception -> 0x0522 }
            X.Pxf.A1O(r4, r2)     // Catch:{ Exception -> 0x0522 }
        L_0x0513:
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0522 }
            X.HP2 r1 = new X.HP2     // Catch:{ Exception -> 0x0522 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0522 }
            goto L_0x0521
        L_0x051d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ Exception -> 0x0522 }
        L_0x0521:
            throw r1     // Catch:{ Exception -> 0x0522 }
        L_0x0522:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 != 0) goto L_0x052c
            java.lang.String r1 = "null"
        L_0x052c:
            java.lang.String r0 = "PhotoImportForClipCallable"
            X.0kD.A07(r0, r1, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13156TNo.call():X.7zv");
    }

    public C13156TNo(Medium medium, UserSession userSession, CameraSpec cameraSpec, String str, int i, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        this.A06 = userSession;
        this.A05 = medium;
        this.A08 = str;
        this.A07 = cameraSpec;
        this.A04 = j;
        this.A00 = i;
        this.A0A = z;
        this.A09 = z2;
        MediaCodecInfo.CodecCapabilities A002 = SSg.A00();
        if (A002 == null || A002.getVideoCapabilities() == null) {
            i2 = 16;
        } else {
            i2 = A002.getVideoCapabilities().getWidthAlignment();
        }
        this.A03 = i2;
        MediaCodecInfo.CodecCapabilities A003 = SSg.A00();
        if (A003 == null || A003.getVideoCapabilities() == null) {
            i3 = 16;
        } else {
            i3 = A003.getVideoCapabilities().getHeightAlignment();
        }
        this.A02 = i3;
    }
}
