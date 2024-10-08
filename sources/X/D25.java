package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D25 {
    public static C43853CFt parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C43853CFt cFt = new C43853CFt();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("pinned_channels_list".equals(A17)) {
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
                    cFt.A01 = arrayList;
                } else if ("all_channels_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C2609147n parseFromJson2 = C2608747j.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cFt.A00 = arrayList;
                } else {
                    1XY.A01(r5, cFt, A17);
                }
                r5.A0z();
            }
            return cFt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
