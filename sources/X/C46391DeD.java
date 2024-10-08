package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.DeD  reason: case insensitive filesystem */
public final /* synthetic */ class C46391DeD implements Runnable {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46391DeD(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void run() {
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.isAdded()) {
            userDetailFragment.A0z.A0I();
        }
    }
}
