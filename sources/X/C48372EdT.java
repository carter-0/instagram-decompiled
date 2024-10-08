package X;

import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;

/* renamed from: X.EdT  reason: case insensitive filesystem */
public abstract class C48372EdT {
    public static final C47468E3r A00(AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse, String str, String str2, String str3, String str4, float f, boolean z, boolean z2, boolean z3) {
        C47468E3r e3r = new C47468E3r();
        DbT.A1N(e3r, new 0eP[]{AnonymousClass7TE.A1L("args_avatar_idle_sticker_url", str), AnonymousClass7TE.A1L("args_avatar_pose_sticker_url", str2), AnonymousClass7TE.A1L("args_top_margin_ratio", Float.valueOf(f)), AnonymousClass7TE.A1L("args_avatar_background", avatarCoinFlipBackgroundOptionResponse), AnonymousClass7TE.A1L("args_avatar_pose_id", str3), AnonymousClass7TE.A1L("args_editor_surface", str4), AnonymousClass7TE.A1L("args_shared_element_transition_enabled", Boolean.valueOf(z)), AnonymousClass7TE.A1L("args_is_coin_flip_tied_to_avatar", Boolean.valueOf(z2)), AnonymousClass7TE.A1L("args_has_deprecated_pose", Boolean.valueOf(z3))});
        return e3r;
    }
}
