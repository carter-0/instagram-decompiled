package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VCK {
    public static C17629VbL parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17629VbL vbL = new C17629VbL();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("__typename".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("logging_token".equals(A17)) {
                    vbL.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("document_element_type".equals(A17)) {
                    vbL.A03 = (C16668Uz4) EnumHelper.A00(r4.A1Q(), C16668Uz4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("image_versions2".equals(A17)) {
                    vbL.A00 = VCM.parseFromJson(r4);
                } else if ("element_descriptor".equals(A17)) {
                    vbL.A01 = VCR.parseFromJson(r4);
                } else if ("element_text".equals(A17)) {
                    vbL.A02 = VCU.parseFromJson(r4);
                } else if ("style_list".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C13990Tnq.A1A(r4, arrayList);
                        }
                    }
                    vbL.A06 = arrayList;
                } else if ("android_links".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            VY3 parseFromJson = VCD.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vbL.A05 = arrayList;
                }
                r4.A0z();
            }
            return vbL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
