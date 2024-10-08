package X;

import java.io.IOException;

public abstract class VAA {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.VZE, java.lang.Object] */
    public static VZE parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("tip_id".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(143).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if (C66579MXk.A00(310).equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("image_url".equals(A17)) {
                    obj.A01 = 16h.A00(r3);
                } else if (C66579MXk.A00(1046).equals(A17)) {
                    obj.A00 = VA9.parseFromJson(r3);
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
