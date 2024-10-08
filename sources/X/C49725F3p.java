package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.F3p  reason: case insensitive filesystem */
public final class C49725F3p {
    public 0sL A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(G20.A00);
    public final C49490EwV A02;
    public final C47538E7b A03;

    public final void A00(C53329GmF gmF) {
        String str;
        C262224Cq A032;
        0sL mGk;
        int i;
        C53329GmF gmF2 = gmF;
        0qQ.A0B(gmF, 0);
        C47538E7b e7b = this.A03;
        C49714F2z f2z = e7b.A05;
        User user = gmF.A01;
        UserSession userSession = e7b.A01;
        Integer num = AnonymousClass05K.A00;
        if (f2z.A01(userSession, user, num)) {
            A032 = e7b.A03();
            i = 34;
        } else if (gmF.A09 != null) {
            A032 = e7b.A03();
            i = 35;
        } else {
            Boolean bool = gmF.A03;
            if (0qQ.A0K(bool, true) || 0qQ.A0K(gmF.A02, true)) {
                if (0qQ.A0K(bool, true)) {
                    str = "SCAMS";
                } else {
                    str = "IMPERSONATION";
                }
                A032 = e7b.A03();
                mGk = new C66173MGk(gmF2, e7b, str, (AnonymousClass4D7) null, 1);
                1Eo.A03(num, 19B.A00, mGk, A032);
            }
            0qQ.A0B(user, 0);
            if (user.A1e()) {
                A032 = e7b.A03();
                i = 36;
            } else {
                C49490EwV ewV = e7b.A02;
                String str2 = gmF.A0B;
                int i2 = gmF.A00;
                0qQ.A0B(str2, 0);
                DdQ.A00(ewV.A00, ewV.A01, str2, i2);
                A032 = e7b.A03();
                i = 37;
            }
        }
        mGk = new MH3(e7b, gmF, (AnonymousClass4D7) null, i);
        1Eo.A03(num, 19B.A00, mGk, A032);
    }

    public final void A01(User user, boolean z, boolean z2) {
        0qQ.A0B(user, 0);
        C47538E7b e7b = this.A03;
        e7b.A04.A06(user, new C51792G2b(e7b, 0), new G4U(e7b, 7), z, z2);
    }

    public final void A02(String str, int i) {
        0qQ.A0B(str, 0);
        C49490EwV ewV = this.A02;
        DdQ.A03(ewV.A00, ewV.A01, str, i);
        0sL r1 = this.A00;
        if (r1 != null) {
            r1.invoke(str, AnonymousClass000.A00(602));
        }
    }

    public final void A03(String str, int i) {
        0qQ.A0B(str, 0);
        if (((Set) this.A01.getValue()).add(str)) {
            C49490EwV ewV = this.A02;
            DdQ.A02(ewV.A00, ewV.A01, str, i);
        }
    }

    public final void A04(String str, int i) {
        0qQ.A0B(str, 0);
        C49490EwV ewV = this.A02;
        DdQ.A01(ewV.A00, ewV.A01, str, i);
        C47538E7b e7b = this.A03;
        DbX.A1W(e7b, str, e7b.A03(), 5);
    }

    public C49725F3p(C49490EwV ewV, C47538E7b e7b) {
        this.A03 = e7b;
        this.A02 = ewV;
    }
}
