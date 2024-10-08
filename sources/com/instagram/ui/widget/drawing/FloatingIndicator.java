package com.instagram.ui.widget.drawing;

import X.2cs;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C300795xr;
import X.C300805xs;
import X.C300815xt;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class FloatingIndicator extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public AnonymousClass0eM A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;
    public final RectF A0B;
    public final C300805xs A0C;
    public final Runnable A0D;

    public FloatingIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void A00() {
        removeCallbacks(this.A0D);
        this.A05 = false;
        this.A06 = false;
        2cs r2 = (2cs) this.A04.getValue();
        r2.A01();
        r2.A06(0.0d);
    }

    public final void A01(float f, float f2, float f3, float f4, float f5, int i, int i2, long j, boolean z) {
        C300805xs r0 = this.A0C;
        r0.A00 = f;
        r0.A01 = f2;
        r0.A02 = f3;
        r0.A03 = f4;
        this.A07 = i2;
        if (this.A06) {
            if (z) {
                f3 = Math.min(Math.max(f3, 0.0f), (float) getWidth());
            }
            this.A02 = f3;
            if (z) {
                f4 = Math.min(Math.max(f4, 0.0f), (float) getHeight());
            }
            this.A03 = f4;
            this.A00 = f5 / 2.0f;
        } else if (!this.A05) {
            postDelayed(this.A0D, j);
            this.A05 = true;
        }
        this.A08.setColor(i);
        this.A01 = f5;
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A07 == 0) {
            canvas.drawCircle(this.A02, this.A03, this.A00, this.A08);
            canvas.drawCircle(this.A02, this.A03, this.A00, this.A09);
            return;
        }
        Path path = this.A0A;
        path.rewind();
        RectF rectF = this.A0B;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A03;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        path.addArc(rectF, 130.0f, 280.0f);
        path.lineTo(this.A02, this.A03 + (this.A00 * 1.3f));
        path.close();
        canvas.drawPath(path, this.A08);
        canvas.drawPath(path, this.A09);
    }

    /* JADX INFO: finally extract failed */
    public FloatingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = false;
        this.A05 = false;
        this.A07 = 0;
        this.A0D = new C300795xr(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0o);
        try {
            float dimension = obtainStyledAttributes.getDimension(0, 5.0f);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.A08 = paint;
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint(1);
            this.A09 = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            paint2.setStrokeWidth(dimension);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            this.A0C = new C300805xs(this);
            this.A0A = new Path();
            this.A0B = new RectF();
            this.A04 = AnonymousClass0eN.A01(new C300815xt(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public FloatingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
