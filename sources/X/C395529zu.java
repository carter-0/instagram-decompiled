package X;

import java.io.IOException;

/* renamed from: X.9zu  reason: invalid class name and case insensitive filesystem */
public abstract class C395529zu {
    public static AnonymousClass1fa parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1fa r0 = new AnonymousClass1fa();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("static_sticker".equals(A17)) {
                    r0.A00 = C369248u6.parseFromJson(r3);
                } else {
                    C66893Meb.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
