package X;

import android.view.View;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public final class M73 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FollowersShareFragment A01;

    public M73(View view, FollowersShareFragment followersShareFragment) {
        this.A01 = followersShareFragment;
        this.A00 = view;
    }

    public final void run() {
        FollowersShareFragment.A09(this.A00, this.A01);
    }
}
