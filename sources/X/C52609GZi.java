package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.GZi  reason: case insensitive filesystem */
public final class C52609GZi extends View implements C252203oj {
    public float A00;
    public int A01;
    public int A02;
    public C61074JwC A03 = new C61074JwC(22, (Object) null, (Object) null, (Object) null, (Object) null);
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E = 5;
    public final int A0F;
    public final int A0G;
    public final Paint A0H = AnonymousClass7TE.A0V(1);
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(C52650GaO.A00);
    public final boolean A0J = 0mk.A02(getContext());
    public final int A0K;

    public C52609GZi(Context context) {
        super(context, (AttributeSet) null, 0);
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        int applyDimension = (int) TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.A0D = applyDimension;
        this.A08 = TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        this.A09 = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.A0F = applyDimension * 2;
        this.A0K = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        this.A0C = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        this.A0G = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        this.A0A = context.getColor(R.color.design_dark_default_color_on_background);
        this.A0B = context.getColor(R.color.bright_foreground_disabled_material_dark);
    }

    public final void A00() {
        setCurrentIndex(0);
        setIndicatorCount(0);
        this.A06 = false;
        this.A07 = false;
        setCarouselIndicatorViewBoxConfig(new C61074JwC(22, (Object) null, (Object) null, (Object) null, (Object) null));
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        int i;
        double d;
        0qQ.A0B(r5, 0);
        if (this.A02 > this.A0E) {
            if (this.A0J) {
                d = 1.0d - r5.A09.A00;
            } else {
                d = r5.A09.A00;
            }
            i = AnonymousClass1GB.A00(d);
        } else {
            i = 0;
        }
        setScrollX(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a5, code lost:
        if (r6 == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0176, code lost:
        if (r12 == r0) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r26) {
        /*
            r25 = this;
            r7 = 0
            r8 = r26
            X.0qQ.A0B(r8, r7)
            r9 = r25
            super.onDraw(r8)
            boolean r6 = r9.A0J
            if (r6 == 0) goto L_0x0195
            int r5 = r9.getWidth()
            int r0 = r9.getPaddingRight()
            int r5 = r5 - r0
        L_0x0018:
            int r4 = r9.getPaddingTop()
            int r1 = r9.getMeasuredHeight()
            int r0 = r9.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r9.getPaddingBottom()
            int r1 = r1 - r0
            int r0 = r1 / 2
            int r4 = r4 + r0
            r3 = 1
            if (r6 == 0) goto L_0x018d
            r2 = -1
            int r1 = r9.A02
            int r1 = r1 - r3
        L_0x0034:
            if (r1 < 0) goto L_0x019b
        L_0x0036:
            int r11 = r9.A0D
            int r0 = r11 * r2
            int r5 = r5 + r0
            int r13 = r9.A0F
            int r18 = r11 + r13
            int r15 = r9.A01
            if (r1 != r15) goto L_0x00a8
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r9.A07
            if (r0 != 0) goto L_0x00a8
            android.graphics.Paint r10 = r9.A0H
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r11 = r0.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r11)
            r10.setStrokeWidth(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r10.setStrokeCap(r0)
            int r0 = r9.A0B
            r10.setColor(r0)
            float r12 = (float) r5
            float r11 = (float) r4
            int r13 = r9.A0C
            int r0 = r13 * r2
            float r0 = (float) r0
            float r22 = r12 + r0
            r19 = r8
            r20 = r12
            r21 = r11
            r23 = r11
            r24 = r10
            r19.drawLine(r20, r21, r22, r23, r24)
            int r0 = r9.A0A
            r10.setColor(r0)
            float r14 = (float) r13
            float r0 = r9.A00
            float r14 = r14 * r0
            float r0 = (float) r2
            float r14 = r14 * r0
        L_0x008f:
            float r22 = r12 + r14
            r19 = r8
            r20 = r12
            r21 = r11
            r23 = r11
            r24 = r10
            r19.drawLine(r20, r21, r22, r23, r24)
            int r18 = r18 + r13
        L_0x00a0:
            int r18 = r18 * r2
            int r5 = r5 + r18
            int r1 = r1 + r2
            if (r6 == 0) goto L_0x018f
            goto L_0x0034
        L_0x00a8:
            if (r1 != r15) goto L_0x00dd
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x00dd
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x00dd
            android.graphics.Paint r10 = r9.A0H
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r11 = r0.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            r0 = 1086324736(0x40c00000, float:6.0)
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r11)
            r10.setStrokeWidth(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r10.setStrokeCap(r0)
            float r12 = (float) r5
            float r11 = (float) r4
            int r0 = r9.A0A
            r10.setColor(r0)
            int r13 = r9.A0G
            int r0 = r13 * r2
            float r14 = (float) r0
            goto L_0x008f
        L_0x00dd:
            if (r6 == 0) goto L_0x018a
            int r12 = r9.A02
            int r12 = r12 - r1
            int r12 = r12 - r3
        L_0x00e3:
            int r14 = r9.A02
            int r0 = r9.A0E
            r10 = 0
            if (r14 <= r0) goto L_0x0178
            if (r12 == r15) goto L_0x0178
            int r0 = r9.getScrollX()
            int r15 = r5 - r0
            int r0 = r11 * 2
            int r13 = r13 + r0
            int r17 = r15 - r13
            int r14 = r15 + r13
            int r16 = r17 - r13
            int r13 = r13 + r14
            if (r15 < 0) goto L_0x016b
            int r0 = r9.getWidth()
            if (r15 > r0) goto L_0x016b
            int r0 = r9.getWidth()
            if (r14 <= r0) goto L_0x016d
            int r0 = r9.A01
            int r0 = r0 + 1
        L_0x010e:
            if (r12 == r0) goto L_0x0187
            float r13 = r9.A09
        L_0x0112:
            X.JwC r11 = r9.A03
            java.lang.Object r0 = r11.A03
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0169
            float r14 = r0.floatValue()
        L_0x011e:
            java.lang.Object r0 = r11.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = X.AnonymousClass7TG.A0A(r0)
            android.graphics.Paint r11 = r9.A0H
            r11.setShadowLayer(r14, r10, r10, r0)
            X.JwC r14 = r9.A03
            java.lang.Object r0 = r14.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0137
            float r10 = r0.floatValue()
        L_0x0137:
            java.lang.Object r0 = r14.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r14 = X.C51967G9n.A04(r0, r7)
            int r0 = r9.A01
            if (r12 != r0) goto L_0x0153
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r11.setStyle(r0)
            r11.setStrokeWidth(r10)
            r11.setColor(r14)
            float r10 = (float) r5
            float r0 = (float) r4
            r8.drawCircle(r10, r0, r13, r11)
        L_0x0153:
            X.AnonymousClass7TE.A1Q(r11)
            int r0 = r9.A01
            if (r12 != r0) goto L_0x0166
            int r0 = r9.A0A
        L_0x015c:
            r11.setColor(r0)
            float r10 = (float) r5
            float r0 = (float) r4
            r8.drawCircle(r10, r0, r13, r11)
            goto L_0x00a0
        L_0x0166:
            int r0 = r9.A0B
            goto L_0x015c
        L_0x0169:
            r14 = 0
            goto L_0x011e
        L_0x016b:
            r13 = 0
            goto L_0x0112
        L_0x016d:
            int r0 = r9.getWidth()
            if (r13 <= r0) goto L_0x017a
            int r0 = r9.A01
            int r0 = r0 - r3
        L_0x0176:
            if (r12 != r0) goto L_0x0187
        L_0x0178:
            float r13 = (float) r11
            goto L_0x0112
        L_0x017a:
            if (r17 >= 0) goto L_0x0180
            int r0 = r9.A01
            int r0 = r0 - r3
            goto L_0x010e
        L_0x0180:
            if (r16 >= 0) goto L_0x0178
            int r0 = r9.A01
            int r0 = r0 + 1
            goto L_0x0176
        L_0x0187:
            float r13 = r9.A08
            goto L_0x0112
        L_0x018a:
            r12 = r1
            goto L_0x00e3
        L_0x018d:
            r2 = 1
            r1 = 0
        L_0x018f:
            int r0 = r9.A02
            if (r1 >= r0) goto L_0x019b
            goto L_0x0036
        L_0x0195:
            int r5 = r9.getPaddingLeft()
            goto L_0x0018
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52609GZi.onDraw(android.graphics.Canvas):void");
    }

    public void setCarouselIndicatorViewBoxConfig(C61074JwC jwC) {
        0qQ.A0B(jwC, 0);
        this.A03 = jwC;
        invalidate();
    }

    public final void setCarouselViewBoxConfig(C61074JwC jwC) {
        0qQ.A0B(jwC, 0);
        this.A03 = jwC;
    }

    public final C61074JwC getCarouselViewBoxConfig() {
        return this.A03;
    }

    public int getCurrentIndex() {
        return this.A01;
    }

    public final boolean getHasInterruptedAutoAdvanceByUser() {
        return this.A04;
    }

    public final int getIndicatorCount() {
        return this.A02;
    }

    public final Paint getPaint() {
        return this.A0H;
    }

    public final AnonymousClass0eM getScrollSpring() {
        return this.A0I;
    }

    public final int getScrollingItemCountThreshold() {
        return this.A0E;
    }

    public final void setIndicatorCount(int i) {
        this.A02 = i;
        invalidate();
    }

    private final int getTargetScrollPosition() {
        int paddingLeft = getPaddingLeft();
        int i = this.A0D * 2;
        int i2 = i + this.A0F;
        int i3 = this.A01;
        int i4 = paddingLeft + (i2 * i3);
        if (!this.A04 && this.A06 && !this.A07) {
            i = this.A0C;
        }
        int i5 = i + i4;
        int i6 = this.A02;
        if (i6 > this.A0E) {
            if (i3 > 0) {
                i4 -= i2;
                if (i3 > 1) {
                    i4 -= i2;
                }
            }
            if (i3 < i6 - 1) {
                i5 += i2;
                if (i3 < i6 - 2) {
                    i5 += i2;
                }
            }
        }
        int paddingLeft2 = i4 - getPaddingLeft();
        int width = (i5 - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(2074825991);
        super.onAttachedToWindow();
        AnonymousClass0eM r2 = this.A0I;
        setScrollX(AnonymousClass1GB.A00(((2cs) r2.getValue()).A01));
        ((2cs) r2.getValue()).A0A(this);
        AnonymousClass0fD.A0D(1887324801, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-607200954);
        super.onDetachedFromWindow();
        2cs r0 = (2cs) this.A0I.getValue();
        r0.A01();
        r0.A0B(this);
        AnonymousClass0fD.A0D(-889329517, A062);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.A02;
        int i5 = this.A0E;
        if (i4 > i5) {
            i4 = i5;
        }
        int i6 = i4 - 1;
        int i7 = this.A0D;
        int paddingLeft = getPaddingLeft() + getPaddingRight() + (i6 * 2 * i7) + (i6 * this.A0F);
        boolean z = this.A04;
        if (!z && this.A06 && !this.A07) {
            i3 = this.A0C;
        } else if (z || !this.A06 || !this.A07) {
            i3 = i7 * 2;
        } else {
            i3 = this.A0G;
        }
        int i8 = paddingLeft + i3;
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && i8 > size) {
            i8 = size;
        }
        int i9 = this.A0K;
        if (i8 > i9) {
            i8 = i9;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingTop = (i7 * 2) + getPaddingTop() + getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE && paddingTop > size2) {
                paddingTop = size2;
            }
            size2 = paddingTop;
        }
        setMeasuredDimension(i8, size2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(2070961006);
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        ((2cs) this.A0I.getValue()).A08((double) getTargetScrollPosition(), true);
        AnonymousClass0fD.A0D(-114790172, A062);
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        this.A0H.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public void setCurrentIndex(int i) {
        this.A01 = C51970G9q.A07(i, i);
        double targetScrollPosition = (double) getTargetScrollPosition();
        AnonymousClass0eM r5 = this.A0I;
        if (targetScrollPosition != ((2cs) r5.getValue()).A01) {
            ((2cs) r5.getValue()).A06(targetScrollPosition);
        }
        invalidate();
    }

    public final void setCarouselDPAGrid(boolean z) {
        this.A05 = z;
    }

    public final void setCarouselProgressDotsStyle(boolean z) {
        this.A06 = z;
    }

    public final void setCarouselVideoScrubberEnabledForCurrentMedia(boolean z) {
        this.A07 = z;
    }

    public final void setHasInterruptedAutoAdvanceByUser(boolean z) {
        this.A04 = z;
    }
}
