package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;

/* renamed from: X.Ddt  reason: case insensitive filesystem */
public final /* synthetic */ class C46376Ddt implements C230902qW {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46376Ddt(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void DR0(AnonymousClass4UE r6) {
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (r6.CA0().contains(Trigger.A1B)) {
            if (userDetailFragment.A18() && user != null && user.A20()) {
                if (!DbY.A1Y(0Tu.A05, userDetailFragment.A0I, 36318922059815676L)) {
                    return;
                }
            } else {
                return;
            }
        }
        userDetailFragment.A0z.A0R(r6);
    }
}
