package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3lI  reason: invalid class name and case insensitive filesystem */
public abstract class C250343lI {
    public static C250353lJ parseFromJson(16F r12) {
        String str;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            QPf qPf = null;
            BF4 bf4 = null;
            ArrayList arrayList = null;
            AnonymousClass53S r5 = null;
            ArrayList arrayList2 = null;
            Long l = null;
            BF8 bf8 = null;
            QPh qPh = null;
            C269974fz r8 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("buyWithIntegrationIABPostClickDataExtension".equals(A0q)) {
                    qPf = C255053tV.parseFromJson(r12);
                } else if ("buyWithPrimeIABPostClickDataExtension".equals(A0q)) {
                    bf4 = C255063tW.parseFromJson(r12);
                } else if ("eligibleExperienceTypes".equals(A0q)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r12.A1J() != 16L.A08) {
                            if (r12.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r12.A1P();
                            }
                            IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes = (IGPostClickEligibleExperienceTypes) IGPostClickEligibleExperienceTypes.A01.get(str);
                            if (iGPostClickEligibleExperienceTypes == null) {
                                iGPostClickEligibleExperienceTypes = IGPostClickEligibleExperienceTypes.UNRECOGNIZED;
                            }
                            arrayList.add(iGPostClickEligibleExperienceTypes);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("iabAutofillAdsPersonalizationPostClickDataExtension".equals(A0q)) {
                    r5 = C255103ta.parseFromJson(r12);
                } else if ("iabPostClickDisclaimers".equals(A0q)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r12.A1J() != 16L.A08) {
                            BF6 parseFromJson = C44182CYv.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("impressionTime".equals(A0q)) {
                    l = Long.valueOf(r12.A0y());
                } else if ("metaCheckoutIABPostClickDataExtension".equals(A0q)) {
                    bf8 = C255073tX.parseFromJson(r12);
                } else if ("metaPaymentsSDKIABPostClickDataExtension".equals(A0q)) {
                    qPh = C255083tY.parseFromJson(r12);
                } else if ("promoAdsAutofillPostClickDataExtension".equals(A0q)) {
                    r8 = C255093tZ.parseFromJson(r12);
                }
                r12.A0z();
            }
            return new C250353lJ(qPf, bf4, r5, bf8, qPh, r8, l, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
