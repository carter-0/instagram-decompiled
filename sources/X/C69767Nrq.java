package X;

import android.view.View;

/* renamed from: X.Nrq  reason: case insensitive filesystem */
public abstract class C69767Nrq {
    public static final void A00(View view, boolean z) {
        int i;
        if (view != null) {
            int visibility = view.getVisibility();
            if (!z) {
                i = 8;
                if (visibility == 8) {
                    return;
                }
            } else if (visibility != 0) {
                i = 0;
            } else {
                return;
            }
            view.setVisibility(i);
        }
    }
}
