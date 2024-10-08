package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class GVQ extends Drawable {
    public final float A00;
    public final float A01;
    public final Rect A02 = AnonymousClass7TE.A0W();
    public final GVE A03;
    public final GVE A04;

    public static GVQ A00(Context context, float f, float f2) {
        float A042 = 0nA.A04(context, 1);
        int alpha = Color.alpha(637534208);
        return new GVQ(A042, f, f2, C51973G9u.A01(637534208, Math.min(alpha, AnonymousClass7TE.A05(f / 0nA.A04(context, 10), (float) alpha))));
    }

    public final int getOpacity() {
        return -2;
    }

    public GVQ(float f, float f2, float f3, int i) {
        02V.A05(C51970G9q.A1T((f > f2 ? 1 : (f == f2 ? 0 : -1))));
        this.A01 = f2;
        this.A00 = f;
        this.A03 = new GVE(855638016, f, f3);
        this.A04 = new GVE(i, f2, f3);
    }

    public final void draw(Canvas canvas) {
        this.A04.draw(canvas);
        this.A03.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = this.A02;
        rect2.set(rect);
        int round = Math.round(this.A01 - this.A00);
        rect2.inset(round, round);
        this.A03.setBounds(rect2);
        this.A04.setBounds(rect);
    }

    public final void setAlpha(int i) {
        this.A03.mutate().setAlpha(i);
        this.A04.mutate().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.mutate().setColorFilter(colorFilter);
        this.A04.mutate().setColorFilter(colorFilter);
    }
}
