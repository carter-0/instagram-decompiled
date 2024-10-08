package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CyS  reason: case insensitive filesystem */
public final class C45554CyS {
    public static CEO parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if (C41845B3m.A1H(A17)) {
                    r5.A02 = AnonymousClass7TG.A0l(r6);
                } else if ("members".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C41846B3n.A1E(r6, arrayList);
                        }
                    }
                    r5.A03 = arrayList;
                } else if ("members_info".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            C61103JxE parseFromJson = C44135CXa.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r5.A04 = arrayList;
                } else if (C41845B3m.A1V(A17)) {
                    r5.A01 = AnonymousClass7TF.A0S(r6);
                } else {
                    1XY.A01(r6, r5, A17);
                }
                r6.A0z();
            }
            String str = r5.A02;
            List list = r5.A03;
            0qQ.A0A(list);
            List list2 = r5.A04;
            0qQ.A0A(list2);
            r5.A00 = new C60923Jth(str, list, list2, C41845B3m.A14(r5.A01));
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
