package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.FcK  reason: case insensitive filesystem */
public final class C50472FcK implements G76 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C61057Jvv A01;
    public final /* synthetic */ 1vn A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;

    public final void onActionClicked() {
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        A042.A04(AnonymousClass000.A00(1869), this.A04);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A042, "setting_type", this.A03), "CancelSettingChangeRequest", A042.getParamsCopy(), A043.getParamsCopy(), C42914Bmi.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xig_cancel_setting_change_request", AnonymousClass7TE.A1C());
        1vn r4 = this.A02;
        0sP r3 = this.A05;
        C61057Jvv jvv = this.A01;
        Context context = this.A00;
        FS6.A00(new II0(1, context, jvv, r3), pandoGraphQLRequest, r4, context, 12);
    }

    public final /* synthetic */ void onBannerDismissed() {
    }

    public C50472FcK(Context context, C61057Jvv jvv, 1vn r3, String str, String str2, 0sP r6) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = jvv;
        this.A00 = context;
    }
}
