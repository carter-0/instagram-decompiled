package X;

import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;
import java.io.IOException;

/* renamed from: X.4l3  reason: invalid class name and case insensitive filesystem */
public abstract class C272624l3 {
    public static C272664lA parseFromJson(16F r22) {
        String str;
        String str2;
        String str3;
        String str4;
        16F r6 = r22;
        0qQ.A0B(r6, 0);
        try {
            Boolean bool = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Boolean bool2 = null;
            C272654l8 r14 = null;
            CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct = null;
            C42033BEk bEk = null;
            HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct = null;
            MonetizationEligibilityDecision monetizationEligibilityDecision = null;
            C61110JxM jxM = null;
            AnonymousClass9IE r12 = null;
            UserMonetizationProductType userMonetizationProductType = null;
            C61074JwC jwC = null;
            while (r6.A1J() != 16L.A09) {
                String A0q = r6.A0q();
                r6.A1J();
                if ("branded_content_config".equals(A0q)) {
                    r14 = C272644l7.parseFromJson(r6);
                } else if ("can_use_product".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r6.A1P();
                    }
                    canUseCreatorMonetizationProduct = (CanUseCreatorMonetizationProduct) CanUseCreatorMonetizationProduct.A01.get(str4);
                    if (canUseCreatorMonetizationProduct == null) {
                        canUseCreatorMonetizationProduct = CanUseCreatorMonetizationProduct.UNRECOGNIZED;
                    }
                } else if ("fan_club_config".equals(A0q)) {
                    bEk = CXZ.parseFromJson(r6);
                } else if ("has_onboarded".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                    hasOnboardedCreatorMonetizationProduct = (HasOnboardedCreatorMonetizationProduct) HasOnboardedCreatorMonetizationProduct.A01.get(str3);
                    if (hasOnboardedCreatorMonetizationProduct == null) {
                        hasOnboardedCreatorMonetizationProduct = HasOnboardedCreatorMonetizationProduct.UNRECOGNIZED;
                    }
                } else if ("is_eligible_to_onboard".equals(A0q)) {
                    bool = Boolean.valueOf(r6.A0d());
                } else if ("mes_status".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                    monetizationEligibilityDecision = C272514kr.A00(str2);
                } else if ("paid_partnership_label_config".equals(A0q)) {
                    jxM = C63024KqF.parseFromJson(r6);
                } else if ("product_config".equals(A0q)) {
                    r12 = C272634l6.parseFromJson(r6);
                } else if ("product_type".equals(A0q)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    userMonetizationProductType = C272504kq.A00(str);
                } else if ("revshare_config".equals(A0q)) {
                    jwC = C44318Cd0.parseFromJson(r6);
                } else if ("show_in_settings".equals(A0q)) {
                    bool2 = Boolean.valueOf(r6.A0d());
                }
                r6.A0z();
            }
            if (canUseCreatorMonetizationProduct == null && (r6 instanceof 0c9)) {
                ((0c9) r6).A03.A00("can_use_product", "ProductGatingDecision");
            } else if (hasOnboardedCreatorMonetizationProduct == null && (r6 instanceof 0c9)) {
                ((0c9) r6).A03.A00("has_onboarded", "ProductGatingDecision");
            } else if (bool == null && (r6 instanceof 0c9)) {
                ((0c9) r6).A03.A00("is_eligible_to_onboard", "ProductGatingDecision");
            } else if (userMonetizationProductType == null && (r6 instanceof 0c9)) {
                ((0c9) r6).A03.A00("product_type", "ProductGatingDecision");
            } else if (bool2 != null || !(r6 instanceof 0c9)) {
                return new C272664lA(r12, jwC, r14, canUseCreatorMonetizationProduct, bEk, hasOnboardedCreatorMonetizationProduct, monetizationEligibilityDecision, jxM, userMonetizationProductType, bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r6).A03.A00("show_in_settings", "ProductGatingDecision");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
