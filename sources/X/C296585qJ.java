package X;

import androidx.fragment.app.Fragment;
import java.util.List;

/* renamed from: X.5qJ  reason: invalid class name and case insensitive filesystem */
public final class C296585qJ {
    public static final C296585qJ A00 = new Object();

    public static final Fragment A00(Fragment fragment, C296585qJ r6) {
        List list;
        int i;
        if (fragment.isAdded()) {
            list = fragment.getChildFragmentManager().A0U.A04();
            0qQ.A0A(list);
        } else {
            list = 0sn.A00;
        }
        if (list.isEmpty() || list.size() - 1 < 0) {
            return fragment;
        }
        while (true) {
            int i2 = i - 1;
            Fragment fragment2 = (Fragment) list.get(i);
            if (fragment2 != null && fragment2.isResumed() && fragment2.mUserVisibleHint && !fragment2.isHidden()) {
                return A00(fragment2, r6);
            }
            if (i2 < 0) {
                return fragment;
            }
            i = i2;
        }
    }
}
