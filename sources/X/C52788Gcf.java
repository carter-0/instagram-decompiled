package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.creation.capture.GridShimmerView;

/* renamed from: X.Gcf  reason: case insensitive filesystem */
public final class C52788Gcf extends Drawable {
    public float A00;
    public final float A01;
    public final Paint A02;
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final /* synthetic */ GridShimmerView A04;

    public final int getOpacity() {
        return -3;
    }

    public C52788Gcf(GridShimmerView gridShimmerView) {
        this.A04 = gridShimmerView;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A02 = A0V;
        AnonymousClass7TE.A1Q(A0V);
        AnonymousClass7TE.A1N(gridShimmerView.getContext(), A0V, R.color.grey_1);
        this.A01 = gridShimmerView.getResources().getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f;
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        float f2 = this.A01;
        float f3 = (((float) A0L.right) - (2.0f * f2)) / 3.0f;
        this.A00 = f3;
        float f4 = (float) A0L.top;
        while (true) {
            f = (float) A0L.bottom;
            if (f3 + f4 > f) {
                break;
            }
            float f5 = (float) A0L.left;
            int i = 0;
            do {
                RectF rectF = this.A03;
                rectF.set(f5, f4, f5 + f3, f3 + f4);
                canvas.drawRect(rectF, this.A02);
                f3 = this.A00;
                f5 = f5 + f3 + f2;
                i++;
            } while (i < 3);
            f4 = f4 + f3 + f2;
        }
        if (f4 < f) {
            float f6 = (float) A0L.left;
            int i2 = 0;
            do {
                RectF rectF2 = this.A03;
                rectF2.set(f6, f4, f3 + f6, f);
                canvas.drawRect(rectF2, this.A02);
                f3 = this.A00;
                f6 = f6 + f3 + f2;
                i2++;
            } while (i2 < 3);
        }
    }
}
