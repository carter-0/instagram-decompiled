package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eh6  reason: case insensitive filesystem */
public abstract class C48597Eh6 {
    public static Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        C276544tV r1 = (C276544tV) r16.A03(0);
        C56057Hs6 A00 = C3018960m.A00().A00();
        FragmentActivity A04 = C308206Td.A04(r15);
        UserSession A0Y = DbT.A0Y(r15);
        C50441Fbo fbo = new C50441Fbo();
        String str = "";
        String A0H = r1.A0H();
        if (A0H != null) {
            str = A0H;
        }
        boolean A0R = r1.A0R(36, false);
        boolean A0R2 = r1.A0R(40, false);
        r1.A03(41, 0);
        A00.A02(A04, AnonymousClass5OB.COMMENT_BUTTON, A0Y, fbo, str, (String) null, (String) null, A0R, A0R2, r1.A0R(35, false), true, false, false);
        return null;
    }
}
