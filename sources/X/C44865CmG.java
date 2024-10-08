package X;

import java.io.IOException;

/* renamed from: X.CmG  reason: case insensitive filesystem */
public abstract class C44865CmG {
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.Cux] */
    public static C45355Cux parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("banner_text".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                } else if ("pill_text".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if (C41845B3m.A18(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                }
                r6.A0z();
            }
            ? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
            if (str2 != null) {
                obj.A01 = str2;
            }
            if (str3 != null) {
                obj.A02 = str3;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
