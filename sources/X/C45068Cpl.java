package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Cpl  reason: case insensitive filesystem */
public abstract class C45068Cpl {
    public static QP8 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            QP8 qp8 = new QP8(11);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("account_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    qp8.A01 = A0l;
                } else if ("channel_type".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    qp8.A02 = A0l2;
                } else if (TraceFieldType.ContentType.equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    qp8.A03 = A0l3;
                } else if ("pinned_content_token".equals(A17)) {
                    qp8.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("pinned_content".equals(A17)) {
                    qp8.A00 = C45079Cpw.parseFromJson(r4);
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
