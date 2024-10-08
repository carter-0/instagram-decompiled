package X;

import java.io.IOException;

/* renamed from: X.VEl  reason: case insensitive filesystem */
public abstract class C17011VEl {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VYE, java.lang.Object] */
    public static VYE parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("product_id".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("quantity".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("price".equals(A17)) {
                    obj.A01 = C45675D1a.parseFromJson(r3);
                } else if ("launch_date_unix_timestamp".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
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
