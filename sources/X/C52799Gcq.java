package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcq  reason: case insensitive filesystem */
public final class C52799Gcq extends Drawable {
    public static final float[] A0L = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};
    public static final int[] A0M = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public Path A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final RectF A06;
    public final Integer A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint[] A0D;
    public final Paint[] A0E;
    public final Path[] A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;
    public final boolean A0K;

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0125, code lost:
        if (r0.A09 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012a, code lost:
        if (r0.A0A != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0224, code lost:
        if (r0.A09 != false) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0229, code lost:
        if (r0.A0A != false) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Integer r1 = r0.A07
            boolean r1 = X.C56176Hu5.A01(r1)
            r13 = r20
            if (r1 == 0) goto L_0x012e
            r4 = 2
            boolean[] r7 = new boolean[r4]
            boolean r6 = r0.A0B
            r10 = 0
            r7[r10] = r6
            boolean r2 = r0.A08
            r12 = 1
            r7[r12] = r2
            r5 = 0
            r1 = 0
        L_0x001b:
            boolean r3 = r7[r5]
            if (r3 == 0) goto L_0x0021
            int r1 = r1 + 1
        L_0x0021:
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x001b
            r11 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0128
            int r7 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r5 = r9.left
            float r8 = r0.A01
            float r5 = r5 + r8
            float r3 = r9.top
            float r3 = r3 + r8
            r13.translate(r5, r3)
            android.graphics.Path[] r3 = r0.A0F
            r5 = r3[r10]
            android.graphics.Paint[] r3 = r0.A0D
            r3 = r3[r10]
            r13.drawPath(r5, r3)
            r14 = 0
            float r5 = -r8
            float r3 = r0.A02
            float r15 = r5 - r3
            float r16 = r9.width()
            float r8 = r8 * r11
            float r16 = r16 - r8
            android.graphics.Paint[] r3 = r0.A0E
            r18 = r3[r10]
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x005e:
            int r5 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r10 = r8.right
            float r7 = r0.A01
            float r10 = r10 - r7
            float r9 = r8.top
            boolean r3 = X.AnonymousClass7TF.A1P(r6)
            float r3 = (float) r3
            float r3 = r3 * r7
            float r9 = r9 + r3
            r13.translate(r10, r9)
            if (r6 == 0) goto L_0x0082
            android.graphics.Path[] r3 = r0.A0F
            r6 = r3[r12]
            android.graphics.Paint[] r3 = r0.A0D
            r3 = r3[r12]
            r13.drawPath(r6, r3)
        L_0x0082:
            boolean r3 = r0.A0A
            if (r3 == 0) goto L_0x009b
            r14 = 0
            float r3 = r0.A02
            float r16 = r7 + r3
            float r17 = r8.height()
            float r3 = (float) r1
            float r3 = r3 * r7
            float r17 = r17 - r3
            android.graphics.Paint[] r3 = r0.A0E
            r18 = r3[r12]
            r15 = r14
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x009b:
            r13.restoreToCount(r5)
        L_0x009e:
            if (r2 == 0) goto L_0x0123
            int r7 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r5 = r8.right
            float r6 = r0.A01
            float r5 = r5 - r6
            float r3 = r8.bottom
            float r3 = r3 - r6
            r13.translate(r5, r3)
            android.graphics.Path[] r3 = r0.A0F
            r5 = r3[r4]
            android.graphics.Paint[] r3 = r0.A0D
            r3 = r3[r4]
            r13.drawPath(r5, r3)
            float r3 = r8.width()
            float r14 = -r3
            float r11 = r11 * r6
            float r14 = r14 + r11
            r15 = 0
            float r3 = r0.A02
            float r6 = r6 + r3
            android.graphics.Paint[] r3 = r0.A0E
            r18 = r3[r4]
            r16 = r15
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x00d5:
            int r5 = r13.save()
            android.graphics.RectF r7 = r0.A06
            float r8 = r7.left
            float r4 = r0.A01
            float r8 = r8 + r4
            float r6 = r7.bottom
            boolean r3 = X.AnonymousClass7TF.A1P(r2)
            float r3 = (float) r3
            float r3 = r3 * r4
            float r6 = r6 - r3
            r13.translate(r8, r6)
            r6 = 3
            if (r2 == 0) goto L_0x00fa
            android.graphics.Path[] r2 = r0.A0F
            r3 = r2[r6]
            android.graphics.Paint[] r2 = r0.A0D
            r2 = r2[r6]
            r13.drawPath(r3, r2)
        L_0x00fa:
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x0116
            float r14 = -r4
            float r2 = r0.A02
            float r14 = r14 - r2
            r15 = 0
            float r2 = r7.height()
            float r2 = -r2
            float r1 = (float) r1
            float r1 = r1 * r4
            float r2 = r2 + r1
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r6]
            r16 = r15
            r17 = r2
        L_0x0113:
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0116:
            r13.restoreToCount(r5)
        L_0x0119:
            android.graphics.Path r1 = r0.A00
            if (r1 == 0) goto L_0x022d
            android.graphics.Paint r0 = r0.A0I
            r13.drawPath(r1, r0)
            return
        L_0x0123:
            boolean r3 = r0.A09
            if (r3 == 0) goto L_0x0119
            goto L_0x00d5
        L_0x0128:
            boolean r3 = r0.A0A
            if (r3 == 0) goto L_0x009e
            goto L_0x005e
        L_0x012e:
            android.graphics.Path[] r1 = r0.A0F
            r2 = 0
            r4 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0D
            r3 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r2]
            r9 = 2
            boolean[] r8 = new boolean[r9]
            boolean r6 = r0.A0B
            r8[r2] = r6
            boolean r2 = r0.A08
            r1 = 1
            r8[r1] = r2
            r7 = 0
            r1 = 0
        L_0x0149:
            boolean r5 = r8[r7]
            if (r5 == 0) goto L_0x014f
            int r1 = r1 + 1
        L_0x014f:
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x0149
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0227
            int r9 = r13.save()
            android.graphics.RectF r10 = r0.A06
            float r7 = r10.left
            float r8 = r0.A01
            float r7 = r7 + r8
            float r5 = r10.top
            float r5 = r5 + r8
            r13.translate(r7, r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r7 = -r8
            float r5 = r0.A02
            float r15 = r7 - r5
            float r16 = r10.width()
            float r8 = r8 * r12
            float r16 = r16 - r8
            r17 = r7
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r9)
        L_0x0180:
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r11 = r9.right
            float r7 = r0.A01
            float r11 = r11 - r7
            float r10 = r9.top
            boolean r5 = X.AnonymousClass7TF.A1P(r6)
            float r5 = (float) r5
            float r5 = r5 * r7
            float r10 = r10 + r5
            r13.translate(r11, r10)
            r5 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r5)
            if (r6 == 0) goto L_0x01a1
            r13.drawPath(r4, r3)
        L_0x01a1:
            boolean r5 = r0.A0A
            if (r5 == 0) goto L_0x01b8
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.height()
            float r5 = (float) r1
            float r5 = r5 * r7
            float r16 = r16 - r5
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x01b8:
            r13.restoreToCount(r8)
        L_0x01bb:
            if (r2 == 0) goto L_0x0222
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r6 = r9.right
            float r7 = r0.A01
            float r6 = r6 - r7
            float r5 = r9.bottom
            float r5 = r5 - r7
            r13.translate(r6, r5)
            r5 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.width()
            float r12 = r12 * r7
            float r16 = r16 - r12
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r8)
        L_0x01eb:
            int r5 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r10 = r8.left
            float r6 = r0.A01
            float r10 = r10 + r6
            float r9 = r8.bottom
            boolean r7 = X.AnonymousClass7TF.A1P(r2)
            float r7 = (float) r7
            float r7 = r7 * r6
            float r9 = r9 - r7
            r13.translate(r10, r9)
            r7 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r7)
            if (r2 == 0) goto L_0x020c
            r13.drawPath(r4, r3)
        L_0x020c:
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x0116
            r14 = 0
            float r3 = -r6
            float r2 = r0.A02
            float r15 = r3 - r2
            float r16 = r8.height()
            float r1 = (float) r1
            float r1 = r1 * r6
            float r16 = r16 - r1
            r17 = r3
            goto L_0x0113
        L_0x0222:
            boolean r5 = r0.A09
            if (r5 == 0) goto L_0x0119
            goto L_0x01eb
        L_0x0227:
            boolean r5 = r0.A0A
            if (r5 == 0) goto L_0x01bb
            goto L_0x0180
        L_0x022d:
            float r3 = r0.A01
            r2 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0250
            float r1 = r0.A0G
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x024d
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x024d
            android.graphics.RectF r2 = r0.A06
            android.graphics.Paint r1 = r0.A0H
            r13.drawRoundRect(r2, r3, r3, r1)
            android.graphics.RectF r1 = r0.A0J
        L_0x0247:
            android.graphics.Paint r0 = r0.A0I
            r13.drawRoundRect(r1, r3, r3, r0)
            return
        L_0x024d:
            android.graphics.RectF r1 = r0.A06
            goto L_0x0247
        L_0x0250:
            android.graphics.RectF r1 = r0.A06
            android.graphics.Paint r0 = r0.A0I
            r13.drawRect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52799Gcq.draw(android.graphics.Canvas):void");
    }

    public final boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.A09) {
            f = this.A02;
        } else {
            f = 0.0f;
        }
        if (this.A0A) {
            f2 = this.A02;
        } else {
            f2 = 0.0f;
        }
        boolean z = this.A0B;
        if (z) {
            float f6 = this.A02;
            if (this.A0K) {
                f4 = 0.0f;
            } else {
                f4 = this.A01;
            }
            f3 = f6 + f4;
        } else {
            f3 = 0.0f;
        }
        if (this.A08) {
            float f7 = this.A02;
            if (!this.A0K) {
                f5 = this.A01;
            }
            f5 += f7;
            if (z) {
                float f8 = this.A0G;
                f3 -= f8;
                f5 += f8;
            }
        }
        rect.set((int) f, (int) f3, (int) f2, (int) f5);
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v12, types: [android.graphics.BitmapShader] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fd, code lost:
        if (r16 == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ff, code lost:
        r9 = r5.A04;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0201, code lost:
        if (r9 == null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0203, code lost:
        r9.eraseColor(0);
        r12 = new android.graphics.Paint();
        X.AnonymousClass7TE.A1Q(r12);
        r12.setDither(true);
        r12.setShader(r24);
        r27 = 1.0f;
        r24 = new android.graphics.Canvas(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bb, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bb, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBoundsChange(android.graphics.Rect r44) {
        /*
            r43 = this;
            r5 = r43
            r1 = r44
            super.onBoundsChange(r1)
            android.graphics.RectF r6 = r5.A06
            int r0 = r1.left
            float r9 = (float) r0
            float r4 = r5.A02
            float r9 = r9 + r4
            boolean r8 = r5.A0B
            int r0 = r1.top
            float r3 = (float) r0
            if (r8 == 0) goto L_0x0017
            float r3 = r3 + r4
        L_0x0017:
            int r0 = r1.right
            float r2 = (float) r0
            float r2 = r2 - r4
            boolean r7 = r5.A08
            int r0 = r1.bottom
            float r0 = (float) r0
            if (r7 == 0) goto L_0x0023
            float r0 = r0 - r4
        L_0x0023:
            r6.set(r9, r3, r2, r0)
            android.graphics.RectF r10 = r5.A0J
            int r0 = r1.left
            float r9 = (float) r0
            float r9 = r9 + r4
            int r0 = r1.top
            float r3 = (float) r0
            if (r8 == 0) goto L_0x0035
            float r3 = r3 + r4
            float r0 = r5.A0G
            float r3 = r3 - r0
        L_0x0035:
            int r0 = r1.right
            float r2 = (float) r0
            float r2 = r2 - r4
            int r0 = r1.bottom
            float r1 = (float) r0
            if (r7 == 0) goto L_0x0042
            float r1 = r1 - r4
            float r0 = r5.A0G
            float r1 = r1 - r0
        L_0x0042:
            r10.set(r9, r3, r2, r1)
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x025d
            if (r8 == 0) goto L_0x025d
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x025d
            if (r7 == 0) goto L_0x025d
            r0 = 0
            r5.A00 = r0
        L_0x0054:
            float r3 = r5.A01
            float r13 = -r3
            android.graphics.RectF r23 = new android.graphics.RectF
            r0 = r23
            r0.<init>(r13, r13, r3, r3)
            android.graphics.RectF r22 = new android.graphics.RectF
            r1 = r22
            r1.<init>(r0)
            float r2 = -r4
            r1.inset(r2, r2)
            java.lang.Integer r7 = r5.A07
            boolean r8 = r5.A0C
            float r12 = X.C56176Hu5.A00(r7, r8)
            int[] r1 = A0M
            r0 = 6
            int[] r29 = java.util.Arrays.copyOf(r1, r0)
            r10 = 3
            int[] r6 = new int[r10]
            r6 = {-15173646, -15173646, -15173646} // fill-array
            if (r8 == 0) goto L_0x008c
            boolean r0 = X.C56176Hu5.A01(r7)
            if (r0 == 0) goto L_0x008c
            A00(r6)
            A00(r29)
        L_0x008c:
            r1 = 0
            r0 = r6[r1]
            r9 = 1050253722(0x3e99999a, float:0.3)
            float r9 = r9 * r12
            int r14 = X.C52686Gay.A00(r0, r9)
            r21 = 1
            r0 = r6[r21]
            r8 = 1036831949(0x3dcccccd, float:0.1)
            float r8 = r8 * r12
            int r11 = X.C52686Gay.A00(r0, r8)
            r0 = 2
            r6 = r6[r0]
            r0 = 0
            int r6 = X.C52686Gay.A00(r6, r0)
            int[] r40 = new int[]{r14, r11, r6}
            boolean r20 = X.C56176Hu5.A01(r7)
            r11 = 4
            int r6 = r5.A03
            if (r20 == 0) goto L_0x023c
            int r9 = X.C52686Gay.A00(r6, r9)
            int r8 = X.C52686Gay.A00(r6, r8)
            int r6 = X.C52686Gay.A00(r6, r0)
            int[] r32 = new int[]{r9, r8, r6}
            float[] r6 = new float[r10]
            r19 = r6
            r6 = {0, 1056964608, 1065353216} // fill-array
            android.graphics.Rect r6 = r5.getBounds()
            int r6 = r6.width()
            float r8 = (float) r6
            r9 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 + r3
            float r6 = r6 * r9
            float r8 = r8 - r6
            float[] r30 = A0L
            android.graphics.Shader$TileMode r31 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.LinearGradient r15 = new android.graphics.LinearGradient
            r24 = r15
            r25 = r0
            r26 = r0
            r27 = r8
            r28 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x00f1:
            float r18 = r3 + r4
            r28 = r32
            if (r20 == 0) goto L_0x00f9
            r28 = r40
        L_0x00f9:
            android.graphics.Shader$TileMode r34 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r17 = new android.graphics.RadialGradient
            r24 = r17
            r25 = r0
            r26 = r0
            r27 = r18
            r29 = r19
            r30 = r34
            r24.<init>(r25, r26, r27, r28, r29, r30)
            boolean r6 = X.C56176Hu5.A01(r7)
            if (r6 == 0) goto L_0x011a
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            r16 = 1
            if (r7 < r6) goto L_0x011c
        L_0x011a:
            r16 = 0
        L_0x011c:
            r8 = 0
            r7 = 0
        L_0x011e:
            android.graphics.Path[] r9 = r5.A0F
            int r6 = r9.length
            if (r8 >= r6) goto L_0x0299
            r6 = r9[r8]
            r6.reset()
            android.graphics.Path$FillType r9 = android.graphics.Path.FillType.EVEN_ODD
            r6.setFillType(r9)
            android.graphics.Paint[] r9 = r5.A0D
            r10 = r9[r8]
            r9 = r17
            r10.setShader(r9)
            r10 = 180(0xb4, float:2.52E-43)
            r9 = 90
            if (r7 == r9) goto L_0x0221
            if (r7 == r10) goto L_0x01e2
            r9 = 270(0x10e, float:3.78E-43)
            if (r7 == r9) goto L_0x01c8
            r6.moveTo(r13, r0)
            r6.rLineTo(r2, r0)
            float r31 = r2 - r3
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r27 = r10
            r28 = r0
            r29 = r0
            r30 = r0
            r33 = r19
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            if (r20 == 0) goto L_0x0191
            if (r16 == 0) goto L_0x0191
            android.graphics.Bitmap r9 = r5.A05
            if (r9 == 0) goto L_0x0191
            r9.eraseColor(r1)
            android.graphics.Paint r12 = new android.graphics.Paint
            r12.<init>()
            X.AnonymousClass7TE.A1Q(r12)
            r11 = r21
            r12.setDither(r11)
            r12.setShader(r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r11 = r18
            r10.translate(r0, r11)
            float r11 = -r11
            r27 = 1065353216(0x3f800000, float:1.0)
            r24 = r10
            r26 = r11
        L_0x0185:
            r29 = r12
            r24.drawRect(r25, r26, r27, r28, r29)
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.BitmapShader r10 = new android.graphics.BitmapShader
            r10.<init>(r9, r11, r11)
        L_0x0191:
            r12 = 1127481344(0x43340000, float:180.0)
            float r11 = (float) r7
            float r12 = r12 + r11
            r14 = 1119092736(0x42b40000, float:90.0)
            r9 = r22
            r6.arcTo(r9, r12, r14, r1)
            r9 = 1132920832(0x43870000, float:270.0)
            float r11 = r11 + r9
            r12 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r9 = r23
            r6.arcTo(r9, r11, r12, r1)
            r6.close()
            if (r20 == 0) goto L_0x01bb
            if (r15 == 0) goto L_0x01bb
            r6 = 180(0xb4, float:2.52E-43)
            if (r7 == r6) goto L_0x01b3
            if (r7 != 0) goto L_0x01bb
        L_0x01b3:
            android.graphics.PorterDuff$Mode r9 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.ComposeShader r6 = new android.graphics.ComposeShader
            r6.<init>(r10, r15, r9)
            r10 = r6
        L_0x01bb:
            android.graphics.Paint[] r6 = r5.A0E
            r6 = r6[r8]
            r6.setShader(r10)
            int r7 = r7 + 90
            int r8 = r8 + 1
            goto L_0x011e
        L_0x01c8:
            r6.moveTo(r0, r3)
            r6.rLineTo(r0, r4)
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            float r38 = r2 - r3
            r35 = r10
            r36 = r0
            r37 = r0
            r39 = r0
            r41 = r19
            r42 = r34
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)
            goto L_0x0191
        L_0x01e2:
            r6.moveTo(r3, r0)
            r6.rLineTo(r4, r0)
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r24 = r10
            r26 = r0
            r27 = r0
            r28 = r18
            r29 = r32
            r30 = r19
            r31 = r34
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            if (r20 == 0) goto L_0x0191
            if (r16 == 0) goto L_0x0191
            android.graphics.Bitmap r9 = r5.A04
            if (r9 == 0) goto L_0x0191
            r9.eraseColor(r1)
            android.graphics.Paint r12 = new android.graphics.Paint
            r12.<init>()
            X.AnonymousClass7TE.A1Q(r12)
            r11 = r21
            r12.setDither(r11)
            r12.setShader(r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r27 = 1065353216(0x3f800000, float:1.0)
            r24 = r10
            goto L_0x0185
        L_0x0221:
            r6.moveTo(r0, r13)
            r6.rLineTo(r0, r2)
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r24 = r10
            r26 = r0
            r27 = r18
            r28 = r0
            r29 = r40
            r30 = r19
            r31 = r34
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0191
        L_0x023c:
            r10 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r10
            int r10 = X.C52686Gay.A00(r6, r12)
            int r9 = X.C52686Gay.A00(r6, r9)
            int r8 = X.C52686Gay.A00(r6, r8)
            int r6 = X.C52686Gay.A00(r6, r0)
            int[] r32 = new int[]{r10, r9, r8, r6}
            float[] r6 = new float[r11]
            r19 = r6
            r6 = {0, 1048576000, 1061158912, 1065353216} // fill-array
            r15 = 0
            goto L_0x00f1
        L_0x025d:
            android.graphics.Path r0 = r5.A00
            if (r0 != 0) goto L_0x0267
            android.graphics.Path r0 = X.C51965G9l.A0C()
            r5.A00 = r0
        L_0x0267:
            r0.reset()
            r3 = 0
            if (r8 == 0) goto L_0x0297
            float r1 = r5.A01
        L_0x026f:
            if (r7 == 0) goto L_0x0273
            float r3 = r5.A01
        L_0x0273:
            r0 = 8
            float[] r2 = new float[r0]
            r0 = 0
            r2[r0] = r1
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            r0 = 4
            r2[r0] = r3
            X.C51975G9x.A1L(r2, r3)
            android.graphics.Path r1 = r5.A00
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r6, r2, r0)
            android.graphics.Path r0 = r5.A00
            r0.close()
            goto L_0x0054
        L_0x0297:
            r1 = 0
            goto L_0x026f
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52799Gcq.onBoundsChange(android.graphics.Rect):void");
    }

    public final void setAlpha(int i) {
        for (Paint alpha : this.A0D) {
            alpha.setAlpha(i);
        }
        for (Paint alpha2 : this.A0E) {
            alpha2.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0D) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0E) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009e, code lost:
        if (r1 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52799Gcq(android.content.Context r11, X.C307796Rn r12, java.lang.Integer r13, int r14, int r15) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 1094713344(0x41400000, float:12.0)
            float r7 = X.C14573Tyc.A00(r11, r0)
            r5 = 1082130432(0x40800000, float:4.0)
            float r6 = X.C14573Tyc.A00(r11, r5)
            boolean r0 = X.C56176Hu5.A01(r13)
            if (r0 == 0) goto L_0x001c
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 < r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0031
            float r7 = r7 + r6
            int r2 = (int) r7
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x002f }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r4, r2, r0)     // Catch:{ all -> 0x002f }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r2, r0)     // Catch:{ all -> 0x002f }
            r3 = r1
            goto L_0x0032
        L_0x002f:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
        L_0x0031:
            r0 = r3
        L_0x0032:
            r10.A05 = r3
            r10.A04 = r0
            r10.A07 = r13
            float r0 = X.C14573Tyc.A00(r11, r5)
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            r10.A01 = r0
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C14573Tyc.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A02 = r0
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x0120;
                case 1: goto L_0x0120;
                default: goto L_0x0056;
            }
        L_0x0056:
            r0 = 5
        L_0x0057:
            float r0 = (float) r0
            float r0 = X.C14573Tyc.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A0G = r0
            boolean r7 = r12.CRA()
            r10.A0C = r7
            r8 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            if (r7 == 0) goto L_0x0070
            r8 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
        L_0x0070:
            r10.A03 = r8
            r0 = r15 & 1
            boolean r9 = X.AnonymousClass7TF.A1S(r0, r4)
            r10.A0B = r9
            r1 = 2
            r0 = r15 & 2
            boolean r3 = X.AnonymousClass7TF.A1S(r0, r1)
            r10.A09 = r3
            r5 = 4
            r0 = r15 & 4
            boolean r2 = X.AnonymousClass7TF.A1S(r0, r5)
            r10.A0A = r2
            r1 = 8
            r0 = r15 & 8
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r1)
            r10.A08 = r1
            r6 = 0
            if (r9 == 0) goto L_0x00a0
            if (r3 == 0) goto L_0x00a0
            if (r2 == 0) goto L_0x00a0
            r0 = 1
            if (r1 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r10.A0K = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.A0I = r0
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
            r0.setColor(r14)
            r0.setAntiAlias(r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r10.A0H = r2
            r2.setStyle(r3)
            r2.setColor(r8)
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r1 = X.C56176Hu5.A00(r13, r7)
            float r1 = r1 * r0
            r0 = 1132396544(0x437f0000, float:255.0)
            int r0 = X.AnonymousClass7TE.A05(r1, r0)
            r2.setAlpha(r0)
            r2.setAntiAlias(r4)
            boolean r0 = X.C56176Hu5.A01(r13)
            if (r0 != 0) goto L_0x00dd
            r5 = 1
        L_0x00dd:
            android.graphics.Path[] r0 = new android.graphics.Path[r5]
            r10.A0F = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r10.A06 = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r10.A0J = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r5]
            r10.A0D = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r5]
            r10.A0E = r0
        L_0x00f5:
            android.graphics.Path[] r1 = r10.A0F
            android.graphics.Path r0 = X.C51965G9l.A0C()
            r1[r6] = r0
            android.graphics.Paint[] r1 = r10.A0D
            r2 = 4
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r2)
            r0.setStyle(r3)
            r1[r6] = r0
            android.graphics.Paint[] r0 = r10.A0D
            r0 = r0[r6]
            r0.setAntiAlias(r4)
            android.graphics.Paint[] r1 = r10.A0E
            android.graphics.Paint r0 = X.AnonymousClass7TE.A0V(r2)
            r0.setStyle(r3)
            r1[r6] = r0
            int r6 = r6 + 1
            if (r6 < r5) goto L_0x00f5
            return
        L_0x0120:
            r0 = 0
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52799Gcq.<init>(android.content.Context, X.6Rn, java.lang.Integer, int, int):void");
    }

    public static void A00(int[] iArr) {
        int A002 = C52686Gay.A00(-14931149, 0.2f);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int alpha = Color.alpha(i2);
            int alpha2 = Color.alpha(A002);
            int i3 = (255 - alpha2) * alpha;
            int i4 = i3 + alpha2;
            iArr[i] = Color.argb(Math.min(255, i4), ((Color.red(i2) * i3) + (Color.red(A002) * alpha2)) / i4, ((Color.green(i2) * i3) + (Color.green(A002) * alpha2)) / i4, ((i3 * Color.blue(i2)) + (Color.blue(A002) * alpha2)) / i4);
        }
    }
}
