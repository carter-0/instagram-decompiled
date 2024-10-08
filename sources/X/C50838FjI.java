package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FjI  reason: case insensitive filesystem */
public final class C50838FjI implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0B = DbV.A0B(uri, 0);
        DbU.A1B(uri, A0B, "media_id");
        DbU.A1B(uri, A0B, "coupon_offer_id");
        DbT.A1E(uri, A0B, "is_cta_ctwa_aymt");
        DbT.A1E(uri, A0B, AnonymousClass000.A00(672));
        DbT.A1E(uri, A0B, "is_cta_lead_ads_aymt");
        DbU.A1B(uri, A0B, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        DbU.A1B(uri, A0B, "aymt_channel");
        DbU.A1B(uri, A0B, "dummy_param_random_uuid");
        DbT.A1E(uri, A0B, "has_relaunched_from_main_activity");
        FHB.A09(A0B, this.A00.requireActivity(), this.A01);
    }

    public C50838FjI(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
