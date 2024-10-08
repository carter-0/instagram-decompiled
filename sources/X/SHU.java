package X;

import android.os.SystemClock;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class SHU {
    public static final long A04 = TimeUnit.DAYS.toMillis(30);
    public long A00 = 0;
    public UserSession A01;
    public final 2FO A02;
    public final 1vn A03;

    public final C8294Qna A00(FBPayLoggerData fBPayLoggerData, Integer num, String str) {
        String str2;
        String str3;
        boolean A1W = AnonymousClass7TF.A1W(num, AnonymousClass05K.A0C);
        this.A00 = SystemClock.elapsedRealtime();
        if (A1W) {
            str2 = "fetch_auth_flows_cached_content_init";
        } else {
            str2 = "fetch_auth_flows_content_init";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        FBPayLoggerData fBPayLoggerData2 = fBPayLoggerData;
        A1E.put("logger_data", fBPayLoggerData2);
        String str4 = str;
        A1E.put("product", str4);
        this.A02.Cgl(str2, A1E);
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, "fixed_client_mutation_id", "client_mutation_id");
        UserSession userSession = this.A01;
        if (userSession != null) {
            str3 = userSession.A06;
        } else {
            str3 = "";
        }
        0Df.A00(A032, str3, "actor_id");
        0Df.A00(A032, str4, "payment_type");
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "input"), "IGFBPayAuthFlowsContentQuery", A042.getParamsCopy(), A043.getParamsCopy(), C42870Bkq.class, false, (PandoRealtimeInfoJNI) null, 12, "input", (String) null, AnonymousClass7TE.A1C());
        if (A1W) {
            long j = A04;
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(j);
            pandoGraphQLRequest.setFreshCacheAgeMs(j);
        } else {
            pandoGraphQLRequest.setFreshCacheAgeMs(0).setMaxToleratedCacheAgeMs(0);
        }
        C8294Qna A002 = C8294Qna.A00((S4g) null, this.A03, pandoGraphQLRequest, new DGM(this, 0));
        A002.A9U(new C12511Svh(fBPayLoggerData2, this, str4, A1W));
        return A002;
    }

    public SHU(2FO r3, 0lg r4) {
        1vn A002;
        if (r4 instanceof UserSession) {
            UserSession userSession = (UserSession) r4;
            this.A01 = userSession;
            if (userSession != null) {
                A002 = 1vm.A01(userSession);
                this.A03 = A002;
                this.A02 = r3;
            }
        }
        A002 = 1vm.A00((AnonymousClass0aP) r4);
        this.A03 = A002;
        this.A02 = r3;
    }
}
