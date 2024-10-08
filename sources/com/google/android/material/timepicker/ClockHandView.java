package com.google.android.material.timepicker;

import X.AnonymousClass7TE;
import X.C297865sU;
import X.JTP;
import X.X1D;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public class ClockHandView extends View {
    public double A00;
    public float A01;
    public int A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;
    public final List A09;

    public static void A00(ClockHandView clockHandView, float f) {
        float f2 = f % 360.0f;
        clockHandView.A01 = f2;
        clockHandView.A00 = Math.toRadians((double) (f2 - 90.0f));
        int height = clockHandView.getHeight() / 2;
        float width = (float) (clockHandView.getWidth() / 2);
        float f3 = (float) clockHandView.A02;
        double d = clockHandView.A00;
        float cos = width + (((float) Math.cos(d)) * f3);
        float sin = ((float) height) + (f3 * ((float) Math.sin(d)));
        RectF rectF = clockHandView.A08;
        float f4 = (float) clockHandView.A05;
        rectF.set(cos - f4, sin - f4, cos + f4, sin + f4);
        for (X1D x1d : clockHandView.A09) {
            ClockFaceView clockFaceView = (ClockFaceView) x1d;
            if (AnonymousClass7TE.A00(clockFaceView.A00, f2) > 0.001f) {
                clockFaceView.A00 = f2;
                ClockFaceView.A00(clockFaceView);
            }
        }
        clockHandView.invalidate();
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) this.A02;
        double d = this.A00;
        float f3 = (float) height;
        Paint paint = this.A07;
        paint.setStrokeWidth(0.0f);
        int i = this.A05;
        canvas2.drawCircle((f2 * ((float) Math.cos(d))) + f, (f2 * ((float) Math.sin(d))) + f3, (float) i, paint);
        double d2 = this.A00;
        double sin = Math.sin(d2);
        double cos = Math.cos(d2);
        double d3 = (double) ((float) (this.A02 - i));
        paint.setStrokeWidth((float) this.A06);
        canvas2.drawLine(f, f3, (float) (width + ((int) (cos * d3))), (float) (height + ((int) (d3 * sin))), paint);
        canvas2.drawCircle(f, f3, this.A04, paint);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new ArrayList();
        Paint paint = new Paint();
        this.A07 = paint;
        this.A08 = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0A, i, 2132018570);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.A06 = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A04 = (float) JTP.A03(resources);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        A00(this, 0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this, this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r1 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r1 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r0 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        A00(r10, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = -1320727385(0xffffffffb1474ca7, float:-2.9001883E-9)
            int r7 = X.AnonymousClass0fD.A05(r0)
            int r1 = r11.getActionMasked()
            float r4 = r11.getX()
            float r9 = r11.getY()
            r0 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0066
            if (r1 == r6) goto L_0x0063
            r0 = 2
            if (r1 == r0) goto L_0x0063
            r0 = 0
        L_0x001d:
            r8 = 0
        L_0x001e:
            boolean r5 = r10.A03
            int r1 = r10.getWidth()
            int r3 = r1 / 2
            int r1 = r10.getHeight()
            int r2 = r1 / 2
            float r1 = (float) r3
            float r4 = r4 - r1
            double r3 = (double) r4
            float r1 = (float) r2
            float r9 = r9 - r1
            double r1 = (double) r9
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            int r3 = (int) r1
            int r2 = r3 + 90
            if (r2 >= 0) goto L_0x0041
            int r2 = r2 + 360
        L_0x0041:
            float r1 = r10.A01
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            if (r8 == 0) goto L_0x0059
            if (r1 == 0) goto L_0x005b
        L_0x004e:
            r0 = 1
        L_0x004f:
            r0 = r0 | r5
            r10.A03 = r0
            r0 = -2025445541(0xffffffff8746275b, float:-1.490743E-34)
            X.AnonymousClass0fD.A0C(r0, r7)
            return r6
        L_0x0059:
            if (r1 != 0) goto L_0x005f
        L_0x005b:
            if (r0 != 0) goto L_0x005f
            r0 = 0
            goto L_0x004f
        L_0x005f:
            A00(r10, r2)
            goto L_0x004e
        L_0x0063:
            boolean r0 = r10.A03
            goto L_0x001d
        L_0x0066:
            r10.A03 = r0
            r8 = 1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }
}
