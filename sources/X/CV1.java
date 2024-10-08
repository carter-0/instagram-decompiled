package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

public abstract class CV1 {
    public static C60981Jud parseFromJson(16F r26) {
        String A00;
        String A002;
        String str;
        16F r1 = r26;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            IGCreatorIncentiveProgram iGCreatorIncentiveProgram = null;
            Integer num4 = null;
            String str9 = null;
            String str10 = null;
            while (true) {
                16L A1J = r1.A1J();
                16L r5 = 16L.A09;
                A00 = AnonymousClass000.A00(583);
                A002 = AnonymousClass000.A00(2975);
                if (A1J == r5) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r1);
                if ("boost_activation_params".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if ("creation_time".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if ("deal_deliverable_count".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r1);
                } else if ("deal_end_date".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r1);
                } else if ("deal_estimated_contract_payment".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("deal_id".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if (A002.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("deal_total_contract_value".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if ("incentive_program".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    iGCreatorIncentiveProgram = (IGCreatorIncentiveProgram) IGCreatorIncentiveProgram.A01.get(str);
                    if (iGCreatorIncentiveProgram == null) {
                        iGCreatorIncentiveProgram = IGCreatorIncentiveProgram.UNRECOGNIZED;
                    }
                } else if ("is_deal_template_ig_bonus_program".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("maximum_deliverable_count".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r1);
                } else if ("payout_contract_id".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                }
                r1.A0z();
            }
            if (str4 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_id", r1, "BonusDealMetadata");
            } else if (str5 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r1, "BonusDealMetadata");
            } else if (str6 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r1, "BonusDealMetadata");
            } else if (str8 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r1, "BonusDealMetadata");
            } else if (iGCreatorIncentiveProgram == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("incentive_program", r1, "BonusDealMetadata");
            } else if (bool == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_deal_template_ig_bonus_program", r1, "BonusDealMetadata");
            } else if (str10 != null || !(r1 instanceof 0c9)) {
                return new C60981Jud(iGCreatorIncentiveProgram, num, num2, num3, num4, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r1, "BonusDealMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
