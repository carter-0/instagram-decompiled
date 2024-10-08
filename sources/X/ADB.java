package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class ADB {
    public ViewGroup A00;
    public ViewGroup A01;
    public final View A02;
    public final FragmentActivity A03;
    public final AnonymousClass7SY A04;
    public final OZD A05;
    public final C39781A9a A06;
    public final UserSession A07;

    public ADB(View view, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass7SY r5) {
        0qQ.A0B(view, 3);
        this.A07 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = view;
        this.A04 = r5;
        this.A06 = A02.A00(fragmentActivity.getApplicationContext());
        this.A05 = O0R.A00(fragmentActivity.getApplicationContext());
    }

    public static final void A00(ADB adb, User user) {
        Integer Bjj = user.Bjj();
        if (Bjj != null) {
            int intValue = Bjj.intValue();
            1Av A002 = 1Au.A00(adb.A07);
            String id = user.getId();
            0xY A0p = AnonymousClass7TE.A0p(A002);
            A0p.E5T(002.A0u("reachable_user_composer_block_dismissed/userid/", id, "/type/", String.valueOf(intValue)), true);
            A0p.apply();
        }
    }
}
