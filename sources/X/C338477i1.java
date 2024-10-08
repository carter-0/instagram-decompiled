package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.7i1  reason: invalid class name and case insensitive filesystem */
public final class C338477i1 extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public C338477i1(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.A00.A07(f);
    }
}
