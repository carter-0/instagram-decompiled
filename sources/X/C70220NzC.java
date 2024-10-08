package X;

import java.io.IOException;

/* renamed from: X.NzC  reason: case insensitive filesystem */
public abstract class C70220NzC {
    public static AnonymousClass1fR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1fR r0 = new AnonymousClass1fR();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("animated_media".equals(A17)) {
                    r0.A02 = C70893OQl.parseFromJson(r3);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r0.A00 = C49753F5e.parseFromJson(r3);
                } else if ("replied_to_message".equals(A17)) {
                    r0.A01 = C254933tI.A00(r3);
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
