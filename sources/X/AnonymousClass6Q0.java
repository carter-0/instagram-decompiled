package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.6Q0  reason: invalid class name */
public abstract class AnonymousClass6Q0 {
    public static final void A00(C307136Oy r3) {
        View view = r3.A04;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        C252063oV r2 = r3.A05;
        Context context = r2.getView().getContext();
        0qQ.A07(context);
        AnonymousClass6MN.A00((TextView) r2.getView(), context);
        r3.A00();
        ((TextView) r2.getView()).setText("");
    }
}
