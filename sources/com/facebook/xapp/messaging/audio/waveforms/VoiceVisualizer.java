package com.facebook.xapp.messaging.audio.waveforms;

import X.0eP;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass1GB;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13989Tnp;
import X.C51969G9p;
import X.C71382cm;
import X.DbT;
import X.JTT;
import X.W4Q;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class VoiceVisualizer extends View {
    public static final List A0M;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final float A0B;
    public final Paint A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final RectF A0K;
    public final AttributeSet A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0L = attributeSet;
        this.A05 = 100;
        this.A0E = new ArrayList();
        this.A0F = new ArrayList();
        this.A0D = new ArrayList();
        Paint paint = new Paint(5);
        this.A0I = paint;
        Paint paint2 = new Paint(5);
        this.A0J = paint2;
        Paint paint3 = new Paint(5);
        this.A0C = paint3;
        Paint paint4 = new Paint(5);
        this.A0H = paint4;
        this.A0K = new RectF();
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
        paint3.setStrokeCap(cap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2R, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        try {
            setSegmentColor(obtainStyledAttributes.getInt(2, -1));
            setSegmentStridePx(6.0f);
            setSegmentWidthPx(3.0f);
            this.A0G = (float) obtainStyledAttributes.getDimensionPixelOffset(3, (int) TypedValue.applyDimension(1, 2.0f, AnonymousClass7TF.A0E(context)));
            this.A0B = (float) obtainStyledAttributes.getDimensionPixelOffset(1, (int) TypedValue.applyDimension(1, 4.0f, AnonymousClass7TF.A0E(context)));
            paint4.setColor(obtainStyledAttributes.getInt(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final boolean A01(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, int i) {
        float f6 = f4 - f3;
        float max = Math.max(0.01f, f2) * f6 * f;
        float f7 = f5 - (this.A01 * ((float) i));
        float f8 = f3 + ((f6 - max) / 2.0f);
        float f9 = this.A02;
        if (f7 < ((float) getPaddingLeft()) - f9) {
            return false;
        }
        paint.setStrokeWidth(f9 * f);
        float f10 = f8 + max;
        canvas.drawLine(f7, f8, f7, f10, paint);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015e, code lost:
        if (r9.size() == r7.A04) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r10 = 0
            r6 = r19
            X.0qQ.A0B(r6, r10)
            r7 = r18
            super.onDraw(r6)
            java.util.List r1 = r7.A0E
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x001c
            java.util.List r0 = r7.A0F
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0152
            int r2 = r1.size()
            java.lang.Object r0 = X.00k.A0K(r1)
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            java.lang.Object r1 = r0.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            float r1 = X.C51970G9q.A04(r1, r0)
        L_0x003a:
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x013c
            android.graphics.Paint r8 = r7.A0J
            r7.A00(r6, r8, r1, r2)
            r6.save()
            android.graphics.RectF r0 = r7.A0K
            r6.clipRect(r0)
            float r5 = r0.left
            r11 = 0
            float r4 = r0.right
            float r3 = r0.bottom
            android.graphics.Paint r0 = r7.A0H
            r10 = r5
            r12 = r4
            r13 = r3
            r14 = r0
            r9 = r6
            r9.drawRect(r10, r11, r12, r13, r14)
            java.util.List r0 = r7.A0D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0068
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x006a
        L_0x0068:
            android.graphics.Paint r8 = r7.A0I
        L_0x006a:
            r7.A00(r6, r8, r1, r2)
            r6.restore()
        L_0x0070:
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0102
            float r9 = r7.A0B
            int r0 = r7.getWidth()
            float r4 = (float) r0
            float r4 = r4 - r9
            int r0 = r7.getWidth()
            float r3 = (float) r0
            float r0 = r7.A00
            float r3 = r3 * r0
            float r0 = java.lang.Math.max(r9, r3)
            float r11 = java.lang.Math.min(r0, r4)
            int r0 = r7.getPaddingTop()
            float r8 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r9 / r0
            float r8 = r8 + r3
            int r0 = X.C13989Tnp.A0F(r7)
            float r5 = (float) r0
            float r5 = r5 - r3
            android.graphics.Paint r4 = r7.A0C
            r4.setStrokeWidth(r9)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setColor(r0)
            r0 = 64
            r4.setAlpha(r0)
            android.graphics.BlurMaskFilter$Blur r9 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r3 = 1092616192(0x41200000, float:10.0)
            android.graphics.BlurMaskFilter r0 = new android.graphics.BlurMaskFilter
            r0.<init>(r3, r9)
            r4.setMaskFilter(r0)
            r12 = r8
            r13 = r11
            r14 = r5
            r15 = r4
            r10 = r6
            r10.drawLine(r11, r12, r13, r14, r15)
            r0 = 38
            r4.setAlpha(r0)
            r3 = 1090519040(0x41000000, float:8.0)
            android.graphics.BlurMaskFilter r0 = new android.graphics.BlurMaskFilter
            r0.<init>(r3, r9)
            r4.setMaskFilter(r0)
            r0 = 1077936128(0x40400000, float:3.0)
            float r13 = r11 + r0
            r12 = r6
            r14 = r8
            r15 = r13
            r16 = r5
            r17 = r4
            r12.drawLine(r13, r14, r15, r16, r17)
            r0 = 255(0xff, float:3.57E-43)
            r4.setAlpha(r0)
            r0 = -1
            r4.setColor(r0)
            r0 = 0
            r4.setMaskFilter(r0)
            r12 = r8
            r13 = r11
            r14 = r5
            r15 = r4
            r10.drawLine(r11, r12, r13, r14, r15)
            java.lang.String r0 = "scrubbing_handle"
            r7.setTag(r0)
            float r3 = r7.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = ""
            r7.setTag(r0)
        L_0x0102:
            float r0 = r7.A00
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x013a
            float r8 = r7.A0B
        L_0x010f:
            boolean r5 = r7.A0A
            if (r5 == 0) goto L_0x0138
            android.graphics.RectF r0 = r7.A0K
            float r4 = r0.left
        L_0x0117:
            int r0 = r7.getWidth()
            float r3 = (float) r0
            float r0 = r7.A00
            float r3 = r3 * r0
            float r3 = r3 - r8
            if (r5 == 0) goto L_0x012a
            android.graphics.RectF r0 = r7.A0K
            float r0 = r0.right
            float r3 = java.lang.Math.min(r3, r0)
        L_0x012a:
            int r0 = r7.getHeight()
            float r0 = (float) r0
            r6.clipRect(r4, r9, r3, r0)
            android.graphics.Paint r0 = r7.A0I
            r7.A00(r6, r0, r1, r2)
            return
        L_0x0138:
            r4 = 0
            goto L_0x0117
        L_0x013a:
            r8 = 0
            goto L_0x010f
        L_0x013c:
            java.util.List r0 = r7.A0D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x014f
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x014f
            android.graphics.Paint r0 = r7.A0J
        L_0x014a:
            r7.A00(r6, r0, r1, r2)
            goto L_0x0070
        L_0x014f:
            android.graphics.Paint r0 = r7.A0I
            goto L_0x014a
        L_0x0152:
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0168
            java.util.List r9 = r7.A0D
            int r1 = r9.size()
            int r0 = r7.A04
            if (r1 != r0) goto L_0x0168
        L_0x0160:
            int r2 = r9.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003a
        L_0x0168:
            java.util.List r9 = r7.A0D
            r9.clear()
            int r1 = r7.A04
            java.util.List r11 = r7.A0F
            int r0 = r11.size()
            if (r1 != r0) goto L_0x017d
            r9.addAll(r11)
        L_0x017a:
            r7.A06 = r10
            goto L_0x0160
        L_0x017d:
            int r13 = r7.A04
            if (r13 <= 0) goto L_0x017a
            r16 = 1
            int r0 = r11.size()
            float r14 = (float) r0
            float r0 = (float) r13
            float r14 = r14 / r0
            r9.clear()
            java.lang.Object r0 = r11.get(r10)
            r9.add(r0)
            int r12 = r13 + -1
            r8 = 1
        L_0x0197:
            if (r8 >= r12) goto L_0x01dc
            float r0 = (float) r8
            float r0 = r0 * r14
            double r4 = (double) r0
            double r2 = java.lang.Math.floor(r4)
            double r0 = java.lang.Math.ceil(r4)
            int r15 = (int) r0
            int r0 = (int) r2
            double r4 = r4 - r2
            float r2 = (float) r4
            int r1 = r11.size()
            if (r0 >= r1) goto L_0x01d5
            int r1 = r11.size()
            if (r15 >= r1) goto L_0x01d5
            java.lang.Object r0 = r11.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Object r0 = r11.get(r15)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L_0x01cf:
            r9.add(r0)
            int r8 = r8 + 1
            goto L_0x0197
        L_0x01d5:
            int r0 = r8 + -1
            java.lang.Object r0 = r9.get(r0)
            goto L_0x01cf
        L_0x01dc:
            r0 = 2
            if (r13 < r0) goto L_0x017a
            r0 = r16
            int r0 = X.DbT.A02(r11, r0)
            java.lang.Object r0 = r11.get(r0)
            r9.add(r0)
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer.onDraw(android.graphics.Canvas):void");
    }

    static {
        Float valueOf = Float.valueOf(0.5f);
        Float valueOf2 = Float.valueOf(0.1875f);
        Float valueOf3 = Float.valueOf(0.375f);
        Float valueOf4 = Float.valueOf(0.75f);
        Float valueOf5 = Float.valueOf(1.0f);
        Float valueOf6 = Float.valueOf(0.25f);
        ImmutableList of = ImmutableList.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf, valueOf5, valueOf5, valueOf4, valueOf6, valueOf3, valueOf4, valueOf5, valueOf5, valueOf, valueOf4, valueOf5, valueOf4, valueOf4, valueOf, valueOf6, valueOf6, valueOf3, valueOf, valueOf5, valueOf4, valueOf, valueOf, valueOf4, valueOf6, valueOf, valueOf4, valueOf5, valueOf, valueOf6, valueOf4);
        0qQ.A07(of);
        A0M = of;
    }

    private final void A00(Canvas canvas, Paint paint, float f, int i) {
        float f2 = this.A0G;
        float f3 = f2 + (this.A02 / 2.0f);
        float height = (((float) getHeight()) - f2) - (this.A02 / 2.0f);
        int i2 = i - 1;
        float paddingLeft = ((float) getPaddingLeft()) + (((float) i2) * this.A01) + (this.A02 / 2.0f);
        int A0G2 = C13989Tnp.A0G(this);
        List list = this.A0E;
        boolean A1b = AnonymousClass7TE.A1b(list);
        float f4 = (float) A0G2;
        float f5 = this.A02 / 2.0f;
        if (A1b) {
            f4 += f5;
            f5 = this.A01 * f;
        }
        float min = Math.min(paddingLeft, f4 - f5);
        int i3 = 0;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (AnonymousClass7TE.A1b(this.A0F)) {
            while (-1 < i2) {
                A01(canvas2, paint2, 1.0f, ((Number) this.A0D.get(i2)).floatValue(), f3, height, min, i3);
                i3++;
                i2--;
            }
            return;
        }
        while (-1 < i2) {
            Object animatedValue = ((ValueAnimator) ((0eP) list.get(i2)).A01).getAnimatedValue();
            0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            if (A01(canvas2, paint2, ((Number) animatedValue).floatValue(), ((Number) ((0eP) list.get(i2)).A00).floatValue(), f3, height, min, i3)) {
                i3++;
                i2--;
            } else {
                return;
            }
        }
    }

    private final float getSegmentSpacingPx() {
        return this.A01 - this.A02;
    }

    public final void A02(float f) {
        if (this.A0F.isEmpty()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C51969G9p.A10(ofFloat);
            ofFloat.setDuration((long) this.A05);
            W4Q.A00(ofFloat, this, 1);
            this.A0E.add(new 0eP(Float.valueOf(f), ofFloat));
            ofFloat.start();
            return;
        }
        throw DbT.A0m();
    }

    public final void A03(float f, float f2) {
        RectF rectF = this.A0K;
        rectF.left = f + ((float) getPaddingLeft());
        rectF.right = f2 - ((float) getPaddingRight());
        postInvalidateOnAnimation();
    }

    public final void A04(List list, float f) {
        if (this.A0E.isEmpty()) {
            List list2 = this.A0F;
            list2.clear();
            this.A0D.clear();
            this.A06 = true;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Float.valueOf(((Number) it.next()).floatValue()));
            }
            setPlaybackPercentage(f);
            requestLayout();
            return;
        }
        throw DbT.A0m();
    }

    public final float getSegmentStridePx() {
        return this.A01;
    }

    public final float getSegmentWidthPx() {
        return this.A02;
    }

    public final int getTimerIntervalMs() {
        return this.A05;
    }

    public final void onMeasure(int i, int i2) {
        List list = this.A0F;
        if (!list.isEmpty()) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.A03;
            if (i3 <= 0) {
                if (mode == Integer.MIN_VALUE) {
                    float f = this.A01;
                    i3 = Math.min(list.size(), (int) Math.floor((double) ((((float) ((size - getPaddingLeft()) - getPaddingRight())) + (f - this.A02)) / f)));
                } else if (mode == 0 || mode != 1073741824) {
                    i3 = list.size();
                } else {
                    float paddingLeft = (float) ((size - getPaddingLeft()) - getPaddingRight());
                    float f2 = this.A01;
                    int floor = (int) Math.floor((double) ((paddingLeft + (f2 - this.A02)) / f2));
                    if (!this.A07) {
                        floor = Math.min(list.size(), floor);
                    }
                    this.A04 = floor;
                    setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
                    return;
                }
            }
            this.A04 = i3;
            float f3 = this.A01;
            size = AnonymousClass1GB.A01((((float) i3) * f3) - (f3 - this.A02)) + getPaddingLeft() + getPaddingRight();
            setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setActiveWindowEnabled(boolean z) {
        this.A0A = z;
        postInvalidateOnAnimation();
    }

    public final void setAllowAddingSegmentsToFitView(boolean z) {
        this.A07 = z;
    }

    public final void setFixedSegmentCount(int i) {
        this.A03 = i;
    }

    public final void setPlaybackPercentage(float f) {
        this.A00 = f;
        postInvalidateOnAnimation();
    }

    public final void setSegmentColor(int i) {
        Paint paint = this.A0J;
        paint.setColor(i);
        paint.setAlpha(77);
        this.A0I.setColor(i);
        this.A0C.setColor(-1);
        invalidate();
    }

    public final void setShouldAlwaysUseProgressPaint(boolean z) {
        this.A08 = z;
    }

    public final void setShowScrubbingHandle(boolean z) {
        this.A09 = z;
    }

    public final void setTimerIntervalMs(int i) {
        this.A05 = i;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1740579540);
        super.onDetachedFromWindow();
        for (0eP r0 : this.A0E) {
            ((Animator) r0.A01).end();
        }
        AnonymousClass0fD.A0D(-1418895160, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.A0K;
        if (rectF.isEmpty()) {
            rectF.set((float) getPaddingLeft(), (float) getPaddingTop(), ((float) (i3 - i)) - ((float) getPaddingRight()), ((float) (i4 - i2)) - ((float) getPaddingBottom()));
        }
    }

    public final void setSegmentStridePx(float f) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.A0L, C71382cm.A2R, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        try {
            this.A01 = (float) obtainStyledAttributes.getDimensionPixelOffset(4, (int) TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(context)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setSegmentWidthPx(float f) {
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.A0L, C71382cm.A2R, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        try {
            this.A02 = (float) obtainStyledAttributes.getDimensionPixelOffset(5, (int) TypedValue.applyDimension(1, f, AnonymousClass7TF.A0E(context)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceVisualizer(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ VoiceVisualizer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
