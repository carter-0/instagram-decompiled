package X;

import android.app.Activity;
import android.app.Dialog;
import com.instagram.common.session.UserSession;

/* renamed from: X.VhY  reason: case insensitive filesystem */
public final class C17881VhY {
    public Dialog A00;
    public final Activity A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;

    public final Dialog A00(X6V x6v) {
        0qQ.A0B(x6v, 0);
        Activity activity = this.A01;
        if (activity == null) {
            return null;
        }
        W5U w5u = new W5U(x6v, 18);
        W5U w5u2 = new W5U(this, 19);
        C18833W4v w4v = new C18833W4v(9, x6v, this);
        C50030FJp fJp = new C50030FJp(0, this, x6v);
        W4V w4v2 = new W4V(x6v, 0);
        C358248ab r2 = new C358248ab(activity);
        r2.A09(2131975077);
        r2.A08(2131975076);
        r2.A0I(w5u, 2131956706);
        r2.A0W(w5u2, C358278ae.DEFAULT, AnonymousClass7TE.A16(activity, 2131975078), false);
        r2.A0C(w4v);
        boolean z = !this.A04;
        r2.A0r(z);
        r2.A0s(z);
        r2.A0B(w4v2);
        r2.A0f(fJp);
        return r2.A02();
    }

    public C17881VhY(Activity activity, UserSession userSession, String str, boolean z) {
        this.A01 = activity;
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = z;
    }
}
