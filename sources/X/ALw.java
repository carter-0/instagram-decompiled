package X;

import android.view.View;

public final class ALw implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C295015nP A00;

    public final void onViewAttachedToWindow(View view) {
    }

    public ALw(C295015nP r1) {
        this.A00 = r1;
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A00.A04();
        view.removeOnAttachStateChangeListener(this);
    }
}
