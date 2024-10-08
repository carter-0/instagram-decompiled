package X;

import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public final class M3H implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public M3H(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    public final void run() {
        FollowersShareFragment followersShareFragment = this.A00;
        AnonymousClass3Q2 A05 = FollowersShareFragment.A05(followersShareFragment);
        if (A05 != null && !A05.A5S && followersShareFragment.getActivity() != null && followersShareFragment.isAdded()) {
            1ua A01 = 1ua.A0G.A01(followersShareFragment.requireActivity(), AnonymousClass7TE.A0l(followersShareFragment.A0f));
            AnonymousClass3QD r0 = AnonymousClass3QD.NOT_UPLOADED;
            A05.A0c(r0);
            A05.A0d(r0);
            A01.A05.A04();
            if (A05.A0u()) {
                A05.A0k(AnonymousClass7TE.A1C());
            }
        }
    }
}
