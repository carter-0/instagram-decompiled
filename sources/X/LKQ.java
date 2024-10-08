package X;

import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.IOException;

public abstract class LKQ {
    public static ExistingStandaloneFundraiserForFeedModel parseFromJson(16F r11) {
        String A00;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r11.A1J();
                16L r7 = 16L.A09;
                A00 = AnonymousClass000.A00(3151);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r11);
                if ("fundraiser_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("beneficiary_short_name".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (A00.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if ("full_formatted_goal_amount_str".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("fundraiser_id", r11, "ExistingStandaloneFundraiserForFeedModel");
            } else if (str2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("beneficiary_short_name", r11, "ExistingStandaloneFundraiserForFeedModel");
            } else if (str3 != null || !(r11 instanceof 0c9)) {
                return new ExistingStandaloneFundraiserForFeedModel(str, str2, str3, str4);
            } else {
                AnonymousClass7TF.A1L(A00, r11, "ExistingStandaloneFundraiserForFeedModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        r2.A0c();
        r2.A0R("fundraiser_id", existingStandaloneFundraiserForFeedModel.A03);
        r2.A0R("beneficiary_short_name", existingStandaloneFundraiserForFeedModel.A00);
        r2.A0R(AnonymousClass000.A00(3151), existingStandaloneFundraiserForFeedModel.A01);
        String str = existingStandaloneFundraiserForFeedModel.A02;
        if (str != null) {
            r2.A0R("full_formatted_goal_amount_str", str);
        }
        r2.A0Z();
    }
}
