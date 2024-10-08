package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.attribution.FetchAttributionEventComplianceActionResponseImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Wo4  reason: case insensitive filesystem */
public final class C20265Wo4 implements Runnable {
    public final /* synthetic */ List A00;
    public final /* synthetic */ C17890Vhh A01;

    public C20265Wo4(List list, C17890Vhh vhh) {
        this.A01 = vhh;
        this.A00 = list;
    }

    public final void run() {
        C17890Vhh vhh = this.A01;
        List list = this.A00;
        C18724Vyy vyy = vhh.A04;
        0qQ.A0B(list, 1);
        C18724Vyy.A01(C18724Vyy.A00("report_events_compliant", (String) null, (Throwable) null, list), "info", vyy);
        VRM vrm = vhh.A00;
        C17810VgN vgN = new C17810VgN(list, vhh);
        1Ef freshCacheAgeMs = new PandoGraphQLRequest(C41845B3m.A05(), "FetchAttributionEventComplianceAction", new 2IS().getParamsCopy(), new 2IS().getParamsCopy(), FetchAttributionEventComplianceActionResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch_attribution_event_compliance_action", new ArrayList()).setMaxToleratedCacheAgeMs(0).setFreshCacheAgeMs(0);
        1vn r6 = vrm.A00;
        C19043WHv wHv = new C19043WHv(3, vgN, vrm);
        C71556Omr omr = new C71556Omr(1, vrm, vgN);
        Wv5 wv5 = Wv5.A00;
        0qQ.A07(wv5);
        r6.ATM(omr, wHv, freshCacheAgeMs, wv5);
    }
}
