package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.Cpn  reason: case insensitive filesystem */
public abstract class C45070Cpn {
    public static C61073JwB parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C61073JwB jwB = new C61073JwB(14);
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("ig_funded_incentive".equals(A17)) {
                    jwB.A00 = C63336KvJ.parseFromJson(r4);
                } else if ("channel_type".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    jwB.A01 = A0l;
                } else if (TraceFieldType.ContentType.equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    jwB.A02 = A0l2;
                } else if ("pinned_content_token".equals(A17)) {
                    jwB.A03 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return jwB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
