package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.OyR  reason: case insensitive filesystem */
public final class C72202OyR implements AnonymousClass0lh {
    public final long A00;
    public final 0wc A01;
    public final String A02 = AnonymousClass7TG.A0j();
    public final UserSession A03;

    public static final String A00(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -76391525:
                    str2 = "challenge_winner";
                    break;
                case -41826452:
                    str2 = "challenge_winner_cta";
                    break;
                case 1307151563:
                    if (str.equals("challenge_submissions")) {
                        return "challenge_submissions_sheet";
                    }
                    break;
            }
            if (str.equals(str2)) {
                return "challenge_winners_chosen_sheet";
            }
        }
        return "thread_view";
    }

    public static final String A01(String str, boolean z) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -76391525:
                    str2 = "challenge_winner";
                    break;
                case -41826452:
                    str2 = "challenge_winner_cta";
                    break;
                case 319260840:
                    if (str.equals("challenge_submission")) {
                        return C273654mx.A00(3321);
                    }
                    break;
            }
            if (str.equals(str2)) {
                if (z) {
                    return "share_winners";
                }
                return "share_winning_submission";
            }
        }
        return "share_challenge";
    }

    public static final LinkedHashMap A02(String str, String str2, String str3, String str4) {
        LinkedHashMap A07 = 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L("user_type", str2), AnonymousClass7TE.A1L("share_reason", str4), AnonymousClass7TE.A1L("challenge_id", str)});
        if (str3 != null) {
            A07.put("challenge_status", str3);
        }
        return A07;
    }

    public static final void A03(C69493Nmb nmb, C72202OyR oyR, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        1Ln A0E = 1Ln.A0E(oyR.A01);
        if (DbT.A1Y(A0E)) {
            C66584MXp.A10(A0E, str3, str4, oyR.A00);
            A0E.A0p(str5);
            A0E.A0q(str6);
            A0E.A0i(C66583MXo.A0e(A0E, C313746gw.A01(num), str, str2));
            A0E.A0v(oyR.A02);
            A0E.A0M(nmb, "entrypoint");
            A0E.A0w(map);
            A0E.Cgf();
        }
    }

    public final void A04(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        1Ln A0E = 1Ln.A0E(this.A01);
        if (DbT.A1Y(A0E)) {
            String A012 = A01(str6, z);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            A1H.put("share_type", A012);
            if (str5 != null) {
                A1H.put("challenge_id", str5);
            }
            if (str7 != null) {
                A1H.put("user_type", str7);
            }
            A0E.A0h(Long.valueOf(this.A00));
            DbV.A1M(A0E, "story_viewer_rendered");
            A0E.A0p("share_to_story_message_button");
            A0E.A0q(A00(str6));
            A0E.A0i(C66583MXo.A0e(A0E, C313746gw.A01(num), str, str2));
            A0E.A0R("item_id", str3);
            A0E.A0R("client_context_id", str4);
            A0E.A0v(this.A02);
            A0E.A0w(A1H);
            A0E.Cgf();
        }
    }

    public final void A05(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C69493Nmb nmb;
        1Ln A0E = 1Ln.A0E(this.A01);
        if (DbT.A1Y(A0E)) {
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            A1H.put("share_type", A01(str6, z));
            if (str3 != null) {
                A1H.put("challenge_id", str3);
            }
            if (str7 != null) {
                A1H.put("user_type", str7);
            }
            A0E.A0h(Long.valueOf(this.A00));
            DbV.A1M(A0E, "publish_story_with_message");
            A0E.A0p("create_button");
            A0E.A0q("story");
            A0E.A0i(C66583MXo.A0e(A0E, C313746gw.A01(num), str, str2));
            A0E.A0R("item_id", str4);
            A0E.A0R("client_context_id", str5);
            if (0qQ.A0K(str6, "challenge_winner_cta")) {
                nmb = C69493Nmb.WINNER_CHOSEN_CTA_BUTTON;
            } else {
                nmb = C69493Nmb.CHALLENGE_SHARE_SHEET;
            }
            A0E.A0M(nmb, "entrypoint");
            A0E.A0v(this.A02);
            A0E.A0w(A1H);
            A0E.Cgf();
        }
    }

    public final void onSessionWillEnd() {
        this.A03.A03(C72202OyR.class);
    }

    public C72202OyR(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = JTS.A06(AnonymousClass7TE.A10(userSession.A06));
        this.A01 = C66580MXl.A0N(new AnonymousClass0kM(userSession), "creator_broadcast_chat");
    }
}
