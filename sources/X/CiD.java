package X;

import com.instagram.creatortools.api.schemas.EligibilityCriteria;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class CiD {
    public static C53398GnV parseFromJson(16F r13) {
        String str;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            EligibilityCriteria eligibilityCriteria = null;
            ArrayList arrayList = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("asset_name".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if ("display_text".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("eligibility_criteria".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    eligibilityCriteria = (EligibilityCriteria) EligibilityCriteria.A01.get(str);
                    if (eligibilityCriteria == null) {
                        eligibilityCriteria = EligibilityCriteria.UNRECOGNIZED;
                    }
                } else if (!"link_text".equals(A17)) {
                    bool = C41847B3o.A0z(r13, bool, A17, "passes_criteria");
                } else if (r13.A11() == 16L.A0C) {
                    arrayList = AnonymousClass7TE.A1C();
                    while (r13.A1J() != 16L.A08) {
                        N49 parseFromJson = C44205CZs.parseFromJson(r13);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r13.A0z();
            }
            if (str2 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("asset_name", r13, "EligibilityCriteriaInfo");
            } else if (str3 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_text", r13, "EligibilityCriteriaInfo");
            } else if (eligibilityCriteria == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("eligibility_criteria", r13, "EligibilityCriteriaInfo");
            } else if (bool != null || !(r13 instanceof 0c9)) {
                return new C53398GnV(eligibilityCriteria, str2, str3, (List) arrayList, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("passes_criteria", r13, "EligibilityCriteriaInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
