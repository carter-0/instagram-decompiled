package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;

public final class AXH implements C74381Ptw {
    public final Activity A00;
    public final Fragment A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final ClipsCelebrationReshareViewModel A04;
    public final 1Xj A05;

    public final void CJB() {
        UserSession userSession = this.A03;
        C243473Yx.A02(this.A00, this.A01, 28D.A1S, userSession, this.A04, this.A05, (String) null, true);
    }

    public AXH(Activity activity, Fragment fragment, AnonymousClass0iw r3, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, 1Xj r6) {
        this.A03 = userSession;
        this.A02 = r3;
        this.A01 = fragment;
        this.A00 = activity;
        this.A05 = r6;
        this.A04 = clipsCelebrationReshareViewModel;
    }

    public final void CId() {
        1ZU A002 = C48794EkH.A00();
        Fragment fragment = this.A01;
        FragmentActivity requireActivity = fragment.requireActivity();
        UserSession userSession = this.A03;
        1Xj r2 = this.A05;
        A002.A03(requireActivity, userSession, r2);
        C305796Jo.A03(fragment, fragment.requireActivity(), this.A02, userSession, r2);
    }
}
