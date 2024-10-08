package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* renamed from: X.2x7  reason: invalid class name and case insensitive filesystem */
public final class C234122x7 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public C234122x7(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        AnonymousClass4DU r12;
        int A03 = AnonymousClass0fD.A03(1424685298);
        C240223Kb r4 = (C240223Kb) obj;
        int A032 = AnonymousClass0fD.A03(-2127461755);
        0qQ.A0B(r4, 0);
        1Xj r5 = r4.A01;
        String str = r4.A02;
        C234042wt r7 = this.A00;
        UserSession userSession = r7.A0B;
        Fragment fragment = r7.A07;
        0qQ.A0A(r5);
        I6Q.A00(fragment, userSession, r5);
        I6Q.A05(r5, r7.A00, C301155ye.A00(), r7.A02, C233162v9.USER_TAG_CLICK);
        if (0qQ.A0K(str, userSession.A06)) {
            1a0 A033 = C46447Df9.A03();
            0gy A002 = AnonymousClass07i.A00(fragment);
            1Xj A1e = r5.A1e(userSession);
            r12 = r7.A0S;
            A033.A00(fragment, A002, r12, r4.A00, (1P0) null, userSession, A1e);
        } else {
            1Xj A1e2 = r5.A1e(userSession);
            int A15 = r5.A15(userSession);
            if (A15 == -1) {
                A15 = 0;
            }
            r12 = r7.A0S;
            C46474Dfc A01 = C46548Dgp.A01(userSession, str, AnonymousClass000.A00(1581), r12.getModuleName());
            A01.A0L = r7.A05;
            String id = A1e2.getId();
            if (id != null) {
                A01.A04 = new SourceModelInfoParams(id, -1, A15);
            }
            C71342cb.A00(userSession).A0A = r5.A2n();
            C234042wt.A00(C46447Df9.A03().A01.A02(userSession, A01.A04()), userSession, r7, AnonymousClass000.A00(3581));
        }
        I6Q.A01(userSession, r5, r12, str);
        String str2 = str;
        C49156EqN.A00(AnonymousClass0kN.A01(r12, userSession), C54689HOu.A0y, r12.getModuleName(), r5.BpP(), str2, r4.A03);
        AnonymousClass0fD.A0A(173383283, A032);
        AnonymousClass0fD.A0A(-1667818593, A03);
    }
}
