package X;

import org.webrtc.EglBase14Impl;

/* renamed from: X.RcJ  reason: case insensitive filesystem */
public abstract class C9520RcJ {
    public static String A00(int i) {
        if (i == 6226) {
            return "WP_WWW_ADMIN_SELF_SERVE_USER_DELETION";
        }
        if (i == 9655) {
            return "WP_WWW_ADMIN_FILTER_SECURITY_LOGS";
        }
        if (i == 12667) {
            return "WP_WWW_ADMIN_LOAD_DOMAIN_TABLE";
        }
        switch (i) {
            case 17:
                return "WP_WWW_ADMIN_CONTENT_MODERATOR_ACTION_APPROVE_CONTENT";
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return "WP_WWW_ADMIN_CONTENT_MODERATOR_ACTION_DELETE_CONTENT";
            case 19:
                return "WP_WWW_ADMIN_CONTENT_MODERATOR_ACTION_DEACTIVATE_USER";
            case 20:
                return "WP_WWW_ADMIN_CONTENT_MODERATOR_ACTION_QUARANTINE_CONTENT";
            case 21:
                return "WP_WWW_ADMIN_CONTENT_MODERATOR_ACTION_UNQUARANTINE_CONTENT";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
