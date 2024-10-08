package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.user.model.User;
import java.util.Collections;

/* renamed from: X.6tn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C321236tn implements C62320sa {
    public final /* synthetic */ AvatarCoinFlipConfig A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass70F A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C321236tn(AvatarCoinFlipConfig avatarCoinFlipConfig, UserSession userSession, AnonymousClass70F r3, User user, boolean z) {
        this.A04 = z;
        this.A03 = user;
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = avatarCoinFlipConfig;
    }

    public final Object invoke() {
        String str;
        String str2;
        boolean z = this.A04;
        User user = this.A03;
        UserSession userSession = this.A01;
        AnonymousClass70F r4 = this.A02;
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (!z) {
            AnonymousClass73C A002 = AnonymousClass73B.A00(userSession);
            if (A002 != null) {
                if (((ProfileCoinFlipView) r4.A0R.A01()).A01 == C320946tJ.PROFILE_PICTURE) {
                    if (!2R8.A04(userSession, user)) {
                        str2 = "external_profile";
                    } else {
                        str2 = "self_profile";
                    }
                    A002.A02(avatarCoinFlipConfig, str2, false);
                } else {
                    A002.A00();
                }
            }
            0wc A022 = AnonymousClass0kN.A02(userSession);
            0Aj A003 = A022.A00(A022.A00, "coin_flip_swivel_action");
            if (2R8.A04(userSession, user)) {
                str = "ig_self_profile";
            } else {
                str = "ig_profile";
            }
            A003.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A003.A9H("extra_client_data", Collections.singletonMap("target_user_id", user.getId()));
            A003.Cgf();
            NoteBubbleView noteBubbleView = r4.A0C;
            boolean z2 = false;
            if (((ProfileCoinFlipView) r4.A0R.A01()).A01 == C320946tJ.AVATAR) {
                z2 = true;
            }
            C378179Ou.A01(noteBubbleView, z2);
        }
        return C60340gF.A00;
    }
}
