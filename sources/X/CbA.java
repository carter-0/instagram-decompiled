package X;

import com.instagram.api.schemas.OrganicCTAType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CbA {
    public static AnonymousClass5HS parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str2 = null;
            OrganicCTAType organicCTAType = null;
            ArrayList arrayList = null;
            String str3 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if ("cta_action_links".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r10, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("cta_subtitle".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if ("cta_title".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("cta_type".equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    organicCTAType = (OrganicCTAType) OrganicCTAType.A01.get(str);
                    if (organicCTAType == null) {
                        organicCTAType = OrganicCTAType.UNRECOGNIZED;
                    }
                }
                r10.A0z();
            }
            if (str2 == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cta_title", r10, "OrganicCTADict");
            } else if (organicCTAType != null || !(r10 instanceof 0c9)) {
                return new AnonymousClass5HS(organicCTAType, str3, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("cta_type", r10, "OrganicCTADict");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
