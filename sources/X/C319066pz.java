package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.6pz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C319066pz extends 03J implements C62320sa {
    public C319066pz(Object obj) {
        super(0, obj, Dc7.class, "onCustomizationEntrypointClicked", "onCustomizationEntrypointClicked()V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        UserDetailFragment userDetailFragment = (UserDetailFragment) this.receiver;
        if (userDetailFragment.A0B != null) {
            AvatarCoinFlipConfig avatarCoinFlipConfig = userDetailFragment.A0B;
            AvatarCoinFlipSticker avatarCoinFlipSticker = avatarCoinFlipConfig.A05;
            ((C323276xE) userDetailFragment.A0x.A0W.getValue()).A03(avatarCoinFlipConfig.A04, (ProfileCoinFlipView) null, avatarCoinFlipSticker.A03, avatarCoinFlipConfig.A06.A03, avatarCoinFlipConfig.A07, avatarCoinFlipSticker.A00, avatarCoinFlipConfig.A03, avatarCoinFlipConfig.A02);
        }
        return C60340gF.A00;
    }
}
