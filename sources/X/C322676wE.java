package X;

import android.transition.Scene;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6wE  reason: invalid class name and case insensitive filesystem */
public abstract class C322676wE implements C324246ys {
    public Integer A00 = AnonymousClass05K.A0C;

    public void A00(AppBarLayout appBarLayout, Integer num) {
        UserDetailTabController userDetailTabController = ((C322666wD) this).A00;
        C323756y3 r2 = userDetailTabController.mViewHolder;
        if (r2 != null && !userDetailTabController.A0Y.equals("creator_inspiration_signals_playground_test_user_list")) {
            Scene scene = new Scene(r2.A08, r2.A05);
            Scene sceneForLayout = Scene.getSceneForLayout(userDetailTabController.mViewHolder.A08, R.layout.layout_use_in_camera_button_scrolling, userDetailTabController.A0I);
            sceneForLayout.getClass();
            if (num == AnonymousClass05K.A00) {
                C324106ye.A00(sceneForLayout);
            } else {
                C324106ye.A00(scene);
            }
        }
    }

    public final void DUz(AppBarLayout appBarLayout, int i) {
        Integer num;
        0qQ.A0B(appBarLayout, 0);
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        if (i == 0) {
            num = AnonymousClass05K.A01;
        } else if (Math.abs(i) >= totalScrollRange) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        if (this.A00 != num) {
            A00(appBarLayout, num);
        }
        this.A00 = num;
    }
}
