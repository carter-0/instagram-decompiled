package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Efi  reason: case insensitive filesystem */
public abstract class C48511Efi {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        boolean A06;
        C307896Rx r7 = r10;
        C307786Rm r0 = r10.A03;
        C277014uI A0N = DbW.A0N(r11);
        C277014uI A0O = DbW.A0O(r11);
        UserSession A0V = DbU.A0V(r7);
        DbS.A1Z(A0V);
        UserSession userSession = A0V;
        AnonymousClass6Tm A00 = DbU.A0T(r0).A00();
        if (userSession == null) {
            A06 = false;
        } else {
            A06 = 182.A06(0Tu.A05, userSession, 36313712264480967L);
        }
        if (!A06) {
            C299275ur.A00(r7, A00, A0O);
            return null;
        }
        FragmentActivity A08 = Dba.A08(r7);
        0gy A002 = AnonymousClass07i.A00(A08);
        1NY A0L = DbZ.A0L(userSession);
        Dba.A1H(A0L, "age_platform/age_verification/resume/");
        1OC A0K = DbW.A0K(A0L);
        A0K.A00 = new EDW(0, r7, A00, A0O, A0N);
        1ES.A00(A08, A002, A0K);
        return null;
    }
}
