package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.PHp  reason: case insensitive filesystem */
public final class C72735PHp implements MVB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ C70636OEh A04;
    public final /* synthetic */ String A05;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C72735PHp(Context context, AnonymousClass0iw r2, UserSession userSession, DirectShareTarget directShareTarget, C70636OEh oEh, String str) {
        this.A04 = oEh;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = directShareTarget;
        this.A05 = str;
    }

    public final void onButtonClick(View view) {
        O36.A00(this.A00, this.A01, this.A02, "reply_modal", this.A05, AnonymousClass7TE.A1I(this.A03));
    }

    public final void onShow() {
        C70636OEh oEh = this.A04;
        if (oEh != null) {
            C19447WZv wZv = oEh.A02;
            F35 f35 = wZv.A04;
            AnonymousClass4DU r5 = wZv.A03;
            User user = oEh.A01;
            1Xj r3 = oEh.A00;
            0Aj A0e = AnonymousClass7TE.A0e(f35.A00, "reel_viewer_dashboard_reply_sent_impression");
            if (A0e.isSampled()) {
                DbW.A15(A0e, r5);
                A0e.A9F("target_user_id", DbV.A0q(user.getId()));
                A0e.A9F("target_user_type", DbS.A0j(user.BIW()));
                String A30 = r3.A30();
                if (A30 != null) {
                    G9t.A1J(A0e, A30);
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
