package X;

import java.io.IOException;

/* renamed from: X.NwV  reason: case insensitive filesystem */
public abstract class C70053NwV {
    public static N4L parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            Boolean bool = null;
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("is_from_xplat_reverb".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("is_open_eb".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if ("is_from_eb_server".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r13);
                } else if ("is_e2ee_attributed".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r13);
                } else if ("is_created_directly_from_server_response".equals(A17)) {
                    bool5 = AnonymousClass7TF.A0S(r13);
                }
                r13.A0z();
            }
            if (bool == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_from_xplat_reverb", r13, "ArmadilloExpressData");
            } else if (bool2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_open_eb", r13, "ArmadilloExpressData");
            } else if (bool3 != null || !(r13 instanceof 0c9)) {
                return new N4L(bool4, bool5, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_from_eb_server", r13, "ArmadilloExpressData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
