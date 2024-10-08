package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elm  reason: case insensitive filesystem */
public abstract class C48886Elm {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession) {
        String A16 = AnonymousClass7TE.A16(context, 2131960460);
        SpannableStringBuilder A0D = DbY.A0D(context, A16, 2131960538);
        AnonymousClass7AV.A04(A0D, new C48053ESw(context, userSession, DbV.A02(context), 12), A16);
        return A0D;
    }
}
