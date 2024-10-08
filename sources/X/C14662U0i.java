package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.U0i  reason: case insensitive filesystem */
public final class C14662U0i extends Drawable {
    public final ActionBarContainer A00;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A04) {
            drawable = actionBarContainer.A01;
            if (drawable == null) {
                return;
            }
        } else {
            Drawable drawable2 = actionBarContainer.A00;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            drawable = actionBarContainer.A02;
            if (drawable == null || !actionBarContainer.A05) {
                return;
            }
        }
        drawable.draw(canvas);
    }

    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.A00;
        if (!actionBarContainer.A04) {
            drawable = actionBarContainer.A00;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.A01 != null) {
            drawable = actionBarContainer.A00;
        } else {
            return;
        }
        drawable.getOutline(outline);
    }

    public C14662U0i(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }
}
