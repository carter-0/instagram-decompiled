package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EBu  reason: case insensitive filesystem */
public final class C47660EBu extends 1P0 {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278754xT A01;
    public final /* synthetic */ boolean A02;

    public C47660EBu(AnonymousClass540 r1, C278754xT r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void onFail(C268654dm r9) {
        int A03 = AnonymousClass0fD.A03(-1053307294);
        0qQ.A0B(r9, 0);
        C278754xT r6 = this.A01;
        r6.A05.remove(C3727792j.GRAPHQL_USER_INFO);
        boolean z = this.A02;
        AnonymousClass540 r4 = this.A00;
        if (z) {
            C50175FSh A002 = C49063Eoh.A00();
            UserSession userSession = r6.A03;
            A002.A00(userSession.A06);
            1Ef build = A002.build();
            build.setFreshCacheAgeMs(1036800000);
            build.setNetworkTimeoutSeconds(0);
            C278754xT.A01(r4, AnonymousClass9D0.A00(1vm.A01(userSession).A03(build)), r6, false);
        } else {
            C278754xT.A02(r4, r6);
        }
        C278754xT.A04(r6, "GraphQL", r9.A01());
        AnonymousClass0fD.A0A(-1028492478, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-826062102);
        int A032 = AnonymousClass0fD.A03(-1911221561);
        C278754xT r2 = this.A01;
        1Gd.A00(1P1.A00(r2.A03).A00);
        r2.A05.remove(C3727792j.GRAPHQL_USER_INFO);
        C278754xT.A02(this.A00, r2);
        AnonymousClass0fD.A0A(1036897659, A032);
        AnonymousClass0fD.A0A(-1878687144, A03);
    }
}
