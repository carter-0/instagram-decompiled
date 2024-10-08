package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class EKF extends C16744V4b {
    public final int A00;
    public final Object A01;

    public EKF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A03() {
        UserSession userSession;
        C48145EZn eZn;
        boolean z;
        FragmentActivity fragmentActivity;
        switch (this.A00) {
            case 0:
                EEP eep = ((C50388Far) this.A01).A00;
                userSession = eep.A0g;
                eZn = C48145EZn.DIRECT_MESSAGE_OMNIPICKER;
                z = true;
                C49947FGb.A06(eZn, userSession, true);
                fragmentActivity = eep.A0m.requireActivity();
                break;
            case 1:
                C72918PPc pPc = (C72918PPc) this.A01;
                userSession = pPc.A0Q;
                eZn = C48145EZn.DIRECT_MESSAGE_SEARCH;
                z = true;
                C49947FGb.A06(eZn, userSession, true);
                fragmentActivity = pPc.A0N.requireActivity();
                break;
            default:
                Fragment fragment = (Fragment) this.A01;
                C358248ab A0U = DbW.A0U(fragment);
                A0U.A09(2131964276);
                A0U.A08(2131964275);
                A0U.A0I(new C71249OgE(fragment, 50), 2131955136);
                DbY.A1M(A0U, 2131968513);
                return;
        }
        C48958Emw.A00(fragmentActivity, eZn, userSession, z, false);
    }
}
