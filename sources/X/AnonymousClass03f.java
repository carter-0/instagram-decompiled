package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: X.03f  reason: invalid class name */
public final class AnonymousClass03f implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakHashMap A00 = new WeakHashMap();

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onGlobalLayout() {
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
