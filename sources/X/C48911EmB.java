package X;

import java.io.IOException;

/* renamed from: X.EmB  reason: case insensitive filesystem */
public abstract class C48911EmB {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.Eb2, java.lang.Object] */
    public static C48221Eb2 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("button_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("social_context".equals(A17)) {
                    C41846B3n.A1A(r4);
                }
                r4.A0z();
            }
            ? obj = new Object();
            obj.A00 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
