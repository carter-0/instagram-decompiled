package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.instagram.android.R;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.37N  reason: invalid class name */
public final class AnonymousClass37N extends Drawable {
    public boolean A00;
    public final int A01 = -1;
    public final int A02 = -1;
    public final int A03;
    public final int A04 = -1;
    public final int A05 = -1;
    public final Paint A06 = new Paint();

    public AnonymousClass37N(Resources.Theme theme, Integer num) {
        int i;
        0qQ.A0B(theme, 1);
        0qQ.A0B(num, 2);
        switch (num.intValue()) {
            case 0:
                i = R.attr.actionBarPressedColor;
                break;
            case 1:
                i = R.attr.clearActionBarForegroundPressedColor;
                break;
            default:
                i = R.attr.highlightActionBarForegroundPressedColor;
                break;
        }
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        this.A03 = typedValue.data;
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        if (this.A00) {
            Paint paint = this.A06;
            paint.setColor(this.A03);
            if (this.A02 == -1 || this.A04 == -1 || this.A05 == -1 || this.A01 == -1) {
                canvas.drawRect(getBounds(), paint);
            } else {
                canvas2.drawRect(0.0f, 0.0f, 0.0f, 0.0f, paint);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z;
        0qQ.A0B(iArr, 0);
        boolean z2 = this.A00;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (iArr[i] == 16842919) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.A00 = z;
        if (z2 == z) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
