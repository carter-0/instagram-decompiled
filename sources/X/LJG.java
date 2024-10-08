package X;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public abstract class LJG {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.L1x, java.lang.Object] */
    public static C63661L1x parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("whitelist_country_codes".equals(AnonymousClass7TE.A17(r4))) {
                    HashSet hashSet = null;
                    if (r4.A11() == 16L.A0C) {
                        hashSet = AnonymousClass7TE.A1F();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, hashSet);
                        }
                    }
                    obj.A00 = hashSet;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C63661L1x l1x) {
        r2.A0c();
        if (l1x.A00 != null) {
            16P.A03(r2, "whitelist_country_codes");
            Iterator it = l1x.A00.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r2, it);
            }
            r2.A0Y();
        }
        r2.A0Z();
    }
}
