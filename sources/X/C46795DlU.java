package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.DlU  reason: case insensitive filesystem */
public final class C46795DlU extends 2YL implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "AvatarCoinFlipNuxBottomSheetViewModel";
    public final 1Ln A00;
    public final AnonymousClass0kM A01;
    public final String A02;

    public final void A00(String str, Integer num, String str2) {
        String str3;
        1Ln r3 = this.A00;
        r3.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_edit_profile");
        int intValue = num.intValue();
        if (intValue == 0) {
            str3 = "impression";
        } else if (intValue == 1) {
            str3 = "turn_on_click";
        } else if (intValue == 2) {
            str3 = "dismiss_click";
        } else if (intValue != 3) {
            str3 = AnonymousClass000.A00(3029);
        } else {
            str3 = "hide_from_profile_click";
        }
        r3.A00.A9H("extra_client_data", DbY.A0q("editor_surface", str2, AnonymousClass7TE.A1L(C273654mx.A00(37), str3), AnonymousClass7TE.A1L("surface", str)));
        r3.Cgf();
    }

    public final String getModuleName() {
        return this.A02;
    }

    public /* synthetic */ C46795DlU(UserSession userSession, String str) {
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        1Ln r1 = new 1Ln(AnonymousClass7TE.A0e(A0M.A00(), "coin_flip_nux_bottom_sheet_action"), 127);
        0qQ.A0B(str, 2);
        this.A02 = str;
        this.A01 = A0M;
        this.A00 = r1;
        A0M.A00 = this;
    }
}
