package X;

import java.io.IOException;
import java.util.ArrayList;

public final class LJO {
    public static K1P parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            K1P k1p = new K1P();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("keywords".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1p.A01 = arrayList;
                } else {
                    1XY.A01(r5, k1p, A17);
                }
                r5.A0z();
            }
            return k1p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
