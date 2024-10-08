package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.U0m  reason: case insensitive filesystem */
public final class C14666U0m extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Paint A04;
    public final RectF A05 = new RectF();
    public final GVQ A06;

    public C14666U0m(Context context, boolean z) {
        GVQ gvq;
        0qQ.A0B(context, 1);
        Resources resources = context.getResources();
        this.A03 = AnonymousClass7TE.A0D(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        this.A02 = dimensionPixelSize;
        float A012 = C13988Tno.A01(dimensionPixelSize);
        this.A01 = A012;
        this.A00 = resources.getDimension(R.dimen.abc_control_corner_material);
        Paint paint = new Paint();
        this.A04 = paint;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.fastScrubberDotColor));
        paint.setAntiAlias(true);
        if (z) {
            gvq = GVQ.A00(context, resources.getDimension(R.dimen.abc_control_corner_material), A012);
        } else {
            gvq = null;
        }
        this.A06 = gvq;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        GVQ gvq = this.A06;
        if (gvq != null) {
            gvq.draw(canvas);
        }
        RectF rectF = this.A05;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    @Deprecated(message = "This declaration overrides deprecated members", replaceWith = @ReplaceWith(expression = "resolveOpacity(int, int)", imports = {}))
    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A05;
        float centerX = (float) rect.centerX();
        float f = ((float) this.A03) / 2.0f;
        float centerY = (float) rect.centerY();
        float f2 = ((float) this.A02) / 2.0f;
        rectF.set(centerX - f, centerY - f2, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f2);
        GVQ gvq = this.A06;
        if (gvq != null) {
            float f3 = rectF.left;
            float f4 = this.A00;
            gvq.setBounds(AnonymousClass1GB.A01(f3 - f4), AnonymousClass1GB.A01(rectF.top - f4), AnonymousClass1GB.A01(rectF.right + f4), AnonymousClass1GB.A01(rectF.bottom + f4));
        }
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        GVQ gvq = this.A06;
        if (gvq != null) {
            gvq.mutate().setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        GVQ gvq = this.A06;
        if (gvq != null) {
            AnonymousClass7TG.A10(colorFilter, gvq);
        }
        invalidateSelf();
    }
}
