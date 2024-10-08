package X;

import java.io.IOException;

/* renamed from: X.Cln  reason: case insensitive filesystem */
public abstract class C44837Cln {
    public static C61214Jz7 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("advertiser_privacy_policy_name".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("disclaimer_body".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("disclaimer_title".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C61214Jz7(str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
