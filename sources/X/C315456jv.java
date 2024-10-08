package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jv  reason: invalid class name and case insensitive filesystem */
public final class C315456jv implements C234222xL {
    public AnonymousClass5Gv A00;
    public AnonymousClass6Z3 A01;
    public boolean A02;
    public final Activity A03;
    public final UserSession A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C377079Kl(this, 12));

    public final boolean Ds8(AnonymousClass5Gv r2) {
        return true;
    }

    public final void DsE(AnonymousClass5Gv r1) {
    }

    public final void DsC(AnonymousClass5Gv r2) {
        AnonymousClass6Z3 r0 = this.A01;
        if (r0 != null) {
            r0.DsB();
        }
    }

    public final void DsH(AnonymousClass5Gv r6) {
        1Av r4 = (1Av) this.A05.getValue();
        r4.A3f.Epx(r4, true, 1Av.A8a[203]);
        this.A02 = false;
    }

    public C315456jv(Activity activity, UserSession userSession) {
        this.A03 = activity;
        this.A04 = userSession;
    }
}
