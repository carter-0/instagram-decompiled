package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hnp  reason: case insensitive filesystem */
public final class C55809Hnp {
    public final 2el A00;
    public final C54333H8f A01;
    public final C56527Hzy A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    public C55809Hnp(Context context, AnonymousClass4DJ r4, UserSession userSession, 2el r6, AnonymousClass4DU r7, String str, 0sP r9) {
        DbW.A1O(userSession, 1, r6);
        this.A03 = userSession;
        this.A04 = r7;
        this.A00 = r6;
        C54333H8f h8f = new C54333H8f(userSession, r7, r9);
        this.A01 = h8f;
        this.A02 = new C56527Hzy(context, userSession, r7, str);
        r4.registerLifecycleListener(new H5F(h8f));
    }
}
