package X;

import com.instagram.api.schemas.AudienceMessageEntityRangeImpl;
import com.instagram.api.schemas.AudienceValidationActionImpl;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.BoostedComponentMessageType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CUh  reason: case insensitive filesystem */
public abstract class C44064CUh {
    public static AudienceValidationResponse parseFromJson(16F r13) {
        String A00;
        String str;
        String str2;
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            BoostedComponentMessageType boostedComponentMessageType = null;
            AudienceValidationResponseStatus audienceValidationResponseStatus = null;
            String str4 = null;
            while (true) {
                16L A1J = r13.A1J();
                16L r1 = 16L.A09;
                A00 = AnonymousClass000.A00(1596);
                if (A1J == r1) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r13);
                if ("available_actions".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            AudienceValidationActionImpl parseFromJson = C44063CUg.parseFromJson(r13);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_message".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r13.A1P();
                    }
                } else if ("entity_ranges".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            AudienceMessageEntityRangeImpl parseFromJson2 = C44062CUf.parseFromJson(r13);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (A00.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                    boostedComponentMessageType = (BoostedComponentMessageType) BoostedComponentMessageType.A01.get(str2);
                    if (boostedComponentMessageType == null) {
                        boostedComponentMessageType = BoostedComponentMessageType.UNRECOGNIZED;
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                    audienceValidationResponseStatus = (AudienceValidationResponseStatus) AudienceValidationResponseStatus.A01.get(str);
                    if (audienceValidationResponseStatus == null) {
                        audienceValidationResponseStatus = AudienceValidationResponseStatus.UNRECOGNIZED;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r13.A1P();
                    }
                }
                r13.A0z();
            }
            if (str3 == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("display_message", r13, "AudienceValidationResponse");
            } else if (boostedComponentMessageType == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r13, "AudienceValidationResponse");
            } else if (audienceValidationResponseStatus != null || !(r13 instanceof 0c9)) {
                return new AudienceValidationResponse(audienceValidationResponseStatus, boostedComponentMessageType, str3, str4, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r13, "AudienceValidationResponse");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
