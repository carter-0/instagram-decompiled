package X;

import java.io.IOException;

/* renamed from: X.Nyi  reason: case insensitive filesystem */
public abstract class C70190Nyi {
    public static AnonymousClass1kT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1kT r0 = new AnonymousClass1kT();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("thread_subtype".equals(A17)) {
                    r0.A01 = r3.A1D();
                } else if ("thread_audience".equals(A17)) {
                    r0.A00 = r3.A1D();
                } else {
                    OQV.A01(r3, r0, A17);
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
