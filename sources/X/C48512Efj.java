package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.Efj  reason: case insensitive filesystem */
public abstract class C48512Efj {
    public static final Object A00(AnonymousClass6Tm r7) {
        int A05 = DbZ.A05(r7);
        Object A0p = DbT.A0p(r7, 1);
        Object A00 = r7.A00();
        0qQ.A0C(A00, C66579MXk.A00(5));
        List list = (List) A00;
        UserSession A0A = C308206Td.A0A((C307786Rm) Dba.A0V(r7, 3));
        DbS.A1Z(A0A);
        F2Q A002 = C48882Eli.A00(A0A);
        Integer num = AnonymousClass05K.A00(3)[A05];
        0qQ.A0B(list, 1);
        0qQ.A0B(num, 2);
        if (A0p == null) {
            return null;
        }
        HashMap hashMap = A002.A02;
        Runnable runnable = (Runnable) hashMap.get(A0p);
        hashMap.clear();
        int intValue = num.intValue();
        if (intValue == 2) {
            F32 f32 = A002.A01;
            for (Object next : list) {
                1Av r1 = f32.A00;
                0qQ.A0B(next, 0);
                0xa r3 = r1.A01;
                Set A0j = 00k.A0j(r3.C1t("minor_education_acknowledged_users"));
                A0j.add(next);
                0xY AR4 = r3.AR4();
                AR4.E5h("minor_education_acknowledged_users", A0j);
                AR4.apply();
            }
        } else if (!(intValue == 1 || intValue == 0)) {
            throw AnonymousClass7TE.A1K();
        }
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
