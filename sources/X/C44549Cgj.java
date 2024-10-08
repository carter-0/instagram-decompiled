package X;

import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.XFBIGBoostAudienceGeolocationImportance;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cgj  reason: case insensitive filesystem */
public abstract class C44549Cgj {
    public static BBN parseFromJson(16F r25) {
        String A00;
        String str;
        String str2;
        16F r12 = r25;
        0qQ.A0B(r12, 0);
        try {
            Integer num = null;
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num2 = null;
            String str3 = null;
            AdsTargetingGender adsTargetingGender = null;
            XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            Boolean bool = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r11 = 16L.A09;
                A00 = AnonymousClass000.A00(2666);
                if (A1J == r11) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if (A00.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("genders".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                    adsTargetingGender = (AdsTargetingGender) AdsTargetingGender.A01.get(str2);
                    if (adsTargetingGender == null) {
                        adsTargetingGender = AdsTargetingGender.UNRECOGNIZED;
                    }
                } else if ("geolocation_importance".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    xFBIGBoostAudienceGeolocationImportance = (XFBIGBoostAudienceGeolocationImportance) XFBIGBoostAudienceGeolocationImportance.A01.get(str);
                    if (xFBIGBoostAudienceGeolocationImportance == null) {
                        xFBIGBoostAudienceGeolocationImportance = XFBIGBoostAudienceGeolocationImportance.UNRECOGNIZED;
                    }
                } else if ("geolocations".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            BBK parseFromJson = C44554Cgo.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("interests".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            N49 parseFromJson2 = C44059CUc.parseFromJson(r12);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("max_age".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("min_age".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r12);
                } else if (!C41845B3m.A19(A17)) {
                    bool = C41847B3o.A0z(r12, bool, A17, AnonymousClass000.A00(4064));
                } else if (r12.A11() == 16L.A0G) {
                    str4 = null;
                } else {
                    str4 = r12.A1P();
                }
                r12.A0z();
            }
            if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r12, "UnifiedAudienceGenericResponsePayload");
            } else if (adsTargetingGender == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("genders", r12, "UnifiedAudienceGenericResponsePayload");
            } else if (arrayList == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("geolocations", r12, "UnifiedAudienceGenericResponsePayload");
            } else if (arrayList2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("interests", r12, "UnifiedAudienceGenericResponsePayload");
            } else if (num == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("max_age", r12, "UnifiedAudienceGenericResponsePayload");
            } else if (num2 != null || !(r12 instanceof 0c9)) {
                return new BBN(adsTargetingGender, xFBIGBoostAudienceGeolocationImportance, bool, str3, str4, arrayList, arrayList2, num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("min_age", r12, "UnifiedAudienceGenericResponsePayload");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
