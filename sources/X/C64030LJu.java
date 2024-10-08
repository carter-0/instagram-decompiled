package X;

import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LJu  reason: case insensitive filesystem */
public abstract class C64030LJu {
    public static final List A00(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((Product) it.next()).A0H);
        }
        return A0r;
    }

    public static final List A01(List list) {
        Long A10;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Product) it.next()).A0H;
            if (!(str == null || (A10 = AnonymousClass7TE.A10(str)) == null)) {
                A1C.add(A10);
            }
        }
        return A1C;
    }
}
