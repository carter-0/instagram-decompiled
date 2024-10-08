package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

public final class LNH {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(str, 2);
        SpannableStringBuilder A0C = DbS.A0C(str);
        C48051ESu eSu = new C48051ESu(context, userSession, str3, DbV.A02(context));
        if (str2 == null) {
            return null;
        }
        AnonymousClass7AV.A05(A0C, eSu, str2);
        return A0C;
    }

    public final String A01(Context context, UserSession userSession) {
        String A0h;
        long A01 = 182.A01(0Tu.A05, userSession, 36598137885822061L);
        Long valueOf = Long.valueOf(A01);
        if (A01 == -1) {
            A0h = context.getString(2131962940);
        } else {
            A0h = DbW.A0h(context, valueOf, 2131962938);
        }
        0qQ.A0A(A0h);
        return A0h;
    }
}
