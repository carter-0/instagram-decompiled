package X;

import java.io.IOException;
import java.util.ArrayList;

public final class LJ6 {
    public static K1C parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            K1C k1c = new K1C();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("channels".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C61292K1d parseFromJson = LJ4.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1c.A00 = arrayList;
                } else {
                    1XY.A01(r5, k1c, A17);
                }
                r5.A0z();
            }
            return k1c;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
