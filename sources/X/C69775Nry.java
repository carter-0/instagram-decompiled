package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Nry  reason: case insensitive filesystem */
public abstract class C69775Nry {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.1pl] */
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        0xG A08;
        String A0g = DbY.A0g(r12);
        List list = r12.A00;
        String A0t = DbU.A0t(list, 1);
        String A0t2 = DbU.A0t(list, 2);
        String A0t3 = DbU.A0t(list, 5);
        if (A0t == null || A0t.length() == 0) {
            A08 = C308206Td.A08(r11);
        } else {
            A08 = DbS.A0O(A0t);
        }
        FragmentActivity A04 = C308206Td.A04(r11);
        if (A04 != null) {
            DbX.A14(A04, AnonymousClass37D.A00);
        }
        if (1pl.A00 == null) {
            1pl.A00 = new Object();
        }
        1pl A00 = O3B.A00();
        FragmentActivity A042 = C308206Td.A04(r11);
        UserSession A0B = C308206Td.A0B(r11);
        C21270XRp xRp = (C21270XRp) EnumHelper.A00(A0g, C21270XRp.A1F);
        0qQ.A07(xRp);
        0qQ.A0B(A042, 0);
        AnonymousClass7TF.A1B(A0B, 1, A08);
        1pl.A00(A042, A08, A0B, xRp, A00, A0t2, A0t3).A04();
        return null;
    }
}
