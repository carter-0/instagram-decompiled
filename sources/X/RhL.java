package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;

public abstract class RhL {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        List list = r6.A00;
        Object obj = list.get(0);
        String A0t = DbU.A0t(list, 1);
        FragmentActivity A04 = C308206Td.A04(r5);
        if (!(obj == null || A04 == null || A0t == null)) {
            C7433QCy A00 = new 2YN(A04).A00(C7433QCy.class);
            OB9 ob9 = (OB9) A00.A01.get(obj);
            if (ob9 != null) {
                ob9.A01.A0A(SUj.A0A((Object) null, (Throwable) A00.A00.A08(A0t, C8284QnQ.class)));
            }
        }
        return null;
    }
}
