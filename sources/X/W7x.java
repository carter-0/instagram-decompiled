package X;

import android.transition.Transition;
import android.view.View;
import android.view.ViewOverlay;
import com.google.android.material.transition.platform.MaterialContainerTransform;

public final class W7x implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ U19 A03;
    public final /* synthetic */ MaterialContainerTransform A04;

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        ViewOverlay viewOverlay = null;
        MaterialContainerTransform materialContainerTransform = this.A04;
        materialContainerTransform.removeListener(this);
        if (!materialContainerTransform.holdAtEndEnabled) {
            this.A02.setAlpha(1.0f);
            this.A01.setAlpha(1.0f);
            View view = this.A00;
            if (view != null) {
                viewOverlay = view.getOverlay();
            }
            viewOverlay.remove(this.A03);
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        ViewOverlay viewOverlay = null;
        View view = this.A00;
        if (view != null) {
            viewOverlay = view.getOverlay();
        }
        viewOverlay.add(this.A03);
        this.A02.setAlpha(0.0f);
        this.A01.setAlpha(0.0f);
    }

    public W7x(View view, View view2, View view3, U19 u19, MaterialContainerTransform materialContainerTransform) {
        this.A04 = materialContainerTransform;
        this.A00 = view;
        this.A03 = u19;
        this.A02 = view2;
        this.A01 = view3;
    }

    public W7x() {
    }
}
