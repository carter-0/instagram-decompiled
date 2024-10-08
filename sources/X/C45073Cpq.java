package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Cpq  reason: case insensitive filesystem */
public abstract class C45073Cpq {
    public static C61058Jvw parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61058Jvw jvw = new C61058Jvw();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("channel_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    jvw.A02 = A0l;
                } else if ("channel_type".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    jvw.A03 = A0l2;
                } else if (TraceFieldType.ContentType.equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    jvw.A04 = A0l3;
                } else if ("pinned_content_token".equals(A17)) {
                    jvw.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("pinned_content".equals(A17)) {
                    jvw.A01 = C45079Cpw.parseFromJson(r4);
                } else if ("module_metadata".equals(A17)) {
                    C61037Jvb parseFromJson = C45074Cpr.parseFromJson(r4);
                    0qQ.A0B(parseFromJson, 0);
                    jvw.A00 = parseFromJson;
                }
                r4.A0z();
            }
            return jvw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
