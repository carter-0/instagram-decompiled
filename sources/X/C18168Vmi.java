package X;

import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vmi  reason: case insensitive filesystem */
public final class C18168Vmi {
    public static PromoteAudienceInfo parseFromJson(16F r9) {
        AudienceGender audienceGender;
        0qQ.A0B(r9, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                ArrayList arrayList = null;
                if ("audience_id".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r9);
                } else if ("display_name".equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r9);
                } else if ("min_age".equals(A17)) {
                    r0.A01 = r9.A1D();
                } else if ("max_age".equals(A17)) {
                    r0.A00 = r9.A1D();
                } else if ("genders".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            String A1Q = r9.A1Q();
                            0qQ.A0B(A1Q, 0);
                            AudienceGender[] values = AudienceGender.values();
                            int length = values.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    audienceGender = AudienceGender.MALE;
                                    break;
                                }
                                audienceGender = values[i];
                                if (0qQ.A0K(audienceGender.A00, A1Q)) {
                                    break;
                                }
                                i++;
                            }
                            arrayList.add(audienceGender);
                        }
                    }
                    r0.A06 = arrayList;
                } else if ("geo_locations".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            AudienceGeoLocation parseFromJson = VAL.parseFromJson(r9);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r0.A07 = arrayList;
                } else if ("interests".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            AudienceInterest parseFromJson2 = VAM.parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r0.A08 = arrayList;
                } else if ("target_relax_option".equals(A17)) {
                    TargetingRelaxationConstants targetingRelaxationConstants = (TargetingRelaxationConstants) TargetingRelaxationConstants.A01.get(AnonymousClass7TG.A0l(r9));
                    if (targetingRelaxationConstants == null) {
                        targetingRelaxationConstants = TargetingRelaxationConstants.UNRECOGNIZED;
                    }
                    r0.A03 = targetingRelaxationConstants;
                } else if ("advantage_audience".equals(A17)) {
                    r0.A02 = V72.parseFromJson(r9);
                } else {
                    1XY.A01(r9, r0, A17);
                }
                r9.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
