package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EkO  reason: case insensitive filesystem */
public abstract class C48800EkO {
    public static final SpannableStringBuilder A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, 2EG r13) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131952564);
        int i = 2131952565;
        if (!AnonymousClass7TF.A0R(0Tu.A05, userSession, 36329367420420166L).booleanValue()) {
            i = 2131952563;
        }
        String A0h = DbW.A0h(fragmentActivity, A16, i);
        0qQ.A0A(A0h);
        SpannableStringBuilder A0C = DbS.A0C(A0h);
        int A02 = DbV.A02(fragmentActivity);
        Context context2 = context;
        AnonymousClass7AV.A03(A0C, new C47563E8b(context2, new 04x(16, A16), userSession2, r13, AnonymousClass05K.A01, A16, A02), A16);
        return A0C;
    }
}
