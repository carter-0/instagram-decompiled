package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jcg  reason: case insensitive filesystem */
public final class C59971Jcg extends Drawable {
    public final Paint A00;
    public final RectF A01 = AnonymousClass7TE.A0Y();

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public C59971Jcg(int i) {
        Paint A0C = JTO.A0C();
        this.A00 = A0C;
        A0C.setAntiAlias(true);
        A0C.setColor(i);
    }

    public final void draw(Canvas canvas) {
        float A06 = (float) JTP.A06(this);
        float f = A06 / 2.0f;
        RectF rectF = this.A01;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) AnonymousClass7TF.A06(this);
        rectF.bottom = A06;
        canvas.drawRoundRect(rectF, f, f, this.A00);
    }
}
