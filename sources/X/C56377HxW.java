package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HxW  reason: case insensitive filesystem */
public final class C56377HxW {
    public static C54064Gyn parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C54064Gyn gyn = new C54064Gyn();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("translations".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C54069Gys parseFromJson = C55283HfC.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    gyn.A00 = arrayList;
                } else {
                    1XY.A01(r5, gyn, A17);
                }
                r5.A0z();
            }
            return gyn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
