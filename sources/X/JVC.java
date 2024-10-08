package X;

import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public final class JVC {
    public final 26t A00;
    public final UserSession A01;

    public final Object A01(AvatarInfo avatarInfo, Boolean bool, String str, String str2, String str3, AnonymousClass4D7 r9, boolean z) {
        boolean z2 = false;
        1NY A0a = AnonymousClass7TG.A0a(this.A01);
        A0a.A0A("creatives/save_avatar_profile_settings/");
        A0a.A0H("coin_flip_enabled", z);
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        A0a.A0H("is_coin_flip_tied_to_avatar", z2);
        A0a.A0Q(1XP.class, 1XY.class);
        if (str != null) {
            A0a.A9m("background_id", str);
        }
        if (str2 != null) {
            A0a.A9m("animation_sticker_pack", str2);
        }
        if (str3 != null) {
            A0a.A9m("coin_flip_action_surface", str3);
        }
        if (avatarInfo != null) {
            String str4 = avatarInfo.A00;
            if (str4 != null) {
                A0a.A9m("avatar_id", str4);
            }
            String str5 = avatarInfo.A01;
            if (str5 != null) {
                A0a.A9m("avatar_revision_id", str5);
            }
            String str6 = avatarInfo.A02;
            if (str6 != null) {
                A0a.A9m("avatar_style", str6);
            }
        }
        return A0a.A0M().A00(1868968123, r9);
    }

    public JVC(UserSession userSession, 26t r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public static final Object A00(UserSession userSession, String str, String str2, AnonymousClass4D7 r6) {
        Long A10;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("creatives/avatar_profile_pic/");
        A0b.A0Q(C318516p5.class, C318526p6.class);
        if (!(str == null || (A10 = AnonymousClass7TE.A10(str)) == null)) {
            A0b.A0D(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A10.longValue());
        }
        if (str2 != null) {
            A0b.A9m("coin_flip_type", str2);
        }
        return A0b.A0M().A00(987414878, r6);
    }
}
