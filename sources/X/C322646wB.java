package X;

import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6wB  reason: invalid class name and case insensitive filesystem */
public final class C322646wB implements Runnable {
    public final /* synthetic */ UserDetailTabController A00;

    public C322646wB(UserDetailTabController userDetailTabController) {
        this.A00 = userDetailTabController;
    }

    public final void run() {
        UserDetailTabController userDetailTabController = this.A00;
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 != null) {
            UserDetailTabController.A05(userDetailTabController, r0.A0I.getCurrentItem(), false);
        }
    }
}
