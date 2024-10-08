package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D29 {
    public static UY8 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1H(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1V(A17)) {
                    r0.A02 = r4.A0d();
                } else if ("show_see_all".equals(A17)) {
                    r0.A03 = r4.A0d();
                } else if ("countdowns".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            BGi parseFromJson = C45635Czl.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A01 = arrayList;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
