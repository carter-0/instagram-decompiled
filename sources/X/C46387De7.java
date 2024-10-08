package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.De7  reason: case insensitive filesystem */
public final /* synthetic */ class C46387De7 implements C62320sa {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ UserDetailTabController A01;

    public /* synthetic */ C46387De7(UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController) {
        this.A00 = userDetailFragment;
        this.A01 = userDetailTabController;
    }

    public final Object invoke() {
        AnonymousClass723 A02;
        UserDetailFragment userDetailFragment = this.A00;
        UserDetailTabController userDetailTabController = this.A01;
        View view = userDetailFragment.A03;
        if (view != null && view.getVisibility() == 0) {
            return C48083EVb.PROFILE_PICTURE_FULLSCREEN;
        }
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 == null || (A02 = userDetailTabController.A0O.A02(r0.A0I.getCurrentItem())) == null) {
            return null;
        }
        String BhI = A02.BhI();
        if (BhI.equals("profile_media_grid")) {
            return C48083EVb.GRID_WALL;
        }
        if (BhI.equals(C273654mx.A00(51))) {
            return C48083EVb.TAGGED_WALL;
        }
        return null;
    }
}
