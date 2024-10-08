package com.facebook.smartcapture.ui.view;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11408SSf;
import X.C14638Tzk;
import X.JTO;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import X.SN3;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.Arrays;

public final class FaceCaptureProgressView extends FrameLayout {
    public static final Property A0K = new C14638Tzk(Float.TYPE);
    public static final int[] A0L;
    public float A00;
    public ObjectAnimator A01;
    public boolean A02;
    public float A03;
    public float A04;
    public int A05;
    public Bitmap A06;
    public Canvas A07;
    public boolean A08;
    public final float[] A09;
    public final float[] A0A;
    public final float[] A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0H = AnonymousClass7TE.A0V(1);
        this.A0F = AnonymousClass7TE.A0V(1);
        this.A0G = AnonymousClass7TE.A0V(1);
        this.A0C = AnonymousClass7TE.A0V(1);
        this.A0I = AnonymousClass7TE.A0V(1);
        this.A0D = AnonymousClass7TE.A0V(1);
        this.A0E = AnonymousClass7TE.A0V(1);
        this.A0J = AnonymousClass7TE.A0Y();
        this.A09 = new float[4];
        this.A0B = new float[4];
        this.A0A = new float[4];
        A01(context);
    }

    private final void A00(int i, Paint paint) {
        paint.setFlags(1);
        paint.setColor(i);
        JTO.A1N(paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.A04);
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float width = (float) getWidth();
        float A032 = AnonymousClass7TE.A03(this);
        float f = this.A04 / 2.0f;
        RectF rectF = this.A0J;
        rectF.set(f, f, width - f, A032 - f);
        if (this.A08) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A0E);
            return;
        }
        if (this.A02) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (Math.min(rectF.width(), rectF.height()) / 2.0f) - (this.A03 + this.A04), this.A0H);
        }
        A02(canvas, this.A0G, (float[]) null);
        A02(canvas, this.A0C, this.A09);
        A02(canvas, this.A0D, this.A0A);
        int[] iArr = A0L;
        int i = 0;
        do {
            float f2 = this.A0B[i];
            if (f2 != 0.0f) {
                float f3 = 83.0f * f2;
                float f4 = (((float) iArr[i]) + 41.5f) - (f3 / 2.0f);
                Paint paint = this.A0I;
                paint.setAlpha((int) (this.A00 * 255.0f));
                canvas2.drawArc(rectF, f4, f3, false, paint);
            }
            i++;
        } while (i < 4);
    }

    static {
        int[] iArr = new int[4];
        A0L = iArr;
        iArr[0] = 139;
        int i = 1;
        do {
            iArr[i] = iArr[i - 1] + 83 + 7;
            i++;
        } while (i < 4);
    }

    private final void A01(Context context) {
        Pxi.A0v(this.A0F, PorterDuff.Mode.CLEAR);
        this.A05 = C11408SSf.A01(context, R.attr.sc_surface_background);
        this.A0H.setColor(context.getResources().getColor(R.color.selfie_capture_warning_overlay));
        Context context2 = getContext();
        this.A04 = context2.getResources().getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A03 = Pxj.A06(context2);
        A00(C11408SSf.A01(context, R.attr.selfie_capture_progress_idle), this.A0G);
        A00(C11408SSf.A01(context, R.attr.selfie_capture_progress_active), this.A0C);
        A00(C11408SSf.A01(context, R.attr.selfie_capture_progress_success), this.A0I);
        A00(C11408SSf.A01(context, R.attr.selfie_capture_progress_failure), this.A0D);
        A00(C11408SSf.A01(context, R.attr.selfie_capture_progress_filled), this.A0E);
        Pxf.A1B(this, C11408SSf.A01(context2, R.attr.selfie_capture_placeholder));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0007  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(android.graphics.Canvas r12, android.graphics.Paint r13, float[] r14) {
        /*
            r11 = this;
            int[] r4 = A0L
            r3 = 4
            r2 = 0
        L_0x0004:
            r10 = r13
            if (r14 == 0) goto L_0x0013
            r0 = 1132396544(0x437f0000, float:255.0)
            r1 = r14[r2]
            float r1 = r1 * r0
            float r0 = r11.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            r13.setAlpha(r0)
        L_0x0013:
            android.graphics.RectF r6 = r11.A0J
            r0 = r4[r2]
            float r7 = (float) r0
            r8 = 1118175232(0x42a60000, float:83.0)
            r9 = 0
            r5 = r12
            r5.drawArc(r6, r7, r8, r9, r10)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0026
            r0 = 3
            if (r2 != r0) goto L_0x0004
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.ui.view.FaceCaptureProgressView.A02(android.graphics.Canvas, android.graphics.Paint, float[]):void");
    }

    public final void A03() {
        Arrays.fill(this.A09, 0.0f);
        Arrays.fill(this.A0B, 0.0f);
        Arrays.fill(this.A0A, 0.0f);
        invalidate();
    }

    public final float getDrawingAlpha() {
        return this.A00;
    }

    public final void setDrawingAlpha(float f) {
        this.A00 = f;
        invalidate();
    }

    public final void setFilled(boolean z) {
        this.A08 = z;
        invalidate();
    }

    public final void setFilledColor(int i) {
        this.A0E.setColor(i);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            if (mode2 == 0) {
                size = (int) (AnonymousClass7TF.A0E(getContext()).density * 320.0f);
            } else {
                size = size2;
            }
        } else if (mode2 != 0) {
            size = Math.min(size, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1644439632);
        if (i > 0 && i2 > 0 && !(i == i3 && i2 == i4)) {
            Bitmap A0B2 = AnonymousClass7TF.A0B(i, i2);
            this.A06 = A0B2;
            this.A07 = JTO.A0B(A0B2);
            float f = this.A03 + this.A04;
            float f2 = ((float) i) * 0.5f;
            float f3 = ((float) i2) * 0.5f;
            float min = Math.min(f2 - f, f3 - f);
            A0B2.eraseColor(0);
            Canvas canvas = this.A07;
            0qQ.A0A(canvas);
            canvas.drawColor(this.A05);
            Canvas canvas2 = this.A07;
            0qQ.A0A(canvas2);
            canvas2.drawCircle(f2, f3, min, this.A0F);
        }
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass0fD.A0D(1582408847, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        this.A0H = AnonymousClass7TE.A0V(1);
        this.A0F = AnonymousClass7TE.A0V(1);
        this.A0G = AnonymousClass7TE.A0V(1);
        this.A0C = AnonymousClass7TE.A0V(1);
        this.A0I = AnonymousClass7TE.A0V(1);
        this.A0D = AnonymousClass7TE.A0V(1);
        this.A0E = AnonymousClass7TE.A0V(1);
        this.A0J = AnonymousClass7TE.A0Y();
        this.A09 = new float[4];
        this.A0B = new float[4];
        this.A0A = new float[4];
        A01(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FaceCaptureProgressView(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }
}
