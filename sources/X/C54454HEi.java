package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HEi  reason: case insensitive filesystem */
public final class C54454HEi extends C233742wN {
    public final UserSession A00;
    public final 1se A01;

    public final boolean A08() {
        UserSession userSession = this.A00;
        if (!C228342lQ.A03(userSession) || !182.A06(0Tu.A05, userSession, 36312879042921844L)) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        UserSession userSession = this.A00;
        if (!C228342lQ.A05(userSession) || !182.A06(0Tu.A05, userSession, 36312879042921844L)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean A0C(Object obj, boolean z, boolean z2) {
        UserSession userSession = this.A00;
        if (!C233832wY.A01(userSession) || !z || !182.A06(0Tu.A05, userSession, 36319772464455293L)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C54454HEi(UserSession userSession, C228812mN r3, C233402vf r4, AnonymousClass2vH r5, C249863kU r6, 1PJ r7) {
        super(userSession, r3, r4, r5, r6, r7);
        1se A002 = 1sd.A00(userSession);
        C51972G9s.A1E(r7, A002);
        this.A00 = userSession;
        this.A01 = A002;
    }

    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return AnonymousClass7TE.A1I(C51972G9s.A0Y(obj).A05());
    }

    public final /* bridge */ /* synthetic */ boolean A0B(Object obj) {
        C267324bN A0Y = C51972G9s.A0Y(obj);
        if (A0Y.A0F()) {
            for (AnonymousClass3OA r0 : C57031ILx.A02(A0Y)) {
                if (this.A01.A05(r0.A0K)) {
                    return true;
                }
            }
        }
        1Xj A05 = A0Y.A05();
        if (A05 != null) {
            return this.A01.A05(A05);
        }
        return false;
    }
}
