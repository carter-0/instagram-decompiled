package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class KDJ extends C228042kh {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    public KDJ(UserSession userSession, Context context, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.2jA] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return new C60321JjQ(userSession, new C64586LeU(context, (AnonymousClass07i) null, (AnonymousClass8XO) null, userSession, (2Cn) null, new Object(), (Integer) null, this.A02), new L09(context));
    }
}
