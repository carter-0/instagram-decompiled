package com.instagram.igds.components.stepperheader;

import X.00k;
import X.03t;
import X.0qQ;
import X.0sn;
import X.2cs;
import X.AnonymousClass08u;
import X.AnonymousClass0fD;
import X.AnonymousClass1GB;
import X.AnonymousClass3TF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252203oj;
import X.C252293os;
import X.C51965G9l;
import X.C55027Hay;
import X.DbS;
import X.I84;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsStepperHeader extends View implements AnonymousClass08u, C252203oj, C252293os {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final int A0C;
    public final Paint A0D;
    public final 2cs A0E;
    public final boolean A0F;
    public final int[] A0G;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsStepperHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
        0qQ.A0B(context, 1);
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r3) {
        int i;
        0qQ.A0B(r3, 0);
        if (this.A02 > 5) {
            i = AnonymousClass1GB.A00(r3.A09.A00);
        } else {
            i = 0;
        }
        setScrollX(i);
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        super.onDraw(canvas2);
        float paddingLeft = (float) getPaddingLeft();
        if (getPaddingRight() > 0) {
            int paddingLeft2 = getPaddingLeft();
            int i3 = this.A04;
            int i4 = this.A02;
            i = paddingLeft2 + (i3 * i4) + (this.A08 * (i4 - 1));
        } else {
            i = this.A0C;
        }
        canvas2.drawLine(paddingLeft, 0.0f, (float) i, 0.0f, this.A0D);
        int paddingLeft3 = getPaddingLeft();
        int i5 = this.A02;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 != 0) {
                if (!this.A0F) {
                    canvas2.drawLine((float) paddingLeft3, 0.0f, (float) (this.A08 + paddingLeft3), 0.0f, this.A0A);
                }
                paddingLeft3 += this.A08;
            }
            int i7 = this.A03;
            if ((i6 != i7 || !this.A06 || this.A07) && (i6 != i7 + 1 || !this.A06 || !this.A07)) {
                if (i6 > i7) {
                    f = (float) paddingLeft3;
                    i2 = this.A04;
                }
                if (i6 != 0 && this.A0F) {
                    int i8 = this.A08;
                    float f2 = (float) (paddingLeft3 - i8);
                    Path A0C2 = C51965G9l.A0C();
                    float f3 = (float) this.A09;
                    A0C2.addArc(new RectF(f2 - f3, 0.0f, f2, f3), 270.0f, 180.0f);
                    float f4 = ((float) i8) + f2;
                    float f5 = f3 / 2.0f;
                    A0C2.lineTo(f4 + f5, f3);
                    A0C2.addArc(new RectF(f4, 0.0f, f4 + f3, f3), 90.0f, 180.0f);
                    A0C2.lineTo(f2 - f5, 0.0f);
                    Paint paint = this.A0A;
                    AnonymousClass7TE.A1Q(paint);
                    canvas2.drawPath(A0C2, paint);
                }
                paddingLeft3 += this.A04;
            } else {
                float f6 = this.A00;
                i2 = this.A04;
                f = ((float) paddingLeft3) + (f6 * ((float) i2));
            }
            canvas2.drawLine(f, 0.0f, (float) (i2 + paddingLeft3), 0.0f, this.A0B);
            int i82 = this.A08;
            float f22 = (float) (paddingLeft3 - i82);
            Path A0C22 = C51965G9l.A0C();
            float f32 = (float) this.A09;
            A0C22.addArc(new RectF(f22 - f32, 0.0f, f22, f32), 270.0f, 180.0f);
            float f42 = ((float) i82) + f22;
            float f52 = f32 / 2.0f;
            A0C22.lineTo(f42 + f52, f32);
            A0C22.addArc(new RectF(f42, 0.0f, f42 + f32, f32), 90.0f, 180.0f);
            A0C22.lineTo(f22 - f52, 0.0f);
            Paint paint2 = this.A0A;
            AnonymousClass7TE.A1Q(paint2);
            canvas2.drawPath(A0C22, paint2);
            paddingLeft3 += this.A04;
        }
        if (this.A0F) {
            float f7 = (float) paddingLeft3;
            Paint paint3 = this.A0A;
            AnonymousClass7TE.A1Q(paint3);
            Path A0C3 = C51965G9l.A0C();
            Path A0C4 = C51965G9l.A0C();
            float f8 = (float) this.A09;
            A0C3.addArc(new RectF(paddingLeft, 0.0f, paddingLeft + f8, f8), 90.0f, 180.0f);
            A0C3.lineTo(paddingLeft, 0.0f);
            A0C3.lineTo(paddingLeft, f8);
            float f9 = f8 / 2.0f;
            A0C3.lineTo(paddingLeft + f9, f8);
            canvas2.drawPath(A0C3, paint3);
            A0C4.addArc(new RectF(f7 - f8, 0.0f, f7, f8), 270.0f, 180.0f);
            A0C4.lineTo(f7, f8);
            A0C4.lineTo(f7, 0.0f);
            A0C4.lineTo(f7 - f9, 0.0f);
            canvas2.drawPath(A0C4, paint3);
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    private final void setCurrentPage(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void A01() {
        if (this.A06) {
            boolean z = this.A07;
            float[] A1b = C51965G9l.A1b();
            if (z) {
                // fill-array-data instruction
                A1b[0] = 1065353216;
                A1b[1] = 0;
            } else {
                // fill-array-data instruction
                A1b[0] = 0;
                A1b[1] = 1065353216;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
            this.A05 = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration((long) this.A01);
                I84.A01(ofFloat, this, 21);
                ofFloat.start();
            }
        }
    }

    public final void A02(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = (int) Math.ceil(((((double) this.A0C) - ((double) (getPaddingLeft() + getPaddingRight()))) - ((double) (this.A08 * (i2 - 1)))) / ((double) i2));
        requestLayout();
    }

    public final void A03(int i, int i2, boolean z, boolean z2) {
        A02(i, i2);
        this.A06 = z;
        this.A07 = z2;
        this.A01 = 300;
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    private final void A00() {
        float f;
        float f2;
        float f3;
        int[] iArr;
        0sn r3;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        boolean z = this.A0F;
        Paint paint = this.A0D;
        if (z) {
            float f4 = (float) (this.A0C - paddingLeft);
            f = f4 * 0.0f;
            f2 = f4 * 1.0f;
            f3 = 0.0f;
            int[] iArr2 = this.A0G;
            0qQ.A0B(iArr2, 0);
            int length = iArr2.length;
            int i = length - 1;
            if (i < 0 || i == 0) {
                r3 = 0sn.A00;
            } else if (i >= length) {
                r3 = 03t.A0G(iArr2);
            } else if (i == 1) {
                r3 = AnonymousClass7TE.A1I(Integer.valueOf(iArr2[i]));
            } else {
                r3 = DbS.A0v(i);
                for (int i2 = length - i; i2 < length; i2++) {
                    AnonymousClass7TF.A1M(r3, iArr2[i2]);
                }
            }
            iArr = 00k.A0x(r3);
        } else {
            float f5 = (float) (this.A0C - paddingLeft);
            f = f5 * -0.2f;
            f2 = f5 * 1.2f;
            f3 = 0.0f;
            iArr = this.A0G;
        }
        paint.setShader(new LinearGradient(f, f3, f2, f3, iArr, (float[]) null, Shader.TileMode.MIRROR));
    }

    public final void DVx(int i, int i2) {
        setCurrentPage(i);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1060108848);
        super.onAttachedToWindow();
        this.A0E.A0A(this);
        AnonymousClass0fD.A0D(-708705924, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(979015316);
        super.onDetachedFromWindow();
        2cs r0 = this.A0E;
        r0.A01();
        r0.A0B(this);
        ValueAnimator valueAnimator = this.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AnonymousClass0fD.A0D(1674515474, A062);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        0qQ.A07(displayMetrics);
        C55027Hay.A00(displayMetrics, iArr, i, i2, this.A0F);
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A00();
    }

    public final void onPageSelected(int i) {
        setCurrentPage(i);
    }

    public final void setAnimationDuration(int i) {
        this.A01 = i;
    }

    public final void setIsAnimationBackward(boolean z) {
        this.A07 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
        if (r1 != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsStepperHeader(android.content.Context r10, android.util.AttributeSet r11, int r12, boolean r13) {
        /*
            r9 = this;
            r3 = 1
            X.0qQ.A0B(r10, r3)
            r9.<init>(r10, r11, r12)
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            int r8 = X.AnonymousClass7TF.A03(r10, r0)
            r4 = 0
            r0 = 2130970228(0x7f040674, float:1.754916E38)
            int r7 = X.AnonymousClass7TF.A03(r10, r0)
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            int r5 = X.AnonymousClass7TF.A03(r10, r0)
            r0 = 2130970227(0x7f040673, float:1.7549158E38)
            int r1 = X.AnonymousClass7TF.A03(r10, r0)
            r6 = 3
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r0 = X.AnonymousClass7TF.A03(r10, r0)
            r2 = 4
            int[] r0 = new int[]{r8, r7, r5, r1, r0}
            r9.A0G = r0
            if (r13 != 0) goto L_0x0050
            X.0ob r0 = X.0ob.A03
            if (r0 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r7 = X.0ob.A00(r0)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36320330810204476(0x8109260011213c, double:3.0324616823820673E-306)
            boolean r1 = X.182.A06(r5, r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0051
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            r4 = 1
        L_0x0051:
            r9.A0F = r4
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r0 = r1.widthPixels
            r9.A0C = r0
            if (r4 == 0) goto L_0x00c6
            r6 = 4
        L_0x0062:
            android.graphics.RectF r0 = X.0nA.A01
            float r0 = (float) r6
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r1)
            int r0 = java.lang.Math.round(r0)
            r9.A08 = r0
            float r0 = (float) r2
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r1)
            int r0 = java.lang.Math.round(r0)
            r9.A09 = r0
            android.graphics.Paint r1 = X.AnonymousClass7TE.A0V(r3)
            r9.A0D = r1
            int r0 = r0 * 2
            float r2 = (float) r0
            r1.setStrokeWidth(r2)
            r9.A00()
            r0 = 2130968707(0x7f040083, float:1.7546075E38)
            if (r4 == 0) goto L_0x0091
            r0 = 2130968706(0x7f040082, float:1.7546073E38)
        L_0x0091:
            android.graphics.Paint r1 = X.AnonymousClass7TE.A0V(r3)
            r1.setStrokeWidth(r2)
            int r0 = X.2Yu.A0F(r10, r0)
            r1.setColor(r0)
            r9.A0A = r1
            android.graphics.Paint r1 = X.AnonymousClass7TE.A0V(r3)
            r1.setStrokeWidth(r2)
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r0 = X.2Yu.A0H(r10, r0)
            X.AnonymousClass7TE.A1N(r10, r1, r0)
            r9.A0B = r1
            X.2cs r4 = X.AnonymousClass7TF.A0J()
            r2 = 4629137466983448576(0x403e000000000000, double:30.0)
            r0 = 4619567317775286272(0x401c000000000000, double:7.0)
            X.2co r0 = X.C71392co.A04(r2, r0)
            r4.A09(r0)
            r9.A0E = r4
            return
        L_0x00c6:
            r2 = 2
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.stepperheader.IgdsStepperHeader.<init>(android.content.Context, android.util.AttributeSet, int, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsStepperHeader(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsStepperHeader(Context context) {
        this(context, (AttributeSet) null, 0, false);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsStepperHeader(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
        0qQ.A0B(context, 1);
    }
}
