package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class U3v extends Animation {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public U3v(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.A00.setAnimationProgress(1.0f - f);
    }
}
