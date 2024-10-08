package X;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class OT8 {
    public final List A00 = AnonymousClass7TE.A1C();
    public final List A01;

    public static final void A00(Context context, 1a8 r11, OT8 ot8, Integer num, Integer num2, 0sP r15, int i, boolean z) {
        String str;
        Object nUb;
        OT8 ot82 = ot8;
        List list = ot8.A01;
        0sP r6 = r15;
        int i2 = i;
        if (i2 >= list.size()) {
            List list2 = ot8.A00;
            if (AnonymousClass7TE.A1b(list2)) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() instanceof C68717NUd) {
                                nUb = C68717NUd.A00;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                nUb = 00k.A0K(list2);
            } else {
                if (list.isEmpty()) {
                    str = "No seamless handlers";
                } else {
                    str = "Null handler result";
                }
                nUb = new C68715NUb(str);
            }
            r15.invoke(nUb);
            return;
        }
        boolean z2 = z;
        ((C74386Pu2) list.get(i2)).E2a(context, r11, num, num2, new C73973Pmr(context, r11, ot82, num, num2, r6, i2, z2), z2);
    }

    public OT8(List list) {
        this.A01 = list;
    }
}
