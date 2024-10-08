package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggm  reason: case insensitive filesystem */
public final class C52995Ggm extends 2YL {
    public final UserSession A00;
    public final 0V2 A01;
    public final 0V2 A02;
    public final C61770pa A03;
    public final C61770pa A04;

    public C52995Ggm(UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        String str2 = str;
        int A022 = DbW.A02(1, userSession2, str2);
        this.A00 = userSession2;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        this.A02 = A012;
        this.A04 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 0, 0);
        this.A01 = A013;
        this.A03 = new 0V1((C262204Co) null, A013);
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A03(num, 19B.A00, new MFR(this, (AnonymousClass4D7) null, A022), A002);
        0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, str2, "summary_id");
        2IS A042 = C41845B3m.A04();
        C56925IHu.A00(new C56928IHx(this, 1), new PandoGraphQLRequest(C41847B3o.A04(A032, A042, C273654mx.A00(384)), "IGCommentInsightsSummaryInfoQuery", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42685Bgi.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_get_comment_summary_by_comment_summary_id", AnonymousClass7TE.A1C()), 1vm.A01(this.A00), this, 3);
    }
}
