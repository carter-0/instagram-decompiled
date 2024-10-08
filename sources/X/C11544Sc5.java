package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Sc5  reason: case insensitive filesystem */
public final class C11544Sc5 implements 1MD {
    public final /* synthetic */ C10447RsO A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C11544Sc5(C10447RsO rsO, String str, boolean z) {
        this.A00 = rsO;
        this.A01 = str;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        S4g s4g = (S4g) obj;
        C10304Rq2 rq2 = this.A00.A01;
        String str = this.A01;
        boolean z = this.A02;
        AnonymousClass0K0 r2 = GraphQlCallInput.A02;
        int i = 50;
        if (z) {
            i = 4;
        }
        0Df A03 = C41845B3m.A03(r2, Integer.valueOf(i), AnonymousClass000.A00(723));
        2IS A0D = JTQ.A0D(A03, str, "after");
        return C8294Qna.A00(s4g, rq2.A00, new PandoGraphQLRequest(C41847B3o.A04(A03, A0D, AnonymousClass000.A00(3718)), "IGFBPayShareableTransactionsQuery", A0D.getParamsCopy(), C41845B3m.A04().getParamsCopy(), Bl2.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, (String) null, AnonymousClass7TE.A1C()), DGV.A00);
    }
}
