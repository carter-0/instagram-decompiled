package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CYv  reason: case insensitive filesystem */
public abstract class C44182CYv {
    public static BF6 parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("disclaimerBodyRanges".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            BF7 parseFromJson = C44184CYx.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("disclaimerText".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("eligibleExperienceType".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    iGPostClickEligibleExperienceTypes = (IGPostClickEligibleExperienceTypes) IGPostClickEligibleExperienceTypes.A01.get(str);
                    if (iGPostClickEligibleExperienceTypes == null) {
                        iGPostClickEligibleExperienceTypes = IGPostClickEligibleExperienceTypes.UNRECOGNIZED;
                    }
                }
                r6.A0z();
            }
            return new BF6(iGPostClickEligibleExperienceTypes, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
