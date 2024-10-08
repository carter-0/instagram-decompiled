package X;

import java.io.IOException;

/* renamed from: X.9xW  reason: invalid class name and case insensitive filesystem */
public abstract class C394089xW {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.6MU, java.lang.Object, X.6MT] */
    public static AnonymousClass6MT parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                AAV.A01(r3, obj, AnonymousClass7TE.A17(r3));
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
