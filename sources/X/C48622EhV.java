package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EhV  reason: case insensitive filesystem */
public abstract class C48622EhV {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        AnonymousClass9BP r1;
        String A0g = DbY.A0g(r9);
        UserSession A0Z = DbT.A0Z(r8);
        FragmentActivity A04 = C308206Td.A04(r8);
        AnonymousClass9BP[] values = AnonymousClass9BP.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = AnonymousClass9BP.UNKNOWN;
                break;
            }
            r1 = values[i];
            if (A0g.equalsIgnoreCase(r1.name())) {
                break;
            }
            i++;
        }
        C49138Eq1.A00(A04, r1, DbS.A0O(AnonymousClass000.A00(1428)), A0Z);
        return null;
    }
}
