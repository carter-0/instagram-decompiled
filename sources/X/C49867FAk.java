package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;

/* renamed from: X.FAk  reason: case insensitive filesystem */
public final class C49867FAk {
    public final void A01(0lg r9, Integer num) {
        String str;
        0lg r2 = r9;
        0qQ.A0B(r9, 0);
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01) {
            String A0c = AnonymousClass7TF.A0c();
            0qQ.A07(A0c);
            DbT.A0h().A0G(A0c);
        }
        switch (num.intValue()) {
            case 0:
                str = "identity_switcher";
                break;
            case 1:
                str = "settings";
                break;
            default:
                str = "reg_existing_login";
                break;
        }
        A00(r2, "spc", "identity_switcher", "registration_start", (String) null, DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
    }

    public static final void A00(0lg r8, String str, String str2, String str3, String str4, HashMap hashMap) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "caa_acquisition_client_ig_event");
        if (A0e.isSampled()) {
            0tS A0h = DbT.A0h();
            0bb r4 = new 0bb();
            DbZ.A1K(r4, "registration_flow_state", str, str2, "registration_funnel");
            r4.A05(C273654mx.A00(2325), (Long) null);
            r4.A06("exception_message", str4);
            r4.A06("logged_in_identifier", (String) null);
            r4.A06("logged_out_identifier", (String) null);
            r4.A08("extra_client_data", hashMap);
            r4.A06("waterfall_id", A0h.A08());
            r4.A06("event_request_id", (String) null);
            A0e.AAK(r4, "core");
            0bb r1 = new 0bb();
            r1.A06("reg_instance", "");
            r1.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str3);
            A0e.AAK(r1, "acquisition_client_params");
            A0e.Cgf();
        }
    }
}
