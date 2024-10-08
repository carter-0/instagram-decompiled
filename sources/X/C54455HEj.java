package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HEj  reason: case insensitive filesystem */
public final class C54455HEj extends C233742wN implements AnonymousClass2wO {
    public final UserSession A00;

    public final boolean A08() {
        UserSession userSession = this.A00;
        if (!C228342lQ.A03(userSession) || !182.A06(0Tu.A05, userSession, 36312879042332011L)) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        UserSession userSession = this.A00;
        if (!C228342lQ.A05(userSession) || !182.A06(0Tu.A05, userSession, 36312879042332011L)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean A0C(Object obj, boolean z, boolean z2) {
        return C233832wY.A02(this.A00, z);
    }

    public C54455HEj(UserSession userSession, C228812mN r2, C233402vf r3, AnonymousClass2vH r4, C249863kU r5, 1PJ r6) {
        super(userSession, r2, r3, r4, r5, r6);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return AnonymousClass7TE.A1I(C51969G9p.A0m(obj).A0K);
    }

    public final /* bridge */ /* synthetic */ boolean A0B(Object obj) {
        return 1sd.A00(this.A00).A05(C51969G9p.A0m(obj).A0K);
    }
}
