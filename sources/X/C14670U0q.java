package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0q  reason: case insensitive filesystem */
public final class C14670U0q extends Drawable {
    public int A00;
    public final Paint A01 = new Paint(7);
    public final C20972X7c A02;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A02.AQN(canvas, this.A01, AnonymousClass7TE.A0X(this), this.A00);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.A02.BIe();
    }

    public final int getIntrinsicWidth() {
        return (int) this.A02.BIf();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public C14670U0q(C20972X7c x7c) {
        this.A02 = x7c;
    }
}
