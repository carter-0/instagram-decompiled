package X;

import java.io.IOException;

/* renamed from: X.CqQ  reason: case insensitive filesystem */
public abstract class C45108CqQ {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.CqP, java.lang.Object] */
    public static C45107CqP parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("has_next_page".equals(A17)) {
                    r3.A0d();
                } else if (C273654mx.A00(169).equals(A17)) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
