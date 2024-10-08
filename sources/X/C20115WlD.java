package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.attribution.ReportAdvertiserIDMutationResponseImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WlD  reason: case insensitive filesystem */
public final class C20115WlD implements Runnable {
    public final /* synthetic */ C17890Vhh A00;

    public C20115WlD(C17890Vhh vhh) {
        this.A00 = vhh;
    }

    public final void run() {
        C17890Vhh vhh = this.A00;
        C18724Vyy.A01(C18724Vyy.A00("flush", "server_side", (Throwable) null, (List) null), "info", vhh.A04);
        VRN vrn = vhh.A01;
        String A002 = vhh.A02.A00();
        C20549WtX wtX = new C20549WtX(vhh);
        2IS r6 = new 2IS();
        2IS r5 = new 2IS();
        0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, A002, "adid");
        0Df.A00(A03, AnonymousClass7TF.A0b(), "client_mutation_id");
        0Df.A00(A03, vrn.A00.A06, "actor_id");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, r6, "input"), "ReportAdvertiserIDMutation", r6.getParamsCopy(), r5.getParamsCopy(), ReportAdvertiserIDMutationResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "report_advertiser_id", new ArrayList());
        vrn.A01.ATL(new C45919DEz(1, wtX, vrn), new C19040WHs(wtX, 0), pandoGraphQLRequest);
    }
}
