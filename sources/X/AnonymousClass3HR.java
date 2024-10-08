package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.ReelType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3HR  reason: invalid class name */
public abstract class AnonymousClass3HR {
    public static AnonymousClass3HX parseFromJson(16F r134) {
        String A1P;
        String A1P2;
        String str;
        String str2;
        String A1P3;
        String str3;
        String str4;
        String A1P4;
        String str5;
        String str6;
        16F r23 = r134;
        0qQ.A0B(r23, 0);
        try {
            if (r23.A11() != 16L.A0D) {
                r23.A0z();
                return null;
            }
            AnonymousClass3HZ r40 = null;
            String str7 = null;
            C239593Hb r47 = null;
            Long l = null;
            C239613Hd r51 = null;
            AdsIAWRatingInfo adsIAWRatingInfo = null;
            AdsRatingInfo adsRatingInfo = null;
            String str8 = null;
            String str9 = null;
            Boolean bool = null;
            C239633Hj r48 = null;
            C239653Hl r22 = null;
            String str10 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Integer num = null;
            CarouselRenderingType carouselRenderingType = null;
            ArrayList arrayList = null;
            C233492vo r55 = null;
            Float f = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            C239673Ho r49 = null;
            ArrayList arrayList2 = null;
            C239693Hq r43 = null;
            Integer num2 = null;
            ArrayList arrayList3 = null;
            Boolean bool7 = null;
            C239713Hs r42 = null;
            Long l2 = null;
            FanClubStoriesTeaserType fanClubStoriesTeaserType = null;
            String str11 = null;
            HallpassDetailsDictImpl hallpassDetailsDictImpl = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            String str12 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            HighlightReelTypeStr highlightReelTypeStr = null;
            ArrayList arrayList4 = null;
            String str13 = null;
            C239733Hx r27 = null;
            Long l3 = null;
            Boolean bool14 = null;
            IntentAwareAdsInfo intentAwareAdsInfo = null;
            ArrayList arrayList5 = null;
            String str14 = null;
            AnonymousClass3I1 r52 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            ArrayList arrayList6 = null;
            Float f2 = null;
            Long l4 = null;
            Long l5 = null;
            Integer num3 = null;
            ArrayList arrayList7 = null;
            AnonymousClass3I3 r29 = null;
            AnonymousClass3I5 r30 = null;
            Boolean bool24 = null;
            1Xj r39 = null;
            String str15 = null;
            Integer num4 = null;
            AnonymousClass3I7 r32 = null;
            String str16 = null;
            ArrayList arrayList8 = null;
            Integer num5 = null;
            Integer num6 = null;
            Long l6 = null;
            Integer num7 = null;
            AnonymousClass3HV r44 = null;
            C239673Ho r50 = null;
            AnonymousClass3I9 r33 = null;
            ReelType reelType = null;
            AnonymousClass3IB r41 = null;
            AnonymousClass3ID r54 = null;
            RingSpecImpl ringSpecImpl = null;
            Integer num8 = null;
            Integer num9 = null;
            AnonymousClass3IH r35 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            Boolean bool28 = null;
            AnonymousClass3IJ r53 = null;
            String str17 = null;
            AnonymousClass3IL r36 = null;
            String str18 = null;
            String str19 = null;
            Integer num10 = null;
            Integer num11 = null;
            String str20 = null;
            AnonymousClass3IN r46 = null;
            AnonymousClass3IP r37 = null;
            AnonymousClass3IR r38 = null;
            String str21 = null;
            AnonymousClass3IT r31 = null;
            Long l7 = null;
            ArrayList arrayList9 = null;
            ArrayList arrayList10 = null;
            Integer num12 = null;
            User user = null;
            ArrayList arrayList11 = null;
            ArrayList arrayList12 = null;
            while (r23.A1J() != 16L.A09) {
                String A0q = r23.A0q();
                r23.A1J();
                if ("acr_in_story".equals(A0q)) {
                    r40 = C44869CmL.parseFromJson(r23);
                } else if ("actor_id".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r23.A1P();
                    }
                } else if ("ad4ad".equals(A0q)) {
                    r47 = C44892Cmi.parseFromJson(r23);
                } else if ("ad_expiry_timestamp_in_millis".equals(A0q)) {
                    l = Long.valueOf(r23.A0y());
                } else if ("ad_pod_rules".equals(A0q)) {
                    r51 = C254953tL.parseFromJson(r23);
                } else if ("ads_iaw_rating_info".equals(A0q)) {
                    adsIAWRatingInfo = C45705D2e.parseFromJson(r23);
                } else if ("ads_rating_and_review_info".equals(A0q)) {
                    adsRatingInfo = AnonymousClass5I9.parseFromJson(r23);
                } else if ("app_id".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r23.A1P();
                    }
                } else if ("archive_id".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r23.A1P();
                    }
                } else if ("birthday_badge_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(r23.A0d());
                } else if ("bloks_netego".equals(A0q)) {
                    r48 = C44895Cml.parseFromJson(r23);
                } else if ("broadcast".equals(A0q)) {
                    r22 = C277424v9.parseFromJson(r23);
                } else if ("campaign_id".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r23.A1P();
                    }
                } else if ("can_react_with_avatar".equals(A0q)) {
                    bool2 = Boolean.valueOf(r23.A0d());
                } else if ("can_reply".equals(A0q)) {
                    bool3 = Boolean.valueOf(r23.A0d());
                } else if ("can_reshare".equals(A0q)) {
                    bool4 = Boolean.valueOf(r23.A0d());
                } else if ("carousel_opt_in_position".equals(A0q)) {
                    num = Integer.valueOf(r23.A1D());
                } else if ("carousel_rendering_type".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r23.A1P();
                    }
                    carouselRenderingType = (CarouselRenderingType) CarouselRenderingType.A01.get(str6);
                    if (carouselRenderingType == null) {
                        carouselRenderingType = CarouselRenderingType.UNRECOGNIZED;
                    }
                } else if ("carousel_transformation_cards_v2".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            if (r23.A11() == 16L.A0G) {
                                str5 = null;
                            } else {
                                str5 = r23.A1P();
                            }
                            arrayList.add(C271044ho.A00(str5));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("client_gap_rules".equals(A0q)) {
                    r55 = C250043ko.parseFromJson(r23);
                } else if ("client_prefetch_score".equals(A0q)) {
                    f = new Float(r23.A0U());
                } else if ("contains_stitched_media_blocked_by_rm".equals(A0q)) {
                    bool5 = Boolean.valueOf(r23.A0d());
                } else if ("contains_unavailable_story".equals(A0q)) {
                    bool6 = Boolean.valueOf(r23.A0d());
                } else if ("continue_shopping_in_story".equals(A0q)) {
                    r49 = C45677D1c.parseFromJson(r23);
                } else if ("cop_render_output".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            C250063kq parseFromJson = C250053kp.parseFromJson(r23);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("cover_media".equals(A0q)) {
                    r43 = C292815jZ.parseFromJson(r23);
                } else if ("created_at".equals(A0q)) {
                    num2 = Integer.valueOf(r23.A1D());
                } else if ("disabled_reply_types".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            if (!(r23.A11() == 16L.A0G || (A1P4 = r23.A1P()) == null)) {
                                arrayList3.add(A1P4);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("eligible_for_hype".equals(A0q)) {
                    bool7 = Boolean.valueOf(r23.A0d());
                } else if ("empty_story_state_data".equals(A0q)) {
                    r42 = C44881CmX.parseFromJson(r23);
                } else if ("expiring_at".equals(A0q)) {
                    l2 = Long.valueOf(r23.A0y());
                } else if ("fan_club_stories_teaser_type".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r23.A1P();
                    }
                    fanClubStoriesTeaserType = (FanClubStoriesTeaserType) FanClubStoriesTeaserType.A01.get(str4);
                    if (fanClubStoriesTeaserType == null) {
                        fanClubStoriesTeaserType = FanClubStoriesTeaserType.A06;
                    }
                } else if ("first_item_photo_url".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r23.A1P();
                    }
                } else if ("hallpass_data".equals(A0q)) {
                    hallpassDetailsDictImpl = CYT.parseFromJson(r23);
                } else if ("has_besties_media".equals(A0q)) {
                    bool8 = Boolean.valueOf(r23.A0d());
                } else if ("has_candid_media".equals(A0q)) {
                    bool9 = Boolean.valueOf(r23.A0d());
                } else if ("has_fan_club_media".equals(A0q)) {
                    bool10 = Boolean.valueOf(r23.A0d());
                } else if ("has_more_in_lately_attribution".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r23.A1P();
                    }
                } else if ("has_pride_media".equals(A0q)) {
                    bool11 = Boolean.valueOf(r23.A0d());
                } else if ("has_video".equals(A0q)) {
                    bool12 = Boolean.valueOf(r23.A0d());
                } else if ("hide_from_feed_unit".equals(A0q)) {
                    bool13 = Boolean.valueOf(r23.A0d());
                } else if ("highlight_reel_type".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r23.A1P();
                    }
                    highlightReelTypeStr = (HighlightReelTypeStr) HighlightReelTypeStr.A01.get(str3);
                    if (highlightReelTypeStr == null) {
                        highlightReelTypeStr = HighlightReelTypeStr.UNRECOGNIZED;
                    }
                } else if ("hype_commenter_list".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList4 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r23, false);
                            if (A00 != null) {
                                arrayList4.add(A00);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r23.A1P();
                    }
                } else if ("ig_ads_story_interactive_media_info_data".equals(A0q)) {
                    r27 = C274744oz.parseFromJson(r23);
                } else if ("imbe_megaphone_reel_id".equals(A0q)) {
                    l3 = Long.valueOf(r23.A0y());
                } else if ("includes_lately_only_unseen_media".equals(A0q)) {
                    bool14 = Boolean.valueOf(r23.A0d());
                } else if ("intent_aware_ads_info".equals(A0q)) {
                    intentAwareAdsInfo = C56211Hue.parseFromJson(r23);
                } else if ("intent_aware_ads_reels".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList5 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            AnonymousClass3HX parseFromJson2 = parseFromJson(r23);
                            if (parseFromJson2 != null) {
                                arrayList5.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("interaction_timestamp".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r23.A1P();
                    }
                } else if ("invalidation_rules".equals(A0q)) {
                    r52 = C250373lL.parseFromJson(r23);
                } else if ("is_added_to_main_grid".equals(A0q)) {
                    bool15 = Boolean.valueOf(r23.A0d());
                } else if ("is_ads_sensitive".equals(A0q)) {
                    bool16 = Boolean.valueOf(r23.A0d());
                } else if ("is_cacheable".equals(A0q)) {
                    bool17 = Boolean.valueOf(r23.A0d());
                } else if ("is_converted_to_clips".equals(A0q)) {
                    bool18 = Boolean.valueOf(r23.A0d());
                } else if ("is_cta_sticker_available".equals(A0q)) {
                    bool19 = Boolean.valueOf(r23.A0d());
                } else if ("is_fb_post_from_fb_story".equals(A0q)) {
                    bool20 = Boolean.valueOf(r23.A0d());
                } else if ("is_fit_green".equals(A0q)) {
                    bool21 = Boolean.valueOf(r23.A0d());
                } else if ("is_nux".equals(A0q)) {
                    bool22 = Boolean.valueOf(r23.A0d());
                } else if ("is_pinned_highlight".equals(A0q)) {
                    bool23 = Boolean.valueOf(r23.A0d());
                } else if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList6 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            1Xj A002 = 1Xj.A00(r23);
                            if (A002 != null) {
                                arrayList6.add(A002);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("latest_besties_reel_media".equals(A0q)) {
                    f2 = new Float(r23.A0U());
                } else if ("latest_reel_media".equals(A0q)) {
                    l4 = Long.valueOf(r23.A0y());
                } else if ("latest_tray_reel_media".equals(A0q)) {
                    l5 = Long.valueOf(r23.A0y());
                } else if ("media_count".equals(A0q)) {
                    num3 = Integer.valueOf(r23.A1D());
                } else if ("media_ids".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList7 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            if (!(r23.A11() == 16L.A0G || (A1P3 = r23.A1P()) == null)) {
                                arrayList7.add(A1P3);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("media_preview".equals(A0q)) {
                    r29 = C45592Cz4.parseFromJson(r23);
                } else if ("meta_gallery_stories_midcard".equals(A0q)) {
                    r30 = CaU.parseFromJson(r23);
                } else if ("muted".equals(A0q)) {
                    bool24 = Boolean.valueOf(r23.A0d());
                } else if ("netego_background_media".equals(A0q)) {
                    r39 = 1Xj.A00(r23);
                } else if ("netego_type".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r23.A1P();
                    }
                } else if ("next_button_index".equals(A0q)) {
                    num4 = Integer.valueOf(r23.A1D());
                } else if ("owner".equals(A0q)) {
                    r32 = C45616CzS.parseFromJson(r23);
                } else if ("page_id".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r23.A1P();
                    }
                } else if ("post_trigger_experience_eligibilities".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList8 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            if (r23.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r23.A1P();
                            }
                            IGPostTriggerExperience iGPostTriggerExperience = (IGPostTriggerExperience) IGPostTriggerExperience.A01.get(str2);
                            if (iGPostTriggerExperience == null) {
                                iGPostTriggerExperience = IGPostTriggerExperience.UNRECOGNIZED;
                            }
                            arrayList8.add(iGPostTriggerExperience);
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("prefetch_count".equals(A0q)) {
                    num5 = Integer.valueOf(r23.A1D());
                } else if ("priority_index".equals(A0q)) {
                    num6 = Integer.valueOf(r23.A1D());
                } else if ("promotion_id".equals(A0q)) {
                    l6 = Long.valueOf(r23.A0y());
                } else if ("ranked_position".equals(A0q)) {
                    num7 = Integer.valueOf(r23.A1D());
                } else if ("ranker_scores".equals(A0q)) {
                    r44 = AnonymousClass3HU.parseFromJson(r23);
                } else if ("reconsideration_injected_story".equals(A0q)) {
                    r50 = C45677D1c.parseFromJson(r23);
                } else if ("reel_toast".equals(A0q)) {
                    r33 = C44308Ccq.parseFromJson(r23);
                } else if ("reel_type".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r23.A1P();
                    }
                    reelType = AnonymousClass3HS.A00(str);
                } else if ("research_survey".equals(A0q)) {
                    r41 = C44871CmN.parseFromJson(r23);
                } else if ("ring_glyph".equals(A0q)) {
                    r54 = D2M.parseFromJson(r23);
                } else if ("ring_spec".equals(A0q)) {
                    ringSpecImpl = C45620CzW.parseFromJson(r23);
                } else if ("seen".equals(A0q)) {
                    num8 = Integer.valueOf(r23.A1D());
                } else if ("seen_ranked_position".equals(A0q)) {
                    num9 = Integer.valueOf(r23.A1D());
                } else if ("share_comment_to_story".equals(A0q)) {
                    r35 = C44342CdO.parseFromJson(r23);
                } else if ("should_prefetch".equals(A0q)) {
                    bool25 = Boolean.valueOf(r23.A0d());
                } else if ("should_treat_link_sticker_as_cta".equals(A0q)) {
                    bool26 = Boolean.valueOf(r23.A0d());
                } else if ("show_fan_club_stories_teaser".equals(A0q)) {
                    bool27 = Boolean.valueOf(r23.A0d());
                } else if ("show_nux_tooltip".equals(A0q)) {
                    bool28 = Boolean.valueOf(r23.A0d());
                } else if ("simple_action".equals(A0q)) {
                    r53 = D20.parseFromJson(r23);
                } else if ("smart_reel_type".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r23.A1P();
                    }
                } else if ("snapshot_data".equals(A0q)) {
                    r36 = C44362Cdi.parseFromJson(r23);
                } else if ("social_context".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r23.A1P();
                    }
                } else if ("source_token".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r23.A1P();
                    }
                } else if ("story_duration_secs".equals(A0q)) {
                    num10 = Integer.valueOf(r23.A1D());
                } else if ("story_wedge_size".equals(A0q)) {
                    num11 = Integer.valueOf(r23.A1D());
                } else if ("strong_id__".equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r23.A1P();
                    }
                } else if ("suggested_users".equals(A0q)) {
                    r46 = C276304t1.parseFromJson(r23);
                } else if ("superlative_data".equals(A0q)) {
                    r37 = C44490Cfm.parseFromJson(r23);
                } else if ("threads_in_stories_unit_acquisition".equals(A0q)) {
                    r38 = C44541Cgb.parseFromJson(r23);
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r23.A11() == 16L.A0G) {
                        str21 = null;
                    } else {
                        str21 = r23.A1P();
                    }
                } else if ("trending_prompts_in_story".equals(A0q)) {
                    r31 = C44291CcZ.parseFromJson(r23);
                } else if ("unique_integer_reel_id".equals(A0q)) {
                    l7 = Long.valueOf(r23.A0y());
                } else if ("unseen_media_ids".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList9 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            if (!(r23.A11() == 16L.A0G || (A1P2 = r23.A1P()) == null)) {
                                arrayList9.add(A1P2);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("unseen_tray_skipped_media_ids".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList10 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            if (!(r23.A11() == 16L.A0G || (A1P = r23.A1P()) == null)) {
                                arrayList10.add(A1P);
                            }
                        }
                    } else {
                        arrayList10 = null;
                    }
                } else if ("updated_timestamp".equals(A0q)) {
                    num12 = Integer.valueOf(r23.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator2 = User.CREATOR;
                    user = 1aC.A00(r23, false);
                } else if ("video_to_carousel_cut_secs".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList11 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            arrayList11.add(new Float(r23.A0U()));
                        }
                    } else {
                        arrayList11 = null;
                    }
                } else if ("video_to_carousel_cut_thumbnails".equals(A0q)) {
                    if (r23.A11() == 16L.A0C) {
                        arrayList12 = new ArrayList();
                        while (r23.A1J() != 16L.A08) {
                            ExtendedImageUrl parseFromJson3 = 16W.parseFromJson(r23);
                            if (parseFromJson3 != null) {
                                arrayList12.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList12 = null;
                    }
                }
                r23.A0z();
            }
            return new AnonymousClass3HX(r22, carouselRenderingType, fanClubStoriesTeaserType, hallpassDetailsDictImpl, highlightReelTypeStr, r27, intentAwareAdsInfo, r29, r30, r31, r32, r33, ringSpecImpl, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, reelType, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, adsIAWRatingInfo, adsRatingInfo, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, f, f2, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, l, l2, l3, l4, l5, l6, l7, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.17Z] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1491 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.17Z r9, X.AnonymousClass3HX r10) {
        /*
            r9.A0c()
            X.3HZ r3 = r10.A0I
            r4 = 1
            if (r3 == 0) goto L_0x010b
            java.lang.String r0 = "acr_in_story"
            r9.A0q(r0)
            r9.A0c()
            com.instagram.api.schemas.ACRType r0 = r3.A00
            if (r0 == 0) goto L_0x001f
            java.lang.String r1 = r0.A00
            r0 = 493(0x1ed, float:6.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x001f:
            java.lang.Long r0 = r3.A04
            if (r0 == 0) goto L_0x0030
            long r0 = r0.longValue()
            r2 = 2573(0xa0d, float:3.606E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r9.A0Q(r2, r0)
        L_0x0030:
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x0039
            java.lang.String r0 = "action_text"
            r9.A0R(r0, r1)
        L_0x0039:
            java.lang.String r1 = r3.A08
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = "audio_cluster_id"
            r9.A0R(r0, r1)
        L_0x0042:
            java.lang.String r1 = r3.A09
            if (r1 == 0) goto L_0x004f
            r0 = 1218(0x4c2, float:1.707E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x004f:
            java.lang.String r1 = r3.A0A
            if (r1 == 0) goto L_0x005c
            r0 = 1219(0x4c3, float:1.708E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x005c:
            java.lang.Long r0 = r3.A05
            if (r0 == 0) goto L_0x0069
            long r0 = r0.longValue()
            java.lang.String r2 = "id"
            r9.A0Q(r2, r0)
        L_0x0069:
            X.1Xj r1 = r3.A02
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "preview_media"
            r9.A0q(r0)
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
        L_0x0077:
            java.lang.Long r0 = r3.A06
            if (r0 == 0) goto L_0x0088
            long r0 = r0.longValue()
            r2 = 756(0x2f4, float:1.06E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r9.A0Q(r2, r0)
        L_0x0088:
            com.instagram.model.reels.ReelType r0 = r3.A03
            if (r0 == 0) goto L_0x0097
            java.lang.String r1 = r0.A00
            r0 = 757(0x2f5, float:1.061E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0097:
            java.util.List r1 = r3.A0D
            if (r1 == 0) goto L_0x00bf
            r0 = 1833(0x729, float:2.569E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00a8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x00a8
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x00a8
        L_0x00bc:
            r9.A0Y()
        L_0x00bf:
            java.lang.String r1 = r3.A0B
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x00c8:
            X.DT1 r1 = r3.A01
            if (r1 == 0) goto L_0x00ff
            r0 = 5344(0x14e0, float:7.489E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0q(r0)
            X.BI4 r2 = r1.FCy()
            r9.A0c()
            com.instagram.api.schemas.TrackMetadata r1 = r2.A01
            if (r1 == 0) goto L_0x00ec
            java.lang.String r0 = "metadata"
            r9.A0q(r0)
            com.instagram.api.schemas.TrackMetadataImpl r0 = r1.FCw()
            X.D0F.A00(r9, r0)
        L_0x00ec:
            com.instagram.api.schemas.TrackData r1 = r2.A00
            if (r1 == 0) goto L_0x00fc
            java.lang.String r0 = "track"
            r9.A0q(r0)
            com.instagram.api.schemas.TrackDataImpl r0 = r1.FCv()
            X.AnonymousClass3UP.A00(r9, r0)
        L_0x00fc:
            r9.A0Z()
        L_0x00ff:
            java.lang.String r1 = r3.A0C
            if (r1 == 0) goto L_0x0108
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x0108:
            r9.A0Z()
        L_0x010b:
            java.lang.String r1 = r10.A1O
            if (r1 == 0) goto L_0x0114
            java.lang.String r0 = "actor_id"
            r9.A0R(r0, r1)
        L_0x0114:
            X.3Hb r2 = r10.A0P
            if (r2 == 0) goto L_0x019f
            java.lang.String r0 = "ad4ad"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0129
            java.lang.String r0 = "action_text"
            r9.A0R(r0, r1)
        L_0x0129:
            X.3xe r1 = r2.A02
            if (r1 == 0) goto L_0x0135
            java.lang.String r0 = "bloks_data"
            r9.A0q(r0)
            X.C45662D0m.A00(r9, r1)
        L_0x0135:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0142
            r0 = 1231(0x4cf, float:1.725E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0142:
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x014f
            int r1 = r0.intValue()
            java.lang.String r0 = "global_position"
            r9.A0P(r0, r1)
        L_0x014f:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = "id"
            r9.A0R(r0, r1)
        L_0x0158:
            X.1sS r1 = r2.A00
            if (r1 == 0) goto L_0x0168
            java.lang.String r0 = "item_client_gap_rules"
            r9.A0q(r0)
            X.3lb r0 = r1.F8M()
            X.C250523la.A00(r9, r0)
        L_0x0168:
            X.4hR r1 = r2.A01
            if (r1 == 0) goto L_0x0174
            java.lang.String r0 = "layout"
            r9.A0q(r0)
            X.C276404tH.A02(r9, r1)
        L_0x0174:
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x017d
            java.lang.String r0 = "message"
            r9.A0R(r0, r1)
        L_0x017d:
            java.lang.String r1 = r2.A09
            if (r1 == 0) goto L_0x0186
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0186:
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x018f
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x018f:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x019c
            int r1 = r0.intValue()
            java.lang.String r0 = "view_state_item_type"
            r9.A0P(r0, r1)
        L_0x019c:
            r9.A0Z()
        L_0x019f:
            java.lang.Long r0 = r10.A1H
            if (r0 == 0) goto L_0x01ac
            long r1 = r0.longValue()
            java.lang.String r0 = "ad_expiry_timestamp_in_millis"
            r9.A0Q(r0, r1)
        L_0x01ac:
            X.3Hd r1 = r10.A0T
            if (r1 == 0) goto L_0x01b8
            java.lang.String r0 = "ad_pod_rules"
            r9.A0q(r0)
            X.C254953tL.A00(r9, r1)
        L_0x01b8:
            com.instagram.sponsored.signals.model.AdsIAWRatingInfo r1 = r10.A0Y
            if (r1 == 0) goto L_0x01c4
            java.lang.String r0 = "ads_iaw_rating_info"
            r9.A0q(r0)
            X.C45705D2e.A00(r9, r1)
        L_0x01c4:
            com.instagram.sponsored.signals.model.AdsRatingInfo r1 = r10.A0Z
            if (r1 == 0) goto L_0x01d0
            java.lang.String r0 = "ads_rating_and_review_info"
            r9.A0q(r0)
            X.AnonymousClass5I9.A00(r9, r1)
        L_0x01d0:
            java.lang.String r1 = r10.A1P
            if (r1 == 0) goto L_0x01d9
            java.lang.String r0 = "app_id"
            r9.A0R(r0, r1)
        L_0x01d9:
            java.lang.String r1 = r10.A1Q
            if (r1 == 0) goto L_0x01e2
            java.lang.String r0 = "archive_id"
            r9.A0R(r0, r1)
        L_0x01e2:
            java.lang.Boolean r0 = r10.A0b
            if (r0 == 0) goto L_0x01ef
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "birthday_badge_enabled"
            r9.A0S(r0, r1)
        L_0x01ef:
            X.3Hj r5 = r10.A0Q
            if (r5 == 0) goto L_0x0283
            java.lang.String r0 = "bloks_netego"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x0208
            r0 = 526(0x20e, float:7.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0208:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x0215
            r0 = 1251(0x4e3, float:1.753E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0215:
            com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle r0 = r5.A02
            if (r0 == 0) goto L_0x0220
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "cta_style"
            r9.A0R(r0, r1)
        L_0x0220:
            int r1 = r5.A00
            java.lang.String r0 = "duration"
            r9.A0P(r0, r1)
            boolean r1 = r5.A08
            r0 = 609(0x261, float:8.53E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0S(r0, r1)
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L_0x023b
            java.lang.String r0 = "id"
            r9.A0R(r0, r1)
        L_0x023b:
            boolean r1 = r5.A09
            r0 = 671(0x29f, float:9.4E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0S(r0, r1)
            X.JwE r3 = r5.A01
            if (r3 == 0) goto L_0x026e
            java.lang.String r2 = "payload"
            r9.A0q(r2)
            r9.A0c()
            java.lang.Object r1 = r3.A00
            X.R9S r1 = (X.R9S) r1
            if (r1 == 0) goto L_0x0264
            java.lang.String r0 = "layout"
            r9.A0q(r0)
            java.util.Map r1 = r1.A00
            X.SGJ r0 = X.R9S.A01
            r0.A01(r9, r1)
        L_0x0264:
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x026b
            r9.A0R(r2, r0)
        L_0x026b:
            r9.A0Z()
        L_0x026e:
            java.lang.String r1 = r5.A06
            if (r1 == 0) goto L_0x0277
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0277:
            java.lang.String r1 = r5.A07
            if (r1 == 0) goto L_0x0280
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x0280:
            r9.A0Z()
        L_0x0283:
            X.3Hl r1 = r10.A00
            if (r1 == 0) goto L_0x028f
            java.lang.String r0 = "broadcast"
            r9.A0q(r0)
            X.C277424v9.A00(r9, r1)
        L_0x028f:
            java.lang.String r1 = r10.A1R
            if (r1 == 0) goto L_0x0298
            java.lang.String r0 = "campaign_id"
            r9.A0R(r0, r1)
        L_0x0298:
            java.lang.Boolean r0 = r10.A0c
            if (r0 == 0) goto L_0x02a5
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "can_react_with_avatar"
            r9.A0S(r0, r1)
        L_0x02a5:
            java.lang.Boolean r0 = r10.A0d
            if (r0 == 0) goto L_0x02b2
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "can_reply"
            r9.A0S(r0, r1)
        L_0x02b2:
            java.lang.Boolean r0 = r10.A0e
            if (r0 == 0) goto L_0x02bf
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "can_reshare"
            r9.A0S(r0, r1)
        L_0x02bf:
            java.lang.Integer r0 = r10.A15
            if (r0 == 0) goto L_0x02cc
            int r1 = r0.intValue()
            java.lang.String r0 = "carousel_opt_in_position"
            r9.A0P(r0, r1)
        L_0x02cc:
            com.instagram.api.schemas.CarouselRenderingType r0 = r10.A01
            if (r0 == 0) goto L_0x02d7
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "carousel_rendering_type"
            r9.A0R(r0, r1)
        L_0x02d7:
            java.util.List r1 = r10.A1e
            if (r1 == 0) goto L_0x02fb
            java.lang.String r0 = "carousel_transformation_cards_v2"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x02e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02f8
            java.lang.Object r0 = r1.next()
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r0 = (com.instagram.model.reels.sponsored.AutoGeneratedCardType) r0
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = r0.A00
            r9.A0t(r0)
            goto L_0x02e4
        L_0x02f8:
            r9.A0Y()
        L_0x02fb:
            X.2vo r1 = r10.A0X
            if (r1 == 0) goto L_0x0307
            java.lang.String r0 = "client_gap_rules"
            r9.A0q(r0)
            X.C250043ko.A00(r9, r1)
        L_0x0307:
            java.lang.Float r0 = r10.A13
            if (r0 == 0) goto L_0x0314
            float r1 = r0.floatValue()
            java.lang.String r0 = "client_prefetch_score"
            r9.A0O(r0, r1)
        L_0x0314:
            java.lang.Boolean r0 = r10.A0f
            if (r0 == 0) goto L_0x0321
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "contains_stitched_media_blocked_by_rm"
            r9.A0S(r0, r1)
        L_0x0321:
            java.lang.Boolean r0 = r10.A0g
            if (r0 == 0) goto L_0x032e
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "contains_unavailable_story"
            r9.A0S(r0, r1)
        L_0x032e:
            X.3Ho r1 = r10.A0R
            if (r1 == 0) goto L_0x033a
            java.lang.String r0 = "continue_shopping_in_story"
            r9.A0q(r0)
            X.C45677D1c.A00(r9, r1)
        L_0x033a:
            java.util.List r1 = r10.A1f
            if (r1 == 0) goto L_0x035c
            java.lang.String r0 = "cop_render_output"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0347:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0359
            java.lang.Object r0 = r1.next()
            X.3kq r0 = (X.C250063kq) r0
            if (r0 == 0) goto L_0x0347
            X.C250053kp.A00(r9, r0)
            goto L_0x0347
        L_0x0359:
            r9.A0Y()
        L_0x035c:
            X.3Hq r2 = r10.A0L
            if (r2 == 0) goto L_0x03c3
            java.lang.String r0 = "cover_media"
            r9.A0q(r0)
            r9.A0c()
            java.util.List r1 = r2.A04
            if (r1 == 0) goto L_0x038e
            java.lang.String r0 = "crop_rect"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0375:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x038b
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0375
            float r0 = r0.floatValue()
            r9.A0f(r0)
            goto L_0x0375
        L_0x038b:
            r9.A0Y()
        L_0x038e:
            X.5ln r1 = r2.A00
            if (r1 == 0) goto L_0x039e
            r0 = 262(0x106, float:3.67E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0q(r0)
            X.C292825ja.A00(r9, r1)
        L_0x039e:
            X.5ln r1 = r2.A01
            if (r1 == 0) goto L_0x03ae
            r0 = 292(0x124, float:4.09E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0q(r0)
            X.C292825ja.A00(r9, r1)
        L_0x03ae:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x03b7
            java.lang.String r0 = "media_id"
            r9.A0R(r0, r1)
        L_0x03b7:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x03c0
            java.lang.String r0 = "upload_id"
            r9.A0R(r0, r1)
        L_0x03c0:
            r9.A0Z()
        L_0x03c3:
            java.lang.Integer r0 = r10.A16
            if (r0 == 0) goto L_0x03d0
            int r1 = r0.intValue()
            java.lang.String r0 = "created_at"
            r9.A0P(r0, r1)
        L_0x03d0:
            java.util.List r1 = r10.A1g
            if (r1 == 0) goto L_0x03f2
            java.lang.String r0 = "disabled_reply_types"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x03dd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03ef
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x03dd
            r9.A0t(r0)
            goto L_0x03dd
        L_0x03ef:
            r9.A0Y()
        L_0x03f2:
            java.lang.Boolean r0 = r10.A0h
            if (r0 == 0) goto L_0x03ff
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "eligible_for_hype"
            r9.A0S(r0, r1)
        L_0x03ff:
            X.3Hs r1 = r10.A0K
            if (r1 == 0) goto L_0x071e
            java.lang.String r0 = "empty_story_state_data"
            r9.A0q(r0)
            r9.A0c()
            java.util.List r1 = r1.A00
            if (r1 == 0) goto L_0x071b
            r0 = 1299(0x513, float:1.82E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x041c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0718
            java.lang.Object r2 = r8.next()
            X.DUq r2 = (X.C46313DUq) r2
            if (r2 == 0) goto L_0x041c
            r1 = 0
            X.1hu r0 = new X.1hu
            r0.<init>(r1)
            X.BId r2 = r2.FEl(r0)
            r9.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0440
            java.lang.String r0 = "header_text"
            r9.A0R(r0, r1)
        L_0x0440:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x044d
            r0 = 1449(0x5a9, float:2.03E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x044d:
            java.util.List r1 = r2.A05
            if (r1 == 0) goto L_0x06ef
            r0 = 1462(0x5b6, float:2.049E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x045e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x06ec
            java.lang.Object r3 = r7.next()
            X.3UJ r3 = (X.AnonymousClass3UJ) r3
            if (r3 == 0) goto L_0x045e
            r9.A0c()
            java.lang.String r1 = r3.A0B
            if (r1 == 0) goto L_0x0478
            java.lang.String r0 = "algorithm"
            r9.A0R(r0, r1)
        L_0x0478:
            java.lang.String r1 = r3.A0C
            if (r1 == 0) goto L_0x0481
            java.lang.String r0 = "background_image_url"
            r9.A0R(r0, r1)
        L_0x0481:
            java.lang.String r1 = r3.A0D
            if (r1 == 0) goto L_0x048a
            java.lang.String r0 = "caption"
            r9.A0R(r0, r1)
        L_0x048a:
            X.3Oo r1 = r3.A02
            if (r1 == 0) goto L_0x049a
            java.lang.String r0 = "custom_profile_pic_url"
            r9.A0q(r0)
            X.3On r0 = r1.F8o()
            X.C241253Om.A00(r9, r0)
        L_0x049a:
            java.lang.Boolean r0 = r3.A05
            if (r0 == 0) goto L_0x04a7
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "followed_by"
            r9.A0S(r0, r1)
        L_0x04a7:
            java.lang.Boolean r0 = r3.A06
            if (r0 == 0) goto L_0x04b4
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_stories"
            r9.A0S(r0, r1)
        L_0x04b4:
            java.lang.String r1 = r3.A0E
            if (r1 == 0) goto L_0x04bd
            java.lang.String r0 = "icon"
            r9.A0R(r0, r1)
        L_0x04bd:
            java.lang.String r1 = r3.A0F
            if (r1 == 0) goto L_0x04ca
            r0 = 3399(0xd47, float:4.763E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x04ca:
            java.lang.Boolean r0 = r3.A07
            if (r0 == 0) goto L_0x04d7
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_new_suggestion"
            r9.A0S(r0, r1)
        L_0x04d7:
            java.util.List r1 = r3.A0J
            if (r1 == 0) goto L_0x04f9
            java.lang.String r0 = "large_urls"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x04e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04f6
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x04e4
            r9.A0t(r0)
            goto L_0x04e4
        L_0x04f6:
            r9.A0Y()
        L_0x04f9:
            java.lang.Integer r0 = r3.A0A
            if (r0 == 0) goto L_0x0506
            int r1 = r0.intValue()
            java.lang.String r0 = "media_count"
            r9.A0P(r0, r1)
        L_0x0506:
            java.util.List r1 = r3.A0K
            if (r1 == 0) goto L_0x0528
            java.lang.String r0 = "media_ids"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0513:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0525
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0513
            r9.A0t(r0)
            goto L_0x0513
        L_0x0525:
            r9.A0Y()
        L_0x0528:
            java.util.List r1 = r3.A0L
            if (r1 == 0) goto L_0x054c
            java.lang.String r0 = "media_infos"
            X.16P.A03(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0535:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0549
            java.lang.Object r1 = r5.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0535
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x0535
        L_0x0549:
            r9.A0Y()
        L_0x054c:
            X.4hL r1 = r3.A01
            if (r1 == 0) goto L_0x0558
            java.lang.String r0 = "preview_media"
            r9.A0q(r0)
            X.C45604CzG.A00(r9, r1)
        L_0x0558:
            java.lang.String r1 = r3.A0G
            if (r1 == 0) goto L_0x0565
            r0 = 3226(0xc9a, float:4.52E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0R(r0, r1)
        L_0x0565:
            java.lang.Float r0 = r3.A08
            if (r0 == 0) goto L_0x0572
            float r1 = r0.floatValue()
            java.lang.String r0 = "score"
            r9.A0O(r0, r1)
        L_0x0572:
            java.lang.String r1 = r3.A0H
            if (r1 == 0) goto L_0x057b
            java.lang.String r0 = "social_context"
            r9.A0R(r0, r1)
        L_0x057b:
            java.util.List r1 = r3.A0M
            if (r1 == 0) goto L_0x059f
            java.lang.String r0 = "social_context_facepile_users"
            X.16P.A03(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0588:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x059c
            java.lang.Object r1 = r5.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0588
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
            goto L_0x0588
        L_0x059c:
            r9.A0Y()
        L_0x059f:
            java.util.List r1 = r3.A0N
            if (r1 == 0) goto L_0x05c1
            java.lang.String r0 = "thumbnail_urls"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x05ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05be
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x05ac
            r9.A0t(r0)
            goto L_0x05ac
        L_0x05be:
            r9.A0Y()
        L_0x05c1:
            X.4Zk r5 = r3.A00
            if (r5 == 0) goto L_0x0621
            java.lang.String r0 = "upsell_invite_card"
            r9.A0q(r0)
            r9.A0c()
            java.util.List r1 = r5.A05
            if (r1 == 0) goto L_0x05f1
            java.lang.String r0 = "facepile_users"
            X.16P.A03(r9, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x05da:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x05ee
            java.lang.Object r1 = r6.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x05da
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
            goto L_0x05da
        L_0x05ee:
            r9.A0Y()
        L_0x05f1:
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L_0x05fa
            java.lang.String r0 = "id"
            r9.A0R(r0, r1)
        L_0x05fa:
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0603
            java.lang.String r0 = "primary_button_text"
            r9.A0R(r0, r1)
        L_0x0603:
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x060c
            java.lang.String r0 = "subtitle"
            r9.A0R(r0, r1)
        L_0x060c:
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x0615
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0615:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x061e
            java.lang.String r0 = "type"
            r9.A0R(r0, r1)
        L_0x061e:
            r9.A0Z()
        L_0x0621:
            com.instagram.user.model.User r1 = r3.A04
            if (r1 == 0) goto L_0x062f
            java.lang.String r0 = "user"
            r9.A0q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
        L_0x062f:
            X.4hN r5 = r3.A03
            if (r5 == 0) goto L_0x06d1
            r0 = 4177(0x1051, float:5.853E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0q(r0)
            r9.A0c()
            X.3Hl r1 = r5.A00
            if (r1 == 0) goto L_0x064b
            java.lang.String r0 = "broadcast"
            r9.A0q(r0)
            X.C277424v9.A00(r9, r1)
        L_0x064b:
            X.BFr r6 = r5.A01
            if (r6 == 0) goto L_0x06c2
            r0 = 1695(0x69f, float:2.375E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0q(r0)
            r9.A0c()
            java.util.List r1 = r6.A05
            if (r1 == 0) goto L_0x067d
            java.lang.String r0 = "broadcasts"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0668:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x067a
            java.lang.Object r0 = r1.next()
            X.3Hl r0 = (X.C239653Hl) r0
            if (r0 == 0) goto L_0x0668
            X.C277424v9.A00(r9, r0)
            goto L_0x0668
        L_0x067a:
            r9.A0Y()
        L_0x067d:
            java.lang.Boolean r0 = r6.A01
            if (r0 == 0) goto L_0x068a
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "can_reply"
            r9.A0S(r0, r1)
        L_0x068a:
            java.lang.Boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0697
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "can_reshare"
            r9.A0S(r0, r1)
        L_0x0697:
            java.lang.Float r0 = r6.A03
            if (r0 == 0) goto L_0x06a8
            float r1 = r0.floatValue()
            r0 = 686(0x2ae, float:9.61E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0O(r0, r1)
        L_0x06a8:
            java.lang.String r1 = r6.A04
            if (r1 == 0) goto L_0x06b1
            java.lang.String r0 = "pk"
            r9.A0R(r0, r1)
        L_0x06b1:
            com.instagram.user.model.User r1 = r6.A00
            if (r1 == 0) goto L_0x06bf
            java.lang.String r0 = "user"
            r9.A0q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
        L_0x06bf:
            r9.A0Z()
        L_0x06c2:
            X.3HX r1 = r5.A02
            if (r1 == 0) goto L_0x06ce
            java.lang.String r0 = "reel"
            r9.A0q(r0)
            A00(r9, r1)
        L_0x06ce:
            r9.A0Z()
        L_0x06d1:
            java.lang.String r1 = r3.A0I
            if (r1 == 0) goto L_0x06da
            java.lang.String r0 = "uuid"
            r9.A0R(r0, r1)
        L_0x06da:
            java.lang.Float r0 = r3.A09
            if (r0 == 0) goto L_0x06e7
            float r1 = r0.floatValue()
            java.lang.String r0 = "value"
            r9.A0O(r0, r1)
        L_0x06e7:
            r9.A0Z()
            goto L_0x045e
        L_0x06ec:
            r9.A0Y()
        L_0x06ef:
            X.1Xj r1 = r2.A00
            if (r1 == 0) goto L_0x06fd
            java.lang.String r0 = "reel_item"
            r9.A0q(r0)
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
        L_0x06fd:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x070a
            r0 = 1857(0x741, float:2.602E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x070a:
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0713
            java.lang.String r0 = "template_id"
            r9.A0R(r0, r1)
        L_0x0713:
            r9.A0Z()
            goto L_0x041c
        L_0x0718:
            r9.A0Y()
        L_0x071b:
            r9.A0Z()
        L_0x071e:
            java.lang.Long r0 = r10.A1I
            if (r0 == 0) goto L_0x072b
            long r1 = r0.longValue()
            java.lang.String r0 = "expiring_at"
            r9.A0Q(r0, r1)
        L_0x072b:
            com.instagram.api.schemas.FanClubStoriesTeaserType r0 = r10.A02
            if (r0 == 0) goto L_0x0736
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "fan_club_stories_teaser_type"
            r9.A0R(r0, r1)
        L_0x0736:
            java.lang.String r1 = r10.A1S
            if (r1 == 0) goto L_0x073f
            java.lang.String r0 = "first_item_photo_url"
            r9.A0R(r0, r1)
        L_0x073f:
            com.instagram.api.schemas.HallpassDetailsDictImpl r2 = r10.A03
            if (r2 == 0) goto L_0x0791
            java.lang.String r0 = "hallpass_data"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0754
            java.lang.String r0 = "color"
            r9.A0R(r0, r1)
        L_0x0754:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x075d
            java.lang.String r0 = "hallpass_id"
            r9.A0R(r0, r1)
        L_0x075d:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0766
            java.lang.String r0 = "name"
            r9.A0R(r0, r1)
        L_0x0766:
            java.util.List r1 = r2.A03
            if (r1 == 0) goto L_0x078e
            r0 = 5271(0x1497, float:7.386E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0777:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x078b
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0777
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
            goto L_0x0777
        L_0x078b:
            r9.A0Y()
        L_0x078e:
            r9.A0Z()
        L_0x0791:
            java.lang.Boolean r0 = r10.A0i
            if (r0 == 0) goto L_0x079e
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_besties_media"
            r9.A0S(r0, r1)
        L_0x079e:
            java.lang.Boolean r0 = r10.A0j
            if (r0 == 0) goto L_0x07ab
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_candid_media"
            r9.A0S(r0, r1)
        L_0x07ab:
            java.lang.Boolean r0 = r10.A0k
            if (r0 == 0) goto L_0x07b8
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_fan_club_media"
            r9.A0S(r0, r1)
        L_0x07b8:
            java.lang.String r1 = r10.A1T
            if (r1 == 0) goto L_0x07c1
            java.lang.String r0 = "has_more_in_lately_attribution"
            r9.A0R(r0, r1)
        L_0x07c1:
            java.lang.Boolean r0 = r10.A0l
            if (r0 == 0) goto L_0x07ce
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_pride_media"
            r9.A0S(r0, r1)
        L_0x07ce:
            java.lang.Boolean r0 = r10.A0m
            if (r0 == 0) goto L_0x07db
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_video"
            r9.A0S(r0, r1)
        L_0x07db:
            java.lang.Boolean r0 = r10.A0n
            if (r0 == 0) goto L_0x07e8
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "hide_from_feed_unit"
            r9.A0S(r0, r1)
        L_0x07e8:
            com.instagram.api.schemas.HighlightReelTypeStr r0 = r10.A04
            if (r0 == 0) goto L_0x07f3
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "highlight_reel_type"
            r9.A0R(r0, r1)
        L_0x07f3:
            java.util.List r1 = r10.A1h
            if (r1 == 0) goto L_0x0817
            java.lang.String r0 = "hype_commenter_list"
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0800:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0814
            java.lang.Object r1 = r2.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x0800
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
            goto L_0x0800
        L_0x0814:
            r9.A0Y()
        L_0x0817:
            java.lang.String r1 = r10.A1U
            if (r1 == 0) goto L_0x0820
            java.lang.String r0 = "id"
            r9.A0R(r0, r1)
        L_0x0820:
            X.3Hx r2 = r10.A05
            if (r2 == 0) goto L_0x0892
            java.lang.String r0 = "ig_ads_story_interactive_media_info_data"
            r9.A0q(r0)
            r9.A0c()
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x0839
            int r1 = r0.intValue()
            java.lang.String r0 = "delay_time_in_ms"
            r9.A0P(r0, r1)
        L_0x0839:
            java.util.List r1 = r2.A05
            if (r1 == 0) goto L_0x085d
            java.lang.String r0 = "gesture_types"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0846:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x085a
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType r0 = (com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType) r0
            if (r0 == 0) goto L_0x0846
            java.lang.String r0 = r0.A00
            r9.A0t(r0)
            goto L_0x0846
        L_0x085a:
            r9.A0Y()
        L_0x085d:
            com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum r0 = r2.A00
            if (r0 == 0) goto L_0x0868
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "interactive_media_design_option"
            r9.A0R(r0, r1)
        L_0x0868:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0875
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_interactive_media_available"
            r9.A0S(r0, r1)
        L_0x0875:
            java.lang.Float r0 = r2.A02
            if (r0 == 0) goto L_0x0882
            float r1 = r0.floatValue()
            java.lang.String r0 = "safezone_left_and_right"
            r9.A0O(r0, r1)
        L_0x0882:
            java.lang.Float r0 = r2.A03
            if (r0 == 0) goto L_0x088f
            float r1 = r0.floatValue()
            java.lang.String r0 = "safezone_top_and_bottom"
            r9.A0O(r0, r1)
        L_0x088f:
            r9.A0Z()
        L_0x0892:
            java.lang.Long r0 = r10.A1J
            if (r0 == 0) goto L_0x089f
            long r1 = r0.longValue()
            java.lang.String r0 = "imbe_megaphone_reel_id"
            r9.A0Q(r0, r1)
        L_0x089f:
            java.lang.Boolean r0 = r10.A0o
            if (r0 == 0) goto L_0x08ac
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "includes_lately_only_unseen_media"
            r9.A0S(r0, r1)
        L_0x08ac:
            com.instagram.api.schemas.IntentAwareAdsInfo r1 = r10.A06
            if (r1 == 0) goto L_0x08b8
            java.lang.String r0 = "intent_aware_ads_info"
            r9.A0q(r0)
            X.C56211Hue.A00(r9, r1)
        L_0x08b8:
            java.util.List r1 = r10.A1i
            if (r1 == 0) goto L_0x08da
            java.lang.String r0 = "intent_aware_ads_reels"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x08c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08d7
            java.lang.Object r0 = r1.next()
            X.3HX r0 = (X.AnonymousClass3HX) r0
            if (r0 == 0) goto L_0x08c5
            A00(r9, r0)
            goto L_0x08c5
        L_0x08d7:
            r9.A0Y()
        L_0x08da:
            java.lang.String r1 = r10.A1V
            if (r1 == 0) goto L_0x08e3
            java.lang.String r0 = "interaction_timestamp"
            r9.A0R(r0, r1)
        L_0x08e3:
            X.3I1 r1 = r10.A0U
            if (r1 == 0) goto L_0x08ef
            java.lang.String r0 = "invalidation_rules"
            r9.A0q(r0)
            X.C250373lL.A00(r9, r1)
        L_0x08ef:
            java.lang.Boolean r0 = r10.A0p
            if (r0 == 0) goto L_0x08fc
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_added_to_main_grid"
            r9.A0S(r0, r1)
        L_0x08fc:
            java.lang.Boolean r0 = r10.A0q
            if (r0 == 0) goto L_0x0909
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_ads_sensitive"
            r9.A0S(r0, r1)
        L_0x0909:
            java.lang.Boolean r0 = r10.A0r
            if (r0 == 0) goto L_0x0916
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_cacheable"
            r9.A0S(r0, r1)
        L_0x0916:
            java.lang.Boolean r0 = r10.A0s
            if (r0 == 0) goto L_0x0923
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_converted_to_clips"
            r9.A0S(r0, r1)
        L_0x0923:
            java.lang.Boolean r0 = r10.A0t
            if (r0 == 0) goto L_0x0930
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_cta_sticker_available"
            r9.A0S(r0, r1)
        L_0x0930:
            java.lang.Boolean r0 = r10.A0u
            if (r0 == 0) goto L_0x093d
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_fb_post_from_fb_story"
            r9.A0S(r0, r1)
        L_0x093d:
            java.lang.Boolean r0 = r10.A0v
            if (r0 == 0) goto L_0x094a
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_fit_green"
            r9.A0S(r0, r1)
        L_0x094a:
            java.lang.Boolean r0 = r10.A0w
            if (r0 == 0) goto L_0x0957
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_nux"
            r9.A0S(r0, r1)
        L_0x0957:
            java.lang.Boolean r0 = r10.A0x
            if (r0 == 0) goto L_0x0964
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_pinned_highlight"
            r9.A0S(r0, r1)
        L_0x0964:
            java.util.List r1 = r10.A1j
            if (r1 == 0) goto L_0x0988
            java.lang.String r0 = "items"
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0971:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0985
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0971
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x0971
        L_0x0985:
            r9.A0Y()
        L_0x0988:
            java.lang.Float r0 = r10.A14
            if (r0 == 0) goto L_0x0995
            float r1 = r0.floatValue()
            java.lang.String r0 = "latest_besties_reel_media"
            r9.A0O(r0, r1)
        L_0x0995:
            java.lang.Long r0 = r10.A1K
            if (r0 == 0) goto L_0x09a2
            long r1 = r0.longValue()
            java.lang.String r0 = "latest_reel_media"
            r9.A0Q(r0, r1)
        L_0x09a2:
            java.lang.Long r0 = r10.A1L
            if (r0 == 0) goto L_0x09af
            long r1 = r0.longValue()
            java.lang.String r0 = "latest_tray_reel_media"
            r9.A0Q(r0, r1)
        L_0x09af:
            java.lang.Integer r0 = r10.A17
            if (r0 == 0) goto L_0x09bc
            int r1 = r0.intValue()
            java.lang.String r0 = "media_count"
            r9.A0P(r0, r1)
        L_0x09bc:
            java.util.List r1 = r10.A1k
            if (r1 == 0) goto L_0x09de
            java.lang.String r0 = "media_ids"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x09c9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x09db
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x09c9
            r9.A0t(r0)
            goto L_0x09c9
        L_0x09db:
            r9.A0Y()
        L_0x09de:
            X.3I3 r1 = r10.A07
            if (r1 == 0) goto L_0x09ea
            java.lang.String r0 = "media_preview"
            r9.A0q(r0)
            X.C45592Cz4.A00(r9, r1)
        L_0x09ea:
            X.3I5 r2 = r10.A08
            if (r2 == 0) goto L_0x0ac3
            java.lang.String r0 = "meta_gallery_stories_midcard"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0a03
            r0 = 2713(0xa99, float:3.802E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0a03:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0a0c
            java.lang.String r0 = "cta_text"
            r9.A0R(r0, r1)
        L_0x0a0c:
            java.lang.Integer r0 = r2.A01
            if (r0 == 0) goto L_0x0a19
            int r1 = r0.intValue()
            java.lang.String r0 = "duration_ms"
            r9.A0P(r0, r1)
        L_0x0a19:
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0a22
            java.lang.String r0 = "header_text"
            r9.A0R(r0, r1)
        L_0x0a22:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0a2b
            java.lang.String r0 = "id"
            r9.A0R(r0, r1)
        L_0x0a2b:
            java.util.List r1 = r2.A09
            if (r1 == 0) goto L_0x0a6c
            r0 = 1578(0x62a, float:2.211E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0a3c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0a69
            java.lang.Object r0 = r5.next()
            X.DSh r0 = (X.C46252DSh) r0
            if (r0 == 0) goto L_0x0a3c
            X.BFW r3 = r0.F6C()
            r9.A0c()
            com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType r0 = r3.A00
            if (r0 == 0) goto L_0x0a5c
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "media_type"
            r9.A0R(r0, r1)
        L_0x0a5c:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0a65
            java.lang.String r0 = "media_url"
            r9.A0R(r0, r1)
        L_0x0a65:
            r9.A0Z()
            goto L_0x0a3c
        L_0x0a69:
            r9.A0Y()
        L_0x0a6c:
            java.util.List r1 = r2.A0A
            if (r1 == 0) goto L_0x0a92
            r0 = 1587(0x633, float:2.224E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0a7d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a8f
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0a7d
            r9.A0t(r0)
            goto L_0x0a7d
        L_0x0a8f:
            r9.A0Y()
        L_0x0a92:
            com.instagram.api.schemas.MetaGalleryAlbumType r0 = r2.A00
            if (r0 == 0) goto L_0x0aa1
            java.lang.String r1 = r0.A00
            r0 = 1597(0x63d, float:2.238E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0aa1:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0aaa
            java.lang.String r0 = "title_text"
            r9.A0R(r0, r1)
        L_0x0aaa:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0ab7
            r0 = 1896(0x768, float:2.657E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0ab7:
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x0ac0
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x0ac0:
            r9.A0Z()
        L_0x0ac3:
            java.lang.Boolean r0 = r10.A0y
            if (r0 == 0) goto L_0x0ad0
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "muted"
            r9.A0S(r0, r1)
        L_0x0ad0:
            X.1Xj r1 = r10.A0H
            if (r1 == 0) goto L_0x0ade
            java.lang.String r0 = "netego_background_media"
            r9.A0q(r0)
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
        L_0x0ade:
            java.lang.String r1 = r10.A1W
            if (r1 == 0) goto L_0x0ae7
            java.lang.String r0 = "netego_type"
            r9.A0R(r0, r1)
        L_0x0ae7:
            java.lang.Integer r0 = r10.A18
            if (r0 == 0) goto L_0x0af4
            int r1 = r0.intValue()
            java.lang.String r0 = "next_button_index"
            r9.A0P(r0, r1)
        L_0x0af4:
            X.3I7 r1 = r10.A0A
            if (r1 == 0) goto L_0x0b00
            java.lang.String r0 = "owner"
            r9.A0q(r0)
            X.C45616CzS.A00(r9, r1)
        L_0x0b00:
            java.lang.String r1 = r10.A1X
            if (r1 == 0) goto L_0x0b09
            java.lang.String r0 = "page_id"
            r9.A0R(r0, r1)
        L_0x0b09:
            java.util.List r1 = r10.A1l
            if (r1 == 0) goto L_0x0b2d
            java.lang.String r0 = "post_trigger_experience_eligibilities"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0b16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b2a
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.IGPostTriggerExperience r0 = (com.instagram.api.schemas.IGPostTriggerExperience) r0
            if (r0 == 0) goto L_0x0b16
            java.lang.String r0 = r0.A00
            r9.A0t(r0)
            goto L_0x0b16
        L_0x0b2a:
            r9.A0Y()
        L_0x0b2d:
            java.lang.Integer r0 = r10.A19
            if (r0 == 0) goto L_0x0b3a
            int r1 = r0.intValue()
            java.lang.String r0 = "prefetch_count"
            r9.A0P(r0, r1)
        L_0x0b3a:
            java.lang.Integer r0 = r10.A1A
            if (r0 == 0) goto L_0x0b47
            int r1 = r0.intValue()
            java.lang.String r0 = "priority_index"
            r9.A0P(r0, r1)
        L_0x0b47:
            java.lang.Long r0 = r10.A1M
            if (r0 == 0) goto L_0x0b54
            long r1 = r0.longValue()
            java.lang.String r0 = "promotion_id"
            r9.A0Q(r0, r1)
        L_0x0b54:
            java.lang.Integer r0 = r10.A1B
            if (r0 == 0) goto L_0x0b61
            int r1 = r0.intValue()
            java.lang.String r0 = "ranked_position"
            r9.A0P(r0, r1)
        L_0x0b61:
            X.3HV r3 = r10.A0M
            if (r3 == 0) goto L_0x0d26
            java.lang.String r0 = "ranker_scores"
            r9.A0q(r0)
            r9.A0c()
            java.lang.Double r0 = r3.A00
            if (r0 == 0) goto L_0x0b7a
            double r0 = r0.doubleValue()
            java.lang.String r2 = "adjust_ide_holdout_scores"
            r9.A0N(r2, r0)
        L_0x0b7a:
            java.lang.Double r0 = r3.A01
            if (r0 == 0) goto L_0x0b87
            double r0 = r0.doubleValue()
            java.lang.String r2 = "adjust_integrity_scores"
            r9.A0N(r2, r0)
        L_0x0b87:
            java.lang.Double r0 = r3.A02
            if (r0 == 0) goto L_0x0b94
            double r0 = r0.doubleValue()
            java.lang.String r2 = "bff_scores"
            r9.A0N(r2, r0)
        L_0x0b94:
            java.lang.Double r0 = r3.A03
            if (r0 == 0) goto L_0x0ba1
            double r0 = r0.doubleValue()
            java.lang.String r2 = "crown_vm_scores_final"
            r9.A0N(r2, r0)
        L_0x0ba1:
            java.lang.Double r0 = r3.A04
            if (r0 == 0) goto L_0x0bae
            double r0 = r0.doubleValue()
            java.lang.String r2 = "emeimps"
            r9.A0N(r2, r0)
        L_0x0bae:
            java.lang.Double r0 = r3.A05
            if (r0 == 0) goto L_0x0bbb
            double r0 = r0.doubleValue()
            java.lang.String r2 = "ereply"
            r9.A0N(r2, r0)
        L_0x0bbb:
            java.lang.Double r0 = r3.A06
            if (r0 == 0) goto L_0x0bc8
            double r0 = r0.doubleValue()
            java.lang.String r2 = "fp"
            r9.A0N(r2, r0)
        L_0x0bc8:
            java.lang.Double r0 = r3.A07
            if (r0 == 0) goto L_0x0bd5
            double r0 = r0.doubleValue()
            java.lang.String r2 = "general_vm_scores_final"
            r9.A0N(r2, r0)
        L_0x0bd5:
            java.lang.Double r0 = r3.A08
            if (r0 == 0) goto L_0x0be2
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_is_reciprocal_convos_send_mtml"
            r9.A0N(r2, r0)
        L_0x0be2:
            java.lang.Double r0 = r3.A09
            if (r0 == 0) goto L_0x0bef
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_pviewer_or_author_contact"
            r9.A0N(r2, r0)
        L_0x0bef:
            java.lang.Double r0 = r3.A0A
            if (r0 == 0) goto L_0x0bfc
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_emeimps_rate_mtml_gpu"
            r9.A0N(r2, r0)
        L_0x0bfc:
            java.lang.Double r0 = r3.A0B
            if (r0 == 0) goto L_0x0c09
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_evpvd_mtml_gpu"
            r9.A0N(r2, r0)
        L_0x0c09:
            java.lang.Double r0 = r3.A0C
            if (r0 == 0) goto L_0x0c16
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_plike_mtml_gpu"
            r9.A0N(r2, r0)
        L_0x0c16:
            java.lang.Double r0 = r3.A0D
            if (r0 == 0) goto L_0x0c23
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_pnext_pos_gpu"
            r9.A0N(r2, r0)
        L_0x0c23:
            java.lang.Double r0 = r3.A0E
            if (r0 == 0) goto L_0x0c30
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_preply_bar_tap_time_spent_3_5_sec_gpu"
            r9.A0N(r2, r0)
        L_0x0c30:
            java.lang.Double r0 = r3.A0F
            if (r0 == 0) goto L_0x0c3d
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_preply_bar_tap_time_spent_rate_3_5_sec_gpu"
            r9.A0N(r2, r0)
        L_0x0c3d:
            java.lang.Double r0 = r3.A0G
            if (r0 == 0) goto L_0x0c4a
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_preshare_button_tap_rate_mtml_gpu"
            r9.A0N(r2, r0)
        L_0x0c4a:
            java.lang.Double r0 = r3.A0H
            if (r0 == 0) goto L_0x0c57
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_pskip_photos_075_videos_085"
            r9.A0N(r2, r0)
        L_0x0c57:
            java.lang.Double r0 = r3.A0I
            if (r0 == 0) goto L_0x0c64
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_ptap_new_mtml_gpu"
            r9.A0N(r2, r0)
        L_0x0c64:
            java.lang.Double r0 = r3.A0J
            if (r0 == 0) goto L_0x0c71
            double r0 = r0.doubleValue()
            java.lang.String r2 = "models_stories_vm_interaction"
            r9.A0N(r2, r0)
        L_0x0c71:
            java.lang.Double r0 = r3.A0K
            if (r0 == 0) goto L_0x0c7e
            double r0 = r0.doubleValue()
            java.lang.String r2 = "pcontact"
            r9.A0N(r2, r0)
        L_0x0c7e:
            java.lang.Double r0 = r3.A0L
            if (r0 == 0) goto L_0x0c8b
            double r0 = r0.doubleValue()
            java.lang.String r2 = "pevpvd"
            r9.A0N(r2, r0)
        L_0x0c8b:
            java.lang.Double r0 = r3.A0M
            if (r0 == 0) goto L_0x0c98
            double r0 = r0.doubleValue()
            java.lang.String r2 = "plike"
            r9.A0N(r2, r0)
        L_0x0c98:
            java.lang.Double r0 = r3.A0N
            if (r0 == 0) goto L_0x0ca5
            double r0 = r0.doubleValue()
            java.lang.String r2 = "pnext"
            r9.A0N(r2, r0)
        L_0x0ca5:
            java.lang.Double r0 = r3.A0O
            if (r0 == 0) goto L_0x0cb2
            double r0 = r0.doubleValue()
            java.lang.String r2 = "preciprocal"
            r9.A0N(r2, r0)
        L_0x0cb2:
            java.lang.Double r0 = r3.A0P
            if (r0 == 0) goto L_0x0cbf
            double r0 = r0.doubleValue()
            java.lang.String r2 = "preply"
            r9.A0N(r2, r0)
        L_0x0cbf:
            java.lang.Double r0 = r3.A0Q
            if (r0 == 0) goto L_0x0ccc
            double r0 = r0.doubleValue()
            java.lang.String r2 = "preshare"
            r9.A0N(r2, r0)
        L_0x0ccc:
            java.lang.Double r0 = r3.A0R
            if (r0 == 0) goto L_0x0cd9
            double r0 = r0.doubleValue()
            java.lang.String r2 = "pscreenshot"
            r9.A0N(r2, r0)
        L_0x0cd9:
            java.lang.Double r0 = r3.A0S
            if (r0 == 0) goto L_0x0ce6
            double r0 = r0.doubleValue()
            java.lang.String r2 = "pskip"
            r9.A0N(r2, r0)
        L_0x0ce6:
            java.lang.Double r0 = r3.A0T
            if (r0 == 0) goto L_0x0cf3
            double r0 = r0.doubleValue()
            java.lang.String r2 = "ptap"
            r9.A0N(r2, r0)
        L_0x0cf3:
            java.lang.String r1 = r3.A0X
            if (r1 == 0) goto L_0x0cfc
            java.lang.String r0 = "ranking_info_token"
            r9.A0R(r0, r1)
        L_0x0cfc:
            java.lang.Double r0 = r3.A0U
            if (r0 == 0) goto L_0x0d09
            double r1 = r0.doubleValue()
            java.lang.String r0 = "time_spent"
            r9.A0N(r0, r1)
        L_0x0d09:
            java.lang.Double r0 = r3.A0V
            if (r0 == 0) goto L_0x0d16
            double r1 = r0.doubleValue()
            java.lang.String r0 = "vm"
            r9.A0N(r0, r1)
        L_0x0d16:
            java.lang.Double r0 = r3.A0W
            if (r0 == 0) goto L_0x0d23
            double r1 = r0.doubleValue()
            java.lang.String r0 = "vm_interaction"
            r9.A0N(r0, r1)
        L_0x0d23:
            r9.A0Z()
        L_0x0d26:
            X.3Ho r1 = r10.A0S
            if (r1 == 0) goto L_0x0d32
            java.lang.String r0 = "reconsideration_injected_story"
            r9.A0q(r0)
            X.C45677D1c.A00(r9, r1)
        L_0x0d32:
            X.3I9 r2 = r10.A0B
            if (r2 == 0) goto L_0x0d56
            java.lang.String r0 = "reel_toast"
            r9.A0q(r0)
            r9.A0c()
            com.instagram.common.typedurl.ImageUrl r1 = r2.A00
            if (r1 == 0) goto L_0x0d4a
            java.lang.String r0 = "image_url"
            r9.A0q(r0)
            X.16h.A01(r9, r1)
        L_0x0d4a:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0d53
            java.lang.String r0 = "text"
            r9.A0R(r0, r1)
        L_0x0d53:
            r9.A0Z()
        L_0x0d56:
            com.instagram.model.reels.ReelType r0 = r10.A0N
            if (r0 == 0) goto L_0x0d61
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "reel_type"
            r9.A0R(r0, r1)
        L_0x0d61:
            X.3IB r2 = r10.A0J
            if (r2 == 0) goto L_0x0ec1
            java.lang.String r0 = "research_survey"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x0d76
            java.lang.String r0 = "ad_id"
            r9.A0R(r0, r1)
        L_0x0d76:
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0d83
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_demo"
            r9.A0S(r0, r1)
        L_0x0d83:
            X.BIb r5 = r2.A00
            if (r5 == 0) goto L_0x0dcd
            r0 = 347(0x15b, float:4.86E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0d9c
            java.lang.String r0 = "body"
            r9.A0R(r0, r1)
        L_0x0d9c:
            X.BHi r3 = r5.A00
            if (r3 == 0) goto L_0x0dc1
            r0 = 265(0x109, float:3.71E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x0db5
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0db5:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0dbe
            java.lang.String r0 = "url"
            r9.A0R(r0, r1)
        L_0x0dbe:
            r9.A0Z()
        L_0x0dc1:
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x0dca
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0dca:
            r9.A0Z()
        L_0x0dcd:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0dda
            r0 = 5127(0x1407, float:7.184E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0dda:
            java.util.List r1 = r2.A09
            if (r1 == 0) goto L_0x0e85
            java.lang.String r0 = "questions"
            X.16P.A03(r9, r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x0de7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0e82
            java.lang.Object r3 = r7.next()
            X.BIc r3 = (X.C42124BIc) r3
            if (r3 == 0) goto L_0x0de7
            r9.A0c()
            java.util.List r1 = r3.A04
            if (r1 == 0) goto L_0x0e51
            java.lang.String r0 = "answers"
            X.16P.A03(r9, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x0e05:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0e4e
            java.lang.Object r5 = r6.next()
            X.BHg r5 = (X.C42103BHg) r5
            if (r5 == 0) goto L_0x0e05
            r9.A0c()
            java.lang.Boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0e27
            boolean r1 = r0.booleanValue()
            r0 = 4923(0x133b, float:6.899E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0S(r0, r1)
        L_0x0e27:
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L_0x0e38
            int r1 = r0.intValue()
            r0 = 3680(0xe60, float:5.157E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0P(r0, r1)
        L_0x0e38:
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x0e41
            java.lang.String r0 = "text"
            r9.A0R(r0, r1)
        L_0x0e41:
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x0e4a
            java.lang.String r0 = "value"
            r9.A0R(r0, r1)
        L_0x0e4a:
            r9.A0Z()
            goto L_0x0e05
        L_0x0e4e:
            r9.A0Y()
        L_0x0e51:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0e5a
            java.lang.String r0 = "qid"
            r9.A0R(r0, r1)
        L_0x0e5a:
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x0e63
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0e63:
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0e74
            int r1 = r0.intValue()
            r0 = 807(0x327, float:1.131E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0P(r0, r1)
        L_0x0e74:
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x0e7d
            java.lang.String r0 = "type"
            r9.A0R(r0, r1)
        L_0x0e7d:
            r9.A0Z()
            goto L_0x0de7
        L_0x0e82:
            r9.A0Y()
        L_0x0e85:
            java.lang.Boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0e92
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "show_primer"
            r9.A0S(r0, r1)
        L_0x0e92:
            java.lang.Boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0ea3
            boolean r1 = r0.booleanValue()
            r0 = 5252(0x1484, float:7.36E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0S(r0, r1)
        L_0x0ea3:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0eac
            java.lang.String r0 = "survey_id"
            r9.A0R(r0, r1)
        L_0x0eac:
            java.lang.String r1 = r2.A07
            if (r1 == 0) goto L_0x0eb5
            java.lang.String r0 = "survey_type"
            r9.A0R(r0, r1)
        L_0x0eb5:
            java.lang.String r1 = r2.A08
            if (r1 == 0) goto L_0x0ebe
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x0ebe:
            r9.A0Z()
        L_0x0ec1:
            X.3ID r1 = r10.A0W
            if (r1 == 0) goto L_0x0ecd
            java.lang.String r0 = "ring_glyph"
            r9.A0q(r0)
            X.D2M.A00(r9, r1, r4)
        L_0x0ecd:
            com.instagram.api.schemas.RingSpecImpl r1 = r10.A0C
            if (r1 == 0) goto L_0x0ed9
            java.lang.String r0 = "ring_spec"
            r9.A0q(r0)
            X.C45620CzW.A00(r9, r1)
        L_0x0ed9:
            java.lang.Integer r0 = r10.A1C
            if (r0 == 0) goto L_0x0ee6
            int r1 = r0.intValue()
            java.lang.String r0 = "seen"
            r9.A0P(r0, r1)
        L_0x0ee6:
            java.lang.Integer r0 = r10.A1D
            if (r0 == 0) goto L_0x0ef3
            int r1 = r0.intValue()
            java.lang.String r0 = "seen_ranked_position"
            r9.A0P(r0, r1)
        L_0x0ef3:
            X.3IH r3 = r10.A0D
            if (r3 == 0) goto L_0x0f92
            java.lang.String r0 = "share_comment_to_story"
            r9.A0q(r0)
            r9.A0c()
            X.BEO r2 = r3.A00
            if (r2 == 0) goto L_0x0f47
            r0 = 1208(0x4b8, float:1.693E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0q(r0)
            r9.A0c()
            com.instagram.user.model.User r1 = r2.A00
            if (r1 == 0) goto L_0x0f21
            r0 = 1657(0x679, float:2.322E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
        L_0x0f21:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x0f2e
            r0 = 1658(0x67a, float:2.323E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0f2e:
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x0f3b
            r0 = 1659(0x67b, float:2.325E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x0f3b:
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0f44
            java.lang.String r0 = "original_media_id"
            r9.A0R(r0, r1)
        L_0x0f44:
            r9.A0Z()
        L_0x0f47:
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x0f50
            java.lang.String r0 = "cta_text"
            r9.A0R(r0, r1)
        L_0x0f50:
            java.lang.Long r0 = r3.A02
            if (r0 == 0) goto L_0x0f5d
            long r1 = r0.longValue()
            java.lang.String r0 = "id"
            r9.A0Q(r0, r1)
        L_0x0f5d:
            X.1Xj r1 = r3.A01
            if (r1 == 0) goto L_0x0f6b
            java.lang.String r0 = "media"
            r9.A0q(r0)
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
        L_0x0f6b:
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x0f74
            java.lang.String r0 = "netego_title"
            r9.A0R(r0, r1)
        L_0x0f74:
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x0f7d
            java.lang.String r0 = "subtitle"
            r9.A0R(r0, r1)
        L_0x0f7d:
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x0f86
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x0f86:
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x0f8f
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x0f8f:
            r9.A0Z()
        L_0x0f92:
            java.lang.Boolean r0 = r10.A0z
            if (r0 == 0) goto L_0x0f9f
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_prefetch"
            r9.A0S(r0, r1)
        L_0x0f9f:
            java.lang.Boolean r0 = r10.A10
            if (r0 == 0) goto L_0x0fac
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "should_treat_link_sticker_as_cta"
            r9.A0S(r0, r1)
        L_0x0fac:
            java.lang.Boolean r0 = r10.A11
            if (r0 == 0) goto L_0x0fb9
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "show_fan_club_stories_teaser"
            r9.A0S(r0, r1)
        L_0x0fb9:
            java.lang.Boolean r0 = r10.A12
            if (r0 == 0) goto L_0x0fc6
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "show_nux_tooltip"
            r9.A0S(r0, r1)
        L_0x0fc6:
            X.3IJ r1 = r10.A0V
            if (r1 == 0) goto L_0x0fd2
            java.lang.String r0 = "simple_action"
            r9.A0q(r0)
            X.D20.A00(r9, r1)
        L_0x0fd2:
            java.lang.String r1 = r10.A1Y
            if (r1 == 0) goto L_0x0fdb
            java.lang.String r0 = "smart_reel_type"
            r9.A0R(r0, r1)
        L_0x0fdb:
            X.3IL r3 = r10.A0E
            if (r3 == 0) goto L_0x108a
            java.lang.String r0 = "snapshot_data"
            r9.A0q(r0)
            r9.A0c()
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x0ff8
            int r1 = r0.intValue()
            r0 = 1646(0x66e, float:2.307E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0P(r0, r1)
        L_0x0ff8:
            java.lang.Long r0 = r3.A04
            if (r0 == 0) goto L_0x1009
            long r0 = r0.longValue()
            r2 = 1825(0x721, float:2.557E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r9.A0Q(r2, r0)
        L_0x1009:
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x1016
            r0 = 1826(0x722, float:2.559E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x1016:
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x1023
            r0 = 1827(0x723, float:2.56E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x1023:
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x1030
            r0 = 1828(0x724, float:2.562E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x1030:
            java.util.List r1 = r3.A08
            if (r1 == 0) goto L_0x1054
            java.lang.String r0 = "stories"
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x103d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1051
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x103d
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x103d
        L_0x1051:
            r9.A0Y()
        L_0x1054:
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x1065
            int r1 = r0.intValue()
            r0 = 1897(0x769, float:2.658E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0P(r0, r1)
        L_0x1065:
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x1076
            int r1 = r0.intValue()
            r0 = 414(0x19e, float:5.8E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0P(r0, r1)
        L_0x1076:
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x1087
            int r1 = r0.intValue()
            r0 = 1898(0x76a, float:2.66E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0P(r0, r1)
        L_0x1087:
            r9.A0Z()
        L_0x108a:
            java.lang.String r1 = r10.A1Z
            if (r1 == 0) goto L_0x1093
            java.lang.String r0 = "social_context"
            r9.A0R(r0, r1)
        L_0x1093:
            java.lang.String r1 = r10.A1a
            if (r1 == 0) goto L_0x109c
            java.lang.String r0 = "source_token"
            r9.A0R(r0, r1)
        L_0x109c:
            java.lang.Integer r0 = r10.A1E
            if (r0 == 0) goto L_0x10a9
            int r1 = r0.intValue()
            java.lang.String r0 = "story_duration_secs"
            r9.A0P(r0, r1)
        L_0x10a9:
            java.lang.Integer r0 = r10.A1F
            if (r0 == 0) goto L_0x10b6
            int r1 = r0.intValue()
            java.lang.String r0 = "story_wedge_size"
            r9.A0P(r0, r1)
        L_0x10b6:
            java.lang.String r1 = r10.A1b
            if (r1 == 0) goto L_0x10bf
            java.lang.String r0 = "strong_id__"
            r9.A0R(r0, r1)
        L_0x10bf:
            X.3IN r2 = r10.A0O
            if (r2 == 0) goto L_0x12cc
            java.lang.String r0 = "suggested_users"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x10d4
            java.lang.String r0 = "action_text"
            r9.A0R(r0, r1)
        L_0x10d4:
            int r1 = r2.A00
            java.lang.String r0 = "duration"
            r9.A0P(r0, r1)
            boolean r1 = r2.A08
            java.lang.String r0 = "dynamic_width_enabled"
            r9.A0S(r0, r1)
            boolean r1 = r2.A09
            java.lang.String r0 = "gradient_animation_enabled"
            r9.A0S(r0, r1)
            long r0 = r2.A01
            java.lang.String r3 = "id"
            r9.A0Q(r3, r0)
            boolean r1 = r2.A0A
            java.lang.String r0 = "is_unit_dismissable"
            r9.A0S(r0, r1)
            boolean r1 = r2.A0B
            java.lang.String r0 = "large_profile_pictures_enabled"
            r9.A0S(r0, r1)
            boolean r1 = r2.A0C
            java.lang.String r0 = "load_animation_enabled"
            r9.A0S(r0, r1)
            boolean r1 = r2.A0D
            java.lang.String r0 = "multiple_gradients_enabled"
            r9.A0S(r0, r1)
            com.instagram.api.schemas.FeedItemType r0 = r2.A02
            if (r0 == 0) goto L_0x1117
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "netego_type"
            r9.A0R(r0, r1)
        L_0x1117:
            boolean r1 = r2.A0E
            java.lang.String r0 = "no_follow_confirmation"
            r9.A0S(r0, r1)
            java.lang.String r1 = r2.A04
            if (r1 == 0) goto L_0x1127
            java.lang.String r0 = "ranking_algorithm"
            r9.A0R(r0, r1)
        L_0x1127:
            boolean r1 = r2.A0F
            java.lang.String r0 = "shuffle_enabled"
            r9.A0S(r0, r1)
            boolean r1 = r2.A0G
            java.lang.String r0 = "smaller_follow_tap_target_enabled"
            r9.A0S(r0, r1)
            java.util.List r1 = r2.A07
            if (r1 == 0) goto L_0x12b7
            java.lang.String r0 = "suggestions"
            X.16P.A03(r9, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x1142:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x12b4
            java.lang.Object r3 = r6.next()
            X.3Op r3 = (X.C241283Op) r3
            if (r3 == 0) goto L_0x1142
            r9.A0c()
            java.lang.String r1 = r3.A09
            if (r1 == 0) goto L_0x115c
            java.lang.String r0 = "algorithm"
            r9.A0R(r0, r1)
        L_0x115c:
            java.lang.String r1 = r3.A0A
            if (r1 == 0) goto L_0x1165
            java.lang.String r0 = "background_image_url"
            r9.A0R(r0, r1)
        L_0x1165:
            java.lang.String r1 = r3.A0B
            if (r1 == 0) goto L_0x116e
            java.lang.String r0 = "caption"
            r9.A0R(r0, r1)
        L_0x116e:
            X.3Oo r1 = r3.A01
            if (r1 == 0) goto L_0x117e
            java.lang.String r0 = "custom_profile_pic_url"
            r9.A0q(r0)
            X.3On r0 = r1.F8o()
            X.C241253Om.A00(r9, r0)
        L_0x117e:
            java.lang.Boolean r0 = r3.A03
            if (r0 == 0) goto L_0x118b
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "followed_by"
            r9.A0S(r0, r1)
        L_0x118b:
            java.lang.Boolean r0 = r3.A04
            if (r0 == 0) goto L_0x1198
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "has_stories"
            r9.A0S(r0, r1)
        L_0x1198:
            java.lang.String r1 = r3.A0C
            if (r1 == 0) goto L_0x11a1
            java.lang.String r0 = "icon"
            r9.A0R(r0, r1)
        L_0x11a1:
            java.lang.Boolean r0 = r3.A05
            if (r0 == 0) goto L_0x11ae
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_new_suggestion"
            r9.A0S(r0, r1)
        L_0x11ae:
            java.util.List r1 = r3.A0F
            if (r1 == 0) goto L_0x11d0
            java.lang.String r0 = "large_urls"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x11bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x11cd
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x11bb
            r9.A0t(r0)
            goto L_0x11bb
        L_0x11cd:
            r9.A0Y()
        L_0x11d0:
            java.lang.Integer r0 = r3.A08
            if (r0 == 0) goto L_0x11dd
            int r1 = r0.intValue()
            java.lang.String r0 = "media_count"
            r9.A0P(r0, r1)
        L_0x11dd:
            java.util.List r1 = r3.A0G
            if (r1 == 0) goto L_0x11ff
            java.lang.String r0 = "media_ids"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x11ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x11fc
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x11ea
            r9.A0t(r0)
            goto L_0x11ea
        L_0x11fc:
            r9.A0Y()
        L_0x11ff:
            java.util.List r1 = r3.A0H
            if (r1 == 0) goto L_0x1223
            java.lang.String r0 = "media_infos"
            X.16P.A03(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x120c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1220
            java.lang.Object r1 = r5.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x120c
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x120c
        L_0x1220:
            r9.A0Y()
        L_0x1223:
            X.4hL r1 = r3.A00
            if (r1 == 0) goto L_0x122f
            java.lang.String r0 = "preview_media"
            r9.A0q(r0)
            X.C45604CzG.A00(r9, r1)
        L_0x122f:
            java.lang.Float r0 = r3.A06
            if (r0 == 0) goto L_0x123c
            float r1 = r0.floatValue()
            java.lang.String r0 = "score"
            r9.A0O(r0, r1)
        L_0x123c:
            java.lang.String r1 = r3.A0D
            if (r1 == 0) goto L_0x1245
            java.lang.String r0 = "social_context"
            r9.A0R(r0, r1)
        L_0x1245:
            java.util.List r1 = r3.A0I
            if (r1 == 0) goto L_0x1269
            java.lang.String r0 = "social_context_facepile_users"
            X.16P.A03(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x1252:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1266
            java.lang.Object r1 = r5.next()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x1252
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
            goto L_0x1252
        L_0x1266:
            r9.A0Y()
        L_0x1269:
            java.util.List r1 = r3.A0J
            if (r1 == 0) goto L_0x128b
            java.lang.String r0 = "thumbnail_urls"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1276:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1288
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x1276
            r9.A0t(r0)
            goto L_0x1276
        L_0x1288:
            r9.A0Y()
        L_0x128b:
            com.instagram.user.model.User r1 = r3.A02
            if (r1 == 0) goto L_0x1299
            java.lang.String r0 = "user"
            r9.A0q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
        L_0x1299:
            java.lang.String r1 = r3.A0E
            if (r1 == 0) goto L_0x12a2
            java.lang.String r0 = "uuid"
            r9.A0R(r0, r1)
        L_0x12a2:
            java.lang.Float r0 = r3.A07
            if (r0 == 0) goto L_0x12af
            float r1 = r0.floatValue()
            java.lang.String r0 = "value"
            r9.A0O(r0, r1)
        L_0x12af:
            r9.A0Z()
            goto L_0x1142
        L_0x12b4:
            r9.A0Y()
        L_0x12b7:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x12c0
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x12c0:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x12c9
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x12c9:
            r9.A0Z()
        L_0x12cc:
            X.3IP r2 = r10.A0F
            if (r2 == 0) goto L_0x1380
            java.lang.String r0 = "superlative_data"
            r9.A0q(r0)
            r9.A0c()
            java.lang.Integer r0 = r2.A00
            if (r0 == 0) goto L_0x12e9
            int r1 = r0.intValue()
            r0 = 1691(0x69b, float:2.37E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0P(r0, r1)
        L_0x12e9:
            java.util.List r1 = r2.A02
            if (r1 == 0) goto L_0x1370
            r0 = 1867(0x74b, float:2.616E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x12fa:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x136d
            java.lang.Object r3 = r5.next()
            X.BHe r3 = (X.C42101BHe) r3
            if (r3 == 0) goto L_0x12fa
            r9.A0c()
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x1318
            r0 = 2772(0xad4, float:3.884E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x1318:
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x1321
            java.lang.String r0 = "media_id"
            r9.A0R(r0, r1)
        L_0x1321:
            java.util.List r1 = r3.A05
            if (r1 == 0) goto L_0x1347
            r0 = 1664(0x680, float:2.332E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1332:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1344
            java.lang.Object r0 = r1.next()
            X.BHf r0 = (X.C42102BHf) r0
            if (r0 == 0) goto L_0x1332
            X.D07.A00(r9, r0)
            goto L_0x1332
        L_0x1344:
            r9.A0Y()
        L_0x1347:
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x1354
            int r1 = r0.intValue()
            java.lang.String r0 = "taken_at"
            r9.A0P(r0, r1)
        L_0x1354:
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x135d
            java.lang.String r0 = "template_id"
            r9.A0R(r0, r1)
        L_0x135d:
            X.BHf r1 = r3.A00
            if (r1 == 0) goto L_0x1369
            java.lang.String r0 = "user_data"
            r9.A0q(r0)
            X.D07.A00(r9, r1)
        L_0x1369:
            r9.A0Z()
            goto L_0x12fa
        L_0x136d:
            r9.A0Y()
        L_0x1370:
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x137d
            r0 = 1868(0x74c, float:2.618E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x137d:
            r9.A0Z()
        L_0x1380:
            X.3IR r3 = r10.A0G
            if (r3 == 0) goto L_0x13f2
            java.lang.String r0 = "threads_in_stories_unit_acquisition"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r3.A00
            if (r1 == 0) goto L_0x1395
            java.lang.String r0 = "cta_dest"
            r9.A0R(r0, r1)
        L_0x1395:
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x139e
            java.lang.String r0 = "cta_text"
            r9.A0R(r0, r1)
        L_0x139e:
            java.lang.String r1 = r3.A02
            if (r1 == 0) goto L_0x13a7
            java.lang.String r0 = "id"
            r9.A0R(r0, r1)
        L_0x13a7:
            java.util.List r1 = r3.A07
            if (r1 == 0) goto L_0x13cb
            java.lang.String r0 = "media_dicts"
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x13b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x13c8
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x13b4
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x13b4
        L_0x13c8:
            r9.A0Y()
        L_0x13cb:
            java.lang.String r1 = r3.A03
            if (r1 == 0) goto L_0x13d4
            java.lang.String r0 = "netego_title"
            r9.A0R(r0, r1)
        L_0x13d4:
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x13dd
            java.lang.String r0 = "quick_promotion_id"
            r9.A0R(r0, r1)
        L_0x13dd:
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x13e6
            java.lang.String r0 = "toast_text"
            r9.A0R(r0, r1)
        L_0x13e6:
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x13ef
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x13ef:
            r9.A0Z()
        L_0x13f2:
            java.lang.String r1 = r10.A1c
            if (r1 == 0) goto L_0x13fb
            java.lang.String r0 = "title"
            r9.A0R(r0, r1)
        L_0x13fb:
            X.3IT r3 = r10.A09
            if (r3 == 0) goto L_0x154e
            java.lang.String r0 = "trending_prompts_in_story"
            r9.A0q(r0)
            r9.A0c()
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x1410
            java.lang.String r0 = "action_text"
            r9.A0R(r0, r1)
        L_0x1410:
            java.lang.String r1 = r3.A05
            if (r1 == 0) goto L_0x1419
            java.lang.String r0 = "cursor"
            r9.A0R(r0, r1)
        L_0x1419:
            java.lang.Long r0 = r3.A02
            if (r0 == 0) goto L_0x1426
            long r0 = r0.longValue()
            java.lang.String r2 = "id"
            r9.A0Q(r2, r0)
        L_0x1426:
            java.lang.Boolean r0 = r3.A00
            if (r0 == 0) goto L_0x1433
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_shuffle"
            r9.A0S(r0, r1)
        L_0x1433:
            java.lang.Boolean r0 = r3.A01
            if (r0 == 0) goto L_0x1440
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "is_unit_dismissable"
            r9.A0S(r0, r1)
        L_0x1440:
            java.lang.String r1 = r3.A06
            if (r1 == 0) goto L_0x1449
            java.lang.String r0 = "netego_title"
            r9.A0R(r0, r1)
        L_0x1449:
            java.lang.String r1 = r3.A07
            if (r1 == 0) goto L_0x1452
            java.lang.String r0 = "netego_type"
            r9.A0R(r0, r1)
        L_0x1452:
            java.lang.String r1 = r3.A08
            if (r1 == 0) goto L_0x145b
            java.lang.String r0 = "tracking_token"
            r9.A0R(r0, r1)
        L_0x145b:
            java.util.List r1 = r3.A09
            if (r1 == 0) goto L_0x153e
            r0 = 812(0x32c, float:1.138E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x146c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x153b
            java.lang.Object r5 = r8.next()
            X.BHV r5 = (X.BHV) r5
            if (r5 == 0) goto L_0x146c
            r9.A0c()
            X.BHW r7 = r5.A01
            if (r7 == 0) goto L_0x14e0
            java.lang.String r0 = "logging_info"
            r9.A0q(r0)
            r9.A0c()
            java.util.List r1 = r7.A01
            if (r1 == 0) goto L_0x14ce
            r0 = 1579(0x62b, float:2.213E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.16P.A03(r9, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x149a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x14cb
            java.lang.Object r0 = r6.next()
            X.DSu r0 = (X.C46265DSu) r0
            if (r0 == 0) goto L_0x149a
            X.BHX r2 = r0.FBr()
            r9.A0c()
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x14b8
            java.lang.String r0 = "media_id"
            r9.A0R(r0, r1)
        L_0x14b8:
            com.instagram.api.schemas.StoryTrendingPromptMediaSubType r0 = r2.A00
            if (r0 == 0) goto L_0x14c7
            java.lang.String r1 = r0.A00
            r0 = 1584(0x630, float:2.22E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x14c7:
            r9.A0Z()
            goto L_0x149a
        L_0x14cb:
            r9.A0Y()
        L_0x14ce:
            com.instagram.api.schemas.StoryTrendingPromptSubType r0 = r7.A00
            if (r0 == 0) goto L_0x14dd
            java.lang.String r1 = r0.A00
            r0 = 1728(0x6c0, float:2.421E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A0R(r0, r1)
        L_0x14dd:
            r9.A0Z()
        L_0x14e0:
            java.util.List r1 = r5.A02
            if (r1 == 0) goto L_0x1504
            java.lang.String r0 = "media_infos"
            X.16P.A03(r9, r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x14ed:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1501
            java.lang.Object r1 = r2.next()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x14ed
            X.1Xv r0 = X.1Xj.A0h
            X.1Xv.A07(r9, r1)
            goto L_0x14ed
        L_0x1501:
            r9.A0Y()
        L_0x1504:
            com.instagram.api.schemas.StoryPromptTappableData r1 = r5.A00
            if (r1 == 0) goto L_0x1514
            r0 = 3183(0xc6f, float:4.46E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r9.A0q(r0)
            X.C281985Ai.A00(r9, r1, r4)
        L_0x1514:
            java.util.List r1 = r5.A03
            if (r1 == 0) goto L_0x1536
            java.lang.String r0 = "reel_pks"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1521:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1533
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x1521
            r9.A0t(r0)
            goto L_0x1521
        L_0x1533:
            r9.A0Y()
        L_0x1536:
            r9.A0Z()
            goto L_0x146c
        L_0x153b:
            r9.A0Y()
        L_0x153e:
            java.lang.Long r0 = r3.A03
            if (r0 == 0) goto L_0x154b
            long r1 = r0.longValue()
            java.lang.String r0 = "type"
            r9.A0Q(r0, r1)
        L_0x154b:
            r9.A0Z()
        L_0x154e:
            java.lang.Long r0 = r10.A1N
            if (r0 == 0) goto L_0x155b
            long r1 = r0.longValue()
            java.lang.String r0 = "unique_integer_reel_id"
            r9.A0Q(r0, r1)
        L_0x155b:
            java.util.List r1 = r10.A1m
            if (r1 == 0) goto L_0x157d
            java.lang.String r0 = "unseen_media_ids"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x1568:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x157a
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x1568
            r9.A0t(r0)
            goto L_0x1568
        L_0x157a:
            r9.A0Y()
        L_0x157d:
            java.util.List r1 = r10.A1n
            if (r1 == 0) goto L_0x159f
            java.lang.String r0 = "unseen_tray_skipped_media_ids"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x158a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x159c
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x158a
            r9.A0t(r0)
            goto L_0x158a
        L_0x159c:
            r9.A0Y()
        L_0x159f:
            java.lang.Integer r0 = r10.A1G
            if (r0 == 0) goto L_0x15ac
            int r1 = r0.intValue()
            java.lang.String r0 = "updated_timestamp"
            r9.A0P(r0, r1)
        L_0x15ac:
            com.instagram.user.model.User r1 = r10.A0a
            if (r1 == 0) goto L_0x15ba
            java.lang.String r0 = "user"
            r9.A0q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.1aC.A08(r9, r1)
        L_0x15ba:
            java.util.List r1 = r10.A1o
            if (r1 == 0) goto L_0x15e0
            java.lang.String r0 = "video_to_carousel_cut_secs"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x15c7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x15dd
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x15c7
            float r0 = r0.floatValue()
            r9.A0f(r0)
            goto L_0x15c7
        L_0x15dd:
            r9.A0Y()
        L_0x15e0:
            java.util.List r1 = r10.A1d
            if (r1 == 0) goto L_0x1602
            java.lang.String r0 = "video_to_carousel_cut_thumbnails"
            X.16P.A03(r9, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x15ed:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x15ff
            java.lang.Object r0 = r1.next()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            if (r0 == 0) goto L_0x15ed
            X.16W.A00(r9, r0)
            goto L_0x15ed
        L_0x15ff:
            r9.A0Y()
        L_0x1602:
            r9.A0Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HR.A00(X.17Z, X.3HX):void");
    }
}
