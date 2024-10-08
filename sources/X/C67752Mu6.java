package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.Mu6  reason: case insensitive filesystem */
public final class C67752Mu6 extends 2YL {
    public Integer A00 = AnonymousClass05K.A00;
    public final UserSession A01;
    public final C70576OBy A02;
    public final KWW A03;
    public final C68685NSr A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final 05G A0B;

    public C67752Mu6(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        02z A1J = JTO.A1J();
        this.A0B = A1J;
        02z A10 = DbS.A10(DbS.A0y());
        this.A05 = A10;
        02z A102 = DbS.A10(DbS.A0y());
        this.A06 = A102;
        02z A103 = DbS.A10(DbS.A0y());
        this.A08 = A103;
        this.A09 = 10b.A03(A103);
        02z A104 = DbS.A10(DbS.A0y());
        this.A07 = A104;
        0pq A012 = AnonymousClass10H.A01(new C73580PgE(this, 1), A104, A10, A102, A1J);
        this.A0A = 10b.A02(C72635PDo.A00, C318116oQ.A00(this), A012, AnonymousClass10A.A01);
        this.A04 = new C68685NSr(userSession);
        this.A03 = (KWW) userSession.A01(KWW.class, C73921Pm1.A00(userSession, 41));
        this.A02 = new C70576OBy(userSession);
    }

    public final void A01(Set set, int i) {
        List<C70594OCr> A1I;
        0qQ.A0B(set, 1);
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36326816209778673L)) {
            A1I = C317486nL.A04.A06(userSession);
        } else {
            A1I = AnonymousClass7TE.A1I(new C70594OCr(C8916RFj.A05, 03t.A0J(C317486nL.A04.A07(userSession))));
        }
        boolean A1S = AnonymousClass7TF.A1S(i, 29);
        05G r5 = this.A05;
        if (!A1S) {
            r5.Epw(set);
            this.A0B.Epw(A1I);
            return;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : set) {
            DbV.A1U(next, A1C, ((Set) this.A06.getValue()).contains(next) ? 1 : 0);
        }
        r5.Epw(00k.A0j(A1C));
        05G r6 = this.A0B;
        ArrayList A0r = AnonymousClass7TG.A0r(A1I);
        for (C70594OCr oCr : A1I) {
            C8916RFj rFj = oCr.A00;
            List list = oCr.A01;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next2 : list) {
                DbV.A1U(next2, A1C2, ((Set) this.A06.getValue()).contains(next2) ? 1 : 0);
            }
            A0r.add(new C70594OCr(rFj, A1C2));
        }
        r6.Epw(A0r);
    }

    public static final ArrayList A00(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C317486nL r2 = (C317486nL) next;
            if (i == 0 || (i <= C51966G9m.A06(list) && !C337097fg.A01(r2, (C317486nL) list.get(i - 1)))) {
                A1C.add(r2);
            }
            i = i2;
        }
        return A1C;
    }
}
