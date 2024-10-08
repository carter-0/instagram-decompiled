package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public final class S2K {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ C7610QOs A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ 1IX A03;

    public final void A00(Throwable th) {
        0qQ.A0B(th, 0);
        SPQ spq = this.A00.A06;
        Map map = this.A02;
        0qQ.A0B(map, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put(RH0.A0s.A00, th.getMessage());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        A1H.put(RH0.A0T.A00, stringWriter.toString());
        linkedHashMap.putAll(A1H);
        spq.A00.Cgp(linkedHashMap, (Map) null, "client_create_dcpquote_fail");
        this.A03.resumeWith(JTO.A1B(th));
    }

    public S2K(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, C7610QOs qOs, Map map, 1IX r4) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A02 = map;
        this.A01 = qOs;
        this.A03 = r4;
    }
}
