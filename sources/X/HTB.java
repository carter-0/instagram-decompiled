package X;

import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public abstract class HTB {
    public static void A00(View view, C238853Dr r7, List list, List list2, List list3) {
        C238883Du r4;
        HashSet A1F = AnonymousClass7TE.A1F();
        while (view != null) {
            Map map = r7.A02;
            if (!(map.get(view) == null || map.get(view) == C238883Du.A07 || (r4 = (C238883Du) map.get(view)) == null)) {
                C244333b1 r0 = r4.A05;
                String str = r4.A06;
                if (str == null && r0 != null) {
                    str = r0.AWo();
                    r4.A06 = str;
                }
                C238873Dt r2 = r4.A04;
                C244333b1 r02 = r4.A05;
                AnonymousClass4Lh r1 = r4.A03;
                if (r1 == null && r02 != null) {
                    r1 = r02.AWe();
                    r4.A03 = r1;
                }
                if (str != null && !A1F.contains(str)) {
                    list.add(str);
                    A1F.add(str);
                }
                if (r2 != null) {
                    list2.add(r2);
                }
                if (r1 != null) {
                    list3.add(r1);
                }
            }
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                return;
            }
        }
    }
}
