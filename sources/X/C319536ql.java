package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.6ql  reason: invalid class name and case insensitive filesystem */
public abstract class C319536ql {
    public static final AnonymousClass5Gv A00(Activity activity, View view, C226262fy r8, String str) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 2);
        return A01(activity, view, r8, str, activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), view.getWidth() / 2);
    }

    public static final AnonymousClass5Gv A01(Activity activity, View view, C226262fy r7, String str, int i, int i2) {
        0qQ.A0B(str, 2);
        0qQ.A0B(r7, 3);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = iArr[0] + i2;
        int i4 = iArr[1];
        if (r7 == C226262fy.ABOVE_ANCHOR) {
            i4 -= i;
        } else if (r7 == C226262fy.BELOW_ANCHOR) {
            i4 += view.getHeight() + i;
        }
        AnonymousClass5Gt r1 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) str));
        View findViewById = activity.findViewById(16908290);
        0qQ.A07(findViewById);
        r1.A04(findViewById, i3, i4, false);
        r1.A05 = r7;
        return r1.A00();
    }

    public static final AnonymousClass5Gv A02(Activity activity, View view, String str) {
        0qQ.A0B(str, 2);
        return A01(activity, view, C226262fy.ABOVE_ANCHOR, str, activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), view.getWidth() / 2);
    }

    public static final boolean A03(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            return false;
        }
        return true;
    }
}
