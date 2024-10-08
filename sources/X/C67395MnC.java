package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.MnC  reason: case insensitive filesystem */
public final class C67395MnC {
    public static NH8 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                ArrayList arrayList = null;
                if ("sections".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            PUI parseFromJson = OXM.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A01 = arrayList;
                } else if ("search_box_recommendations".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C67389Mn6 parseFromJson2 = C67388Mn5.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r0.A00 = arrayList;
                } else {
                    1XY.A01(r5, r0, A0q);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
