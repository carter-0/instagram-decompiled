package X;

import com.instagram.common.session.UserSession;

public final class IUG implements C2363233h {
    public final AnonymousClass4DU A00;
    public final UserSession A01;
    public final C2356130n A02;
    public final C2363233h A03;
    public final C249763kK A04;

    public final void DkW(1Xj r14, AnonymousClass3W1 r15, String str, boolean z, boolean z2) {
        0xF r3;
        AnonymousClass3W1 r7 = r15;
        boolean A1X = DbW.A1X(r15);
        UserSession userSession = this.A01;
        AnonymousClass4DU r2 = this.A00;
        AnonymousClass3WA r6 = r15.A0m;
        String sessionId = this.A04.getSessionId();
        1Xj r5 = r14;
        if (r2 instanceof C232682uF) {
            r3 = ((C232682uF) r2).E4l(r14).A00();
        } else {
            r3 = null;
        }
        I7O.A03(r2, r3, userSession, r5, r6, r7, "sfplt_in_menu", sessionId, DbT.A0x(r14), r15.getPosition(), A1X);
        this.A03.DkW(r14, r15, str, z, A1X);
    }

    public final void Ds5(1UQ r15, 1Xj r16, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str7 = str;
        0qQ.A0B(str7, 1);
        this.A03.Ds5(r15, r16, str7, str2, str3, str4, str5, str6, i, i2, z, z2, z3);
    }

    public final void E0t(Integer num) {
        0qQ.A0B(num, 0);
        this.A03.E0t(num);
    }

    public final void EuH(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r3, 1);
        this.A03.EuH(r2, r3);
    }

    public final void EuJ(1Xj r2, AnonymousClass3W1 r3) {
        0qQ.A0B(r3, 1);
        this.A03.EuJ(r2, r3);
    }

    public final void Ev8(1Xj r2, AnonymousClass3W1 r3, C16677UzD uzD, String str) {
        0qQ.A0B(uzD, 3);
        this.A03.Ev8(r2, r3, uzD, str);
    }

    public final void EvA(1Xj r7, C53157GjT gjT, AnonymousClass3W1 r9, C16677UzD uzD, String str) {
        AnonymousClass7TG.A1P(r9, uzD);
        this.A03.EvA(r7, gjT, r9, uzD, str);
    }

    public final void Cfd(1Xj r2, String str) {
        this.A03.Cfd(r2, str);
    }

    public final void D9c(1Xj r2) {
        this.A03.D9c(r2);
    }

    public final void E12(1Xj r2, C53157GjT gjT, AnonymousClass3W1 r4) {
        this.A03.E12(r2, gjT, r4);
    }

    public final void Eul(1Xj r2, AnonymousClass3W1 r3, String str) {
        this.A03.Eul(r2, r3, str);
    }

    public IUG(UserSession userSession, C2356130n r3, AnonymousClass4DU r4, C2363233h r5, C249763kK r6) {
        C51974G9v.A1P(r5, userSession, r4, r6);
        0qQ.A0B(r3, 5);
        this.A03 = r5;
        this.A01 = userSession;
        this.A00 = r4;
        this.A04 = r6;
        this.A02 = r3;
    }

    public final void FIU(DHK dhk, C57247IUi iUi) {
        AnonymousClass7TG.A1N(dhk, iUi);
        this.A03.FIU(dhk, iUi);
    }

    public final void FIV(C274594oe r2, AnonymousClass5O4 r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A03.FIV(r2, r3);
    }
}
