package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CmN  reason: case insensitive filesystem */
public abstract class C44871CmN {
    public static AnonymousClass3IB parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            C42123BIb bIb = null;
            String str2 = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("ad_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("is_demo".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r15);
                } else if ("learn_more".equals(A17)) {
                    bIb = C44873CmP.parseFromJson(r15);
                } else if ("primer_message".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("questions".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C42124BIc parseFromJson = C44875CmR.parseFromJson(r15);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("show_primer".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r15);
                } else if ("show_results".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r15);
                } else if ("survey_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("survey_type".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str3 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("survey_id", r15, "BrandResearchSurvey");
            } else if (str4 != null || !(r15 instanceof 0c9)) {
                return new AnonymousClass3IB(bIb, bool, bool2, bool3, str, str2, str3, str4, str5, arrayList);
            } else {
                AnonymousClass7TF.A1L("survey_type", r15, "BrandResearchSurvey");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
