package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Dds  reason: case insensitive filesystem */
public final /* synthetic */ class C46375Dds implements G6F {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46375Dds(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onResult(Object obj) {
        UserDetailFragment userDetailFragment = this.A00;
        C3034368u r4 = (C3034368u) obj;
        userDetailFragment.A1B.A0E("hypercard_fetch_end");
        if (!userDetailFragment.isAdded() || !userDetailFragment.isResumed()) {
            userDetailFragment.A15.A02.A00 = false;
        } else {
            11Z.A02(new C46439Df1(r4, userDetailFragment));
        }
    }
}
