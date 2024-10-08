package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CZd  reason: case insensitive filesystem */
public abstract class C44190CZd {
    public static C61084JwM parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            C47194Dsg dsg = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("active_deal_templates".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C60981Jud parseFromJson = CV1.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("available_deal_templates_to_onboard".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            C47194Dsg parseFromJson2 = CXB.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("deal_template_to_onboard".equals(A17)) {
                    dsg = CXB.parseFromJson(r9);
                }
                r9.A0z();
            }
            if (arrayList == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("active_deal_templates", r9, "IncentivePlatformOnboardingConfig");
            } else if (arrayList2 != null || !(r9 instanceof 0c9)) {
                return new C61084JwM(dsg, (List) arrayList, (List) arrayList2);
            } else {
                AnonymousClass7TF.A1L("available_deal_templates_to_onboard", r9, "IncentivePlatformOnboardingConfig");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
