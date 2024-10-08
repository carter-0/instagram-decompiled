package X;

import java.io.IOException;

/* renamed from: X.Cim  reason: case insensitive filesystem */
public abstract class C44668Cim {
    public static C61081JwJ parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str = null;
            BBV bbv = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (AnonymousClass000.A00(726).equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                } else if (C66579MXk.A00(1174).equals(A17)) {
                    bbv = C44667Cil.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new C61081JwJ(str, (Object) bbv, 42);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
