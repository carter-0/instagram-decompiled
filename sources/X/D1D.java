package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D1D {
    public static CFI parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            CFI cfi = new CFI();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("all_channels_list".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C2609147n parseFromJson = C2608747j.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cfi.A00 = arrayList;
                } else {
                    1XY.A01(r5, cfi, A17);
                }
                r5.A0z();
            }
            return cfi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
