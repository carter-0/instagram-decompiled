package X;

import android.view.ViewTreeObserver;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;

/* renamed from: X.6wA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C322636wA implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C322626w9 A00;

    public /* synthetic */ C322636wA(C322626w9 r1) {
        this.A00 = r1;
    }

    public final boolean onPreDraw() {
        C323756y3 r0;
        UserDetailTabController userDetailTabController = (UserDetailTabController) this.A00.A00.get();
        if (userDetailTabController == null || (r0 = userDetailTabController.mViewHolder) == null) {
            return true;
        }
        RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = r0.A0G;
        float measuredHeight = (float) r0.A02.getMeasuredHeight();
        refreshableAppBarLayoutBehavior.A02 = measuredHeight;
        refreshableAppBarLayoutBehavior.A00 = measuredHeight * 1.2f;
        return true;
    }
}
