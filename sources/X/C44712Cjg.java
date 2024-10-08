package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cjg  reason: case insensitive filesystem */
public abstract class C44712Cjg {
    public static C65641fB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65641fB r1 = new C65641fB();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(3977).equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41848B3p.A1P(r4, arrayList);
                        }
                    }
                    r1.A03 = arrayList;
                } else if ("link_id".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A00 = C49753F5e.parseFromJson(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
