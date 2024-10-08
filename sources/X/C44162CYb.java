package X;

import com.instagram.api.schemas.IABPostClickDataDictImpl;
import com.instagram.api.schemas.IABPostClickEligibleExperienceTypes;
import com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDictImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CYb  reason: case insensitive filesystem */
public abstract class C44162CYb {
    public static IABPostClickDataDictImpl parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            IGBWPIABPostClickDataExtensionDictImpl iGBWPIABPostClickDataExtensionDictImpl = null;
            ArrayList arrayList = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("buyWithPrimeIABPostClickDataExtension".equals(A17)) {
                    iGBWPIABPostClickDataExtensionDictImpl = C48332Ecp.parseFromJson(r5);
                } else if ("eligibleExperienceTypes".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            if (r5.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r5.A1P();
                            }
                            IABPostClickEligibleExperienceTypes iABPostClickEligibleExperienceTypes = (IABPostClickEligibleExperienceTypes) IABPostClickEligibleExperienceTypes.A01.get(str);
                            if (iABPostClickEligibleExperienceTypes == null) {
                                iABPostClickEligibleExperienceTypes = IABPostClickEligibleExperienceTypes.UNRECOGNIZED;
                            }
                            arrayList.add(iABPostClickEligibleExperienceTypes);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r5.A0z();
            }
            return new IABPostClickDataDictImpl(iGBWPIABPostClickDataExtensionDictImpl, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
