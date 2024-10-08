package X;

import com.instagram.creatortools.api.schemas.CreatorToolsComponent;
import java.io.IOException;

/* renamed from: X.CiE  reason: case insensitive filesystem */
public abstract class C44635CiE {
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
            C47184Drz drz = null;
            C47184Drz drz2 = null;
            C47184Drz drz3 = null;
            N49 n49 = null;
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
                } else if ("insights_render_data".equals(A17)) {
                    drz = C44637CiG.parseFromJson(r12);
                } else if ("insipiration_render_data".equals(A17)) {
                    drz2 = C44638CiH.parseFromJson(r12);
                } else if ("monetization_render_data".equals(A17)) {
                    drz3 = CiI.parseFromJson(r12);
                } else if ("render_position".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("section_header_render_data".equals(A17)) {
                    n49 = C44642CiM.parseFromJson(r12);
                }
                r12.A0z();
            }
            if (creatorToolsComponent == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("component_name", r12, "GenericValueProps");
            } else if (num != null || !(r12 instanceof 0c9)) {
                return new JV1(n49, drz, drz2, drz3, creatorToolsComponent, num.intValue());
            } else {
                AnonymousClass7TF.A1L("render_position", r12, "GenericValueProps");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
