package X;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.Arrays;

public final class U17 extends Drawable {
    public float A00;
    public float A01;
    public float A02 = 0.25f;
    public float A03 = 0.9f;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = 255;
    public int A08 = Integer.MAX_VALUE;
    public int A09;
    public int A0A;
    public int A0B = 1;
    public int A0C;
    public Paint A0D;
    public int A0E = -1;
    public int A0F = -1;
    public final int A0G;
    public final int A0H;
    public final TextPaint A0I;
    public final int[] A0J;
    public final StaticLayout[] A0K;
    public final Paint A0L;
    public final X8Z A0M;

    public U17(X8Z x8z, float f, int i) {
        this.A0M = x8z;
        this.A0G = i;
        int BcH = x8z.BcH();
        this.A0H = BcH;
        this.A0K = new StaticLayout[BcH];
        this.A0J = new int[BcH];
        TextPaint textPaint = new TextPaint(1);
        this.A0I = textPaint;
        Paint paint = new Paint(1);
        this.A0L = paint;
        textPaint.setColor(-1);
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(true);
        this.A06 = C17039VFn.A00(this.A0I);
        JTO.A1N(paint);
        paint.setColor(-1);
        paint.setAlpha(128);
        C13989Tnp.A13(this);
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r7 >= r6.A0H) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(int r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 < 0) goto L_0x0008
            int r0 = r6.A0H
            r4 = 1
            if (r7 < r0) goto L_0x0009
        L_0x0008:
            r4 = 0
        L_0x0009:
            java.lang.String r3 = "ScrollableByPhraseLyricsDrawable: invalid phrase index "
            java.lang.String r2 = " for phrase count "
            int r1 = r6.A0H
            java.lang.String r0 = " in getPhraseCenter()"
            java.lang.String r1 = X.002.A0n(r3, r2, r0, r7, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.17k.A0I(r4, r1, r0)
            int[] r0 = r6.A0J
            r0 = r0[r7]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U17.A03(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01fe A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r10 = 0
            r11 = r23
            X.0qQ.A0B(r11, r10)
            r12 = r22
            android.graphics.Rect r5 = X.AnonymousClass7TE.A0X(r12)
            r11.save()
            float r6 = r12.A01
            r9 = 0
            r21 = 1073741824(0x40000000, float:2.0)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = 1062836634(0x3f59999a, float:0.85)
            float r1 = r4 - r9
            float r3 = r3 - r4
            r2 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0028
            float r6 = r6 - r9
            float r2 = r6 / r1
        L_0x0028:
            float r2 = r2 * r3
            float r2 = r2 + r4
            int r0 = r11.getWidth()
            float r1 = (float) r0
            float r1 = r1 / r21
            int r0 = r11.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r21
            r11.scale(r2, r2, r1, r0)
        L_0x003b:
            int r0 = r5.left
            float r2 = (float) r0
            int r0 = r5.top
            float r1 = (float) r0
            int r0 = r12.A0E
            float r0 = (float) r0
            float r0 = r0 / r21
            float r1 = r1 + r0
            int r0 = r12.A0A
            float r0 = (float) r0
            float r1 = r1 - r0
            r11.translate(r2, r1)
            int r0 = r12.A0A
            int[] r8 = r12.A0J
            int r7 = java.util.Arrays.binarySearch(r8, r0)
            if (r7 >= 0) goto L_0x0068
            int r0 = -r7
            int r0 = r0 + -1
            int r0 = r0 + -1
            int r1 = java.lang.Math.max(r10, r0)
            int r0 = r8.length
            int r0 = r0 + -1
            int r7 = java.lang.Math.min(r1, r0)
        L_0x0068:
            int r0 = r12.A0B
            int r6 = X.C13988Tno.A07(r7, r0, r10)
            int r0 = r0 + r7
            int r1 = r0 + 1
            int r0 = r12.A0H
            int r0 = r0 + -1
            int r20 = java.lang.Math.min(r1, r0)
            r2 = r8[r7]
            if (r7 >= r0) goto L_0x01f5
            int r0 = r7 + 1
            r0 = r8[r0]
        L_0x0081:
            int r1 = r12.A0A
            float r3 = (float) r1
            float r2 = (float) r2
            float r1 = (float) r0
            r19 = 1065353216(0x3f800000, float:1.0)
            r0 = r19
            float r18 = X.0mi.A02(r3, r2, r1, r9, r0)
            int r1 = r12.A04
            r3 = r8[r1]
            android.text.StaticLayout[] r13 = r12.A0K
            r0 = r13[r1]
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x021a
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            int r14 = r3 - r0
            int r0 = r12.A0G
            int r4 = r0 / 2
            int r14 = r14 - r4
            r0 = r13[r1]
            if (r0 == 0) goto L_0x0214
            int r0 = r0.getHeight()
            int r2 = r0 / 2
            int r2 = r2 + r3
            int r2 = r2 + r4
            int r0 = r12.A0A
            if (r0 >= r14) goto L_0x01cf
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00b9:
            r0 = r20
            if (r6 > r0) goto L_0x020a
        L_0x00bd:
            r11.save()
            r0 = r8[r6]
            float r1 = (float) r0
            r0 = r13[r6]
            if (r0 == 0) goto L_0x0204
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r21
            float r1 = r1 - r0
            r11.translate(r9, r1)
            int r0 = r12.A04
            if (r6 != r0) goto L_0x0199
            float r0 = java.lang.Math.abs(r19)
            r14 = 1065353216(0x3f800000, float:1.0)
            float r4 = r14 - r0
            float r1 = r12.A02
            int r0 = r12.A07
            float r3 = (float) r0
            float r1 = r1 * r3
            int r0 = (int) r1
            float r2 = (float) r0
            float r3 = r3 * r14
            float r14 = r14 - r9
            float r3 = r3 - r2
            r1 = 0
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00f1
            float r4 = r4 - r9
        L_0x00ef:
            float r1 = r4 / r14
        L_0x00f1:
            float r1 = r1 * r3
            float r1 = r1 + r2
        L_0x00f3:
            int r14 = (int) r1
            float r2 = r12.A01
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x010b
            int r0 = r7 + -1
            if (r6 < r0) goto L_0x0102
            int r0 = r7 + 1
            if (r6 <= r0) goto L_0x010b
        L_0x0102:
            float r1 = (float) r14
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.Pxi.A01(r0, r2, r9)
            float r1 = r1 * r0
            int r14 = (int) r1
        L_0x010b:
            r0 = r13[r6]
            if (r0 == 0) goto L_0x01fe
            android.text.TextPaint r0 = r0.getPaint()
            r0.setAlpha(r14)
            int r0 = r12.A04
            if (r6 != r0) goto L_0x0196
            float r0 = java.lang.Math.abs(r19)
            r15 = 1065353216(0x3f800000, float:1.0)
            float r4 = r15 - r0
            float r3 = r12.A03
            float r1 = r15 - r9
            float r15 = r15 - r3
            r2 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x012f
            float r4 = r4 - r9
            float r2 = r4 / r1
        L_0x012f:
            float r2 = r2 * r15
            float r2 = r2 + r3
        L_0x0131:
            int r0 = r12.A0F
            float r1 = (float) r0
            float r1 = r1 / r21
            r0 = r13[r6]
            if (r0 == 0) goto L_0x0194
            int r0 = r0.getHeight()
        L_0x013e:
            float r0 = (float) r0
            float r0 = r0 / r21
            r11.scale(r2, r2, r1, r0)
            r4 = r13[r6]
            if (r4 == 0) goto L_0x0189
            android.graphics.Paint r0 = r12.A0D
            r17 = r0
            if (r0 == 0) goto L_0x0186
            int r15 = X.AnonymousClass6M0.A00(r4)
            int r0 = r12.A05
            int r15 = r15 - r0
            int r3 = r4.getLineTop(r10)
            int r0 = r12.A0C
            int r3 = r3 - r0
            int r2 = X.AnonymousClass6M0.A01(r4)
            int r0 = r12.A05
            int r2 = r2 + r0
            int r0 = r4.getLineCount()
            int r0 = r0 + -1
            int r1 = r4.getLineBottom(r0)
            int r0 = r12.A0C
            int r1 = r1 + r0
            android.graphics.Rect r16 = new android.graphics.Rect
            r0 = r16
            r0.<init>(r15, r3, r2, r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r0 = r17
            r1.<init>(r0)
            r1.setAlpha(r14)
            r0 = r16
            r11.drawRect(r0, r1)
        L_0x0186:
            r4.draw(r11)
        L_0x0189:
            r11.restore()
            r0 = r20
            if (r6 == r0) goto L_0x020a
            int r6 = r6 + 1
            goto L_0x00bd
        L_0x0194:
            r0 = 0
            goto L_0x013e
        L_0x0196:
            float r2 = r12.A03
            goto L_0x0131
        L_0x0199:
            int r0 = r7 - r6
            int r1 = r12.A0B
            r2 = 1
            if (r0 == r1) goto L_0x01ad
            int r0 = r6 - r7
            int r0 = r0 - r2
            if (r0 == r1) goto L_0x01ad
            float r1 = r12.A02
            int r0 = r12.A07
            float r0 = (float) r0
            float r1 = r1 * r0
            goto L_0x00f3
        L_0x01ad:
            if (r6 > r7) goto L_0x01b0
            r2 = 0
        L_0x01b0:
            float r1 = r12.A02
            int r0 = r12.A07
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 == 0) goto L_0x01c8
            float r3 = (float) r0
            r2 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 - r9
            float r3 = r3 - r9
        L_0x01bf:
            r1 = 0
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00f1
            float r4 = r18 - r9
            goto L_0x00ef
        L_0x01c8:
            float r2 = (float) r0
            r14 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 - r9
            float r3 = r9 - r2
            goto L_0x01bf
        L_0x01cf:
            if (r0 > r2) goto L_0x00b9
            r0 = r13[r1]
            if (r0 == 0) goto L_0x020e
            int r0 = r0.getHeight()
            float r1 = (float) r0
            float r0 = r12.A00
            float r1 = r1 * r0
            int r0 = r12.A0A
            float r4 = (float) r0
            if (r0 >= r3) goto L_0x01ee
            float r0 = (float) r14
            float r3 = (float) r3
            float r3 = r3 - r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 0
        L_0x01e8:
            float r19 = X.0mi.A02(r4, r0, r3, r2, r1)
            goto L_0x00b9
        L_0x01ee:
            float r0 = (float) r3
            float r0 = r0 + r1
            float r3 = (float) r2
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01e8
        L_0x01f5:
            int r0 = r7 + -1
            r0 = r8[r0]
            int r0 = r2 - r0
            int r0 = r0 + r2
            goto L_0x0081
        L_0x01fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0204:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x020a:
            r11.restore()
            return
        L_0x020e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0214:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x021a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U17.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        if (this.A0F != rect.width() || this.A0E != rect.height()) {
            this.A0F = rect.width();
            this.A0E = rect.height();
            A01(this);
        }
    }

    private final void A00() {
        int i;
        int A062;
        int height;
        int i2 = this.A0A;
        int[] iArr = this.A0J;
        StaticLayout[] staticLayoutArr = this.A0K;
        int length = iArr.length;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = Math.min(Math.max(0, ((-binarySearch) - 1) - 1), length - 1);
        }
        try {
            int i3 = iArr[binarySearch];
            if (i3 != i2) {
                if (i3 < i2) {
                    if (binarySearch != length - 1) {
                        i = binarySearch + 1;
                        StaticLayout staticLayout = staticLayoutArr[binarySearch];
                        if (staticLayout != null) {
                            A062 = C13988Tno.A06(i3 + (staticLayout.getHeight() / 2), i2);
                            int i4 = iArr[i];
                            StaticLayout staticLayout2 = staticLayoutArr[i];
                            if (staticLayout2 != null) {
                                height = i4 - (staticLayout2.getHeight() / 2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else if (binarySearch != 0) {
                    i = binarySearch - 1;
                    StaticLayout staticLayout3 = staticLayoutArr[binarySearch];
                    if (staticLayout3 != null) {
                        A062 = C13988Tno.A06(i3 - (staticLayout3.getHeight() / 2), i2);
                        int i5 = iArr[i];
                        StaticLayout staticLayout4 = staticLayoutArr[i];
                        if (staticLayout4 != null) {
                            height = i5 + (staticLayout4.getHeight() / 2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (A062 >= C13988Tno.A06(height, i2)) {
                    binarySearch = i;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            binarySearch = 0;
        }
        this.A04 = binarySearch;
    }

    public static final void A01(U17 u17) {
        int i;
        if (u17.A0F != -1 && u17.A0E != -1) {
            int i2 = u17.A0H;
            for (int i3 = 0; i3 < i2; i3++) {
                String BcG = u17.A0M.BcG(i3);
                StaticLayout[] staticLayoutArr = u17.A0K;
                TextPaint textPaint = u17.A0I;
                int i4 = u17.A0F;
                AnonymousClass7TG.A1O(textPaint, BcG);
                staticLayoutArr[i3] = C18381Vqh.A00(Layout.Alignment.ALIGN_CENTER, textPaint, BcG, u17.A08, i4);
                int[] iArr = u17.A0J;
                if (i3 != 0) {
                    int i5 = i3 - 1;
                    int i6 = iArr[i5];
                    StaticLayout staticLayout = staticLayoutArr[i5];
                    if (staticLayout != null) {
                        int height = i6 + (staticLayout.getHeight() / 2) + u17.A0G;
                        StaticLayout staticLayout2 = staticLayoutArr[i3];
                        if (staticLayout2 != null) {
                            i = height + (staticLayout2.getHeight() / 2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    i = 0;
                }
                iArr[i3] = i;
            }
            u17.A09 = u17.A0J[i2 - 1];
        }
    }

    public final int A02(int i) {
        int[] iArr = this.A0J;
        0qQ.A0B(iArr, 1);
        int length = iArr.length;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            binarySearch = Math.min(Math.max(0, ((-binarySearch) - 1) - 1), length - 1);
        }
        int i2 = iArr[binarySearch];
        if (i == i2 || binarySearch >= length - 1) {
            return i2;
        }
        int A062 = C13988Tno.A06(i2, i);
        int i3 = binarySearch + 1;
        if (A062 >= C13988Tno.A06(iArr[i3], i)) {
            binarySearch = i3;
        }
        return iArr[binarySearch];
    }

    public final void A04(int i) {
        this.A0A = Math.max(0, Math.min(i, this.A09));
        A00();
        invalidateSelf();
    }

    public final void A05(int i) {
        this.A0I.setColor(i);
        this.A07 = Color.alpha(i);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A07 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0I.setColorFilter(colorFilter);
        Paint paint = this.A0D;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
