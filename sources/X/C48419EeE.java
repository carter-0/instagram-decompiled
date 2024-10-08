package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;

/* renamed from: X.EeE  reason: case insensitive filesystem */
public abstract class C48419EeE {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        boolean A06;
        boolean z = false;
        AnonymousClass6Tm r7 = r18;
        Object A0V = Dba.A0V(r7, 0);
        String A0i = DbW.A0i(r7, 1);
        Object A03 = r7.A03(2);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.Number");
        long A0R = AnonymousClass7TE.A0R(A03) * 1000;
        C277014uI A0P = DbW.A0P(r7, 3);
        C277014uI A0P2 = DbW.A0P(r7, 4);
        AnonymousClass6Tm A0Q = DbY.A0Q(A0V);
        C307896Rx r11 = r17;
        UserSession A0R2 = DbW.A0R(r11);
        if (A0R2 == null) {
            A06 = false;
        } else {
            A06 = 182.A06(0Tu.A05, A0R2, 36313712264480967L);
        }
        if (!A06) {
            C299275ur.A00(r11, A0Q, A0P2);
            return null;
        }
        FragmentActivity A04 = C308206Td.A04(r11);
        if (A0i == null || A0i.length() == 0) {
            z = true;
        }
        if (F78.A01(A0R, !z)) {
            0qQ.A0B(A0R2, 1);
            FCN.A02(A04, A0R2, true);
            return null;
        }
        Calendar instance = Calendar.getInstance();
        0qQ.A07(instance);
        instance.setTimeInMillis(A0R);
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        int A032 = DbU.A03(instance);
        0gy A00 = AnonymousClass07i.A00(A04);
        1NY A0L = DbZ.A0L(A0R2);
        A0L.A9m("day", Dbc.A0D(A0L, "age_platform/age_verification/is_eligible/", i, i2, A032));
        A0L.A0Q(C15253UXn.class, C18110Vle.class);
        1OC A0K = DbW.A0K(A0L);
        A0K.A00 = new C15602UfU(A04, r11, A0Q, A0P2, A0P, A0R2, i, i2, A032);
        1ES.A00(A04, A00, A0K);
        return null;
    }
}
