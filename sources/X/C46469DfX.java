package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.DfX  reason: case insensitive filesystem */
public final class C46469DfX {
    public final /* synthetic */ UserDetailFragment A00;

    public C46469DfX(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void A00(int i) {
        Context context;
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (userDetailFragment.isResumed() && userDetailFragment.getActivity() != null && user != null && user.B6o() == FollowStatus.A06) {
            C46410DeX deX = userDetailFragment.A0v;
            UserSession userSession = userDetailFragment.A0I;
            if (i <= 0) {
                C46465DfT dfT = deX.A02;
                String id = user.getId();
                0Aj A0e = AnonymousClass7TE.A0e(dfT.A00, "unfollow_chaining_failed_to_show");
                A0e.AAJ("target_id", id);
                A0e.AAJ("reason", "no_suggestions");
                A0e.Cgf();
                return;
            }
            deX.A01();
            UserDetailFragment userDetailFragment2 = deX.A03;
            if (userDetailFragment2 != null && (context = userDetailFragment2.getContext()) != null) {
                FdA fdA = new FdA(4, deX, user, userSession);
                C310336ap A0a = DbS.A0a();
                A0a.A0D = DbW.A0h(context, Integer.valueOf(i), 2131975868);
                A0a.A0D(context.getString(2131975867));
                A0a.A0L = true;
                A0a.A0A(fdA);
                A0a.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                DbW.A0t(context.getResources(), A0a);
                Dc2 A002 = A0a.A00();
                deX.A01 = A002;
                DbX.A1S(A002);
            }
        }
    }
}
