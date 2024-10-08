package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;

public final class SRE {
    public static final SRE A00 = new Object();

    public static final 2IV A00(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        if (bundle.get("ad_id") == null) {
            return null;
        }
        2IV A0R = Pxe.A0R();
        A0R.A09("ad_id", "key");
        A0R.A09(Pxi.A0d(bundle, "ad_id"), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        2IV A0R2 = Pxe.A0R();
        A0R2.A09("iab_session_id", "key");
        A0R2.A09(Pxi.A0d(bundle, "iab_session_id"), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        2IV A0R3 = Pxe.A0R();
        A0R3.A05("data", 0sr.A1P(new 2IV[]{A0R, A0R2}));
        return A0R3;
    }

    public final void A02(Bundle bundle, C58840Ae r9, Integer num, String str) {
        A03(bundle, r9, num, str, (String) null, (String) null);
    }

    public static final void A01(Activity activity, Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            i = R.string.f0nameremoved;
            if (intValue != 1) {
                i = R.string.f0nameremoved;
            }
        } else {
            i = R.string.f0nameremoved;
        }
        Toast.makeText(activity.getApplicationContext(), i, 1).show();
    }

    public final void A03(Bundle bundle, C58840Ae r12, Integer num, String str, String str2, String str3) {
        Integer num2;
        String str4;
        String str5;
        String str6;
        DbY.A1S(r12, bundle);
        String string = bundle.getString("source");
        String str7 = "";
        String str8 = str7;
        if (string == null) {
            string = str7;
        }
        LinkedHashMap A0y = C66582MXn.A0y("source", string);
        String string2 = bundle.getString("token_source");
        if (string2 == null) {
            string2 = str7;
        }
        A0y.put("token_source", string2);
        long A0I = AnonymousClass7TG.A0I();
        long j = bundle.getLong("expiry_time");
        if (j == 0) {
            num2 = AnonymousClass05K.A00;
        } else if (j < A0I) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A0C;
        }
        switch (num2.intValue()) {
            case 0:
                str4 = "UNAUTHENTICATED";
                break;
            case 1:
                str4 = "AUTH_EXPIRED";
                break;
            default:
                str4 = "AUTHENTICATED";
                break;
        }
        A0y.put("auth_state", str4);
        String string3 = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string3 != null) {
            str7 = string3;
        }
        A0y.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        0Aj A0d = C51969G9p.A0d(r12, "externally_linked_account_authentication_interactions");
        String string4 = bundle.getString("ad_id");
        if (string4 == null) {
            string4 = str8;
        }
        String string5 = bundle.getString("iab_session_id");
        if (string5 == null) {
            string5 = str8;
        }
        String string6 = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string6 != null) {
            str8 = string6;
        }
        if (str8.equals(C66579MXk.A00(174))) {
            str5 = "BUY_WITH_PRIME_UNIVERSAL_LINK";
        } else {
            str5 = "BUY_WITH_PRIME";
        }
        if (A0d.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str6 = "LOGIN_INITIATED";
                    break;
                case 1:
                    str6 = "LOGIN_URL_RECEIVED";
                    break;
                case 2:
                    str6 = "LOGIN_AUTH_CODE_RECEIVED";
                    break;
                case 3:
                    str6 = "LOGIN_ACCESS_TOKEN_RECEIVED";
                    break;
                case 4:
                    str6 = "LOGIN_CANCELED_BY_USER";
                    break;
                case 5:
                    str6 = "LOGIN_INTERNAL_ERROR";
                    break;
                case 6:
                    str6 = "LOGIN_EXTERNAL_PARTNER_ERROR";
                    break;
                case 7:
                    str6 = "ACCESS_TOKEN_REFRESH_SUCCEED";
                    break;
                case 8:
                    str6 = "ACCESS_TOKEN_FROM_CACHE";
                    break;
                default:
                    str6 = "ACCESS_TOKEN_REFRESH_ERROR";
                    break;
            }
            A0d.AAJ(TraceFieldType.AdhocEventName, str6);
            A0d.AAJ("flow_name", str5);
            A0d.AAJ("ad_id", string4);
            A0d.AAJ("iab_session_id", string5);
            A0d.A9H("extra_data", A0y);
            A0d.AAJ("error_message", str);
            A0d.AAJ("error_type", str2);
            A0d.AAJ("error_stack_trace", str3);
            A0d.Cgf();
        }
    }
}
