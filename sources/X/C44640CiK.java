package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CiK  reason: case insensitive filesystem */
public abstract class C44640CiK {
    public static C61084JwM parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C61037Jvb jvb = null;
            N49 n49 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("header".equals(A17)) {
                    jvb = C44644CiO.parseFromJson(r8);
                } else if ("themed_image_url".equals(A17)) {
                    n49 = C44643CiN.parseFromJson(r8);
                } else if ("value_props".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C61037Jvb parseFromJson = C44644CiO.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList != null || !(r8 instanceof 0c9)) {
                return new C61084JwM(n49, jvb, (List) arrayList);
            }
            AnonymousClass7TF.A1L("value_props", r8, "ProductValuePropComponent");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
