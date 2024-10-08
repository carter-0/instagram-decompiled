package X;

import java.io.IOException;

/* renamed from: X.Nrh  reason: case insensitive filesystem */
public abstract class C69758Nrh {
    public static N5J parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("ib_id".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("is_default".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if ("payload".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("subvertical".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r9.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r9.A1P();
                    }
                } else if ("vertical".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new N5J(bool, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
