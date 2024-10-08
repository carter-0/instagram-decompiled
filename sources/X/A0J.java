package X;

import java.io.IOException;

public abstract class A0J {
    /* JADX WARNING: type inference failed for: r4v1, types: [X.A5V, java.lang.Object] */
    public static A5V parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("is_verified".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if (Dbq.A03().equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                }
                r5.A0z();
            }
            ? obj = new Object();
            if (bool != null) {
                obj.A01 = bool.booleanValue();
            }
            if (str != null) {
                obj.A00 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
