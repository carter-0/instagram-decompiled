package X;

import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.HgY  reason: case insensitive filesystem */
public abstract class C55366HgY {
    public static boolean A00;

    public static final void A00(ComponentActivity componentActivity, UserSession userSession, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9) {
        boolean A1Y = C51970G9q.A1Y(r5);
        C54163H1h h1h = new C54163H1h();
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0T = h1h;
        DbS.A1S(A0W, A1Y);
        C57385IZq.A00(A0W, r6, 11);
        C51975G9x.A0z(componentActivity, A0W);
        C331157Pu A002 = A0W.A00();
        h1h.A00 = (AnonymousClass3Q2) r8.invoke();
        h1h.A01 = (String) r9.invoke();
        h1h.A02 = C58690Ivz.A00(A002, r5, 34);
        r7.invoke();
        A002.A02(componentActivity, h1h);
    }
}
