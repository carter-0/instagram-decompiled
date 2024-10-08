package X;

import java.io.IOException;

/* renamed from: X.9xa  reason: invalid class name and case insensitive filesystem */
public abstract class C394129xa {
    public static C40594Aei parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C40594Aei aei = new C40594Aei();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("medium".equals(A17)) {
                    aei.A00 = C353258Gx.parseFromJson(r3);
                } else if ("caption".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    aei.A01 = str;
                }
                r3.A0z();
            }
            return aei;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
