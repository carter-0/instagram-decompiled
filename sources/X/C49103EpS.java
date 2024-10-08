package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EpS  reason: case insensitive filesystem */
public abstract class C49103EpS {
    public static final boolean A00(Fragment fragment) {
        FragmentActivity activity;
        boolean z = false;
        if (!(fragment == null || (activity = fragment.getActivity()) == null || activity.isDestroyed())) {
            z = true;
        }
        return !z;
    }
}
