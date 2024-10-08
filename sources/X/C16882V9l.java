package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.V9l  reason: case insensitive filesystem */
public abstract class C16882V9l {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        C276544tV r2;
        Object A03 = r10.A03(0);
        if (A03 instanceof C276544tV) {
            r2 = (C276544tV) A03;
        } else {
            r2 = null;
        }
        C277014uI A00 = C280064zw.A00(r10.A03(1));
        if (r2 != null) {
            FragmentActivity A04 = C308206Td.A04(r9);
            UserSession A0B = C308206Td.A0B(r9);
            Product A01 = C18132Vm8.A01(r2);
            List list = A01.A0O;
            if (list != null) {
                new W27(A04, A0B, true);
                HashMap hashMap = new HashMap();
                if (list.isEmpty()) {
                    throw DbT.A0m();
                } else if (list.isEmpty()) {
                    throw DbT.A0m();
                } else {
                    list.size();
                    hashMap.size();
                    if (A00 != null) {
                        C308276Tl r1 = new C308276Tl();
                        r1.A03(A01.A0H, 0);
                        DbX.A1P(r9, r1, A00, C13989Tnp.A0q(A01), 1);
                        return null;
                    }
                }
            } else if (A00 != null) {
                C308276Tl r12 = new C308276Tl();
                r12.A03(A01.A0H, 0);
                DbX.A1P(r9, r12, A00, C13989Tnp.A0q(A01), 1);
            }
        }
        return null;
    }
}
