package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.U0d  reason: case insensitive filesystem */
public final class C14657U0d extends Drawable {
    public final float A00;
    public final Paint A01;
    public final Path A02;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Path path = this.A02;
        RectF rectF = new RectF(0.0f, 0.0f, (float) AnonymousClass7TF.A06(this), (float) JTP.A06(this));
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        canvas.drawPath(path, this.A01);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C14657U0d(Context context, boolean z) {
        this.A00 = (float) context.getResources().getDimensionPixelSize(z ? R.dimen.abc_action_bar_elevation_material : R.dimen.abc_button_inset_vertical_material);
        Paint paint = new Paint(3);
        AnonymousClass7TE.A1N(context, paint, R.color.grey_2);
        AnonymousClass7TE.A1Q(paint);
        this.A01 = paint;
        this.A02 = new Path();
    }
}
