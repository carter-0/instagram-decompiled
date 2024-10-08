package X;

import java.io.IOException;
import java.util.ArrayList;

public final class F52 {
    public static DvY parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            DvY dvY = new DvY();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("objectives".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C47358Dvs parseFromJson = C48740EjP.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    dvY.A01 = arrayList;
                } else if ("connection_methods".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C47357Dvr parseFromJson2 = C48737EjM.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    dvY.A00 = arrayList;
                } else {
                    1XY.A01(r5, dvY, A17);
                }
                r5.A0z();
            }
            return dvY;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
