package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;

/* renamed from: X.P0k  reason: case insensitive filesystem */
public final class C72293P0k implements C51900G6u {
    public final /* synthetic */ OZR A00;

    public final void D6w(String str) {
        0qQ.A0B(str, 0);
        OZR ozr = this.A00;
        if (ozr.A02) {
            C70691OGm oGm = new C70691OGm(ozr.A04, ozr.A06, str);
            2Dm r0 = oGm.A03;
            String str2 = oGm.A05;
            if (C66581MXm.A0a(r0, str2) != null) {
                OZR ozr2 = oGm.A04.A00;
                ozr2.A02 = false;
                OZR.A00(ozr2);
                ozr2.A07.A00();
                ozr2.A05.Ewl(str2);
            } else {
                UserSession userSession = oGm.A02;
                AnonymousClass1Nd.A00(userSession).A01(oGm.A01, 2Kb.class);
                1bO.A00(userSession).A08(ThreadFetchReason.THREAD_SUMMARY, (C74340PtG) null, str2, true);
                oGm.A00.postDelayed(new PV4(oGm), 2000);
            }
            ozr.A00 = oGm;
        }
    }

    public C72293P0k(OZR ozr) {
        this.A00 = ozr;
    }

    public final void D6v(Throwable th) {
        OZR ozr = this.A00;
        ozr.A02 = false;
        ozr.A07.A00();
        OZR.A01(ozr, AnonymousClass7TE.A16(ozr.A03, 2131976595));
    }
}
