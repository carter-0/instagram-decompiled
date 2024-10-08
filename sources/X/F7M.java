package X;

import java.io.IOException;
import java.util.ArrayList;

public final class F7M {
    public static DvE parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            DvE dvE = new DvE();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("quick_conversion_settings".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            F16 parseFromJson = C49117Epg.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    dvE.A00 = arrayList;
                } else {
                    1XY.A01(r5, dvE, A17);
                }
                r5.A0z();
            }
            return dvE;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
