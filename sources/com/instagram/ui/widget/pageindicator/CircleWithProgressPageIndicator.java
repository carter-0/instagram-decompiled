package com.instagram.ui.widget.pageindicator;

import X.0nA;
import X.0qQ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public final class CircleWithProgressPageIndicator extends CirclePageIndicator {
    public final int A00;
    public final int A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircleWithProgressPageIndicator(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cf, code lost:
        if (r0 != (r2.A05 - 2)) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.graphics.Canvas r28) {
        /*
            r27 = this;
            r2 = r27
            boolean r0 = r2.A0E
            r26 = r28
            if (r0 == 0) goto L_0x000d
            r0 = r26
            r2.A04(r0)
        L_0x000d:
            boolean r7 = r2.A0H
            if (r7 == 0) goto L_0x0212
            int r1 = r2.getWidth()
            int r0 = r2.getPaddingRight()
            int r1 = r1 - r0
        L_0x001a:
            int r9 = r2.getPaddingTop()
            int r3 = r2.getMeasuredHeight()
            int r0 = r2.getPaddingTop()
            int r3 = r3 - r0
            int r0 = r2.getPaddingBottom()
            int r3 = r3 - r0
            int r0 = r3 / 2
            int r9 = r9 + r0
            if (r7 == 0) goto L_0x020e
            r4 = -1
            int r0 = r2.A05
            int r0 = r0 + -1
        L_0x0036:
            android.graphics.Paint r3 = r2.A0F
            r5 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r5)
        L_0x003d:
            if (r7 == 0) goto L_0x0208
            if (r0 < 0) goto L_0x0218
        L_0x0041:
            int r11 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            int r5 = r11 * r4
            int r1 = r1 + r5
            int r5 = r2.A07
            int r8 = r11 + r5
            float r10 = (float) r11
            int r6 = r2.A05
            int r5 = r2.A06
            if (r6 <= r5) goto L_0x008d
            int r11 = r11 + r1
            int r5 = r2.getScrollX()
            int r11 = r11 - r5
            int r6 = r2.getWidth()
            int r5 = r2.getPaddingRight()
            int r6 = r6 - r5
            int r5 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            if (r11 <= r6) goto L_0x01da
            int r6 = r1 + r5
            int r5 = r2.getScrollX()
            int r6 = r6 - r5
            double r14 = (double) r6
            int r6 = r2.getWidth()
            int r5 = r2.getPaddingRight()
            int r6 = r6 - r5
            double r12 = (double) r6
            int r5 = r2.getWidth()
            double r10 = (double) r5
            int r5 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            double r5 = (double) r5
            r24 = 0
            r18 = r12
            r20 = r10
            r22 = r5
            r16 = r14
            double r5 = X.AnonymousClass37Q.A04(r16, r18, r20, r22, r24)
        L_0x008c:
            float r10 = (float) r5
        L_0x008d:
            r19 = r0
            r5 = 1
            if (r7 == 0) goto L_0x00ac
            int r12 = r2.A05
            int r11 = r12 - r0
            int r11 = r11 - r5
            int r6 = r2.A06
            if (r11 == r6) goto L_0x00b3
            int r12 = r12 - r0
            int r16 = r12 + -1
        L_0x009e:
            r12 = 0
            r15 = r9
            r13 = r10
            r14 = r1
            r11 = r26
            r10 = r2
            r10.A05(r11, r12, r13, r14, r15, r16)
        L_0x00a8:
            int r8 = r8 * r4
            int r1 = r1 + r8
            int r0 = r0 + r4
            goto L_0x003d
        L_0x00ac:
            int r6 = r2.A06
            if (r0 == r6) goto L_0x00b3
            r16 = r0
            goto L_0x009e
        L_0x00b3:
            int r6 = r2.A01
            float r6 = (float) r6
            r3.setStrokeWidth(r6)
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.ROUND
            r3.setStrokeCap(r6)
            int r6 = r2.A04
            r3.setColor(r6)
            float r8 = (float) r1
            float r6 = (float) r9
            boolean r10 = r2.A0B
            if (r10 == 0) goto L_0x015b
            if (r7 != 0) goto L_0x01a6
            int r10 = r2.A05
            int r10 = r10 + -2
            if (r0 == r10) goto L_0x01ad
        L_0x00d1:
            int r12 = r2.A00
            int r14 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            int r11 = r12 + r14
            int r10 = r2.A07
            int r11 = r11 + r10
            int r11 = r11 * r4
            float r13 = (float) r11
            float r13 = r13 + r8
            int r14 = r14 * r4
            float r10 = (float) r14
            float r13 = r13 + r10
            float r11 = (float) r12
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = r2.A01
            float r12 = r12 - r10
            float r10 = r11 * r12
            float r12 = (float) r4
            float r10 = r10 * r12
            float r23 = r13 - r10
            r20 = r26
            r21 = r13
            r22 = r6
            r24 = r6
            r25 = r3
            r20.drawLine(r21, r22, r23, r24, r25)
            if (r7 == 0) goto L_0x0100
            int r10 = r2.A05
            int r10 = r10 - r0
            int r19 = r10 + -1
        L_0x0100:
            int r10 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            float r13 = (float) r10
            int r10 = r2.A04
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r18 = r9
            r16 = r13
            r17 = r1
            r14 = r26
            r13 = r2
            r13.A05(r14, r15, r16, r17, r18, r19)
            int r10 = r2.A03
            r3.setColor(r10)
            float r13 = r2.A01
            r10 = 1132396544(0x437f0000, float:255.0)
            float r13 = r13 * r10
            int r10 = (int) r13
            r3.setAlpha(r10)
            float r10 = r2.A01
            float r11 = r11 * r10
            float r11 = r11 * r12
        L_0x0127:
            float r13 = r8 + r11
            r10 = r26
            r11 = r8
            r12 = r6
            r14 = r6
            r15 = r3
            r10.drawLine(r11, r12, r13, r14, r15)
        L_0x0132:
            boolean r6 = r2.A0B
            if (r6 == 0) goto L_0x013e
            if (r7 != 0) goto L_0x0148
            int r5 = r2.A05
            int r5 = r5 + -2
            if (r0 == r5) goto L_0x014a
        L_0x013e:
            int r8 = r2.A00
            int r5 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            int r8 = r8 + r5
            int r5 = r2.A07
            int r8 = r8 + r5
            goto L_0x00a8
        L_0x0148:
            if (r0 != r5) goto L_0x013e
        L_0x014a:
            int r5 = r2.A00
            float r6 = (float) r5
            float r5 = r2.A01
            float r6 = r6 * r5
            int r5 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            float r5 = (float) r5
            float r6 = r6 + r5
            int r5 = r2.A07
            float r5 = (float) r5
            float r6 = r6 + r5
            int r8 = (int) r6
            goto L_0x00a8
        L_0x015b:
            if (r7 != 0) goto L_0x0183
            int r10 = r2.A05
            int r10 = r10 - r5
            if (r0 == r10) goto L_0x0185
        L_0x0162:
            int r12 = r2.A00
            int r10 = r12 * r4
            float r10 = (float) r10
            float r16 = r8 + r10
            r13 = r26
            r14 = r8
            r15 = r6
            r17 = r6
            r18 = r3
            r13.drawLine(r14, r15, r16, r17, r18)
            int r10 = r2.A03
            r3.setColor(r10)
            float r11 = r2.A00
            r10 = 1132396544(0x437f0000, float:255.0)
            float r11 = r11 * r10
            int r10 = (int) r11
            r3.setAlpha(r10)
            goto L_0x01d2
        L_0x0183:
            if (r0 != 0) goto L_0x0162
        L_0x0185:
            float r8 = r2.A00
            r6 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 * r6
            int r6 = (int) r8
            r3.setAlpha(r6)
            if (r7 == 0) goto L_0x0195
            int r6 = r2.A05
            int r6 = r6 - r0
            int r19 = r6 + -1
        L_0x0195:
            int r6 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            float r6 = (float) r6
            r15 = 0
            r18 = r9
            r16 = r6
            r17 = r1
            r14 = r26
            r13 = r2
            r13.A05(r14, r15, r16, r17, r18, r19)
            goto L_0x0132
        L_0x01a6:
            if (r0 != r5) goto L_0x00d1
            int r10 = r2.A05
            int r10 = r10 - r0
            int r19 = r10 + -1
        L_0x01ad:
            int r10 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            float r11 = (float) r10
            int r10 = r2.A04
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r18 = r9
            r16 = r11
            r17 = r1
            r14 = r26
            r13 = r2
            r13.A05(r14, r15, r16, r17, r18, r19)
            int r10 = r2.A03
            r3.setColor(r10)
            float r11 = r2.A01
            r10 = 1132396544(0x437f0000, float:255.0)
            float r11 = r11 * r10
            int r10 = (int) r11
            r3.setAlpha(r10)
            int r12 = r2.A00
        L_0x01d2:
            float r11 = (float) r12
            float r10 = r2.A01
            float r11 = r11 * r10
            float r10 = (float) r4
            float r11 = r11 * r10
            goto L_0x0127
        L_0x01da:
            int r6 = r1 - r5
            int r5 = r2.getScrollX()
            int r6 = r6 - r5
            int r5 = r2.getPaddingLeft()
            if (r6 >= r5) goto L_0x008d
            int r5 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            int r6 = r1 - r5
            int r5 = r2.getScrollX()
            int r6 = r6 - r5
            double r12 = (double) r6
            int r5 = r2.getPaddingLeft()
            double r10 = (double) r5
            r18 = 0
            int r5 = com.instagram.ui.widget.pageindicator.CirclePageIndicator.A0N
            double r5 = (double) r5
            r16 = r10
            r20 = r5
            r22 = r18
            r14 = r12
            double r5 = X.AnonymousClass37Q.A04(r14, r16, r18, r20, r22)
            goto L_0x008c
        L_0x0208:
            int r5 = r2.A05
            if (r0 >= r5) goto L_0x0218
            goto L_0x0041
        L_0x020e:
            r4 = 1
            r0 = 0
            goto L_0x0036
        L_0x0212:
            int r1 = r2.getPaddingLeft()
            goto L_0x001a
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.pageindicator.CircleWithProgressPageIndicator.A03(android.graphics.Canvas):void");
    }

    public int getViewWidth() {
        int i = this.A08;
        if (i == -1) {
            i = 0;
        }
        int i2 = this.A05;
        int i3 = CirclePageIndicator.A0N + i;
        return (((((getPaddingLeft() + getPaddingRight()) + ((i2 * 2) * i3)) + ((i2 - 1) * this.A07)) + this.A01) + this.A00) - (i3 * 2);
    }

    public int getTargetScrollPosition() {
        int i;
        int paddingLeft = getPaddingLeft();
        int i2 = this.A05;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                i = 0;
                break;
            }
            int i5 = CirclePageIndicator.A0N;
            int i6 = paddingLeft + i5;
            int i7 = this.A06;
            if (i4 == i7) {
                int i8 = i6 - i5;
                int i9 = this.A07;
                i = this.A00 + i8 + (i9 * 2);
                if (i2 > this.A06) {
                    if (i7 > 1) {
                        i8 -= (i5 * 2) + i9;
                    }
                    if (i7 < i2 - 2) {
                        i += (i5 * 2) + i9;
                    }
                }
                i3 = i8;
            } else {
                paddingLeft = i6 + i5 + this.A07;
                i4++;
            }
        }
        int paddingLeft2 = i3 - getPaddingLeft();
        int width = (i - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircleWithProgressPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        this.A00 = (int) TypedValue.applyDimension(1, 16.0f, displayMetrics);
        this.A01 = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircleWithProgressPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
