package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;

/* renamed from: X.Mrf  reason: case insensitive filesystem */
public final class C67652Mrf extends Shape {
    public float A00;
    public final RectF A01;
    public final RectF A02;

    public C67652Mrf() {
        this(0.0f);
    }

    public final void draw(Canvas canvas, Paint paint) {
        AnonymousClass7TF.A1H(canvas, paint);
        RectF rectF = this.A02;
        rectF.set(this.A01);
        rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
        canvas.drawArc(rectF, -90.0f, this.A00 * 360.0f, false, paint);
    }

    public final Shape clone() {
        return new C67652Mrf(this.A00);
    }

    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        this.A01.set(0.0f, 0.0f, f, f2);
    }

    public C67652Mrf(float f) {
        this.A00 = f;
        this.A01 = AnonymousClass7TE.A0Y();
        this.A02 = AnonymousClass7TE.A0Y();
    }
}
