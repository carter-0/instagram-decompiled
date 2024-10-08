package com.instagram.ui.widget.pageindicator;

import X.0KC;
import X.0nA;
import X.0qQ;
import X.2Yu;
import X.2cs;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass37Q;
import X.C255913uv;
import X.C71382cm;
import X.SN3;
import X.W49;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class CirclePageIndicator extends C255913uv {
    public static int A0N;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void A04(Canvas canvas) {
        float f = this.A03;
        float height = (((float) canvas.getHeight()) / 2.0f) - f;
        float scrollX = (float) getScrollX();
        float f2 = scrollX + height;
        float width = (scrollX + ((float) canvas.getWidth())) - height;
        Paint paint = this.A0C;
        canvas.drawCircle(f2, ((float) canvas.getHeight()) / 2.0f, height, paint);
        canvas.drawCircle(width, ((float) canvas.getHeight()) / 2.0f, height, paint);
        canvas.drawRect(f2, f, width, ((float) canvas.getHeight()) - f, paint);
    }

    public final void onDraw(Canvas canvas) {
        int paddingLeft;
        int i;
        int i2;
        int i3;
        double d;
        double paddingLeft2;
        double d2;
        double d3;
        double scrollX;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        super.onDraw(canvas2);
        if (this.A0F) {
            if (this.A0G) {
                float scrollX2 = (((float) getScrollX()) + ((float) getPaddingLeft())) - ((float) A0N);
                float paddingTop = (float) (getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2));
                canvas2.drawLine(scrollX2, paddingTop, scrollX2 + (((float) canvas2.getWidth()) - ((float) (getPaddingLeft() * 2))) + ((float) A0N), paddingTop, this.A0D);
            }
            if (this.A0E) {
                float f = this.A02;
                float f2 = this.A04 * this.A01;
                float f3 = f - f2;
                float f4 = this.A00 - f2;
                float scrollX3 = ((float) getScrollX()) + f4;
                float width = ((float) canvas2.getWidth()) - (f4 * 2.0f);
                float height = ((float) canvas2.getHeight()) - (2.0f * f3);
                float f5 = height / 2.0f;
                canvas2.drawRoundRect(new RectF(scrollX3, f3, width + scrollX3, height + f3), f5, f5, this.A09);
            }
            boolean z = this.A0H;
            if (z) {
                paddingLeft = getWidth() - getPaddingRight();
            } else {
                paddingLeft = getPaddingLeft();
            }
            int paddingTop2 = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
            int i4 = A0N;
            double d4 = ((double) i4) * 1.5d;
            if (z) {
                i = -1;
                i2 = this.A05 - 1;
            } else {
                i = 1;
                i2 = 0;
            }
            while (true) {
                if (z) {
                    if (i2 < 0) {
                        return;
                    }
                } else if (i2 >= this.A05) {
                    return;
                }
                int i5 = paddingLeft + (i4 * i);
                float f6 = (float) i4;
                int i6 = this.A06;
                if (!(i2 == i6 || (i2 == 0 && i6 == 1))) {
                    int i7 = this.A05;
                    if (!(i2 == i7 - 1 && i6 == i7 - 2) && i7 > this.A06) {
                        if (((double) ((i4 + i5) - getScrollX())) > ((double) (getWidth() - getPaddingRight())) - d4) {
                            double scrollX4 = (double) ((A0N + i5) - getScrollX());
                            d = 0.0d;
                            paddingLeft2 = ((double) (getWidth() - getPaddingRight())) - d4;
                            d2 = ((double) getWidth()) - d4;
                            d3 = (double) A0N;
                            scrollX = scrollX4;
                        } else if (((double) ((i5 - A0N) - getScrollX())) < ((double) getPaddingLeft()) + d4) {
                            d = 0.0d;
                            paddingLeft2 = ((double) getPaddingLeft()) + d4;
                            d2 = d4;
                            d3 = (double) A0N;
                            scrollX = (double) ((i5 - A0N) - getScrollX());
                        }
                        f6 = (float) AnonymousClass37Q.A04(scrollX, paddingLeft2, d2, d3, d);
                    }
                }
                if (f6 != 0.0f) {
                    if (z) {
                        i3 = (this.A05 - i2) - 1;
                    } else {
                        i3 = i2;
                    }
                    Canvas canvas3 = canvas2;
                    A05(canvas3, (Integer) null, f6 * 0.875f, i5, paddingTop2, i3);
                }
                i4 = A0N;
                paddingLeft = i5 + ((this.A07 + i4) * i);
                i2 += i;
            }
        } else {
            A03(canvas2);
        }
    }

    /* access modifiers changed from: private */
    public final void setBackgroundScale(float f) {
        this.A01 = f;
        invalidate();
    }

    public void A03(Canvas canvas) {
        int paddingLeft;
        int i;
        int i2;
        int i3;
        double d;
        double d2;
        double d3;
        double d4;
        double scrollX;
        Canvas canvas2 = canvas;
        if (this.A0E) {
            A04(canvas2);
        }
        boolean z = this.A0H;
        if (z) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2);
        if (z) {
            i = -1;
            i2 = this.A05 - 1;
        } else {
            i = 1;
            i2 = 0;
        }
        while (true) {
            if (z) {
                if (i2 < 0) {
                    return;
                }
            } else if (i2 >= this.A05) {
                return;
            }
            int i4 = A0N;
            int i5 = paddingLeft + (i4 * i);
            float f = (float) i4;
            if (this.A05 > this.A06) {
                if ((i4 + i5) - getScrollX() > getWidth() - getPaddingRight()) {
                    double scrollX2 = (double) ((A0N + i5) - getScrollX());
                    d3 = 0.0d;
                    d = (double) getWidth();
                    d2 = (double) A0N;
                    d4 = (double) (getWidth() - getPaddingRight());
                    scrollX = scrollX2;
                } else if ((i5 - A0N) - getScrollX() < getPaddingLeft()) {
                    double paddingLeft2 = (double) getPaddingLeft();
                    d = 0.0d;
                    d2 = (double) A0N;
                    d3 = 0.0d;
                    d4 = paddingLeft2;
                    scrollX = (double) ((i5 - A0N) - getScrollX());
                }
                f = (float) AnonymousClass37Q.A04(scrollX, d4, d, d2, d3);
            }
            if (z) {
                i3 = (this.A05 - i2) - 1;
            } else {
                i3 = i2;
            }
            A05(canvas2, (Integer) null, f, i5, paddingTop, i3);
            paddingLeft = i5 + ((A0N + this.A07) * i);
            i2 += i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.graphics.Canvas r18, java.lang.Integer r19, float r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r10 = r17
            r2 = r20
            boolean r0 = r10.A09
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            r4 = r18
            r3 = r21
            r1 = r22
            r9 = r23
            if (r0 == 0) goto L_0x0095
            float r0 = r10.A02
            double r7 = (double) r0
            double r5 = java.lang.Math.floor(r7)
            int r11 = (int) r5
            double r5 = java.lang.Math.ceil(r7)
            int r7 = (int) r5
            int r5 = r10.A06
            float r6 = (float) r7
            if (r11 != r5) goto L_0x0027
            r6 = r0
            float r0 = (float) r11
        L_0x0027:
            float r6 = r6 - r0
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.Int"
            if (r9 != r5) goto L_0x007f
            android.graphics.Paint r0 = r10.A0F
            android.animation.ArgbEvaluator r13 = r10.A0E
            int r5 = r10.A03
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            int r5 = r10.A04
        L_0x0038:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r13.evaluate(r6, r8, r5)
            X.0qQ.A0C(r5, r12)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L_0x0049:
            r0.setColor(r5)
            int r5 = r10.A06
            if (r9 != r5) goto L_0x0068
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            double r7 = (double) r5
            r9 = 0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            float r5 = r20 * r14
            double r13 = (double) r5
            double r5 = (double) r2
            r15 = r5
            double r5 = X.AnonymousClass37Q.A04(r7, r9, r11, r13, r15)
        L_0x0061:
            float r2 = (float) r5
            float r3 = (float) r3
            float r1 = (float) r1
        L_0x0064:
            r4.drawCircle(r3, r1, r2, r0)
            return
        L_0x0068:
            if (r9 == r11) goto L_0x0071
            if (r9 == r7) goto L_0x0071
            float r3 = (float) r3
            float r1 = (float) r1
            float r2 = r20 * r14
            goto L_0x0064
        L_0x0071:
            double r6 = (double) r6
            float r5 = r20 * r14
            double r12 = (double) r5
            double r14 = (double) r2
            r8 = 0
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = X.AnonymousClass37Q.A04(r6, r8, r10, r12, r14)
            goto L_0x0061
        L_0x007f:
            if (r9 == r11) goto L_0x0088
            if (r9 == r7) goto L_0x0088
            android.graphics.Paint r0 = r10.A0F
            int r5 = r10.A04
            goto L_0x0049
        L_0x0088:
            android.graphics.Paint r0 = r10.A0F
            android.animation.ArgbEvaluator r13 = r10.A0E
            int r5 = r10.A04
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            int r5 = r10.A03
            goto L_0x0038
        L_0x0095:
            int r0 = r10.A06
            if (r9 == r0) goto L_0x00a2
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x00ef
            r0 = 1064514355(0x3f733333, float:0.95)
            float r2 = r20 * r0
        L_0x00a2:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r10.A0E
            if (r0 != 0) goto L_0x00b5
            float r7 = (float) r3
            float r6 = (float) r1
            int r0 = r10.A08
            float r5 = (float) r0
            float r5 = r5 + r2
            android.graphics.Paint r0 = r10.A0A
            r4.drawCircle(r7, r6, r5, r0)
        L_0x00b5:
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x00c8
            float r7 = (float) r3
            float r6 = (float) r1
            int r0 = r10.A05
            float r5 = (float) r0
            float r5 = r5 + r2
            android.graphics.Paint r0 = r10.A0B
            r4.drawCircle(r7, r6, r5, r0)
        L_0x00c8:
            android.graphics.Paint r6 = r10.A0F
            if (r19 == 0) goto L_0x00d9
            int r0 = r19.intValue()
        L_0x00d0:
            r6.setColor(r0)
            float r3 = (float) r3
            float r0 = (float) r1
            r4.drawCircle(r3, r0, r2, r6)
            return
        L_0x00d9:
            int r5 = r10.A06
            boolean r0 = r10.A0A
            if (r9 != r5) goto L_0x00e7
            if (r0 == 0) goto L_0x00e4
            int r0 = r10.A0L
            goto L_0x00d0
        L_0x00e4:
            int r0 = r10.A03
            goto L_0x00d0
        L_0x00e7:
            if (r0 == 0) goto L_0x00ec
            int r0 = r10.A0M
            goto L_0x00d0
        L_0x00ec:
            int r0 = r10.A04
            goto L_0x00d0
        L_0x00ef:
            float r2 = r20 * r14
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.pageindicator.CirclePageIndicator.A05(android.graphics.Canvas, java.lang.Integer, float, int, int, int):void");
    }

    public int getCurrentPage() {
        return this.A06;
    }

    public boolean getGestureInProgress() {
        return this.A0E;
    }

    public final int getShadowRadius() {
        return this.A08;
    }

    public final void onMeasure(int i, int i2) {
        String str;
        int i3 = this.A08;
        if (i3 == -1) {
            i3 = 0;
        }
        if (this.A0F) {
            i2 = View.MeasureSpec.makeMeasureSpec(((A0N + i3) * 2) + getPaddingTop() + getPaddingBottom(), SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int viewWidth = getViewWidth();
            if (mode == Integer.MIN_VALUE && viewWidth > size) {
                viewWidth = size;
            }
            size = viewWidth;
            int i4 = this.A07;
            if (i4 != -1 && size > i4) {
                size = i4;
            }
        }
        int i5 = this.A07;
        if (i5 != -1 && size > i5) {
            size = i5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("pageCount ");
        sb.append(this.A05);
        sb.append(" width ");
        sb.append(size);
        sb.append(" (");
        if (mode == Integer.MIN_VALUE) {
            str = "ATMOST";
        } else if (mode != 1073741824) {
            str = "UNSET";
        } else {
            str = "EXACTLY";
        }
        sb.append(str);
        sb.append("), ");
        sb.append(i5);
        0KC.A0C("CirclePageIndicator", sb.toString());
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int paddingTop = ((A0N + i3) * 2) + getPaddingTop() + getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setCurrentPage(int i) {
        this.A06 = i;
        double targetScrollPosition = (double) getTargetScrollPosition();
        AnonymousClass0eM r5 = this.A0G;
        if (targetScrollPosition != ((2cs) r5.getValue()).A01) {
            ((2cs) r5.getValue()).A06(targetScrollPosition);
        }
        invalidate();
    }

    public void setGestureInProgress(boolean z) {
        if (this.A0F) {
            float f = 0.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
            ofFloat.addUpdateListener(new W49(this));
            ofFloat.setDuration(100);
            ofFloat.start();
        }
        this.A0E = z;
        invalidate();
    }

    public final void A02(int i) {
        setCurrentPage(i);
        setScrollX(0);
        ((2cs) this.A0G.getValue()).A08((double) getTargetScrollPosition(), true);
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
            int i5 = A0N;
            int i6 = paddingLeft + i5;
            int i7 = this.A06;
            if (i4 == i7) {
                int i8 = i6 - i5;
                int i9 = i5 * 2;
                i = i9 + i8;
                if (this.A0F) {
                    if (i7 != 0) {
                        i8 -= this.A07 + i9;
                    }
                    if (i7 != i2 - 1) {
                        i += i9 + this.A07;
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

    public int getViewWidth() {
        int i = this.A05;
        return getPaddingLeft() + getPaddingRight() + (i * 2 * A0N) + ((i - 1) * this.A07);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-643988674);
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        ((2cs) this.A0G.getValue()).A08((double) getTargetScrollPosition(), true);
        AnonymousClass0fD.A0D(191314593, A062);
    }

    public final void setShadowRadius(int i) {
        this.A08 = i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        this.A0K = context2.getColor(R.color.grey_5);
        this.A07 = -1;
        this.A08 = -1;
        this.A0C = new Paint(1);
        this.A09 = new Paint(1);
        this.A0D = new Paint(1);
        this.A0A = new Paint(1);
        this.A0B = new Paint(1);
        this.A05 = -1;
        this.A0L = context2.getColor(R.color.black_50_transparent);
        this.A0M = context2.getColor(R.color.black_20_transparent);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0E, 0, i);
        0qQ.A07(obtainStyledAttributes);
        try {
            int i2 = this.A0K;
            setActiveColor(obtainStyledAttributes.getColor(0, i2));
            setInactiveColor(obtainStyledAttributes.getColor(3, i2));
            int i3 = this.A0D;
            A0N = obtainStyledAttributes.getDimensionPixelSize(1, i3);
            this.A07 = obtainStyledAttributes.getDimensionPixelOffset(2, i3);
            this.A06 = obtainStyledAttributes.getInt(8, 5);
            this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.A08 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.A0F = obtainStyledAttributes.getBoolean(7, false);
            this.A0G = obtainStyledAttributes.getBoolean(9, true);
            this.A0H = obtainStyledAttributes.getBoolean(10, false);
            this.A0I = obtainStyledAttributes.getBoolean(11, false);
            this.A0J = obtainStyledAttributes.getBoolean(12, false);
            obtainStyledAttributes.recycle();
            Paint paint = this.A09;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setColor(context.getColor(R.color.context_line_color));
            paint.setAlpha(80);
            if (this.A0F) {
                if (this.A0G) {
                    Paint paint2 = this.A0D;
                    paint2.setColor(context.getColor(R.color.black_10_transparent));
                    paint2.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
                    paint2.setStrokeWidth((float) (A0N * 2));
                }
                if (this.A0H) {
                    Paint paint3 = this.A0A;
                    paint3.setColor(context.getColor(this.A0J ? R.color.black_5_transparent : R.color.black_15_transparent));
                    paint3.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
                }
                if (this.A0I) {
                    this.A0B.setColor(context.getColor(R.color.black_5_transparent));
                    this.A05 = 2;
                }
            }
            this.A00 = 0nA.A00(context, 4.0f);
            this.A02 = 0nA.A00(context, 20.0f);
            this.A04 = 0nA.A04(context, 4);
            Paint paint4 = this.A0C;
            paint4.setStyle(style);
            paint4.setColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_highlight_background)));
            this.A03 = 0nA.A04(context, 6);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
