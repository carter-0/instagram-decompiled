package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Vqi  reason: case insensitive filesystem */
public abstract class C18382Vqi {
    public static final int[] A00 = C14276Tsz.A02(C14272Tsv.GRADIENT_RED_YELLOW);

    public static final void A00(Activity activity, Fragment fragment, 28D r5, UserSession userSession, UpcomingEvent upcomingEvent) {
        AnonymousClass7TG.A1Q(userSession, upcomingEvent);
        LI5.A01(activity, new WUT(activity, fragment, r5, userSession, upcomingEvent), AnonymousClass05K.A01, A00);
    }
}
