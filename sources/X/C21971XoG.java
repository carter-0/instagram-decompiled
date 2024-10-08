package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.XoG  reason: case insensitive filesystem */
public final class C21971XoG {
    public final List A00 = new ArrayList(20);

    public final void A01(String str) {
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i < list.size()) {
                if (str.equalsIgnoreCase((String) list.get(i))) {
                    list.remove(i);
                    list.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public static C21971XoG A00(C22023Xt4 xt4) {
        C21971XoG xoG = new C21971XoG();
        Collections.addAll(xoG.A00, xt4.A00);
        return xoG;
    }

    public final void A02(String str, String str2) {
        List list = this.A00;
        list.add(str);
        list.add(str2.trim());
    }
}
