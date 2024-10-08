package X;

import java.io.IOException;

public abstract class VHP {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VWo, java.lang.Object] */
    public static C17461VWo parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product_group".equals(A17)) {
                    obj.A00 = C17018VEs.parseFromJson(r3);
                } else if ("metadata".equals(A17)) {
                    obj.A01 = VHS.parseFromJson(r3);
                } else if ("variant_description".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A02 = str;
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
