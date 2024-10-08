package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class LEB {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public LEB(Context context, UserSession userSession, Integer num, String str, String str2, String str3, float f, boolean z, boolean z2) {
        this.A01 = context;
        this.A08 = z;
        this.A02 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = f;
        this.A07 = z2;
        this.A03 = num;
        this.A04 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022d, code lost:
        r0 = X.JTO.A0u(X.002.A0R("Failed decoding file.", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0238, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0239, code lost:
        r1 = "Error cropping or rotate image";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0238 A[ExcHandler: IOException | Exception (e java.lang.Throwable), Splitter:B:35:0x0121] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.Rect r26, java.util.List r27) {
        /*
            r25 = this;
            r11 = 0
            r0 = r27
            java.lang.Object r1 = X.00k.A0O(r0, r11)
            X.Jtk r1 = (X.C60926Jtk) r1
            if (r1 == 0) goto L_0x0038
            r3 = r25
            android.content.Context r2 = r3.A01
            boolean r9 = r3.A08
            com.instagram.common.session.UserSession r5 = r3.A02
            java.lang.String r8 = r3.A05
            java.lang.String r0 = r3.A06
            r22 = r0
            float r6 = r3.A00
            boolean r4 = r3.A07
            java.lang.Integer r7 = r3.A03
            java.lang.String r0 = r3.A04
            r21 = r0
            com.instagram.common.gallery.Medium r3 = r1.A00
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x003f
            int r1 = r3.A03
            r0 = 61500(0xf03c, float:8.618E-41)
            if (r1 <= r0) goto L_0x0039
            r0 = 2131968987(0x7f1343db, float:1.9574884E38)
        L_0x0035:
            X.C56588I2s.A01(r2, r0)
        L_0x0038:
            return
        L_0x0039:
            if (r9 == 0) goto L_0x003f
            r0 = 2131968952(0x7f1343b8, float:1.9574813E38)
            goto L_0x0035
        L_0x003f:
            X.LRh r0 = new X.LRh
            r0.<init>(r5, r2)
            r0.A07(r11, r8)
            java.lang.String r20 = X.JTQ.A0Z()
            int r1 = r7.intValue()
            r10 = 1
            if (r1 == r10) goto L_0x0115
            if (r1 == r11) goto L_0x0111
            r0 = 2
            if (r1 != r0) goto L_0x0248
            X.28D r9 = X.28D.A3h
        L_0x0059:
            boolean r0 = r3.CeS()
            r14 = r26
            if (r0 == 0) goto L_0x0119
            java.io.File r0 = X.0mb.A05(r2)
            java.lang.String r8 = r0.getCanonicalPath()
            X.3Q2 r7 = X.AnonymousClass9T3.A02(r20)
            r7.A0i(r8)
            java.lang.String r0 = r3.A0a
            r7.A33 = r0
            java.lang.String r0 = r3.A0X
            r7.A3L = r0
            r7.A02 = r6
            r7.A3Z = r8
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            r7.A0e(r0)
            r0 = r22
            r7.A3D = r0
            r0 = 8
            if (r4 == 0) goto L_0x008b
            r0 = 16
        L_0x008b:
            r7.A0N = r0
            r7.A5e = r11
            X.CTE r0 = new X.CTE
            r0.<init>()
            r7.A0a(r0)
            r0 = r21
            r7.A2g = r0
            r7.A0i = r9
            X.JYp r0 = X.C59796JYp.A00(r3, r11)
            java.lang.String r9 = r0.A07
            X.0qQ.A07(r9)
            long r0 = r0.A03
            r15 = r5
            r16 = r9
            r17 = r0
            r19 = r0
            com.instagram.pendingmedia.model.ClipInfo r1 = X.Q0X.A03(r15, r16, r17, r19)
            int r0 = r1.A09
            float r11 = (float) r0
            int r0 = r1.A06
            float r9 = (float) r0
            float r16 = r11 / r9
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
            float r9 = r9 * r6
            int r0 = (int) r9
            r1.A09 = r0
        L_0x00c3:
            X.Q0X.A04(r1, r7)
            java.lang.String r0 = r7.A33
            if (r0 != 0) goto L_0x00e7
            java.io.File r18 = X.AnonymousClass457.A01()
            int r9 = r1.A09
            int r0 = r1.A06
            r21 = 100
            r22 = 0
            r17 = r1
            r19 = r9
            r20 = r0
            r24 = r10
            X.C64188LSv.A01(r17, r18, r19, r20, r21, r22, r24)
            java.lang.String r0 = r18.getCanonicalPath()
            r7.A33 = r0
        L_0x00e7:
            r7.A0l(r10)
            X.LS2.A01(r2, r5, r7, r4)
            android.os.Looper r0 = X.C64021Cb.A00()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.TKj r0 = new X.TKj
            r9 = r0
            r10 = r2
            r11 = r14
            r12 = r3
            r13 = r5
            r14 = r7
            r15 = r8
            r17 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.post(r0)
            return
        L_0x0108:
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c3
            float r11 = r11 / r6
            int r0 = (int) r11
            r1.A06 = r0
            goto L_0x00c3
        L_0x0111:
            X.28D r9 = X.28D.A3i
            goto L_0x0059
        L_0x0115:
            X.28D r9 = X.28D.A3g
            goto L_0x0059
        L_0x0119:
            java.lang.String r19 = "Error cropping or rotate image"
            r0 = 825(0x339, float:1.156E-42)
            java.lang.String r18 = X.Pxd.A00(r0)
            int r8 = r3.A0B     // Catch:{ IOException | Exception -> 0x0238 }
            r17 = 1
            if (r8 == 0) goto L_0x012b
            int r0 = r3.A04     // Catch:{ IOException | Exception -> 0x0238 }
            if (r0 != 0) goto L_0x0154
        L_0x012b:
            java.lang.String r7 = "Selected media size corrupted. width = "
            java.lang.String r1 = ", height = "
            int r0 = r3.A04     // Catch:{ IOException | Exception -> 0x0238 }
            java.lang.String r8 = X.002.A02(r8, r0, r7, r1)     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException | Exception -> 0x0238 }
            r7.<init>()     // Catch:{ IOException | Exception -> 0x0238 }
            r7.inJustDecodeBounds = r10     // Catch:{ IOException | Exception -> 0x0238 }
            java.lang.String r0 = r3.A0X     // Catch:{ RuntimeException -> 0x022d, IOException | Exception -> 0x0238 }
            android.graphics.BitmapFactory.decodeFile(r0, r7)     // Catch:{ RuntimeException -> 0x022d, IOException | Exception -> 0x0238 }
            int r1 = r7.outWidth     // Catch:{ RuntimeException -> 0x022d, IOException | Exception -> 0x0238 }
            int r0 = r7.outHeight     // Catch:{ RuntimeException -> 0x022d, IOException | Exception -> 0x0238 }
            r3.A0B = r1     // Catch:{ RuntimeException -> 0x022d, IOException | Exception -> 0x0238 }
            r3.A04 = r0     // Catch:{ RuntimeException -> 0x022d, IOException | Exception -> 0x0238 }
            if (r1 == 0) goto L_0x014e
            if (r0 == 0) goto L_0x014e
            goto L_0x0154
        L_0x014e:
            java.io.IOException r0 = X.JTO.A0u(r8)     // Catch:{ IOException | Exception -> 0x0238 }
            goto L_0x0237
        L_0x0154:
            java.io.File r16 = X.0mb.A04(r2)     // Catch:{ IOException | Exception -> 0x0238 }
            java.lang.String r0 = r3.A0X     // Catch:{ IOException | Exception -> 0x0238 }
            int r12 = X.1MF.A00(r0)     // Catch:{ IOException | Exception -> 0x0238 }
            java.lang.String r7 = r3.A0X     // Catch:{ IOException | Exception -> 0x0238 }
            int r1 = r3.A0B     // Catch:{ IOException | Exception -> 0x0238 }
            int r0 = r3.A04     // Catch:{ IOException | Exception -> 0x0238 }
            r13 = 0
            android.graphics.Bitmap r7 = X.1MF.A0F(r7, r1, r0, r12)     // Catch:{ IOException | Exception -> 0x0238 }
            if (r26 == 0) goto L_0x01c8
            if (r7 == 0) goto L_0x01c8
            int r0 = r3.A0B     // Catch:{ IOException | Exception -> 0x0238 }
            float r10 = (float) r0     // Catch:{ IOException | Exception -> 0x0238 }
            int r0 = r3.A04     // Catch:{ IOException | Exception -> 0x0238 }
            float r8 = (float) r0     // Catch:{ IOException | Exception -> 0x0238 }
            float r1 = r10 / r8
            r0 = 90
            if (r12 == r0) goto L_0x017d
            r0 = 270(0x10e, float:3.78E-43)
            if (r12 != r0) goto L_0x017e
        L_0x017d:
            r13 = 1
        L_0x017e:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0184
            float r1 = r0 / r1
        L_0x0184:
            float r10 = r10 * r0
            float r8 = r8 * r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x018c
            if (r13 == 0) goto L_0x0192
        L_0x018c:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0195
            if (r13 == 0) goto L_0x0195
        L_0x0192:
            float r8 = r10 / r6
            goto L_0x0197
        L_0x0195:
            float r10 = r8 * r6
        L_0x0197:
            int r12 = (int) r10     // Catch:{ IOException | Exception -> 0x0238 }
            int r10 = (int) r8     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.RectF r8 = new android.graphics.RectF     // Catch:{ IOException | Exception -> 0x0238 }
            r8.<init>(r14)     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.Matrix r13 = X.AnonymousClass7TE.A0U()     // Catch:{ IOException | Exception -> 0x0238 }
            float r0 = (float) r12     // Catch:{ IOException | Exception -> 0x0238 }
            r1 = r0
            float r0 = (float) r10     // Catch:{ IOException | Exception -> 0x0238 }
            r15 = 0
            android.graphics.RectF r14 = new android.graphics.RectF     // Catch:{ IOException | Exception -> 0x0238 }
            r14.<init>(r15, r15, r1, r0)     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER     // Catch:{ IOException | Exception -> 0x0238 }
            r13.setRectToRect(r8, r14, r0)     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.Bitmap$Config r0 = r7.getConfig()     // Catch:{ IOException | Exception -> 0x0238 }
            X.0qQ.A0A(r0)     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r12, r10, r0)     // Catch:{ IOException | Exception -> 0x0238 }
            android.graphics.Canvas r1 = X.JTO.A0B(r8)     // Catch:{ IOException | Exception -> 0x0238 }
            r0 = 3
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r0)     // Catch:{ IOException | Exception -> 0x0238 }
            r1.drawBitmap(r7, r13, r0)     // Catch:{ IOException | Exception -> 0x0238 }
            r7 = r8
        L_0x01c8:
            boolean r0 = r16.exists()     // Catch:{ IOException | Exception -> 0x0238 }
            if (r0 == 0) goto L_0x0216
            if (r7 == 0) goto L_0x0216
            r0 = r16
            X.1MF.A0M(r7, r0)     // Catch:{ IOException | Exception -> 0x0238 }
            java.lang.String r0 = r16.getCanonicalPath()     // Catch:{ IOException -> 0x023c }
            if (r0 != 0) goto L_0x01dd
            java.lang.String r0 = r3.A0X     // Catch:{ IOException -> 0x023c }
        L_0x01dd:
            X.3Q2 r1 = X.AnonymousClass9T3.A01(r20)
            r1.A33 = r0
            r1.A3L = r0
            r1.A02 = r6
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            r1.A0e(r0)
            r0 = r22
            r1.A3D = r0
            r0 = 8
            if (r4 == 0) goto L_0x01f6
            r0 = 16
        L_0x01f6:
            r1.A0N = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r3.A0G
            X.0qQ.A0B(r0, r11)
            r1.A13 = r0
            r1.A5e = r11
            X.CTE r0 = new X.CTE
            r0.<init>()
            r1.A0a(r0)
            r0 = r21
            r1.A2g = r0
            r1.A0i = r9
            X.LS2.A00(r2, r5, r1)
            X.LS2.A01(r2, r5, r1, r4)
            return
        L_0x0216:
            java.lang.String r4 = "Error saving image. File exists = "
            boolean r3 = r16.exists()     // Catch:{ IOException | Exception -> 0x0238 }
            java.lang.String r1 = ", bitmap is not null = "
            if (r7 != 0) goto L_0x0222
            r17 = 0
        L_0x0222:
            r0 = r17
            java.lang.String r0 = X.002.A1C(r4, r1, r3, r0)     // Catch:{ IOException | Exception -> 0x0238 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException | Exception -> 0x0238 }
            goto L_0x0237
        L_0x022d:
            java.lang.String r0 = "Failed decoding file."
            java.lang.String r0 = X.002.A0R(r0, r8)     // Catch:{ IOException | Exception -> 0x0238 }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException | Exception -> 0x0238 }
        L_0x0237:
            throw r0     // Catch:{ IOException | Exception -> 0x0238 }
        L_0x0238:
            r3 = move-exception
            r1 = r19
            goto L_0x023f
        L_0x023c:
            r3 = move-exception
            java.lang.String r1 = "Error getting image file path"
        L_0x023f:
            r0 = r18
            X.0wb.A06(r0, r1, r3)
            X.C56588I2s.A00(r2)
            return
        L_0x0248:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LEB.A00(android.graphics.Rect, java.util.List):void");
    }
}
