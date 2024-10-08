package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2vn  reason: invalid class name and case insensitive filesystem */
public abstract class C233482vn {
    public static C233492vo A00(C67241sS r20, Boolean bool, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, List list) {
        ArrayList arrayList;
        C250533lb r4 = null;
        List<DST> list2 = list;
        if (list != null) {
            arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (DST FGb : list2) {
                arrayList.add(FGb.FGb());
            }
        } else {
            arrayList = null;
        }
        if (r20 != null) {
            r4 = r20.F8M();
        }
        return new C233492vo(r4, bool, f, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, arrayList);
    }
}
