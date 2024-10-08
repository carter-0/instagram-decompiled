package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class U3y extends Animation implements C20835X0k {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public final View A08;

    public final boolean willChangeBounds() {
        return true;
    }

    public static void A00(U3y u3y, int i, int i2, int i3, int i4) {
        View view = u3y.A08;
        u3y.A02 = view.getX() - view.getTranslationX();
        u3y.A03 = view.getY() - view.getTranslationY();
        u3y.A07 = view.getWidth();
        int height = view.getHeight();
        u3y.A06 = height;
        u3y.A00 = ((float) i) - u3y.A02;
        u3y.A01 = ((float) i2) - u3y.A03;
        u3y.A05 = i3 - u3y.A07;
        u3y.A04 = i4 - height;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.A02 + (this.A00 * f);
        float f3 = this.A03 + (this.A01 * f);
        this.A08.layout(Math.round(f2), Math.round(f3), Math.round(f2 + ((float) this.A07) + (((float) this.A05) * f)), Math.round(f3 + ((float) this.A06) + (((float) this.A04) * f)));
    }

    public U3y(View view, int i, int i2, int i3, int i4) {
        this.A08 = view;
        A00(this, i, i2, i3, i4);
    }
}
