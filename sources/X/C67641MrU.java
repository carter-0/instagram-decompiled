package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.MrU  reason: case insensitive filesystem */
public final class C67641MrU extends Drawable {
    public int A00;
    public int A01;
    public final RectF A02;
    public final RectF A03;
    public final boolean A04;
    public final float A05;
    public final int A06;
    public final Paint A07 = AnonymousClass7TE.A0V(1);

    public C67641MrU(Context context, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A05 = context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A03 = AnonymousClass7TE.A0Y();
        this.A06 = C66581MXm.A02(context);
        this.A02 = AnonymousClass7TE.A0Y();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        Paint paint = this.A07;
        paint.setColor(this.A06);
        RectF rectF = this.A03;
        float f = this.A05;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(this.A00);
        canvas.drawRoundRect(this.A02, f, f, paint);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        Rect A0C;
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03.set(rect);
        int i = rect.right;
        int i2 = (int) (((double) (this.A01 * i)) / 100.0d);
        RectF rectF = this.A02;
        if (this.A04) {
            A0C = C66580MXl.A0C(Math.max(i - i2, rect.left), rect.top, i, rect.bottom);
        } else {
            A0C = C66580MXl.A0C(rect.left, rect.top, i2, rect.bottom);
        }
        rectF.set(A0C);
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }
}
