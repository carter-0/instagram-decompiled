package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.9VX  reason: invalid class name */
public final class AnonymousClass9VX extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SwipeRefreshLayout A02;

    public AnonymousClass9VX(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.A02 = swipeRefreshLayout;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        C338507i4 r3 = this.A02.A0C;
        int i = this.A01;
        r3.setAlpha((int) (((float) i) + (((float) (this.A00 - i)) * f)));
    }
}
