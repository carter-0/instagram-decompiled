package X;

import java.io.IOException;

public abstract class ABS {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.AE3, java.lang.Object] */
    public static AE3 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("short_name".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A01 = A0l;
                } else if ("picture_url".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("is_verified".equals(A17)) {
                    obj.A02 = r4.A0d();
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

    public static void A00(17Z r2, AE3 ae3) {
        r2.A0c();
        ae3.A01();
        r2.A0R("short_name", ae3.A01());
        String str = ae3.A00;
        if (str != null) {
            r2.A0R("picture_url", str);
        }
        r2.A0S("is_verified", ae3.A02);
        r2.A0Z();
    }
}
