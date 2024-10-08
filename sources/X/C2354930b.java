package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.30b  reason: invalid class name and case insensitive filesystem */
public final class C2354930b implements C228382la {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass2rI A02;
    public final C233002un A03;

    public C2354930b(UserSession userSession, AnonymousClass2rI r3, C233002un r4) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void DMI() {
    }

    public final void DMW() {
        this.A00 = false;
    }

    public static final String A00(1Xj r4, C2354930b r5) {
        String id;
        UserSession userSession = r5.A01;
        if ((182.A06(0Tu.A05, userSession, 36312879040824667L) || C228342lQ.A08(userSession, 1Au.A00(userSession))) && r4.A2R() != null) {
            id = r4.A2R();
        } else {
            id = r4.getId();
        }
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(1Xj r9, AnonymousClass3W1 r10, AnonymousClass3DY r11, Integer num) {
        C233002un r2 = this.A03;
        if (r2 != null) {
            r2.A06(r9, r10, r11, num, this.A02.BJU(A00(r9, this)));
        }
    }

    public final /* bridge */ /* synthetic */ void DLo(Object obj, int i) {
    }
}
