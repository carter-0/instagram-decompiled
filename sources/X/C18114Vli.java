package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vli  reason: case insensitive filesystem */
public final class C18114Vli {
    public static C15237UWx parseFromJson(16F r44) {
        String str;
        16F r1 = r44;
        0qQ.A0B(r1, 0);
        try {
            1XQ r14 = new 1XQ();
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            while (r1.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r1);
                ArrayList arrayList = null;
                if ("boosting_status".equals(A17)) {
                    BoostedActionStatus boostedActionStatus = (BoostedActionStatus) BoostedActionStatus.A01.get(AnonymousClass7TG.A0l(r1));
                    if (boostedActionStatus == null) {
                        boostedActionStatus = BoostedActionStatus.UNRECOGNIZED;
                    }
                    r14.A02 = boostedActionStatus;
                } else if ("cta_link".equals(A17)) {
                    r14.A0J = AnonymousClass7TG.A0l(r1);
                } else if ("cta_type".equals(A17)) {
                    CallToActionType callToActionType = (CallToActionType) CallToActionType.A01.get(AnonymousClass7TG.A0l(r1));
                    if (callToActionType == null) {
                        callToActionType = CallToActionType.UNRECOGNIZED;
                    }
                    r14.A03 = callToActionType;
                } else if ("currency".equals(A17)) {
                    r14.A0K = AnonymousClass7TG.A0l(r1);
                } else if ("currency_offset".equals(A17)) {
                    r14.A08 = AnonymousClass7TF.A0X(r1);
                } else if ("daily_spend_offset_amount".equals(A17)) {
                    r14.A09 = AnonymousClass7TF.A0X(r1);
                } else if ("display_audience_subtitle".equals(A17)) {
                    r14.A0L = AnonymousClass7TG.A0l(r1);
                } else if ("display_budget_and_duration_subtitle".equals(A17)) {
                    r14.A0M = AnonymousClass7TG.A0l(r1);
                } else if ("display_destination_subtitle".equals(A17)) {
                    r14.A0N = AnonymousClass7TG.A0l(r1);
                } else if ("elapsed_duration_in_days".equals(A17)) {
                    r14.A0A = AnonymousClass7TF.A0X(r1);
                } else if ("error".equals(A17)) {
                    r14.A06 = C44284CcS.parseFromJson(r1);
                } else if ("instagram_positions".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (r1.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r1.A1P();
                            }
                            arrayList2.add(V70.A00(str));
                        }
                        arrayList = arrayList2;
                    }
                    r14.A0T = arrayList;
                } else if ("media_fbid".equals(A17)) {
                    r14.A0O = AnonymousClass7TG.A0l(r1);
                } else if ("media_product_type".equals(A17)) {
                    InstagramMediaProductType instagramMediaProductType = (InstagramMediaProductType) InstagramMediaProductType.A01.get(AnonymousClass7TG.A0l(r1));
                    if (instagramMediaProductType == null) {
                        instagramMediaProductType = InstagramMediaProductType.UNRECOGNIZED;
                    }
                    r14.A05 = instagramMediaProductType;
                } else if ("objective".equals(A17)) {
                    AdproObjectiveTypesEnum adproObjectiveTypesEnum = (AdproObjectiveTypesEnum) AdproObjectiveTypesEnum.A01.get(AnonymousClass7TG.A0l(r1));
                    if (adproObjectiveTypesEnum == null) {
                        adproObjectiveTypesEnum = AdproObjectiveTypesEnum.UNRECOGNIZED;
                    }
                    r14.A00 = adproObjectiveTypesEnum;
                } else if ("political_ads_byline_text".equals(A17)) {
                    r14.A0P = AnonymousClass7TG.A0l(r1);
                } else if ("regulated_category".equals(A17)) {
                    AdproRegulatedCategory adproRegulatedCategory = (AdproRegulatedCategory) AdproRegulatedCategory.A01.get(AnonymousClass7TG.A0l(r1));
                    if (adproRegulatedCategory == null) {
                        adproRegulatedCategory = AdproRegulatedCategory.UNRECOGNIZED;
                    }
                    r14.A01 = adproRegulatedCategory;
                } else if ("remaining_budget_offset_amount".equals(A17)) {
                    r14.A0B = AnonymousClass7TF.A0X(r1);
                } else if ("remaining_duration_in_days".equals(A17)) {
                    r14.A0C = AnonymousClass7TF.A0X(r1);
                } else if ("run_continuously".equals(A17)) {
                    r14.A07 = AnonymousClass7TF.A0S(r1);
                } else if ("spent_budget_offset_amount".equals(A17)) {
                    r14.A0D = AnonymousClass7TF.A0X(r1);
                } else if (TraceFieldType.StartTime.equals(A17)) {
                    r14.A0H = AnonymousClass7TF.A0Z(r1);
                } else if ("stop_time".equals(A17)) {
                    r14.A0I = AnonymousClass7TF.A0Z(r1);
                } else if ("thumbnail_url".equals(A17)) {
                    r14.A0Q = AnonymousClass7TG.A0l(r1);
                } else if ("time_remaining_in_hours".equals(A17)) {
                    r14.A0E = AnonymousClass7TF.A0X(r1);
                } else if ("total_budget_formatted".equals(A17)) {
                    r14.A0R = AnonymousClass7TG.A0l(r1);
                } else if ("total_budget_offset_amount".equals(A17)) {
                    r14.A0F = AnonymousClass7TF.A0X(r1);
                } else if ("total_duration_in_days".equals(A17)) {
                    r14.A0G = AnonymousClass7TF.A0X(r1);
                } else if (Dbk.A00().equals(A17)) {
                    r14.A0S = AnonymousClass7TG.A0l(r1);
                } else {
                    1XY.A01(r1, r14, A17);
                }
                r1.A0z();
            }
            BoostedActionStatus boostedActionStatus2 = r14.A02;
            String str2 = r14.A0J;
            CallToActionType callToActionType2 = r14.A03;
            String str3 = r14.A0K;
            Integer num = r14.A08;
            Integer num2 = r14.A09;
            String str4 = r14.A0L;
            String str5 = r14.A0M;
            String str6 = r14.A0N;
            Integer num3 = r14.A0A;
            UKM ukm = r14.A06;
            List list = r14.A0T;
            String str7 = r14.A0O;
            InstagramMediaProductType instagramMediaProductType2 = r14.A05;
            AdproObjectiveTypesEnum adproObjectiveTypesEnum2 = r14.A00;
            String str8 = r14.A0P;
            AdproRegulatedCategory adproRegulatedCategory2 = r14.A01;
            Integer num4 = r14.A0B;
            Integer num5 = r14.A0C;
            boolean A14 = C41845B3m.A14(r14.A07);
            Integer num6 = r14.A0D;
            Long l = r14.A0H;
            Long l2 = r14.A0I;
            String str9 = r14.A0Q;
            Integer num7 = r14.A0E;
            String str10 = r14.A0R;
            List list2 = list;
            r14.A04 = new UL2(adproObjectiveTypesEnum2, adproRegulatedCategory2, boostedActionStatus2, callToActionType2, instagramMediaProductType2, ukm, num, num2, num3, num4, num5, num6, num7, r14.A0F, r14.A0G, l, l2, str2, str3, str4, str5, str6, str7, str8, str9, str10, r14.A0S, list2, A14);
            return r14;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
