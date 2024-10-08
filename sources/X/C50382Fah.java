package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fah  reason: case insensitive filesystem */
public final class C50382Fah implements C51901G6v {
    public final Bundle A00;
    public final UserSession A01;

    public C50382Fah(Bundle bundle, UserSession userSession) {
        0qQ.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final boolean CWt() {
        if (!AnonymousClass5IJ.A01(this.A01) || !0sr.A1P(new EV0[]{EV0.Broadcast, null}).contains(C48845El7.A00(this.A00))) {
            return false;
        }
        return true;
    }

    public final void CfS(FragmentActivity fragmentActivity) {
        Dbb.A1R(fragmentActivity);
        UserSession userSession = this.A01;
        F9T.A00(this.A00, fragmentActivity, new E4V(), userSession, "channel_creation_configure");
    }
}
