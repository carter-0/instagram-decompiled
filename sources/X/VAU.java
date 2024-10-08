package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode;
import com.instagram.business.promote.model.AdsManagerPaymentAnomalyType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAU {
    public static C19176WOi parseFromJson(16F r9) {
        InstagramMediaProductType instagramMediaProductType;
        String str;
        AdsManagerBoostingStatusErrorCode adsManagerBoostingStatusErrorCode;
        0qQ.A0B(r9, 0);
        try {
            C19176WOi wOi = new C19176WOi();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                ArrayList arrayList = null;
                if ("ads_media_igid".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l, 0);
                    wOi.A0C = A0l;
                } else if ("organic_media_igid".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l2, 0);
                    wOi.A0K = A0l2;
                } else if ("boosted_id".equals(A17)) {
                    wOi.A0F = AnonymousClass7TG.A0l(r9);
                } else if ("boosting_status".equals(A17)) {
                    C16661Uyx uyx = (C16661Uyx) EnumHelper.A00(r9.A1Q(), C16661Uyx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    0qQ.A0B(uyx, 0);
                    wOi.A09 = uyx;
                } else if ("boosting_status_error_code".equals(A17)) {
                    String A1Q = r9.A1Q();
                    0qQ.A0B(A1Q, 0);
                    AdsManagerBoostingStatusErrorCode[] values = AdsManagerBoostingStatusErrorCode.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            adsManagerBoostingStatusErrorCode = values[i];
                            String str2 = adsManagerBoostingStatusErrorCode.A00;
                            if (str2 != null && str2.equalsIgnoreCase(A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            adsManagerBoostingStatusErrorCode = AdsManagerBoostingStatusErrorCode.DEFAULT_DO_NOT_USE;
                            break;
                        }
                    }
                    wOi.A03 = adsManagerBoostingStatusErrorCode;
                } else if ("objective".equals(A17)) {
                    wOi.A02 = C16852V8h.A00(AnonymousClass7TG.A0l(r9));
                } else if ("audience_name".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l3, 0);
                    wOi.A0E = A0l3;
                } else if (AnonymousClass000.A00(1375).equals(A17)) {
                    wOi.A0G = AnonymousClass7TG.A0l(r9);
                } else if ("formatted_spent_budget".equals(A17)) {
                    wOi.A0H = AnonymousClass7TG.A0l(r9);
                } else if ("formatted_time_remaining".equals(A17)) {
                    wOi.A0I = AnonymousClass7TG.A0l(r9);
                } else if ("metric".equals(A17)) {
                    PromotionMetric parseFromJson = VAT.parseFromJson(r9);
                    0qQ.A0B(parseFromJson, 0);
                    wOi.A06 = parseFromJson;
                } else if ("new_leads_count".equals(A17)) {
                    wOi.A00 = r9.A1D();
                } else if ("thumbnail_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r9);
                    0qQ.A0B(A00, 0);
                    wOi.A08 = A00;
                } else if ("cta_type".equals(A17)) {
                    wOi.A01 = XIGIGBoostCallToAction.valueOf(r9.A1Q());
                } else if ("organic_media_fbid".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l4, 0);
                    wOi.A0J = A0l4;
                } else if ("appeal_status".equals(A17)) {
                    wOi.A0A = (C16618UyE) EnumHelper.A00(r9.A1Q(), C16618UyE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("appeal_support_inbox_url".equals(A17)) {
                    wOi.A0D = AnonymousClass7TG.A0l(r9);
                } else if ("rejection_reason".equals(A17)) {
                    wOi.A07 = VAW.parseFromJson(r9);
                } else if ("page_id".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l5, 0);
                    wOi.A0L = A0l5;
                } else if ("instagram_positions".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            if (r9.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r9.A1P();
                            }
                            arrayList2.add(V70.A00(str));
                        }
                        arrayList = arrayList2;
                    }
                    0qQ.A0B(arrayList, 0);
                    wOi.A0N = arrayList;
                } else if ("media_product_type".equals(A17)) {
                    String A1Q2 = r9.A1Q();
                    InstagramMediaProductType[] values2 = InstagramMediaProductType.values();
                    int length2 = values2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            instagramMediaProductType = InstagramMediaProductType.DEFAULT_DO_NOT_USE;
                            break;
                        }
                        instagramMediaProductType = values2[i2];
                        if (00p.A0j(instagramMediaProductType.toString(), A1Q2, true)) {
                            break;
                        }
                        i2++;
                    }
                    wOi.A05 = instagramMediaProductType;
                } else if ("ad_account_id".equals(A17)) {
                    wOi.A0B = AnonymousClass7TG.A0l(r9);
                } else if ("audience_id".equals(A17)) {
                    C41846B3n.A1A(r9);
                } else if ("political_ad_byline_text".equals(A17)) {
                    wOi.A0M = AnonymousClass7TG.A0l(r9);
                } else if ("payment_anomaly_type".equals(A17)) {
                    String A1Q3 = r9.A1Q();
                    0qQ.A0B(A1Q3, 0);
                    AdsManagerPaymentAnomalyType[] values3 = AdsManagerPaymentAnomalyType.values();
                    int length3 = values3.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        AdsManagerPaymentAnomalyType adsManagerPaymentAnomalyType = values3[i3];
                        if (0qQ.A0K(adsManagerPaymentAnomalyType.A00, A1Q3)) {
                            wOi.A04 = adsManagerPaymentAnomalyType;
                        } else {
                            i3++;
                        }
                    }
                    throw new IllegalArgumentException("can not parse payment anomaly type string from server");
                } else if ("split_test_partner_promotions".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            C19176WOi parseFromJson2 = parseFromJson(r9);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    wOi.A0O = arrayList;
                }
                r9.A0z();
            }
            return wOi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
