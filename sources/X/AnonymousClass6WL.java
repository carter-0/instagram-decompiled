package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6WL  reason: invalid class name */
public final class AnonymousClass6WL {
    public static AnonymousClass0iw A01(Activity activity) {
        Fragment fragment;
        if (activity instanceof FragmentActivity) {
            List A04 = ((FragmentActivity) activity).getSupportFragmentManager().A0U.A04();
            if (!A04.isEmpty()) {
                int size = A04.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Fragment fragment2 = (Fragment) A04.get(size);
                    if (fragment2 != null && fragment2.isResumed() && fragment2.mUserVisibleHint && !fragment2.isHidden()) {
                        fragment = A00(fragment2);
                        break;
                    }
                }
            }
        }
        fragment = null;
        if (fragment instanceof AnonymousClass0iw) {
            return (AnonymousClass0iw) fragment;
        }
        return A02(activity);
    }

    public static AnonymousClass0iw A02(Context context) {
        Class<AnonymousClass6WL> cls;
        String str;
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            AnonymousClass0iw A0P = fragmentActivity.getSupportFragmentManager().A0P(R.id.layout_container_main);
            if ((A0P instanceof AnonymousClass0iw) && A0P.mUserVisibleHint) {
                return A0P;
            }
            if (!(context instanceof AnonymousClass0iw)) {
                context = C61190ls.A00(fragmentActivity);
                if (!(context instanceof AnonymousClass0iw)) {
                    cls = AnonymousClass6WL.class;
                    str = "Cannot report navigation because current fragment is not AnalyticsModule";
                }
            }
            return (AnonymousClass0iw) context;
        }
        cls = AnonymousClass6WL.class;
        str = "Cannot find AnalyticsModule because activity is not FragmentActivity";
        0KC.A03(cls, str);
        return null;
    }

    public static void A03(Context context, 0xI r2) {
        if (context != null) {
            r2.A09("is_connected", Boolean.valueOf(C61970qY.A0E(context)));
        }
    }

    public static Fragment A00(Fragment fragment) {
        List emptyList;
        if (fragment.isAdded()) {
            emptyList = fragment.getChildFragmentManager().A0U.A04();
        } else {
            emptyList = Collections.emptyList();
        }
        if (emptyList.isEmpty()) {
            return fragment;
        }
        int size = emptyList.size();
        while (true) {
            size--;
            if (size < 0) {
                return fragment;
            }
            Fragment fragment2 = (Fragment) emptyList.get(size);
            if (fragment2 != null && fragment2.isResumed() && fragment2.mUserVisibleHint && !fragment2.isHidden()) {
                return A00(fragment2);
            }
        }
    }
}
