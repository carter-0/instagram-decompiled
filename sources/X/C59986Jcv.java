package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.Jcv  reason: case insensitive filesystem */
public final class C59986Jcv extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05 = 0;
    public int A06;
    public Bitmap A07;
    public boolean A08;
    public boolean A09;
    public final Paint A0A;
    public final Rect A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final RectF A0E;

    public C59986Jcv(Resources resources) {
        0qQ.A0B(resources, 1);
        Paint A0C2 = JTO.A0C();
        this.A0A = A0C2;
        A0C2.setAntiAlias(true);
        this.A04 = resources.getColor(R.color.design_dark_default_color_on_background);
        this.A02 = 0.0f;
        this.A0E = AnonymousClass7TE.A0Y();
        this.A0D = AnonymousClass7TE.A0Y();
        this.A0C = AnonymousClass7TE.A0Y();
        this.A0B = AnonymousClass7TE.A0W();
        this.A01 = TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        this.A00 = 4.0f;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (!this.A09) {
            Bitmap bitmap = this.A07;
            if (bitmap != null) {
                Bitmap A092 = 1MF.A09(bitmap, this.A06, this.A03, 0, false);
                Rect rect = this.A0B;
                rect.left = 0;
                rect.right = A092.getWidth();
                rect.top = 0;
                rect.bottom = A092.getHeight();
                canvas.drawBitmap(A092, rect, this.A0C, this.A0A);
            }
            Paint paint = this.A0A;
            JTO.A1N(paint);
            paint.setStrokeWidth(this.A02);
            if (this.A02 != 0.0f) {
                paint.setColor(this.A05);
                RectF rectF = this.A0E;
                float f = this.A00;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            paint.setStrokeWidth(this.A01);
            paint.setColor(this.A04);
            boolean z = this.A08;
            RectF rectF2 = this.A0D;
            if (z) {
                float f2 = this.A00;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
            } else {
                canvas.drawRect(rectF2, paint);
            }
            AnonymousClass7TE.A1Q(paint);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        float f = this.A02 / 2.0f;
        RectF rectF = this.A0E;
        rectF.set(rect);
        rectF.inset(f, f);
        float f2 = this.A02 + (this.A01 / 2.0f);
        RectF rectF2 = this.A0D;
        rectF2.set(rect);
        rectF2.inset(f2, f2);
        float f3 = this.A02 + this.A01;
        RectF rectF3 = this.A0C;
        rectF3.set(rect);
        rectF3.inset(f3, f3);
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public final void setAlpha(int i) {
        throw AnonymousClass7TE.A1B("setAlpha not implemented");
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw AnonymousClass7TE.A1B("setColorFilter not implemented");
    }
}
