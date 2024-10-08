package X;

import java.io.IOException;

/* renamed from: X.Cky  reason: case insensitive filesystem */
public abstract class C44787Cky {
    public static C45226Csh parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C45226Csh csh = new C45226Csh();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if (C41845B3m.A1A(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    csh.A00 = str;
                }
                r3.A0z();
            }
            return csh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
