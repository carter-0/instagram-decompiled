package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gck  reason: case insensitive filesystem */
public final class C52793Gck extends Drawable {
    public int A00;
    public int A01 = 1;
    public final Drawable A02;
    public final 2cs A03;

    public C52793Gck(Drawable drawable) {
        this.A02 = drawable;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A0A(new C54015Gxx(this));
        A0J.A09(C71392co.A04(1.0d, 0.1d));
        this.A03 = A0J;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A02.setBounds(rect);
    }

    public final int getOpacity() {
        return this.A02.getOpacity();
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.A00 < this.A01) {
            if (z) {
                2cs r5 = this.A03;
                if (r5.A0C()) {
                    if (r5.A01 == 0.0d) {
                        r5.A08(90.0d, true);
                    }
                    r5.A06(0.0d);
                }
            }
            2cs r3 = this.A03;
            if (!r3.A0C() && !z) {
                r3.A08(0.0d, true);
            }
        }
        return super.setVisible(z, z2);
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.save();
        canvas.rotate(-((float) this.A03.A09.A00), A0L.exactCenterX(), (float) A0L.top);
        this.A02.draw(canvas);
        canvas.restore();
    }
}
