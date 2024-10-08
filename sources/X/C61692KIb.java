package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KIb  reason: case insensitive filesystem */
public final class C61692KIb extends 0ng {
    public final /* synthetic */ 1Kx A00;

    public final void run() {
        L8R l8r;
        1Kx r6 = this.A00;
        UserSession userSession = r6.A02;
        L8R l8r2 = new L8R(userSession);
        r6.A01 = l8r2;
        long currentTimeMillis = System.currentTimeMillis();
        int A002 = DbT.A00(l8r2.A01, "qs_realtime_signal_in_disk_total_count");
        if (!(A002 == 0 || (l8r = r6.A01) == null)) {
            L78 l78 = new L78(r6, A002, currentTimeMillis);
            AnonymousClass7TE.A1Z(new C66168MGf((Object) l78, (Object) l8r, (AnonymousClass4D7) null, 47), l8r.A03);
        }
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36330187759239681L)) {
            182.A01(r2, userSession, 36611662735874303L);
        }
        14i.A05(r6);
        14i.A05(r6);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61692KIb(1Kx r4) {
        super(213216919, 3, false, false);
        this.A00 = r4;
    }
}
