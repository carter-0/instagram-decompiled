package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.widget.FindPeopleButton;

public final class FRQ implements CallerContextable {
    public static final String __redex_internal_original_name = "FindPeopleButtonsRowViewBinder";

    public static final void A00(UserSession userSession, FindPeopleButton findPeopleButton, C49656F0n f0n, F2L f2l) {
        int i = 8;
        findPeopleButton.setVisibility(8);
        View view = f0n.A00;
        if (!(f0n.A05.getVisibility() == 8 && f0n.A03.getVisibility() == 8)) {
            i = 0;
        }
        view.setVisibility(i);
        if (f2l.A02 == AnonymousClass05K.A00) {
            1Av A00 = 1Au.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            if (findPeopleButton.equals(f0n.A03)) {
                0xa r1 = A00.A01;
                0xY A0e = DbU.A0e(AnonymousClass7TG.A0g(r1, "num_times_dismissed_ci_find_people_button_follow_list"), r1);
                A0e.E5c("last_time_dismissed_ci_find_people_button_follow_list", currentTimeMillis);
                A0e.apply();
            }
        }
    }
}
