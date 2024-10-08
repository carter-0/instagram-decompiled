package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Pc6  reason: case insensitive filesystem */
public final class C73409Pc6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C71619Onz A02;
    public final /* synthetic */ C74408PuO A03;
    public final /* synthetic */ C70745OJr A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C73409Pc6(C71619Onz onz, C74408PuO puO, C70745OJr oJr, int i, int i2, boolean z, boolean z2) {
        this.A04 = oJr;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = onz;
        this.A03 = puO;
    }

    public final void run() {
        C70745OJr oJr = this.A04;
        boolean z = this.A05;
        boolean z2 = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        C71619Onz onz = this.A02;
        C74408PuO puO = this.A03;
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        Integer valueOf = Integer.valueOf(i2);
        A042.A03("setting_key", valueOf);
        boolean A1V = AnonymousClass7TF.A1V(valueOf);
        Boolean valueOf2 = Boolean.valueOf(z2);
        A042.A02("new_value", valueOf2);
        boolean A1V2 = AnonymousClass7TF.A1V(valueOf2);
        17k.A0E(A1V);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A06(A1V2), "IGDirectUpdateSecureConsentFrameworkBoolSetting", A042.getParamsCopy(), A043.getParamsCopy(), C42983Boz.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "update_scf_bool_settings", AnonymousClass7TE.A1C());
        1vm.A01(oJr.A00).ATL(new C71558Omt(onz, oJr, i, i2, z), new C71570On7(puO, 4), pandoGraphQLRequest);
    }
}
