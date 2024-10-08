package X;

import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.PromoteAudience;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAP {
    public static PromoteAudience parseFromJson(16F r6) {
        String str;
        0qQ.A0B(r6, 0);
        try {
            PromoteAudience promoteAudience = new PromoteAudience();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                ArrayList arrayList = null;
                if ("audience_id".equals(A17)) {
                    promoteAudience.A05 = AnonymousClass7TG.A0l(r6);
                } else if ("display_name".equals(A17)) {
                    promoteAudience.A07 = AnonymousClass7TG.A0l(r6);
                } else if ("target_spec_string".equals(A17)) {
                    promoteAudience.A06 = AnonymousClass7TG.A0l(r6);
                } else if ("audience_code".equals(A17)) {
                    BoostedPostAudienceOption boostedPostAudienceOption = (BoostedPostAudienceOption) BoostedPostAudienceOption.A01.get(AnonymousClass7TG.A0l(r6));
                    if (boostedPostAudienceOption == null) {
                        boostedPostAudienceOption = BoostedPostAudienceOption.UNRECOGNIZED;
                    }
                    promoteAudience.A03 = boostedPostAudienceOption;
                } else if ("min_age".equals(A17)) {
                    promoteAudience.A01 = r6.A1D();
                } else if ("max_age".equals(A17)) {
                    promoteAudience.A00 = r6.A1D();
                } else if ("genders".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            if (r6.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r6.A1P();
                            }
                            AdsTargetingGender adsTargetingGender = (AdsTargetingGender) AdsTargetingGender.A01.get(str);
                            if (adsTargetingGender == null) {
                                adsTargetingGender = AdsTargetingGender.UNRECOGNIZED;
                            }
                            arrayList2.add(adsTargetingGender);
                        }
                        arrayList = arrayList2;
                    }
                    0qQ.A0B(arrayList, 0);
                    promoteAudience.A08 = arrayList;
                } else if ("geo_locations".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r6, arrayList);
                        }
                    }
                    promoteAudience.A09 = arrayList;
                } else if ("interests".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r6, arrayList);
                        }
                    }
                    promoteAudience.A0A = arrayList;
                } else if ("target_relax_option".equals(A17)) {
                    TargetingRelaxationConstants targetingRelaxationConstants = (TargetingRelaxationConstants) TargetingRelaxationConstants.A01.get(AnonymousClass7TG.A0l(r6));
                    if (targetingRelaxationConstants == null) {
                        targetingRelaxationConstants = TargetingRelaxationConstants.UNRECOGNIZED;
                    }
                    promoteAudience.A04 = targetingRelaxationConstants;
                } else if ("validation_responses".equals(A17)) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r6.A1J() != 16L.A08) {
                            AudienceValidationResponse parseFromJson = C44064CUh.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    promoteAudience.A0B = arrayList;
                } else if (AnonymousClass000.A00(4064).equals(A17)) {
                    promoteAudience.A0C = r6.A0d();
                } else if ("subject_to_taiwan_finserv".equals(A17)) {
                    promoteAudience.A0D = r6.A0d();
                } else if ("advantage_audience".equals(A17)) {
                    promoteAudience.A02 = V72.parseFromJson(r6);
                }
                r6.A0z();
            }
            return promoteAudience;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
