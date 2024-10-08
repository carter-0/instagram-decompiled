package X;

import com.instagram.model.direct.DirectShareTarget;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OIy {
    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.model.direct.DirectShareTarget, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ArrayList A00(Object obj) {
        DirectShareTarget directShareTarget;
        List<C74253Prh> list = (List) obj;
        0qQ.A0B(list, 0);
        BigInteger bigInteger = C46503Dg6.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C74253Prh prh : list) {
            if (prh instanceof C68272N8j) {
                C68272N8j n8j = (C68272N8j) prh;
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it = n8j.A03.iterator();
                while (it.hasNext()) {
                    C66581MXm.A1M(DbT.A0k(it), A1C2);
                }
                String str = n8j.A02;
                String str2 = n8j.A00;
                List list2 = n8j.A04;
                String str3 = n8j.A01;
                ? obj2 = new Object();
                obj2.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
                obj2.A01 = 0;
                obj2.A0E = 0;
                obj2.A0K = "";
                obj2.A0Q = A1C2;
                obj2.A0H = str2;
                obj2.A0I = str;
                obj2.A0J = str;
                obj2.A0B = true;
                obj2.A0L = str3;
                obj2.A0P = list2;
                obj2.A0D();
                directShareTarget = obj2;
            } else if (prh instanceof CGZ) {
                Iterator it2 = ((CGZ) prh).A01.iterator();
                while (it2.hasNext()) {
                    A1C.add(new DirectShareTarget(DbT.A0k(it2), false));
                }
            } else if (prh instanceof C68271N8i) {
                directShareTarget = new DirectShareTarget(((C68271N8i) prh).A00, false);
            }
            A1C.add(directShareTarget);
        }
        return A1C;
    }
}
