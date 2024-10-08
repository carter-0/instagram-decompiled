package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class L69 {
    public AnonymousClass2t9 A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    public L69(Context context, AnonymousClass0iw r6, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r6;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C61652KGc(this.A01, this.A02));
        this.A00 = DbU.A0U(A002, new Object());
    }
}
