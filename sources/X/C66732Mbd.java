package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mbd  reason: case insensitive filesystem */
public final class C66732Mbd {
    public static final C66732Mbd A00 = new Object();

    public static final void A00(Activity activity) {
        SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) activity.findViewById(R.id.layout_direct_sliding_pane);
        if (slidingPaneLayout != null) {
            SlidingPaneLayout.A00(slidingPaneLayout);
        }
        View findViewById = activity.findViewById(R.id.direct_inbox_null_state);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    public static final void A01(Activity activity, View view, UserSession userSession) {
        int i;
        View findViewById;
        0qQ.A0B(userSession, 1);
        A02(activity, view, userSession, 2Y9.A00(activity), AnonymousClass0nB.A01(activity));
        View findViewById2 = activity.findViewById(R.id.direct_inbox_null_state);
        if (findViewById2 != null) {
            if (!A03(activity, userSession) || !((findViewById = activity.findViewById(R.id.layout_direct_thread)) == null || findViewById.findViewById(R.id.thread_fragment_container) == null)) {
                i = 8;
            } else {
                i = 0;
            }
            findViewById2.setVisibility(i);
        }
    }

    public static final void A02(Activity activity, View view, UserSession userSession, Integer num, int i) {
        View view2;
        if (2Y9.A02(num)) {
            if (view == null || (view2 = view.findViewById(R.id.layout_container_direct_wrapper)) == null) {
                view2 = activity.findViewById(R.id.layout_container_direct_wrapper);
            }
            if (182.A06(0Tu.A05, userSession, 36320232024842356L) && view2 != null) {
                0qQ.A0B(num, 0);
                if (num == AnonymousClass05K.A0C) {
                    i /= 3;
                } else {
                    View findViewById = activity.findViewById(R.id.layout_direct_thread);
                    if (!(findViewById == null || findViewById.findViewById(R.id.thread_fragment_container) == null)) {
                        i /= 2;
                    }
                }
                View findViewById2 = activity.findViewById(R.id.ls_nav_bar);
                Rect A0W = AnonymousClass7TE.A0W();
                C66581MXm.A0A(activity).getHitRect(A0W);
                if (findViewById2 != null && findViewById2.getLocalVisibleRect(A0W)) {
                    try {
                        i -= activity.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                0nA.A0f(view2, i);
            }
        }
    }

    public static final boolean A03(Context context, UserSession userSession) {
        AnonymousClass7TG.A1N(context, userSession);
        if (!182.A06(0Tu.A05, userSession, 36320232024842356L) || !2Y9.A02(2Y9.A00(context))) {
            return false;
        }
        return true;
    }
}
