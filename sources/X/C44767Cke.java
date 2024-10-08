package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cke  reason: case insensitive filesystem */
public abstract class C44767Cke {
    public static C45219Csa parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45219Csa csa = new C45219Csa();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("header".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("points".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    csa.A00 = arrayList;
                }
                r4.A0z();
            }
            return csa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
