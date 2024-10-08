package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class H4Q extends 1P0 {
    public final /* synthetic */ C333787a8 A00;
    public final /* synthetic */ C59608JQc A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;

    public H4Q(C333787a8 r1, C59608JQc jQc, UserSession userSession, 1Xj r4, String str, Set set) {
        this.A00 = r1;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = set;
        this.A01 = jQc;
        this.A02 = userSession;
    }

    public final void onFail(C268654dm r12) {
        String str;
        int A032 = AnonymousClass0fD.A03(1384445892);
        0qQ.A0B(r12, 0);
        C333787a8 r5 = this.A00;
        String str2 = this.A04;
        AnonymousClass1XT r0 = (AnonymousClass1XT) r12.A00();
        if (r0 != null) {
            str = r0.getErrorCode();
        } else {
            str = null;
        }
        C333787a8.A00(r5, str2, AnonymousClass000.A00(2987), (String) null, str, r5.A01);
        I7G.A07(this.A01, this.A03, this.A05, false);
        AnonymousClass0fD.A0A(1928008742, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1304054642);
        C54049GyY gyY = (C54049GyY) obj;
        int A0D = AnonymousClass7TG.A0D(gyY, 7481160);
        JRW jrw = gyY.A00;
        if (jrw == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        C333787a8 r5 = this.A00;
        C333787a8.A01(r5, this.A04, AnonymousClass000.A00(4069), r5.A01);
        1Xj r9 = this.A03;
        Set set = this.A05;
        C59608JQc jQc = this.A01;
        C53438GoW goW = (C53438GoW) jrw;
        I7G.A05(I7G.A00(goW.A00), jQc, r9, goW.A01, goW.A03, goW.A02, set);
        AnonymousClass0fD.A0A(1168819405, A0D);
        AnonymousClass0fD.A0A(1167812256, A032);
    }
}
