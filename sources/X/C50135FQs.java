package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.FQs  reason: case insensitive filesystem */
public final /* synthetic */ class C50135FQs implements AnonymousClass2gO {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C50135FQs(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onChanged(Object obj) {
        User user;
        UserDetailFragment userDetailFragment = this.A00;
        if ((obj instanceof K3L) && (user = userDetailFragment.A10.A03) != null) {
            UserDetailFragment userDetailFragment2 = userDetailFragment;
            C48377EdY.A00(userDetailFragment, userDetailFragment2, userDetailFragment.A0I, user.getUsername(), userDetailFragment.A10.A03.getId(), false, false);
        }
        if (!(!(obj instanceof K3K) || userDetailFragment.A10.A03 == null || userDetailFragment.getContext() == null)) {
            F3t f3t = new F3t(userDetailFragment.getContext());
            f3t.A03(new C59998Jd7(userDetailFragment.requireContext(), userDetailFragment.A10.A03.Bh3()));
            f3t.A05 = AnonymousClass05K.A01;
            f3t.A05(userDetailFragment.getContext().getString(2131969523));
            f3t.A04(userDetailFragment.getContext().getString(2131969524));
            f3t.A02(C50021FJg.A00(userDetailFragment, 14), userDetailFragment.getContext().getString(2131968772));
            f3t.A0A = true;
            f3t.A01();
        }
        C46766Dkt dkt = userDetailFragment.A0D;
        if (dkt != null) {
            dkt.A04.Epw(DxQ.A00);
        }
    }
}
