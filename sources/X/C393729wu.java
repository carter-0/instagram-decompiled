package X;

import com.instagram.api.schemas.AudioFilterInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9wu  reason: invalid class name and case insensitive filesystem */
public abstract class C393729wu {
    public static final void A00(17Z r3, List list) {
        r3.A0b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r3.A0c();
            r3.A0R("filter_type", ((AudioFilterInfo) it.next()).A00.A00);
            r3.A0Z();
        }
        r3.A0Y();
    }
}
