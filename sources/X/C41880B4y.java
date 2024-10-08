package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.CallAdsInfoDictIntf;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData;
import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGCTATextVariant;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.PostTriggerExperienceEligibleTrigger;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediatype.CTAStyle;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import com.instagram.sponsored.signals.model.AdsTextTrustInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.B4y  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41880B4y {
    public static Map A00(C250513lZ r6) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        TreeUpdaterJNI treeUpdaterJNI9;
        TreeUpdaterJNI treeUpdaterJNI10;
        TreeUpdaterJNI treeUpdaterJNI11;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI12;
        TreeUpdaterJNI treeUpdaterJNI13;
        TreeUpdaterJNI treeUpdaterJNI14;
        TreeUpdaterJNI treeUpdaterJNI15;
        TreeUpdaterJNI treeUpdaterJNI16;
        TreeUpdaterJNI treeUpdaterJNI17;
        ArrayList arrayList3;
        ArrayList arrayList4;
        TreeUpdaterJNI treeUpdaterJNI18;
        TreeUpdaterJNI treeUpdaterJNI19;
        TreeUpdaterJNI treeUpdaterJNI20;
        TreeUpdaterJNI treeUpdaterJNI21;
        TreeUpdaterJNI treeUpdaterJNI22;
        TreeUpdaterJNI treeUpdaterJNI23;
        TreeUpdaterJNI treeUpdaterJNI24;
        TreeUpdaterJNI treeUpdaterJNI25;
        TreeUpdaterJNI treeUpdaterJNI26;
        TreeUpdaterJNI treeUpdaterJNI27;
        TreeUpdaterJNI treeUpdaterJNI28;
        TreeUpdaterJNI treeUpdaterJNI29;
        TreeUpdaterJNI treeUpdaterJNI30;
        TreeUpdaterJNI treeUpdaterJNI31;
        TreeUpdaterJNI treeUpdaterJNI32;
        TreeUpdaterJNI treeUpdaterJNI33;
        ArrayList arrayList5;
        TreeUpdaterJNI treeUpdaterJNI34;
        String str;
        TreeUpdaterJNI treeUpdaterJNI35;
        String str2;
        ArrayList arrayList6;
        TreeUpdaterJNI treeUpdaterJNI36;
        TreeUpdaterJNI treeUpdaterJNI37;
        TreeUpdaterJNI treeUpdaterJNI38;
        TreeUpdaterJNI treeUpdaterJNI39;
        String str3;
        TreeUpdaterJNI treeUpdaterJNI40;
        TreeUpdaterJNI treeUpdaterJNI41;
        TreeUpdaterJNI treeUpdaterJNI42;
        ArrayList arrayList7;
        TreeUpdaterJNI treeUpdaterJNI43;
        ArrayList arrayList8;
        TreeUpdaterJNI treeUpdaterJNI44;
        TreeUpdaterJNI treeUpdaterJNI45;
        String str4;
        TreeUpdaterJNI treeUpdaterJNI46;
        TreeUpdaterJNI treeUpdaterJNI47;
        TreeUpdaterJNI treeUpdaterJNI48;
        TreeUpdaterJNI treeUpdaterJNI49;
        TreeUpdaterJNI treeUpdaterJNI50;
        TreeUpdaterJNI treeUpdaterJNI51;
        TreeUpdaterJNI treeUpdaterJNI52;
        TreeUpdaterJNI treeUpdaterJNI53;
        TreeUpdaterJNI treeUpdaterJNI54;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r6.AXd() != null) {
            A1H.put("about_ad_params", r6.AXd());
        }
        if (r6.AYn() != null) {
            A1H.put("actor_id", r6.AYn());
        }
        if (r6.AYt() != null) {
            A1H.put("ad_action", r6.AYt());
        }
        TreeUpdaterJNI treeUpdaterJNI55 = null;
        if (r6.AZ1() != null) {
            C257543xZ AZ1 = r6.AZ1();
            if (AZ1 != null) {
                treeUpdaterJNI54 = AZ1.FHC();
            } else {
                treeUpdaterJNI54 = null;
            }
            A1H.put("ad_disclaimer_info", treeUpdaterJNI54);
        }
        if (r6.AZ2() != null) {
            A1H.put(AnonymousClass000.A00(2579), r6.AZ2());
        }
        if (r6.AZ4() != null) {
            A1H.put("ad_id", r6.AZ4());
        }
        if (r6.AZB() != null) {
            A1H.put("ad_objective_type", r6.AZB());
        }
        if (r6.AZE() != null) {
            C239623He AZE = r6.AZE();
            if (AZE != null) {
                treeUpdaterJNI53 = AZE.FHC();
            } else {
                treeUpdaterJNI53 = null;
            }
            A1H.put("ad_pod_rules", treeUpdaterJNI53);
        }
        if (r6.AZG() != null) {
            C257563xb AZG = r6.AZG();
            if (AZG != null) {
                treeUpdaterJNI52 = AZG.FHC();
            } else {
                treeUpdaterJNI52 = null;
            }
            A1H.put("ad_tag", treeUpdaterJNI52);
        }
        if (r6.AZH() != null) {
            A1H.put("ad_title", r6.AZH());
        }
        if (r6.AZt() != null) {
            C239623He AZt = r6.AZt();
            if (AZt != null) {
                treeUpdaterJNI51 = AZt.FHC();
            } else {
                treeUpdaterJNI51 = null;
            }
            A1H.put("adpod_rules", treeUpdaterJNI51);
        }
        if (r6.AZw() != null) {
            AdsIAWRatingInfoIntf AZw = r6.AZw();
            if (AZw != null) {
                treeUpdaterJNI50 = AZw.FHC();
            } else {
                treeUpdaterJNI50 = null;
            }
            A1H.put("ads_iaw_rating_info", treeUpdaterJNI50);
        }
        if (r6.Aa3() != null) {
            AdsRatingInfoIntf Aa3 = r6.Aa3();
            if (Aa3 != null) {
                treeUpdaterJNI49 = Aa3.FHC();
            } else {
                treeUpdaterJNI49 = null;
            }
            A1H.put(AnonymousClass000.A00(2587), treeUpdaterJNI49);
        }
        if (r6.Aa5() != null) {
            C257583xd Aa5 = r6.Aa5();
            if (Aa5 != null) {
                treeUpdaterJNI48 = Aa5.FHC();
            } else {
                treeUpdaterJNI48 = null;
            }
            A1H.put("ads_shopping_info", treeUpdaterJNI48);
        }
        if (r6.Aa8() != null) {
            A1H.put("adtaxon_i18n_top1_l7_prediction", r6.Aa8());
        }
        if (r6.AaH() != null) {
            C250183l2 AaH = r6.AaH();
            if (AaH != null) {
                treeUpdaterJNI47 = AaH.FHC();
            } else {
                treeUpdaterJNI47 = null;
            }
            A1H.put("afi_info", treeUpdaterJNI47);
        }
        if (r6.Ac5() != null) {
            A1H.put("app_id", r6.Ac5());
        }
        if (r6.AcH() != null) {
            AppstoreMetadataDict AcH = r6.AcH();
            if (AcH != null) {
                treeUpdaterJNI46 = AcH.FHC();
            } else {
                treeUpdaterJNI46 = null;
            }
            A1H.put("appstore_metadata", treeUpdaterJNI46);
        }
        if (r6.Afb() != null) {
            BrandedContentAdsPaidPartnershipLabelRemovalOption Afb = r6.Afb();
            if (Afb != null) {
                str4 = Afb.A00;
            } else {
                str4 = null;
            }
            A1H.put("bca_ppl_removal_option", str4);
        }
        C257593xe AgF = r6.AgF();
        if (AgF != null) {
            A1H.put(AnonymousClass000.A00(4533), AgF.A00());
        }
        if (r6.AiF() != null) {
            A1H.put("brs_applied_content_blocklists", r6.AiF());
        }
        if (r6.AiI() != null) {
            A1H.put("brs_threshold", r6.AiI());
        }
        if (r6.Aj9() != null) {
            C257603xf Aj9 = r6.Aj9();
            if (Aj9 != null) {
                treeUpdaterJNI45 = Aj9.FHC();
            } else {
                treeUpdaterJNI45 = null;
            }
            A1H.put("buyer_incentive_feed", treeUpdaterJNI45);
        }
        if (r6.AjU() != null) {
            CallAdsInfoDictIntf AjU = r6.AjU();
            if (AjU != null) {
                treeUpdaterJNI44 = AjU.FHC();
            } else {
                treeUpdaterJNI44 = null;
            }
            A1H.put(AnonymousClass000.A00(4549), treeUpdaterJNI44);
        }
        if (r6.Ajw() != null) {
            A1H.put("campaign_id", r6.Ajw());
        }
        if (r6.AmN() != null) {
            List<C250073kr> AmN = r6.AmN();
            if (AmN != null) {
                arrayList8 = AnonymousClass7TE.A1C();
                for (C250073kr r0 : AmN) {
                    if (r0 != null) {
                        arrayList8.add(r0.FHC());
                    }
                }
            } else {
                arrayList8 = null;
            }
            A1H.put(AnonymousClass000.A00(4575), arrayList8);
        }
        if (r6.AnU() != null) {
            C250213l5 AnU = r6.AnU();
            if (AnU != null) {
                treeUpdaterJNI43 = AnU.FHC();
            } else {
                treeUpdaterJNI43 = null;
            }
            A1H.put("click_to_direct_lead_gen_ads_info", treeUpdaterJNI43);
        }
        if (r6.ArA() != null) {
            A1H.put("contextual_label_info", r6.ArA());
        }
        if (r6.getCookies() != null) {
            A1H.put("cookies", r6.getCookies());
        }
        if (r6.ArM() != null) {
            List<C250073kr> ArM = r6.ArM();
            if (ArM != null) {
                arrayList7 = AnonymousClass7TE.A1C();
                for (C250073kr r02 : ArM) {
                    if (r02 != null) {
                        arrayList7.add(r02.FHC());
                    }
                }
            } else {
                arrayList7 = null;
            }
            A1H.put("cop_render_output", arrayList7);
        }
        if (r6.AsL() != null) {
            A1H.put("creation_source", r6.AsL());
        }
        if (r6.AsP() != null) {
            C257623xh AsP = r6.AsP();
            if (AsP != null) {
                treeUpdaterJNI42 = AsP.FHC();
            } else {
                treeUpdaterJNI42 = null;
            }
            A1H.put("creative_transformations", treeUpdaterJNI42);
        }
        if (r6.AsR() != null) {
            C257643xj AsR = r6.AsR();
            if (AsR != null) {
                treeUpdaterJNI41 = AsR.FHC();
            } else {
                treeUpdaterJNI41 = null;
            }
            A1H.put("creative_transformations_v2", treeUpdaterJNI41);
        }
        if (r6.AtI() != null) {
            C257663xl AtI = r6.AtI();
            if (AtI != null) {
                treeUpdaterJNI40 = AtI.FHC();
            } else {
                treeUpdaterJNI40 = null;
            }
            A1H.put("cta_info", treeUpdaterJNI40);
        }
        if (r6.AtO() != null) {
            CTAStyle AtO = r6.AtO();
            if (AtO != null) {
                str3 = AtO.A00;
            } else {
                str3 = null;
            }
            A1H.put("cta_style", str3);
        }
        if (r6.AtX() != null) {
            C255013tR AtX = r6.AtX();
            if (AtX != null) {
                treeUpdaterJNI39 = AtX.FHC();
            } else {
                treeUpdaterJNI39 = null;
            }
            A1H.put("ctd_ads_info", treeUpdaterJNI39);
        }
        if (r6.Ata() != null) {
            C250243l8 Ata = r6.Ata();
            if (Ata != null) {
                treeUpdaterJNI38 = Ata.FHC();
            } else {
                treeUpdaterJNI38 = null;
            }
            A1H.put("ctj_ads_info", treeUpdaterJNI38);
        }
        if (r6.Atc() != null) {
            IGCTMessagingAdsInfoDictIntf Atc = r6.Atc();
            if (Atc != null) {
                treeUpdaterJNI37 = Atc.FHC();
            } else {
                treeUpdaterJNI37 = null;
            }
            A1H.put("ctmessaging_ads_info", treeUpdaterJNI37);
        }
        if (r6.Atd() != null) {
            C257673xm Atd = r6.Atd();
            if (Atd != null) {
                treeUpdaterJNI36 = Atd.FHC();
            } else {
                treeUpdaterJNI36 = null;
            }
            A1H.put(AnonymousClass000.A00(4681), treeUpdaterJNI36);
        }
        if (r6.AxE() != null) {
            A1H.put("direct_share", r6.AxE());
        }
        if (r6.Ay5() != null) {
            A1H.put("display_domain", r6.Ay5());
        }
        if (r6.Ay6() != null) {
            A1H.put("display_fb_page_name", r6.Ay6());
        }
        if (r6.AyJ() != null) {
            A1H.put("display_viewability_eligible", r6.AyJ());
        }
        if (r6.getDominantColor() != null) {
            A1H.put("dominant_color", r6.getDominantColor());
        }
        if (r6.Ayn() != null) {
            A1H.put("dr_ad_type", r6.Ayn());
        }
        if (r6.AzY() != null) {
            List<DTD> AzY = r6.AzY();
            if (AzY != null) {
                arrayList6 = AnonymousClass7TE.A1C();
                for (DTD dtd : AzY) {
                    if (dtd != null) {
                        arrayList6.add(dtd.FHC());
                    }
                }
            } else {
                arrayList6 = null;
            }
            A1H.put("dynamic_ads_links", arrayList6);
        }
        if (r6.Azd() != null) {
            DynamicProductAdDisplayOption Azd = r6.Azd();
            if (Azd != null) {
                str2 = Azd.A00;
            } else {
                str2 = null;
            }
            A1H.put("dynamic_product_ad_display_option", str2);
        }
        if (r6.B10() != null) {
            A1H.put("enable_ads_follow_button", r6.B10());
        }
        if (r6.B1H() != null) {
            A1H.put("enable_reels_end_scene", r6.B1H());
        }
        if (r6.B44() != null) {
            A1H.put("fb_app_id", r6.B44());
        }
        if (r6.B4S() != null) {
            A1H.put("fb_page_url", r6.B4S());
        }
        if (r6.B5E() != null) {
            C257693xo B5E = r6.B5E();
            if (B5E != null) {
                treeUpdaterJNI35 = B5E.FHC();
            } else {
                treeUpdaterJNI35 = null;
            }
            A1H.put("feed_end_scene_data", treeUpdaterJNI35);
        }
        if (r6.B7V() != null) {
            AdFormatType B7V = r6.B7V();
            if (B7V != null) {
                str = B7V.A00;
            } else {
                str = null;
            }
            A1H.put("format_type", str);
        }
        if (r6.B97() != null) {
            C257713xq B97 = r6.B97();
            if (B97 != null) {
                treeUpdaterJNI34 = B97.FHC();
            } else {
                treeUpdaterJNI34 = null;
            }
            A1H.put("gesture_to_action_info", treeUpdaterJNI34);
        }
        if (r6.B9V() != null) {
            A1H.put("global_position", r6.B9V());
        }
        if (r6.BD9() != null) {
            A1H.put("hide_flow_type", r6.BD9());
        }
        if (r6.BDB() != null) {
            A1H.put("hide_label", r6.BDB());
        }
        if (r6.BDE() != null) {
            List<C250273lB> BDE = r6.BDE();
            if (BDE != null) {
                arrayList5 = AnonymousClass7TE.A1C();
                for (C250273lB r03 : BDE) {
                    if (r03 != null) {
                        arrayList5.add(r03.FHC());
                    }
                }
            } else {
                arrayList5 = null;
            }
            A1H.put("hide_reasons_v2", arrayList5);
        }
        if (r6.BDw() != null) {
            C250333lH BDw = r6.BDw();
            if (BDw != null) {
                treeUpdaterJNI33 = BDw.FHC();
            } else {
                treeUpdaterJNI33 = null;
            }
            A1H.put("iab", treeUpdaterJNI33);
        }
        if (r6.BE1() != null) {
            C250363lK BE1 = r6.BE1();
            if (BE1 != null) {
                treeUpdaterJNI32 = BE1.FHC();
            } else {
                treeUpdaterJNI32 = null;
            }
            A1H.put("iab_post_click_data", treeUpdaterJNI32);
        }
        if (r6.BE3() != null) {
            A1H.put("iaw_wca_exclusion_targeting_rule_oc", r6.BE3());
        }
        if (r6.BEi() != null) {
            C257723xr BEi = r6.BEi();
            if (BEi != null) {
                treeUpdaterJNI31 = BEi.FHC();
            } else {
                treeUpdaterJNI31 = null;
            }
            A1H.put(AnonymousClass000.A00(4854), treeUpdaterJNI31);
        }
        if (r6.BEj() != null) {
            C257733xs BEj = r6.BEj();
            if (BEj != null) {
                treeUpdaterJNI30 = BEj.FHC();
            } else {
                treeUpdaterJNI30 = null;
            }
            A1H.put("ig_ad_media_text_ocr_info", treeUpdaterJNI30);
        }
        if (r6.BEk() != null) {
            AdsCTATrustInfoIntf BEk = r6.BEk();
            if (BEk != null) {
                treeUpdaterJNI29 = BEk.FHC();
            } else {
                treeUpdaterJNI29 = null;
            }
            A1H.put(AnonymousClass000.A00(4855), treeUpdaterJNI29);
        }
        if (r6.BEl() != null) {
            AdsTextTrustInfoIntf BEl = r6.BEl();
            if (BEl != null) {
                treeUpdaterJNI28 = BEl.FHC();
            } else {
                treeUpdaterJNI28 = null;
            }
            A1H.put(AnonymousClass000.A00(4856), treeUpdaterJNI28);
        }
        if (r6.BEo() != null) {
            IGAdsIABScreenshotDataDict BEo = r6.BEo();
            if (BEo != null) {
                treeUpdaterJNI27 = BEo.FHC();
            } else {
                treeUpdaterJNI27 = null;
            }
            A1H.put(AnonymousClass000.A00(4857), treeUpdaterJNI27);
        }
        if (r6.BF0() != null) {
            IGCTATextVariant BF0 = r6.BF0();
            if (BF0 != null) {
                treeUpdaterJNI26 = BF0.FHC();
            } else {
                treeUpdaterJNI26 = null;
            }
            A1H.put(AnonymousClass000.A00(4861), treeUpdaterJNI26);
        }
        if (r6.BF3() != null) {
            A1H.put("ig_events_extracted_date", r6.BF3());
        }
        if (r6.BF5() != null) {
            C255123tc BF5 = r6.BF5();
            if (BF5 != null) {
                treeUpdaterJNI25 = BF5.FHC();
            } else {
                treeUpdaterJNI25 = null;
            }
            A1H.put("ig_feed_video_watch_and_browse_info", treeUpdaterJNI25);
        }
        if (r6.BF6() != null) {
            C257743xt BF6 = r6.BF6();
            if (BF6 != null) {
                treeUpdaterJNI24 = BF6.FHC();
            } else {
                treeUpdaterJNI24 = null;
            }
            A1H.put("ig_format_liquidity_ads_info", treeUpdaterJNI24);
        }
        if (r6.BFW() != null) {
            C257753xu BFW = r6.BFW();
            if (BFW != null) {
                treeUpdaterJNI23 = BFW.FHC();
            } else {
                treeUpdaterJNI23 = null;
            }
            A1H.put("ig_oops_survey_info", treeUpdaterJNI23);
        }
        if (r6.BFX() != null) {
            C257773xw BFX = r6.BFX();
            if (BFX != null) {
                treeUpdaterJNI22 = BFX.FHC();
            } else {
                treeUpdaterJNI22 = null;
            }
            A1H.put("ig_pbia_profile_and_browse_info", treeUpdaterJNI22);
        }
        if (r6.BFe() != null) {
            IGRFSurveyInfoDict BFe = r6.BFe();
            if (BFe != null) {
                treeUpdaterJNI21 = BFe.FHC();
            } else {
                treeUpdaterJNI21 = null;
            }
            A1H.put("ig_rf_survey_info", treeUpdaterJNI21);
        }
        if (r6.BFg() != null) {
            C257783xx BFg = r6.BFg();
            if (BFg != null) {
                treeUpdaterJNI20 = BFg.FHC();
            } else {
                treeUpdaterJNI20 = null;
            }
            A1H.put("ig_transparency_and_control_disclaimer_data", treeUpdaterJNI20);
        }
        if (r6.BFn() != null) {
            C257803xz BFn = r6.BFn();
            if (BFn != null) {
                treeUpdaterJNI19 = BFn.FHC();
            } else {
                treeUpdaterJNI19 = null;
            }
            A1H.put(AnonymousClass000.A00(3319), treeUpdaterJNI19);
        }
        if (r6.BGW() != null) {
            A1H.put("imp_signature", r6.BGW());
        }
        if (r6.BGc() != null) {
            A1H.put(AnonymousClass000.A00(4871), r6.BGc());
        }
        if (r6.BIi() != null) {
            AnonymousClass3I2 BIi = r6.BIi();
            if (BIi != null) {
                treeUpdaterJNI18 = BIi.FHC();
            } else {
                treeUpdaterJNI18 = null;
            }
            A1H.put("invalidation_rules", treeUpdaterJNI18);
        }
        if (r6.CSx() != null) {
            A1H.put("isExternalUrlLandingPage", r6.CSx());
        }
        if (r6.COo() != null) {
            A1H.put("is_app_mae_ad_exclusion_eligible", r6.COo());
        }
        if (r6.CPA() != null) {
            A1H.put(AnonymousClass000.A00(4907), r6.CPA());
        }
        if (r6.CPM() != null) {
            A1H.put("is_bau_ifu_eligible", r6.CPM());
        }
        if (r6.CPa() != null) {
            A1H.put("is_boosted", r6.CPa());
        }
        if (r6.CQU() != null) {
            A1H.put("is_consent_growth_ifu_eligible", r6.CQU());
        }
        if (r6.CQV() != null) {
            A1H.put("is_consent_growth_popup_eligible", r6.CQV());
        }
        if (r6.CQb() != null) {
            A1H.put("is_conversions_ad_with_upcoming_event", r6.CQb());
        }
        if (r6.CRH() != null) {
            A1H.put("is_delayed_skip_ad", r6.CRH());
        }
        if (r6.CRL() != null) {
            A1H.put("is_demo", r6.CRL());
        }
        if (r6.CTX() != null) {
            A1H.put("is_feed_glados_control_eligible", r6.CTX());
        }
        if (r6.CTw() != null) {
            A1H.put("is_form_extension_eligible", r6.CTw());
        }
        if (r6.CUk() != null) {
            A1H.put("is_holdout", r6.CUk());
        }
        if (r6.CUv() != null) {
            A1H.put("is_ig_events_excluded_ad", r6.CUv());
        }
        if (r6.CWB() != null) {
            A1H.put("is_leadgen_native_eligible", r6.CWB());
        }
        if (r6.CWm() != null) {
            A1H.put("is_luxury_vertical_ad", r6.CWm());
        }
        if (r6.CXn() != null) {
            A1H.put("is_multi_ads_eligible", r6.CXn());
        }
        if (r6.CZ2() != null) {
            A1H.put("is_pharma_and_sensitive_vertical_ad", r6.CZ2());
        }
        if (r6.CZ3() != null) {
            A1H.put("is_pharma_vertical_ad", r6.CZ3());
        }
        if (r6.CZV() != null) {
            A1H.put("is_post_click_afi_eligible", r6.CZV());
        }
        if (r6.CZl() != null) {
            A1H.put("is_previewable_video_ad", r6.CZl());
        }
        if (r6.Cax() != null) {
            A1H.put("is_rev_share", r6.Cax());
        }
        if (r6.Cbd() != null) {
            A1H.put("is_sensitive_vertical_ad", r6.Cbd());
        }
        if (r6.Cc3() != null) {
            A1H.put("is_shops_ifu_eligible", r6.Cc3());
        }
        if (r6.BJa() != null) {
            A1H.put("item_type", r6.BJa());
        }
        List<1Xj> items = r6.getItems();
        if (items != null) {
            ArrayList A0p = AnonymousClass7TF.A0p(items);
            for (1Xj A1C : items) {
                A0p.add(A1C.A1C());
            }
            A1H.put(DialogModule.KEY_ITEMS, A0p);
        }
        if (r6.BKL() != null) {
            A1H.put("label", r6.BKL());
        }
        if (r6.BM4() != null) {
            A1H.put("lead_gen_allow_phone_zip_format_improvement", r6.BM4());
        }
        if (r6.BM5() != null) {
            List<AndroidLink> BM5 = r6.BM5();
            if (BM5 != null) {
                arrayList4 = AnonymousClass7TE.A1C();
                for (AndroidLink androidLink : BM5) {
                    if (androidLink != null) {
                        arrayList4.add(androidLink.FHC());
                    }
                }
            } else {
                arrayList4 = null;
            }
            A1H.put("lead_gen_android_links", arrayList4);
        }
        if (r6.BM6() != null) {
            A1H.put("lead_gen_call_to_action_title", r6.BM6());
        }
        if (r6.BM8() != null) {
            A1H.put("lead_gen_force_full_page_context_card", r6.BM8());
        }
        if (r6.BM9() != null) {
            A1H.put("lead_gen_form_id", r6.BM9());
        }
        if (r6.BMB() != null) {
            List<AndroidLink> BMB = r6.BMB();
            if (BMB != null) {
                arrayList3 = AnonymousClass7TE.A1C();
                for (AndroidLink androidLink2 : BMB) {
                    if (androidLink2 != null) {
                        arrayList3.add(androidLink2.FHC());
                    }
                }
            } else {
                arrayList3 = null;
            }
            A1H.put("lead_gen_ios_links", arrayList3);
        }
        if (r6.BMC() != null) {
            A1H.put("lead_gen_new_experience_ineligible", r6.BMC());
        }
        if (r6.BMD() != null) {
            C257813y0 BMD = r6.BMD();
            if (BMD != null) {
                treeUpdaterJNI17 = BMD.FHC();
            } else {
                treeUpdaterJNI17 = null;
            }
            A1H.put("lead_gen_preclick_data", treeUpdaterJNI17);
        }
        if (r6.BMm() != null) {
            A1H.put("link_hint_text", r6.BMm());
        }
        if (r6.BMq() != null) {
            A1H.put("link_text", r6.BMq());
        }
        if (r6.BPl() != null) {
            C257803xz BPl = r6.BPl();
            if (BPl != null) {
                treeUpdaterJNI16 = BPl.FHC();
            } else {
                treeUpdaterJNI16 = null;
            }
            A1H.put("media_background", treeUpdaterJNI16);
        }
        if (r6.getMediaId() != null) {
            C41845B3m.A13(r6.getMediaId(), A1H);
        }
        if (r6.BSA() != null) {
            C257833y2 BSA = r6.BSA();
            if (BSA != null) {
                treeUpdaterJNI15 = BSA.FHC();
            } else {
                treeUpdaterJNI15 = null;
            }
            A1H.put(AnonymousClass000.A00(5049), treeUpdaterJNI15);
        }
        if (r6.BUs() != null) {
            C257853y4 BUs = r6.BUs();
            if (BUs != null) {
                treeUpdaterJNI14 = BUs.FHC();
            } else {
                treeUpdaterJNI14 = null;
            }
            A1H.put("music_info", treeUpdaterJNI14);
        }
        if (r6.BY1() != null) {
            C257873y6 BY1 = r6.BY1();
            if (BY1 != null) {
                treeUpdaterJNI13 = BY1.FHC();
            } else {
                treeUpdaterJNI13 = null;
            }
            A1H.put("on_impressions_control", treeUpdaterJNI13);
        }
        if (r6.BYW() != null) {
            A1H.put("optimization_goal_name", r6.BYW());
        }
        if (r6.BZp() != null) {
            A1H.put("overlay_subtitle", r6.BZp());
        }
        if (r6.Ba5() != null) {
            A1H.put("pac_ad_media_ids", r6.Ba5());
        }
        if (r6.BaE() != null) {
            A1H.put("page_id", r6.BaE());
        }
        if (r6.Bby() != null) {
            A1H.put(C21058XCk.A01(9, 12, 49), r6.Bby());
        }
        if (r6.BdU() != null) {
            C257883y7 BdU = r6.BdU();
            if (BdU != null) {
                treeUpdaterJNI12 = BdU.FHC();
            } else {
                treeUpdaterJNI12 = null;
            }
            A1H.put("political_context", treeUpdaterJNI12);
        }
        if (r6.BeJ() != null) {
            List<IGPostTriggerExperience> BeJ = r6.BeJ();
            if (BeJ != null) {
                arrayList2 = AnonymousClass7TF.A0p(BeJ);
                for (IGPostTriggerExperience iGPostTriggerExperience : BeJ) {
                    0qQ.A0B(iGPostTriggerExperience, 0);
                    arrayList2.add(iGPostTriggerExperience.A00);
                }
            } else {
                arrayList2 = null;
            }
            A1H.put("post_trigger_experience_eligibilities", arrayList2);
        }
        if (r6.BeK() != null) {
            List<PostTriggerExperienceEligibleTrigger> BeK = r6.BeK();
            if (BeK != null) {
                arrayList = AnonymousClass7TF.A0p(BeK);
                for (PostTriggerExperienceEligibleTrigger postTriggerExperienceEligibleTrigger : BeK) {
                    0qQ.A0B(postTriggerExperienceEligibleTrigger, 0);
                    arrayList.add(postTriggerExperienceEligibleTrigger.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("post_trigger_experience_eligible_triggers", arrayList);
        }
        if (r6.BhC() != null) {
            IGAdProfileProductTabDict BhC = r6.BhC();
            if (BhC != null) {
                treeUpdaterJNI11 = BhC.FHC();
            } else {
                treeUpdaterJNI11 = null;
            }
            A1H.put(AnonymousClass000.A00(5141), treeUpdaterJNI11);
        }
        if (r6.BhM() != null) {
            C257893y8 BhM = r6.BhM();
            if (BhM != null) {
                treeUpdaterJNI10 = BhM.FHC();
            } else {
                treeUpdaterJNI10 = null;
            }
            A1H.put("profile_visit_ads_info", treeUpdaterJNI10);
        }
        if (r6.Bl6() != null) {
            C257913yA Bl6 = r6.Bl6();
            if (Bl6 != null) {
                treeUpdaterJNI9 = Bl6.FHC();
            } else {
                treeUpdaterJNI9 = null;
            }
            A1H.put("reels_mid_scene_info", treeUpdaterJNI9);
        }
        if (r6.Bl7() != null) {
            C257933yC Bl7 = r6.Bl7();
            if (Bl7 != null) {
                treeUpdaterJNI8 = Bl7.FHC();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1H.put("reels_multi_ads_info", treeUpdaterJNI8);
        }
        if (r6.Btx() != null) {
            C257943yD Btx = r6.Btx();
            if (Btx != null) {
                treeUpdaterJNI7 = Btx.FHC();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1H.put("short_video_dtd", treeUpdaterJNI7);
        }
        if (r6.Bu6() != null) {
            A1H.put("should_fetch_preview_comments", r6.Bu6());
        }
        if (r6.Bua() != null) {
            A1H.put("should_show_exclusive_info_cta", r6.Bua());
        }
        if (r6.Buk() != null) {
            A1H.put("should_show_secondary_cta_on_profile", r6.Buk());
        }
        if (r6.Bv0() != null) {
            A1H.put("show_ad_choices", r6.Bv0());
        }
        if (r6.BvX() != null) {
            A1H.put("show_icon", r6.BvX());
        }
        if (r6.Bvk() != null) {
            A1H.put(AnonymousClass000.A00(5250), r6.Bvk());
        }
        if (r6.ByK() != null) {
            C257963yF ByK = r6.ByK();
            if (ByK != null) {
                treeUpdaterJNI6 = ByK.FHC();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1H.put("sponsored_ad_disclaimer", treeUpdaterJNI6);
        }
        if (r6.C0P() != null) {
            C257973yG C0P = r6.C0P();
            if (C0P != null) {
                treeUpdaterJNI5 = C0P.FHC();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1H.put("story_dynamic_ad_flexible_tiles_info", treeUpdaterJNI5);
        }
        if (r6.C3f() != null) {
            IGAdCreativeStory9x16CaptionData C3f = r6.C3f();
            if (C3f != null) {
                treeUpdaterJNI4 = C3f.FHC();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1H.put("systematic_caption", treeUpdaterJNI4);
        }
        if (r6.C4i() != null) {
            C65211bM C4i = r6.C4i();
            if (C4i != null) {
                treeUpdaterJNI3 = C4i.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1H.put("testimonial_data", treeUpdaterJNI3);
        }
        if (r6.C4j() != null) {
            TestimonialDict C4j = r6.C4j();
            if (C4j != null) {
                treeUpdaterJNI2 = C4j.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("testimonial_data_v2", treeUpdaterJNI2);
        }
        if (r6.C5I() != null) {
            C257983yH C5I = r6.C5I();
            if (C5I != null) {
                treeUpdaterJNI = C5I.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("text_overlay", treeUpdaterJNI);
        }
        if (r6.C9L() != null) {
            A1H.put("tracking_token", r6.C9L());
        }
        if (r6.CCN() != null) {
            C258003yJ CCN = r6.CCN();
            if (CCN != null) {
                treeUpdaterJNI55 = CCN.FHC();
            }
            A1H.put("urp_card_transformation", treeUpdaterJNI55);
        }
        if (r6.CDI() != null) {
            A1H.put("validated_product_cursor", r6.CDI());
        }
        if (r6.CEo() != null) {
            A1H.put("view_tags", r6.CEo());
        }
        return 0Yt.A0B(A1H);
    }
}
