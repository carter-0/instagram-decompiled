package X;

import java.io.IOException;

public abstract class CjC {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.Etu] */
    public static C49339Etu parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("item_id".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A00 = str;
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
