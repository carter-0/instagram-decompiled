package X;

import android.os.Bundle;

/* renamed from: X.Uv4  reason: case insensitive filesystem */
public final class C16448Uv4 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelLinkShareFragment";
    public 28D A00;
    public String A01;
    public String A02;

    public final String getModuleName() {
        return "reels_link_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(472881752);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("ReelLinkShareConstants.ARGUMENTS_KEY_LINK_SHARE_URL", "");
        this.A01 = requireArguments.getString("ReelLinkShareConstants.ARGUMENTS_KEY_LINK_SHARE_CTA");
        this.A00 = C13991Tnr.A0A(requireArguments, "ReelCountdownShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT");
        AnonymousClass0fD.A09(2133097239, A022);
    }
}
