package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;

/* renamed from: X.9XM  reason: invalid class name */
public final class AnonymousClass9XM extends Drawable implements B2I {
    public float A00;
    public final Paint A01;
    public final RectF A02 = AnonymousClass7TE.A0Y();
    public final C306386Ly A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A02;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A01);
        this.A03.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A02.set(getBounds());
        C306386Ly r5 = this.A03;
        r5.A0E(rect.width());
        int i = r5.A06;
        int i2 = r5.A0A;
        int height = rect.top + ((rect.height() - i) / 2);
        int width = rect.left + ((rect.width() - i2) / 2);
        r5.setBounds(new Rect(width, height, i2 + width, i + height));
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final float ArT() {
        return this.A00;
    }

    public final void ESw(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    public AnonymousClass9XM(Context context, float f) {
        Paint paint = new Paint();
        AnonymousClass7TE.A1N(context, paint, R.color.black_60_transparent);
        this.A01 = paint;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, 0);
        A0s.A0A(f);
        AnonymousClass7TE.A1P(context.getResources(), A0s, 2131976703);
        A0s.A0K(Layout.Alignment.ALIGN_CENTER);
        this.A03 = A0s;
    }
}
