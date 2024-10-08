package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HZp  reason: case insensitive filesystem */
public abstract class C54959HZp {
    public static C55625Hkk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C55625Hkk hkk = new C55625Hkk();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("item_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    hkk.A00 = A0l;
                } else if ("count_based_reactions".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C55720HmH parseFromJson = C54960HZq.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    hkk.A01 = arrayList;
                }
                r5.A0z();
            }
            return hkk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
