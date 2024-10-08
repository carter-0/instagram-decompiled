package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class VAD {
    public static final void A00(C61071Jw9 jw9, C14873UDb uDb, UserSession userSession) {
        String str;
        C18662VwK A00 = VA1.A00(userSession);
        C252553pI r1 = uDb.A04.A0D;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a <= A1b) {
            boolean z = true;
            while (true) {
                if (A1a >= 0) {
                    List list = (List) jw9.A01;
                    if (A1a < list.size()) {
                        X6N x6n = (X6N) list.get(A1a);
                        if (x6n.BrJ()) {
                            z = false;
                        } else {
                            if (x6n instanceof WOP) {
                                A00.A06("ads_manager_highlights_hub", W3M.A01(((WOP) x6n).A02), "ads_manager");
                            } else if (x6n instanceof WOO) {
                                if (((WOO) x6n).A03 == AnonymousClass05K.A00) {
                                    str = 002.A0O("messaging_ads_multi_suggestion_post_card_", A1a);
                                } else {
                                    str = "messaging_ads_multi_suggestion_post_selector";
                                }
                                A00.A06("promotion_list", str, "direct_inbox_setting_entrypoint");
                            }
                            x6n.Ejb(true);
                        }
                    }
                }
                if (A1a == A1b) {
                    break;
                }
                A1a++;
            }
            if (!z) {
                return;
            }
        }
        if (jw9.A00 == AnonymousClass05K.A01) {
            A00.A06("promotion_list", "messaging_ads_multi_suggestion", "direct_inbox_setting_entrypoint");
        }
    }
}
