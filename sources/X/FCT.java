package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;

public abstract class FCT {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, Integer num, Integer num2) {
        String str;
        String str2;
        0qQ.A0B(userSession, 0);
        switch (num.intValue()) {
            case 1:
                str = "tagged_posts_bloks_settings";
                break;
            case 2:
                str = "edit_tag_profile";
                break;
            case 3:
                str = AnonymousClass000.A00(1682);
                break;
            case 4:
                str = "tagged_posts_native_settings";
                break;
            case 5:
                str = "your_activity_tags_menu";
                break;
            default:
                str = "pending_tags_notifications";
                break;
        }
        switch (num2.intValue()) {
            case 0:
                str2 = "enter_tagged_posts_screen";
                break;
            case 1:
                str2 = "enter_pending_tags_screen";
                break;
            case 2:
                str2 = "enter_spam_tags_screen";
                break;
            case 3:
                str2 = "manually_approve_tags_toggled_on";
                break;
            default:
                str2 = "manually_approve_tags_toggled_off";
                break;
        }
        A01(r3, userSession, str, str2, (String) null);
    }

    public static final void A01(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(r1, userSession, 2), AnonymousClass000.A00(1428));
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, str2);
            A0e.AAJ("entrypoint", str);
            A0e.AAJ(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str3);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1O(str2, userSession);
        A01((AnonymousClass0iw) null, userSession, str, str2, (String) null);
    }
}
