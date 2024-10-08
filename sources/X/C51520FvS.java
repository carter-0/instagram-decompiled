package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FvS  reason: case insensitive filesystem */
public final /* synthetic */ class C51520FvS implements Runnable {
    public final /* synthetic */ AvatarCoinFlipConfig A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass70F A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ C51520FvS(AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, AnonymousClass70F r3, User user) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A03 = user;
        this.A00 = avatarCoinFlipConfig;
    }

    public final void run() {
        String str;
        AnonymousClass70F r6 = this.A02;
        UserSession userSession = this.A01;
        User user = this.A03;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        r6.A0J.setEnabled(true);
        if (r6.A03 != null && ((ProfileCoinFlipView) r6.A0R.A01()).A01 == C320946tJ.PROFILE_PICTURE) {
            r6.A03.A05(false, true);
            AnonymousClass73C A002 = AnonymousClass73B.A00(userSession);
            if (A002 != null) {
                if (!2R8.A04(userSession, user)) {
                    str = "external_profile";
                } else {
                    str = "self_profile";
                }
                A002.A02(avatarCoinFlipConfig, str, true);
            }
            C378179Ou.A01(r6.A0C, false);
        }
    }
}
