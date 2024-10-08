package X;

import java.io.IOException;

/* renamed from: X.NzQ  reason: case insensitive filesystem */
public abstract class C70234NzQ {
    public static C65371c2 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C65371c2 r0 = new C65371c2();
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
