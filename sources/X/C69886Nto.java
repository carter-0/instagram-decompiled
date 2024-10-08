package X;

import java.util.List;

/* renamed from: X.Nto  reason: case insensitive filesystem */
public abstract class C69886Nto {
    public static final ODT A00(String str) {
        Integer num;
        Integer num2;
        0qQ.A0B(str, 0);
        Integer A0l = 00y.A0l(str);
        boolean z = false;
        if (A0l != null) {
            int intValue = A0l.intValue();
            if (intValue > -1) {
                z = true;
            }
            return new ODT((Integer) null, intValue, z);
        }
        List A18 = DbV.A18(str, ":");
        if (A18.size() != 2) {
            return null;
        }
        String A1G = C51966G9m.A1G(A18, 0);
        if (A1G != null) {
            num = 00y.A0l(A1G);
        } else {
            num = null;
        }
        String A1G2 = C51966G9m.A1G(A18, 1);
        if (A1G2 != null) {
            num2 = 00y.A0l(A1G2);
        } else {
            num2 = null;
        }
        if (num == null || num2 == null) {
            return null;
        }
        if (num.intValue() > -1 || num2.intValue() > -1) {
            z = true;
        }
        return new ODT(num, num2.intValue(), z);
    }
}
