package X;

import java.io.IOException;

/* renamed from: X.NzI  reason: case insensitive filesystem */
public abstract class C70226NzI {
    public static C65361bz parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65361bz r0 = new C65361bz();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                C66670Mad.A01(r3, r0, AnonymousClass7TE.A17(r3));
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
