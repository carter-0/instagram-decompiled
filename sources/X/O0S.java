package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class O0S {
    public static CharSequence A00(Context context, UserSession userSession, AnonymousClass7LQ r9) {
        int i;
        int A1Z = AnonymousClass7TG.A1Z(userSession, context);
        C254703su r4 = r9.A0e;
        0qQ.A07(r4);
        if (!r4.A2F) {
            return "";
        }
        String str = r4.A1b;
        if (str == null || r4.A1Z == null) {
            String str2 = r4.A1V;
            if (r4.A1R() && str2 != null) {
                return str2;
            }
            Integer num = r4.A1E;
            if (num != null && num.intValue() >= A1Z) {
                String A0f = r4.A0f();
                Integer num2 = r4.A1E;
                long A04 = (long) DbS.A04(0Tu.A05, userSession, 36596119249226056L);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "mwb_igd_highly_forwarded_message");
                if (A0e.isSampled()) {
                    A0e.AAJ("mid", A0f);
                    A0e.A9F("limit", Long.valueOf(A04));
                    A0e.A9F("forward_depth", DbZ.A0c(num2));
                    A0e.Cgf();
                }
            }
            if (r4.A2S && 182.A06(0Tu.A06, userSession, 36314644272646895L)) {
                String A0f2 = r4.A0f();
                Integer num3 = r4.A1E;
                long A042 = (long) DbS.A04(0Tu.A05, userSession, 36596119249226056L);
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "mwb_igd_highly_forwarded_indicator_shown");
                if (A0e2.isSampled()) {
                    A0e2.AAJ("mid", A0f2);
                    A0e2.A9F("limit", Long.valueOf(A042));
                    A0e2.A9F("forward_depth", DbZ.A0c(num3));
                    A0e2.Cgf();
                }
                i = 2131959441;
            } else if (r4.A1j(AnonymousClass7TF.A0Q(userSession))) {
                i = 2131959299;
            } else {
                User user = r9.A0K;
                AnonymousClass7SD r1 = r9.A0G;
                if (!r1.A0r || user == null) {
                    i = 2131959297;
                } else {
                    C376629Is r3 = (C376629Is) r1.A0f.get(user.getId());
                    String A08 = AnonymousClass50n.A08(user);
                    0qQ.A07(A08);
                    if (r3 == null) {
                        return DbY.A0c(context, A08, 2131959298);
                    }
                    SpannableStringBuilder A0C = DbS.A0C(DbY.A0c(context, DbT.A10(DbS.A0C(A08).append(" ").append(r3.A03)), 2131959298));
                    C66866Me1.A00(context, A0C, r3, A08.length() + 1);
                    return A0C;
                }
            }
            return C51967G9n.A0p(context, i);
        }
        SpannableStringBuilder A0C2 = DbS.A0C(DbY.A0c(context, str, 2131959296));
        AnonymousClass7AV.A04(A0C2, new RBU(DbV.A02(context), A1Z), str);
        return A0C2;
    }
}
