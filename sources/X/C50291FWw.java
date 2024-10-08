package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FWw  reason: case insensitive filesystem */
public final class C50291FWw implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C50291FWw(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        throw AnonymousClass7TE.A11("mUserId");
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(781113595);
        int A032 = AnonymousClass0fD.A03(-968765396);
        UserDetailFragment userDetailFragment = this.A00;
        if (userDetailFragment.isResumed()) {
            UserDetailFragment.A0M(userDetailFragment.getContext(), userDetailFragment);
        } else {
            userDetailFragment.A1z = true;
        }
        AnonymousClass0fD.A0A(1803283811, A032);
        AnonymousClass0fD.A0A(731585178, A03);
    }
}
