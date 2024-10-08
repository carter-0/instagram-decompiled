package X;

import android.content.Context;

public final class QOP extends C268764dx {
    public final int A00;
    public final int A01 = 3;
    public final Context A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r6 > 25) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QOP(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 3
            r4.<init>()
            r4.A00 = r6
            r4.A02 = r5
            r4.A01 = r0
            r3 = 1
            if (r6 <= 0) goto L_0x0012
            r1 = 25
            r0 = 1
            if (r6 <= r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            X.Pxe.A1Z(r0)
            r2 = 0
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r6)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "IntrinsicBlur;%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.0qQ.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QOP.<init>(android.content.Context, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r6 > 25) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.graphics.Bitmap r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            android.content.Context r2 = r7.A02
            int r6 = r7.A00
            r0 = 2
            X.0qQ.A0B(r2, r0)
            if (r6 <= 0) goto L_0x0013
            r1 = 25
            r0 = 1
            if (r6 <= r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            X.Pxe.A1Z(r0)
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L_0x005c
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x0057 }
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r5, r0)     // Catch:{ all -> 0x0057 }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r5, r9)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0052
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r8)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x004d
            float r0 = (float) r6     // Catch:{ all -> 0x0057 }
            r3.setRadius(r0)     // Catch:{ all -> 0x0057 }
            r3.setInput(r2)     // Catch:{ all -> 0x0057 }
            r3.forEach(r1)     // Catch:{ all -> 0x0057 }
            r1.copyTo(r8)     // Catch:{ all -> 0x0057 }
            r3.destroy()     // Catch:{ all -> 0x0057 }
            r2.destroy()     // Catch:{ all -> 0x0057 }
            r1.destroy()     // Catch:{ all -> 0x0057 }
            r5.destroy()
            return
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)     // Catch:{ all -> 0x0057 }
            goto L_0x0056
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)     // Catch:{ all -> 0x0057 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r5.destroy()
            throw r0
        L_0x005c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QOP.A02(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003b, code lost:
        if (r7 > 25) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.graphics.Bitmap r25) {
        /*
            r24 = this;
            r21 = 0
            r23 = r25
            r1 = r23
            r0 = r21
            X.0qQ.A0B(r1, r0)
            r1 = r24
            int r0 = r1.A01
            r22 = r0
            int r7 = r1.A00
            boolean r0 = r23.isMutable()
            X.Pxe.A1Z(r0)
            float r0 = X.JTO.A01(r23)
            r1 = 1157627904(0x45000000, float:2048.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            X.Pxe.A1Z(r0)
            float r0 = X.JTO.A02(r23)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            boolean r0 = X.Dba.A1U(r0)
            X.Pxe.A1Z(r0)
            if (r7 <= 0) goto L_0x003d
            r1 = 25
            r0 = 1
            if (r7 <= r1) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            X.Pxe.A1Z(r0)
            boolean r0 = X.AnonymousClass7TF.A1R(r22)
            X.Pxe.A1Z(r0)
            int r9 = r23.getWidth()     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r8 = r23.getHeight()     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r9 * r8
            int[] r6 = new int[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
            r10 = r23
            r11 = r6
            r12 = r21
            r13 = r9
            r14 = r12
            r15 = r12
            r16 = r9
            r17 = r8
            r10.getPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r2 = r7 + 1
            int r5 = r2 + r7
            int r0 = r5 * 256
            int[] r4 = new int[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
            r1 = 1
        L_0x006c:
            r0 = 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 < r0) goto L_0x0072
            goto L_0x007e
        L_0x0072:
            if (r3 >= r5) goto L_0x007b
            r4[r2] = r1     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L_0x0072
        L_0x007b:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x007e:
            int r0 = java.lang.Math.max(r9, r8)     // Catch:{ OutOfMemoryError -> 0x0198 }
            int[] r2 = new int[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
        L_0x0084:
            r0 = r22
            if (r3 >= r0) goto L_0x0188
            r12 = 0
        L_0x0089:
            r10 = 0
            if (r12 >= r8) goto L_0x0105
            int r14 = r9 * r12
            int r0 = r12 + 1
            int r0 = r0 * r9
            int r13 = r0 + -1
            int r11 = r5 >> 1
            int r1 = -r11
            int r20 = r9 + r11
            r19 = 0
            r18 = 0
            r17 = 0
        L_0x009e:
            r0 = r20
            if (r1 >= r0) goto L_0x00fb
            int r0 = r14 + r1
            if (r0 >= r14) goto L_0x00a8
            r0 = r14
            goto L_0x00ab
        L_0x00a8:
            if (r0 <= r13) goto L_0x00ab
            r0 = r13
        L_0x00ab:
            r15 = r6[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r15 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r0
            int r0 = r15 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r18 = r18 + r0
            r0 = r15 & 255(0xff, float:3.57E-43)
            int r17 = r17 + r0
            int r0 = r15 >>> 24
            int r10 = r10 + r0
            if (r1 < r11) goto L_0x00f8
            int r16 = r1 - r11
            r0 = r4[r10]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r15 = r0 << 24
            r0 = r4[r19]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r0 << 16
            r15 = r15 | r0
            r0 = r4[r18]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r0 << 8
            r15 = r15 | r0
            r0 = r4[r17]     // Catch:{ OutOfMemoryError -> 0x0198 }
            r15 = r15 | r0
            r2[r16] = r15     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r5 + -1
            int r0 = r1 - r0
            int r0 = r0 + r14
            if (r0 >= r14) goto L_0x00e0
            r0 = r14
            goto L_0x00e3
        L_0x00e0:
            if (r0 <= r13) goto L_0x00e3
            r0 = r13
        L_0x00e3:
            r15 = r6[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r15 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r19 = r19 - r0
            int r0 = r15 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r18 = r18 - r0
            r0 = r15 & 255(0xff, float:3.57E-43)
            int r17 = r17 - r0
            int r0 = r15 >>> 24
            int r10 = r10 - r0
        L_0x00f8:
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00fb:
            int r1 = r12 * r9
            r0 = r21
            java.lang.System.arraycopy(r2, r0, r6, r1, r9)     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r12 = r12 + 1
            goto L_0x0089
        L_0x0105:
            if (r10 >= r9) goto L_0x0184
            r20 = r10
            int r11 = r8 + -1
            int r11 = r11 * r9
            int r11 = r11 + r10
            int r19 = r5 >> 1
            int r19 = r19 * r9
            int r18 = r5 + -1
            int r18 = r18 * r9
            int r1 = r10 - r19
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
        L_0x011e:
            int r0 = r11 + r19
            if (r1 > r0) goto L_0x0176
            r0 = r1
            if (r1 >= r10) goto L_0x0127
            r0 = r10
            goto L_0x012a
        L_0x0127:
            if (r1 <= r11) goto L_0x012a
            r0 = r11
        L_0x012a:
            r12 = r6[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r12 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r17 = r17 + r0
            int r0 = r12 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r16 = r16 + r0
            r0 = r12 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r0
            int r0 = r12 >>> 24
            int r14 = r14 + r0
            int r0 = r1 - r19
            if (r0 < r10) goto L_0x0174
            r0 = r4[r14]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r12 = r0 << 24
            r0 = r4[r17]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r0 << 16
            r12 = r12 | r0
            r0 = r4[r16]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r0 << 8
            r12 = r12 | r0
            r0 = r4[r15]     // Catch:{ OutOfMemoryError -> 0x0198 }
            r12 = r12 | r0
            r2[r13] = r12     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r13 = r13 + 1
            int r0 = r1 - r18
            if (r0 >= r10) goto L_0x015d
            r0 = r10
            goto L_0x0160
        L_0x015d:
            if (r0 <= r11) goto L_0x0160
            r0 = r11
        L_0x0160:
            r12 = r6[r0]     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r0 = r12 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r17 = r17 - r0
            int r0 = r12 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r16 = r16 - r0
            r0 = r12 & 255(0xff, float:3.57E-43)
            int r15 = r15 - r0
            int r0 = r12 >>> 24
            int r14 = r14 - r0
        L_0x0174:
            int r1 = r1 + r9
            goto L_0x011e
        L_0x0176:
            r1 = 0
        L_0x0177:
            if (r1 >= r8) goto L_0x0181
            r0 = r2[r1]     // Catch:{ OutOfMemoryError -> 0x0198 }
            r6[r10] = r0     // Catch:{ OutOfMemoryError -> 0x0198 }
            int r10 = r10 + r9
            int r1 = r1 + 1
            goto L_0x0177
        L_0x0181:
            int r10 = r20 + 1
            goto L_0x0105
        L_0x0184:
            int r3 = r3 + 1
            goto L_0x0084
        L_0x0188:
            r10 = r23
            r11 = r6
            r12 = r21
            r13 = r9
            r14 = r12
            r15 = r12
            r16 = r9
            r17 = r8
            r10.setPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ OutOfMemoryError -> 0x0198 }
            return
        L_0x0198:
            r6 = move-exception
            r5 = 0
            r4 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            int r0 = r23.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r23.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r1, r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r4)
            java.lang.String r0 = "OOM: %d iterations on %dx%d with %d radius"
            java.lang.String r1 = X.Pxe.A12(r5, r0, r1)
            java.lang.String r0 = "IterativeBoxBlurFilter"
            X.0I1.A03(r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QOP.A01(android.graphics.Bitmap):void");
    }
}
