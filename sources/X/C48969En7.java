package X;

import java.io.IOException;

/* renamed from: X.En7  reason: case insensitive filesystem */
public abstract class C48969En7 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Ez0] */
    public static Ez0 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1E(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("action".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if (DcV.A01().equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("stop_deletion_token".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
