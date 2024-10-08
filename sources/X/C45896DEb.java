package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.DEb  reason: case insensitive filesystem */
public final class C45896DEb implements 1MD {
    public final int A00;
    public final Object A01;

    public C45896DEb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr A03;
        C250663lr A02;
        QVG qvg;
        S4g s4g;
        1vn r1;
        PandoGraphQLRequest pandoGraphQLRequest;
        AnonymousClass2hV r2;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C250663lr r0 = (C250663lr) obj2;
                if (r0 == null || (A03 = r0.A03(BWN.class, "init_link_paypal(input:$input)", 1339402409)) == null || (A02 = A03.A02(BWM.class, "payments_error", -190649136)) == null || (qvg = (QVG) A02.A01(QVG.class, 736683160)) == null) {
                    return null;
                }
                return SPz.A03(qvg);
            case 1:
                s4g = (S4g) obj2;
                r1 = ((C10696Rwa) this.A01).A03.A00;
                pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGFBPayOrderInfoSectionQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43254BvG.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fbpay_account_extended", AnonymousClass7TE.A1C());
                r2 = Cs2.A00;
                break;
            default:
                s4g = (S4g) obj2;
                C45283Ctm ctm = ((C10446RsN) this.A01).A01;
                r1 = ctm.A01;
                2IS A04 = C41845B3m.A04();
                2IS A042 = C41845B3m.A04();
                A04.A03("first", 4);
                pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IgFbPayOrdersQuery", A04.getParamsCopy(), A042.getParamsCopy(), C8A.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "me", AnonymousClass7TE.A1C());
                r2 = new DGM(ctm.A00, 1);
                break;
        }
        return C8294Qna.A00(s4g, r1, pandoGraphQLRequest, r2);
    }
}
