package X;

import android.view.View;

public final class W8I implements View.OnAttachStateChangeListener {
    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.requestApplyInsets();
    }
}
