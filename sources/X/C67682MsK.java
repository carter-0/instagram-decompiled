package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.MsK  reason: case insensitive filesystem */
public final class C67682MsK extends Animation {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public C67682MsK(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = marginLayoutParams;
        switch (i3) {
            case 0:
            case 1:
                this.A01 = i;
                this.A02 = i2;
                break;
            default:
                this.A02 = i;
                this.A01 = i2;
                break;
        }
        this.A04 = view;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03;
        if (2 - i == 0) {
            int i2 = this.A02;
            marginLayoutParams.topMargin = (int) (((float) i2) + (((float) (this.A01 - i2)) * f));
        } else if (marginLayoutParams != null) {
            int i3 = this.A01;
            marginLayoutParams.bottomMargin = i3 + ((int) (((float) (this.A02 - i3)) * f));
        }
        ((View) this.A04).setLayoutParams(marginLayoutParams);
    }
}
