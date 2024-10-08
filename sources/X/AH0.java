package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class AH0 {
    public final AnonymousClass0eM A00;

    public static final void A01(AnonymousClass9JK r4, AH0 ah0, AnonymousClass9F2 r6, Integer num) {
        String str;
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e((0wc) ah0.A00.getValue(), "one_link_debug_event");
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r4.A03);
        A0e.AAJ("flow", r4.A04);
        A0e.AAJ("step", r4.A05);
        A0e.AAJ("caller_context", ((CallerContext) r4.A01).A02);
        A0e.AAJ("caller_name", r4.A02);
        A0e.AAJ("event", "graphql_empty_response_not_found");
        if (r6.equals(AnonymousClass9F1.A00)) {
            str = "ig_business_user_auth_config";
        } else if (r6 instanceof AnonymousClass9GV) {
            str = "facebook_access_token_auth_config";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A0e.AAJ("auth_policy", str);
        if (num != null) {
            str2 = A00(num);
        } else {
            str2 = null;
        }
        A0e.AAJ("info_type", str2);
        A0e.Cgf();
    }

    public final void A02(AnonymousClass9F2 r4, Integer num, String str) {
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A00.getValue(), "one_link_graphql_event");
        A0e.AAJ("info_type", A00(num));
        A0e.AAJ("event", "graphql_error");
        if (r4.equals(AnonymousClass9F1.A00)) {
            str2 = "ig_business_user_auth_config";
        } else if (r4 instanceof AnonymousClass9GV) {
            str2 = "facebook_access_token_auth_config";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A0e.AAJ("auth_policy", str2);
        A0e.AAJ("error_message", str);
        A0e.Cgf();
    }

    public AH0(UserSession userSession) {
        this.A00 = AnonymousClass0eN.A01(new C20703Wxa(userSession, 26));
    }

    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "fb_page";
        }
        if (intValue == 1) {
            return "whatsapp_business";
        }
        if (intValue == 2) {
            return "business_account";
        }
        if (intValue == 3) {
            return "ad_account";
        }
        throw AnonymousClass7TE.A1K();
    }
}
