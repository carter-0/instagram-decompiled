package X;

import java.io.IOException;

/* renamed from: X.Vle  reason: case insensitive filesystem */
public final class C18110Vle {
    public static C15253UXn parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(163).equals(A17)) {
                    r1.A04 = r4.A0d();
                } else if (C41845B3m.A1E(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A03 = A0l;
                } else if (AnonymousClass000.A00(2713).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A00 = A0l2;
                } else if (C66579MXk.A00(40).equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A01 = A0l3;
                } else if (AnonymousClass000.A00(186).equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    r1.A02 = A0l4;
                } else {
                    1XY.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
