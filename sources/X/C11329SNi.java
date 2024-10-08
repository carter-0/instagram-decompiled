package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.SNi  reason: case insensitive filesystem */
public final class C11329SNi {
    public final SE4 A00;
    public final C10199RoF A01;
    public final SNC A02;
    public final C10495RtA A03;
    public final S7S A04;
    public final C10322RqK A05;
    public final ScheduledExecutorService A06;
    public final boolean A07;

    public /* synthetic */ C11329SNi(SE4 se4, C10199RoF roF, C10495RtA rtA, S7S s7s, C10322RqK rqK, ScheduledExecutorService scheduledExecutorService, boolean z) {
        SNC snc = new SNC(SNC.A01);
        AnonymousClass7TG.A1P(scheduledExecutorService, roF);
        0qQ.A0B(s7s, 7);
        this.A06 = scheduledExecutorService;
        this.A03 = rtA;
        this.A01 = roF;
        this.A05 = rqK;
        this.A00 = se4;
        this.A02 = snc;
        this.A04 = s7s;
        this.A07 = z;
    }

    public static final void A00(C11329SNi sNi, C10321RqJ rqJ, String str, List list) {
        S7S s7s = sNi.A04;
        s7s.A01.markerPoint(533737437, s7s.A00, "google_start");
        C13652TeJ A002 = C9731Rfp.A00(sNi.A01.A00);
        0qQ.A07(A002);
        AnonymousClass9GD A022 = A002.EHU(new C8610Qxs(str)).A02(C12595Syu.A00, AnonymousClass9GH.A00);
        ScheduledExecutorService scheduledExecutorService = sNi.A06;
        A022.A04(new SzH(1, new C58751Iwy(22, rqJ, sNi, list)), scheduledExecutorService).A0A(new SzA(sNi, rqJ, str, list), scheduledExecutorService);
    }

    public static final void A01(C10321RqJ rqJ, String str, List list) {
        ArrayList A0S = 00k.A0S(AnonymousClass7TE.A1I(RHJ.NO_ERROR), list);
        0qQ.A0B(str, 0);
        rqJ.A00.set(new JV7(0, "", str, (List) A0S));
    }
}
