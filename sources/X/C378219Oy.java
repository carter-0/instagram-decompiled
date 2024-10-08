package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Oy  reason: invalid class name and case insensitive filesystem */
public abstract class C378219Oy {
    public static final void A00(UserSession userSession, Boolean bool, Integer num, String str, String str2, Map map) {
        String str3;
        String name = AnonymousClass0eD.A01(userSession).name();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_xposting_destination_setting");
        switch (num.intValue()) {
            case 15:
                str3 = "destination_picker_flag_reset";
                break;
            case 16:
                str3 = "destination_picker_flag_set";
                break;
            case 17:
                str3 = "destination_unknown_fallback_to_picker";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str3 = "empty_destination_id";
                break;
            case 19:
                str3 = "client_destination_id_null";
                break;
            case 20:
                str3 = "client_destination_get_name_null";
                break;
            case 21:
                str3 = "server_fetch_one_link_attempt";
                break;
            case 22:
                str3 = "server_fetch_success_one_link";
                break;
            case 23:
                str3 = "server_fetch_failure_one_link";
                break;
            case 24:
                str3 = "fetch_xpost_linkage_type_ttl_expired";
                break;
            case 25:
                str3 = "fetch_xpost_linkage_type_null";
                break;
            case 26:
                str3 = "fetch_xpost_linkage_type_fetch_attempt";
                break;
            case 27:
                str3 = "fetch_xpost_linkage_type_success";
                break;
            case 28:
                str3 = "fetch_xpost_linkage_type_failure";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                str3 = "clear_stale_destination_picker_model";
                break;
            default:
                str3 = "clear_stale_destination_info";
                break;
        }
        A0e.AAJ(TraceFieldType.AdhocEventName, str3);
        A0e.AAJ("ig_account_type", name);
        A0e.A7p("user_interaction", Boolean.valueOf(bool.booleanValue()));
        if (str == null) {
            str = "";
        }
        A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0e.A9F("time_since_last_fetch_in_seconds", (Long) null);
        A0e.AAJ(DialogModule.KEY_MESSAGE, (String) null);
        A0e.A9H("debug_test_data", map);
        A0e.AAJ("target_destination_type", (String) null);
        A0e.AAJ("linkage_destination_type", str2);
        A0e.Cgf();
    }
}
