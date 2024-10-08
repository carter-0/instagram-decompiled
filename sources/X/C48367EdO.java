package X;

import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.EdO  reason: case insensitive filesystem */
public abstract class C48367EdO {
    public static final C46655Dia A00(UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, UserSession userSession, String str, boolean z, boolean z2, boolean z3) {
        C46655Dia dia = new C46655Dia();
        DbT.A1N(dia, new 0eP[]{AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), AnonymousClass7TE.A1L("tab_type_key", updateProfilePicturePagerAdapter$UpdateProfileTabType), AnonymousClass7TE.A1L("logging_surface_key", str), AnonymousClass7TE.A1L("coin_flip_setting_value_key", Boolean.valueOf(z)), AnonymousClass7TE.A1L("is_viewpager_scroll_enabled_key", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("is_enable_avatar_creation_flow", Boolean.valueOf(z3))});
        return dia;
    }
}
