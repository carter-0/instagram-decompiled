package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ktk  reason: case insensitive filesystem */
public abstract class C63239Ktk {
    public static C61078JwG parseFromJson(16F r6) {
        String A00;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (true) {
                16L A1J = r6.A1J();
                16L r3 = 16L.A09;
                A00 = AnonymousClass000.A00(3099);
                if (A1J == r3) {
                    break;
                }
                if (C41846B3n.A1b(r6, A00)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r6, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new C61078JwG((List) arrayList, 11);
            }
            AnonymousClass7TF.A1L(A00, r6, "FacePileInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
