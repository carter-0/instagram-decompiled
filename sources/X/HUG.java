package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public abstract class HUG {
    public static final void A00(Activity activity, Bundle bundle, C279294yP r8, C391589tK r9, 28D r10, C59725JVj jVj, UserSession userSession, Integer num, String str) {
        String str2 = str;
        DbZ.A0t(0, userSession, activity, str);
        C59725JVj jVj2 = jVj;
        0qQ.A0B(jVj, 7);
        AnonymousClass6W8 A0b = DbS.A0b(activity, bundle, userSession, ModalActivity.class, "effects_page");
        if (num == AnonymousClass05K.A00) {
            A0b.A08();
        } else {
            A0b.A07();
        }
        A0b.A0C(activity);
        C264044Oj.A00(userSession).Cho(r8, r9, r10, jVj2, str2);
    }
}
