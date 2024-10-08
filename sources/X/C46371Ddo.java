package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collections;

/* renamed from: X.Ddo  reason: case insensitive filesystem */
public final /* synthetic */ class C46371Ddo implements Runnable {
    public final /* synthetic */ AvatarCoinFlipConfig A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass70F A02;
    public final /* synthetic */ User A03;

    public /* synthetic */ C46371Ddo(AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, AnonymousClass70F r3, User user) {
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
        if (r6.A03 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "coin_flip_swivel_impression");
            DbS.A1N(A0e, "ig_profile");
            DbV.A1L(A0e, Collections.singletonMap("target_user_id", user.getId()));
            r6.A03.A05(true, true);
            AnonymousClass73C A002 = AnonymousClass73B.A00(userSession);
            if (A002 != null) {
                if (!2R8.A04(userSession, user)) {
                    str = "external_profile";
                } else {
                    str = "self_profile";
                }
                A002.A02(avatarCoinFlipConfig, str, true);
            }
            26t A003 = 26G.A00(userSession);
            DbX.A1T(A003.A00.AR4(), "KEY_COIN_FLIP_INTRO_ON_PROFILE_ENALBED", user.getId(), false);
        }
    }
}
