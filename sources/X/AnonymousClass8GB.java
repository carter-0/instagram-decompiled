package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.8GB  reason: invalid class name */
public final class AnonymousClass8GB {
    public ObjectAnimator A00;

    public final void A01(View view) {
        Window A002;
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        view.setVisibility(8);
        if (view.isAttachedToWindow() && (A002 = A00(view)) != null) {
            WindowManager.LayoutParams attributes = A002.getAttributes();
            attributes.screenBrightness = -1.0f;
            A002.setAttributes(attributes);
        }
    }

    public static Window A00(View view) {
        View findViewById;
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(16908290)) == null || (activity = (Activity) 0mE.A00(findViewById.getContext(), Activity.class)) == null) {
            return null;
        }
        return activity.getWindow();
    }
}
