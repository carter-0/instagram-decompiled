package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.FFf  reason: case insensitive filesystem */
public final class C49929FFf {
    public static final C49929FFf A00 = new Object();

    public static final Object A01(C307896Rx r5, AnonymousClass6Tm r6) {
        View findViewById;
        InputMethodManager inputMethodManager;
        C307786Rm A002 = C276734to.A00(r5, r6, 0);
        C276544tV r1 = C307476Qg.A02(A002).A06;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        View A05 = r1.A05(A002);
        if (A05 != null) {
            InputMethodManager inputMethodManager2 = (InputMethodManager) A05.getContext().getSystemService("input_method");
            if (inputMethodManager2 != null) {
                inputMethodManager2.hideSoftInputFromWindow(A05.getWindowToken(), 0);
            }
            A05.clearFocus();
            return null;
        }
        Context context = A002.A00;
        Activity A003 = A00.A00(context);
        if (A003 == null || (findViewById = A003.findViewById(16908290)) == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return null;
        }
        inputMethodManager.hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
        return null;
    }

    private final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        0qQ.A07(baseContext);
        return A00(baseContext);
    }
}
