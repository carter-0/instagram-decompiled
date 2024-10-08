package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Mlo  reason: case insensitive filesystem */
public abstract class C67314Mlo {
    public static C66716MbN A00(UserSession userSession, 2EM r10, AnonymousClass7BV r11, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, List list, long j) {
        String str7;
        String str8;
        String str9;
        1NY A0O = DbU.A0O(userSession);
        A0O.A0R(B72.class, B73.class);
        int i = r10.A00;
        Integer num4 = r10.A03;
        if (i == 2) {
            A0O.A0K("direct_v2/%s/", new Object[]{"top_threads/inbox"});
        } else {
            switch (num4.intValue()) {
                case 0:
                    str7 = "inbox";
                    break;
                case 1:
                    str7 = "pending_inbox";
                    break;
                case 2:
                    str7 = "top_threads/inbox";
                    break;
                case 3:
                    str7 = "spam_inbox";
                    break;
                case 4:
                    str7 = C273654mx.A00(124);
                    break;
                default:
                    str7 = "locked_inbox";
                    break;
            }
            A0O.A0K("direct_v2/%s/", new Object[]{str7});
            if (!(num4 != AnonymousClass05K.A00 || i == -1 || i == 1000)) {
                A0O.A9m("folder", Long.toString((long) i));
                if (i == 7) {
                    A0O.A9m("custom_folder_id", ((2Ej) r10).A00);
                }
            }
        }
        if (2El.A03(userSession) || 2El.A0I(userSession)) {
            if (num4 == AnonymousClass05K.A00) {
                HashSet A1F = AnonymousClass7TE.A1F();
                AnonymousClass7TF.A1M(A1F, IgNetworkConsentStorage.MAX_ENTRIES);
                AnonymousClass7TF.A1M(A1F, -1);
                if (182.A06(DbS.A0J(userSession, 0), userSession, 36328375283629362L)) {
                    AnonymousClass7TF.A1M(A1F, 1);
                }
                if (A1F.contains(Integer.valueOf(i))) {
                    A0O.A0C(DatePickerDialogModule.ARG_MODE, 2);
                }
            }
            if (num4 == AnonymousClass05K.A01 && 182.A06(DbS.A0J(userSession, 0), userSession, 36328375283629362L)) {
                A0O.A9m("is_inbox_ia_enabled", "true");
            }
        }
        String str10 = str;
        if (str != null && num != null) {
            A0O.A9m("cursor", str10);
            if (1 - num.intValue() != 0) {
                str9 = "newer";
            } else {
                str9 = "older";
            }
            A0O.A9m("direction", str9);
        } else if (Boolean.FALSE.equals(Boolean.valueOf(AnonymousClass0oH.A01(C60960kU.A00)))) {
            A0O.A9m("push_disabled", "true");
        }
        A0O.A9m("persistentBadging", "true");
        if (j != -1) {
            A0O.A9m("seq_id", Long.toString(j));
        }
        A0O.A0G("request_session_id", str2);
        if (num2 != null) {
            A0O.A9m("limit", Long.toString((long) num2.intValue()));
        }
        if (num3 != null) {
            A0O.A9m("thread_message_limit", Long.toString((long) num3.intValue()));
        }
        A0O.A0G("selected_filter", str3);
        A0O.A0G("sort_order", str4);
        A0O.A0G("fetch_reason", str5);
        A0O.A0E("is_prefetching", bool);
        A0O.A9m("no_pending_badge", "true");
        List list2 = list;
        if (list == null || list2.isEmpty()) {
            str8 = null;
        } else {
            str8 = 002.A0g("[", C239023El.A00(',').A02(list2), "]");
        }
        A0O.A0G("message_request_selected_filters", str8);
        A0O.A9m("visual_message_return_type", "unseen");
        A0O.A0G("eb_device_id", AnonymousClass65B.A03.A02(userSession));
        String str11 = str6;
        A0O.A0G("igd_request_log_tracking_id", str11);
        return new C66716MbN(new C67315Mlp(userSession, r11, str11), A0O.A0M());
    }
}
