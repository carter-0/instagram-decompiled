package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;

/* renamed from: X.U0k  reason: case insensitive filesystem */
public final class C14664U0k extends Drawable {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final ShapeDrawable A03;
    public final Shape A04;

    public C14664U0k(Shape shape, float f, int i, int i2) {
        this.A04 = shape;
        this.A01 = i2;
        Paint paint = new Paint(3);
        this.A02 = paint;
        AnonymousClass7TE.A1Q(paint);
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape);
        this.A03 = shapeDrawable;
        shapeDrawable.getPaint().setShadowLayer(f, 0.0f, 0.0f, i);
        shapeDrawable.setAlpha(255);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = new Rect(rect);
        rect2.inset(0, this.A01);
        this.A04.resize((float) rect2.width(), (float) rect2.height());
        this.A03.setBounds(rect2);
        this.A00 = null;
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            this.A03.draw(new Canvas(createBitmap));
        }
        canvas.drawBitmap(this.A00, (float) bounds.left, (float) bounds.top, this.A02);
    }
}
