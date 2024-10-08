package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.HashMap;

public final class FdG implements MVB {
    public final /* synthetic */ 0hq A00;
    public final /* synthetic */ C49880FBe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InstagramMainActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0rm A05;
    public final /* synthetic */ boolean A06;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdG(0hq r1, C49880FBe fBe, UserSession userSession, InstagramMainActivity instagramMainActivity, String str, 0rm r6, boolean z) {
        this.A06 = z;
        this.A01 = fBe;
        this.A02 = userSession;
        this.A05 = r6;
        this.A04 = str;
        this.A03 = instagramMainActivity;
        this.A00 = r1;
    }

    public final void onButtonClick(View view) {
        boolean z = this.A06;
        UserSession userSession = this.A02;
        Object obj = this.A05.A00;
        String id = DbT.A0j(userSession).getId();
        if (z) {
            String str = this.A04;
            0qQ.A0B(obj, 1);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("profile_uid", id);
            A1E.put("credential_type", obj);
            C49880FBe.A00(userSession, AnonymousClass05K.A01, "auto_login_learn_more", str, "autologin", A1E);
            0kR.A0F(this.A03, DbT.A09("https://www.meta.com/help/connected-experiences/switch-between-profiles/"));
            return;
        }
        0qQ.A0B(obj, 1);
        HashMap A1E2 = AnonymousClass7TE.A1E();
        A1E2.put("profile_uid", id);
        A1E2.put("credential_type", obj);
        C49880FBe.A00(userSession, AnonymousClass05K.A01, "auto_login_cancel", "autologin", "autologin", A1E2);
        InstagramMainActivity.A0J(this.A00, userSession, this.A03);
    }
}
