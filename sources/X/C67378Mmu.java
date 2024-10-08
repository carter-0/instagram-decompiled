package X;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mmu  reason: case insensitive filesystem */
public abstract class C67378Mmu {
    public static final List A01(String str, 0sP r4) {
        if (str == null) {
            return 0sn.A00;
        }
        16F A03 = AnonymousClass15o.A00.A03(str);
        ArrayList A15 = DbV.A15(A03);
        if (A03.A1J() != 16L.A0C) {
            return A15;
        }
        while (A03.A1J() != 16L.A08) {
            Object invoke = r4.invoke(A03);
            if (invoke != null) {
                A15.add(invoke);
            }
        }
        return A15;
    }

    public static final String A00(List list, 0sL r5) {
        StringWriter A0v = JTO.A0v();
        17W A0A = AnonymousClass15o.A00.A0A(A0v);
        A0A.A0b();
        for (Object invoke : list) {
            r5.invoke(A0A, invoke);
        }
        A0A.A0Y();
        A0A.close();
        return DbT.A10(A0v);
    }
}
