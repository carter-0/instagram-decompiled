package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class F1O {
    public final void A00(C3263576k r8, C69445Nlp nlp, AnonymousClass0iw r10, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C69454Nly nly;
        1Ln r3;
        String str6;
        0wc A01 = AnonymousClass0kN.A01(r10, userSession);
        String A0k = DbS.A0k();
        if (i == 0) {
            nly = C69454Nly.INSTAGRAM;
        } else {
            nly = C69454Nly.FACEBOOK;
        }
        long j = 0;
        if (z) {
            r3 = new 1Ln(AnonymousClass7TE.A0e(A01, "ig_block"), 194);
            if (num == null) {
                str6 = "";
            } else if (num.intValue() == 0) {
                str6 = "single";
            } else {
                str6 = "multi_future";
            }
        } else {
            r3 = new 1Ln(AnonymousClass7TE.A0e(A01, "ig_unblock"), 272);
            str6 = "";
        }
        r3.A0R("action_type", str6);
        r3.A0R("step", str);
        Long A10 = AnonymousClass7TE.A10(str2);
        if (A10 != null) {
            j = A10.longValue();
        }
        r3.A0Q("target_user_id", Long.valueOf(j));
        r3.A0M(nly, "target_user_type");
        r3.A0R(TraceFieldType.RequestID, str3);
        r3.A0R("click_point", str4);
        r3.A0R("direct_thread_id", str5);
        r3.A0M(r8, "direct_source");
        r3.A0M(nlp, "direct_source_type");
        r3.A0u(A0k);
        r3.Cgf();
    }
}
