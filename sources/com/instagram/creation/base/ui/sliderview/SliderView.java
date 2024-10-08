package com.instagram.creation.base.ui.sliderview;

import X.0qQ;
import X.2Ht;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C64942Lkh;
import X.C64952Lkr;
import X.JTR;
import X.MQ9;
import X.MV1;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;

public final class SliderView extends HorizontalScrollView {
    public float A00 = 1.0f;
    public float A01 = -1.0f;
    public float A02;
    public int A03;
    public RulerView A04;
    public MQ9 A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09 = Float.NaN;
    public float A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    private final float A00(int i) {
        return ((float) ((((int) (((double) i) + (((double) getWidth()) / 2.0d))) - this.A03) * 2)) / this.A02;
    }

    public final void fling(int i) {
    }

    public final void A01(boolean z, float f) {
        float min = Math.min(this.A00, f);
        int max = (int) (this.A02 * ((Math.max(this.A01, min) + 1.0f) / 2.0f));
        if (z) {
            smoothScrollTo(max, 0);
        } else {
            scrollTo(max, 0);
        }
    }

    public final void A02(boolean z, float f) {
        if (this.A0B) {
            A01(z, f / 25.0f);
            return;
        }
        this.A0C = true;
        this.A07 = f;
        this.A0D = z;
    }

    private final float getCurrentScrollPercent() {
        return A00(getScrollX());
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0fD.A06(-1882591759);
        super.onFinishInflate();
        View childAt = getChildAt(0);
        0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.creation.base.ui.sliderview.RulerView");
        RulerView rulerView = (RulerView) childAt;
        this.A04 = rulerView;
        0qQ.A0A(rulerView);
        rulerView.A01 = 0.05f;
        RulerView rulerView2 = this.A04;
        0qQ.A0A(rulerView2);
        rulerView2.A00 = 0.2f;
        RulerView rulerView3 = this.A04;
        0qQ.A0A(rulerView3);
        rulerView3.A02 = 0.85f;
        RulerView rulerView4 = this.A04;
        0qQ.A0A(rulerView4);
        rulerView4.setLeftRightMarginRatio(0.5f);
        RulerView rulerView5 = this.A04;
        0qQ.A0A(rulerView5);
        rulerView5.setNumIncrements(50);
        AnonymousClass0fD.A0D(-1695533085, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A0B) {
            this.A06 = false;
            RulerView rulerView = this.A04;
            0qQ.A0A(rulerView);
            int left = rulerView.getLeft();
            RulerView rulerView2 = this.A04;
            0qQ.A0A(rulerView2);
            scrollTo(((left + rulerView2.getRight()) - getWidth()) / 2, getScrollY());
            this.A03 = getScrollX() + (getWidth() / 2);
            this.A06 = true;
            RulerView rulerView3 = this.A04;
            0qQ.A0A(rulerView3);
            this.A02 = (float) JTR.A0B(rulerView3, this);
            this.A01 = -1.0f;
            this.A00 = 25.0f / 25.0f;
            this.A0B = true;
        }
        if (this.A0C) {
            A01(this.A0D, this.A07 / 25.0f);
            this.A0C = false;
            this.A07 = 0.0f;
            this.A0D = false;
        }
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.A06) {
            float A002 = A00(getScrollX());
            float f = this.A00;
            if (A002 > f) {
                A01(false, f);
                A002 = this.A00;
            } else {
                float f2 = this.A01;
                if (A002 < f2) {
                    A01(false, f2);
                    A002 = this.A01;
                }
            }
            MQ9 mq9 = this.A05;
            if (mq9 != null) {
                float A052 = ((float) AnonymousClass7TE.A05(25.0f * A002, 10.0f)) / 10.0f;
                if (this.A09 != A052) {
                    0qQ.A0A(mq9);
                    C64942Lkh lkh = ((C64952Lkr) mq9).A00;
                    Integer num = lkh.A0C;
                    if (lkh.A08 != null) {
                        int intValue = num.intValue();
                        if (intValue == 2) {
                            MV1 mv1 = lkh.A05;
                            mv1.getClass();
                            mv1.setDegree(A052);
                            lkh.A0U.A05 = A052;
                            lkh.A08.A0H(A052);
                        } else if (intValue == 0) {
                            MV1 mv12 = lkh.A03;
                            mv12.getClass();
                            mv12.setDegree(A052);
                            lkh.A0U.A03 = A052;
                            lkh.A08.A0F(A052);
                        } else if (intValue == 1) {
                            MV1 mv13 = lkh.A04;
                            mv13.getClass();
                            mv13.setDegree(A052);
                            lkh.A0U.A04 = A052;
                            lkh.A08.A0G(A052);
                        }
                        if (lkh.A0D != null && 2Ht.A03(lkh.A0b)) {
                            SurfaceCropFilterModel.FitTransformParams fitTransformParams = new SurfaceCropFilterModel.FitTransformParams();
                            lkh.A08.A0L(fitTransformParams);
                            lkh.A0c.AAC(new PointF(fitTransformParams.A00, fitTransformParams.A01), lkh.A0D, fitTransformParams.A02);
                        }
                    }
                    C64942Lkh.A03(lkh);
                    this.A09 = A052;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r1 != 3) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 1383463963(0x5275fc1b, float:2.64124154E11)
            int r6 = X.AnonymousClass0fD.A05(r0)
            r5 = 0
            X.0qQ.A0B(r11, r5)
            int r4 = r11.getAction()
            int r1 = r11.getActionMasked()
            r7 = 1
            if (r1 == 0) goto L_0x00e1
            r3 = 0
            if (r1 == r7) goto L_0x009a
            r0 = 2
            if (r1 == r0) goto L_0x0035
            r0 = 3
            if (r1 == r0) goto L_0x00bf
        L_0x001f:
            r10.A0F = r5
        L_0x0021:
            float r0 = r11.getX()
            r10.A08 = r0
            boolean r1 = super.onTouchEvent(r11)
            r11.setAction(r4)
            r0 = -1988790495(0xffffffff89757721, float:-2.9546816E-33)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r1
        L_0x0035:
            r10.A0F = r5
            int r0 = r10.getScrollX()
            float r0 = r10.A00(r0)
            r9 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 * r9
            r8 = 1092616192(0x41200000, float:10.0)
            int r0 = X.AnonymousClass7TE.A05(r0, r8)
            float r2 = (float) r0
            float r2 = r2 / r8
            int r1 = r10.getScrollX()
            float r0 = r10.A0A
            int r0 = (int) r0
            int r1 = r1 + r0
            float r0 = r10.A00(r1)
            float r9 = r9 * r0
            int r0 = X.AnonymousClass7TE.A05(r9, r8)
            float r1 = (float) r0
            float r1 = r1 / r8
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            float r1 = java.lang.Math.abs(r1)
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            r10.A01(r5, r3)
            r10.A0E = r5
            float r2 = r10.A0A
            float r1 = r10.A08
            float r0 = r11.getX()
            float r1 = r1 - r0
            float r2 = r2 + r1
            r10.A0A = r2
            float r0 = r11.getX()
            r10.A08 = r0
            r0 = 1906045351(0x719bf1a7, float:1.5443941E30)
            X.AnonymousClass0fD.A0C(r0, r6)
            return r7
        L_0x0089:
            boolean r0 = r10.A0E
            if (r0 != 0) goto L_0x0093
            r11.setAction(r5)
            r10.A0E = r7
            goto L_0x0021
        L_0x0093:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0021
            r10.A0A = r3
            goto L_0x0021
        L_0x009a:
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x00bf
            float r2 = r11.getX()
            float r1 = X.AnonymousClass7TE.A02(r10)
            r0 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c3
            X.MQ9 r0 = r10.A05
            if (r0 == 0) goto L_0x00bf
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 / r0
            float r0 = r10.A02
            float r1 = r1 * r0
            int r0 = (int) r1
            int r0 = -r0
        L_0x00bc:
            r10.scrollBy(r0, r5)
        L_0x00bf:
            r10.A08 = r3
            goto L_0x001f
        L_0x00c3:
            float r2 = r11.getX()
            float r1 = X.AnonymousClass7TE.A02(r10)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bf
            X.MQ9 r0 = r10.A05
            if (r0 == 0) goto L_0x00bf
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r0 = 1112014848(0x42480000, float:50.0)
            float r1 = r1 / r0
            float r0 = r10.A02
            float r1 = r1 * r0
            int r0 = (int) r1
            goto L_0x00bc
        L_0x00e1:
            r10.A0F = r7
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.sliderview.SliderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnSlideListener(MQ9 mq9) {
        this.A05 = mq9;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
