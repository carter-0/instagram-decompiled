package X;

import com.instagram.common.session.UserSession;

public final class FXK implements 1wn {
    public final /* synthetic */ C318866pf A00;

    public FXK(C318866pf r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.EbE] */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(551423432);
        C50269FWa fWa = (C50269FWa) obj;
        int A032 = AnonymousClass0fD.A03(-199557946);
        int i2 = fWa.A01;
        int i3 = fWa.A00;
        C318866pf r4 = this.A00;
        UserSession userSession = r4.A05;
        Class<C48233EbE> cls = C48233EbE.class;
        C48233EbE ebE = (C48233EbE) userSession.A00(cls);
        if (ebE != null && i3 == ebE.A00 && i2 == ebE.A01) {
            i = 492722439;
        } else {
            r4.A00 = i2;
            ? obj2 = new Object();
            obj2.A01 = i2;
            obj2.A00 = i3;
            userSession.A04(cls, obj2);
            C318866pf.A02(r4);
            i = -9191452;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1351571427, A03);
    }
}
