package X;

import java.util.List;

public abstract class Q3Z {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        List list = r5.A00;
        Object obj = list.get(0);
        DbS.A1Y(obj);
        String str = (String) obj;
        Object obj2 = list.get(1);
        C307786Rm r1 = r4.A03;
        if (r1 != null) {
            AnonymousClass6RV A03 = C307476Qg.A03(r1, "gs");
            if (A03 == null || !(A03 instanceof AnonymousClass6RU)) {
                1Kn.A02("BKBloksActionBloksWriteGlobalConsistencyStoreImpl", "Global State Module not found");
                return null;
            }
            ((AnonymousClass6RU) A03).A00.A01(str, obj2);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
