package X;

import android.view.View;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.702  reason: invalid class name */
public final /* synthetic */ class AnonymousClass702 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserDetailTabController A01;
    public final /* synthetic */ C322826wT A02;

    public /* synthetic */ AnonymousClass702(UserDetailTabController userDetailTabController, C322826wT r2, int i) {
        this.A01 = userDetailTabController;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void onClick(View view) {
        UserDetailTabController userDetailTabController = this.A01;
        C322826wT r3 = this.A02;
        int i = this.A00;
        userDetailTabController.A06 = "tap_header";
        boolean z = false;
        if (userDetailTabController.A01 == i) {
            z = true;
        }
        r3.DqE(z);
        C323756y3 r0 = userDetailTabController.mViewHolder;
        if (r0 != null) {
            r0.A0I.setCurrentItem(i);
        }
    }
}
