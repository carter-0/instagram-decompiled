package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GUp  reason: case insensitive filesystem */
public final class C52487GUp extends C233742wN {
    public final 1se A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean A08() {
        return this.A01;
    }

    public final boolean A09() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean A0C(Object obj, boolean z, boolean z2) {
        if (!this.A03 || !z) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52487GUp(UserSession userSession, C228812mN r4, C233402vf r5, AnonymousClass2vH r6, C249863kU r7, 1PJ r8, boolean z, boolean z2, boolean z3) {
        super(userSession, r4, r5, r6, r7, r8);
        1se A002 = 1sd.A00(userSession);
        0qQ.A0B(A002, 7);
        this.A00 = A002;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return 0sr.A1M(new 1Xj[]{C51969G9p.A0m(obj).A0K});
    }

    public final /* bridge */ /* synthetic */ boolean A0B(Object obj) {
        return this.A00.A05(C51969G9p.A0m(obj).A0K);
    }
}
