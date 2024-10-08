package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Cc4 {
    public static C42071BFz parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("android_links".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1C(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("ios_links".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1C(r6, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("product_id".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                }
                r6.A0z();
            }
            return new C42071BFz(arrayList, arrayList2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
