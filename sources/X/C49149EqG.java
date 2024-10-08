package X;

import java.io.IOException;

/* renamed from: X.EqG  reason: case insensitive filesystem */
public abstract class C49149EqG {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Ex1, java.lang.Object] */
    public static C49522Ex1 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("text".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r3);
                } else if ("url".equals(A17)) {
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
