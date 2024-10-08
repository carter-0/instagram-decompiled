package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class LJE {
    public static C61279K0q parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r3 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("media_kits".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C61221JzE parseFromJson = C63321Kv4.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r3.A02 = arrayList;
                } else if ("next_max_id".equals(A17)) {
                    r3.A01 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, r3, A17);
                }
                r4.A0z();
            }
            List list = r3.A02;
            0qQ.A0A(list);
            r3.A00 = new C60913JtX(list, r3.A01);
            return r3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
