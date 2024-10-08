package X;

import java.io.IOException;

/* renamed from: X.Nyz  reason: case insensitive filesystem */
public abstract class C70207Nyz {
    public static AnonymousClass1mR parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1mR r0 = new AnonymousClass1mR();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C66580MXl.A1Z(A17)) {
                    r0.A00 = C254733sx.parseFromJson(r3);
                } else if ("message_id".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("message_client_context".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("is_ae".equals(A17)) {
                    r0.A05 = r3.A0d();
                } else if ("is_ae_open_eb".equals(A17)) {
                    r0.A06 = r3.A0d();
                } else if ("object_id".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("mime_type".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66670Mad.A01(r3, r0, A17);
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
