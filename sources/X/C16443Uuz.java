package X;

import android.os.Bundle;

/* renamed from: X.Uuz  reason: case insensitive filesystem */
public final class C16443Uuz extends C15291UZw {
    public static final String __redex_internal_original_name = "CloseFriendsFirstShareCameraFragment";
    public 28D A00 = 28D.A5J;
    public final WUP A01 = new WUP(this, 12);

    public final String getModuleName() {
        return "close_friends_first_share_camera_fragment";
    }

    public final void onCreate(Bundle bundle) {
        28D r1;
        int A02 = AnonymousClass0fD.A02(-1329194448);
        super.onCreate(bundle);
        Object obj = requireArguments().get("CloseFriendsFirstShareCameraFragment.ARGUMENTS_KEY_ENTRY_POINT");
        if (!(obj instanceof 28D) || (r1 = (28D) obj) == null) {
            r1 = 28D.A5J;
        }
        this.A00 = r1;
        AnonymousClass0fD.A09(7512451, A02);
    }
}
