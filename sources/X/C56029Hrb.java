package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.Hrb  reason: case insensitive filesystem */
public final class C56029Hrb {
    public final 0wc A00;
    public final String A01;

    public C56029Hrb(AnonymousClass0iw r2, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A01 = str;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(Integer num) {
        String A002;
        HashMap A0n = C51975G9x.A0n("nav_chain", DbS.A0k(), AnonymousClass7TE.A1L("se_event_type", "impression"), AnonymousClass7TE.A1L("se_product", "Limits"));
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_wellbeing_limited_interactions_impression");
        switch (num.intValue()) {
            case 0:
                A002 = AnonymousClass000.A00(691);
                break;
            case 1:
                A002 = "limited_comments_tooltip";
                break;
            case 2:
                A002 = "reminder";
                break;
            default:
                A002 = "igbc_limited_comments";
                break;
        }
        DbS.A1M(A0e, A002);
        C51969G9p.A1F(A0e, MYP.A00(), this.A01, A0n);
        A0e.AAJ("entrypoint", (String) null);
        A0e.Cgf();
    }

    public final void A01(Integer num, Integer num2, Set set) {
        String str;
        String str2;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, AnonymousClass000.A00(3383));
        switch (num.intValue()) {
            case 0:
                str = "approve_comments_action";
                break;
            case 1:
                str = "approve_comments_cancel";
                break;
            case 2:
                str = "delete_comments_action";
                break;
            default:
                str = "delete_comments_cancel";
                break;
        }
        DbS.A1H(A0e, str);
        G9w.A1C(A0e, this.A01);
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "limited_comments_tooltip";
                    break;
                case 2:
                    str2 = "reminder";
                    break;
                case 3:
                    str2 = "igbc_limited_comments";
                    break;
                case 4:
                    str2 = "what_to_limit_sheet";
                    break;
                case 5:
                    str2 = "who_to_limit_sheet";
                    break;
                case 6:
                    str2 = "set_duration_sheet";
                    break;
                case 7:
                    str2 = C66579MXk.A00(155);
                    break;
                case 8:
                    str2 = "main_setting";
                    break;
                default:
                    str2 = AnonymousClass000.A00(691);
                    break;
            }
        } else {
            str2 = null;
        }
        DbS.A1M(A0e, str2);
        A0e.AAJ(AnonymousClass000.A00(3943), DbT.A0z(",", set, C59047J4g.A00));
        A0e.Cgf();
    }
}
