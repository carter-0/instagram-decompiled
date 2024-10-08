package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EhT  reason: case insensitive filesystem */
public abstract class C48620EhT {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        AnonymousClass3BQ r7;
        String str = (String) r13.A01();
        C2601144i.A00();
        UserSession A0Y = DbT.A0Y(r12);
        FragmentActivity A04 = C308206Td.A04(r12);
        if (((String) r13.A03(1)).equals("live_shopping_netego")) {
            r7 = AnonymousClass3BQ.LIVE_SHOPPING_NETEGO;
        } else {
            r7 = AnonymousClass3BQ.BLOKS;
        }
        0qQ.A0B(A0Y, 0);
        AnonymousClass7TF.A1B(A04, 1, str);
        C239413Gj A01 = C239403Gi.A01(A04, A0Y);
        if (!(A01.A01 == null || A01.A00 == null)) {
            C239413Gj.A05(new C51060Fnq(r7, A01, (String) null, (String) null, (String) null, (String) null, false), A01, AnonymousClass05K.A00, str, false);
        }
        return null;
    }
}
