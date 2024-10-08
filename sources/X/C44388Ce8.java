package X;

import java.io.IOException;

/* renamed from: X.Ce8  reason: case insensitive filesystem */
public abstract class C44388Ce8 {
    public static C42081BGk parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("apply_craft".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if (C273654mx.A00(120).equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            return new C42081BGk(str, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
