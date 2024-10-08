package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.9Op  reason: invalid class name and case insensitive filesystem */
public final class C378129Op implements C230922qa {
    public final /* synthetic */ UserDetailFragment A00;

    public C378129Op(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void DVk(C300555xO r2) {
        this.A00.A1L.A02 = r2;
    }

    public final void Ds7(C300555xO r4) {
        String str;
        C322366vi r0;
        UserDetailFragment userDetailFragment = this.A00;
        boolean A0i = UserDetailFragment.A0i(userDetailFragment);
        C230882qT r2 = userDetailFragment.A1L;
        if (A0i) {
            C322356vh r1 = userDetailFragment.A1F;
            if (!r1.A05 || (r0 = r1.A03) == null) {
                str = null;
            } else {
                str = String.valueOf(r0);
            }
            r2.A02(r4, str);
            return;
        }
        r2.A01(userDetailFragment.A1I, r4);
    }
}
