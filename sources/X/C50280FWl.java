package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.FWl  reason: case insensitive filesystem */
public final class C50280FWl implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C50280FWl(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return Dc6.A02(this.A00, ((C2370736f) obj).A00.getId());
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1787430465);
        int A032 = AnonymousClass0fD.A03(-1202234027);
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (user != null) {
            userDetailFragment.A0z.A0S(user, true);
        }
        AnonymousClass0fD.A0A(1802669709, A032);
        AnonymousClass0fD.A0A(1372984235, A03);
    }
}
