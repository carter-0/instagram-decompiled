package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4k8  reason: invalid class name and case insensitive filesystem */
public abstract class C272124k8 extends 1P0 {
    public final UserSession A00;

    public C272124k8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public void A01(UserSession userSession) {
        AnonymousClass0fD.A0A(1190544719, AnonymousClass0fD.A03(-1015985287));
    }

    public void A02(UserSession userSession) {
        AnonymousClass0fD.A0A(-1247899293, AnonymousClass0fD.A03(314532127));
    }

    public void A03(UserSession userSession, Object obj) {
        AnonymousClass0fD.A0A(-1568807957, AnonymousClass0fD.A03(1228629006));
    }

    public void A04(UserSession userSession, Object obj) {
        AnonymousClass0fD.A0A(1169863108, AnonymousClass0fD.A03(-156659521));
    }

    public void A05(C268654dm r3, UserSession userSession) {
        AnonymousClass0fD.A0A(-2143557801, AnonymousClass0fD.A03(1977259225));
    }

    public void A06(UserSession userSession, Object obj) {
        AnonymousClass0fD.A0A(498613034, AnonymousClass0fD.A03(856296959));
    }

    public void onFail(C268654dm r4) {
        int i;
        int A03 = AnonymousClass0fD.A03(-1745027284);
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -1152209004;
        } else {
            A05(r4, userSession);
            i = -2084011131;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public void onFailInBackground(C268654dm r4) {
        int i;
        int A03 = AnonymousClass0fD.A03(1925650774);
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -1380868499;
        } else {
            A03(userSession, r4.A00());
            i = 159352682;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        int i;
        int A03 = AnonymousClass0fD.A03(2005090589);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = -984666500;
        } else {
            A01(userSession);
            i = 300026860;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public void onStart() {
        int i;
        int A03 = AnonymousClass0fD.A03(302650433);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 1498363507;
        } else {
            A02(userSession);
            i = 137713425;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-1026555058);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 277279523;
        } else {
            A06(userSession, obj);
            i = -1767048004;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onSuccessInBackground(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(945073946);
        UserSession userSession = this.A00;
        if (userSession.hasEnded()) {
            i = 507181731;
        } else {
            A04(userSession, obj);
            i = -361366864;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
