package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9WX  reason: invalid class name */
public final class AnonymousClass9WX extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Resources A03;
    public final Paint A04;
    public final Paint A05;
    public final Path A06 = new Path();
    public final RectF A07 = AnonymousClass7TE.A0Y();

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A07;
        rectF.set(0.0f, 0.0f, (float) rect.width(), (float) rect.height());
        Path path = this.A06;
        path.reset();
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        Paint paint = this.A05;
        paint.setAlpha(i);
        if (i == 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(this.A01, 0.0f, 0.0f, this.A02);
        }
    }

    public AnonymousClass9WX(Context context) {
        Resources resources = context.getResources();
        this.A03 = resources;
        int A0A = AnonymousClass7TE.A0A(context);
        Paint A0V = AnonymousClass7TE.A0V(3);
        A0V.setColor(A0A);
        AnonymousClass7TE.A1Q(A0V);
        this.A04 = A0V;
        this.A00 = (float) AnonymousClass7TE.A0F(resources);
        float A0D = (float) AnonymousClass7TE.A0D(resources);
        this.A01 = A0D;
        int color = context.getColor(R.color.black_10_transparent);
        this.A02 = color;
        Paint A0V2 = AnonymousClass7TE.A0V(3);
        A0V2.setColor(A0A);
        A0V2.setShadowLayer(A0D, 0.0f, 0.0f, color);
        this.A05 = A0V2;
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TG.A0z(canvas, this);
        Path path = this.A06;
        canvas.drawPath(path, this.A05);
        canvas.drawPath(path, this.A04);
        canvas.restore();
    }
}
