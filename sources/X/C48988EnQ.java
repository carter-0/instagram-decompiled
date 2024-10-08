package X;

import java.io.IOException;

/* renamed from: X.EnQ  reason: case insensitive filesystem */
public abstract class C48988EnQ {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.ELK, X.Eb1, java.lang.Object] */
    public static ELK parseFromJson(16F r3) {
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
                } else if ("subtitle".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("button".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else {
                    C48900Em0.A00(r3, obj, A17);
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
