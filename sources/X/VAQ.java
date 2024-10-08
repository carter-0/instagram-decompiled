package X;

import com.instagram.api.schemas.AdsMessageExtensionType;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.PublisherPlatform;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAQ {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.VdF] */
    public static C17746VdF parseFromJson(16F r5) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("fb_user_id".equals(A17)) {
                    obj.A0P = AnonymousClass7TG.A0l(r5);
                } else if ("page_id".equals(A17)) {
                    obj.A0T = AnonymousClass7TG.A0l(r5);
                } else if ("page_name".equals(A17)) {
                    obj.A0U = AnonymousClass7TG.A0l(r5);
                } else if ("page_profile_pic_uri".equals(A17)) {
                    obj.A0G = 16h.A00(r5);
                } else if ("media_product_type".equals(A17)) {
                    obj.A0S = AnonymousClass7TG.A0l(r5);
                } else if ("ad_account_id".equals(A17)) {
                    obj.A0M = AnonymousClass7TG.A0l(r5);
                } else if ("business_vertical".equals(A17)) {
                    obj.A0N = AnonymousClass7TG.A0l(r5);
                } else if ("currency".equals(A17)) {
                    obj.A0O = AnonymousClass7TG.A0l(r5);
                } else if ("currency_offset".equals(A17)) {
                    obj.A00 = r5.A1D();
                } else if ("daily_budget_options_with_offset".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r5);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    }
                    obj.A0a = arrayList;
                } else if ("daily_budget_packages_with_offset".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Integer A0X2 = AnonymousClass7TF.A0X(r5);
                            if (A0X2 != null) {
                                arrayList.add(A0X2);
                            }
                        }
                    }
                    obj.A0b = arrayList;
                } else if ("default_duration_in_days".equals(A17)) {
                    obj.A02 = r5.A1D();
                } else if ("default_daily_budget_with_offset".equals(A17)) {
                    obj.A01 = r5.A1D();
                } else if ("is_political_ads_eligible".equals(A17)) {
                    obj.A0m = r5.A0d();
                } else if ("should_show_political_ads_restriction_ux".equals(A17)) {
                    obj.A0L = AnonymousClass7TF.A0S(r5);
                } else if ("political_ads_by_line_text".equals(A17)) {
                    obj.A0V = AnonymousClass7TG.A0l(r5);
                } else if ("linked_igtv_video_id".equals(A17)) {
                    obj.A0R = AnonymousClass7TG.A0l(r5);
                } else if ("last_promotion_audience_id".equals(A17)) {
                    obj.A0Q = AnonymousClass7TG.A0l(r5);
                } else if ("is_political_ads_name_change_2019_eligible".equals(A17)) {
                    obj.A0n = r5.A0d();
                } else if ("is_story_post".equals(A17)) {
                    obj.A0p = r5.A0d();
                } else if ("is_iabp".equals(A17)) {
                    obj.A0j = r5.A0d();
                } else if ("can_run_ig_backed_ads".equals(A17)) {
                    obj.A0k = r5.A0d();
                } else if ("should_show_regulated_categories_flow".equals(A17)) {
                    obj.A0i = r5.A0d();
                } else if ("has_created_lead_ad".equals(A17)) {
                    obj.A0f = r5.A0d();
                } else if ("is_call_center_available".equals(A17)) {
                    obj.A0J = AnonymousClass7TF.A0S(r5);
                } else if ("has_advertised".equals(A17)) {
                    obj.A0I = AnonymousClass7TF.A0S(r5);
                } else if (AnonymousClass000.A00(1508).equals(A17)) {
                    obj.A0K = AnonymousClass7TF.A0S(r5);
                } else if ("destination".equals(A17)) {
                    obj.A0C = C16852V8h.A00(AnonymousClass7TG.A0l(r5));
                } else if ("recommended_destination".equals(A17)) {
                    obj.A0E = C16852V8h.A00(AnonymousClass7TG.A0l(r5));
                } else if ("messaging_tool_selected".equals(A17)) {
                    obj.A0D = C16852V8h.A00(AnonymousClass7TG.A0l(r5));
                } else if ("selected_lead_ads_cta".equals(A17)) {
                    obj.A0A = XIGIGBoostCallToAction.valueOf(r5.A1Q());
                } else if ("selected_messaging_cta".equals(A17)) {
                    obj.A0B = XIGIGBoostCallToAction.valueOf(r5.A1Q());
                } else if ("selected_lead_form".equals(A17)) {
                    obj.A0H = C44846Clw.parseFromJson(r5);
                } else if ("destination_recommendation_reason".equals(A17)) {
                    DestinationRecommendationReason destinationRecommendationReason = (DestinationRecommendationReason) DestinationRecommendationReason.A01.get(AnonymousClass7TG.A0l(r5));
                    if (destinationRecommendationReason == null) {
                        destinationRecommendationReason = DestinationRecommendationReason.UNRECOGNIZED;
                    }
                    obj.A07 = destinationRecommendationReason;
                } else if ("call_to_action".equals(A17)) {
                    obj.A09 = XIGIGBoostCallToAction.valueOf(r5.A1Q());
                } else if ("website_url".equals(A17)) {
                    obj.A0X = AnonymousClass7TG.A0l(r5);
                } else if ("display_url".equals(A17)) {
                    obj.A0F = 16h.A00(r5);
                } else {
                    if (!"is_media_eligible_for_story_placement".equals(A17)) {
                        if ("is_media_eligible_for_explore_placement".equals(A17)) {
                            obj.A0l = r5.A0d();
                        } else if ("is_boost_again".equals(A17)) {
                            obj.A0g = r5.A0d();
                        } else if ("instagram_positions".equals(A17)) {
                            if (r5.A11() == 16L.A0C) {
                                ArrayList arrayList2 = new ArrayList();
                                while (r5.A1J() != 16L.A08) {
                                    if (r5.A11() == 16L.A0G) {
                                        str5 = null;
                                    } else {
                                        str5 = r5.A1P();
                                    }
                                    arrayList2.add(V70.A00(str5));
                                }
                                arrayList = arrayList2;
                            }
                            obj.A0d = arrayList;
                        } else if ("message_extensions".equals(A17)) {
                            if (r5.A11() == 16L.A0C) {
                                ArrayList arrayList3 = new ArrayList();
                                while (r5.A1J() != 16L.A08) {
                                    if (r5.A11() == 16L.A0G) {
                                        str4 = null;
                                    } else {
                                        str4 = r5.A1P();
                                    }
                                    AdsMessageExtensionType adsMessageExtensionType = (AdsMessageExtensionType) AdsMessageExtensionType.A01.get(str4);
                                    if (adsMessageExtensionType == null) {
                                        adsMessageExtensionType = AdsMessageExtensionType.UNRECOGNIZED;
                                    }
                                    arrayList3.add(adsMessageExtensionType);
                                }
                                arrayList = arrayList3;
                            }
                            obj.A0e = arrayList;
                        } else if ("eligible_objectives".equals(A17)) {
                            if (r5.A11() == 16L.A0C) {
                                ArrayList arrayList4 = new ArrayList();
                                while (r5.A1J() != 16L.A08) {
                                    if (r5.A11() == 16L.A0G) {
                                        str3 = null;
                                    } else {
                                        str3 = r5.A1P();
                                    }
                                    arrayList4.add(C16852V8h.A00(str3));
                                }
                                arrayList = arrayList4;
                            }
                            obj.A0c = arrayList;
                        } else if (!"has_opted_out_of_secondary_cta".equals(A17)) {
                            if ("profile_visit_secondary_cta_info".equals(A17)) {
                                obj.A03 = V84.parseFromJson(r5);
                            } else if ("profile_website_url".equals(A17)) {
                                obj.A0W = AnonymousClass7TG.A0l(r5);
                            } else if ("boosting_status".equals(A17)) {
                                obj.A05 = BoostedActionStatus.valueOf(r5.A1Q());
                            } else if ("additional_eligible_publisher_platforms".equals(A17)) {
                                if (r5.A11() == 16L.A0C) {
                                    ArrayList arrayList5 = new ArrayList();
                                    while (r5.A1J() != 16L.A08) {
                                        if (r5.A11() == 16L.A0G) {
                                            str2 = null;
                                        } else {
                                            str2 = r5.A1P();
                                        }
                                        PublisherPlatform publisherPlatform = (PublisherPlatform) PublisherPlatform.A01.get(str2);
                                        if (publisherPlatform == null) {
                                            publisherPlatform = PublisherPlatform.UNRECOGNIZED;
                                        }
                                        arrayList5.add(publisherPlatform);
                                    }
                                    arrayList = arrayList5;
                                }
                                obj.A0Y = arrayList;
                            } else if ("additional_publisher_platforms_user_selected".equals(A17)) {
                                if (r5.A11() == 16L.A0C) {
                                    ArrayList arrayList6 = new ArrayList();
                                    while (r5.A1J() != 16L.A08) {
                                        if (r5.A11() == 16L.A0G) {
                                            str = null;
                                        } else {
                                            str = r5.A1P();
                                        }
                                        PublisherPlatform publisherPlatform2 = (PublisherPlatform) PublisherPlatform.A01.get(str);
                                        if (publisherPlatform2 == null) {
                                            publisherPlatform2 = PublisherPlatform.UNRECOGNIZED;
                                        }
                                        arrayList6.add(publisherPlatform2);
                                    }
                                    arrayList = arrayList6;
                                }
                                obj.A0Z = arrayList;
                            } else if ("link_sticker_info".equals(A17)) {
                                obj.A08 = C16822V7d.parseFromJson(r5);
                            } else if (C273654mx.A00(770).equals(A17)) {
                                obj.A0h = r5.A0d();
                            } else if ("is_sensitive_vertical_ad".equals(A17)) {
                                obj.A0o = r5.A0d();
                            } else if ("dsa_data".equals(A17)) {
                                obj.A04 = V7A.parseFromJson(r5);
                            } else if ("sbg_engagement_eligibility_and_dynamic_content".equals(A17)) {
                                obj.A06 = V79.parseFromJson(r5);
                            }
                        }
                    }
                    r5.A0d();
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
