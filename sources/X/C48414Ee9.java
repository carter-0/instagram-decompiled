package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ee9  reason: case insensitive filesystem */
public abstract class C48414Ee9 {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.0rm, java.lang.Object] */
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        String str;
        EXD A00;
        C276544tV A0M = DbW.A0M(r17, 1);
        UserSession A0R = DbW.A0R(r16);
        FragmentActivity A04 = C308206Td.A04(r16);
        if (A0M != null) {
            str = A0M.A0F();
        } else {
            str = null;
        }
        ? obj = new Object();
        if (str == null) {
            A00 = EXD.A05;
        } else {
            A00 = C49204Er9.A00(str);
        }
        obj.A00 = A00;
        if (A00 == null) {
            A00 = EXD.A05;
            obj.A00 = A00;
        }
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0R), "ig_nux_started");
        DbT.A1P(A0e);
        DbZ.A1G(A0e, A01, A002);
        DbS.A1G(A0e, A00.A00);
        A0e.A7p("from_server", true);
        FH8.A05(A0e);
        DbZ.A1F(A0e, A002);
        FH8.A0C(A0e, A0R);
        C50144FRb.A06(A0R);
        AnonymousClass35B.A00().A04(A04, A0R, new C50633Ffs(A04, A0R, obj), (EXD) obj.A00, false, true);
        return null;
    }
}
