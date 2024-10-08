package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9ij  reason: invalid class name and case insensitive filesystem */
public final class C385309ij extends 1P0 {
    public final /* synthetic */ AnonymousClass92f A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C385309ij(AnonymousClass92f r1, String str, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onFail(C268654dm r9) {
        int A03 = AnonymousClass0fD.A03(-20905212);
        if (this.A02) {
            AnonymousClass92f r6 = this.A00;
            String str = this.A01;
            C50175FSh A002 = C49063Eoh.A00();
            UserSession userSession = r6.A01;
            A002.A00(userSession.A06);
            1Ef build = A002.build();
            build.setFreshCacheAgeMs(1036800000);
            build.setNetworkTimeoutSeconds(0);
            AnonymousClass92f.A06(AnonymousClass9D0.A00(1vm.A01(userSession).A03(build)), r6, str, false);
        }
        AnonymousClass0fD.A0A(1654346714, A03);
    }
}
