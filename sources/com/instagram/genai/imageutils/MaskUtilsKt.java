package com.instagram.genai.imageutils;

import X.00k;
import X.0qQ;
import X.0sP;
import X.19E;
import X.1Hj;
import X.2HY;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.C229632nm;
import X.C60340gF;
import X.C66176MGn;
import X.JTO;
import X.JTP;
import X.JTT;
import X.MPA;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import com.facebook.systrace.Systrace;

public abstract class MaskUtilsKt {
    public static final int A00 = Color.argb(0, 0, 0, 0);
    public static final int A01 = Color.argb(255, 0, 0, 0);

    public static final int A00(Bitmap bitmap, PointF pointF) {
        AnonymousClass7TF.A1H(bitmap, pointF);
        return bitmap.getPixel(C229632nm.A03((int) (pointF.x * JTO.A02(bitmap)), 0, bitmap.getWidth() - 1), C229632nm.A03((int) (pointF.y * JTO.A01(bitmap)), 0, bitmap.getHeight() - 1));
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDL, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (((X.MDL) r3).A08 != 1) goto L_0x000f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(android.graphics.Bitmap r14, android.graphics.Bitmap r15, android.graphics.PointF r16, X.AnonymousClass4D7 r17) {
        /*
            r6 = 1
            r3 = r17
            boolean r0 = r3 instanceof X.MDL
            if (r0 == 0) goto L_0x000f
            r0 = r3
            X.MDL r0 = (X.MDL) r0
            int r1 = r0.A08
            r0 = 1
            if (r1 == r6) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x003b
            r5 = r3
            X.MDL r5 = (X.MDL) r5
            int r2 = r5.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r5.A03 = r2
        L_0x0020:
            java.lang.Object r7 = r5.A06
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A03
            if (r0 == 0) goto L_0x0046
            if (r0 != r6) goto L_0x0041
            int r11 = r5.A02
            int r12 = r5.A01
            int r1 = r5.A00
            boolean r2 = r5.A07
            java.lang.Object r10 = r5.A05
            int[] r10 = (int[]) r10
            java.lang.Object r3 = r5.A04
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x009d
        L_0x003b:
            X.MDL r5 = new X.MDL
            r5.<init>(r6, r3)
            goto L_0x0020
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0046:
            X.0eS.A00(r7)
            java.lang.String r3 = "updatePixelsAfterEverythingMaskToggle"
            boolean r2 = A0E()
            X.2SP r0 = X.2SP.A01
            int r1 = r0.A03()
            if (r2 == 0) goto L_0x005a
            X.0lq.A03(r3, r1)
        L_0x005a:
            int r12 = r14.getWidth()     // Catch:{ all -> 0x00aa }
            int r11 = r14.getHeight()     // Catch:{ all -> 0x00aa }
            int[] r10 = A0F(r14)     // Catch:{ all -> 0x00aa }
            int[] r9 = A0F(r15)     // Catch:{ all -> 0x00aa }
            r0 = r16
            int r13 = A00(r15, r0)     // Catch:{ all -> 0x00aa }
            int r8 = A00(r14, r0)     // Catch:{ all -> 0x00aa }
            int r7 = A00     // Catch:{ all -> 0x00aa }
            r0 = 0
            boolean r7 = X.JTQ.A1O(r8, r7)
            X.2HY r0 = X.C229632nm.A0C(r0, r12)     // Catch:{ all -> 0x00aa }
            r14 = 0
            if (r7 == 0) goto L_0x0083
            r14 = 1
        L_0x0083:
            X.MMz r8 = new X.MMz     // Catch:{ all -> 0x00aa }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00aa }
            r5.A04 = r3     // Catch:{ all -> 0x00aa }
            r5.A05 = r10     // Catch:{ all -> 0x00aa }
            r5.A07 = r2     // Catch:{ all -> 0x00aa }
            r5.A00 = r1     // Catch:{ all -> 0x00aa }
            r5.A01 = r12     // Catch:{ all -> 0x00aa }
            r5.A02 = r11     // Catch:{ all -> 0x00aa }
            r5.A03 = r6     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = A0A(r5, r8, r0)     // Catch:{ all -> 0x00aa }
            if (r0 != r4) goto L_0x00a0
            return r4
        L_0x009d:
            X.0eS.A00(r7)     // Catch:{ all -> 0x00aa }
        L_0x00a0:
            android.graphics.Bitmap r4 = A01(r10, r12, r11)     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x00a9
            X.0lq.A04(r3, r1)
        L_0x00a9:
            return r4
        L_0x00aa:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b0
            X.0lq.A04(r3, r1)
        L_0x00b0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A02(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.PointF, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDL, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (((X.MDL) r13).A08 != 0) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.graphics.Bitmap r11, java.util.List r12, X.AnonymousClass4D7 r13) {
        /*
            r10 = 0
            boolean r0 = r13 instanceof X.MDL
            if (r0 == 0) goto L_0x000d
            r0 = r13
            X.MDL r0 = (X.MDL) r0
            int r1 = r0.A08
            r0 = 1
            if (r1 == r10) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x003a
            r5 = r13
            X.MDL r5 = (X.MDL) r5
            int r2 = r5.A03
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003a
            int r2 = r2 - r1
            r5.A03 = r2
        L_0x001e:
            java.lang.Object r7 = r5.A06
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A03
            r6 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 != r6) goto L_0x0040
            int r8 = r5.A02
            int r9 = r5.A01
            int r1 = r5.A00
            boolean r2 = r5.A07
            java.lang.Object r13 = r5.A05
            int[] r13 = (int[]) r13
            java.lang.Object r3 = r5.A04
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x008b
        L_0x003a:
            X.MDL r5 = new X.MDL
            r5.<init>(r10, r13)
            goto L_0x001e
        L_0x0040:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0045:
            X.0eS.A00(r7)
            java.lang.String r3 = "createSelectedMaskWithObjectsFromSelectEverythingMask"
            boolean r2 = A0E()
            X.2SP r0 = X.2SP.A01
            int r1 = r0.A03()
            if (r2 == 0) goto L_0x0059
            X.0lq.A03(r3, r1)
        L_0x0059:
            int[] r12 = X.00k.A0x(r12)     // Catch:{ all -> 0x0098 }
            int r9 = r11.getWidth()     // Catch:{ all -> 0x0098 }
            int r8 = r11.getHeight()     // Catch:{ all -> 0x0098 }
            int r0 = r9 * r8
            int[] r13 = new int[r0]     // Catch:{ all -> 0x0098 }
            int[] r11 = A0F(r11)     // Catch:{ all -> 0x0098 }
            X.2HY r0 = X.C229632nm.A0C(r10, r9)     // Catch:{ all -> 0x0098 }
            X.IxW r7 = new X.IxW     // Catch:{ all -> 0x0098 }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0098 }
            r5.A04 = r3     // Catch:{ all -> 0x0098 }
            r5.A05 = r13     // Catch:{ all -> 0x0098 }
            r5.A07 = r2     // Catch:{ all -> 0x0098 }
            r5.A00 = r1     // Catch:{ all -> 0x0098 }
            r5.A01 = r9     // Catch:{ all -> 0x0098 }
            r5.A02 = r8     // Catch:{ all -> 0x0098 }
            r5.A03 = r6     // Catch:{ all -> 0x0098 }
            java.lang.Object r0 = A0A(r5, r7, r0)     // Catch:{ all -> 0x0098 }
            if (r0 != r4) goto L_0x008e
            return r4
        L_0x008b:
            X.0eS.A00(r7)     // Catch:{ all -> 0x0098 }
        L_0x008e:
            android.graphics.Bitmap r4 = A01(r13, r9, r8)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0097
            X.0lq.A04(r3, r1)
        L_0x0097:
            return r4
        L_0x0098:
            r0 = move-exception
            if (r2 == 0) goto L_0x009e
            X.0lq.A04(r3, r1)
        L_0x009e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A03(android.graphics.Bitmap, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDd, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ all -> 0x009f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(android.graphics.Bitmap r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = 1
            boolean r0 = r11 instanceof X.MDd
            if (r0 == 0) goto L_0x0031
            r8 = r11
            X.MDd r8 = (X.MDd) r8
            int r0 = r8.A06
            if (r0 != r9) goto L_0x0031
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0031
            int r2 = r2 - r1
            r8.A01 = r2
        L_0x0017:
            java.lang.Object r7 = r8.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A01
            r4 = 2
            if (r0 == 0) goto L_0x0049
            if (r0 == r9) goto L_0x003c
            if (r0 != r4) goto L_0x0037
            int r5 = r8.A00
            boolean r3 = r8.A05
            java.lang.Object r4 = r8.A03
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.Object r2 = r8.A02
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x008f
        L_0x0031:
            X.MDd r8 = new X.MDd
            r8.<init>((int) r9, (X.AnonymousClass4D7) r11)
            goto L_0x0017
        L_0x0037:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003c:
            int r5 = r8.A00
            boolean r3 = r8.A05
            java.lang.Object r2 = r8.A03
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r10 = r8.A02
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L_0x006e
        L_0x0049:
            X.0eS.A00(r7)
            java.lang.String r2 = "calculateMaskDataOutline"
            boolean r3 = A0E()
            X.2SP r0 = X.2SP.A01
            int r5 = r0.A03()
            if (r3 == 0) goto L_0x005d
            X.0lq.A03(r2, r5)
        L_0x005d:
            r8.A02 = r10     // Catch:{ all -> 0x009f }
            r8.A03 = r2     // Catch:{ all -> 0x009f }
            r8.A05 = r3     // Catch:{ all -> 0x009f }
            r8.A00 = r5     // Catch:{ all -> 0x009f }
            r8.A01 = r9     // Catch:{ all -> 0x009f }
            java.lang.Object r7 = A09(r10, r8, r9)     // Catch:{ all -> 0x009f }
            if (r7 != r6) goto L_0x0071
            return r6
        L_0x006e:
            X.0eS.A00(r7)     // Catch:{ all -> 0x009f }
        L_0x0071:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x009f }
            float r1 = X.JTO.A02(r10)     // Catch:{ all -> 0x009f }
            r0 = 1128792064(0x43480000, float:200.0)
            float r1 = r1 / r0
            r8.A02 = r2     // Catch:{ all -> 0x009f }
            r8.A03 = r7     // Catch:{ all -> 0x009f }
            r8.A05 = r3     // Catch:{ all -> 0x009f }
            r8.A00 = r5     // Catch:{ all -> 0x009f }
            r8.A01 = r4     // Catch:{ all -> 0x009f }
            r4 = r7
            r0 = 160000(0x27100, float:2.24208E-40)
            java.lang.Object r7 = A07(r7, r8, r1, r0)     // Catch:{ all -> 0x009f }
            if (r7 != r6) goto L_0x0092
            return r6
        L_0x008f:
            X.0eS.A00(r7)     // Catch:{ all -> 0x009f }
        L_0x0092:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x009f }
            X.Hkx r6 = new X.Hkx     // Catch:{ all -> 0x009f }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x009f }
            if (r3 == 0) goto L_0x009e
            X.0lq.A04(r2, r5)
        L_0x009e:
            return r6
        L_0x009f:
            r0 = move-exception
            if (r3 == 0) goto L_0x00a5
            X.0lq.A04(r2, r5)
        L_0x00a5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A04(android.graphics.Bitmap, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDc, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(android.graphics.Bitmap r11, X.AnonymousClass4D7 r12) {
        /*
            r7 = 0
            boolean r0 = r12 instanceof X.MDc
            if (r0 == 0) goto L_0x0060
            r5 = r12
            X.MDc r5 = (X.MDc) r5
            int r0 = r5.A05
            if (r0 != r7) goto L_0x0060
            int r2 = r5.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r5.A02 = r2
        L_0x0017:
            java.lang.Object r1 = r5.A04
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A02
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r3) goto L_0x0066
            int r12 = r5.A01
            int r8 = r5.A00
            java.lang.Object r6 = r5.A03
            int[] r6 = (int[]) r6
            X.0eS.A00(r1)
        L_0x002d:
            android.graphics.Bitmap r5 = X.AnonymousClass7TF.A0B(r8, r12)
            r9 = r7
            r10 = r7
            r11 = r8
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x0038:
            X.0eS.A00(r1)
            int r8 = r11.getWidth()
            int r12 = r11.getHeight()
            int[] r6 = A0F(r11)
            X.2HY r2 = X.C229632nm.A0C(r7, r8)
            r1 = 6
            X.Iwt r0 = new X.Iwt
            r0.<init>(r6, r8, r12, r1)
            r5.A03 = r6
            r5.A00 = r8
            r5.A01 = r12
            r5.A02 = r3
            java.lang.Object r0 = A0A(r5, r0, r2)
            if (r0 != r4) goto L_0x002d
            return r4
        L_0x0060:
            X.MDc r5 = new X.MDc
            r5.<init>((int) r7, (X.AnonymousClass4D7) r12)
            goto L_0x0017
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A05(android.graphics.Bitmap, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDc, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(android.graphics.Bitmap r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = 1
            boolean r0 = r10 instanceof X.MDc
            if (r0 == 0) goto L_0x005a
            r7 = r10
            X.MDc r7 = (X.MDc) r7
            int r0 = r7.A05
            if (r0 != r8) goto L_0x005a
            int r2 = r7.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005a
            int r2 = r2 - r1
            r7.A02 = r2
        L_0x0017:
            java.lang.Object r1 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A02
            if (r0 == 0) goto L_0x0031
            if (r0 != r8) goto L_0x0060
            int r5 = r7.A01
            int r3 = r7.A00
            java.lang.Object r4 = r7.A03
            int[] r4 = (int[]) r4
            X.0eS.A00(r1)
        L_0x002c:
            android.graphics.Bitmap r6 = A01(r4, r3, r5)
            return r6
        L_0x0031:
            X.0eS.A00(r1)
            int[] r4 = A0F(r9)
            int r3 = r9.getWidth()
            int r5 = r9.getHeight()
            r0 = 0
            X.2HY r2 = X.C229632nm.A0C(r0, r3)
            r1 = 7
            X.Iwt r0 = new X.Iwt
            r0.<init>(r4, r3, r5, r1)
            r7.A03 = r4
            r7.A00 = r3
            r7.A01 = r5
            r7.A02 = r8
            java.lang.Object r0 = A0A(r7, r0, r2)
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x005a:
            X.MDc r7 = new X.MDc
            r7.<init>((int) r8, (X.AnonymousClass4D7) r10)
            goto L_0x0017
        L_0x0060:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A06(android.graphics.Bitmap, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDd, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (((X.MDd) r12).A06 != 3) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A07(android.graphics.Bitmap r11, X.AnonymousClass4D7 r12, float r13, int r14) {
        /*
            r3 = 3
            boolean r0 = r12 instanceof X.MDd
            if (r0 == 0) goto L_0x000d
            r0 = r12
            X.MDd r0 = (X.MDd) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r3) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0036
            r7 = r12
            X.MDd r7 = (X.MDd) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r7.A01 = r2
        L_0x001e:
            java.lang.Object r8 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A01
            r5 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r5) goto L_0x003c
            int r4 = r7.A00
            boolean r2 = r7.A05
            java.lang.Object r3 = r7.A03
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r7.A02
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            goto L_0x00a9
        L_0x0036:
            X.MDd r7 = new X.MDd
            r7.<init>((int) r3, (X.AnonymousClass4D7) r12)
            goto L_0x001e
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0041:
            X.0eS.A00(r8)
            java.lang.String r3 = "dilateScaled"
            boolean r2 = A0E()
            X.2SP r0 = X.2SP.A01
            int r4 = r0.A03()
            if (r2 == 0) goto L_0x0055
            X.0lq.A03(r3, r4)
        L_0x0055:
            int r0 = X.JTT.A03(r11)     // Catch:{ all -> 0x00c3 }
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r14) goto L_0x006b
            float r1 = (float) r14     // Catch:{ all -> 0x00c3 }
            int r0 = X.JTT.A03(r11)     // Catch:{ all -> 0x00c3 }
            float r0 = (float) r0     // Catch:{ all -> 0x00c3 }
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch:{ all -> 0x00c3 }
            double r0 = java.lang.Math.sqrt(r0)     // Catch:{ all -> 0x00c3 }
            float r8 = (float) r0     // Catch:{ all -> 0x00c3 }
            goto L_0x006d
        L_0x006b:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x006d:
            r9 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r9 = r11
            goto L_0x008d
        L_0x0079:
            float r0 = X.JTO.A02(r11)     // Catch:{ all -> 0x00c3 }
            int r1 = X.AnonymousClass7TE.A06(r0, r8)     // Catch:{ all -> 0x00c3 }
            float r0 = X.JTO.A01(r11)     // Catch:{ all -> 0x00c3 }
            int r0 = X.AnonymousClass7TE.A06(r0, r8)     // Catch:{ all -> 0x00c3 }
            android.graphics.Bitmap r9 = X.0fO.A00(r11, r1, r0, r9)     // Catch:{ all -> 0x00c3 }
        L_0x008d:
            X.0qQ.A0A(r9)     // Catch:{ all -> 0x00c3 }
            float r13 = r13 * r8
            double r0 = (double) r13     // Catch:{ all -> 0x00c3 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x00c3 }
            float r8 = (float) r0     // Catch:{ all -> 0x00c3 }
            int r0 = (int) r8     // Catch:{ all -> 0x00c3 }
            r7.A02 = r11     // Catch:{ all -> 0x00c3 }
            r7.A03 = r3     // Catch:{ all -> 0x00c3 }
            r7.A05 = r2     // Catch:{ all -> 0x00c3 }
            r7.A00 = r4     // Catch:{ all -> 0x00c3 }
            r7.A01 = r5     // Catch:{ all -> 0x00c3 }
            java.lang.Object r8 = A08(r9, r7, r0)     // Catch:{ all -> 0x00c3 }
            if (r8 != r6) goto L_0x00ac
            return r6
        L_0x00a9:
            X.0eS.A00(r8)     // Catch:{ all -> 0x00c3 }
        L_0x00ac:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch:{ all -> 0x00c3 }
            int r1 = r11.getWidth()     // Catch:{ all -> 0x00c3 }
            int r0 = r11.getHeight()     // Catch:{ all -> 0x00c3 }
            android.graphics.Bitmap r6 = X.0fO.A00(r8, r1, r0, r5)     // Catch:{ all -> 0x00c3 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00c2
            X.0lq.A04(r3, r4)
        L_0x00c2:
            return r6
        L_0x00c3:
            r0 = move-exception
            if (r2 == 0) goto L_0x00c9
            X.0lq.A04(r3, r4)
        L_0x00c9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A07(android.graphics.Bitmap, X.4D7, float, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDd, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (((X.MDd) r10).A06 != 2) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A08(android.graphics.Bitmap r9, X.AnonymousClass4D7 r10, int r11) {
        /*
            r3 = 2
            boolean r0 = r10 instanceof X.MDd
            if (r0 == 0) goto L_0x000d
            r0 = r10
            X.MDd r0 = (X.MDd) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r3) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0036
            r8 = r10
            X.MDd r8 = (X.MDd) r8
            int r2 = r8.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r8.A01 = r2
        L_0x001e:
            java.lang.Object r2 = r8.A04
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A01
            r6 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r6) goto L_0x003c
            int r5 = r8.A00
            boolean r3 = r8.A05
            java.lang.Object r4 = r8.A03
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r8.A02
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            goto L_0x0072
        L_0x0036:
            X.MDd r8 = new X.MDd
            r8.<init>((int) r3, (X.AnonymousClass4D7) r10)
            goto L_0x001e
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0041:
            X.0eS.A00(r2)
            java.lang.String r4 = "Bitmap.dilateBitmap"
            boolean r3 = A0E()
            X.2SP r0 = X.2SP.A01
            int r5 = r0.A03()
            if (r3 == 0) goto L_0x0055
            X.0lq.A03(r4, r5)
        L_0x0055:
            int[] r2 = A0F(r9)     // Catch:{ all -> 0x0089 }
            int r1 = r9.getWidth()     // Catch:{ all -> 0x0089 }
            int r0 = r9.getHeight()     // Catch:{ all -> 0x0089 }
            r8.A02 = r9     // Catch:{ all -> 0x0089 }
            r8.A03 = r4     // Catch:{ all -> 0x0089 }
            r8.A05 = r3     // Catch:{ all -> 0x0089 }
            r8.A00 = r5     // Catch:{ all -> 0x0089 }
            r8.A01 = r6     // Catch:{ all -> 0x0089 }
            java.lang.Object r2 = A0C(r8, r2, r1, r0, r11)     // Catch:{ all -> 0x0089 }
            if (r2 != r7) goto L_0x0075
            return r7
        L_0x0072:
            X.0eS.A00(r2)     // Catch:{ all -> 0x0089 }
        L_0x0075:
            int[] r2 = (int[]) r2     // Catch:{ all -> 0x0089 }
            int r1 = r9.getWidth()     // Catch:{ all -> 0x0089 }
            int r0 = r9.getHeight()     // Catch:{ all -> 0x0089 }
            android.graphics.Bitmap r7 = A01(r2, r1, r0)     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x0088
            X.0lq.A04(r4, r5)
        L_0x0088:
            return r7
        L_0x0089:
            r0 = move-exception
            if (r3 == 0) goto L_0x008f
            X.0lq.A04(r4, r5)
        L_0x008f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A08(android.graphics.Bitmap, X.4D7, int):java.lang.Object");
    }

    public static final Object A0B(AnonymousClass4D7 r6, 0sP r7, 2HY r8, int i) {
        MPA A002 = MPA.A00(r7, 0);
        2HY r4 = r8;
        int A012 = 00k.A01(r8);
        if (i < 1) {
            i = 1;
        }
        Object A003 = 19E.A00(r6, new C66176MGn(JTP.A0U(AnonymousClass12T.A00, 585987666), (AnonymousClass4D7) null, (0sP) A002, r4, A012 / i));
        1Hj r0 = 1Hj.A02;
        if (A003 != r0) {
            A003 = C60340gF.A00;
        }
        if (A003 != r0) {
            return C60340gF.A00;
        }
        return A003;
    }

    public static final int[] A0F(Bitmap bitmap) {
        int[] iArr = new int[JTT.A03(bitmap)];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return iArr;
    }

    public static final Bitmap A01(int[] iArr, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        0qQ.A07(createBitmap);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MDG, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[Catch:{ all -> 0x00af }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A09(android.graphics.Bitmap r10, X.AnonymousClass4D7 r11, int r12) {
        /*
            boolean r0 = r11 instanceof X.MDG
            if (r0 == 0) goto L_0x002d
            r8 = r11
            X.MDG r8 = (X.MDG) r8
            int r2 = r8.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r8.A02 = r2
        L_0x0012:
            java.lang.Object r2 = r8.A06
            X.1Hj r9 = X.1Hj.A02
            int r0 = r8.A02
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r6) goto L_0x0038
            if (r0 != r7) goto L_0x0033
            int r5 = r8.A00
            boolean r4 = r8.A05
            java.lang.Object r3 = r8.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r8.A03
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L_0x0098
        L_0x002d:
            X.MDG r8 = new X.MDG
            r8.<init>(r11)
            goto L_0x0012
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0038:
            int r5 = r8.A01
            boolean r4 = r8.A05
            int r12 = r8.A00
            java.lang.Object r3 = r8.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r8.A03
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            goto L_0x007a
        L_0x0047:
            X.0eS.A00(r2)
            java.lang.String r3 = "Bitmap.dilateErode"
            boolean r4 = A0E()
            X.2SP r0 = X.2SP.A01
            int r5 = r0.A03()
            if (r4 == 0) goto L_0x005b
            X.0lq.A03(r3, r5)
        L_0x005b:
            int[] r2 = A0F(r10)     // Catch:{ all -> 0x00af }
            int r1 = r10.getWidth()     // Catch:{ all -> 0x00af }
            int r0 = r10.getHeight()     // Catch:{ all -> 0x00af }
            r8.A03 = r10     // Catch:{ all -> 0x00af }
            r8.A04 = r3     // Catch:{ all -> 0x00af }
            r8.A00 = r12     // Catch:{ all -> 0x00af }
            r8.A05 = r4     // Catch:{ all -> 0x00af }
            r8.A01 = r5     // Catch:{ all -> 0x00af }
            r8.A02 = r6     // Catch:{ all -> 0x00af }
            java.lang.Object r2 = A0C(r8, r2, r1, r0, r12)     // Catch:{ all -> 0x00af }
            if (r2 != r9) goto L_0x007d
            return r9
        L_0x007a:
            X.0eS.A00(r2)     // Catch:{ all -> 0x00af }
        L_0x007d:
            int[] r2 = (int[]) r2     // Catch:{ all -> 0x00af }
            int r1 = r10.getWidth()     // Catch:{ all -> 0x00af }
            int r0 = r10.getHeight()     // Catch:{ all -> 0x00af }
            r8.A03 = r10     // Catch:{ all -> 0x00af }
            r8.A04 = r3     // Catch:{ all -> 0x00af }
            r8.A05 = r4     // Catch:{ all -> 0x00af }
            r8.A00 = r5     // Catch:{ all -> 0x00af }
            r8.A02 = r7     // Catch:{ all -> 0x00af }
            java.lang.Object r2 = A0D(r8, r2, r1, r0, r12)     // Catch:{ all -> 0x00af }
            if (r2 != r9) goto L_0x009b
            return r9
        L_0x0098:
            X.0eS.A00(r2)     // Catch:{ all -> 0x00af }
        L_0x009b:
            int[] r2 = (int[]) r2     // Catch:{ all -> 0x00af }
            int r1 = r10.getWidth()     // Catch:{ all -> 0x00af }
            int r0 = r10.getHeight()     // Catch:{ all -> 0x00af }
            android.graphics.Bitmap r9 = A01(r2, r1, r0)     // Catch:{ all -> 0x00af }
            if (r4 == 0) goto L_0x00ae
            X.0lq.A04(r3, r5)
        L_0x00ae:
            return r9
        L_0x00af:
            r0 = move-exception
            if (r4 == 0) goto L_0x00b5
            X.0lq.A04(r3, r5)
        L_0x00b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A09(android.graphics.Bitmap, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDT, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (((X.MDT) r3).A0B != 0) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed A[Catch:{ all -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A0C(X.AnonymousClass4D7 r16, int[] r17, int r18, int r19, int r20) {
        /*
            r11 = r17
            r14 = r18
            r13 = r19
            r7 = r20
            r6 = 0
            r3 = r16
            boolean r0 = r3 instanceof X.MDT
            if (r0 == 0) goto L_0x0017
            r0 = r3
            X.MDT r0 = (X.MDT) r0
            int r1 = r0.A0B
            r0 = 1
            if (r1 == r6) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x004f
            r5 = r3
            X.MDT r5 = (X.MDT) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0028:
            java.lang.Object r9 = r5.A09
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0077
            if (r1 == r8) goto L_0x005e
            if (r1 != r0) goto L_0x0059
            int r0 = r5.A05
            int r1 = r5.A04
            boolean r2 = r5.A0A
            int r7 = r5.A03
            int r13 = r5.A02
            int r14 = r5.A01
            java.lang.Object r12 = r5.A08
            int[] r12 = (int[]) r12
            java.lang.Object r3 = r5.A07
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r5.A06
            int[] r11 = (int[]) r11
            goto L_0x0055
        L_0x004f:
            X.MDT r5 = new X.MDT
            r5.<init>(r6, r3)
            goto L_0x0028
        L_0x0055:
            X.0eS.A00(r9)     // Catch:{ all -> 0x00f6 }
            goto L_0x0093
        L_0x0059:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x005e:
            int r0 = r5.A05
            int r1 = r5.A04
            boolean r2 = r5.A0A
            int r7 = r5.A03
            int r13 = r5.A02
            int r14 = r5.A01
            java.lang.Object r12 = r5.A08
            int[] r12 = (int[]) r12
            java.lang.Object r3 = r5.A07
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r11 = r5.A06
            int[] r11 = (int[]) r11
            goto L_0x00bc
        L_0x0077:
            X.0eS.A00(r9)
            java.lang.String r3 = "dilate"
            boolean r2 = A0E()
            X.2SP r0 = X.2SP.A01
            int r1 = r0.A03()
            if (r2 == 0) goto L_0x008b
            X.0lq.A03(r3, r1)
        L_0x008b:
            java.lang.Object r12 = r11.clone()     // Catch:{ all -> 0x00f6 }
            int[] r12 = (int[]) r12     // Catch:{ all -> 0x00f6 }
            r0 = 0
            goto L_0x0095
        L_0x0093:
            int r0 = r0 + 1
        L_0x0095:
            if (r0 >= r7) goto L_0x00f0
            X.2HY r9 = X.C229632nm.A0C(r6, r14)     // Catch:{ all -> 0x00f6 }
            r15 = 5
            X.J6Y r10 = new X.J6Y     // Catch:{ all -> 0x00f6 }
            r10.<init>((int[]) r11, (int[]) r12, (int) r13, (int) r14, (int) r15)     // Catch:{ all -> 0x00f6 }
            r5.A06 = r11     // Catch:{ all -> 0x00f6 }
            r5.A07 = r3     // Catch:{ all -> 0x00f6 }
            r5.A08 = r12     // Catch:{ all -> 0x00f6 }
            r5.A01 = r14     // Catch:{ all -> 0x00f6 }
            r5.A02 = r13     // Catch:{ all -> 0x00f6 }
            r5.A03 = r7     // Catch:{ all -> 0x00f6 }
            r5.A0A = r2     // Catch:{ all -> 0x00f6 }
            r5.A04 = r1     // Catch:{ all -> 0x00f6 }
            r5.A05 = r0     // Catch:{ all -> 0x00f6 }
            r5.A00 = r8     // Catch:{ all -> 0x00f6 }
            java.lang.Object r9 = A0A(r5, r10, r9)     // Catch:{ all -> 0x00f6 }
            if (r9 != r4) goto L_0x00bf
            goto L_0x00ee
        L_0x00bc:
            X.0eS.A00(r9)     // Catch:{ all -> 0x00f6 }
        L_0x00bf:
            X.2HY r9 = X.C229632nm.A0C(r6, r14)     // Catch:{ all -> 0x00f6 }
            r20 = 6
            X.J6Y r15 = new X.J6Y     // Catch:{ all -> 0x00f6 }
            r16 = r12
            r17 = r11
            r18 = r13
            r19 = r14
            r15.<init>((int[]) r16, (int[]) r17, (int) r18, (int) r19, (int) r20)     // Catch:{ all -> 0x00f6 }
            r5.A06 = r11     // Catch:{ all -> 0x00f6 }
            r5.A07 = r3     // Catch:{ all -> 0x00f6 }
            r5.A08 = r12     // Catch:{ all -> 0x00f6 }
            r5.A01 = r14     // Catch:{ all -> 0x00f6 }
            r5.A02 = r13     // Catch:{ all -> 0x00f6 }
            r5.A03 = r7     // Catch:{ all -> 0x00f6 }
            r5.A0A = r2     // Catch:{ all -> 0x00f6 }
            r5.A04 = r1     // Catch:{ all -> 0x00f6 }
            r5.A05 = r0     // Catch:{ all -> 0x00f6 }
            r10 = 2
            r5.A00 = r10     // Catch:{ all -> 0x00f6 }
            java.lang.Object r9 = A0A(r5, r15, r9)     // Catch:{ all -> 0x00f6 }
            if (r9 != r4) goto L_0x0093
            goto L_0x00ef
        L_0x00ee:
            return r4
        L_0x00ef:
            return r4
        L_0x00f0:
            if (r2 == 0) goto L_0x00f5
            X.0lq.A04(r3, r1)
        L_0x00f5:
            return r11
        L_0x00f6:
            r0 = move-exception
            if (r2 == 0) goto L_0x00fc
            X.0lq.A04(r3, r1)
        L_0x00fc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A0C(X.4D7, int[], int, int, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDT, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (((X.MDT) r15).A0B != 1) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A0D(X.AnonymousClass4D7 r15, int[] r16, int r17, int r18, int r19) {
        /*
            r14 = r17
            r13 = r18
            r11 = r16
            r8 = r19
            r7 = 1
            boolean r0 = r15 instanceof X.MDT
            if (r0 == 0) goto L_0x0015
            r0 = r15
            X.MDT r0 = (X.MDT) r0
            int r1 = r0.A0B
            r0 = 1
            if (r1 == r7) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x004a
            r6 = r15
            X.MDT r6 = (X.MDT) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0026:
            java.lang.Object r10 = r6.A09
            X.1Hj r9 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 0
            if (r0 == 0) goto L_0x0059
            if (r0 != r7) goto L_0x0054
            int r1 = r6.A05
            int r2 = r6.A04
            boolean r3 = r6.A0A
            int r8 = r6.A03
            int r13 = r6.A02
            int r14 = r6.A01
            java.lang.Object r12 = r6.A08
            int[] r12 = (int[]) r12
            java.lang.Object r4 = r6.A07
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r6.A06
            int[] r11 = (int[]) r11
            goto L_0x0050
        L_0x004a:
            X.MDT r6 = new X.MDT
            r6.<init>(r7, r15)
            goto L_0x0026
        L_0x0050:
            X.0eS.A00(r10)     // Catch:{ all -> 0x00ad }
            goto L_0x009b
        L_0x0054:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0059:
            X.0eS.A00(r10)
            java.lang.String r4 = "erode"
            boolean r3 = A0E()
            X.2SP r0 = X.2SP.A01
            int r2 = r0.A03()
            if (r3 == 0) goto L_0x006d
            X.0lq.A03(r4, r2)
        L_0x006d:
            java.lang.Object r12 = r11.clone()     // Catch:{ all -> 0x00ad }
            int[] r12 = (int[]) r12     // Catch:{ all -> 0x00ad }
            r1 = 0
        L_0x0074:
            if (r1 >= r8) goto L_0x00a7
            X.2HY r0 = X.C229632nm.A0C(r5, r14)     // Catch:{ all -> 0x00ad }
            r15 = 7
            X.J6Y r10 = new X.J6Y     // Catch:{ all -> 0x00ad }
            r10.<init>((int[]) r11, (int[]) r12, (int) r13, (int) r14, (int) r15)     // Catch:{ all -> 0x00ad }
            r6.A06 = r11     // Catch:{ all -> 0x00ad }
            r6.A07 = r4     // Catch:{ all -> 0x00ad }
            r6.A08 = r12     // Catch:{ all -> 0x00ad }
            r6.A01 = r14     // Catch:{ all -> 0x00ad }
            r6.A02 = r13     // Catch:{ all -> 0x00ad }
            r6.A03 = r8     // Catch:{ all -> 0x00ad }
            r6.A0A = r3     // Catch:{ all -> 0x00ad }
            r6.A04 = r2     // Catch:{ all -> 0x00ad }
            r6.A05 = r1     // Catch:{ all -> 0x00ad }
            r6.A00 = r7     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = A0A(r6, r10, r0)     // Catch:{ all -> 0x00ad }
            if (r0 != r9) goto L_0x009b
            goto L_0x00a6
        L_0x009b:
            int r0 = r8 + -1
            if (r1 >= r0) goto L_0x00a3
            int r0 = r12.length     // Catch:{ all -> 0x00ad }
            X.0Yw.A0T(r12, r11, r5, r5, r0)     // Catch:{ all -> 0x00ad }
        L_0x00a3:
            int r1 = r1 + 1
            goto L_0x0074
        L_0x00a6:
            return r9
        L_0x00a7:
            if (r3 == 0) goto L_0x00ac
            X.0lq.A04(r4, r2)
        L_0x00ac:
            return r12
        L_0x00ad:
            r0 = move-exception
            if (r3 == 0) goto L_0x00b3
            X.0lq.A04(r4, r2)
        L_0x00b3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageutils.MaskUtilsKt.A0D(X.4D7, int[], int, int, int):java.lang.Object");
    }

    public static boolean A0E() {
        return Systrace.A0E(1);
    }

    public static Object A0A(AnonymousClass4D7 r1, 0sP r2, 2HY r3) {
        return A0B(r1, r2, r3, Runtime.getRuntime().availableProcessors());
    }
}
