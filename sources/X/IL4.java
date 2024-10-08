package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IL4 implements JR4 {
    public final 0wc A00;
    public final UserSession A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AnonymousClass0iw A08;
    public final C57280IVp A09;

    public final void Ck7(String str) {
        long j;
        Long A10;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_response");
        if (A0e.isSampled()) {
            String str2 = this.A04;
            if (str2 == null || (A10 = AnonymousClass7TE.A10(str2)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A01(A0e, this, j);
            String str3 = this.A05;
            if (str3 == null) {
                str3 = "";
            }
            A03(A0e, this, str3);
            A0e.AAJ("question_id", "interests");
            A02(A0e, this, A00(A0e, this, "answer_id", str));
            A0e.Cgf();
        }
    }

    public final void Cl2(String str) {
        long j;
        Long A10;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_undo");
        if (A0e.isSampled()) {
            String str2 = this.A04;
            if (str2 == null || (A10 = AnonymousClass7TE.A10(str2)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A01(A0e, this, j);
            String str3 = this.A05;
            if (str3 == null) {
                str3 = "";
            }
            A03(A0e, this, str3);
            A0e.AAJ("question_id", "interests");
            A02(A0e, this, A00(A0e, this, "answer_id", str));
            A0e.Cgf();
        }
    }

    public static void A03(0Aj r3, IL4 il4, String str) {
        r3.AAJ("ad_tracking_token", str);
        r3.A9H("extra_data", 0se.A0M(new 0eP("ads_category", il4.A03)));
        r3.AAJ("trigger_source", "ad_dwell");
    }

    public static void A04(0bb r3, JSM jsm, String str) {
        HOT hot;
        String str2;
        r3.A06("source", str);
        String CDk = jsm.CDk();
        if (0qQ.A0K(CDk, "v1")) {
            hot = HOT.V1;
        } else if (0qQ.A0K(CDk, "v2")) {
            hot = HOT.V2;
        } else {
            hot = HOT.UNKNOWN;
        }
        r3.A01(hot, "version");
        String emoji = jsm.getEmoji();
        if (emoji == null || emoji.length() == 0) {
            str2 = "";
        } else {
            str2 = C70572Rz.A00().Cmk(-1, emoji).toString();
        }
        r3.A06("emoji", str2);
    }

    public final String AaG() {
        return this.A06;
    }

    public final void Chi() {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_dismiss");
        if (A0e.isSampled()) {
            String str = this.A04;
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A01(A0e, this, j);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0e, this, str2);
            A02(A0e, this, A00(A0e, this, "question_id", "interests"));
            A0e.Cgf();
        }
    }

    public final void Cis() {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled()) {
            String str = this.A04;
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A01(A0e, this, j);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0e, this, str2);
            A02(A0e, this, A00(A0e, this, "question_id", "interests"));
            A0e.Cgf();
        }
    }

    public final void Ciu(List list) {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_impression");
        if (A0e.isSampled()) {
            String str = this.A04;
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A01(A0e, this, j);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0e, this, str2);
            A02(A0e, this, A00(A0e, this, "question_id", "interests"));
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                JSM jsm = (JSM) it.next();
                0qQ.A0B(jsm, 0);
                0bb r1 = new 0bb();
                String name = jsm.getName();
                if (name != null) {
                    A04(r1, jsm, C51976G9y.A0K(r1, jsm, name));
                    A0r.add(r1);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0e.AAe("interests", A0r);
            A0e.Cgf();
        }
    }

    public final void Ckv(long j) {
        long j2;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_ads_feedback_interface_timespent");
        if (A0e.isSampled()) {
            String str = this.A04;
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j2 = 0;
            } else {
                j2 = A10.longValue();
            }
            A01(A0e, this, j2);
            String str2 = this.A05;
            if (str2 == null) {
                str2 = "";
            }
            A03(A0e, this, str2);
            A02(A0e, this, A00(A0e, this, "question_id", "interests"));
            C51974G9v.A0m(A0e, j);
        }
    }

    public IL4(AnonymousClass0iw r3, UserSession userSession, C57280IVp iVp, String str) {
        C51974G9v.A1P(userSession, str, r3, iVp);
        this.A01 = userSession;
        this.A07 = str;
        this.A08 = r3;
        this.A09 = iVp;
        this.A00 = C51972G9s.A0a(r3, userSession);
        1Xj r1 = iVp.A01;
        this.A04 = C231122qu.A07(userSession, r1);
        this.A05 = C231122qu.A0F(userSession, r1);
        this.A03 = r1.A2T();
        this.A02 = C231122qu.A05(userSession, r1);
        this.A06 = iVp.getId();
    }

    public static long A00(0Aj r0, IL4 il4, String str, String str2) {
        r0.AAJ(str, str2);
        Integer num = il4.A02;
        if (num != null) {
            return (long) num.intValue();
        }
        return -1;
    }

    public static void A01(0Aj r2, IL4 il4, long j) {
        r2.A9F("ad_id", Long.valueOf(j));
        r2.A9F("ig_userid", Long.valueOf(Long.parseLong(il4.A01.A06)));
        r2.AAJ("afi_id", il4.A06);
        r2.AAJ("afi_type", AFI_TYPE.FEED_INTERESTS_PICKER.A00);
    }

    public static void A02(0Aj r2, IL4 il4, long j) {
        r2.A9F("global_position", Long.valueOf(j));
        r2.AAJ("client_session_id", il4.A07);
    }
}
