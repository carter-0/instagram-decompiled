package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public abstract class FG4 {
    public static final void A00(AnonymousClass4DH r7, UserSession userSession, F1D f1d, 0sL r10) {
        0qQ.A0B(userSession, 1);
        FragmentActivity requireActivity = r7.requireActivity();
        C322326ve A00 = C322316vd.A00(userSession);
        boolean z = f1d.A0b;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/update_fb_profile_link/");
        A0a.A0H(AnonymousClass000.A00(190), z);
        1OC A0S = DbU.A0S(A0a, DwP.class, F83.class);
        A0S.A00 = new EDW(8, A00, requireActivity, r10, userSession);
        r7.schedule(A0S);
    }

    public static final void A01(AnonymousClass4DH r9, UserSession userSession, F1D f1d, 0sL r12) {
        0qQ.A0B(userSession, 1);
        FragmentActivity requireActivity = r9.requireActivity();
        C322326ve A00 = C322316vd.A00(userSession);
        boolean z = f1d.A0c;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/update_fb_page_link/");
        A0a.A0Q(DwP.class, F83.class);
        A0a.A0H(AnonymousClass000.A00(191), z);
        1OC A0U = DbT.A0U(A0a, true);
        A0U.A00 = new EDW(9, A00, requireActivity, r12, userSession);
        r9.schedule(A0U);
    }

    public static final void A03(0sP r2, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1OC A06 = C318486p2.A06(userSession);
        C47696EDf.A01(A06, r2, 8);
        1ES.A03(A06);
    }

    public static void A02(UserSession userSession, Object obj, int i) {
        A03(new C51654FyG(obj, i), userSession);
    }

    public static final void A04(0sP r3, UserSession userSession) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A(C273654mx.A00(531));
        A0M.A9m("edit", "true");
        1OC A0S = DbU.A0S(A0M, DvQ.class, C49812F7z.class);
        EDV.A00(A0S, r3, userSession, 30);
        1ES.A03(A0S);
    }
}
