package X;

import java.io.IOException;

/* renamed from: X.9yv  reason: invalid class name and case insensitive filesystem */
public abstract class C394929yv {
    public static AnonymousClass803 parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass803 r0 = new AnonymousClass803();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("orientation".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    C339977kU r1 = (C339977kU) C339977kU.A01.get(str);
                    if (r1 != null) {
                        r0.A00 = r1;
                    } else {
                        throw AnonymousClass7TF.A0W("Unrecognized value ", str);
                    }
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
