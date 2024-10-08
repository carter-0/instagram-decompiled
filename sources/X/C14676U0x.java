package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U0x  reason: case insensitive filesystem */
public final class C14676U0x extends Drawable {
    public long A00;
    public C20846X0y A01;
    public final Context A02;
    public final Choreographer.FrameCallback A03 = new W81(this, 3);
    public final Choreographer A04 = Choreographer.getInstance();
    public final List A05 = C18673VwW.A02(255);
    public final List A06;
    public final List A07 = new ArrayList();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        for (C17878VhV A002 : this.A07) {
            A002.A00(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public static final float A00(float f, float f2) {
        2SQ r1 = 2SP.A00;
        0qQ.A0B(r1, 0);
        float min = Math.min(f, f2);
        float max = Math.max(f, f2);
        return Math.min(Math.max(min, max), Math.max(Math.min(min, max), (((((float) new Wv2(r1).nextGaussian()) - -2.8f) / (2.8f - -2.8f)) * (f2 - f)) + f));
    }

    public final void setAlpha(int i) {
        for (Paint alpha : this.A05) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ConfettiDrawable doesn't support ColorFilters.");
    }

    public C14676U0x(Context context) {
        this.A02 = context;
        this.A06 = C18673VwW.A01(context);
    }
}
