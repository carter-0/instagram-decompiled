package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Gch  reason: case insensitive filesystem */
public final class C52790Gch extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02 = C51965G9l.A0C();
    public final RectF A03 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawPath(this.A02, this.A01);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(0.0f, 0.0f, (float) rect.width(), (float) rect.height());
        Path path = this.A02;
        path.reset();
        float[] fArr = new float[8];
        float f = this.A00;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        C51975G9x.A1L(fArr, f);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C52790Gch(Context context, float f, float f2) {
        this.A00 = f;
        Paint A0V = AnonymousClass7TE.A0V(3);
        AnonymousClass7TE.A1N(context, A0V, 2Yu.A02(context));
        AnonymousClass7TE.A1Q(A0V);
        A0V.setShadowLayer(f2, 0.0f, 0.0f, AnonymousClass7TF.A03(context, R.attr.igds_color_shadow_on_media));
        this.A01 = A0V;
    }
}
