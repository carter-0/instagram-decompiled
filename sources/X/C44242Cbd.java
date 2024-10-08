package X;

import java.io.IOException;

/* renamed from: X.Cbd  reason: case insensitive filesystem */
public abstract class C44242Cbd {
    public static C42063BFq parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (!"post_friction_reason".equals(A17)) {
                    bool = C41847B3o.A0z(r8, bool, A17, "should_show_post_friction");
                } else if (r8.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r8.A1P();
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("post_friction_reason", r8, "PostFrictionInfoImpl");
            } else if (bool != null || !(r8 instanceof 0c9)) {
                return new C42063BFq(str, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("should_show_post_friction", r8, "PostFrictionInfoImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
