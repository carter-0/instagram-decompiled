package X;

import java.io.IOException;

/* renamed from: X.En5  reason: case insensitive filesystem */
public abstract class C48967En5 {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Eu9] */
    public static C49345Eu9 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("should_show".equals(AnonymousClass7TE.A17(r3))) {
                    obj.A00 = r3.A0d();
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
