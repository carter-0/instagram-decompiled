package X;

import android.view.View;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.Lrw  reason: case insensitive filesystem */
public class C65356Lrw implements MVB {
    public void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public void onButtonClick(View view) {
        if (this instanceof KSI) {
            KSI ksi = (KSI) this;
            C62029KWf kWf = ksi.A00;
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, ksi.A01, "spotlight_post_id");
            2IS A04 = C41845B3m.A04();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A03, A04, "input"), "SpotlightDeletePostMutation", A04.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C57.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_delete_spotlight_post", AnonymousClass7TE.A1C());
            AnonymousClass7TE.A1Z(new C66168MGf((Object) pandoGraphQLRequest, (Object) kWf, (AnonymousClass4D7) null, 48), kWf.A01);
        } else if (this instanceof KSJ) {
            KSJ ksj = (KSJ) this;
            ksj.A01.A00(ksj.A00, ksj.A03, ksj.A02);
        } else if (this instanceof KSH) {
            KSH ksh = (KSH) this;
            if (ksh.A00 != 0) {
                ((AnonymousClass1EO) ksh.A01).cancel();
            } else {
                DbS.A1U(ksh.A01);
            }
        }
    }
}
