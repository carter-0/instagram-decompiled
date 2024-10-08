package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

public final class FLU implements View.OnClickListener {
    public final /* synthetic */ C322896wa A00;

    public FLU(C322896wa r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1790711653);
        C322896wa r0 = this.A00;
        UserDetailFragment userDetailFragment = r0.A01;
        FragmentActivity requireActivity = userDetailFragment.requireActivity();
        UserSession userSession = r0.A00;
        DbY.A0u(requireActivity, AnonymousClass7TE.A0a(), userSession, AnonymousClass000.A00(1413));
        C319976rX.A05(userDetailFragment, userSession, C319986rY.SELF, "tap_edit_highlights", DbT.A0j(userSession).getId());
        AnonymousClass0fD.A0C(2082923309, A05);
    }
}
