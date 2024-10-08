package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class L7L {
    public final Context A00;
    public final AnonymousClass2t9 A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public L7L(Context context, UserSession userSession, C63685L2v l2v) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C61639KFp(userSession, l2v));
        this.A01 = DbU.A0U(A002, new Object());
    }
}
