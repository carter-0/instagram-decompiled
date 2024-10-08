package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;

/* renamed from: X.Gci  reason: case insensitive filesystem */
public final class C52791Gci extends Drawable {
    public final float A00;
    public final Resources A01;
    public final Path A02 = C51965G9l.A0C();
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final GradientDrawable A04;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        canvas.clipPath(this.A02);
        this.A04.draw(canvas);
        canvas.restore();
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
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A04.setBounds(0, 0, rect.width(), rect.height());
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public C52791Gci(Context context) {
        Resources resources = context.getResources();
        this.A01 = resources;
        this.A00 = (float) AnonymousClass7TE.A0B(resources);
        this.A04 = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_yellow), context.getColor(R.color.activator_card_progress_bad), AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_red), AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_pink), AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_lavender)});
    }
}
