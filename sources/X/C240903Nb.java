package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3Nb  reason: invalid class name and case insensitive filesystem */
public abstract class C240903Nb {
    public static final C240913Nc A00(View view, int i) {
        0qQ.A0B(view, 0);
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            throw new IllegalArgumentException(002.A0O("Cannot find view stub with id: ", i));
        } else if (findViewById instanceof ViewStub) {
            return new C240913Nc(view, (View) null, (ViewStub) findViewById, i);
        } else {
            return new C240913Nc(view, findViewById, (ViewStub) null, i);
        }
    }
}
