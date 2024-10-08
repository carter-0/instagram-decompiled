package X;

import com.instagram.creatortools.api.schemas.CreatorToolsComponent;
import java.io.IOException;

/* renamed from: X.CiL  reason: case insensitive filesystem */
public abstract class C44641CiL {
    public static JV1 parseFromJson(16F r12) {
        String str;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            CreatorToolsComponent creatorToolsComponent = null;
            JV7 jv7 = null;
            JV7 jv72 = null;
            C42037BEp bEp = null;
            C61084JwM jwM = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("component_name".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    creatorToolsComponent = (CreatorToolsComponent) CreatorToolsComponent.A01.get(str);
                    if (creatorToolsComponent == null) {
                        creatorToolsComponent = CreatorToolsComponent.UNRECOGNIZED;
                    }
                } else if ("cover_render_data".equals(A17)) {
                    jv7 = C44634CiC.parseFromJson(r12);
                } else if ("eligibility_criteria_render_data".equals(A17)) {
                    jv72 = C44639CiJ.parseFromJson(r12);
                } else if ("footer_render_data".equals(A17)) {
                    bEp = C44151CXq.parseFromJson(r12);
                } else if ("render_position".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("value_prop_render_data".equals(A17)) {
                    jwM = C44640CiK.parseFromJson(r12);
                }
                r12.A0z();
            }
            if (creatorToolsComponent == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("component_name", r12, "ProductValueProps");
            } else if (num != null || !(r12 instanceof 0c9)) {
                return new JV1(jwM, jv7, jv72, (MWD) bEp, creatorToolsComponent, num.intValue());
            } else {
                AnonymousClass7TF.A1L("render_position", r12, "ProductValueProps");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
