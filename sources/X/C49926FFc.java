package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.FFc  reason: case insensitive filesystem */
public abstract class C49926FFc {
    public static final void A02(FragmentActivity fragmentActivity, AnonymousClass4DH r9, UserSession userSession, User user, boolean z) {
        HashMap A1E;
        0Aj A04;
        String str;
        AnonymousClass7TG.A1Q(userSession, user);
        1Av A00 = 1Au.A00(userSession);
        0wc A01 = AnonymousClass0kN.A01(r9, userSession);
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        if (DbV.A1Z(user, A0Q.getId()) || A0Q.A0N() != AnonymousClass05K.A0C || user.A2A()) {
            if (user.CPV()) {
                C358248ab A0X = DbS.A0X(fragmentActivity);
                A0X.A09(2131974992);
                DbY.A0w(fragmentActivity, A0X, user.getUsername(), 2131974990);
                A0X.A06();
                A0X.A0G(C50025FJk.A00(fragmentActivity, userSession, 64), 2131973388);
                DbT.A1V(A0X);
                String str2 = userSession.A06;
                A1E = AnonymousClass7TE.A1E();
                A04 = Dbc.A04(A01, str2, A1E);
                DbS.A1J(A04, "impression");
                str = "cant_tag_alert_blocked";
            } else {
                0xa r6 = A00.A01;
                if (r6.getInt("cannot_tag_error_nux_shown_count", 0) < 1) {
                    C358248ab A0X2 = DbS.A0X(fragmentActivity);
                    A0X2.A09(2131974992);
                    DbY.A0w(fragmentActivity, A0X2, user.getUsername(), 2131974991);
                    A0X2.A06();
                    A0X2.A0G(new C50026FJl(37, (Object) fragmentActivity, (Object) userSession, (Object) A01), 2131973389);
                    DbT.A1V(A0X2);
                    AnonymousClass7TG.A1M(r6, "cannot_tag_error_nux_shown_count", r6.getInt("cannot_tag_error_nux_shown_count", 0) + 1);
                    String str3 = userSession.A06;
                    A1E = AnonymousClass7TE.A1E();
                    A04 = Dbc.A04(A01, str3, A1E);
                    DbS.A1J(A04, "impression");
                    str = "cant_tag_alert_nux";
                } else {
                    C358248ab A0X3 = DbS.A0X(fragmentActivity);
                    A0X3.A05 = DbY.A0b(fragmentActivity, user, 2131974994);
                    Dba.A1L(A0X3);
                }
            }
            DbS.A1H(A04, str);
            A04.A9H("extra_values", A1E);
            A04.Cgf();
        }
        A03(fragmentActivity, r9, userSession, z);
        String str4 = userSession.A06;
        A1E = AnonymousClass7TE.A1E();
        A04 = Dbc.A04(A01, str4, A1E);
        DbS.A1J(A04, "impression");
        str = "cant_tag_alert";
        DbS.A1H(A04, str);
        A04.A9H("extra_values", A1E);
        A04.Cgf();
    }

    public static final void A03(FragmentActivity fragmentActivity, AnonymousClass4DH r4, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 2);
        int i = 2131969761;
        int i2 = 2131969762;
        if (z) {
            i = 2131969763;
            i2 = 2131969764;
        }
        C358248ab A0X = DbS.A0X(fragmentActivity);
        A0X.A09(i);
        DbU.A17(fragmentActivity, A0X, i2);
        A0X.A06();
        A0X.A0G(C50025FJk.A00(r4, userSession, 63), 2131974993);
        DbT.A1V(A0X);
    }

    public static final void A00(Activity activity) {
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(2131965889);
        DbY.A0w(activity, A0X, 20, 2131965888);
        Dba.A1L(A0X);
    }

    public static final void A01(Activity activity, int i) {
        C358248ab A0X = DbS.A0X(activity);
        A0X.A09(2131965883);
        DbY.A0w(activity, A0X, Integer.valueOf(i), 2131965882);
        Dba.A1L(A0X);
    }
}
