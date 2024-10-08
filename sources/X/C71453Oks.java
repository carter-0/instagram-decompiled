package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Oks  reason: case insensitive filesystem */
public final class C71453Oks implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C71453Oks(View view, int i) {
        this.A00 = i;
        this.A01 = view;
    }

    public final void onWindowFocusChanged(boolean z) {
        View view;
        if (this.A00 != 0) {
            if (z) {
                view = (View) this.A01;
                if (view.isFocused()) {
                    0nA.A0Q(view);
                }
            } else {
                return;
            }
        } else if (z) {
            view = (View) this.A01;
            if (view.isFocused()) {
                0nA.A0M(view);
            }
        } else {
            return;
        }
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
