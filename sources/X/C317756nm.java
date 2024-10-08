package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6nm  reason: invalid class name and case insensitive filesystem */
public abstract class C317756nm {
    public static void A04(Activity activity, UserSession userSession, boolean z) {
        A02(activity, (Fragment) null, userSession, false, z);
    }

    public static void A05(Activity activity, UserSession userSession, boolean z) {
        A03(activity, (Fragment) null, userSession, false, z);
    }

    public static void A00(Activity activity, int i) {
        C226112fe.A0B.A05(activity, new C67624Mqw(activity, i));
    }

    public static void A02(Activity activity, Fragment fragment, UserSession userSession, boolean z, boolean z2) {
        if (z) {
            0qQ.A0B(activity, 0);
            View findViewById = activity.findViewById(R.id.tab_bar);
            View findViewById2 = activity.findViewById(R.id.ls_nav_bar);
            if (findViewById != null) {
                findViewById.setBackgroundColor(activity.getColor(2Yu.A0H(activity, R.attr.igds_color_primary_background)));
            }
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(activity.getColor(2Yu.A0H(activity, R.attr.igds_color_primary_background)));
            }
            View findViewById3 = activity.findViewById(R.id.tab_bar_shadow);
            View findViewById4 = activity.findViewById(R.id.ls_nav_bar_shadow);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(activity.getColor(2Yu.A0H(activity, R.attr.igds_color_separator)));
            }
            if (findViewById4 != null) {
                findViewById4.setBackgroundColor(activity.getColor(2Yu.A0H(activity, R.attr.igds_color_separator)));
            }
            0Pn.A03(activity, userSession);
        }
        int color = activity.getColor(2Yu.A0H(activity, R.attr.igds_color_primary_background));
        AnonymousClass2uJ.A04(activity, color);
        AnonymousClass2uJ.A06(activity, true);
        Window window = activity.getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        if (z2) {
            2db.A07(decorView, window, true);
            decorView.setOnSystemUiVisibilityChangeListener(new LYZ(activity, decorView, color));
            return;
        }
        if (A06(activity)) {
            decorView.setBackgroundColor(color);
        } else {
            A00(activity, 0);
        }
        2db.A04(activity, fragment, color, false);
    }

    public static void A01(Activity activity, Fragment fragment, UserSession userSession, int i, boolean z, boolean z2, boolean z3) {
        Context A01 = 2Yn.A01(activity);
        int color = A01.getColor(2Yu.A0H(A01, R.attr.igds_color_primary_background));
        if (z) {
            int A0H = 2Yu.A0H(activity, R.attr.igds_color_clips_tab_bar_background);
            int A0H2 = 2Yu.A0H(activity, R.attr.igds_color_reels_tab_bar_separator);
            View findViewById = activity.findViewById(R.id.tab_bar);
            View findViewById2 = activity.findViewById(R.id.ls_nav_bar);
            if (findViewById != null) {
                findViewById.setBackgroundColor(activity.getColor(A0H));
            }
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(activity.getColor(A0H));
            }
            View findViewById3 = activity.findViewById(R.id.tab_bar_shadow);
            View findViewById4 = activity.findViewById(R.id.ls_nav_bar_shadow);
            if (findViewById3 != null) {
                findViewById3.setBackgroundColor(activity.getColor(A0H2));
            }
            if (findViewById4 != null) {
                findViewById4.setBackgroundColor(activity.getColor(A0H2));
            }
            0Pn.A05(activity, userSession, i);
        }
        AnonymousClass2uJ.A04(activity, color);
        AnonymousClass2uJ.A06(activity, false);
        Window window = activity.getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        if (A06(activity)) {
            decorView.setBackgroundColor(color);
        } else {
            A00(activity, color);
        }
        if (z2) {
            2db.A07(decorView, window, false);
            return;
        }
        if (!2db.A0B(decorView, window)) {
            2db.A07(decorView, window, true);
        }
        if (!z3) {
            2db.A04(activity, fragment, color, true);
        }
    }

    public static void A03(Activity activity, Fragment fragment, UserSession userSession, boolean z, boolean z2) {
        A01(activity, fragment, userSession, 2Yu.A0H(activity, R.attr.igds_color_clips_tab_bar_icon), z, z2, false);
    }

    public static boolean A06(Activity activity) {
        if (!0lz.A02(activity) || activity.findViewById(R.id.swipe_navigation_container) == null) {
            return true;
        }
        return false;
    }
}
