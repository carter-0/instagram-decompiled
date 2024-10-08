package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

/* renamed from: X.F6t  reason: case insensitive filesystem */
public abstract class C49785F6t {
    public static final SpannableStringBuilder A00(Context context, 0sP r6, int i, int i2) {
        String A16 = AnonymousClass7TE.A16(context, i2);
        SpannableStringBuilder A0D = DbY.A0D(context, A16, i);
        AnonymousClass7AV.A05(A0D, new ESx(r6, context.getColor(2Yu.A0D(context)), 45), A16);
        return A0D;
    }

    public static final boolean A01(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36320730241114915L);
    }
}
