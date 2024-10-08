package X;

import java.io.IOException;

/* renamed from: X.9xZ  reason: invalid class name and case insensitive filesystem */
public abstract class C394119xZ {
    public static QP8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            QP8 qp8 = new QP8(4);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("prompt".equals(A17)) {
                    qp8.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(4517).equals(A17)) {
                    qp8.A00 = AnonymousClass7TF.A0X(r3);
                } else if ("original_question_id".equals(A17)) {
                    qp8.A01 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(181).equals(A17)) {
                    qp8.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("question_responder_id".equals(A17)) {
                    qp8.A03 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return qp8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
