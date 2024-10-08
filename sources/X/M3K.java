package X;

import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.pendingmedia.model.constants.ShareType;

public final class M3K implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public M3K(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    public final void run() {
        FollowersShareFragment followersShareFragment = this.A00;
        if (FollowersShareFragment.A02(followersShareFragment).A05()) {
            FollowersShareFragment.A01(followersShareFragment).A03();
            LRK.A00(followersShareFragment).A0e(ShareType.FOLLOWERS_SHARE);
        }
    }
}
