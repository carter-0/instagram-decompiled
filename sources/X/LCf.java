package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class LCf {
    public final UserSession A00;
    public final String A01;

    public final void A00(Activity activity) {
        UserSession userSession = this.A00;
        DbW.A0W(activity, C46447Df9.A02().A01(userSession, C46548Dgp.A02(userSession, this.A01, "content_notes_reply_sheet", C61361K4d.__redex_internal_original_name).A04()), userSession, ModalActivity.class, "profile").A0C(activity);
    }

    public LCf(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
