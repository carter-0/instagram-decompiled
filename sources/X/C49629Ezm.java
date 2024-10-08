package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ezm  reason: case insensitive filesystem */
public final class C49629Ezm {
    public final Activity A00;
    public final UserSession A01;
    public final C273004lm A02;
    public final C314996jB A03;
    public final String A04;

    public C49629Ezm(UserSession userSession, Activity activity, String str) {
        0qQ.A0B(str, 3);
        C314996jB A002 = C314986jA.A00(userSession);
        C273004lm A003 = C272994ll.A00(userSession);
        AnonymousClass7TG.A1R(A002, A003);
        this.A00 = activity;
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = A002;
        this.A02 = A003;
    }
}
