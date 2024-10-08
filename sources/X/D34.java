package X;

import java.io.IOException;

public final class D34 {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.CtP, java.lang.Object] */
    public static C45261CtP parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("data".equals(AnonymousClass7TE.A17(r4))) {
                    C45260CtO parseFromJson = C45160CrN.parseFromJson(r4);
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
