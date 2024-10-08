package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NvZ  reason: case insensitive filesystem */
public abstract class C69995NvZ {
    public static final ArrayList A00(List list) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C274694ou r0 = (C274694ou) it.next();
            if (!(r0 == null || (str = r0.A05) == null)) {
                A1C.add(str);
            }
        }
        return A1C;
    }
}
