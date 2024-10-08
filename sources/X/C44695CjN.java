package X;

import java.io.IOException;

/* renamed from: X.CjN  reason: case insensitive filesystem */
public abstract class C44695CjN {
    public static AnonymousClass1l5 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1l5 r0 = new AnonymousClass1l5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                C66893Meb.A01(r3, r0, AnonymousClass7TE.A17(r3));
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
