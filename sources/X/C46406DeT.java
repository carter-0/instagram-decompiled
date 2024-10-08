package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.DeT  reason: case insensitive filesystem */
public final class C46406DeT extends 1P0 {
    public final /* synthetic */ UserDetailFragment A00;

    public C46406DeT(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(176182342);
        UserDetailFragment userDetailFragment = this.A00;
        userDetailFragment.A31.A03 = true;
        UserDetailFragment.A0U(userDetailFragment);
        AnonymousClass0fD.A0A(425051793, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2037923139);
        De9 de9 = (De9) obj;
        int A032 = AnonymousClass0fD.A03(-612213632);
        int size = de9.A03.size();
        boolean z = false;
        int i = 0;
        for (F3Q f3q : de9.A03) {
            if ("complete".equals(f3q.A03)) {
                i++;
            }
        }
        UserDetailFragment userDetailFragment = this.A00;
        C48247EbS ebS = userDetailFragment.A31;
        ebS.A00 = i;
        ebS.A01 = size;
        ebS.A02 = de9.A04;
        ebS.A03 = true;
        if (!userDetailFragment.A1m && de9.A05) {
            z = true;
        }
        ebS.A04 = z;
        userDetailFragment.A0z.A0M(ebS);
        UserDetailFragment.A0U(userDetailFragment);
        AnonymousClass0fD.A0A(-891706974, A032);
        AnonymousClass0fD.A0A(-301472994, A03);
    }
}
