package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.DeE  reason: case insensitive filesystem */
public final /* synthetic */ class C46392DeE implements AnonymousClass2gO {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C46392DeE(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onChanged(Object obj) {
        UserDetailFragment userDetailFragment = this.A00;
        C48196Eac eac = (C48196Eac) obj;
        if (eac instanceof C318536p7) {
            AvatarCoinFlipConfig avatarCoinFlipConfig = ((C318536p7) eac).A00;
            userDetailFragment.A0A = avatarCoinFlipConfig;
            userDetailFragment.A13.A00.A01(avatarCoinFlipConfig);
            if (avatarCoinFlipConfig != null) {
                userDetailFragment.A1X = avatarCoinFlipConfig.A08;
            }
        } else if (eac instanceof C318546p8) {
            userDetailFragment.A13.A00.A01((AvatarCoinFlipConfig) null);
        }
    }
}
