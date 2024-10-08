package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.AYm  reason: case insensitive filesystem */
public final class C40271AYm implements AnonymousClass0lh {
    public final Set A00 = new LinkedHashSet();

    public final void A00(Activity activity, UserSession userSession, Integer num) {
        1Wj r1;
        0qQ.A0B(userSession, 1);
        num.intValue();
        C390939s5 r12 = C390939s5.NO_SURVEY;
        if (activity instanceof ModalActivity) {
            activity = (Activity) C71172bH.A00();
        }
        if (this.A00.contains(r12) && activity != null && (r1 = 1Wj.A00) != null) {
            r1.A03(userSession, activity, "");
        }
    }

    public final void A01(C390939s5 r2) {
        this.A00.add(r2);
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
