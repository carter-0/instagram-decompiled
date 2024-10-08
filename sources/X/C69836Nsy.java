package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Nsy  reason: case insensitive filesystem */
public abstract class C69836Nsy {
    public static final void A00(0wc r2, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        C51974G9v.A1K(r2, str, str3);
        0qQ.A0B(str4, 4);
        if (directShareTarget == null) {
            str8 = "aiTarget is nil,";
        } else if (((PendingRecipient) 00k.A0I(DbW.A0m(directShareTarget))).A0B == null) {
            str8 = "aiTarget userId is nil,";
        } else {
            str8 = "";
        }
        String A0g = 002.A0g(str8, " agentId is ", str5);
        0Aj A0e = AnonymousClass7TE.A0e(r2, "ig_meta_ai_bottomsheet_load_error");
        if (A0e.isSampled()) {
            A0e.AAJ("entrypoint", str2);
            C51965G9l.A1K(A0e, str);
            A0e.AAJ("search_session_id", str6);
            A0e.AAJ("query_text", str7);
            A0e.AAJ(AnonymousClass000.A00(4033), str3);
            A0e.AAJ("name_of_class", str4);
            A0e.AAJ("addtional_debug_info", A0g);
            A0e.Cgf();
        }
    }
}
