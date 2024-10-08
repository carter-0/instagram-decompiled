package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.9kU  reason: invalid class name and case insensitive filesystem */
public final class C386369kU extends C355398Pv {
    public final int A00;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float height = ((float) getBounds().height()) - (this.A00 * 2.0f);
        Path path = new Path();
        path.moveTo(this.A00, 0.0f);
        float f = this.A00;
        float f2 = -f;
        path.rQuadTo(f2, 0.0f, f2, f);
        path.rLineTo(0.0f, height);
        float f3 = this.A00;
        path.rQuadTo(0.0f, f3, f3, f3);
        float f4 = (float) this.A01;
        float f5 = ((float) this.A00) / 1.5f;
        path.rLineTo(f4 + f5, 0.0f);
        float f6 = -this.A00;
        path.rQuadTo(f6, 0.0f, f6, f6);
        path.rLineTo(0.0f, -height);
        float f7 = this.A00;
        float f8 = -f7;
        path.rQuadTo(0.0f, f8, f7, f8);
        path.close();
        Paint paint = this.A03;
        canvas.drawPath(path, paint);
        float height2 = ((float) getBounds().height()) - (2.0f * this.A00);
        Path path2 = new Path();
        path2.moveTo(((((float) getBounds().right) - this.A00) - ((float) this.A02)) - f5, 0.0f);
        float f9 = this.A00;
        path2.rQuadTo(f9, 0.0f, f9, f9);
        path2.rLineTo(0.0f, height2);
        float f10 = this.A00;
        path2.rQuadTo(0.0f, f10, -f10, f10);
        path2.rLineTo(((float) this.A02) + f5, 0.0f);
        float f11 = this.A00;
        path2.rQuadTo(f11, 0.0f, f11, -f11);
        path2.rLineTo(0.0f, -height2);
        float f12 = -this.A00;
        path2.rQuadTo(0.0f, f12, f12, f12);
        path2.close();
        canvas.drawPath(path2, paint);
    }

    public C386369kU(int i, int i2, int i3) {
        super(i, i2);
        this.A00 = i3;
    }
}
