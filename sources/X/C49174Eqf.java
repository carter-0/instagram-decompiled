package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eqf  reason: case insensitive filesystem */
public abstract class C49174Eqf {
    public static final void A00(Activity activity, Context context, Fragment fragment, AnonymousClass0iw r12, UserSession userSession, G81 g81, User user) {
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1U(activity, userSession, r12);
        C50024FJj fJj = new C50024FJj(15, (Object) activity, (Object) userSession, (Object) g81, (Object) user);
        C50021FJg A00 = C50021FJg.A00(g81, 42);
        String A16 = AnonymousClass7TE.A16(context, 2131972021);
        SpannableStringBuilder A0C = DbS.A0C(DbY.A0b(context, user, 2131972020));
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0l(fragment, userSession);
        A0Y.A05 = A16;
        A0Y.A0q(A0C);
        A0Y.A0n(user.Bh3(), r12);
        A0Y.A0I(fJj, 2131972017);
        DbX.A16(A00, A0Y);
    }
}
