package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VCE {
    public static C17581VaZ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17581VaZ vaZ = new C17581VaZ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("color".equals(A17)) {
                    vaZ.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("logging_token".equals(A17)) {
                    vaZ.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("document_element_type".equals(A17)) {
                    EnumHelper.A00(r4.A1Q(), C16668Uz4.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("element_descriptor".equals(A17)) {
                    vaZ.A00 = VCR.parseFromJson(r4);
                } else if ("element_text".equals(A17)) {
                    vaZ.A01 = VCU.parseFromJson(r4);
                } else if ("style_list".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C13990Tnq.A1A(r4, arrayList);
                        }
                    }
                    vaZ.A05 = arrayList;
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
                    vaZ.A04 = arrayList;
                }
                r4.A0z();
            }
            return vaZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
