package X;

import android.os.Handler;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fv1  reason: case insensitive filesystem */
public final class C51493Fv1 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Handler A02;
    public final /* synthetic */ 0rl A03;

    public C51493Fv1(Handler handler, 0rl r2, long j, long j2) {
        this.A03 = r2;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = handler;
    }

    public final void run() {
        0rl r2 = this.A03;
        if (r2.A00 < this.A01) {
            UserSession userSession = AnonymousClass5MG.A00;
            if (userSession != null) {
                1vn A012 = 1vm.A01(userSession);
                0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, "", AnonymousClass000.A00(496));
                0Df.A00(A032, "", "ad_id");
                0Df.A00(A032, "", "video_id");
                2IS A04 = C41845B3m.A04();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A04, "input"), "IGEngagedViewQuery", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), Bp2.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_android_app_install_ad_engaged_view", AnonymousClass7TE.A1C());
                Object obj = new Object();
                Object obj2 = new Object();
                if (A012 != null) {
                    A012.ATL(C50153FRl.A00, new FSG(0, obj, obj2), pandoGraphQLRequest);
                }
                if (AnonymousClass5MG.A01) {
                    return;
                }
            }
            long j = r2.A00;
            long j2 = this.A00;
            r2.A00 = j + j2;
            this.A02.postDelayed(this, j2);
        }
    }
}
