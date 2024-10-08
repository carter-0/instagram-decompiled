package X;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.2hx  reason: invalid class name and case insensitive filesystem */
public final class C226852hx {
    public ValueAnimator A00;
    public ColorFilter A01;
    public Rect A02;
    public C226672hf A03;
    public C226902i9 A04;
    public 0sP A05;
    public C62320sa A06;
    public C62320sa A07;
    public final ValueAnimator.AnimatorUpdateListener A08;
    public final Paint A09;
    public final C226862hy A0A;

    public final void A00(int i) {
        this.A09.setAlpha(i);
        C62320sa r0 = this.A07;
        if (r0 != null) {
            r0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.IxG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: X.TYA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.Iwy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.IxG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.IxG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: X.IxG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.graphics.ColorFilter r22, android.graphics.Rect r23, X.C240573Lk r24, X.C226672hf r25, X.C226902i9 r26) {
        /*
            r21 = this;
            r7 = r21
            r1 = r26
            X.2i9 r0 = r7.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            r6 = 0
            if (r0 != 0) goto L_0x002b
            X.2i9 r0 = r7.A04
            if (r0 == 0) goto L_0x0017
            r0.A04()
            r0.A05(r6)
        L_0x0017:
            if (r26 == 0) goto L_0x01c8
            X.0sa r0 = r7.A06
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r0.invoke()
            android.graphics.drawable.Drawable$Callback r0 = (android.graphics.drawable.Drawable.Callback) r0
        L_0x0023:
            r1.A05(r0)
            r1.A03()
        L_0x0029:
            r7.A04 = r1
        L_0x002b:
            r0 = r25
            r7.A03 = r0
            r14 = r23
            r7.A02 = r14
            r0 = r22
            r7.A01 = r0
            X.2hy r10 = r7.A0A
            r1 = r24
            r10.A01 = r1
            r7.A05 = r6
            if (r23 == 0) goto L_0x004a
            r5 = 255(0xff, float:3.57E-43)
            X.2i9 r9 = r7.A04
            if (r9 != 0) goto L_0x004b
            r13 = 0
        L_0x0048:
            r7.A05 = r13
        L_0x004a:
            return
        L_0x004b:
            r7.A02 = r14
            int r8 = r9.A02()
            int r4 = r9.A01()
            r13 = 0
            if (r8 <= 0) goto L_0x0089
            if (r4 <= 0) goto L_0x0089
            if (r24 == 0) goto L_0x0089
            android.graphics.Matrix r13 = r10.A02
            r0 = 0
            X.0qQ.A0B(r13, r0)
            X.1U5 r12 = r1.A01
            android.graphics.PointF r0 = r1.A00
            if (r0 == 0) goto L_0x01bf
            float r15 = r0.x
            float r3 = r0.y
        L_0x006c:
            X.1U7 r12 = (X.AnonymousClass1U7) r12
            int r0 = r14.width()
            float r2 = (float) r0
            float r0 = (float) r8
            float r2 = r2 / r0
            int r0 = r14.height()
            float r1 = (float) r0
            float r0 = (float) r4
            float r1 = r1 / r0
            r17 = r2
            r18 = r1
            r19 = r8
            r20 = r4
            r16 = r3
            r12.A00(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0089:
            r10.A00 = r13
            android.graphics.Paint r4 = r7.A09
            android.graphics.ColorFilter r0 = r7.A01
            r4.setColorFilter(r0)
            int r0 = r9.A00()
            r4.setFlags(r0)
            X.2hf r2 = r7.A03
            android.graphics.Matrix r8 = r10.A00
            r3 = 0
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>(r14)
            float r0 = r3 + r3
            float r13 = -r0
            if (r2 == 0) goto L_0x01b8
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0173
            float r12 = r11.centerX()
            float r10 = r11.centerY()
            float r1 = r11.width()
            float r0 = r11.height()
            float r11 = java.lang.Math.min(r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r0
            boolean r0 = r2.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.3OH r0 = new X.3OH
            r0.<init>(r1, r12, r10, r11)
        L_0x00ce:
            boolean r1 = r9 instanceof X.AnonymousClass3OJ
            if (r1 == 0) goto L_0x0132
            r2 = r9
            X.3OJ r2 = (X.AnonymousClass3OJ) r2
            boolean r1 = r0 instanceof X.AnonymousClass3OL
            if (r1 != 0) goto L_0x0128
            boolean r1 = r0 instanceof X.AnonymousClass3OH
            if (r1 == 0) goto L_0x00e1
            boolean r1 = r2.A03
            if (r1 != 0) goto L_0x0128
        L_0x00e1:
            android.graphics.Bitmap r10 = r2.A02
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r10, r2, r2)
            r4.setShader(r1)
            android.graphics.Shader r1 = r4.getShader()
            r1.setLocalMatrix(r8)
        L_0x00f4:
            r2 = 24
            X.TYA r1 = new X.TYA
            r1.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r4)
        L_0x00fb:
            int r2 = r9.A02()
            if (r2 <= 0) goto L_0x0126
            int r0 = r9.A01()
            if (r0 <= 0) goto L_0x0126
            float r4 = (float) r2
            float r2 = (float) r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3, r3, r4, r2)
            if (r8 == 0) goto L_0x0113
            r8.mapRect(r0)
        L_0x0113:
            r15 = 0
            X.GA0 r13 = new X.GA0
            r16 = r6
            r17 = r0
            r18 = r6
            r19 = r1
            r20 = r14
            r14 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0048
        L_0x0126:
            r0 = r6
            goto L_0x0113
        L_0x0128:
            android.graphics.Bitmap r2 = r2.A02
            r0 = 24
            X.Iwy r1 = new X.Iwy
            r1.<init>(r0, r2, r4, r8)
            goto L_0x00fb
        L_0x0132:
            boolean r1 = r9 instanceof X.AnonymousClass3OK
            if (r1 == 0) goto L_0x0158
            r1 = r9
            X.3OK r1 = (X.AnonymousClass3OK) r1
            int r11 = r1.A00
            int r10 = r4.getAlpha()
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r10 == 0) goto L_0x0156
            if (r10 == r5) goto L_0x0152
            int r1 = r10 >> 7
            int r10 = r10 + r1
            int r1 = r11 >>> 24
            int r1 = r1 * r10
            int r1 = r1 >> 8
            int r1 = r1 << 24
            r11 = r11 & r2
            r11 = r11 | r1
        L_0x0152:
            r4.setColor(r11)
            goto L_0x00f4
        L_0x0156:
            r11 = r11 & r2
            goto L_0x0152
        L_0x0158:
            boolean r1 = r9 instanceof X.AnonymousClass2i8
            if (r1 == 0) goto L_0x01cb
            boolean r1 = r0 instanceof X.AnonymousClass3OL
            r16 = 7
            if (r1 == 0) goto L_0x0164
            r16 = 6
        L_0x0164:
            X.IxG r1 = new X.IxG
            r15 = r1
            r17 = r4
            r18 = r9
            r19 = r0
            r20 = r8
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x00fb
        L_0x0173:
            float r1 = r2.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x017d
            float[] r0 = r2.A03
            if (r0 == 0) goto L_0x01b8
        L_0x017d:
            r12 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01b0
            float[] r10 = r2.A03
            if (r10 == 0) goto L_0x01d1
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x019a
            r0 = 8
            float[] r2 = new float[r0]
            int r1 = r10.length
        L_0x018f:
            if (r12 >= r1) goto L_0x0199
            r0 = r10[r12]
            float r0 = r0 + r13
            r2[r12] = r0
            int r12 = r12 + 1
            goto L_0x018f
        L_0x0199:
            r10 = r2
        L_0x019a:
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r11, r10, r0)
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r1.setFillType(r0)
            X.Gkb r0 = new X.Gkb
            r0.<init>(r1)
            goto L_0x00ce
        L_0x01b0:
            float r1 = r1 + r13
            X.Gkc r0 = new X.Gkc
            r0.<init>(r11, r1, r1)
            goto L_0x00ce
        L_0x01b8:
            X.3OL r0 = new X.3OL
            r0.<init>(r11)
            goto L_0x00ce
        L_0x01bf:
            r15 = 1056964608(0x3f000000, float:0.5)
            r3 = 1056964608(0x3f000000, float:0.5)
            goto L_0x006c
        L_0x01c5:
            r0 = r6
            goto L_0x0023
        L_0x01c8:
            r1 = r6
            goto L_0x0029
        L_0x01cb:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x01d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Malformed rounding options "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226852hx.A01(android.graphics.ColorFilter, android.graphics.Rect, X.3Lk, X.2hf, X.2i9):void");
    }

    public final void A02(boolean z) {
        ValueAnimator valueAnimator;
        this.A0A.A01 = null;
        C226902i9 r0 = this.A04;
        if (r0 != null) {
            r0.A04();
            r0.A05((Drawable.Callback) null);
        }
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A02 = null;
        this.A09.reset();
        this.A01 = null;
        if (z && (valueAnimator = this.A00) != null) {
            valueAnimator.end();
        }
        this.A00 = null;
    }

    public C226852hx(C62320sa r3, C62320sa r4) {
        this.A06 = r3;
        this.A07 = r4;
        this.A0A = new C226862hy((C240573Lk) null);
        this.A09 = new Paint();
        this.A08 = new C226872hz(this);
    }

    public C226852hx() {
        this((C62320sa) null, (C62320sa) null);
    }
}
