package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Edy  reason: case insensitive filesystem */
public abstract class C48403Edy {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        int i;
        boolean z;
        Context context;
        AnonymousClass6Tm r2 = r18;
        Object A02 = r2.A02();
        String A0p = DbS.A0p(A02);
        String str = (String) A02;
        Object A00 = r2.A00();
        0qQ.A0C(A00, A0p);
        boolean A1W = DbW.A1W(r2, 3);
        C277014uI A0S = DbX.A0S(r2, 4);
        C307896Rx r4 = r17;
        UserSession A0B = C308206Td.A0B(r4);
        C319606qt A01 = C319606qt.A01(A0B);
        0qQ.A07(A01);
        if (0qQ.A0K(A00, "new_to_family_ig_default") || 0qQ.A0K(A00, "new_to_app_ig_default")) {
            i = 2123;
        } else {
            i = 2121;
        }
        String A002 = C273654mx.A00(i);
        if (str.length() == 0 || 00l.A0W(str)) {
            DbS.A1Z(A0B);
            str = A0B.A06;
        }
        0Tu r7 = 0Tu.A05;
        if (1AW.A06(r7, 18308981726391412L)) {
            z = null;
        } else {
            z = false;
        }
        0xG A0O = DbS.A0O(A002);
        Integer num = AnonymousClass05K.A0j;
        C307786Rm r5 = r4.A03;
        if (r5 != null) {
            context = r5.A00;
        } else {
            context = null;
        }
        A01.A08(context, A0O, A0B, z, Boolean.valueOf(1AW.A06(r7, 18308981726391412L)), num, str, A1W);
        if (A0S != null) {
            DbS.A1Q(r4, A0S);
        }
        return null;
    }
}
