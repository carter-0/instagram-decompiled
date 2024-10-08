package X;

import android.view.View;

/* renamed from: X.0fU  reason: invalid class name */
public abstract class AnonymousClass0fU {
    public static void A00(View.OnClickListener onClickListener, View view) {
        AnonymousClass0fT r0;
        if (onClickListener == null) {
            r0 = null;
        } else {
            r0 = new AnonymousClass0fT(onClickListener, view);
        }
        view.setOnClickListener(r0);
    }
}
