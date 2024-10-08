package X;

import java.io.IOException;

/* renamed from: X.ChL  reason: case insensitive filesystem */
public abstract class C44587ChL {
    public static C61059Jvx parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("enable_likes".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if ("enable_push".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r10);
                } else if ("enable_quote_posts".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r10);
                } else if ("enable_replies".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r10);
                } else if ("enable_reposts".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r10);
                } else if ("enable_view_milestones".equals(A17)) {
                    bool6 = AnonymousClass7TF.A0S(r10);
                }
                r10.A0z();
            }
            return new C61059Jvx(1, (Object) bool, (Object) bool2, (Object) bool3, (Object) bool4, (Object) bool5, (Object) bool6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
