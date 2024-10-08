package X;

import android.content.Context;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FQr  reason: case insensitive filesystem */
public final /* synthetic */ class C50134FQr implements AnonymousClass2gO {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C50134FQr(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onChanged(Object obj) {
        C46368Ddk ddk;
        UserDetailFragment userDetailFragment = this.A00;
        C48197Ead ead = (C48197Ead) obj;
        if (ead instanceof C319296qM) {
            AvatarCoinFlipConfig avatarCoinFlipConfig = ((C319296qM) ead).A00;
            userDetailFragment.A0B = avatarCoinFlipConfig;
            if (userDetailFragment.A15()) {
                userDetailFragment.A13.A00.A01(avatarCoinFlipConfig);
                AvatarCoinFlipConfig avatarCoinFlipConfig2 = userDetailFragment.A0B;
                if (avatarCoinFlipConfig2 != null) {
                    boolean z = avatarCoinFlipConfig2.A08;
                    userDetailFragment.A1X = z;
                    if (z && (ddk = userDetailFragment.A0C) != null) {
                        ddk.A00();
                    }
                }
            }
        } else if (ead instanceof C319026pv) {
            if (!((C319026pv) ead).A00) {
                Context requireContext = userDetailFragment.requireContext();
                Dc2 dc2 = C48209Eap.A00;
                if (dc2 != null) {
                    DbX.A1R(dc2);
                }
                C48209Eap.A00 = null;
                C310336ap A0a = DbS.A0a();
                DbS.A19(requireContext, A0a, 2131953448);
                DbY.A1N(A0a);
            }
            userDetailFragment.A13.A00.A01((AvatarCoinFlipConfig) null);
        }
    }
}
