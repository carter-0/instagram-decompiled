package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.9yd  reason: invalid class name and case insensitive filesystem */
public abstract class C394749yd {
    public static final void A00(View view, boolean z) {
        Resources resources = view.getResources();
        int i = 2131956089;
        if (z) {
            i = 2131956090;
        }
        String string = resources.getString(i);
        0qQ.A0A(string);
        int i2 = 2131956087;
        if (z) {
            i2 = 2131956088;
        }
        String string2 = resources.getString(i2);
        0qQ.A0A(string2);
        view.setContentDescription(string);
        2eQ.A01(view);
        2eQ.A08(view, string2);
    }
}
