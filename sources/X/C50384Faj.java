package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Faj  reason: case insensitive filesystem */
public final class C50384Faj implements C51901G6v {
    public final Bundle A00;
    public final UserSession A01;

    public C50384Faj(Bundle bundle, UserSession userSession) {
        0qQ.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    public final boolean CWt() {
        if (this.A00.containsKey("InterestBasedChannelType")) {
            return false;
        }
        UserSession userSession = this.A01;
        boolean A012 = C375479Ds.A01(userSession);
        boolean A002 = C375469Dr.A00(userSession);
        boolean A013 = C375489Dt.A01(userSession);
        boolean A003 = AnonymousClass7K4.A00(userSession);
        if (!A013 && !A012) {
            return false;
        }
        if (A003 || A002) {
            return true;
        }
        return false;
    }

    public final void CfS(FragmentActivity fragmentActivity) {
        Dbb.A1R(fragmentActivity);
        UserSession userSession = this.A01;
        F9T.A00(this.A00, fragmentActivity, new C47513E5w(), userSession, C273654mx.A00(2149));
    }
}
