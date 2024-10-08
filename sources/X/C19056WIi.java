package X;

import android.util.Base64;
import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchACSOnlyResponseImpl;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchDeidentifiedResponseImpl;
import java.util.ArrayList;

/* renamed from: X.WIi  reason: case insensitive filesystem */
public final class C19056WIi implements X5z {
    public final /* synthetic */ C18482Vsb A00;
    public final /* synthetic */ OHAIConfig A01;
    public final /* synthetic */ C17919ViA A02;
    public final /* synthetic */ C17346VRz A03;

    public final void DoF(V40 v40) {
        1Ef ohaiConfig;
        1vn r10;
        C19046WHy wHy;
        C19031WHi wHi;
        boolean contains;
        C17346VRz vRz = this.A03;
        vRz.A01.markerEnd(20120872, vRz.A00, 2);
        C17919ViA viA = this.A02;
        OHAIConfig oHAIConfig = this.A01;
        VZ3 vz3 = new VZ3(oHAIConfig.A03, oHAIConfig.A06, oHAIConfig.A02, oHAIConfig.A01, oHAIConfig.A00);
        V40 v402 = v40;
        String str = v402.A01;
        0qQ.A07(str);
        String str2 = v402.A02;
        0qQ.A07(str2);
        String str3 = v402.A00;
        0qQ.A07(str3);
        String encodeToString = Base64.encodeToString(v402.A04, 2);
        0qQ.A07(encodeToString);
        String encodeToString2 = Base64.encodeToString(v402.A05, 2);
        0qQ.A07(encodeToString2);
        String encodeToString3 = Base64.encodeToString(v402.A06, 2);
        0qQ.A07(encodeToString3);
        C17551Va4 va4 = new C17551Va4(str, str2, str3, encodeToString, encodeToString2, encodeToString3);
        OMq oMq = viA.A05;
        if (oMq != null) {
            oMq.A01.markerPoint(20132336, oMq.A00, "deidentified_request_params_fetch_success");
        }
        int i = viA.A00;
        C71010OYi oYi = viA.A04;
        ImmutableList immutableList = viA.A01;
        0qQ.A0A(immutableList);
        String str4 = viA.A06;
        String str5 = viA.A07;
        if (i == 1) {
            ImmutableList immutableList2 = viA.A02;
            0qQ.A0A(immutableList2);
            AnonymousClass67Z r2 = viA.A03;
            0qQ.A0A(r2);
            2IS r8 = new 2IS();
            2IS r13 = new 2IS();
            2IV r12 = new 2IV();
            r12.A05("fetch_params", immutableList);
            r12.A09(str4, "experiment_params");
            r12.A09(str5, "user_agent");
            ohaiConfig = new PandoGraphQLRequest(JTP.A0L(r12, r8, "input"), "IGDReceiverFetchACSOnly", r8.getParamsCopy(), r13.getParamsCopy(), IGDReceiverFetchACSOnlyResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 128, (String) null, "igd_receiver_fetch_deidentified", new ArrayList()).setAcsToken(va4);
            r10 = oYi.A02;
            ImmutableList immutableList3 = immutableList2;
            wHy = new C19046WHy(r2, oYi, oMq, immutableList3, 0);
            wHi = new C19031WHi(1, oMq, oYi, immutableList3, r2);
        } else {
            ImmutableList immutableList4 = viA.A02;
            0qQ.A0A(immutableList4);
            AnonymousClass67Z r7 = viA.A03;
            0qQ.A0A(r7);
            2IS r122 = new 2IS();
            2IS r14 = new 2IS();
            2IV r132 = new 2IV();
            r132.A05("fetch_params", immutableList);
            r132.A09(str4, "experiment_params");
            r132.A09(str5, "user_agent");
            ohaiConfig = new PandoGraphQLRequest(JTP.A0L(r132, r122, "input"), "IGDReceiverFetchDeidentified", r122.getParamsCopy(), r14.getParamsCopy(), IGDReceiverFetchDeidentifiedResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 384, (String) null, "igd_receiver_fetch_deidentified", new ArrayList()).setAcsToken(va4).setOhaiConfig(vz3);
            r10 = oYi.A02;
            ImmutableList immutableList5 = immutableList4;
            wHy = new C19046WHy(r7, oYi, oMq, immutableList5, 2);
            wHi = new C19031WHi(3, oMq, oYi, immutableList5, r7);
        }
        r10.ATM(wHi, wHy, ohaiConfig, oYi.A03);
        C18482Vsb vsb = this.A00;
        synchronized (C18482Vsb.A04) {
            contains = vsb.A03.contains("LS_IgdReceiverFetch");
        }
        if (!contains) {
            vsb.A02.get("LS_IgdReceiverFetch");
        }
    }

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        C17346VRz vRz = this.A03;
        02m r4 = vRz.A01;
        int i = vRz.A00;
        r4.markerAnnotate(20120872, i, "acs_token_fetch_failure", true);
        r4.markerEnd(20120872, i, 3);
        this.A02.A00(th);
    }

    public C19056WIi(C18482Vsb vsb, OHAIConfig oHAIConfig, C17919ViA viA, C17346VRz vRz) {
        this.A03 = vRz;
        this.A02 = viA;
        this.A01 = oHAIConfig;
        this.A00 = vsb;
    }
}
