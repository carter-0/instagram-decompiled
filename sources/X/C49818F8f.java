package X;

import java.io.IOException;

/* renamed from: X.F8f  reason: case insensitive filesystem */
public final class C49818F8f {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.EvZ] */
    public static C49433EvZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("data".equals(AnonymousClass7TE.A17(r4))) {
                    C49432EvY parseFromJson = C49251Eru.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
