package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9kX  reason: invalid class name and case insensitive filesystem */
public final class C386399kX extends C355408Pw {
    public final int A00;
    public final boolean A01;
    public final int A02;

    public C386399kX(int i, int i2, int i3, int i4, boolean z) {
        super(i, i2);
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = z;
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        float f = (float) A0L.left;
        float f2 = (float) A0L.top;
        float width = (float) A0L.width();
        float height = (float) A0L.height();
        float width2 = (float) (A0L.width() / 2);
        float width3 = (float) (A0L.width() / 2);
        float f3 = (float) this.A02;
        Path path = new Path();
        float f4 = height - (2.0f * width3);
        float f5 = (float) this.A00;
        float f6 = (height - (2.0f * f3)) - f5;
        float f7 = f5 / 2.0f;
        float f8 = ((width - width2) + f3) - f7;
        if (this.A01) {
            path.moveTo(f + width2, f2);
            float f9 = -width2;
            path.rQuadTo(f9, 0.0f, f9, width3);
            path.rLineTo(0.0f, f4);
            path.rQuadTo(0.0f, width3, width2, width3);
            path.rLineTo(f8, 0.0f);
            float f10 = -f7;
            path.rLineTo(0.0f, f10);
            float f11 = -f3;
            path.rQuadTo(f11, 0.0f, f11, f11);
            path.rLineTo(0.0f, -f6);
            path.rQuadTo(0.0f, f11, f3, f11);
            path.rLineTo(0.0f, f10);
        } else {
            path.moveTo((f - f3) + f7, f2);
            path.rLineTo(0.0f, f7);
            path.rQuadTo(f3, 0.0f, f3, f3);
            path.rLineTo(0.0f, f6);
            path.rQuadTo(0.0f, f3, -f3, f3);
            path.rLineTo(0.0f, f7);
            path.rLineTo(f8, 0.0f);
            float f12 = -width3;
            path.rQuadTo(width2, 0.0f, width2, f12);
            path.rLineTo(0.0f, -f4);
            path.rQuadTo(0.0f, f12, -width2, f12);
        }
        path.close();
        canvas.drawPath(path, this.A03);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            AnonymousClass7TF.A15(canvas, drawable, (float) (A0L.left + (A0L.width() / 2)), (float) (A0L.top + (A0L.height() / 2)));
        }
    }
}
