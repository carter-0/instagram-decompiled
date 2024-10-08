package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9X4  reason: invalid class name */
public final class AnonymousClass9X4 extends Drawable implements AnonymousClass5MJ {
    public final Drawable A00;
    public final Drawable A01;
    public final AnonymousClass9X6 A02;
    public final C15904UkT A03;
    public final AnonymousClass9WW A04;

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                AnonymousClass7TG.A0z(canvas, drawable2);
            }
            C15904UkT ukT = this.A03;
            AnonymousClass7TF.A15(canvas, drawable, (float) ukT.A01, (float) ukT.A02);
        }
        this.A02.draw(canvas);
        this.A04.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final C2802350v BzV() {
        return this.A03;
    }

    public final void EXC(int i, int i2) {
        this.A02.A00 = i;
    }

    public final int getDurationInMs() {
        return this.A02.getDurationInMs();
    }

    public final int getIntrinsicHeight() {
        C15904UkT ukT = this.A03;
        return ukT.A00 + ukT.A02 + this.A04.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A03.A04;
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public AnonymousClass9X4(Context context, Drawable drawable, C15904UkT ukT) {
        Drawable drawable2;
        AnonymousClass7TG.A1O(context, ukT);
        this.A03 = ukT;
        this.A01 = drawable;
        this.A02 = new AnonymousClass9X6(context, drawable, ukT);
        this.A04 = new AnonymousClass9WW(context, drawable, ukT);
        int A042 = (int) 0nA.A04(context, 36);
        if (ukT.A0N) {
            drawable2 = context.getDrawable(R.drawable.filled_grid_album_icon);
        } else {
            drawable2 = null;
        }
        this.A00 = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(new Rect(0, 0, A042, A042));
        }
    }
}
