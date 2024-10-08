package X;

import com.instagram.common.session.UserSession;

public final class IL2 implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public IL2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    public final void A00() {
        C51965G9l.A1W(this.A02, new C55696Hlt((AnonymousClass637) this.A01, (AnonymousClass636) this.A03, ((C70571OBt) this.A04).A01.A06));
    }

    public final void A01() {
        C71068Oan oan = (C71068Oan) this.A04;
        C70812OMh oMh = oan.A03;
        if (oMh != null) {
            oMh.A01(new C71651OoW(14, oan, this.A02, this.A01), 2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onFailure(Throwable th) {
        boolean equals;
        C243373Ym r1;
        C243373Ym r0;
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 3:
                A00();
                return;
            default:
                0qQ.A0B(th, 0);
                String message = th.getMessage();
                String A002 = AnonymousClass000.A00(2526);
                if (message == null) {
                    equals = false;
                } else {
                    equals = message.equals(A002);
                }
                boolean z = !equals;
                C45414Cvu cvu = (C45414Cvu) this.A02;
                if (z) {
                    ((2IR) this.A01).onFailure(th);
                    UserSession userSession = (UserSession) this.A04;
                    AnonymousClass1Xo r2 = (AnonymousClass1Xo) this.A03;
                    if (C225892f5.A00(userSession).A0O(r2)) {
                        r1 = C243373Ym.SAVED;
                        r0 = C243373Ym.NOT_SAVED;
                    } else {
                        r1 = C243373Ym.NOT_SAVED;
                        r0 = C243373Ym.SAVED;
                    }
                    C55116HcP.A00(userSession, r1, r0, r2);
                    C225892f5.A00(userSession).A0N(cvu, false);
                    return;
                }
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                A01();
                return;
            case 3:
                A00();
                return;
            default:
                C225892f5.A00((UserSession) this.A04).A0N((C45414Cvu) this.A02, true);
                ((2IR) this.A01).onSuccess(obj);
                return;
        }
    }
}
