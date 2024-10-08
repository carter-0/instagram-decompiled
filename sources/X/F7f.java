package X;

import java.io.IOException;

public final class F7f {
    public static DvM parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("error_style".equals(A17)) {
                    String A1Q = r4.A1Q();
                    A1Q.getClass();
                    Integer num = AnonymousClass05K.A00;
                    if (!A1Q.equalsIgnoreCase("POPUP".toLowerCase())) {
                        num = AnonymousClass05K.A01;
                        if (!A1Q.equalsIgnoreCase("INLINE".toLowerCase())) {
                            throw new UnsupportedOperationException();
                        }
                    }
                    r0.A00 = num;
                } else {
                    1XY.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
