package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.V9u  reason: case insensitive filesystem */
public abstract class C16891V9u {
    public static Object A00(C307896Rx r22, AnonymousClass6Tm r23) {
        AnonymousClass6Tm r5 = r23;
        List list = r5.A00;
        C276544tV r0 = (C276544tV) list.get(7);
        if (r0 == null) {
            1Kn.A02(AnonymousClass000.A00(2320), "openProductDetailsPageExtras is null");
            return null;
        }
        C307896Rx r7 = r22;
        Q0A.A01(C299275ur.A00(r7, AnonymousClass6Tm.A01, r0.A09()));
        String A0t = DbU.A0t(list, 3);
        String A0t2 = DbU.A0t(list, 5);
        String A0t3 = DbU.A0t(list, 6);
        FragmentActivity A04 = C308206Td.A04(r7);
        AnonymousClass0iw A08 = C308206Td.A08(r7);
        String A0K = r0.A0K(45);
        String A0J = r0.A0J();
        C18135VmB.A01(A04, A08, r7, (C276544tV) r5.A00(), C308206Td.A0B(r7), C13988Tno.A0S(r0, 59), C13988Tno.A0S(r0, 57), Long.valueOf(r0.A04(46, 0)), A0t, A0K, A0t2, A0t3, A0J, r0.A0K(44), r0.A0G(), r0.A0K(50), r0.A0K(48), r0.A0K(56), r0.A0K(58));
        return null;
    }
}
