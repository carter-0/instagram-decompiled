package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.631  reason: invalid class name */
public final class AnonymousClass631 {
    public final 1a8 A00 = new 1a8((C269794fh) null);
    public final UserSession A01;
    public final 0nV A02;
    public final AnonymousClass61N A03;
    public final AnonymousClass12V A04;

    public AnonymousClass631(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        AnonymousClass12T r1 = AnonymousClass12T.A00;
        this.A04 = r1;
        this.A02 = r1.AOJ(458382369, 3);
        this.A03 = (AnonymousClass61N) userSession.A01(AnonymousClass61N.class, AnonymousClass61M.A00);
    }

    public final void A01(List list) {
        if (A03()) {
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            0qQ.A08(comparator);
            this.A00.A02(AnonymousClass61I.A00(this.A01).A02(00k.A0P(",", "", "", 00k.A0g(list, comparator), (0sP) null)), PU2.A00);
            this.A03.A00(110, false);
        }
    }

    public final boolean A03() {
        UserSession userSession = this.A01;
        if (!2HM.A00(userSession).A03() || !182.A06(0Tu.A05, userSession, 36316503993422243L)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        UserSession userSession = this.A01;
        if (!2HM.A00(userSession).A03() || !182.A06(0Tu.A05, userSession, 36316503993225634L)) {
            return false;
        }
        return true;
    }

    public final void A00(G70 g70, boolean z) {
        if (A04()) {
            this.A00.A02(AnonymousClass61I.A00(this.A01).A01(2, 2, z), new C51135Fp7(g70));
        }
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        User A012 = r0.A01(userSession);
        A012.A03.Edr(Boolean.valueOf(z));
        A012.A0d(userSession);
    }

    public final void A02(boolean z) {
        String str;
        if (A03()) {
            this.A00.A02(AnonymousClass61I.A00(this.A01).A01(2, 3, z), new PS4());
        }
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        User A012 = r0.A01(userSession);
        A012.A03.Edq(Boolean.valueOf(z));
        A012.A0d(userSession);
        AnonymousClass61N r1 = this.A03;
        if (r1.A01(113) && A03() && (str = (String) r1.A01.get(114)) != null && str.length() != 0) {
            this.A00.A02(AnonymousClass61I.A00(userSession).A02(str), PU3.A00);
        }
    }

    public final boolean A05() {
        if (!A03() || !0qQ.A0K(this.A03.A00.get(110), true)) {
            return false;
        }
        return true;
    }
}
