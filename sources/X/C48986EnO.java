package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.EnO  reason: case insensitive filesystem */
public abstract class C48986EnO {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "clicked";
            case 2:
                return "dismiss";
            case 3:
                return "not_shown";
            case 4:
                return "send_confirm_email";
            case 5:
                return AnonymousClass000.A00(3954);
            case 6:
                return AnonymousClass000.A00(1165);
            case 7:
                return "confirm_phone";
            case 8:
                return AnonymousClass000.A00(2782);
            case 9:
                return "enroll_two_factor";
            case 10:
            case 11:
                return "learn_more";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return AnonymousClass000.A00(2580);
            case 13:
                return "not_business";
            case 14:
                return "create_biz_account";
            case 15:
                return "report_spam";
            case 16:
                return "report_not_spam";
            case 17:
                return "reset_password_link";
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return "reset_password_page";
            case 19:
                return AnonymousClass000.A00(1904);
            case 20:
                return AnonymousClass000.A00(1213);
            case 21:
                return AnonymousClass000.A00(4004);
            case 22:
                return "gmail_oauth_confirm_email";
            case 23:
                return "turn_on_sms";
            case 24:
                return "get_started";
            case 25:
                return "not_seller";
            case 26:
                return "promote_merged_media_learn_more";
            case 27:
                return "open_besties_list";
            case 28:
                return "branded_content_learn_more";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return "branded_content_violation_edit";
            case 30:
                return "branded_content_violation_appeal";
            default:
                return "seen";
        }
    }
}
