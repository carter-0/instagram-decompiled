package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class LXZ implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C46293DTw A01;
    public final /* synthetic */ C317116mk A02;
    public final /* synthetic */ String A03;

    public LXZ(UserSession userSession, C46293DTw dTw, C317116mk r3, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = r3;
        this.A01 = dTw;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(638413533);
        AnonymousClass7TE.A0e(AnonymousClass0kN.A01(DbS.A0O(this.A03), this.A00), "ig_cg_click_story_donate_prompt").AAJ("source_name", "STORY");
        this.A02.D9m(this.A01.Amy());
        AnonymousClass0fD.A0C(-661268143, A05);
    }
}
