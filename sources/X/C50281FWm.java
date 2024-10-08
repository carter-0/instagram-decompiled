package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.FWm  reason: case insensitive filesystem */
public final class C50281FWm implements 27S {
    public final /* synthetic */ UserDetailFragment A00;

    public C50281FWm(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        return ((C323986yQ) obj).A01.equalsIgnoreCase(this.A00.A10.A03());
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1517110482);
        C323986yQ r7 = (C323986yQ) obj;
        int A032 = AnonymousClass0fD.A03(1646008383);
        UserDetailFragment userDetailFragment = this.A00;
        User user = userDetailFragment.A10.A03;
        if (user == null) {
            i = 1129659441;
        } else {
            user.A03.EXS(r7.A00);
            C278084wF B8w = user.A03.B8w();
            if (B8w == null || B8w.getDescription() == null) {
                userDetailFragment.A0r();
            } else {
                userDetailFragment.A0o();
            }
            i = -390033527;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-654007103, A03);
    }
}
