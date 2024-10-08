package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;
import java.io.IOException;

public abstract class CXB {
    public static C47194Dsg parseFromJson(16F r32) {
        String A00;
        String str;
        16F r8 = r32;
        0qQ.A0B(r8, 0);
        try {
            Integer num = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            IGCreatorIncentiveProgram iGCreatorIncentiveProgram = null;
            String str6 = null;
            C42066BFt bFt = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r14 = 16L.A09;
                A00 = AnonymousClass000.A00(583);
                if (A1J == r14) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("deal_delivery_end_date".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("deal_delivery_start_date".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else if ("deal_description".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("deal_template_contract_terms".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("deal_template_hr_program".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if ("deal_template_program".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    iGCreatorIncentiveProgram = (IGCreatorIncentiveProgram) IGCreatorIncentiveProgram.A01.get(str);
                    if (iGCreatorIncentiveProgram == null) {
                        iGCreatorIncentiveProgram = IGCreatorIncentiveProgram.UNRECOGNIZED;
                    }
                } else if ("deal_total_contract_value".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r8.A1P();
                    }
                } else if ("deferred_onboarding_eligible".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("is_deal_template_ig_bonus_program".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r8);
                } else if ("reels_on_the_rise_details".equals(A17)) {
                    bFt = C44247Cbi.parseFromJson(r8);
                } else {
                    num3 = C41847B3o.A13(r8, num3, A17, "reels_performance_fund_play_count");
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_delivery_end_date", r8, "DealTemplateMetadata");
            } else if (num2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_delivery_start_date", r8, "DealTemplateMetadata");
            } else if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_description", r8, "DealTemplateMetadata");
            } else if (str3 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_template_contract_terms", r8, "DealTemplateMetadata");
            } else if (str4 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_template_hr_program", r8, "DealTemplateMetadata");
            } else if (str5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r8, "DealTemplateMetadata");
            } else if (iGCreatorIncentiveProgram == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_template_program", r8, "DealTemplateMetadata");
            } else if (str6 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deal_total_contract_value", r8, "DealTemplateMetadata");
            } else if (bool == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("deferred_onboarding_eligible", r8, "DealTemplateMetadata");
            } else if (bool2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("is_deal_template_ig_bonus_program", r8, "DealTemplateMetadata");
            } else if (num3 != null || !(r8 instanceof 0c9)) {
                return new C47194Dsg(iGCreatorIncentiveProgram, bFt, str2, str3, str4, str5, str6, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                AnonymousClass7TF.A1L("reels_performance_fund_play_count", r8, "DealTemplateMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
