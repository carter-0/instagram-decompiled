package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class FFO {
    public static final AnonymousClass3GP A00(Context context, UserSession userSession, String str, String str2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        String str3 = str;
        if (str != null) {
            C49919FEu.A00(new QP5(str3, str2, "feature_blocking", (String) null, 13), userSession2, "feature_block", "", (String) null, "feature_unavailable");
        }
        C310336ap A0a = DbS.A0a();
        DbS.A19(context, A0a, 2131969366);
        A0a.A0I = context.getString(2131969367);
        A0a.A05();
        A0a.A0H = "permissions_feature_unavailable_error";
        return new AnonymousClass3GP(A0a.A00());
    }

    public static final void A03(AnonymousClass3GP r1) {
        0qQ.A0B(r1, 0);
        1xC.A01.A00(r1);
    }

    public static final AnonymousClass3GP A01(Context context, String str) {
        String A16 = AnonymousClass7TE.A16(context, 2131974093);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = A16;
        A0a.A05();
        A0a.A0H = str;
        return new AnonymousClass3GP(A0a.A00());
    }

    public static final void A02(Context context, UserSession userSession, String str) {
        AnonymousClass7TG.A1N(context, userSession);
        A03(A00(context, userSession, str, (String) null));
    }
}
