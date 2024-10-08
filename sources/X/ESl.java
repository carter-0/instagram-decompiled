package X;

import android.app.Activity;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

public final class ESl extends C2806552w {
    public final /* synthetic */ AnonymousClass74j A00;
    public final /* synthetic */ Long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ESl(AnonymousClass74j r1, Integer num, Long l) {
        super(num);
        this.A00 = r1;
        this.A01 = l;
    }

    public final void onClick(View view) {
        AnonymousClass74j r5 = this.A00;
        ((AnonymousClass7SN) r5.A0A).CLU();
        C46649DiU A04 = C46649DiU.A04("com.bloks.www.ig.gen_ai_agent.education", AnonymousClass7TE.A1E());
        Activity activity = r5.A05;
        UserSession userSession = r5.A07;
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0P = AnonymousClass05K.A01;
        A0N.A00 = 32;
        A04.A0E(activity, A0N);
        C3258274h r2 = r5.A09;
        if (r2 != null) {
            long parseLong = Long.parseLong(userSession.A06);
            Long l = this.A01;
            0Aj A0e = AnonymousClass7TE.A0e(r2.A00, "rai_ux_ig_click");
            if (A0e.isSampled()) {
                A0e.A9F("viewer_igid", Long.valueOf(parseLong));
                DbS.A1M(A0e, C273654mx.A00(1443));
                A0e.AAJ("component", C273654mx.A00(2415));
                A0e.A9F("author_id", l);
                A0e.AAJ("display_name", "learn_more");
                A0e.AAJ(DcV.A02(114, 10, 118), ((C249763kK) r2.A01.getValue()).getSessionId());
                A0e.Cgf();
            }
        }
    }
}
