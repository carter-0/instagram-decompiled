package X;

import java.io.IOException;

public abstract class V8L {
    public static C15058UNb parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Boolean bool2 = null;
            String str3 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                if (C41846B3n.A1Y(r8, A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("is_exclusive".equals(A0q)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("next_id".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("single_choice_answer".equals(A0q)) {
                    bool2 = AnonymousClass7TF.A0S(r8);
                } else if (C41845B3m.A1A(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C15058UNb(bool, bool2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
