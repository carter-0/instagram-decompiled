package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EgB  reason: case insensitive filesystem */
public abstract class C48540EgB {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String str;
        Object A01 = r8.A01();
        if (A01 instanceof String) {
            str = (String) A01;
        } else {
            str = null;
        }
        0lg A0B = C308206Td.A0B(r7);
        0lg r0 = null;
        if (A0B instanceof UserSession) {
            r0 = A0B;
        }
        FragmentActivity A04 = C308206Td.A04(r7);
        FragmentActivity A042 = C308206Td.A04(r7);
        if (!(str == null || r0 == null)) {
            C47414E1i A00 = C48733EjI.A00(str);
            C331127Pr A0W = DbS.A0W(r0);
            DbZ.A0z(A042, A0W, 2131953997);
            DbU.A0y(A04, A00, A0W);
        }
        return null;
    }
}
