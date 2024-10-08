package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Pbm  reason: case insensitive filesystem */
public final class C73389Pbm implements Runnable {
    public final /* synthetic */ C71619Onz A00;
    public final /* synthetic */ C74408PuO A01;
    public final /* synthetic */ C70745OJr A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C73389Pbm(C71619Onz onz, C74408PuO puO, C70745OJr oJr, String str, String str2) {
        this.A02 = oJr;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = onz;
        this.A01 = puO;
    }

    public final void run() {
        C70745OJr oJr = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        C71619Onz onz = this.A00;
        C74408PuO puO = this.A01;
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        A042.A03("setting_key", 4);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A042, "new_value", str2), "IGDirectUpdateSecureConsentFrameworkStringSetting", A042.getParamsCopy(), A043.getParamsCopy(), Bp0.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "update_scf_string_settings", AnonymousClass7TE.A1C());
        1vm.A01(oJr.A00).ATL(new C71557Oms(onz, oJr, str), new C71570On7(puO, 5), pandoGraphQLRequest);
    }
}
