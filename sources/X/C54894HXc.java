package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment;
import com.instagram.user.model.User;

/* renamed from: X.HXc  reason: case insensitive filesystem */
public abstract class C54894HXc {
    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, C273414mX r12, User user, C62320sa r14) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        User user2 = user;
        if (2R8.A05(userSession, user.getId())) {
            C59689JTv.A07(context, 2131968685);
            if (r14 != null) {
                r14.invoke();
                return;
            }
            return;
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C273414mX r7 = r12;
        if (user.A29()) {
            C46447Df9.A03().A01(fragmentActivity2, userSession2, r7, user2, C273654mx.A00(85));
            return;
        }
        C57383IZo iZo = new C57383IZo(fragmentActivity, userSession, r12, user, r14);
        String id = user.getId();
        NotifyMeNotFollowedFragment notifyMeNotFollowedFragment = new NotifyMeNotFollowedFragment();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("otherUserId", id);
        C331127Pr A0V = DbV.A0V(A0a, notifyMeNotFollowedFragment, userSession);
        A0V.A0U = iZo;
        DbS.A1S(A0V, false);
        DbU.A0y(fragmentActivity, notifyMeNotFollowedFragment, A0V);
    }
}
