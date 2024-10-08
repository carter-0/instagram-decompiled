package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9WS  reason: invalid class name */
public abstract class AnonymousClass9WS extends Drawable {
    public final Paint A00 = AnonymousClass7TE.A0V(3);

    public final int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        C306386Ly r0;
        this.A00.setAlpha(i);
        if (this instanceof C389769qA) {
            r0 = ((C389769qA) this).A0A;
        } else {
            r0 = ((C389759q9) this).A05;
        }
        AnonymousClass7TG.A14(r0, i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C306386Ly r0;
        this.A00.setColorFilter(colorFilter);
        if (this instanceof C389769qA) {
            r0 = ((C389769qA) this).A0A;
        } else {
            r0 = ((C389759q9) this).A05;
        }
        AnonymousClass7TG.A10(colorFilter, r0);
    }

    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
