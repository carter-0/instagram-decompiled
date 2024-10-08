package X;

import android.view.View;

/* renamed from: X.NvJ  reason: case insensitive filesystem */
public abstract class C69979NvJ {
    public static final void A00(View view) {
        view.requestFocus();
        if (!view.hasWindowFocus()) {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new C71453Oks(view, 1));
        } else if (view.isFocused()) {
            0nA.A0Q(view);
        }
    }
}
