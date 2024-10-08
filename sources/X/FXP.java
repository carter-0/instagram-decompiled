package X;

import com.instagram.profile.fragment.UserDetailFragment;

public final class FXP implements 1wn {
    public final /* synthetic */ UserDetailFragment A00;

    public FXP(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1722146504);
        int A032 = AnonymousClass0fD.A03(-304574694);
        UserDetailFragment userDetailFragment = this.A00;
        C48247EbS ebS = userDetailFragment.A31;
        if (!ebS.A02 || (i = ebS.A00) == -1 || ebS.A01 == -1) {
            UserDetailFragment.A0T(userDetailFragment);
        } else {
            ebS.A00 = i + 1;
            userDetailFragment.A0z.A0M(ebS);
        }
        AnonymousClass0fD.A0A(955901715, A032);
        AnonymousClass0fD.A0A(-1526903543, A03);
    }
}
