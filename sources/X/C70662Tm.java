package X;

import android.view.View;

/* renamed from: X.2Tm  reason: invalid class name and case insensitive filesystem */
public final class C70662Tm implements C70652Tj {
    public final int Bdk(View view, int i) {
        View view2;
        if (view.getParent() instanceof View) {
            view2 = (View) view.getParent();
        } else {
            view2 = view;
        }
        return Math.min(view.getMeasuredHeight(), i - ((int) (((float) Math.min(view2.getWidth(), view2.getHeight())) / 1.7777778f)));
    }
}
