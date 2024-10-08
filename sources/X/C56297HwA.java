package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HwA  reason: case insensitive filesystem */
public final class C56297HwA {
    public static C54062Gyl parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C54062Gyl gyl = new C54062Gyl();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("ig_item_id_to_reaction".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C55625Hkk parseFromJson = C54959HZp.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    gyl.A00 = arrayList;
                } else {
                    1XY.A01(r5, gyl, A17);
                }
                r5.A0z();
            }
            return gyl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
