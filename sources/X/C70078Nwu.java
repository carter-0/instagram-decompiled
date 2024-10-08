package X;

import java.io.IOException;

/* renamed from: X.Nwu  reason: case insensitive filesystem */
public abstract class C70078Nwu {
    public static QP5 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            QP5 qp5 = new QP5();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1A(A17)) {
                    qp5.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("interactive_user_id".equals(A17)) {
                    qp5.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3397).equals(A17)) {
                    qp5.A00 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(663).equals(A17)) {
                    qp5.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return qp5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
