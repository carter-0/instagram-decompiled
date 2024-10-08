package X;

import java.io.IOException;

/* renamed from: X.8wk  reason: invalid class name and case insensitive filesystem */
public abstract class C370608wk {
    public static N2U parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            Long l = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("takedown_timestamp".equals(A0q)) {
                    l = Long.valueOf(r7.A0y());
                } else if ("takedown_state".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                }
                r7.A0z();
            }
            if (l == null && (r7 instanceof 0c9)) {
                ((0c9) r7).A03.A00("takedown_timestamp", "TakedownThreadMetadata");
            } else if (num != null || !(r7 instanceof 0c9)) {
                return new N2U(l.longValue(), num.intValue());
            } else {
                ((0c9) r7).A03.A00("takedown_state", "TakedownThreadMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
