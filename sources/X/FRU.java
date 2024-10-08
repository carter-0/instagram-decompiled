package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;

public final class FRU implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(FRU.class);
    public static final String __redex_internal_original_name = "BusinessConversionDataContext";
    public De9 A00;
    public C47333Dv0 A01;
    public BusinessInfo A02;
    public BusinessInfo A03;
    public RegFlowExtras A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final String A09;
    public final 0lg A0A;

    public FRU(Bundle bundle, 0lg r4) {
        AnonymousClass7TG.A1O(r4, bundle);
        this.A0A = r4;
        String string = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C320236s2.A03(bundle, string, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A09 = string;
        this.A08 = bundle.getInt("intro_entry_position");
        bundle.getString("target_page_id");
        bundle.getString("fb_user_id");
        bundle.getString("suma_sign_up_page_name");
        bundle.getString("upsell_fb_user_id");
        bundle.getString("upsell_page_id");
        bundle.getBoolean("sign_up_megaphone_entry", false);
    }
}
