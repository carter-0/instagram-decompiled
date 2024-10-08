package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;

/* renamed from: X.JdC  reason: case insensitive filesystem */
public final class C60003JdC extends Drawable implements C262414Dp {
    public static final RectF A05 = AnonymousClass7TE.A0Y();
    public static final RectF A06 = AnonymousClass7TE.A0Y();
    public static final RectF A07 = AnonymousClass7TE.A0Y();
    public boolean A00;
    public final Paint A01 = JTO.A0C();
    public final Path A02 = C51965G9l.A0C();
    public final Path A03 = C51965G9l.A0C();
    public final LFV A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r3 != r0.A04) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r1 = 0
            r12 = r21
            X.0qQ.A0B(r12, r1)
            r11 = r20
            X.LFV r0 = r11.A04
            int r5 = r0.A05
            int r2 = r0.A07
            if (r5 != r2) goto L_0x0019
            int r3 = r0.A06
            if (r2 != r3) goto L_0x0019
            int r2 = r0.A04
            r7 = 1
            if (r3 == r2) goto L_0x001a
        L_0x0019:
            r7 = 0
        L_0x001a:
            float r4 = r0.A01
            float r6 = r0.A03
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            float r3 = r0.A02
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            float r2 = r0.A00
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            r3 = 0
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0058
            if (r7 == 0) goto L_0x00fe
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r4 / r1
            android.graphics.RectF r3 = A05
            android.graphics.Rect r1 = r11.getBounds()
            r3.set(r1)
            r3.inset(r2, r2)
            android.graphics.Paint r2 = r11.A01
            r2.setStrokeWidth(r4)
            r2.setColor(r5)
            boolean r1 = r11.A00
            if (r1 == 0) goto L_0x0059
            android.graphics.Path r1 = r11.A03
        L_0x0053:
            float[] r0 = r0.A09
            X.C62982KpY.A00(r12, r2, r1, r3, r0)
        L_0x0058:
            return
        L_0x0059:
            r1 = 0
            goto L_0x0053
        L_0x005b:
            android.graphics.Rect r2 = X.AnonymousClass7TE.A0X(r11)
            float r13 = r0.A01
            r10 = 0
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0085
            int r5 = r0.A05
            if (r5 == 0) goto L_0x0085
            int r3 = r2.left
            float r14 = (float) r3
            int r3 = r2.top
            float r15 = (float) r3
            float r4 = r14 + r13
            int r3 = r2.right
            float r3 = (float) r3
            float r16 = java.lang.Math.min(r4, r3)
            int r3 = r2.bottom
            float r3 = (float) r3
            r19 = 1
            r17 = r3
            r18 = r5
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0085:
            float r13 = r0.A02
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ac
            int r5 = r0.A06
            if (r5 == 0) goto L_0x00ac
            int r3 = r2.right
            float r4 = (float) r3
            float r6 = r4 - r13
            int r3 = r2.left
            float r3 = (float) r3
            float r14 = java.lang.Math.max(r6, r3)
            int r3 = r2.top
            float r15 = (float) r3
            int r3 = r2.bottom
            float r3 = (float) r3
            r19 = 1
            r17 = r3
            r18 = r5
            r16 = r4
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00ac:
            float r9 = r0.A03
            int r3 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d4
            int r8 = r0.A07
            if (r8 == 0) goto L_0x00d4
            int r3 = r2.left
            float r7 = (float) r3
            int r3 = r2.top
            float r6 = (float) r3
            int r3 = r2.right
            float r5 = (float) r3
            float r4 = r6 + r9
            int r3 = r2.bottom
            float r3 = (float) r3
            float r17 = java.lang.Math.min(r4, r3)
            r13 = r9
            r14 = r7
            r15 = r6
            r16 = r5
            r18 = r8
            r19 = r1
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00d4:
            float r7 = r0.A00
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0058
            int r6 = r0.A04
            if (r6 == 0) goto L_0x0058
            int r0 = r2.left
            float r5 = (float) r0
            int r0 = r2.bottom
            float r4 = (float) r0
            float r3 = r4 - r7
            int r0 = r2.top
            float r0 = (float) r0
            float r13 = java.lang.Math.max(r3, r0)
            int r0 = r2.right
            float r0 = (float) r0
            r9 = r11
            r10 = r12
            r11 = r7
            r12 = r5
            r14 = r0
            r15 = r4
            r16 = r6
            r17 = r1
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00fe:
            android.graphics.Paint r6 = r11.A01
            r6.setStrokeWidth(r4)
            float r8 = r0.A01
            r1 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r1
            android.graphics.RectF r5 = A05
            android.graphics.Rect r1 = r11.getBounds()
            r5.set(r1)
            int r4 = r12.save()
            float r2 = r5.left
            float r1 = r5.top
            r12.translate(r2, r1)
            r5.offsetTo(r3, r3)
            r5.inset(r8, r8)
            android.graphics.RectF r9 = A06
            r9.set(r5)
            float r2 = r5.width()
            float r1 = r5.height()
            float r2 = java.lang.Math.min(r2, r1)
            r1 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r1
            r9.inset(r2, r2)
            int r1 = r0.A05
            if (r1 == 0) goto L_0x0172
            int r3 = r12.save()
            r6.setColor(r1)
            android.graphics.Path r7 = r11.A02
            r7.reset()
            float r2 = r5.left
            float r2 = r2 - r8
            float r1 = r5.top
            float r1 = r1 - r8
            r7.moveTo(r2, r1)
            float r2 = r9.left
            float r1 = r9.top
            r7.lineTo(r2, r1)
            float r2 = r9.left
            float r1 = r9.bottom
            r7.lineTo(r2, r1)
            float r2 = r5.left
            float r2 = r2 - r8
            float r1 = r5.bottom
            float r1 = r1 + r8
            android.graphics.Path r2 = A00(r12, r7, r11, r2, r1)
            float[] r1 = r0.A09
            X.C62982KpY.A00(r12, r6, r2, r5, r1)
            r12.restoreToCount(r3)
        L_0x0172:
            int r1 = r0.A07
            if (r1 == 0) goto L_0x01ab
            int r3 = r12.save()
            r6.setColor(r1)
            android.graphics.Path r7 = r11.A02
            r7.reset()
            float r2 = r5.left
            float r2 = r2 - r8
            float r1 = r5.top
            float r1 = r1 - r8
            r7.moveTo(r2, r1)
            float r2 = r9.left
            float r1 = r9.top
            r7.lineTo(r2, r1)
            float r2 = r9.right
            float r1 = r9.top
            r7.lineTo(r2, r1)
            float r2 = r5.right
            float r2 = r2 + r8
            float r1 = r5.top
            float r1 = r1 - r8
            android.graphics.Path r2 = A00(r12, r7, r11, r2, r1)
            float[] r1 = r0.A09
            X.C62982KpY.A00(r12, r6, r2, r5, r1)
            r12.restoreToCount(r3)
        L_0x01ab:
            int r1 = r0.A06
            if (r1 == 0) goto L_0x01e4
            int r3 = r12.save()
            r6.setColor(r1)
            android.graphics.Path r7 = r11.A02
            r7.reset()
            float r2 = r5.right
            float r2 = r2 + r8
            float r1 = r5.top
            float r1 = r1 - r8
            r7.moveTo(r2, r1)
            float r2 = r9.right
            float r1 = r9.top
            r7.lineTo(r2, r1)
            float r2 = r9.right
            float r1 = r9.bottom
            r7.lineTo(r2, r1)
            float r2 = r5.right
            float r2 = r2 + r8
            float r1 = r5.bottom
            float r1 = r1 + r8
            android.graphics.Path r2 = A00(r12, r7, r11, r2, r1)
            float[] r1 = r0.A09
            X.C62982KpY.A00(r12, r6, r2, r5, r1)
            r12.restoreToCount(r3)
        L_0x01e4:
            int r1 = r0.A04
            if (r1 == 0) goto L_0x021d
            int r3 = r12.save()
            r6.setColor(r1)
            android.graphics.Path r7 = r11.A02
            r7.reset()
            float r2 = r5.left
            float r2 = r2 - r8
            float r1 = r5.bottom
            float r1 = r1 + r8
            r7.moveTo(r2, r1)
            float r2 = r9.left
            float r1 = r9.bottom
            r7.lineTo(r2, r1)
            float r2 = r9.right
            float r1 = r9.bottom
            r7.lineTo(r2, r1)
            float r2 = r5.right
            float r2 = r2 + r8
            float r1 = r5.bottom
            float r1 = r1 + r8
            android.graphics.Path r1 = A00(r12, r7, r11, r2, r1)
            float[] r0 = r0.A09
            X.C62982KpY.A00(r12, r6, r1, r5, r0)
            r12.restoreToCount(r3)
        L_0x021d:
            r12.restoreToCount(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60003JdC.draw(android.graphics.Canvas):void");
    }

    @Deprecated(message = "This method is no longer used in graphics optimizations")
    public final int getOpacity() {
        return -1;
    }

    private final void A01(Canvas canvas, float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        Path path;
        Paint paint = this.A01;
        paint.setStrokeWidth(f);
        paint.setColor(i);
        RectF rectF = A07;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = A05;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        if (this.A00) {
            path = this.A03;
        } else {
            path = null;
        }
        C62982KpY.A00(canvas, paint, path, rectF2, this.A04.A09);
        canvas.restoreToCount(save);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60003JdC)) {
            return false;
        }
        return 0qQ.A0K(this.A04, ((C60003JdC) obj).A04);
    }

    public final ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public C60003JdC(LFV lfv) {
        boolean z;
        this.A04 = lfv;
        float[] fArr = lfv.A09;
        boolean z2 = false;
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            float f = 0.0f;
            z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                float f2 = fArr[i];
                z = f2 > 0.0f ? true : z;
                if (i == 0) {
                    f = f2;
                } else if (f != f2) {
                    this.A00 = true;
                    break;
                }
                i++;
            }
            if (this.A00 && length != 8) {
                float[] fArr2 = new float[8];
                int i2 = 0;
                do {
                    int i3 = i2 * 2;
                    fArr2[i3] = fArr[i2];
                    fArr2[i3 + 1] = fArr[i2];
                    i2++;
                } while (i2 < 4);
                this.A04.A09 = fArr2;
            }
        } else {
            z = false;
        }
        this.A01.setPathEffect(this.A04.A08);
        this.A01.setAntiAlias((this.A04.A08 != null || z) ? true : z2);
        JTO.A1N(this.A01);
    }

    public static Path A00(Canvas canvas, Path path, C60003JdC jdC, float f, float f2) {
        path.lineTo(f, f2);
        path.close();
        canvas.clipPath(path);
        if (jdC.A00) {
            return jdC.A03;
        }
        return null;
    }

    public final boolean CSn(C262414Dp r2) {
        return Dba.A1Y(r2, this);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
