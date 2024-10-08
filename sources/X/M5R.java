package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

public final /* synthetic */ class M5R implements Runnable {
    public final /* synthetic */ C64159LRa A00;

    public /* synthetic */ M5R(C64159LRa lRa) {
        this.A00 = lRa;
    }

    public final void run() {
        C64159LRa lRa = this.A00;
        String str = lRa.A08;
        if (str != null && ((long) str.split("\\s+").length) >= lRa.A0D.longValue()) {
            C64125LOw lOw = lRa.A05;
            if (lOw != null) {
                lOw.A03(lRa.A07);
                lRa.A07 = null;
            }
            1vn A01 = 1vm.A01(lRa.A0B);
            2IS A04 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A04, "post_text", str), "IGFundraiserNudgeDecisionQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43260BvM.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_fundraiser_nudge_decision", AnonymousClass7TE.A1C());
            A01.ATL(new C19026WHc(7), new C64397LbE(lRa, 20), pandoGraphQLRequest);
        }
    }
}
