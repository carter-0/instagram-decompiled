package X;

import java.io.IOException;

/* renamed from: X.V7f  reason: case insensitive filesystem */
public abstract class C16824V7f {
    public static UND parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Integer num = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("community_bio".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("community_name".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if (C273654mx.A00(777).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if (C273654mx.A00(778).equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r9);
                } else if ("is_viewer_member".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r9);
                } else {
                    num = C41847B3o.A13(r9, num, A17, C273654mx.A00(855));
                }
                r9.A0z();
            }
            return new UND(bool, bool2, bool3, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
