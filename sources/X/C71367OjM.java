package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;

/* renamed from: X.OjM  reason: case insensitive filesystem */
public final class C71367OjM implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C71367OjM(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A06 = obj2;
        this.A05 = obj5;
        this.A01 = obj;
        this.A04 = obj6;
        this.A02 = obj4;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(205634652);
                UserSession userSession = (UserSession) this.A06;
                C313756gx A002 = C313746gw.A00(userSession);
                N4P n4p = (N4P) this.A05;
                int A062 = n4p.A06();
                A002.A0K(AnonymousClass05K.A00, N4P.A03(n4p), n4p.A0Q, A062);
                C330957Ox r9 = (C330957Ox) this.A02;
                C71094OcU.A00((Context) this.A01, userSession, (NKQ) this.A03, r9, n4p, (C68303N9q) this.A04);
                i2 = 83999068;
                break;
            case 1:
                i = AnonymousClass0fD.A05(1688184842);
                UserSession userSession2 = (UserSession) this.A06;
                C72180Oxp A003 = C69867NtV.A00(userSession2);
                N4P n4p2 = (N4P) this.A05;
                int A063 = n4p2.A06();
                C69871NtZ.A00(A003.A00, N4P.A03(n4p2), n4p2.A0Q, "remove_moderator_dialog_rendered", "tap", "user_dot_menu", "thread_details_people", DbY.A0m("invite_status", "accepted"), A063);
                C330957Ox r16 = (C330957Ox) this.A02;
                C71094OcU.A01((Context) this.A01, userSession2, (NKQ) this.A03, r16, n4p2, (C68303N9q) this.A04);
                i2 = 407899922;
                break;
            case 2:
                i = AnonymousClass0fD.A05(590391742);
                UserSession userSession3 = (UserSession) this.A06;
                C313756gx A004 = C313746gw.A00(userSession3);
                N4P n4p3 = (N4P) this.A05;
                int A064 = n4p3.A06();
                A004.A0K(AnonymousClass05K.A01, N4P.A03(n4p3), n4p3.A0Q, A064);
                C330957Ox r92 = (C330957Ox) this.A02;
                C71094OcU.A02((Context) this.A01, userSession3, (NKQ) this.A03, r92, n4p3, (C68303N9q) this.A04, 6);
                i2 = 1392698537;
                break;
            case 3:
                i = AnonymousClass0fD.A05(-136345578);
                UserSession userSession4 = (UserSession) this.A06;
                C72180Oxp A005 = C69867NtV.A00(userSession4);
                N4P n4p4 = (N4P) this.A05;
                int A065 = n4p4.A06();
                C69871NtZ.A00(A005.A00, N4P.A03(n4p4), n4p4.A0Q, "remove_moderator_dialog_rendered", "tap", "user_dot_menu", "thread_details_people", DbY.A0m("invite_status", "invited"), A065);
                C330957Ox r162 = (C330957Ox) this.A02;
                C71094OcU.A02((Context) this.A01, userSession4, (NKQ) this.A03, r162, n4p4, (C68303N9q) this.A04, 7);
                i2 = -863775425;
                break;
            case 4:
                i = AnonymousClass0fD.A05(597363609);
                ReelStore A052 = 1OP.A05((UserSession) this.A06);
                User user = (User) this.A04;
                ((C74585PxY) this.A01).D2H(A052.A0K(new 1Nr(user), user.getId(), false), (C67431Mnm) this.A02, (C66967Mg0) this.A03, (C66632Ma1) this.A05, false);
                i2 = -299389953;
                break;
            case 5:
                i = AnonymousClass0fD.A05(1346337771);
                C74585PxY pxY = (C74585PxY) this.A01;
                C66632Ma1 ma1 = (C66632Ma1) this.A05;
                ReelStore A053 = 1OP.A05((UserSession) this.A06);
                User user2 = (User) this.A04;
                String BNG = user2.A03.BNG();
                if (BNG != null) {
                    pxY.D2H(A053.A0K(new 1Nr(user2), BNG, false), (C67431Mnm) this.A02, (C66967Mg0) this.A03, ma1, true);
                    i2 = -500260160;
                    break;
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0C(1197849374, i);
                    throw A0y;
                }
            case 6:
                i = AnonymousClass0fD.A05(905602295);
                ReelStore A054 = 1OP.A05((UserSession) this.A06);
                User user3 = (User) this.A04;
                Reel A0K = A054.A0K(new 1Nr(user3), user3.getId(), false);
                PJR pjr = (PJR) this.A02;
                C66967Mg0 mg0 = (C66967Mg0) this.A03;
                ((C67418MnZ) this.A01).A01.D2H(A0K, pjr, mg0, (C66632Ma1) this.A05, false);
                i2 = -1588438800;
                break;
            default:
                int A055 = AnonymousClass0fD.A05(-1423481095);
                C67418MnZ mnZ = (C67418MnZ) this.A01;
                C66632Ma1 ma12 = (C66632Ma1) this.A05;
                ReelStore A056 = 1OP.A05((UserSession) this.A06);
                User user4 = (User) this.A04;
                String BNG2 = user4.A03.BNG();
                if (BNG2 != null) {
                    mnZ.A01.D2H(A056.A0K(new 1Nr(user4), BNG2, false), (PJR) this.A02, (C66967Mg0) this.A03, ma12, true);
                    AnonymousClass0fD.A0C(-1777864643, A055);
                    return;
                }
                IllegalStateException A0y2 = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0C(1046545421, A055);
                throw A0y2;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
