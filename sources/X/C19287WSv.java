package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchAuthenticatedResponseImpl;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.WSv  reason: case insensitive filesystem */
public final class C19287WSv implements AnonymousClass67Q {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    public C19287WSv(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A06 = str;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj2;
        this.A07 = str2;
        this.A01 = i;
    }

    public final void Eyr(AnonymousClass67Z r20) {
        AnonymousClass67Z r0 = r20;
        if (this.A00 != 0) {
            OMq oMq = (OMq) this.A03;
            if (oMq != null) {
                oMq.A01.markerPoint(20132336, oMq.A00, C66579MXk.A00(1045));
            }
            int i = this.A01;
            C71010OYi oYi = (C71010OYi) this.A05;
            if (i > 0) {
                UIS uis = oYi.A01;
                String str = this.A06;
                String str2 = this.A07;
                C17919ViA viA = new C17919ViA((ImmutableList) this.A02, (ImmutableList) this.A04, r0, oYi, oMq, str, str2, i);
                02m r1 = 02m.A0p;
                0qQ.A07(r1);
                C17346VRz vRz = new C17346VRz(r1, 2SP.A01.A03());
                Map map = uis.A01;
                if (!map.containsKey("LS_IgdReceiverFetch")) {
                    1vo r12 = uis.A00;
                    ExecutorService executorService = uis.A02;
                    C17341VRu vRu = new C17341VRu(r12, executorService);
                    C17342VRv vRv = new C17342VRv(r12, executorService);
                    UserSession userSession = uis.A01;
                    map.put("LS_IgdReceiverFetch", new C17473VXa(AnonymousClass1UZ.A00(userSession.A03.A06()).A00(002.A0g("acs_shared_preferences_key_", "LS_IgdReceiverFetch", userSession.A06)), vRu, vRv));
                }
                vRz.A01.markerStart(20120872, vRz.A00);
                uis.A00.A00(new C19050WIc(uis, viA, vRz));
                return;
            }
            ImmutableList immutableList = (ImmutableList) this.A02;
            0qQ.A0A(immutableList);
            String str3 = this.A06;
            String str4 = this.A07;
            ImmutableList immutableList2 = (ImmutableList) this.A04;
            0qQ.A0A(immutableList2);
            0qQ.A0A(r0);
            2IS r7 = new 2IS();
            2IS r6 = new 2IS();
            2IV r5 = new 2IV();
            r5.A05("fetch_params", immutableList);
            r5.A09(str3, "experiment_params");
            r5.A09(str4, "user_agent");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(JTP.A0L(r5, r7, "input"), "IGDReceiverFetchAuthenticated", r7.getParamsCopy(), r6.getParamsCopy(), IGDReceiverFetchAuthenticatedResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "igd_receiver_fetch", new ArrayList());
            ImmutableList immutableList3 = immutableList2;
            oYi.A02.ATM(new C19031WHi(2, oMq, oYi, immutableList3, r0), new C19046WHy(r0, oYi, oMq, immutableList3, 1), pandoGraphQLRequest, oYi.A03);
            return;
        }
        NAL nal = (NAL) this.A02;
        String str5 = this.A06;
        Object obj = this.A05;
        String str6 = this.A07;
        int i2 = this.A01;
        MYb mYb = MYb.A0M;
        long longValue = ((Number) this.A03).longValue();
        long longValue2 = ((Number) this.A04).longValue();
        C71722Opg opg = new C71722Opg(r0, 56);
        AnonymousClass68L ASa = nal.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
        mailboxFutureImpl.Eiu(opg);
        if (!ASa.EJd(new C71697OpH(mailboxFutureImpl, nal, obj, str5, str6, i2, longValue, longValue2))) {
            mailboxFutureImpl.cancel(false);
        }
    }
}
