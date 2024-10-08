package X;

import java.io.IOException;

/* renamed from: X.Cg8  reason: case insensitive filesystem */
public abstract class C44512Cg8 {
    public static C61064Jw2 parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            C61080JwI jwI = null;
            C276104sZ r3 = null;
            String str = null;
            Boolean bool = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("data".equals(A17)) {
                    jwI = C44511Cg7.parseFromJson(r12);
                } else if ("paging_info".equals(A17)) {
                    r3 = C276094sY.parseFromJson(r12);
                } else if (!"section_id".equals(A17)) {
                    bool = C41847B3o.A0z(r12, bool, A17, "should_collapse");
                } else if (r12.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r12.A1P();
                }
                r12.A0z();
            }
            if (jwI == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("data", r12, "TemplatesBrowserSectionContent");
            } else if (r3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("paging_info", r12, "TemplatesBrowserSectionContent");
            } else if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("section_id", r12, "TemplatesBrowserSectionContent");
            } else if (bool != null || !(r12 instanceof 0c9)) {
                return new C61064Jw2(jwI, (C276114sa) r3, str, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("should_collapse", r12, "TemplatesBrowserSectionContent");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
