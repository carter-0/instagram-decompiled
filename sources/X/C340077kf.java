package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.7kf  reason: invalid class name and case insensitive filesystem */
public final class C340077kf {
    public final AnonymousClass0eK A00;

    public C340077kf(AnonymousClass0eK r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final C296605qL A00() {
        AnonymousClass0iw r1;
        Fragment fragment;
        int i;
        FragmentActivity fragmentActivity = (Activity) this.A00.get();
        if (fragmentActivity == null) {
            return null;
        }
        if (fragmentActivity instanceof FragmentActivity) {
            C296585qJ r6 = C296585qJ.A00;
            List A04 = fragmentActivity.getSupportFragmentManager().A0U.A04();
            0qQ.A07(A04);
            if (!A04.isEmpty() && A04.size() - 1 >= 0) {
                while (true) {
                    int i2 = i - 1;
                    Fragment fragment2 = (Fragment) A04.get(i);
                    if (fragment2 == null || !fragment2.isResumed() || !fragment2.mUserVisibleHint || fragment2.isHidden()) {
                        if (i2 < 0) {
                            break;
                        }
                        i = i2;
                    } else {
                        fragment = C296585qJ.A00(fragment2, r6);
                        break;
                    }
                }
            }
            fragment = null;
            if (fragment instanceof AnonymousClass0iw) {
                r1 = (AnonymousClass0iw) fragment;
                return C296595qK.A00(r1);
            }
        }
        if (!(fragmentActivity instanceof AnonymousClass0iw)) {
            return null;
        }
        r1 = (AnonymousClass0iw) fragmentActivity;
        return C296595qK.A00(r1);
    }
}
