package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;

public final class IXG implements AnonymousClass324 {
    public final UserSession A00;
    public final C228232l0 A01;
    public final AnonymousClass311 A02;
    public final AnonymousClass4DU A03;
    public final C2360532g A04;
    public final AnonymousClass324 A05;

    public IXG(UserSession userSession, AnonymousClass311 r3, AnonymousClass4DU r4, C2360532g r5, AnonymousClass324 r6, C228232l0 r7) {
        0qQ.A0B(r5, 5);
        this.A02 = r3;
        this.A00 = userSession;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r7;
    }

    public final C59612JQg CBn() {
        return this.A02.CBn();
    }

    public final void DgX(1Xj r7, AnonymousClass3W1 r8, C59612JQg jQg, int i) {
        boolean A1Z = AnonymousClass7TG.A1Z(r7, r8);
        0qQ.A0B(jQg, 3);
        this.A05.DgX(r7, r8, jQg, i);
        UserSession userSession = this.A00;
        if (C225892f5.A00(userSession).A0O(r7)) {
            C51966G9m.A1O(this.A01, C233162v9.SAVE_CLICK, r7, r8);
        }
        if (SaveApiUtil.A09(userSession, r7) && C253933re.A00(r7, r8.A03)) {
            C2360532g r1 = this.A04;
            if (!r1.A02(r7, r8)) {
                if (182.A06(0Tu.A05, r1.A00, 2342159079416270751L)) {
                    C292885jg.A00(userSession);
                    C292905ji.A00(userSession, r7, this.A03, r8);
                    r8.A0m(A1Z, A1Z);
                }
            }
        }
    }

    public final void DgZ(1Xj r3, AnonymousClass3W1 r4, int i) {
        AnonymousClass7TG.A1N(r3, r4);
        if (C225892f5.A00(this.A00).A0O(r3)) {
            C51966G9m.A1O(this.A01, C233162v9.SAVE_CLICK, r3, r4);
        }
        this.A05.DgZ(r3, r4, i);
    }
}
