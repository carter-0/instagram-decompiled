package com.instagram.creation.capture.quickcapture.cameratoolmenu.ui;

import X.0mi;
import X.0qQ;
import X.C14747U6z;
import X.C16532Uwc;
import X.C16533Uwd;
import X.C358088aL;
import X.C51967G9n;
import X.JTT;
import X.WUM;
import X.X1P;
import X.X1Q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EffectSlider extends View {
    public static final int A0K = Math.round(102.0f);
    public float A00;
    public int A01;
    public int A02;
    public X1Q A03;
    public C16533Uwd A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public C16532Uwc A08;
    public boolean A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final VelocityTracker A0J;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0079, code lost:
        if (r1.A00 != r6) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007b, code lost:
        r10.A04 = r1;
        r10.A09 = r8.getBoolean(0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0084, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        r8.recycle();
        r1 = r11.getResources();
        r7.setColor(r1.getColor(com.instagram.android.R.color.canvas_bottom_sheet_description_text_color));
        r5.setColor(r1.getColor(com.instagram.android.R.color.grey_1));
        r5.setAlpha(A0K);
        r10.A0D = r1.getDimensionPixelOffset(com.instagram.android.R.dimen.abc_edit_text_inset_top_material);
        r10.A0C = r1.getDimensionPixelOffset(com.instagram.android.R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        setSeekValue(r10.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0062, code lost:
        r10.A08 = r1;
        r6 = r8.getInt(2, 0);
        r4 = X.C16533Uwd.values();
        r3 = r4.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0073, code lost:
        if (r2 >= r3) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0075, code lost:
        r1 = r4[r2];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EffectSlider(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r2 = 1
            X.0qQ.A0B(r11, r2)
            r10.<init>(r11, r12, r13)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r2)
            r10.A0F = r5
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r2)
            r10.A0E = r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.A0I = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.A0H = r0
            r0 = 1034594987(0x3daaaaab, float:0.083333336)
            r10.A0A = r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r10.A0B = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r10.A0G = r0
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.A0J = r0
            r0 = 10
            r10.A02 = r0
            r0 = 60
            r10.A01 = r0
            android.content.Context r1 = r10.getContext()
            int[] r0 = X.C71382cm.A14
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r12, r0)
            X.0qQ.A07(r8)
            r9 = 0
            int r6 = r8.getInt(r2, r9)     // Catch:{ all -> 0x00cb }
            X.Uwc[] r4 = X.C16532Uwc.values()     // Catch:{ all -> 0x00cb }
            int r3 = r4.length     // Catch:{ all -> 0x00cb }
            r2 = 0
        L_0x005a:
            if (r2 >= r3) goto L_0x00c5
            r1 = r4[r2]     // Catch:{ all -> 0x00cb }
            int r0 = r1.A00     // Catch:{ all -> 0x00cb }
            if (r0 != r6) goto L_0x0070
            r10.A08 = r1     // Catch:{ all -> 0x00cb }
            r0 = 2
            int r6 = r8.getInt(r0, r9)     // Catch:{ all -> 0x00cb }
            X.Uwd[] r4 = X.C16533Uwd.values()     // Catch:{ all -> 0x00cb }
            int r3 = r4.length     // Catch:{ all -> 0x00cb }
            r2 = 0
            goto L_0x0073
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x0073:
            if (r2 >= r3) goto L_0x00bf
            r1 = r4[r2]     // Catch:{ all -> 0x00cb }
            int r0 = r1.A00     // Catch:{ all -> 0x00cb }
            if (r0 != r6) goto L_0x0084
            r10.A04 = r1     // Catch:{ all -> 0x00cb }
            boolean r0 = r8.getBoolean(r9, r9)     // Catch:{ all -> 0x00cb }
            r10.A09 = r0     // Catch:{ all -> 0x00cb }
            goto L_0x0087
        L_0x0084:
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0087:
            r8.recycle()
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r0 = r1.getColor(r0)
            r7.setColor(r0)
            r0 = 2131100246(0x7f060256, float:1.7812868E38)
            int r0 = r1.getColor(r0)
            r5.setColor(r0)
            int r0 = A0K
            r5.setAlpha(r0)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r10.A0D = r0
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r10.A0C = r0
            int r0 = r10.A02
            r10.setSeekValue(r0)
            return
        L_0x00bf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
            goto L_0x00ca
        L_0x00c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00cb }
            r0.<init>()     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            r8.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.cameratoolmenu.ui.EffectSlider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        C16532Uwc uwc = this.A08;
        C16532Uwc uwc2 = C16532Uwc.SLIM;
        int width = getWidth();
        if (uwc == uwc2) {
            width /= 2;
        }
        int height = getHeight();
        RectF rectF = this.A0I;
        float f = (float) width;
        float f2 = (float) height;
        rectF.set(0.0f, 0.0f, f, f2);
        if (this.A09) {
            rectF.inset(this.A0B * f, 0.0f);
            rectF.bottom = this.A07 * f2;
            float f3 = (float) this.A0C;
            canvas.drawRoundRect(rectF, f3, f3, this.A0F);
            rectF.top = this.A07 * f2;
            rectF.bottom = f2;
            Paint paint = this.A0E;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            canvas2.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom - f3, paint);
            RectF rectF2 = this.A0H;
            float f4 = rectF.top;
            rectF2.set(0.0f, f4, f, f4 - (f2 * this.A0A));
            canvas.drawRoundRect(rectF2, f3, f3, paint);
        } else {
            Path path = this.A0G;
            path.reset();
            float f5 = (float) this.A0D;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
            canvas.clipPath(path);
            rectF.bottom = this.A07 * f2;
            canvas.drawRect(rectF, this.A0F);
            rectF.top = this.A07 * f2;
            rectF.bottom = f2;
            canvas.drawRect(rectF, this.A0E);
        }
        super.onDraw(canvas);
    }

    private final void A00(boolean z, float f) {
        X1Q x1q;
        String valueOf;
        int i = this.A01;
        float f2 = (float) i;
        int i2 = this.A02;
        float f3 = (float) (i - i2);
        int A032 = 0mi.A03(Math.round(f2 - (f * f3)), i2, i);
        if ((!z || A032 != 0mi.A03(Math.round(f2 - (this.A07 * f3)), i2, i)) && (x1q = this.A03) != null) {
            C14747U6z u6z = (C14747U6z) x1q;
            TextView textView = u6z.A05;
            if (u6z.A06 == C358088aL.A0u) {
                valueOf = C51967G9n.A0q(String.valueOf(((double) A032) / 100.0d), 0, 3);
            } else {
                valueOf = String.valueOf(A032);
            }
            textView.setText(valueOf);
            X1P x1p = u6z.A00;
            if (x1p != null) {
                WUM wum = (WUM) x1p;
                wum.A01.A08.Di8(wum.A00, A032);
            }
        }
        this.A07 = f;
        invalidate();
    }

    public final int getSeekMiddleValue() {
        return (this.A01 + this.A02) / 2;
    }

    public final int getSeekValueRange() {
        return this.A01 - this.A02;
    }

    public final void setCloseOnTouchUp(boolean z) {
        this.A05 = z;
    }

    public final void setEffectSliderValueChangeListener(X1Q x1q) {
        this.A03 = x1q;
    }

    public final void setSeekValue(int i) {
        int i2 = this.A02;
        int i3 = this.A01;
        A00(false, 1.0f - ((((float) 0mi.A03(i, i2, i3)) - ((float) i2)) / ((float) (i3 - i2))));
    }

    public final void setSliderHandle(boolean z) {
        this.A09 = z;
        invalidate();
    }

    public final void setSliderThickness(C16532Uwc uwc) {
        this.A08 = uwc;
        invalidate();
    }

    public final void setSliderVibrationAction(C16533Uwd uwd) {
        this.A04 = uwd;
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (X.0mi.A03(java.lang.Math.round(((float) r9) - (((float) (r9 - r4)) * r6)), r4, r9) == ((r9 + r4) / 2)) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = -2094343255(0xffffffff832adba9, float:-5.0210667E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r4 = 0
            X.0qQ.A0B(r11, r4)
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto L_0x00c0
            r7 = 1
            r0.requestDisallowInterceptTouchEvent(r7)
            int r1 = r11.getAction()
            if (r1 == 0) goto L_0x0040
            if (r1 == r7) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x004b
            r0 = -627717901(0xffffffffda95c8f3, float:-2.10803588E16)
            X.AnonymousClass0fD.A0C(r0, r5)
            return r4
        L_0x0027:
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x003c
            X.X1Q r0 = r10.A03
            if (r0 == 0) goto L_0x003c
            X.U6z r0 = (X.C14747U6z) r0
            X.X1P r0 = r0.A00
            if (r0 == 0) goto L_0x003c
            X.WUM r0 = (X.WUM) r0
            X.8EP r0 = r0.A01
            r0.A00()
        L_0x003c:
            r0 = 1876064679(0x6fd279a7, float:1.3027784E29)
            goto L_0x00bc
        L_0x0040:
            android.view.VelocityTracker r0 = r10.A0J
            r0.clear()
            r10.A06 = r4
            r0 = 96542148(0x5c11dc4, float:1.8160567E-35)
            goto L_0x00bc
        L_0x004b:
            android.view.VelocityTracker r2 = r10.A0J
            r2.addMovement(r11)
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r0)
            float r1 = r11.getY()
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x006b
            float r0 = r10.A00
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            r0 = 1096810496(0x41600000, float:14.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            r10.A06 = r4
        L_0x006b:
            float r0 = r2.getYVelocity()
            float r3 = java.lang.Math.abs(r0)
            float r8 = r11.getY()
            float r2 = X.JTP.A00(r8, r10)
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = X.0mi.A00(r2, r1, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            X.Uwd r0 = r10.A04
            if (r0 == 0) goto L_0x00b6
            int r0 = r0.ordinal()
            r2 = 5
            if (r0 == r7) goto L_0x00ad
            if (r0 != r4) goto L_0x00b6
            int r9 = r10.A01
            float r1 = (float) r9
            int r4 = r10.A02
            int r0 = r9 - r4
            float r0 = (float) r0
            float r0 = r0 * r6
            float r1 = r1 - r0
            int r0 = java.lang.Math.round(r1)
            int r1 = X.0mi.A03(r0, r4, r9)
            int r9 = r9 + r4
            int r0 = r9 / 2
            if (r1 != r0) goto L_0x00b6
        L_0x00ad:
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A05(r2)
            r10.A00 = r8
            r10.A06 = r7
        L_0x00b6:
            r10.A00(r7, r6)
        L_0x00b9:
            r0 = -756018919(0xffffffffd2f01119, float:-5.15539501E11)
        L_0x00bc:
            X.AnonymousClass0fD.A0C(r0, r5)
            return r7
        L_0x00c0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1676111990(0xffffffff9c188f8a, float:-5.04781E-22)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.cameratoolmenu.ui.EffectSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EffectSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EffectSlider(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ EffectSlider(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
