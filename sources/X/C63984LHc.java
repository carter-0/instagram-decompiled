package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.LHc  reason: case insensitive filesystem */
public final class C63984LHc {
    public static K1J parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            K1J k1j = new K1J();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("pending_approval_requests".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    k1j.A01 = arrayList;
                } else if ("cursor".equals(A17)) {
                    k1j.A00 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, k1j, A17);
                }
                r5.A0z();
            }
            return k1j;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
