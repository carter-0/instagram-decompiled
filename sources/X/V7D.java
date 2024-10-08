package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class V7D {
    public static C381599c1 parseFromJson(16F r34) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        16F r5 = r34;
        0qQ.A0B(r5, 0);
        try {
            Boolean bool = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            BoostedActionStatus boostedActionStatus = null;
            String str6 = null;
            CallToActionType callToActionType = null;
            String str7 = null;
            Integer num = null;
            Integer num2 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Integer num3 = null;
            UKM ukm = null;
            ArrayList arrayList = null;
            String str11 = null;
            InstagramMediaProductType instagramMediaProductType = null;
            String str12 = null;
            AdproRegulatedCategory adproRegulatedCategory = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Long l = null;
            Long l2 = null;
            String str13 = null;
            Integer num7 = null;
            String str14 = null;
            Integer num8 = null;
            Integer num9 = null;
            String str15 = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("boosting_status".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                    boostedActionStatus = (BoostedActionStatus) BoostedActionStatus.A01.get(str5);
                    if (boostedActionStatus == null) {
                        boostedActionStatus = BoostedActionStatus.UNRECOGNIZED;
                    }
                } else if ("cta_link".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                } else if ("cta_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                    callToActionType = (CallToActionType) CallToActionType.A01.get(str4);
                    if (callToActionType == null) {
                        callToActionType = CallToActionType.UNRECOGNIZED;
                    }
                } else if ("currency".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r5.A1P();
                    }
                } else if ("currency_offset".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("daily_spend_offset_amount".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if ("display_audience_subtitle".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r5.A1P();
                    }
                } else if ("display_budget_and_duration_subtitle".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r5.A1P();
                    }
                } else if ("display_destination_subtitle".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r5.A1P();
                    }
                } else if ("elapsed_duration_in_days".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r5);
                } else if ("error".equals(A17)) {
                    ukm = C44284CcS.parseFromJson(r5);
                } else if ("instagram_positions".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            if (r5.A11() == 16L.A0G) {
                                str3 = null;
                            } else {
                                str3 = r5.A1P();
                            }
                            arrayList.add(V70.A00(str3));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_fbid".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r5.A1P();
                    }
                } else if ("media_product_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                    instagramMediaProductType = (InstagramMediaProductType) InstagramMediaProductType.A01.get(str2);
                    if (instagramMediaProductType == null) {
                        instagramMediaProductType = InstagramMediaProductType.UNRECOGNIZED;
                    }
                } else if ("political_ads_byline_text".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r5.A1P();
                    }
                } else if ("regulated_category".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    adproRegulatedCategory = (AdproRegulatedCategory) AdproRegulatedCategory.A01.get(str);
                    if (adproRegulatedCategory == null) {
                        adproRegulatedCategory = AdproRegulatedCategory.UNRECOGNIZED;
                    }
                } else if ("remaining_budget_offset_amount".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r5);
                } else if ("remaining_duration_in_days".equals(A17)) {
                    num5 = AnonymousClass7TF.A0X(r5);
                } else if ("run_continuously".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r5);
                } else if ("spent_budget_offset_amount".equals(A17)) {
                    num6 = AnonymousClass7TF.A0X(r5);
                } else if (TraceFieldType.StartTime.equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r5);
                } else if ("stop_time".equals(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r5);
                } else if ("thumbnail_url".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r5.A1P();
                    }
                } else if ("time_remaining_in_hours".equals(A17)) {
                    num7 = AnonymousClass7TF.A0X(r5);
                } else if ("total_budget_formatted".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r5.A1P();
                    }
                } else if ("total_budget_offset_amount".equals(A17)) {
                    num8 = AnonymousClass7TF.A0X(r5);
                } else if ("total_duration_in_days".equals(A17)) {
                    num9 = AnonymousClass7TF.A0X(r5);
                } else if (Dbk.A00().equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r5.A1P();
                    }
                }
                r5.A0z();
            }
            if (bool != null || !(r5 instanceof 0c9)) {
                return new C381599c1(adproRegulatedCategory, boostedActionStatus, callToActionType, instagramMediaProductType, ukm, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, arrayList, bool.booleanValue());
            }
            AnonymousClass7TF.A1L("run_continuously", r5, "FetchCampaignControlsResponse");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
