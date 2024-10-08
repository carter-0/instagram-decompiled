package X;

import android.graphics.ColorFilter;
import android.widget.ImageView;

/* renamed from: X.5uj  reason: invalid class name and case insensitive filesystem */
public final class C299195uj implements AnonymousClass1MK {
    public final /* synthetic */ ColorFilter A00;
    public final /* synthetic */ ImageView.ScaleType A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C307786Rm A03;
    public final /* synthetic */ C276544tV A04;
    public final /* synthetic */ C277014uI A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyF(X.C226952iF r12, X.AnonymousClass3LX r13) {
        /*
            r11 = this;
            r5 = 1
            X.0qQ.A0B(r13, r5)
            X.4tV r3 = r11.A04
            X.6Rm r2 = r11.A03
            X.4uI r1 = r11.A05
            java.lang.String r0 = "ImageFinalRendered"
            X.C299185ui.A01(r2, r3, r1, r0)
            android.graphics.Bitmap r7 = r13.A01
            android.widget.ImageView r6 = r11.A02
            r0 = 2131434564(0x7f0b1c44, float:1.8490945E38)
            java.lang.Object r0 = r6.getTag(r0)
            if (r0 != r11) goto L_0x0150
            if (r7 == 0) goto L_0x0150
            java.lang.String r4 = r11.A06
            if (r4 == 0) goto L_0x0113
            java.lang.String r3 = "file://"
            r1 = 0
            X.0qQ.A0B(r3, r5)
            boolean r0 = r4.startsWith(r3)
            if (r0 != r5) goto L_0x0113
            android.widget.ImageView$ScaleType r2 = r11.A01
            java.lang.String r0 = ""
            java.lang.String r3 = X.00p.A0g(r4, r3, r0, r1)     // Catch:{ IOException -> 0x011b }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x011b }
            r0.<init>(r3)     // Catch:{ IOException -> 0x011b }
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x011b }
            if (r0 == 0) goto L_0x010d
            X.2kK r1 = new X.2kK     // Catch:{ IOException -> 0x011b }
            r1.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x011b }
            r0 = 2394(0x95a, float:3.355E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x011b }
            int r1 = r1.A0M(r0, r5)     // Catch:{ IOException -> 0x011b }
            r0 = 3
            if (r1 == r0) goto L_0x0060
            r0 = 6
            if (r1 == r0) goto L_0x005d
            r0 = 8
            if (r1 != r0) goto L_0x0121
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0062
        L_0x005d:
            r3 = 90
            goto L_0x0062
        L_0x0060:
            r3 = 180(0xb4, float:2.52E-43)
        L_0x0062:
            android.graphics.Matrix r4 = new android.graphics.Matrix     // Catch:{ IOException -> 0x011b }
            r4.<init>()     // Catch:{ IOException -> 0x011b }
            if (r2 == 0) goto L_0x00e0
            int r10 = r7.getWidth()     // Catch:{ IOException -> 0x011b }
            int r9 = r7.getHeight()     // Catch:{ IOException -> 0x011b }
            int[] r1 = X.C17135VJk.A00     // Catch:{ IOException -> 0x011b }
            int r0 = r2.ordinal()     // Catch:{ IOException -> 0x011b }
            r1 = r1[r0]     // Catch:{ IOException -> 0x011b }
            r2 = 0
            if (r1 == r5) goto L_0x0095
            r0 = 2
            if (r1 == r0) goto L_0x0083
            r0 = 3
            if (r1 != r0) goto L_0x00e0
            goto L_0x00b1
        L_0x0083:
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x011b }
            float r2 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r10     // Catch:{ IOException -> 0x011b }
            float r2 = r2 / r0
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x011b }
            float r1 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r9     // Catch:{ IOException -> 0x011b }
            float r1 = r1 / r0
            r4.setScale(r2, r1)     // Catch:{ IOException -> 0x011b }
            goto L_0x00e0
        L_0x0095:
            float r1 = (float) r10     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r9     // Catch:{ IOException -> 0x011b }
            android.graphics.RectF r8 = new android.graphics.RectF     // Catch:{ IOException -> 0x011b }
            r8.<init>(r2, r2, r1, r0)     // Catch:{ IOException -> 0x011b }
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x011b }
            float r5 = (float) r0     // Catch:{ IOException -> 0x011b }
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r0     // Catch:{ IOException -> 0x011b }
            android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ IOException -> 0x011b }
            r1.<init>(r2, r2, r5, r0)     // Catch:{ IOException -> 0x011b }
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER     // Catch:{ IOException -> 0x011b }
            r4.setRectToRect(r8, r1, r0)     // Catch:{ IOException -> 0x011b }
            goto L_0x00e0
        L_0x00b1:
            int r1 = r6.getHeight()     // Catch:{ IOException -> 0x011b }
            int r1 = r1 * r10
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x011b }
            int r0 = r0 * r9
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r1 <= r0) goto L_0x00f3
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x011b }
            float r5 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r9     // Catch:{ IOException -> 0x011b }
            float r5 = r5 / r0
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x011b }
            float r2 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r10     // Catch:{ IOException -> 0x011b }
            float r0 = r0 * r5
            float r2 = r2 - r0
            float r2 = r2 * r8
            r1 = 0
        L_0x00d0:
            r4.setScale(r5, r5)     // Catch:{ IOException -> 0x011b }
            int r0 = X.AnonymousClass1GB.A01(r2)     // Catch:{ IOException -> 0x011b }
            float r2 = (float) r0     // Catch:{ IOException -> 0x011b }
            int r0 = X.AnonymousClass1GB.A01(r1)     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r0     // Catch:{ IOException -> 0x011b }
            r4.postTranslate(r2, r0)     // Catch:{ IOException -> 0x011b }
        L_0x00e0:
            float r3 = (float) r3     // Catch:{ IOException -> 0x011b }
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x011b }
            float r2 = (float) r0     // Catch:{ IOException -> 0x011b }
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = r0 / r1
            r4.postRotate(r3, r2, r0)     // Catch:{ IOException -> 0x011b }
            goto L_0x0104
        L_0x00f3:
            int r0 = r6.getWidth()     // Catch:{ IOException -> 0x011b }
            float r5 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r10     // Catch:{ IOException -> 0x011b }
            float r5 = r5 / r0
            int r0 = r6.getHeight()     // Catch:{ IOException -> 0x011b }
            float r1 = (float) r0     // Catch:{ IOException -> 0x011b }
            float r0 = (float) r9     // Catch:{ IOException -> 0x011b }
            float r0 = r0 * r5
            float r1 = r1 - r0
            float r1 = r1 * r8
            goto L_0x00d0
        L_0x0104:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r6.setScaleType(r0)
            r6.setImageMatrix(r4)
            goto L_0x0121
        L_0x010d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IOException -> 0x011b }
            r0.<init>()     // Catch:{ IOException -> 0x011b }
            throw r0     // Catch:{ IOException -> 0x011b }
        L_0x0113:
            android.widget.ImageView$ScaleType r0 = r11.A01
            if (r0 == 0) goto L_0x0121
            r6.setScaleType(r0)
            goto L_0x0121
        L_0x011b:
            r1 = move-exception
            java.lang.String r0 = "BloksImageBinder"
            X.1Kn.A03(r0, r1)
        L_0x0121:
            android.graphics.ColorFilter r0 = r11.A00
            if (r0 == 0) goto L_0x0128
            r6.setColorFilter(r0)
        L_0x0128:
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x014d
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r6.setScaleType(r0)
            android.graphics.Matrix r5 = r6.getImageMatrix()
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = r7.getWidth()
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            r5.postScale(r4, r3, r2, r0)
            r6.setImageMatrix(r5)
        L_0x014d:
            r6.setImageBitmap(r7)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C299195uj.CyF(X.2iF, X.3LX):void");
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C299195uj(ColorFilter colorFilter, ImageView.ScaleType scaleType, ImageView imageView, C307786Rm r4, C276544tV r5, C277014uI r6, String str, boolean z) {
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = imageView;
        this.A06 = str;
        this.A01 = scaleType;
        this.A00 = colorFilter;
        this.A07 = z;
    }

    public final void DJx(C226952iF r5, C254673sr r6) {
        C299185ui.A01(this.A03, this.A04, this.A05, "ImageFailed");
    }
}
