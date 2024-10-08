package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public abstract class VJ3 {
    public static final void A00(Fragment fragment) {
        0hq r2 = fragment.mFragmentManager;
        FragmentActivity activity = fragment.getActivity();
        if (r2 != null && AnonymousClass06S.A01(r2) && !AnonymousClass06S.A00(r2) && activity != null) {
            activity.onBackPressed();
        }
    }
}
