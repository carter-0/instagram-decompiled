package X;

import java.util.ArrayList;
import java.util.List;

public abstract class JUA {
    public static final ArrayList A00(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() <= 0) {
            return arrayList;
        }
        List<String> A0R = 00l.A0R(str, new String[]{","}, 0);
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0R, 10));
        for (String parseLong : A0R) {
            arrayList2.add(Long.valueOf(Long.parseLong(parseLong)));
        }
        return 00k.A0U(arrayList2);
    }

    public static final void A01(List list, boolean z) {
        0qQ.A0B(list, 0);
        if (z) {
            list.add(C51968G9o.A0u());
            if (list.size() > 100) {
                list.remove(0);
            }
        }
    }
}
