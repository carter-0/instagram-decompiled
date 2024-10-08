package X;

import java.util.List;

/* renamed from: X.Ebx  reason: case insensitive filesystem */
public abstract class C48278Ebx {
    public static final List A00(AnonymousClass6Tm r6) {
        String str;
        int min;
        Object A01 = r6.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type java.util.List<kotlin.Any>");
        List list = (List) A01;
        int A04 = DbW.A04(r6.A02(), "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) DbT.A0p(r6, 2);
        if (A04 < 0 || A04 >= list.size()) {
            str = "argument offset is out of bounds";
        } else {
            if (number == null) {
                min = list.size();
            } else if (number.intValue() < 0) {
                str = "argument length cannot be negative";
            } else {
                min = Math.min(number.intValue() + A04, list.size());
            }
            return list.subList(A04, min);
        }
        1Kn.A02("bk.action.array.Slice", str);
        return null;
    }
}
