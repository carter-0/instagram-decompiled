package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.OUc  reason: case insensitive filesystem */
public final class C70979OUc {
    public static final C70979OUc A00 = new Object();

    public final void A00(Activity activity, UserSession userSession, AnonymousClass2Ep r26, String str, String str2, boolean z) {
        String str3;
        Map A0w;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C72202OyR A002 = C69869NtX.A00(userSession2);
        String str9 = userSession2.A06;
        AnonymousClass2Ep r11 = r26;
        int AdN = r11.AdN();
        AnonymousClass3S9 r4 = ((AnonymousClass3U9) r11).A01;
        boolean A06 = C329997La.A06(r4.A0s, str9, AdN);
        boolean A05 = C329997La.A05(r4.A0s, str9, r11.AdN());
        Activity activity2 = activity;
        String str10 = str;
        String str11 = str2;
        if (!AnonymousClass7TE.A0q(userSession2).getBoolean("broadcast_channel_challenges_member_nux", false)) {
            DbX.A1V(AnonymousClass7TE.A0q(userSession2), "broadcast_channel_challenges_member_nux", true);
            NJH A003 = OPE.A00(userSession2, (C69309NjA) null, new P1I(activity2, userSession2, A002, r11, str10, str11, A06, A05), (Integer) null, (String) null, (String) null, false);
            C331127Pr A0e = DbX.A0e(userSession2, false);
            A0e.A0t = true;
            A0e.A0y = false;
            DbU.A0y(activity2, A003, A0e);
            return;
        }
        OQ2.A01(activity2, OQ2.A00(userSession2, r11, DirectPromptTypes.CHALLENGES, (Integer) null, str10, str11, false), userSession2, 4929);
        String C6C = r11.C6C();
        String C6k = r11.C6k();
        Integer valueOf = Integer.valueOf(r11.AdN());
        if (z) {
            if (A06) {
                str8 = "MODERATOR";
            } else if (A05) {
                str8 = "COLLABORATOR";
            } else {
                str8 = "VIEWER";
            }
            A0w = AnonymousClass7TF.A0w("user_type", str8);
            str4 = "challenge_submissions_creation_camera_rendered";
            str5 = "tap";
            str6 = "enter_to_win_button";
            str7 = "thread_view";
        } else {
            if (A06) {
                str3 = "MODERATOR";
            } else if (A05) {
                str3 = "COLLABORATOR";
            } else {
                str3 = "VIEWER";
            }
            A0w = AnonymousClass7TF.A0w("user_type", str3);
            str4 = "challenge_submissions_creation_camera_rendered";
            str5 = "tap";
            str6 = "enter_to_win_button";
            str7 = "challenge_submissions_sheet";
        }
        C72202OyR.A03((C69493Nmb) null, A002, valueOf, C6C, C6k, str4, str5, str6, str7, A0w);
    }
}
