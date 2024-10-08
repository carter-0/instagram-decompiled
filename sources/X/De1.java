package X;

import com.instagram.common.session.UserSession;

public final class De1 implements G6F {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ G6F A01;
    public final /* synthetic */ C46394DeH A02;

    public De1(UserSession userSession, G6F g6f, C46394DeH deH) {
        this.A00 = userSession;
        this.A01 = g6f;
        this.A02 = deH;
    }

    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        C360018dr r6 = (C360018dr) obj;
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A00;
        02m.A0p.markerPoint(962534132, "pro_dash_hyper_card_api_end");
        if (r6 instanceof C361128fi) {
            this.A01.onResult(((C361128fi) r6).A00);
        } else if (r6 instanceof C385519j4) {
            String message = ((C385519j4) r6).A00.getMessage();
            if (message == null) {
                message = "";
            }
            FEF.A00(userSession, "hypercard_fetch_failed", message);
        }
        this.A02.A01 = false;
    }
}
