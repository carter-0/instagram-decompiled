package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.MfP  reason: case insensitive filesystem */
public final class C66930MfP implements AnonymousClass0lh {
    public final 0wc A00;
    public final long A01;
    public final UserSession A02;
    public final String A03 = AnonymousClass7TG.A0j();

    public C66930MfP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = JTS.A06(AnonymousClass7TE.A10(userSession.A06));
        this.A00 = C66580MXl.A0N(new AnonymousClass0kM(userSession), "daily_prompts_broadcast_chat");
    }

    public static final void A01(C66930MfP mfP, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        A00((C69493Nmb) null, mfP, str, str2, str3, str4, str5, str6, (String) null, (String) null, (Map) null, i);
    }

    public static final void A02(C66930MfP mfP, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        A00((C69493Nmb) null, mfP, str, str2, str3, str4, str5, str6, (String) null, (String) null, map, i);
    }

    public static final void A00(C69493Nmb nmb, C66930MfP mfP, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i) {
        1Ln A0E = 1Ln.A0E(mfP.A00);
        if (DbT.A1Y(A0E)) {
            C66584MXp.A10(A0E, str3, str4, mfP.A01);
            A0E.A0p(str5);
            A0E.A0i(DbZ.A0b(A0E, str6, str, str2, i));
            A0E.A0v(mfP.A03);
            A0E.A0M(nmb, "entrypoint");
            A0E.A0R("item_id", str7);
            A0E.A0R("client_context_id", str8);
            A0E.A0w(map);
            A0E.Cgf();
        }
    }

    public final void A03(String str, String str2, int i) {
        A01(this, str, str2, "daily_prompt_reply_reminder_dialog_create_new_daily_prompt", "tap", "daily_prompt_button", "daily_prompt_reply_reminder_dialog", i);
    }

    public final void A04(String str, String str2, int i) {
        A01(this, str, str2, "daily_prompt_reply_reminder_dialog_rendered", "tap", "daily_prompt_button", "thread_view", i);
    }

    public final void A05(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        String str8;
        0eP A1L = AnonymousClass7TE.A1L("user_type", str3);
        0eP A1L2 = AnonymousClass7TE.A1L("share_reason", "share_daily_prompt");
        if (AnonymousClass7TF.A1Y(Boolean.valueOf(z), true)) {
            str8 = "ACTIVE";
        } else {
            str8 = "ENDED";
        }
        LinkedHashMap A06 = 0Yt.A06(AnonymousClass7TH.A0h("prompt_id", str4, A1L, A1L2, AnonymousClass7TE.A1L("daily_prompt_status", str8)));
        String str9 = str7;
        String str10 = "thread_view";
        if (!str9.equals("channel_daily_prompt_xma") && str9.equals("channel_daily_prompt_responses")) {
            str10 = "daily_prompt_responses_sheet";
        }
        A00((C69493Nmb) null, this, str, str2, "daily_prompt_share_sheet_rendered", "tap", "share_button", str10, str5, str6, A06, i);
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C66930MfP.class);
    }
}
