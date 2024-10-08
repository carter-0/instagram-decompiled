package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.MsL  reason: case insensitive filesystem */
public final class C67683MsL extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ ViewGroup.MarginLayoutParams A05;

    public C67683MsL(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        this.A05 = marginLayoutParams;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = view;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A05;
        int i = this.A03;
        marginLayoutParams.topMargin = (int) (((float) i) + (((float) (this.A01 - i)) * f));
        int i2 = this.A02;
        marginLayoutParams.bottomMargin = (int) (((float) i2) + (((float) (this.A00 - i2)) * f));
        this.A04.setLayoutParams(marginLayoutParams);
    }
}
