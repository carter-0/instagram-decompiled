package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.NuL  reason: case insensitive filesystem */
public abstract class C69919NuL {
    public static final void A00(Context context, AnonymousClass0iw r4, UserSession userSession, DirectShareTarget directShareTarget, User user, C70636OEh oEh, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(context, user);
        0qQ.A0B(userSession, 4);
        C310336ap A0a = DbS.A0a();
        A0a.A0B(C310356ar.CIRCULAR);
        A0a.A06();
        A0a.A0L = A1Z;
        A0a.A09 = user.Bh3();
        A0a.A0D = DbY.A0b(context, user, 2131960309);
        DbW.A0q(context, A0a, 2131960699);
        A0a.A0A = new C72735PHp(context, r4, userSession, directShareTarget, oEh, str);
        DbY.A1N(A0a);
    }
}
