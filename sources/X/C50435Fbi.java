package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fbi  reason: case insensitive filesystem */
public final class C50435Fbi implements C46201DQd {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;

    public final void CyW(1Xj r5, AnonymousClass3W1 r6) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C18138VmE.A00().A09(activity, this.A01, "onboarding_checklist");
        }
    }

    public C50435Fbi(Fragment fragment, UserSession userSession, AnonymousClass4DU r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = fragment;
    }
}
