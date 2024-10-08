package X;

import java.io.IOException;

/* renamed from: X.VEr  reason: case insensitive filesystem */
public abstract class C17017VEr {
    public static UOA parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            UN8 un8 = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            UN9 un9 = null;
            UNA una = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("dimensional_info".equals(A17)) {
                    un8 = V7X.parseFromJson(r5);
                } else if ("rating_only_info".equals(A17)) {
                    un9 = V7Z.parseFromJson(r5);
                } else if ("topics_info".equals(A17)) {
                    una = C16820V7b.parseFromJson(r5);
                }
                r5.A0z();
            }
            return new UOA(un8, un9, una);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
