package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.TrC  reason: case insensitive filesystem */
public final class C14174TrC extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02;
    public final PointF A03 = new PointF();
    public final PointF A04 = new PointF();
    public final PointF A05 = new PointF();

    public C14174TrC(Context context) {
        Paint paint = new Paint();
        this.A01 = paint;
        Path path = new Path();
        this.A02 = path;
        paint.setFlags(1);
        paint.setColor(-1);
        float A002 = 0nA.A00(context, 1.5f);
        this.A00 = A002 / 2.0f;
        paint.setShadowLayer(A002, 0.0f, 0.0f, context.getColor(R.color.black_50_transparent));
        paint.setPathEffect(new CornerPathEffect(A002));
        path.setFillType(Path.FillType.EVEN_ODD);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        canvas.drawPath(this.A02, this.A01);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        float min = ((float) Math.min(rect.height(), rect.width())) + this.A00;
        float height = (((float) rect.height()) - min) / 2.0f;
        PointF pointF = this.A05;
        float width = ((((float) rect.width()) - min) / 2.0f) + (0.2f * min);
        pointF.set(width, height);
        PointF pointF2 = this.A03;
        pointF2.set(width, height + min);
        PointF pointF3 = this.A04;
        pointF3.set(width + (0.75f * min), height + (min / 2.0f));
        Path path = this.A02;
        path.rewind();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF3.x, pointF3.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.close();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return JTP.A06(this);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass7TF.A06(this);
    }
}
