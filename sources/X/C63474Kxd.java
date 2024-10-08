package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Kxd  reason: case insensitive filesystem */
public abstract class C63474Kxd {
    public static QP8 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            QP8 qp8 = new QP8(12);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("m_pk".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    qp8.A02 = A0l;
                } else if ("product_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    qp8.A04 = A0l2;
                } else if ("merchant_id".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    qp8.A03 = A0l3;
                } else if (TraceFieldType.BroadcastId.equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    qp8.A01 = A0l4;
                } else if ("social_context_count".equals(A17)) {
                    qp8.A00 = AnonymousClass7TF.A0X(r4);
                }
                r4.A0z();
            }
            return qp8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
