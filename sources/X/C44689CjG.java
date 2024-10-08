package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CjG  reason: case insensitive filesystem */
public abstract class C44689CjG {
    public static C66051iu parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C66051iu r0 = new C66051iu();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("forward_music".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41848B3p.A1P(r5, arrayList);
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    r0.A01 = arrayList;
                } else if ("direct_forwarding_params".equals(A17)) {
                    r0.A00 = C49753F5e.parseFromJson(r5);
                } else {
                    C66893Meb.A01(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
