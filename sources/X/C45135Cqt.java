package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cqt  reason: case insensitive filesystem */
public abstract class C45135Cqt {
    public static BJ1 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (!"audience_facepile_users".equals(A17)) {
                    num = C41847B3o.A13(r5, num, A17, "audience_size");
                } else if (r5.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r5.A1J() != 16L.A08) {
                        C41846B3n.A1E(r5, arrayList);
                    }
                } else {
                    arrayList = null;
                }
                r5.A0z();
            }
            return new BJ1(num, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
