package X;

import java.io.IOException;
import java.util.ArrayList;

public final class D2U {
    public static C43857CFx parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C43857CFx cFx = new C43857CFx();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                if (C41846B3n.A1Z(r5, A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            JZC parseFromJson = C44955Cnp.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    cFx.A01 = arrayList;
                } else if ("page_info".equals(A0q)) {
                    cFx.A00 = C45016Cot.parseFromJson(r5);
                } else {
                    1XY.A01(r5, cFx, A0q);
                }
                r5.A0z();
            }
            return cFx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
