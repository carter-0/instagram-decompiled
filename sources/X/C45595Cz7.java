package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cz7  reason: case insensitive filesystem */
public final class C45595Cz7 {
    public static CEG parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("e2ee_mentioned_user_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    r4.A02 = arrayList;
                } else if (C41845B3m.A1J(A17)) {
                    r4.A01 = AnonymousClass7TF.A0Z(r5);
                } else if ("mentioned_users".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    r4.A03 = arrayList;
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            List list = r4.A02;
            Long l = r4.A01;
            List list2 = r4.A03;
            0qQ.A0A(list2);
            r4.A00 = new C61109JxL(l, list, list2);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
