package X;

import java.io.IOException;

public abstract class V7R {
    public static UN4 parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            UN5 un5 = null;
            Boolean bool = null;
            String str = null;
            UN6 un6 = null;
            UN7 un7 = null;
            String str2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("coordinates".equals(A17)) {
                    un5 = V7Q.parseFromJson(r9);
                } else if (AnonymousClass000.A00(1490).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r9);
                } else if (C41845B3m.A1A(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("text_styling".equals(A17)) {
                    un6 = V7T.parseFromJson(r9);
                } else if ("time_stamp".equals(A17)) {
                    un7 = V7V.parseFromJson(r9);
                } else if ("truncation_text".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new UN4(un5, un6, un7, bool, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
