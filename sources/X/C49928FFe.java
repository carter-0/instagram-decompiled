package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Window;

/* renamed from: X.FFe  reason: case insensitive filesystem */
public final class C49928FFe {
    public static final C49928FFe A00 = new Object();

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

    public static final Object A01(C307896Rx r2, AnonymousClass6Tm r3) {
        Activity A002;
        Window window;
        boolean A01 = Q0A.A01(r3.A01());
        C307786Rm r0 = r2.A03;
        if (!(r0 == null || (A002 = A00.A00(r0.A00)) == null || (window = A002.getWindow()) == null)) {
            if (A01) {
                window.addFlags(8192);
            } else {
                window.clearFlags(8192);
                return null;
            }
        }
        return null;
    }
}
