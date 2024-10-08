package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public abstract class OPG {
    public static final C68464NJc A01(UserSession userSession, C74511Pw6 pw6, C69319NjK njK, String str, List list, boolean z) {
        return A00(userSession, pw6, njK, (DirectThreadKey) null, str, "gifs", list, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, z, true);
    }

    public static final C68464NJc A00(UserSession userSession, C74511Pw6 pw6, C69319NjK njK, DirectThreadKey directThreadKey, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        C68464NJc nJc = new C68464NJc();
        DbT.A1N(nJc, new 0eP[]{AnonymousClass7TE.A1L("param_extra_initial_search_term", str), AnonymousClass7TE.A1L("param_extra_initial_tab", str2), AnonymousClass7TE.A1L("param_extra_entry_point", Integer.valueOf(njK.ordinal())), AnonymousClass7TE.A1L("param_extra_show_like_button", Boolean.valueOf(z)), AnonymousClass7TE.A1L("param_extra_is_broadcast_thread", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("param_extra_gif_enabled", Boolean.valueOf(z3)), AnonymousClass7TE.A1L("param_extra_sticker_enabled", Boolean.valueOf(z4)), AnonymousClass7TE.A1L("param_extra_is_poll_creation_enabled", Boolean.valueOf(z5)), AnonymousClass7TE.A1L("param_extra_avatar_enabled", Boolean.valueOf(z6)), AnonymousClass7TE.A1L("param_extra_ai_sticker_enabled", Boolean.valueOf(z7)), AnonymousClass7TE.A1L("param_extra_imagine_enabled", Boolean.valueOf(z8)), AnonymousClass7TE.A1L("param_extra_saved_sticker_enabled", Boolean.valueOf(z9)), AnonymousClass7TE.A1L("param_extra_sticker_packs_enabled", Boolean.valueOf(z10)), AnonymousClass7TE.A1L("param_extra_is_location_sticker_enabled", Boolean.valueOf(z11)), AnonymousClass7TE.A1L("param_extra_is_add_yours_sticker_enabled", Boolean.valueOf(z12)), AnonymousClass7TE.A1L("param_extra_is_cutout_sticker_enabled", Boolean.valueOf(z13)), AnonymousClass7TE.A1L("param_extra_is_music_sticker_enabled", Boolean.valueOf(z14)), AnonymousClass7TE.A1L("param_extra_is_msys_thread", Boolean.valueOf(z15)), AnonymousClass7TE.A1L("param_extra_should_hide_drag_handler", Boolean.valueOf(z16)), AnonymousClass7TE.A1L("param_extra_should_hide_tab_container", Boolean.valueOf(z17)), AnonymousClass7TE.A1L("param_extra_social_stickers_user_ids", AnonymousClass7TE.A1D(list)), AnonymousClass7TE.A1L("param_extra_direct_thread_key", directThreadKey), AnonymousClass7TE.A1L("param_extra_bottom_sheet_session_id", AnonymousClass7TF.A0b()), AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05), AnonymousClass7TE.A1L("param_extra_use_initial_search_term_if_no_query", false), AnonymousClass7TE.A1L("param_extra_hide_initial_search_term", false)});
        nJc.A02 = pw6;
        return nJc;
    }
}
