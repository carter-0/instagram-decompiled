package X;

import java.io.IOException;

/* renamed from: X.46o  reason: invalid class name and case insensitive filesystem */
public abstract class C2606646o {
    public static AnonymousClass9JK parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("text".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("bold".equals(A0q)) {
                    bool = Boolean.valueOf(r10.A0d());
                } else if ("color".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("intent".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("semantic_color".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass9JK(bool, str, str2, str3, str4);
            }
            ((0c9) r10).A03.A00("text", "TextPart");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
