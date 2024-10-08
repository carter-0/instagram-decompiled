package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDict;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl;
import com.instagram.api.schemas.IGAdProfileProductTabDictImpl;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl;
import com.instagram.api.schemas.IGCTATextVariantImpl;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.TestimonialDictImpl;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfo;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.sponsored.signals.model.AdsTextTrustInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3kz  reason: invalid class name and case insensitive filesystem */
public abstract class C250153kz {
    public static C250503lY parseFromJson(16F r170) {
        String A1P;
        String str;
        String str2;
        String A1P2;
        String str3;
        String str4;
        String str5;
        String A1P3;
        String str6;
        16F r22 = r170;
        0qQ.A0B(r22, 0);
        try {
            if (r22.A11() != 16L.A0D) {
                r22.A0z();
                return null;
            }
            String str7 = null;
            String str8 = null;
            String str9 = null;
            C257533xY r74 = null;
            Long l = null;
            String str10 = null;
            Integer num = null;
            C239613Hd r72 = null;
            C257553xa r37 = null;
            String str11 = null;
            C239613Hd r73 = null;
            AdsIAWRatingInfo adsIAWRatingInfo = null;
            AdsRatingInfo adsRatingInfo = null;
            C257573xc r23 = null;
            String str12 = null;
            C250173l1 r24 = null;
            String str13 = null;
            AppstoreMetadataDictImpl appstoreMetadataDictImpl = null;
            BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = null;
            C257593xe r69 = null;
            ArrayList arrayList = null;
            Long l2 = null;
            BE0 be0 = null;
            CallAdsInfoDict callAdsInfoDict = null;
            String str14 = null;
            ArrayList arrayList2 = null;
            C250203l4 r47 = null;
            String str15 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            String str16 = null;
            C257613xg r33 = null;
            C257633xi r34 = null;
            C257653xk r28 = null;
            CTAStyle cTAStyle = null;
            C255003tQ r30 = null;
            C250233l7 r31 = null;
            IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = null;
            UMr uMr = null;
            Boolean bool = null;
            String str17 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str18 = null;
            Integer num2 = null;
            ArrayList arrayList5 = null;
            DynamicProductAdDisplayOption dynamicProductAdDisplayOption = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str19 = null;
            String str20 = null;
            C257683xn r36 = null;
            AdFormatType adFormatType = null;
            C257703xp r38 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str21 = null;
            ArrayList arrayList6 = null;
            C250323lG r49 = null;
            C250353lJ r50 = null;
            String str22 = null;
            UN1 un1 = null;
            UN2 un2 = null;
            AdsCTATrustInfo adsCTATrustInfo = null;
            AdsTextTrustInfo adsTextTrustInfo = null;
            IGAdsIABScreenshotDataDictImpl iGAdsIABScreenshotDataDictImpl = null;
            IGCTATextVariantImpl iGCTATextVariantImpl = null;
            String str23 = null;
            C255113tb r43 = null;
            AnonymousClass56L r48 = null;
            BFA bfa = null;
            C257763xv r53 = null;
            IGRFSurveyInfoDictImpl iGRFSurveyInfoDictImpl = null;
            AnonymousClass5CY r57 = null;
            C257793xy r62 = null;
            Integer num5 = null;
            Integer num6 = null;
            AnonymousClass3I1 r75 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            Integer num7 = null;
            ArrayList arrayList7 = null;
            String str24 = null;
            Boolean bool30 = null;
            ArrayList arrayList8 = null;
            String str25 = null;
            Boolean bool31 = null;
            String str26 = null;
            ArrayList arrayList9 = null;
            Boolean bool32 = null;
            C279784zJ r51 = null;
            String str27 = null;
            String str28 = null;
            C257793xy r63 = null;
            String str29 = null;
            C257823y1 r58 = null;
            C257843y3 r65 = null;
            C257863y5 r59 = null;
            String str30 = null;
            String str31 = null;
            ArrayList arrayList10 = null;
            String str32 = null;
            String str33 = null;
            C282165Ca r60 = null;
            ArrayList arrayList11 = null;
            ArrayList arrayList12 = null;
            IGAdProfileProductTabDictImpl iGAdProfileProductTabDictImpl = null;
            C2808854p r61 = null;
            C257903y9 r76 = null;
            C257923yB r77 = null;
            C279814zN r56 = null;
            Boolean bool33 = null;
            Boolean bool34 = null;
            Boolean bool35 = null;
            Boolean bool36 = null;
            Boolean bool37 = null;
            Boolean bool38 = null;
            C257953yE r64 = null;
            C42081BGk bGk = null;
            IGAdCreativeStory9x16CaptionDataImpl iGAdCreativeStory9x16CaptionDataImpl = null;
            1bK r70 = null;
            TestimonialDictImpl testimonialDictImpl = null;
            BFC bfc = null;
            String str34 = null;
            C257993yI r68 = null;
            Integer num8 = null;
            ArrayList arrayList13 = null;
            while (r22.A1J() != 16L.A09) {
                String A0q = r22.A0q();
                r22.A1J();
                if ("about_ad_params".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r22.A1P();
                    }
                } else if ("actor_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r22.A1P();
                    }
                } else if ("ad_action".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r22.A1P();
                    }
                } else if ("ad_disclaimer_info".equals(A0q)) {
                    r74 = C45679D1e.parseFromJson(r22);
                } else if ("ad_expiry_timestamp_in_millis".equals(A0q)) {
                    l = Long.valueOf(r22.A0y());
                } else if ("ad_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r22.A1P();
                    }
                } else if ("ad_objective_type".equals(A0q)) {
                    num = Integer.valueOf(r22.A1D());
                } else if ("ad_pod_rules".equals(A0q)) {
                    r72 = C254953tL.parseFromJson(r22);
                } else if ("ad_tag".equals(A0q)) {
                    r37 = C2605846g.parseFromJson(r22);
                } else if ("ad_title".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r22.A1P();
                    }
                } else if ("adpod_rules".equals(A0q)) {
                    r73 = C254953tL.parseFromJson(r22);
                } else if ("ads_iaw_rating_info".equals(A0q)) {
                    adsIAWRatingInfo = C45705D2e.parseFromJson(r22);
                } else if ("ads_rating_and_review_info".equals(A0q)) {
                    adsRatingInfo = AnonymousClass5I9.parseFromJson(r22);
                } else if ("ads_shopping_info".equals(A0q)) {
                    r23 = C45504Cxe.parseFromJson(r22);
                } else if ("adtaxon_i18n_top1_l7_prediction".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r22.A1P();
                    }
                } else if ("afi_info".equals(A0q)) {
                    r24 = C250163l0.parseFromJson(r22);
                } else if ("app_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r22.A1P();
                    }
                } else if ("appstore_metadata".equals(A0q)) {
                    appstoreMetadataDictImpl = AnonymousClass41U.parseFromJson(r22);
                } else if ("bca_ppl_removal_option".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r22.A1P();
                    }
                    brandedContentAdsPaidPartnershipLabelRemovalOption = (BrandedContentAdsPaidPartnershipLabelRemovalOption) BrandedContentAdsPaidPartnershipLabelRemovalOption.A01.get(str6);
                    if (brandedContentAdsPaidPartnershipLabelRemovalOption == null) {
                        brandedContentAdsPaidPartnershipLabelRemovalOption = BrandedContentAdsPaidPartnershipLabelRemovalOption.UNRECOGNIZED;
                    }
                } else if ("bloks_cta_component".equals(A0q)) {
                    r69 = C45662D0m.parseFromJson(r22);
                } else if ("brs_applied_content_blocklists".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r22.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("brs_threshold".equals(A0q)) {
                    l2 = Long.valueOf(r22.A0y());
                } else if ("buyer_incentive_feed".equals(A0q)) {
                    be0 = CVF.parseFromJson(r22);
                } else if ("call_ads_info".equals(A0q)) {
                    callAdsInfoDict = CVK.parseFromJson(r22);
                } else if ("campaign_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r22.A1P();
                    }
                } else if ("cca_optimization_options".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            C250063kq parseFromJson = C250053kp.parseFromJson(r22);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("click_to_direct_lead_gen_ads_info".equals(A0q)) {
                    r47 = C250193l3.parseFromJson(r22);
                } else if ("contextual_label_info".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r22.A1P();
                    }
                } else if ("cookies".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            if (!(r22.A11() == 16L.A0G || (A1P3 = r22.A1P()) == null)) {
                                arrayList3.add(A1P3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("cop_render_output".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            C250063kq parseFromJson2 = C250053kp.parseFromJson(r22);
                            if (parseFromJson2 != null) {
                                arrayList4.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("creation_source".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r22.A1P();
                    }
                } else if ("creative_transformations".equals(A0q)) {
                    r33 = C300535xM.parseFromJson(r22);
                } else if ("creative_transformations_v2".equals(A0q)) {
                    r34 = C300545xN.parseFromJson(r22);
                } else if ("cta_info".equals(A0q)) {
                    r28 = C45517Cxr.parseFromJson(r22);
                } else if ("cta_style".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r22.A1P();
                    }
                    cTAStyle = (CTAStyle) CTAStyle.A01.get(str5);
                    if (cTAStyle == null) {
                        cTAStyle = CTAStyle.UNRECOGNIZED;
                    }
                } else if ("ctd_ads_info".equals(A0q)) {
                    r30 = C254993tP.parseFromJson(r22);
                } else if ("ctj_ads_info".equals(A0q)) {
                    r31 = C250223l6.parseFromJson(r22);
                } else if ("ctmessaging_ads_info".equals(A0q)) {
                    iGCTMessagingAdsInfoDict = AnonymousClass548.parseFromJson(r22);
                } else if ("ctw_fallback_wrapper".equals(A0q)) {
                    uMr = V78.parseFromJson(r22);
                } else if ("direct_share".equals(A0q)) {
                    bool = Boolean.valueOf(r22.A0d());
                } else if ("display_domain".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r22.A1P();
                    }
                } else if ("display_fb_page_name".equals(A0q)) {
                    bool2 = Boolean.valueOf(r22.A0d());
                } else if ("display_viewability_eligible".equals(A0q)) {
                    bool3 = Boolean.valueOf(r22.A0d());
                } else if ("dominant_color".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r22.A1P();
                    }
                } else if ("dr_ad_type".equals(A0q)) {
                    num2 = Integer.valueOf(r22.A1D());
                } else if ("dynamic_ads_links".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            C42028BEd parseFromJson3 = C45541CyF.parseFromJson(r22);
                            if (parseFromJson3 != null) {
                                arrayList5.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("dynamic_product_ad_display_option".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r22.A1P();
                    }
                    dynamicProductAdDisplayOption = (DynamicProductAdDisplayOption) DynamicProductAdDisplayOption.A01.get(str4);
                    if (dynamicProductAdDisplayOption == null) {
                        dynamicProductAdDisplayOption = DynamicProductAdDisplayOption.UNRECOGNIZED;
                    }
                } else if ("enable_ads_follow_button".equals(A0q)) {
                    bool4 = Boolean.valueOf(r22.A0d());
                } else if ("enable_reels_end_scene".equals(A0q)) {
                    bool5 = Boolean.valueOf(r22.A0d());
                } else if ("fb_app_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r22.A1P();
                    }
                } else if ("fb_page_url".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r22.A1P();
                    }
                } else if ("feed_end_scene_data".equals(A0q)) {
                    r36 = C45557CyV.parseFromJson(r22);
                } else if ("format_type".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r22.A1P();
                    }
                    adFormatType = (AdFormatType) AdFormatType.A01.get(str3);
                    if (adFormatType == null) {
                        adFormatType = AdFormatType.UNRECOGNIZED;
                    }
                } else if ("gesture_to_action_info".equals(A0q)) {
                    r38 = C41941B7s.parseFromJson(r22);
                } else if ("global_position".equals(A0q)) {
                    num3 = Integer.valueOf(r22.A1D());
                } else if ("hide_flow_type".equals(A0q)) {
                    num4 = Integer.valueOf(r22.A1D());
                } else if ("hide_label".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str21 = null;
                    } else {
                        str21 = r22.A1P();
                    }
                } else if ("hide_reasons_v2".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList6 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            C250263lA parseFromJson4 = C250253l9.parseFromJson(r22);
                            if (parseFromJson4 != null) {
                                arrayList6.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("iab".equals(A0q)) {
                    r49 = C250283lC.parseFromJson(r22);
                } else if ("iab_post_click_data".equals(A0q)) {
                    r50 = C250343lI.parseFromJson(r22);
                } else if ("iaw_wca_exclusion_targeting_rule_oc".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str22 = null;
                    } else {
                        str22 = r22.A1P();
                    }
                } else if ("ig_ad_media_smart_crop_info".equals(A0q)) {
                    un1 = V7I.parseFromJson(r22);
                } else if ("ig_ad_media_text_ocr_info".equals(A0q)) {
                    un2 = V7K.parseFromJson(r22);
                } else if ("ig_ad_rendering_cta_trust_info_data".equals(A0q)) {
                    adsCTATrustInfo = C45102CqK.parseFromJson(r22);
                } else if ("ig_ad_rendering_text_trust_info_data".equals(A0q)) {
                    adsTextTrustInfo = C45106CqO.parseFromJson(r22);
                } else if ("ig_ads_iab_screenshot_data".equals(A0q)) {
                    iGAdsIABScreenshotDataDictImpl = C48330Ecn.parseFromJson(r22);
                } else if ("ig_cta_text_variant_data".equals(A0q)) {
                    iGCTATextVariantImpl = C48334Ecr.parseFromJson(r22);
                } else if ("ig_events_extracted_date".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str23 = null;
                    } else {
                        str23 = r22.A1P();
                    }
                } else if ("ig_feed_video_watch_and_browse_info".equals(A0q)) {
                    r43 = C275484qP.parseFromJson(r22);
                } else if ("ig_format_liquidity_ads_info".equals(A0q)) {
                    r48 = AnonymousClass56K.parseFromJson(r22);
                } else if ("ig_oops_survey_info".equals(A0q)) {
                    bfa = CZD.parseFromJson(r22);
                } else if ("ig_pbia_profile_and_browse_info".equals(A0q)) {
                    r53 = C278584xA.parseFromJson(r22);
                } else if ("ig_rf_survey_info".equals(A0q)) {
                    iGRFSurveyInfoDictImpl = CZN.parseFromJson(r22);
                } else if ("ig_transparency_and_control_disclaimer_data".equals(A0q)) {
                    r57 = AnonymousClass5CU.parseFromJson(r22);
                } else if ("igtv_media_background".equals(A0q)) {
                    r62 = C271234iU.parseFromJson(r22);
                } else if ("imp_signature".equals(A0q)) {
                    num5 = Integer.valueOf(r22.A1D());
                } else if ("impression_signature".equals(A0q)) {
                    num6 = Integer.valueOf(r22.A1D());
                } else if ("invalidation_rules".equals(A0q)) {
                    r75 = C250373lL.parseFromJson(r22);
                } else if ("isExternalUrlLandingPage".equals(A0q)) {
                    bool6 = Boolean.valueOf(r22.A0d());
                } else if ("is_app_mae_ad_exclusion_eligible".equals(A0q)) {
                    bool7 = Boolean.valueOf(r22.A0d());
                } else if ("is_autotranslated".equals(A0q)) {
                    bool8 = Boolean.valueOf(r22.A0d());
                } else if ("is_bau_ifu_eligible".equals(A0q)) {
                    bool9 = Boolean.valueOf(r22.A0d());
                } else if ("is_boosted".equals(A0q)) {
                    bool10 = Boolean.valueOf(r22.A0d());
                } else if ("is_consent_growth_ifu_eligible".equals(A0q)) {
                    bool11 = Boolean.valueOf(r22.A0d());
                } else if ("is_consent_growth_popup_eligible".equals(A0q)) {
                    bool12 = Boolean.valueOf(r22.A0d());
                } else if ("is_conversions_ad_with_upcoming_event".equals(A0q)) {
                    bool13 = Boolean.valueOf(r22.A0d());
                } else if ("is_delayed_skip_ad".equals(A0q)) {
                    bool14 = Boolean.valueOf(r22.A0d());
                } else if ("is_demo".equals(A0q)) {
                    bool15 = Boolean.valueOf(r22.A0d());
                } else if ("is_feed_glados_control_eligible".equals(A0q)) {
                    bool16 = Boolean.valueOf(r22.A0d());
                } else if ("is_form_extension_eligible".equals(A0q)) {
                    bool17 = Boolean.valueOf(r22.A0d());
                } else if ("is_holdout".equals(A0q)) {
                    bool18 = Boolean.valueOf(r22.A0d());
                } else if ("is_ig_events_excluded_ad".equals(A0q)) {
                    bool19 = Boolean.valueOf(r22.A0d());
                } else if ("is_leadgen_native_eligible".equals(A0q)) {
                    bool20 = Boolean.valueOf(r22.A0d());
                } else if ("is_luxury_vertical_ad".equals(A0q)) {
                    bool21 = Boolean.valueOf(r22.A0d());
                } else if ("is_multi_ads_eligible".equals(A0q)) {
                    bool22 = Boolean.valueOf(r22.A0d());
                } else if ("is_pharma_and_sensitive_vertical_ad".equals(A0q)) {
                    bool23 = Boolean.valueOf(r22.A0d());
                } else if ("is_pharma_vertical_ad".equals(A0q)) {
                    bool24 = Boolean.valueOf(r22.A0d());
                } else if ("is_post_click_afi_eligible".equals(A0q)) {
                    bool25 = Boolean.valueOf(r22.A0d());
                } else if ("is_previewable_video_ad".equals(A0q)) {
                    bool26 = Boolean.valueOf(r22.A0d());
                } else if ("is_rev_share".equals(A0q)) {
                    bool27 = Boolean.valueOf(r22.A0d());
                } else if ("is_sensitive_vertical_ad".equals(A0q)) {
                    bool28 = Boolean.valueOf(r22.A0d());
                } else if ("is_shops_ifu_eligible".equals(A0q)) {
                    bool29 = Boolean.valueOf(r22.A0d());
                } else if ("item_type".equals(A0q)) {
                    num7 = Integer.valueOf(r22.A1D());
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList7 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r22);
                            if (A00 != null) {
                                arrayList7.add(A00);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("label".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str24 = null;
                    } else {
                        str24 = r22.A1P();
                    }
                } else if ("lead_gen_allow_phone_zip_format_improvement".equals(A0q)) {
                    bool30 = Boolean.valueOf(r22.A0d());
                } else if ("lead_gen_android_links".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList8 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson5 = C250113kv.parseFromJson(r22);
                            if (parseFromJson5 != null) {
                                arrayList8.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("lead_gen_call_to_action_title".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str25 = null;
                    } else {
                        str25 = r22.A1P();
                    }
                } else if ("lead_gen_force_full_page_context_card".equals(A0q)) {
                    bool31 = Boolean.valueOf(r22.A0d());
                } else if ("lead_gen_form_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str26 = null;
                    } else {
                        str26 = r22.A1P();
                    }
                } else if ("lead_gen_ios_links".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList9 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            AndroidLinkImpl parseFromJson6 = C250113kv.parseFromJson(r22);
                            if (parseFromJson6 != null) {
                                arrayList9.add(parseFromJson6);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("lead_gen_new_experience_ineligible".equals(A0q)) {
                    bool32 = Boolean.valueOf(r22.A0d());
                } else if ("lead_gen_preclick_data".equals(A0q)) {
                    r51 = C279764zH.parseFromJson(r22);
                } else if ("link_hint_text".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str27 = null;
                    } else {
                        str27 = r22.A1P();
                    }
                } else if ("link_text".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str28 = null;
                    } else {
                        str28 = r22.A1P();
                    }
                } else if ("media_background".equals(A0q)) {
                    r63 = C271234iU.parseFromJson(r22);
                } else if ("media_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str29 = null;
                    } else {
                        str29 = r22.A1P();
                    }
                } else if ("message_extension_info".equals(A0q)) {
                    r58 = CaP.parseFromJson(r22);
                } else if ("music_info".equals(A0q)) {
                    r65 = C45627Czd.parseFromJson(r22);
                } else if ("on_impressions_control".equals(A0q)) {
                    r59 = C278574x8.parseFromJson(r22);
                } else if ("optimization_goal_name".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str30 = null;
                    } else {
                        str30 = r22.A1P();
                    }
                } else if ("overlay_subtitle".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str31 = null;
                    } else {
                        str31 = r22.A1P();
                    }
                } else if ("pac_ad_media_ids".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList10 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            if (!(r22.A11() == 16L.A0G || (A1P2 = r22.A1P()) == null)) {
                                arrayList10.add(A1P2);
                            }
                        }
                    } else {
                        arrayList10 = null;
                    }
                } else if ("page_id".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str32 = null;
                    } else {
                        str32 = r22.A1P();
                    }
                } else if (C21058XCk.A01(9, 12, 49).equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str33 = null;
                    } else {
                        str33 = r22.A1P();
                    }
                } else if ("political_context".equals(A0q)) {
                    r60 = AnonymousClass5CZ.parseFromJson(r22);
                } else if ("post_trigger_experience_eligibilities".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList11 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            if (r22.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r22.A1P();
                            }
                            IGPostTriggerExperience iGPostTriggerExperience = (IGPostTriggerExperience) IGPostTriggerExperience.A01.get(str2);
                            if (iGPostTriggerExperience == null) {
                                iGPostTriggerExperience = IGPostTriggerExperience.UNRECOGNIZED;
                            }
                            arrayList11.add(iGPostTriggerExperience);
                        }
                    } else {
                        arrayList11 = null;
                    }
                } else if ("post_trigger_experience_eligible_triggers".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList12 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            if (r22.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r22.A1P();
                            }
                            PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger = (PostTriggerExperienceEligibleTrigger) PostTriggerExperienceEligibleTrigger.A01.get(str);
                            if (postTriggerExperienceEligibleTrigger == null) {
                                postTriggerExperienceEligibleTrigger = PostTriggerExperienceEligibleTrigger.UNRECOGNIZED;
                            }
                            arrayList12.add(postTriggerExperienceEligibleTrigger);
                        }
                    } else {
                        arrayList12 = null;
                    }
                } else if ("profile_product_tab_data".equals(A0q)) {
                    iGAdProfileProductTabDictImpl = C44168CYh.parseFromJson(r22);
                } else if ("profile_visit_ads_info".equals(A0q)) {
                    r61 = C2808754o.parseFromJson(r22);
                } else if ("reels_mid_scene_info".equals(A0q)) {
                    r76 = C56349Hx0.parseFromJson(r22);
                } else if ("reels_multi_ads_info".equals(A0q)) {
                    r77 = C45094CqC.parseFromJson(r22);
                } else if ("short_video_dtd".equals(A0q)) {
                    r56 = C279804zM.parseFromJson(r22);
                } else if ("should_fetch_preview_comments".equals(A0q)) {
                    bool33 = Boolean.valueOf(r22.A0d());
                } else if ("should_show_exclusive_info_cta".equals(A0q)) {
                    bool34 = Boolean.valueOf(r22.A0d());
                } else if ("should_show_secondary_cta_on_profile".equals(A0q)) {
                    bool35 = Boolean.valueOf(r22.A0d());
                } else if ("show_ad_choices".equals(A0q)) {
                    bool36 = Boolean.valueOf(r22.A0d());
                } else if ("show_icon".equals(A0q)) {
                    bool37 = Boolean.valueOf(r22.A0d());
                } else if ("show_page_name_in_headline".equals(A0q)) {
                    bool38 = Boolean.valueOf(r22.A0d());
                } else if ("sponsored_ad_disclaimer".equals(A0q)) {
                    r64 = C255133td.parseFromJson(r22);
                } else if ("story_dynamic_ad_flexible_tiles_info".equals(A0q)) {
                    bGk = C44388Ce8.parseFromJson(r22);
                } else if ("systematic_caption".equals(A0q)) {
                    iGAdCreativeStory9x16CaptionDataImpl = C44166CYf.parseFromJson(r22);
                } else if ("testimonial_data".equals(A0q)) {
                    r70 = AnonymousClass1Zw.parseFromJson(r22);
                } else if ("testimonial_data_v2".equals(A0q)) {
                    testimonialDictImpl = C44514CgA.parseFromJson(r22);
                } else if ("text_overlay".equals(A0q)) {
                    bfc = CZP.parseFromJson(r22);
                } else if ("tracking_token".equals(A0q)) {
                    if (r22.A11() == 16L.A0G) {
                        str34 = null;
                    } else {
                        str34 = r22.A1P();
                    }
                } else if ("urp_card_transformation".equals(A0q)) {
                    r68 = D0H.parseFromJson(r22);
                } else if ("validated_product_cursor".equals(A0q)) {
                    num8 = Integer.valueOf(r22.A1D());
                } else if ("view_tags".equals(A0q)) {
                    if (r22.A11() == 16L.A0C) {
                        arrayList13 = new ArrayList();
                        while (r22.A1J() != 16L.A08) {
                            if (!(r22.A11() == 16L.A0G || (A1P = r22.A1P()) == null)) {
                                arrayList13.add(A1P);
                            }
                        }
                    } else {
                        arrayList13 = null;
                    }
                }
                r22.A0z();
            }
            return new C250503lY(adFormatType, r23, r24, appstoreMetadataDictImpl, brandedContentAdsPaidPartnershipLabelRemovalOption, be0, r28, callAdsInfoDict, r30, r31, uMr, r33, r34, dynamicProductAdDisplayOption, r36, r37, r38, iGAdCreativeStory9x16CaptionDataImpl, un1, un2, iGAdProfileProductTabDictImpl, r43, iGAdsIABScreenshotDataDictImpl, iGCTATextVariantImpl, iGCTMessagingAdsInfoDict, r47, r48, r49, r50, r51, bfa, r53, iGRFSurveyInfoDictImpl, bfc, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, bGk, testimonialDictImpl, r68, r69, r70, cTAStyle, r72, r73, r74, r75, r76, r77, adsCTATrustInfo, adsIAWRatingInfo, adsRatingInfo, adsTextTrustInfo, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, bool30, bool31, bool32, bool33, bool34, bool35, bool36, bool37, bool38, num, num2, num3, num4, num5, num6, num7, num8, l, l2, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.17Z] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.17Z r7, X.C250503lY r8) {
        /*
            r7.A0c()
            java.lang.String r1 = r8.A1k
            if (r1 == 0) goto L_0x000c
            java.lang.String r0 = "about_ad_params"
            r7.A0R(r0, r1)
        L_0x000c:
            java.lang.String r1 = r8.A1l
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = "actor_id"
            r7.A0R(r0, r1)
        L_0x0015:
            java.lang.String r1 = r8.A1m
            if (r1 == 0) goto L_0x001e
            java.lang.String r0 = "ad_action"
            r7.A0R(r0, r1)
        L_0x001e:
            X.3xY r1 = r8.A0q
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = "ad_disclaimer_info"
            r7.A0q(r0)
            X.C45679D1e.A00(r7, r1)
        L_0x002a:
            java.lang.Long r0 = r8.A1i
            if (r0 == 0) goto L_0x0037
            long r1 = r0.longValue()
            java.lang.String r0 = "ad_expiry_timestamp_in_millis"
            r7.A0Q(r0, r1)
        L_0x0037:
            java.lang.String r1 = r8.A1n
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = "ad_id"
            r7.A0R(r0, r1)
        L_0x0040:
            java.lang.Integer r0 = r8.A1a
            if (r0 == 0) goto L_0x004d
            int r1 = r0.intValue()
            java.lang.String r0 = "ad_objective_type"
            r7.A0P(r0, r1)
        L_0x004d:
            X.3Hd r1 = r8.A0o
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = "ad_pod_rules"
            r7.A0q(r0)
            X.C254953tL.A00(r7, r1)
        L_0x0059:
            X.3xa r1 = r8.A0F
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "ad_tag"
            r7.A0q(r0)
            X.C2605846g.A00(r7, r1)
        L_0x0065:
            java.lang.String r1 = r8.A1o
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "ad_title"
            r7.A0R(r0, r1)
        L_0x006e:
            X.3Hd r1 = r8.A0p
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = "adpod_rules"
            r7.A0q(r0)
            X.C254953tL.A00(r7, r1)
        L_0x007a:
            com.instagram.sponsored.signals.model.AdsIAWRatingInfo r1 = r8.A0v
            if (r1 == 0) goto L_0x0086
            java.lang.String r0 = "ads_iaw_rating_info"
            r7.A0q(r0)
            X.C45705D2e.A00(r7, r1)
        L_0x0086:
            com.instagram.sponsored.signals.model.AdsRatingInfo r1 = r8.A0w
            if (r1 == 0) goto L_0x0092
            java.lang.String r0 = "ads_rating_and_review_info"
            r7.A0q(r0)
            X.AnonymousClass5I9.A00(r7, r1)
        L_0x0092:
            X.3xc r1 = r8.A01
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "ads_shopping_info"
            r7.A0q(r0)
            X.C45504Cxe.A00(r7, r1)
        L_0x009e:
            java.lang.String r1 = r8.A1p
            if (r1 == 0) goto L_0x00a7
            java.lang.String r0 = "adtaxon_i18n_top1_l7_prediction"
            r7.A0R(r0, r1)
        L_0x00a7:
            X.3l1 r1 = r8.A02
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = "afi_info"
            r7.A0q(r0)
            X.C250163l0.A00(r7, r1)
        L_0x00b3:
            java.lang.String r1 = r8.A1q
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = "app_id"
            r7.A0R(r0, r1)
        L_0x00bc:
            com.instagram.api.schemas.AppstoreMetadataDict r1 = r8.A03
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = "appstore_metadata"
            r7.A0q(r0)
            com.instagram.api.schemas.AppstoreMetadataDictImpl r0 = r1.F0X()
            X.AnonymousClass41U.A00(r7, r0)
        L_0x00cc:
            com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption r0 = r8.A04
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "bca_ppl_removal_option"
            r7.A0R(r0, r1)
        L_0x00d7:
            X.3xe r1 = r8.A0l
            if (r1 == 0) goto L_0x00e3
            java.lang.String r0 = "bloks_cta_component"
            r7.A0q(r0)
            X.C45662D0m.A00(r7, r1)
        L_0x00e3:
            java.util.List r1 = r8.A2C
            if (r1 == 0) goto L_0x0109
            java.lang.String r0 = "brs_applied_content_blocklists"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00f0
            int r0 = r0.intValue()
            r7.A0g(r0)
            goto L_0x00f0
        L_0x0106:
            r7.A0Y()
        L_0x0109:
            java.lang.Long r0 = r8.A1j
            if (r0 == 0) goto L_0x0116
            long r1 = r0.longValue()
            java.lang.String r0 = "brs_threshold"
            r7.A0Q(r0, r1)
        L_0x0116:
            X.3xf r1 = r8.A05
            if (r1 == 0) goto L_0x0175
            java.lang.String r0 = "buyer_incentive_feed"
            r7.A0q(r0)
            X.BE0 r2 = r1.F15()
            r7.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0133
            r0 = 1151(0x47f, float:1.613E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0133:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0140
            r0 = 2991(0xbaf, float:4.191E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0140:
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r0 = r2.A00
            if (r0 == 0) goto L_0x014f
            java.lang.String r1 = r0.A00
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r7.A0R(r0, r1)
        L_0x014f:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = "incentive_id"
            r7.A0R(r0, r1)
        L_0x0158:
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0165
            r0 = 1880(0x758, float:2.634E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0165:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0172
            r0 = 1881(0x759, float:2.636E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0172:
            r7.A0Z()
        L_0x0175:
            com.instagram.api.schemas.CallAdsInfoDict r2 = r8.A07
            if (r2 == 0) goto L_0x019c
            java.lang.String r0 = "call_ads_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x018e
            r0 = 1670(0x686, float:2.34E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x018e:
            boolean r1 = r2.A01
            r0 = 1813(0x715, float:2.54E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0S(r0, r1)
            r7.A0Z()
        L_0x019c:
            java.lang.String r1 = r8.A1r
            if (r1 == 0) goto L_0x01a5
            java.lang.String r0 = "campaign_id"
            r7.A0R(r0, r1)
        L_0x01a5:
            java.util.List r1 = r8.A2D
            if (r1 == 0) goto L_0x01c7
            java.lang.String r0 = "cca_optimization_options"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x01b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r1.next()
            X.3kq r0 = (X.C250063kq) r0
            if (r0 == 0) goto L_0x01b2
            X.C250053kp.A00(r7, r0)
            goto L_0x01b2
        L_0x01c4:
            r7.A0Y()
        L_0x01c7:
            X.3l4 r1 = r8.A0P
            if (r1 == 0) goto L_0x01e3
            java.lang.String r0 = "click_to_direct_lead_gen_ads_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.Boolean r0 = r1.A00
            if (r0 == 0) goto L_0x01e0
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "isLeadGenAd"
            r7.A0S(r0, r1)
        L_0x01e0:
            r7.A0Z()
        L_0x01e3:
            java.lang.String r1 = r8.A1s
            if (r1 == 0) goto L_0x01ec
            java.lang.String r0 = "contextual_label_info"
            r7.A0R(r0, r1)
        L_0x01ec:
            java.util.List r1 = r8.A2E
            if (r1 == 0) goto L_0x020e
            java.lang.String r0 = "cookies"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x01f9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x020b
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01f9
            r7.A0t(r0)
            goto L_0x01f9
        L_0x020b:
            r7.A0Y()
        L_0x020e:
            java.util.List r1 = r8.A2F
            if (r1 == 0) goto L_0x0230
            java.lang.String r0 = "cop_render_output"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x021b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r1.next()
            X.3kq r0 = (X.C250063kq) r0
            if (r0 == 0) goto L_0x021b
            X.C250053kp.A00(r7, r0)
            goto L_0x021b
        L_0x022d:
            r7.A0Y()
        L_0x0230:
            java.lang.String r1 = r8.A1t
            if (r1 == 0) goto L_0x0239
            java.lang.String r0 = "creation_source"
            r7.A0R(r0, r1)
        L_0x0239:
            X.3xg r2 = r8.A0B
            if (r2 == 0) goto L_0x032b
            java.lang.String r0 = "creative_transformations"
            r7.A0q(r0)
            r7.A0c()
            com.instagram.model.showreel.IgShowreelComposition r1 = r2.A01
            if (r1 == 0) goto L_0x0259
            r0 = 392(0x188, float:5.5E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0q(r0)
            com.instagram.model.showreel.IgShowreelCompositionImpl r0 = r1.FFx()
            X.AnonymousClass4iY.A00(r7, r0)
        L_0x0259:
            X.5yJ r1 = r2.A00
            if (r1 == 0) goto L_0x0328
            r0 = 5258(0x148a, float:7.368E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0q(r0)
            X.BGP r2 = r1.F93()
            r7.A0c()
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x027a
            r0 = 1463(0x5b7, float:2.05E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0R(r0, r1)
        L_0x027a:
            java.util.List r1 = r2.A07
            if (r1 == 0) goto L_0x029c
            java.lang.String r0 = "assets"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0287:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0299
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0287
            r7.A0t(r0)
            goto L_0x0287
        L_0x0299:
            r7.A0Y()
        L_0x029c:
            java.util.List r1 = r2.A08
            if (r1 == 0) goto L_0x02e5
            java.lang.String r0 = "assets_info"
            X.16P.A03(r7, r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x02a9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02e2
            java.lang.Object r0 = r4.next()
            X.DTo r0 = (X.C46285DTo) r0
            if (r0 == 0) goto L_0x02a9
            X.BGQ r3 = r0.F94()
            r7.A0c()
            int r1 = r3.A00
            java.lang.String r0 = "height"
            r7.A0P(r0, r1)
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x02ce
            java.lang.String r0 = "type"
            r7.A0R(r0, r1)
        L_0x02ce:
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x02d7
            java.lang.String r0 = "url"
            r7.A0R(r0, r1)
        L_0x02d7:
            int r1 = r3.A01
            java.lang.String r0 = "width"
            r7.A0P(r0, r1)
            r7.A0Z()
            goto L_0x02a9
        L_0x02e2:
            r7.A0Y()
        L_0x02e5:
            com.instagram.api.schemas.ShowreelNativeClientName r0 = r2.A00
            if (r0 == 0) goto L_0x02f0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "client_name"
            r7.A0R(r0, r1)
        L_0x02f0:
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x02f9
            java.lang.String r0 = "content"
            r7.A0R(r0, r1)
        L_0x02f9:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x0306
            int r1 = r0.intValue()
            java.lang.String r0 = "height"
            r7.A0P(r0, r1)
        L_0x0306:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x030f
            java.lang.String r0 = "logging_info"
            r7.A0R(r0, r1)
        L_0x030f:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0318
            java.lang.String r0 = "template_name"
            r7.A0R(r0, r1)
        L_0x0318:
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0325
            int r1 = r0.intValue()
            java.lang.String r0 = "width"
            r7.A0P(r0, r1)
        L_0x0325:
            r7.A0Z()
        L_0x0328:
            r7.A0Z()
        L_0x032b:
            X.3xi r1 = r8.A0C
            if (r1 == 0) goto L_0x0337
            java.lang.String r0 = "creative_transformations_v2"
            r7.A0q(r0)
            X.C300545xN.A00(r7, r1)
        L_0x0337:
            X.3xk r1 = r8.A06
            if (r1 == 0) goto L_0x0343
            java.lang.String r0 = "cta_info"
            r7.A0q(r0)
            X.C45517Cxr.A00(r7, r1)
        L_0x0343:
            com.instagram.model.mediatype.CTAStyle r0 = r8.A0n
            if (r0 == 0) goto L_0x034e
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "cta_style"
            r7.A0R(r0, r1)
        L_0x034e:
            X.3tR r1 = r8.A08
            if (r1 == 0) goto L_0x0380
            java.lang.String r0 = "ctd_ads_info"
            r7.A0q(r0)
            X.3tQ r2 = r1.F1K()
            r7.A0c()
            java.lang.Float r0 = r2.A00
            if (r0 == 0) goto L_0x036b
            float r1 = r0.floatValue()
            java.lang.String r0 = "business_response_time_in_sec"
            r7.A0O(r0, r1)
        L_0x036b:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0374
            java.lang.String r0 = "business_responsiveness_time_text"
            r7.A0R(r0, r1)
        L_0x0374:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x037d
            java.lang.String r0 = "welcome_message_text"
            r7.A0R(r0, r1)
        L_0x037d:
            r7.A0Z()
        L_0x0380:
            X.3l8 r1 = r8.A09
            if (r1 == 0) goto L_0x03c8
            java.lang.String r0 = "ctj_ads_info"
            r7.A0q(r0)
            X.3l7 r2 = r1.F1L()
            r7.A0c()
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0399
            java.lang.String r0 = "channel_name"
            r7.A0R(r0, r1)
        L_0x0399:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x03a2
            java.lang.String r0 = "ig_channel_id"
            r7.A0R(r0, r1)
        L_0x03a2:
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x03ab
            java.lang.String r0 = "invite_link"
            r7.A0R(r0, r1)
        L_0x03ab:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x03b8
            int r1 = r0.intValue()
            java.lang.String r0 = "number_of_members"
            r7.A0P(r0, r1)
        L_0x03b8:
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L_0x03c5
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_skip_channel_suffix_bool"
            r7.A0S(r0, r1)
        L_0x03c5:
            r7.A0Z()
        L_0x03c8:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDict r2 = r8.A0O
            if (r2 == 0) goto L_0x0561
            java.lang.String r0 = "ctmessaging_ads_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x03dd
            java.lang.String r0 = "igAdvertiserId"
            r7.A0R(r0, r1)
        L_0x03dd:
            java.lang.Boolean r0 = r2.A04
            if (r0 == 0) goto L_0x03ea
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "isActive"
            r7.A0S(r0, r1)
        L_0x03ea:
            java.lang.Boolean r0 = r2.A05
            if (r0 == 0) goto L_0x03f7
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "isEligibleForOnFeedMessages"
            r7.A0S(r0, r1)
        L_0x03f7:
            com.instagram.api.schemas.OnFeedMessages r4 = r2.A00
            if (r4 == 0) goto L_0x04bf
            java.lang.String r0 = "model"
            r7.A0q(r0)
            r7.A0c()
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0410
            int r1 = r0.intValue()
            java.lang.String r0 = "destinationType"
            r7.A0P(r0, r1)
        L_0x0410:
            java.lang.String r1 = r4.A03
            if (r1 == 0) goto L_0x0419
            java.lang.String r0 = "genericUrl"
            r7.A0R(r0, r1)
        L_0x0419:
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x0422
            java.lang.String r0 = "greetingText"
            r7.A0R(r0, r1)
        L_0x0422:
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x042b
            java.lang.String r0 = "headerText"
            r7.A0R(r0, r1)
        L_0x042b:
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0434
            java.lang.String r0 = "icebreakerDisclaimerText"
            r7.A0R(r0, r1)
        L_0x0434:
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x043d
            java.lang.String r0 = "icebreakerDisclaimerTextFAQsSticker"
            r7.A0R(r0, r1)
        L_0x043d:
            java.util.List r1 = r4.A08
            if (r1 == 0) goto L_0x047d
            java.lang.String r0 = "icebreakerMessages"
            X.16P.A03(r7, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x044a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x047a
            java.lang.Object r3 = r5.next()
            com.instagram.api.schemas.IceBreakerMessage r3 = (com.instagram.api.schemas.IceBreakerMessage) r3
            if (r3 == 0) goto L_0x044a
            r7.A0c()
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x0464
            java.lang.String r0 = "actionUrl"
            r7.A0R(r0, r1)
        L_0x0464:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x046d
            java.lang.String r0 = "message"
            r7.A0R(r0, r1)
        L_0x046d:
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x0476
            java.lang.String r0 = "messageKey"
            r7.A0R(r0, r1)
        L_0x0476:
            r7.A0Z()
            goto L_0x044a
        L_0x047a:
            r7.A0Y()
        L_0x047d:
            com.instagram.api.schemas.GreetingAttachment r3 = r4.A00
            if (r3 == 0) goto L_0x04af
            java.lang.String r0 = "imageAttachment"
            r7.A0q(r0)
            r7.A0c()
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0496
            int r1 = r0.intValue()
            java.lang.String r0 = "height"
            r7.A0P(r0, r1)
        L_0x0496:
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x049f
            java.lang.String r0 = "url"
            r7.A0R(r0, r1)
        L_0x049f:
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x04ac
            int r1 = r0.intValue()
            java.lang.String r0 = "width"
            r7.A0P(r0, r1)
        L_0x04ac:
            r7.A0Z()
        L_0x04af:
            java.lang.Boolean r0 = r4.A01
            if (r0 == 0) goto L_0x04bc
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "shouldSendAttachment"
            r7.A0S(r0, r1)
        L_0x04bc:
            r7.A0Z()
        L_0x04bf:
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x04c8
            java.lang.String r0 = "pageID"
            r7.A0R(r0, r1)
        L_0x04c8:
            com.instagram.api.schemas.PrivacyDisclosureInfo r1 = r2.A01
            if (r1 == 0) goto L_0x04ed
            java.lang.String r0 = "privacyDisclosureInfo"
            r7.A0q(r0)
            com.instagram.api.schemas.PrivacyDisclosureInfoImpl r3 = r1.F7i()
            r7.A0c()
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x04e1
            java.lang.String r0 = "fbAdvertiserDisclosure"
            r7.A0R(r0, r1)
        L_0x04e1:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x04ea
            java.lang.String r0 = "privacyString"
            r7.A0R(r0, r1)
        L_0x04ea:
            r7.A0Z()
        L_0x04ed:
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x04f6
            java.lang.String r0 = "responsivenessText"
            r7.A0R(r0, r1)
        L_0x04f6:
            java.lang.String r1 = r2.A0B
            if (r1 == 0) goto L_0x04ff
            java.lang.String r0 = "secondaryCTASubtitle"
            r7.A0R(r0, r1)
        L_0x04ff:
            java.lang.Boolean r0 = r2.A06
            if (r0 == 0) goto L_0x050c
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "shouldNavigateToThread"
            r7.A0S(r0, r1)
        L_0x050c:
            java.lang.Boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0519
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "shouldTreatLinkStickerAsCTA"
            r7.A0S(r0, r1)
        L_0x0519:
            com.instagram.api.schemas.SocialProofInfo r1 = r2.A02
            if (r1 == 0) goto L_0x0539
            java.lang.String r0 = "socialProofInfo"
            r7.A0q(r0)
            com.instagram.api.schemas.SocialProofInfoImpl r0 = r1.F9D()
            r7.A0c()
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0536
            int r1 = r0.intValue()
            java.lang.String r0 = "numOfConversationsStartedWithBusiness"
            r7.A0P(r0, r1)
        L_0x0536:
            r7.A0Z()
        L_0x0539:
            com.instagram.api.schemas.WhatsAppAttributionInfo r1 = r2.A03
            if (r1 == 0) goto L_0x055e
            java.lang.String r0 = "whatsaAppAttributionInfo"
            r7.A0q(r0)
            com.instagram.api.schemas.WhatsAppAttributionInfoImpl r2 = r1.FDR()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0552
            java.lang.String r0 = "actionLink"
            r7.A0R(r0, r1)
        L_0x0552:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x055b
            java.lang.String r0 = "adWhatsAppNumber"
            r7.A0R(r0, r1)
        L_0x055b:
            r7.A0Z()
        L_0x055e:
            r7.A0Z()
        L_0x0561:
            X.3xm r1 = r8.A0A
            if (r1 == 0) goto L_0x059c
            java.lang.String r0 = "ctw_fallback_wrapper"
            r7.A0q(r0)
            X.UMr r2 = r1.F1M()
            r7.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x057a
            java.lang.String r0 = "actionLink"
            r7.A0R(r0, r1)
        L_0x057a:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0583
            java.lang.String r0 = "actionLinkFallback"
            r7.A0R(r0, r1)
        L_0x0583:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x058c
            java.lang.String r0 = "fallbackCTALabel"
            r7.A0R(r0, r1)
        L_0x058c:
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x0599
            int r1 = r0.intValue()
            java.lang.String r0 = "fallbackDestination"
            r7.A0P(r0, r1)
        L_0x0599:
            r7.A0Z()
        L_0x059c:
            java.lang.Boolean r0 = r8.A0y
            if (r0 == 0) goto L_0x05a9
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "direct_share"
            r7.A0S(r0, r1)
        L_0x05a9:
            java.lang.String r1 = r8.A1u
            if (r1 == 0) goto L_0x05b2
            java.lang.String r0 = "display_domain"
            r7.A0R(r0, r1)
        L_0x05b2:
            java.lang.Boolean r0 = r8.A0z
            if (r0 == 0) goto L_0x05bf
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "display_fb_page_name"
            r7.A0S(r0, r1)
        L_0x05bf:
            java.lang.Boolean r0 = r8.A10
            if (r0 == 0) goto L_0x05cc
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "display_viewability_eligible"
            r7.A0S(r0, r1)
        L_0x05cc:
            java.lang.String r1 = r8.A1v
            if (r1 == 0) goto L_0x05d5
            java.lang.String r0 = "dominant_color"
            r7.A0R(r0, r1)
        L_0x05d5:
            java.lang.Integer r0 = r8.A1b
            if (r0 == 0) goto L_0x05e2
            int r1 = r0.intValue()
            java.lang.String r0 = "dr_ad_type"
            r7.A0P(r0, r1)
        L_0x05e2:
            java.util.List r1 = r8.A2G
            if (r1 == 0) goto L_0x0604
            java.lang.String r0 = "dynamic_ads_links"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x05ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0601
            java.lang.Object r0 = r1.next()
            X.BEd r0 = (X.C42028BEd) r0
            if (r0 == 0) goto L_0x05ef
            X.C45541CyF.A00(r7, r0)
            goto L_0x05ef
        L_0x0601:
            r7.A0Y()
        L_0x0604:
            com.instagram.api.schemas.DynamicProductAdDisplayOption r0 = r8.A0D
            if (r0 == 0) goto L_0x060f
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "dynamic_product_ad_display_option"
            r7.A0R(r0, r1)
        L_0x060f:
            java.lang.Boolean r0 = r8.A11
            if (r0 == 0) goto L_0x061c
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "enable_ads_follow_button"
            r7.A0S(r0, r1)
        L_0x061c:
            java.lang.Boolean r0 = r8.A12
            if (r0 == 0) goto L_0x0629
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "enable_reels_end_scene"
            r7.A0S(r0, r1)
        L_0x0629:
            java.lang.String r1 = r8.A1w
            if (r1 == 0) goto L_0x0632
            java.lang.String r0 = "fb_app_id"
            r7.A0R(r0, r1)
        L_0x0632:
            java.lang.String r1 = r8.A1x
            if (r1 == 0) goto L_0x063b
            java.lang.String r0 = "fb_page_url"
            r7.A0R(r0, r1)
        L_0x063b:
            X.3xn r1 = r8.A0E
            if (r1 == 0) goto L_0x0647
            java.lang.String r0 = "feed_end_scene_data"
            r7.A0q(r0)
            X.C45557CyV.A00(r7, r1)
        L_0x0647:
            com.instagram.api.schemas.AdFormatType r0 = r8.A00
            if (r0 == 0) goto L_0x0652
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "format_type"
            r7.A0R(r0, r1)
        L_0x0652:
            X.3xp r1 = r8.A0G
            if (r1 == 0) goto L_0x0672
            java.lang.String r0 = "gesture_to_action_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.Boolean r0 = r1.A00
            if (r0 == 0) goto L_0x066f
            boolean r1 = r0.booleanValue()
            r0 = 3054(0xbee, float:4.28E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0S(r0, r1)
        L_0x066f:
            r7.A0Z()
        L_0x0672:
            java.lang.Integer r0 = r8.A1c
            if (r0 == 0) goto L_0x067f
            int r1 = r0.intValue()
            java.lang.String r0 = "global_position"
            r7.A0P(r0, r1)
        L_0x067f:
            java.lang.Integer r0 = r8.A1d
            if (r0 == 0) goto L_0x068c
            int r1 = r0.intValue()
            java.lang.String r0 = "hide_flow_type"
            r7.A0P(r0, r1)
        L_0x068c:
            java.lang.String r1 = r8.A1y
            if (r1 == 0) goto L_0x0695
            java.lang.String r0 = "hide_label"
            r7.A0R(r0, r1)
        L_0x0695:
            java.util.List r1 = r8.A2H
            if (r1 == 0) goto L_0x06d0
            java.lang.String r0 = "hide_reasons_v2"
            X.16P.A03(r7, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x06a2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06cd
            java.lang.Object r0 = r3.next()
            X.3lB r0 = (X.C250273lB) r0
            if (r0 == 0) goto L_0x06a2
            X.3lA r2 = r0.F3f()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x06c0
            java.lang.String r0 = "reason"
            r7.A0R(r0, r1)
        L_0x06c0:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x06c9
            java.lang.String r0 = "text"
            r7.A0R(r0, r1)
        L_0x06c9:
            r7.A0Z()
            goto L_0x06a2
        L_0x06cd:
            r7.A0Y()
        L_0x06d0:
            X.3lH r1 = r8.A0R
            if (r1 == 0) goto L_0x0723
            java.lang.String r0 = "iab"
            r7.A0q(r0)
            X.3lG r2 = r1.F4E()
            r7.A0c()
            X.3lF r1 = r2.A00
            if (r1 == 0) goto L_0x0700
            java.lang.String r0 = "browser_peek"
            r7.A0q(r0)
            X.3lE r0 = r1.F43()
            r7.A0c()
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x06fd
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_disable"
            r7.A0S(r0, r1)
        L_0x06fd:
            r7.A0Z()
        L_0x0700:
            X.3tU r1 = r2.A01
            if (r1 == 0) goto L_0x0720
            java.lang.String r0 = "persistent_iab"
            r7.A0q(r0)
            X.3tT r0 = r1.F4s()
            r7.A0c()
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x071d
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_disable"
            r7.A0S(r0, r1)
        L_0x071d:
            r7.A0Z()
        L_0x0720:
            r7.A0Z()
        L_0x0723:
            X.3lJ r3 = r8.A0S
            if (r3 == 0) goto L_0x0a7a
            java.lang.String r0 = "iab_post_click_data"
            r7.A0q(r0)
            r7.A0c()
            X.4fu r1 = r3.A00
            if (r1 == 0) goto L_0x0796
            java.lang.String r0 = "buyWithIntegrationIABPostClickDataExtension"
            r7.A0q(r0)
            X.QPf r4 = r1.F44()
            r7.A0c()
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x0748
            java.lang.String r0 = "accessToken"
            r7.A0R(r0, r1)
        L_0x0748:
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0755
            int r1 = r0.intValue()
            java.lang.String r0 = "accessTokenTTL"
            r7.A0P(r0, r1)
        L_0x0755:
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x075e
            java.lang.String r0 = "apiKey"
            r7.A0R(r0, r1)
        L_0x075e:
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0767
            java.lang.String r0 = "bauProductUrl"
            r7.A0R(r0, r1)
        L_0x0767:
            com.instagram.api.schemas.BuyWithIntegrationPostClickExperienceTypes r0 = r4.A00
            if (r0 == 0) goto L_0x0772
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "buyWithIntegrationPostClickExperienceType"
            r7.A0R(r0, r1)
        L_0x0772:
            java.lang.Long r0 = r4.A03
            if (r0 == 0) goto L_0x077f
            long r1 = r0.longValue()
            java.lang.String r0 = "oauthIntegrationId"
            r7.A0Q(r0, r1)
        L_0x077f:
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x0788
            java.lang.String r0 = "pageName"
            r7.A0R(r0, r1)
        L_0x0788:
            com.instagram.api.schemas.PartnerTypes r0 = r4.A01
            if (r0 == 0) goto L_0x0793
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "partnerType"
            r7.A0R(r0, r1)
        L_0x0793:
            r7.A0Z()
        L_0x0796:
            X.4fv r1 = r3.A01
            if (r1 == 0) goto L_0x07fb
            java.lang.String r0 = "buyWithPrimeIABPostClickDataExtension"
            r7.A0q(r0)
            X.BF4 r2 = r1.F45()
            r7.A0c()
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x07af
            java.lang.String r0 = "accessToken"
            r7.A0R(r0, r1)
        L_0x07af:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x07bc
            int r1 = r0.intValue()
            java.lang.String r0 = "accessTokenCreationTime"
            r7.A0P(r0, r1)
        L_0x07bc:
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x07c9
            int r1 = r0.intValue()
            java.lang.String r0 = "accessTokenTTL"
            r7.A0P(r0, r1)
        L_0x07c9:
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x07d2
            java.lang.String r0 = "apiKey"
            r7.A0R(r0, r1)
        L_0x07d2:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x07db
            java.lang.String r0 = "bauProductUrl"
            r7.A0R(r0, r1)
        L_0x07db:
            com.instagram.api.schemas.IGBuyWithPrimeExperienceTypes r0 = r2.A00
            if (r0 == 0) goto L_0x07e6
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "buyWithPrimeExperienceType"
            r7.A0R(r0, r1)
        L_0x07e6:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x07ef
            java.lang.String r0 = "clientID"
            r7.A0R(r0, r1)
        L_0x07ef:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x07f8
            java.lang.String r0 = "pageName"
            r7.A0R(r0, r1)
        L_0x07f8:
            r7.A0Z()
        L_0x07fb:
            java.util.List r1 = r3.A07
            if (r1 == 0) goto L_0x081f
            java.lang.String r0 = "eligibleExperienceTypes"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0808:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x081c
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.IGPostClickEligibleExperienceTypes r0 = (com.instagram.api.schemas.IGPostClickEligibleExperienceTypes) r0
            if (r0 == 0) goto L_0x0808
            java.lang.String r0 = r0.A00
            r7.A0t(r0)
            goto L_0x0808
        L_0x081c:
            r7.A0Y()
        L_0x081f:
            X.4fw r1 = r3.A02
            if (r1 == 0) goto L_0x0880
            java.lang.String r0 = "iabAutofillAdsPersonalizationPostClickDataExtension"
            r7.A0q(r0)
            X.53S r0 = r1.F4D()
            r7.A0c()
            com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict r1 = r0.A00
            if (r1 == 0) goto L_0x087d
            java.lang.String r0 = "adCreativeOptimizationPayload"
            r7.A0q(r0)
            com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl r0 = r1.F3m()
            r7.A0c()
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x087a
            java.lang.String r0 = "adCreativeOptimizationConfigByType"
            X.16P.A03(r7, r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x084c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0877
            java.lang.Object r0 = r4.next()
            com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict r0 = (com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDict) r0
            if (r0 == 0) goto L_0x084c
            com.instagram.api.schemas.IGAdCreativeOptimizationConfigByTypeDictImpl r2 = r0.F3n()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x086a
            java.lang.String r0 = "optimizationType"
            r7.A0R(r0, r1)
        L_0x086a:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0873
            java.lang.String r0 = "optionValue"
            r7.A0R(r0, r1)
        L_0x0873:
            r7.A0Z()
            goto L_0x084c
        L_0x0877:
            r7.A0Y()
        L_0x087a:
            r7.A0Z()
        L_0x087d:
            r7.A0Z()
        L_0x0880:
            java.util.List r1 = r3.A08
            if (r1 == 0) goto L_0x0905
            java.lang.String r0 = "iabPostClickDisclaimers"
            X.16P.A03(r7, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x088d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0902
            java.lang.Object r4 = r6.next()
            X.BF6 r4 = (X.BF6) r4
            if (r4 == 0) goto L_0x088d
            r7.A0c()
            java.util.List r1 = r4.A02
            if (r1 == 0) goto L_0x08ea
            java.lang.String r0 = "disclaimerBodyRanges"
            X.16P.A03(r7, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x08ab:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x08e7
            java.lang.Object r0 = r5.next()
            X.DTF r0 = (X.DTF) r0
            if (r0 == 0) goto L_0x08ab
            X.BF7 r2 = r0.F4H()
            r7.A0c()
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x08cd
            int r1 = r0.intValue()
            java.lang.String r0 = "length"
            r7.A0P(r0, r1)
        L_0x08cd:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x08da
            int r1 = r0.intValue()
            java.lang.String r0 = "offset"
            r7.A0P(r0, r1)
        L_0x08da:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x08e3
            java.lang.String r0 = "url"
            r7.A0R(r0, r1)
        L_0x08e3:
            r7.A0Z()
            goto L_0x08ab
        L_0x08e7:
            r7.A0Y()
        L_0x08ea:
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x08f3
            java.lang.String r0 = "disclaimerText"
            r7.A0R(r0, r1)
        L_0x08f3:
            com.instagram.api.schemas.IGPostClickEligibleExperienceTypes r0 = r4.A00
            if (r0 == 0) goto L_0x08fe
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "eligibleExperienceType"
            r7.A0R(r0, r1)
        L_0x08fe:
            r7.A0Z()
            goto L_0x088d
        L_0x0902:
            r7.A0Y()
        L_0x0905:
            java.lang.Long r0 = r3.A06
            if (r0 == 0) goto L_0x0912
            long r1 = r0.longValue()
            java.lang.String r0 = "impressionTime"
            r7.A0Q(r0, r1)
        L_0x0912:
            X.4fx r1 = r3.A03
            if (r1 == 0) goto L_0x092e
            java.lang.String r0 = "metaCheckoutIABPostClickDataExtension"
            r7.A0q(r0)
            X.BF8 r0 = r1.F4f()
            r7.A0c()
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x092b
            java.lang.String r0 = "metaCheckoutExperienceType"
            r7.A0R(r0, r1)
        L_0x092b:
            r7.A0Z()
        L_0x092e:
            X.4fy r1 = r3.A04
            if (r1 == 0) goto L_0x0a1b
            java.lang.String r0 = "metaPaymentsSDKIABPostClickDataExtension"
            r7.A0q(r0)
            X.QPh r0 = r1.F4h()
            r7.A0c()
            X.TjM r1 = r0.A00
            if (r1 == 0) goto L_0x0a18
            java.lang.String r0 = "checkoutSetupPayload"
            r7.A0q(r0)
            X.QPk r4 = r1.F4k()
            r7.A0c()
            X.TjJ r1 = r4.A00
            if (r1 == 0) goto L_0x0990
            java.lang.String r0 = "availability"
            r7.A0q(r0)
            X.QPg r2 = r1.F4g()
            r7.A0c()
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x0980
            java.lang.String r0 = "availabilityConditions"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x096b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x097d
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x096b
            r7.A0t(r0)
            goto L_0x096b
        L_0x097d:
            r7.A0Y()
        L_0x0980:
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L_0x098d
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "isAvailable"
            r7.A0S(r0, r1)
        L_0x098d:
            r7.A0Z()
        L_0x0990:
            X.TjK r1 = r4.A01
            if (r1 == 0) goto L_0x09ce
            java.lang.String r0 = "paymentConfig"
            r7.A0q(r0)
            X.QPi r2 = r1.F4i()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x09a9
            java.lang.String r0 = "paymentMode"
            r7.A0R(r0, r1)
        L_0x09a9:
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x09cb
            java.lang.String r0 = "supportedContainerTypes"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x09b6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09c8
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x09b6
            r7.A0t(r0)
            goto L_0x09b6
        L_0x09c8:
            r7.A0Y()
        L_0x09cb:
            r7.A0Z()
        L_0x09ce:
            X.TjL r1 = r4.A02
            if (r1 == 0) goto L_0x0a15
            java.lang.String r0 = "receiverInfo"
            r7.A0q(r0)
            X.QPj r2 = r1.F4j()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x09e7
            java.lang.String r0 = "id"
            r7.A0R(r0, r1)
        L_0x09e7:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x09f0
            java.lang.String r0 = "name"
            r7.A0R(r0, r1)
        L_0x09f0:
            java.util.List r1 = r2.A02
            if (r1 == 0) goto L_0x0a12
            java.lang.String r0 = "validOrigins"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x09fd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a0f
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x09fd
            r7.A0t(r0)
            goto L_0x09fd
        L_0x0a0f:
            r7.A0Y()
        L_0x0a12:
            r7.A0Z()
        L_0x0a15:
            r7.A0Z()
        L_0x0a18:
            r7.A0Z()
        L_0x0a1b:
            X.4fz r2 = r3.A05
            if (r2 == 0) goto L_0x0a77
            java.lang.String r0 = "promoAdsAutofillPostClickDataExtension"
            r7.A0q(r0)
            r7.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0a30
            java.lang.String r0 = "footerSubtype"
            r7.A0R(r0, r1)
        L_0x0a30:
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0a3d
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "isAutofillEnabled"
            r7.A0S(r0, r1)
        L_0x0a3d:
            java.util.List r1 = r2.A02
            if (r1 == 0) goto L_0x0a74
            java.lang.String r0 = "promoCodes"
            X.16P.A03(r7, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x0a4a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a71
            java.lang.Object r2 = r3.next()
            X.BFB r2 = (X.BFB) r2
            if (r2 == 0) goto L_0x0a4a
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0a64
            java.lang.String r0 = "offerIDStr"
            r7.A0R(r0, r1)
        L_0x0a64:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0a6d
            java.lang.String r0 = "promoCodeAutofillText"
            r7.A0R(r0, r1)
        L_0x0a6d:
            r7.A0Z()
            goto L_0x0a4a
        L_0x0a71:
            r7.A0Y()
        L_0x0a74:
            r7.A0Z()
        L_0x0a77:
            r7.A0Z()
        L_0x0a7a:
            java.lang.String r1 = r8.A1z
            if (r1 == 0) goto L_0x0a83
            java.lang.String r0 = "iaw_wca_exclusion_targeting_rule_oc"
            r7.A0R(r0, r1)
        L_0x0a83:
            X.3xr r1 = r8.A0I
            if (r1 == 0) goto L_0x0ada
            java.lang.String r0 = "ig_ad_media_smart_crop_info"
            r7.A0q(r0)
            X.UN1 r2 = r1.F3p()
            r7.A0c()
            java.lang.Float r0 = r2.A00
            if (r0 == 0) goto L_0x0aa4
            float r1 = r0.floatValue()
            r0 = 132(0x84, float:1.85E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0aa4:
            java.lang.Float r0 = r2.A01
            if (r0 == 0) goto L_0x0ab5
            float r1 = r0.floatValue()
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0ab5:
            java.lang.Float r0 = r2.A02
            if (r0 == 0) goto L_0x0ac6
            float r1 = r0.floatValue()
            r0 = 2720(0xaa0, float:3.812E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0ac6:
            java.lang.Float r0 = r2.A03
            if (r0 == 0) goto L_0x0ad7
            float r1 = r0.floatValue()
            r0 = 2721(0xaa1, float:3.813E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0ad7:
            r7.A0Z()
        L_0x0ada:
            X.3xs r1 = r8.A0J
            if (r1 == 0) goto L_0x0b31
            java.lang.String r0 = "ig_ad_media_text_ocr_info"
            r7.A0q(r0)
            X.UN2 r2 = r1.F3q()
            r7.A0c()
            java.lang.Float r0 = r2.A00
            if (r0 == 0) goto L_0x0afb
            float r1 = r0.floatValue()
            r0 = 132(0x84, float:1.85E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0afb:
            java.lang.Float r0 = r2.A01
            if (r0 == 0) goto L_0x0b0c
            float r1 = r0.floatValue()
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0b0c:
            java.lang.Float r0 = r2.A02
            if (r0 == 0) goto L_0x0b1d
            float r1 = r0.floatValue()
            r0 = 2720(0xaa0, float:3.812E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0b1d:
            java.lang.Float r0 = r2.A03
            if (r0 == 0) goto L_0x0b2e
            float r1 = r0.floatValue()
            r0 = 2721(0xaa1, float:3.813E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0b2e:
            r7.A0Z()
        L_0x0b31:
            com.instagram.sponsored.signals.model.AdsCTATrustInfo r2 = r8.A0u
            if (r2 == 0) goto L_0x0b83
            java.lang.String r0 = "ig_ad_rendering_cta_trust_info_data"
            r7.A0q(r0)
            r7.A0c()
            com.instagram.sponsored.signals.model.AdsBizBadgeInfo r1 = r2.A00
            if (r1 == 0) goto L_0x0b5c
            java.lang.String r0 = "info_data"
            r7.A0q(r0)
            com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl r0 = r1.FGe()
            r7.A0c()
            com.instagram.sponsored.signals.model.AdsRatingInfo r1 = r0.A00
            if (r1 == 0) goto L_0x0b59
            java.lang.String r0 = "rating_info"
            r7.A0q(r0)
            X.AnonymousClass5I9.A00(r7, r1)
        L_0x0b59:
            r7.A0Z()
        L_0x0b5c:
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x0b80
            java.lang.String r0 = "info_type_list"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0b69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b7d
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.IGAdsTrustInfoTypeEnum r0 = (com.instagram.api.schemas.IGAdsTrustInfoTypeEnum) r0
            if (r0 == 0) goto L_0x0b69
            java.lang.String r0 = r0.A00
            r7.A0t(r0)
            goto L_0x0b69
        L_0x0b7d:
            r7.A0Y()
        L_0x0b80:
            r7.A0Z()
        L_0x0b83:
            com.instagram.sponsored.signals.model.AdsTextTrustInfo r2 = r8.A0x
            if (r2 == 0) goto L_0x0bd5
            java.lang.String r0 = "ig_ad_rendering_text_trust_info_data"
            r7.A0q(r0)
            r7.A0c()
            com.instagram.sponsored.signals.model.AdsBizBadgeInfo r1 = r2.A00
            if (r1 == 0) goto L_0x0bae
            java.lang.String r0 = "info_data"
            r7.A0q(r0)
            com.instagram.sponsored.signals.model.AdsBizBadgeInfoImpl r0 = r1.FGe()
            r7.A0c()
            com.instagram.sponsored.signals.model.AdsRatingInfo r1 = r0.A00
            if (r1 == 0) goto L_0x0bab
            java.lang.String r0 = "rating_info"
            r7.A0q(r0)
            X.AnonymousClass5I9.A00(r7, r1)
        L_0x0bab:
            r7.A0Z()
        L_0x0bae:
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x0bd2
            java.lang.String r0 = "info_type_list"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0bbb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0bcf
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.IGAdsTrustInfoTypeEnum r0 = (com.instagram.api.schemas.IGAdsTrustInfoTypeEnum) r0
            if (r0 == 0) goto L_0x0bbb
            java.lang.String r0 = r0.A00
            r7.A0t(r0)
            goto L_0x0bbb
        L_0x0bcf:
            r7.A0Y()
        L_0x0bd2:
            r7.A0Z()
        L_0x0bd5:
            com.instagram.api.schemas.IGAdsIABScreenshotDataDict r1 = r8.A0M
            if (r1 == 0) goto L_0x0c84
            java.lang.String r0 = "ig_ads_iab_screenshot_data"
            r7.A0q(r0)
            com.instagram.api.schemas.IGAdsIABScreenshotDataDictImpl r2 = r1.F3x()
            r7.A0c()
            java.lang.Float r0 = r2.A04
            if (r0 == 0) goto L_0x0bf6
            float r1 = r0.floatValue()
            r0 = 1570(0x622, float:2.2E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0bf6:
            java.lang.Float r0 = r2.A05
            if (r0 == 0) goto L_0x0c07
            float r1 = r0.floatValue()
            r0 = 1601(0x641, float:2.243E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0c07:
            com.instagram.api.schemas.IABScreenshotEffectOnUserAction r0 = r2.A00
            if (r0 == 0) goto L_0x0c16
            java.lang.String r1 = r0.A00
            r0 = 1783(0x6f7, float:2.499E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0c16:
            java.lang.Float r0 = r2.A06
            if (r0 == 0) goto L_0x0c27
            float r1 = r0.floatValue()
            r0 = 1784(0x6f8, float:2.5E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0c27:
            java.lang.Float r0 = r2.A07
            if (r0 == 0) goto L_0x0c38
            float r1 = r0.floatValue()
            r0 = 1785(0x6f9, float:2.501E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0O(r0, r1)
        L_0x0c38:
            com.instagram.api.schemas.IABScreenshotTransitionTime r0 = r2.A01
            if (r0 == 0) goto L_0x0c47
            java.lang.String r1 = r0.A00
            r0 = 1786(0x6fa, float:2.503E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0c47:
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x0c54
            r0 = 1787(0x6fb, float:2.504E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0c54:
            com.instagram.api.schemas.IGAdsIABScreenshotVariant r0 = r2.A02
            if (r0 == 0) goto L_0x0c63
            java.lang.String r1 = r0.A00
            r0 = 1788(0x6fc, float:2.506E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0c63:
            java.lang.Boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0c74
            boolean r1 = r0.booleanValue()
            r0 = 1820(0x71c, float:2.55E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0S(r0, r1)
        L_0x0c74:
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x0c81
            r0 = 1882(0x75a, float:2.637E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0c81:
            r7.A0Z()
        L_0x0c84:
            com.instagram.api.schemas.IGCTATextVariant r1 = r8.A0N
            if (r1 == 0) goto L_0x0ccd
            java.lang.String r0 = "ig_cta_text_variant_data"
            r7.A0q(r0)
            com.instagram.api.schemas.IGCTATextVariantImpl r2 = r1.F46()
            r7.A0c()
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0ca1
            r0 = 1254(0x4e6, float:1.757E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0ca1:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0cb2
            boolean r1 = r0.booleanValue()
            r0 = 720(0x2d0, float:1.009E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0S(r0, r1)
        L_0x0cb2:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0cbb
            java.lang.String r0 = "language"
            r7.A0R(r0, r1)
        L_0x0cbb:
            com.instagram.api.schemas.IGCTATextVariantSource r0 = r2.A00
            if (r0 == 0) goto L_0x0cca
            java.lang.String r1 = r0.A00
            r0 = 1883(0x75b, float:2.639E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x0cca:
            r7.A0Z()
        L_0x0ccd:
            java.lang.String r1 = r8.A20
            if (r1 == 0) goto L_0x0cd6
            java.lang.String r0 = "ig_events_extracted_date"
            r7.A0R(r0, r1)
        L_0x0cd6:
            X.3tb r2 = r8.A0L
            if (r2 == 0) goto L_0x0d12
            java.lang.String r0 = "ig_feed_video_watch_and_browse_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.Float r0 = r2.A02
            if (r0 == 0) goto L_0x0cf3
            float r1 = r0.floatValue()
            r0 = 737(0x2e1, float:1.033E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0O(r0, r1)
        L_0x0cf3:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = r2.A00
            if (r0 == 0) goto L_0x0cfe
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ig_ads_feed_video_watch_and_browse_viewer_type"
            r7.A0R(r0, r1)
        L_0x0cfe:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0d0f
            boolean r1 = r0.booleanValue()
            r0 = 790(0x316, float:1.107E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0S(r0, r1)
        L_0x0d0f:
            r7.A0Z()
        L_0x0d12:
            X.3xt r1 = r8.A0Q
            if (r1 == 0) goto L_0x0d30
            java.lang.String r0 = "ig_format_liquidity_ads_info"
            r7.A0q(r0)
            X.56L r0 = r1.F4C()
            r7.A0c()
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r0 = r0.A00
            if (r0 == 0) goto L_0x0d2d
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "format_liquidity_use_case"
            r7.A0R(r0, r1)
        L_0x0d2d:
            r7.A0Z()
        L_0x0d30:
            X.3xu r1 = r8.A0U
            if (r1 == 0) goto L_0x0d59
            java.lang.String r0 = "ig_oops_survey_info"
            r7.A0q(r0)
            X.BFA r2 = r1.F4q()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0d49
            java.lang.String r0 = "category"
            r7.A0R(r0, r1)
        L_0x0d49:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0d56
            r0 = 162(0xa2, float:2.27E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0R(r0, r1)
        L_0x0d56:
            r7.A0Z()
        L_0x0d59:
            X.3xv r2 = r8.A0V
            if (r2 == 0) goto L_0x0d80
            java.lang.String r0 = "ig_pbia_profile_and_browse_info"
            r7.A0q(r0)
            r7.A0c()
            com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum r0 = r2.A00
            if (r0 == 0) goto L_0x0d70
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ig_pbia_profile_and_browse_type"
            r7.A0R(r0, r1)
        L_0x0d70:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0d7d
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_render_dimmer"
            r7.A0S(r0, r1)
        L_0x0d7d:
            r7.A0Z()
        L_0x0d80:
            com.instagram.api.schemas.IGRFSurveyInfoDict r1 = r8.A0W
            if (r1 == 0) goto L_0x0df6
            java.lang.String r0 = "ig_rf_survey_info"
            r7.A0q(r0)
            com.instagram.api.schemas.IGRFSurveyInfoDictImpl r0 = r1.F51()
            r7.A0c()
            com.instagram.api.schemas.IGRFSurveyContextDict r1 = r0.A00
            if (r1 == 0) goto L_0x0df3
            r0 = 4772(0x12a4, float:6.687E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0q(r0)
            com.instagram.api.schemas.IGRFSurveyContextDictImpl r4 = r1.F4z()
            r7.A0c()
            java.util.List r1 = r4.A01
            if (r1 == 0) goto L_0x0de3
            r0 = 1227(0x4cb, float:1.72E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r7, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x0db5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0de0
            java.lang.Object r0 = r3.next()
            com.instagram.api.schemas.IGRFSurveyContextMappingDict r0 = (com.instagram.api.schemas.IGRFSurveyContextMappingDict) r0
            if (r0 == 0) goto L_0x0db5
            com.instagram.api.schemas.IGRFSurveyContextMappingDictImpl r2 = r0.F50()
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0dd3
            java.lang.String r0 = "name"
            r7.A0R(r0, r1)
        L_0x0dd3:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0ddc
            java.lang.String r0 = "value"
            r7.A0R(r0, r1)
        L_0x0ddc:
            r7.A0Z()
            goto L_0x0db5
        L_0x0de0:
            r7.A0Y()
        L_0x0de3:
            java.lang.String r1 = r4.A00
            if (r1 == 0) goto L_0x0df0
            r0 = 162(0xa2, float:2.27E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0R(r0, r1)
        L_0x0df0:
            r7.A0Z()
        L_0x0df3:
            r7.A0Z()
        L_0x0df6:
            X.3xx r1 = r8.A0Z
            if (r1 == 0) goto L_0x0e53
            java.lang.String r0 = "ig_transparency_and_control_disclaimer_data"
            r7.A0q(r0)
            X.5CY r4 = r1.F57()
            r7.A0c()
            java.util.List r1 = r4.A01
            if (r1 == 0) goto L_0x0e43
            java.lang.String r0 = "disclaimers"
            X.16P.A03(r7, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x0e13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0e40
            java.lang.Object r0 = r3.next()
            X.5CX r0 = (X.AnonymousClass5CX) r0
            if (r0 == 0) goto L_0x0e13
            X.5CW r2 = r0.F3u()
            r7.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0e31
            java.lang.String r0 = "label"
            r7.A0R(r0, r1)
        L_0x0e31:
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r0 = r2.A00
            if (r0 == 0) goto L_0x0e3c
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "placement"
            r7.A0R(r0, r1)
        L_0x0e3c:
            r7.A0Z()
            goto L_0x0e13
        L_0x0e40:
            r7.A0Y()
        L_0x0e43:
            java.lang.String r1 = r4.A00
            if (r1 == 0) goto L_0x0e50
            r0 = 716(0x2cc, float:1.003E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r7.A0R(r0, r1)
        L_0x0e50:
            r7.A0Z()
        L_0x0e53:
            X.3xy r1 = r8.A0e
            if (r1 == 0) goto L_0x0e5f
            java.lang.String r0 = "igtv_media_background"
            r7.A0q(r0)
            X.C271234iU.A00(r7, r1)
        L_0x0e5f:
            java.lang.Integer r0 = r8.A1e
            if (r0 == 0) goto L_0x0e6c
            int r1 = r0.intValue()
            java.lang.String r0 = "imp_signature"
            r7.A0P(r0, r1)
        L_0x0e6c:
            java.lang.Integer r0 = r8.A1f
            if (r0 == 0) goto L_0x0e79
            int r1 = r0.intValue()
            java.lang.String r0 = "impression_signature"
            r7.A0P(r0, r1)
        L_0x0e79:
            X.3I1 r1 = r8.A0r
            if (r1 == 0) goto L_0x0e85
            java.lang.String r0 = "invalidation_rules"
            r7.A0q(r0)
            X.C250373lL.A00(r7, r1)
        L_0x0e85:
            java.lang.Boolean r0 = r8.A1C
            if (r0 == 0) goto L_0x0e92
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "isExternalUrlLandingPage"
            r7.A0S(r0, r1)
        L_0x0e92:
            java.lang.Boolean r0 = r8.A13
            if (r0 == 0) goto L_0x0e9f
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_app_mae_ad_exclusion_eligible"
            r7.A0S(r0, r1)
        L_0x0e9f:
            java.lang.Boolean r0 = r8.A14
            if (r0 == 0) goto L_0x0eac
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_autotranslated"
            r7.A0S(r0, r1)
        L_0x0eac:
            java.lang.Boolean r0 = r8.A15
            if (r0 == 0) goto L_0x0eb9
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_bau_ifu_eligible"
            r7.A0S(r0, r1)
        L_0x0eb9:
            java.lang.Boolean r0 = r8.A16
            if (r0 == 0) goto L_0x0ec6
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_boosted"
            r7.A0S(r0, r1)
        L_0x0ec6:
            java.lang.Boolean r0 = r8.A17
            if (r0 == 0) goto L_0x0ed3
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_consent_growth_ifu_eligible"
            r7.A0S(r0, r1)
        L_0x0ed3:
            java.lang.Boolean r0 = r8.A18
            if (r0 == 0) goto L_0x0ee0
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_consent_growth_popup_eligible"
            r7.A0S(r0, r1)
        L_0x0ee0:
            java.lang.Boolean r0 = r8.A19
            if (r0 == 0) goto L_0x0eed
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_conversions_ad_with_upcoming_event"
            r7.A0S(r0, r1)
        L_0x0eed:
            java.lang.Boolean r0 = r8.A1A
            if (r0 == 0) goto L_0x0efa
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_delayed_skip_ad"
            r7.A0S(r0, r1)
        L_0x0efa:
            java.lang.Boolean r0 = r8.A1B
            if (r0 == 0) goto L_0x0f07
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_demo"
            r7.A0S(r0, r1)
        L_0x0f07:
            java.lang.Boolean r0 = r8.A1D
            if (r0 == 0) goto L_0x0f14
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_feed_glados_control_eligible"
            r7.A0S(r0, r1)
        L_0x0f14:
            java.lang.Boolean r0 = r8.A1E
            if (r0 == 0) goto L_0x0f21
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_form_extension_eligible"
            r7.A0S(r0, r1)
        L_0x0f21:
            java.lang.Boolean r0 = r8.A1F
            if (r0 == 0) goto L_0x0f2e
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_holdout"
            r7.A0S(r0, r1)
        L_0x0f2e:
            java.lang.Boolean r0 = r8.A1G
            if (r0 == 0) goto L_0x0f3b
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_ig_events_excluded_ad"
            r7.A0S(r0, r1)
        L_0x0f3b:
            java.lang.Boolean r0 = r8.A1H
            if (r0 == 0) goto L_0x0f48
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_leadgen_native_eligible"
            r7.A0S(r0, r1)
        L_0x0f48:
            java.lang.Boolean r0 = r8.A1I
            if (r0 == 0) goto L_0x0f55
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_luxury_vertical_ad"
            r7.A0S(r0, r1)
        L_0x0f55:
            java.lang.Boolean r0 = r8.A1J
            if (r0 == 0) goto L_0x0f62
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_multi_ads_eligible"
            r7.A0S(r0, r1)
        L_0x0f62:
            java.lang.Boolean r0 = r8.A1K
            if (r0 == 0) goto L_0x0f6f
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_pharma_and_sensitive_vertical_ad"
            r7.A0S(r0, r1)
        L_0x0f6f:
            java.lang.Boolean r0 = r8.A1L
            if (r0 == 0) goto L_0x0f7c
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_pharma_vertical_ad"
            r7.A0S(r0, r1)
        L_0x0f7c:
            java.lang.Boolean r0 = r8.A1M
            if (r0 == 0) goto L_0x0f89
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_post_click_afi_eligible"
            r7.A0S(r0, r1)
        L_0x0f89:
            java.lang.Boolean r0 = r8.A1N
            if (r0 == 0) goto L_0x0f96
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_previewable_video_ad"
            r7.A0S(r0, r1)
        L_0x0f96:
            java.lang.Boolean r0 = r8.A1O
            if (r0 == 0) goto L_0x0fa3
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_rev_share"
            r7.A0S(r0, r1)
        L_0x0fa3:
            java.lang.Boolean r0 = r8.A1P
            if (r0 == 0) goto L_0x0fb0
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_sensitive_vertical_ad"
            r7.A0S(r0, r1)
        L_0x0fb0:
            java.lang.Boolean r0 = r8.A1Q
            if (r0 == 0) goto L_0x0fbd
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_shops_ifu_eligible"
            r7.A0S(r0, r1)
        L_0x0fbd:
            java.lang.Integer r0 = r8.A1g
            if (r0 == 0) goto L_0x0fca
            int r1 = r0.intValue()
            java.lang.String r0 = "item_type"
            r7.A0P(r0, r1)
        L_0x0fca:
            java.util.List r1 = r8.A2I
            if (r1 == 0) goto L_0x0fee
            java.lang.String r0 = "items"
            X.16P.A03(r7, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0fd7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0feb
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0fd7
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r7, r1)
            goto L_0x0fd7
        L_0x0feb:
            r7.A0Y()
        L_0x0fee:
            java.lang.String r1 = r8.A21
            if (r1 == 0) goto L_0x0ff7
            java.lang.String r0 = "label"
            r7.A0R(r0, r1)
        L_0x0ff7:
            java.lang.Boolean r0 = r8.A1R
            if (r0 == 0) goto L_0x1004
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "lead_gen_allow_phone_zip_format_improvement"
            r7.A0S(r0, r1)
        L_0x1004:
            java.util.List r1 = r8.A2J
            if (r1 == 0) goto L_0x102a
            java.lang.String r0 = "lead_gen_android_links"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1027
            java.lang.Object r0 = r1.next()
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x1011
            com.instagram.model.androidlink.AndroidLinkImpl r0 = r0.FES()
            X.C250113kv.A00(r7, r0)
            goto L_0x1011
        L_0x1027:
            r7.A0Y()
        L_0x102a:
            java.lang.String r1 = r8.A22
            if (r1 == 0) goto L_0x1033
            java.lang.String r0 = "lead_gen_call_to_action_title"
            r7.A0R(r0, r1)
        L_0x1033:
            java.lang.Boolean r0 = r8.A1S
            if (r0 == 0) goto L_0x1040
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "lead_gen_force_full_page_context_card"
            r7.A0S(r0, r1)
        L_0x1040:
            java.lang.String r1 = r8.A23
            if (r1 == 0) goto L_0x1049
            java.lang.String r0 = "lead_gen_form_id"
            r7.A0R(r0, r1)
        L_0x1049:
            java.util.List r1 = r8.A2K
            if (r1 == 0) goto L_0x106f
            java.lang.String r0 = "lead_gen_ios_links"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1056:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x106c
            java.lang.Object r0 = r1.next()
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x1056
            com.instagram.model.androidlink.AndroidLinkImpl r0 = r0.FES()
            X.C250113kv.A00(r7, r0)
            goto L_0x1056
        L_0x106c:
            r7.A0Y()
        L_0x106f:
            java.lang.Boolean r0 = r8.A1T
            if (r0 == 0) goto L_0x107c
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "lead_gen_new_experience_ineligible"
            r7.A0S(r0, r1)
        L_0x107c:
            X.3y0 r1 = r8.A0T
            if (r1 == 0) goto L_0x108c
            java.lang.String r0 = "lead_gen_preclick_data"
            r7.A0q(r0)
            X.4zJ r0 = r1.F4J()
            X.C279764zH.A00(r7, r0)
        L_0x108c:
            java.lang.String r1 = r8.A24
            if (r1 == 0) goto L_0x1095
            java.lang.String r0 = "link_hint_text"
            r7.A0R(r0, r1)
        L_0x1095:
            java.lang.String r1 = r8.A25
            if (r1 == 0) goto L_0x109e
            java.lang.String r0 = "link_text"
            r7.A0R(r0, r1)
        L_0x109e:
            X.3xy r1 = r8.A0f
            if (r1 == 0) goto L_0x10aa
            java.lang.String r0 = "media_background"
            r7.A0q(r0)
            X.C271234iU.A00(r7, r1)
        L_0x10aa:
            java.lang.String r1 = r8.A26
            if (r1 == 0) goto L_0x10b3
            java.lang.String r0 = "media_id"
            r7.A0R(r0, r1)
        L_0x10b3:
            X.3y1 r2 = r8.A0a
            if (r2 == 0) goto L_0x10dc
            java.lang.String r0 = "message_extension_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x10cc
            r0 = 1070(0x42e, float:1.5E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x10cc:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x10d9
            r0 = 1594(0x63a, float:2.234E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x10d9:
            r7.A0Z()
        L_0x10dc:
            X.3y3 r1 = r8.A0h
            if (r1 == 0) goto L_0x10e8
            java.lang.String r0 = "music_info"
            r7.A0q(r0)
            X.C45627Czd.A00(r7, r1)
        L_0x10e8:
            X.3y5 r1 = r8.A0b
            if (r1 == 0) goto L_0x10f4
            java.lang.String r0 = "on_impressions_control"
            r7.A0q(r0)
            X.C278574x8.A00(r7, r1)
        L_0x10f4:
            java.lang.String r1 = r8.A27
            if (r1 == 0) goto L_0x10fd
            java.lang.String r0 = "optimization_goal_name"
            r7.A0R(r0, r1)
        L_0x10fd:
            java.lang.String r1 = r8.A28
            if (r1 == 0) goto L_0x1106
            java.lang.String r0 = "overlay_subtitle"
            r7.A0R(r0, r1)
        L_0x1106:
            java.util.List r1 = r8.A2L
            if (r1 == 0) goto L_0x1128
            java.lang.String r0 = "pac_ad_media_ids"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1113:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1125
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x1113
            r7.A0t(r0)
            goto L_0x1113
        L_0x1125:
            r7.A0Y()
        L_0x1128:
            java.lang.String r1 = r8.A29
            if (r1 == 0) goto L_0x1131
            java.lang.String r0 = "page_id"
            r7.A0R(r0, r1)
        L_0x1131:
            java.lang.String r3 = r8.A2A
            if (r3 == 0) goto L_0x1142
            r2 = 9
            r1 = 12
            r0 = 49
            java.lang.String r0 = X.C21058XCk.A01(r2, r1, r0)
            r7.A0R(r0, r3)
        L_0x1142:
            X.3y7 r1 = r8.A0c
            if (r1 == 0) goto L_0x115e
            java.lang.String r0 = "political_context"
            r7.A0q(r0)
            X.5Ca r0 = r1.F7X()
            r7.A0c()
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x115b
            java.lang.String r0 = "byline_text"
            r7.A0R(r0, r1)
        L_0x115b:
            r7.A0Z()
        L_0x115e:
            java.util.List r1 = r8.A2M
            if (r1 == 0) goto L_0x1182
            java.lang.String r0 = "post_trigger_experience_eligibilities"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x116b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x117f
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.IGPostTriggerExperience r0 = (com.instagram.api.schemas.IGPostTriggerExperience) r0
            if (r0 == 0) goto L_0x116b
            java.lang.String r0 = r0.A00
            r7.A0t(r0)
            goto L_0x116b
        L_0x117f:
            r7.A0Y()
        L_0x1182:
            java.util.List r1 = r8.A2N
            if (r1 == 0) goto L_0x11a6
            java.lang.String r0 = "post_trigger_experience_eligible_triggers"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x118f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x11a3
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger r0 = (com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger) r0
            if (r0 == 0) goto L_0x118f
            java.lang.String r0 = r0.A00
            r7.A0t(r0)
            goto L_0x118f
        L_0x11a3:
            r7.A0Y()
        L_0x11a6:
            com.instagram.api.schemas.IGAdProfileProductTabDict r2 = r8.A0K
            if (r2 == 0) goto L_0x1212
            java.lang.String r0 = "profile_product_tab_data"
            r7.A0q(r0)
            r1 = 0
            X.1hu r0 = new X.1hu
            r0.<init>(r1)
            com.instagram.api.schemas.IGAdProfileProductTabDictImpl r2 = r2.F3s(r0)
            r7.A0c()
            com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum r0 = r2.A00
            if (r0 == 0) goto L_0x11cb
            java.lang.String r1 = r0.A00
            r0 = 1347(0x543, float:1.888E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x11cb:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x11dc
            boolean r1 = r0.booleanValue()
            r0 = 1522(0x5f2, float:2.133E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0S(r0, r1)
        L_0x11dc:
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x11ed
            boolean r1 = r0.booleanValue()
            r0 = 323(0x143, float:4.53E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0S(r0, r1)
        L_0x11ed:
            java.util.List r1 = r2.A03
            if (r1 == 0) goto L_0x120f
            java.lang.String r0 = "products"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x11fa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x120c
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            if (r0 == 0) goto L_0x11fa
            X.C275404q6.A00(r7, r0)
            goto L_0x11fa
        L_0x120c:
            r7.A0Y()
        L_0x120f:
            r7.A0Z()
        L_0x1212:
            X.3y8 r1 = r8.A0d
            if (r1 == 0) goto L_0x1254
            java.lang.String r0 = "profile_visit_ads_info"
            r7.A0q(r0)
            X.54p r2 = r1.F8E()
            r7.A0c()
            com.instagram.model.androidlink.AndroidLink r1 = r2.A00
            if (r1 == 0) goto L_0x1232
            java.lang.String r0 = "android_link"
            r7.A0q(r0)
            com.instagram.model.androidlink.AndroidLinkImpl r0 = r1.FES()
            X.C250113kv.A00(r7, r0)
        L_0x1232:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x123f
            int r1 = r0.intValue()
            java.lang.String r0 = "secondary_cta_destination"
            r7.A0P(r0, r1)
        L_0x123f:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x1248
            java.lang.String r0 = "secondary_cta_hint_text"
            r7.A0R(r0, r1)
        L_0x1248:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x1251
            java.lang.String r0 = "secondary_cta_title"
            r7.A0R(r0, r1)
        L_0x1251:
            r7.A0Z()
        L_0x1254:
            X.3y9 r1 = r8.A0s
            if (r1 == 0) goto L_0x1260
            java.lang.String r0 = "reels_mid_scene_info"
            r7.A0q(r0)
            X.C56349Hx0.A00(r7, r1)
        L_0x1260:
            X.3yB r1 = r8.A0t
            if (r1 == 0) goto L_0x1278
            java.lang.String r0 = "reels_multi_ads_info"
            r7.A0q(r0)
            r7.A0c()
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x1275
            java.lang.String r0 = "ad_info_text"
            r7.A0R(r0, r1)
        L_0x1275:
            r7.A0Z()
        L_0x1278:
            X.3yD r1 = r8.A0Y
            if (r1 == 0) goto L_0x1298
            java.lang.String r0 = "short_video_dtd"
            r7.A0q(r0)
            X.4zN r0 = r1.F53()
            r7.A0c()
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x1295
            int r1 = r0.intValue()
            java.lang.String r0 = "loop_count"
            r7.A0P(r0, r1)
        L_0x1295:
            r7.A0Z()
        L_0x1298:
            java.lang.Boolean r0 = r8.A1U
            if (r0 == 0) goto L_0x12a5
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_fetch_preview_comments"
            r7.A0S(r0, r1)
        L_0x12a5:
            java.lang.Boolean r0 = r8.A1V
            if (r0 == 0) goto L_0x12b2
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_show_exclusive_info_cta"
            r7.A0S(r0, r1)
        L_0x12b2:
            java.lang.Boolean r0 = r8.A1W
            if (r0 == 0) goto L_0x12bf
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_show_secondary_cta_on_profile"
            r7.A0S(r0, r1)
        L_0x12bf:
            java.lang.Boolean r0 = r8.A1X
            if (r0 == 0) goto L_0x12cc
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "show_ad_choices"
            r7.A0S(r0, r1)
        L_0x12cc:
            java.lang.Boolean r0 = r8.A1Y
            if (r0 == 0) goto L_0x12d9
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "show_icon"
            r7.A0S(r0, r1)
        L_0x12d9:
            java.lang.Boolean r0 = r8.A1Z
            if (r0 == 0) goto L_0x12e6
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "show_page_name_in_headline"
            r7.A0S(r0, r1)
        L_0x12e6:
            X.3yE r2 = r8.A0g
            if (r2 == 0) goto L_0x1319
            java.lang.String r0 = "sponsored_ad_disclaimer"
            r7.A0q(r0)
            r7.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x12fb
            java.lang.String r0 = "bold_style_text"
            r7.A0R(r0, r1)
        L_0x12fb:
            boolean r1 = r2.A03
            java.lang.String r0 = "has_bold_style_text"
            r7.A0S(r0, r1)
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x130b
            java.lang.String r0 = "label"
            r7.A0R(r0, r1)
        L_0x130b:
            com.instagram.api.schemas.SponsoredAdsDisclaimerType r0 = r2.A00
            if (r0 == 0) goto L_0x1316
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "label_type"
            r7.A0R(r0, r1)
        L_0x1316:
            r7.A0Z()
        L_0x1319:
            X.3yG r1 = r8.A0i
            if (r1 == 0) goto L_0x1342
            java.lang.String r0 = "story_dynamic_ad_flexible_tiles_info"
            r7.A0q(r0)
            X.BGk r2 = r1.F9o()
            r7.A0c()
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L_0x1336
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "apply_craft"
            r7.A0S(r0, r1)
        L_0x1336:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x133f
            java.lang.String r0 = "aspect_ratio"
            r7.A0R(r0, r1)
        L_0x133f:
            r7.A0Z()
        L_0x1342:
            com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData r1 = r8.A0H
            if (r1 == 0) goto L_0x13d6
            java.lang.String r0 = "systematic_caption"
            r7.A0q(r0)
            com.instagram.api.schemas.IGAdCreativeStory9x16CaptionDataImpl r2 = r1.F3o()
            r7.A0c()
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x135b
            java.lang.String r0 = "caption_background_color"
            r7.A0R(r0, r1)
        L_0x135b:
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x1364
            java.lang.String r0 = "caption_background_color_alpha"
            r7.A0R(r0, r1)
        L_0x1364:
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x1371
            int r1 = r0.intValue()
            java.lang.String r0 = "caption_box_width_pct"
            r7.A0P(r0, r1)
        L_0x1371:
            java.lang.Float r0 = r2.A03
            if (r0 == 0) goto L_0x137e
            float r1 = r0.floatValue()
            java.lang.String r0 = "caption_center_x_pct"
            r7.A0O(r0, r1)
        L_0x137e:
            java.lang.Float r0 = r2.A04
            if (r0 == 0) goto L_0x138b
            float r1 = r0.floatValue()
            java.lang.String r0 = "caption_center_y_pct"
            r7.A0O(r0, r1)
        L_0x138b:
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x1394
            java.lang.String r0 = "caption_color"
            r7.A0R(r0, r1)
        L_0x1394:
            java.lang.Integer r0 = r2.A06
            if (r0 == 0) goto L_0x13a1
            int r1 = r0.intValue()
            java.lang.String r0 = "caption_font_size"
            r7.A0P(r0, r1)
        L_0x13a1:
            com.instagram.api.schemas.CaptionTextFontStyle r0 = r2.A00
            if (r0 == 0) goto L_0x13ac
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "caption_font_style"
            r7.A0R(r0, r1)
        L_0x13ac:
            java.lang.Integer r0 = r2.A07
            if (r0 == 0) goto L_0x13b9
            int r1 = r0.intValue()
            java.lang.String r0 = "caption_num_lines"
            r7.A0P(r0, r1)
        L_0x13b9:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x13c6
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "caption_tap_area_more_present"
            r7.A0S(r0, r1)
        L_0x13c6:
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x13d3
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "caption_tap_area_underline_present"
            r7.A0S(r0, r1)
        L_0x13d3:
            r7.A0Z()
        L_0x13d6:
            X.1bK r1 = r8.A0m
            if (r1 == 0) goto L_0x13e2
            java.lang.String r0 = "testimonial_data"
            r7.A0q(r0)
            X.AnonymousClass1Zw.A00(r7, r1)
        L_0x13e2:
            com.instagram.api.schemas.TestimonialDict r2 = r8.A0j
            if (r2 == 0) goto L_0x142c
            java.lang.String r0 = "testimonial_data_v2"
            r7.A0q(r0)
            r1 = 0
            X.1hu r0 = new X.1hu
            r0.<init>(r1)
            com.instagram.api.schemas.TestimonialDictImpl r3 = r2.FCO(r0)
            r7.A0c()
            com.instagram.user.model.User r1 = r3.A00
            if (r1 == 0) goto L_0x1406
            java.lang.String r0 = "author"
            r7.A0q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r7, r1)
        L_0x1406:
            java.lang.Long r0 = r3.A01
            if (r0 == 0) goto L_0x1413
            long r1 = r0.longValue()
            java.lang.String r0 = "created_at"
            r7.A0Q(r0, r1)
        L_0x1413:
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x1420
            r0 = 697(0x2b9, float:9.77E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0R(r0, r1)
        L_0x1420:
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x1429
            java.lang.String r0 = "text"
            r7.A0R(r0, r1)
        L_0x1429:
            r7.A0Z()
        L_0x142c:
            X.3yH r1 = r8.A0X
            if (r1 == 0) goto L_0x1578
            java.lang.String r0 = "text_overlay"
            r7.A0q(r0)
            X.BFC r0 = r1.F52()
            r7.A0c()
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x1575
            java.lang.String r0 = "native_payload_v1"
            X.16P.A03(r7, r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x1449:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1572
            java.lang.Object r0 = r4.next()
            X.XAn r0 = (X.C21034XAn) r0
            if (r0 == 0) goto L_0x1449
            X.UN4 r3 = r0.F4m()
            r7.A0c()
            X.XAb r1 = r3.A00
            if (r1 == 0) goto L_0x14a5
            java.lang.String r0 = "coordinates"
            r7.A0q(r0)
            X.UN5 r2 = r1.F4l()
            r7.A0c()
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x147b
            int r1 = r0.intValue()
            java.lang.String r0 = "bottom_right_x_pct"
            r7.A0P(r0, r1)
        L_0x147b:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x1488
            int r1 = r0.intValue()
            java.lang.String r0 = "bottom_right_y_pct"
            r7.A0P(r0, r1)
        L_0x1488:
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x1495
            int r1 = r0.intValue()
            java.lang.String r0 = "top_left_x_pct"
            r7.A0P(r0, r1)
        L_0x1495:
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x14a2
            int r1 = r0.intValue()
            java.lang.String r0 = "top_left_y_pct"
            r7.A0P(r0, r1)
        L_0x14a2:
            r7.A0Z()
        L_0x14a5:
            java.lang.Boolean r0 = r3.A03
            if (r0 == 0) goto L_0x14b6
            boolean r1 = r0.booleanValue()
            r0 = 1490(0x5d2, float:2.088E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.A0S(r0, r1)
        L_0x14b6:
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x14bf
            java.lang.String r0 = "text"
            r7.A0R(r0, r1)
        L_0x14bf:
            X.XAr r1 = r3.A01
            if (r1 == 0) goto L_0x1537
            java.lang.String r0 = "text_styling"
            r7.A0q(r0)
            X.UN6 r2 = r1.F4n()
            r7.A0c()
            com.instagram.api.schemas.IGNativeSmartTextOverlayStylingAlignment r0 = r2.A01
            if (r0 == 0) goto L_0x14da
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "alignment"
            r7.A0R(r0, r1)
        L_0x14da:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x14e3
            java.lang.String r0 = "background_color"
            r7.A0R(r0, r1)
        L_0x14e3:
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x14ec
            java.lang.String r0 = "font_color"
            r7.A0R(r0, r1)
        L_0x14ec:
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x14f9
            int r1 = r0.intValue()
            java.lang.String r0 = "font_size"
            r7.A0P(r0, r1)
        L_0x14f9:
            com.instagram.api.schemas.IGNativeSmartTextOverlayStylingFontStyle r0 = r2.A02
            if (r0 == 0) goto L_0x1504
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "font_style"
            r7.A0R(r0, r1)
        L_0x1504:
            java.lang.Float r0 = r2.A04
            if (r0 == 0) goto L_0x1511
            float r1 = r0.floatValue()
            java.lang.String r0 = "line_height"
            r7.A0O(r0, r1)
        L_0x1511:
            java.lang.Integer r0 = r2.A06
            if (r0 == 0) goto L_0x151e
            int r1 = r0.intValue()
            java.lang.String r0 = "max_number_of_lines"
            r7.A0P(r0, r1)
        L_0x151e:
            com.instagram.api.schemas.IGNativeSmartTextOverlayTextAlignmentEnum r0 = r2.A03
            if (r0 == 0) goto L_0x1529
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "text_alignment"
            r7.A0R(r0, r1)
        L_0x1529:
            com.instagram.api.schemas.IGNativeSmartTextOverlayFontStyleEnum r0 = r2.A00
            if (r0 == 0) goto L_0x1534
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "text_font_style"
            r7.A0R(r0, r1)
        L_0x1534:
            r7.A0Z()
        L_0x1537:
            X.XAN r1 = r3.A02
            if (r1 == 0) goto L_0x1564
            java.lang.String r0 = "time_stamp"
            r7.A0q(r0)
            X.UN7 r2 = r1.F4o()
            r7.A0c()
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x1554
            int r1 = r0.intValue()
            java.lang.String r0 = "end"
            r7.A0P(r0, r1)
        L_0x1554:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x1561
            int r1 = r0.intValue()
            java.lang.String r0 = "start"
            r7.A0P(r0, r1)
        L_0x1561:
            r7.A0Z()
        L_0x1564:
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x156d
            java.lang.String r0 = "truncation_text"
            r7.A0R(r0, r1)
        L_0x156d:
            r7.A0Z()
            goto L_0x1449
        L_0x1572:
            r7.A0Y()
        L_0x1575:
            r7.A0Z()
        L_0x1578:
            java.lang.String r1 = r8.A2B
            if (r1 == 0) goto L_0x1581
            java.lang.String r0 = "tracking_token"
            r7.A0R(r0, r1)
        L_0x1581:
            X.3yI r1 = r8.A0k
            if (r1 == 0) goto L_0x158d
            java.lang.String r0 = "urp_card_transformation"
            r7.A0q(r0)
            X.D0H.A00(r7, r1)
        L_0x158d:
            java.lang.Integer r0 = r8.A1h
            if (r0 == 0) goto L_0x159a
            int r1 = r0.intValue()
            java.lang.String r0 = "validated_product_cursor"
            r7.A0P(r0, r1)
        L_0x159a:
            java.util.List r1 = r8.A2O
            if (r1 == 0) goto L_0x15bc
            java.lang.String r0 = "view_tags"
            X.16P.A03(r7, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x15a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x15b9
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x15a7
            r7.A0t(r0)
            goto L_0x15a7
        L_0x15b9:
            r7.A0Y()
        L_0x15bc:
            r7.A0Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C250153kz.A00(X.17Z, X.3lY):void");
    }
}
