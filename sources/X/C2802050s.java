package X;

import android.os.Parcelable;
import android.text.Layout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.WordOffset;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.50s  reason: invalid class name and case insensitive filesystem */
public abstract class C2802050s {
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.513] */
    public static AnonymousClass513 parseFromJson(16F r48) {
        0qQ.A0B(r48, 0);
        try {
            Af1 af1 = null;
            if (r48.A11() != 16L.A0D) {
                r48.A0z();
                return null;
            }
            Af0 af0 = null;
            AnonymousClass5JL r46 = null;
            C19473WaL waL = null;
            C3498682d r44 = null;
            C15904UkT ukT = null;
            UOC uoc = null;
            C387329m2 r41 = null;
            C2802250u r40 = null;
            C387289ly r39 = null;
            C387319m1 r38 = null;
            C387379m7 r37 = null;
            C40594Aei aei = null;
            C40597Ael ael = null;
            AnonymousClass82f r33 = null;
            C40607Aev aev = null;
            C40601Aep aep = null;
            UNR unr = null;
            StoryPromptTappableData storyPromptTappableData = null;
            AnonymousClass6MT r28 = null;
            AnonymousClass8YF r27 = null;
            BGi bGi = null;
            UOB uob = null;
            BHJ bhj = null;
            C387359m5 r23 = null;
            C387369m6 r22 = null;
            UNZ unz = null;
            C387349m4 r20 = null;
            C40606Aeu aeu = null;
            C19474WaM waM = null;
            C40603Aer aer = null;
            C40604Aes aes = null;
            C40600Aeo aeo = null;
            C321096tZ r13 = null;
            ReelsVisualRepliesModel reelsVisualRepliesModel = null;
            C40609Aex aex = null;
            SubscriptionStickerDict subscriptionStickerDict = null;
            C283405Hn r9 = null;
            UpcomingEventImpl upcomingEventImpl = null;
            SharePlatformStickerClientModel sharePlatformStickerClientModel = null;
            StoryThenAndNowStickerDict storyThenAndNowStickerDict = null;
            StoryGroupMentionTappableData storyGroupMentionTappableData = null;
            StoryMusicPickTappableData storyMusicPickTappableData = null;
            C40595Aej aej = null;
            C40602Aeq aeq = null;
            C40595Aej aej2 = null;
            while (r48.A1J() != 16L.A09) {
                String A0q = r48.A0q();
                r48.A1J();
                if ("lyrics_sticker_spec".equals(A0q)) {
                    af1 = C39583A0z.parseFromJson(r48);
                } else if ("music_overlay_view_model".equals(A0q)) {
                    af0 = A10.parseFromJson(r48);
                } else if ("timed_sticker_client_model".equals(A0q)) {
                    r46 = AnonymousClass5JK.parseFromJson(r48);
                } else if ("bitmap_sticker_client_model".equals(A0q)) {
                    waL = VIY.parseFromJson(r48);
                } else if ("igtv_sticker_client_model".equals(A0q)) {
                    r44 = C394449y8.parseFromJson(r48);
                } else if ("media_sticker_client_model".equals(A0q)) {
                    ukT = VB8.parseFromJson(r48);
                } else if ("karaoke_caption_client_model".equals(A0q)) {
                    uoc = VBD.parseFromJson(r48);
                } else if ("static_sticker_client_model".equals(A0q)) {
                    r41 = C394149xc.parseFromJson(r48);
                } else if ("text_sticker_client_model".equals(A0q)) {
                    r40 = C2802150t.parseFromJson(r48);
                } else if ("date_time_sticker_client_model".equals(A0q)) {
                    r39 = VB9.parseFromJson(r48);
                } else if ("internal_sticker_client_model".equals(A0q)) {
                    r38 = VBA.parseFromJson(r48);
                } else if ("gallery_sticker_client_model".equals(A0q)) {
                    r37 = C394059xT.parseFromJson(r48);
                } else if ("polaroid_sticker_client_model".equals(A0q)) {
                    aei = C394129xa.parseFromJson(r48);
                } else if ("swappable_gallery_sticker_client_model".equals(A0q)) {
                    ael = C394179xf.parseFromJson(r48);
                } else if ("secret_sticker_client_model".equals(A0q)) {
                    aej2 = AAW.parseFromJson(r48);
                } else if ("clips_attribution_sticker_client_model".equals(A0q)) {
                    r33 = C394719yZ.parseFromJson(r48);
                } else if ("video_sticker_client_model".equals(A0q)) {
                    aev = C394199xh.parseFromJson(r48);
                } else if ("dual_photo_client_model".equals(A0q)) {
                    aep = C394389y0.parseFromJson(r48);
                } else if ("question_sticker_client_model".equals(A0q)) {
                    unr = C18119Vln.parseFromJson(r48);
                } else if ("prompt_sticker_client_model".equals(A0q)) {
                    storyPromptTappableData = C281985Ai.parseFromJson(r48);
                } else if ("link_sticker_client_model".equals(A0q)) {
                    r28 = C394089xW.parseFromJson(r48);
                } else if ("fundraiser_sticker_client_model".equals(A0q)) {
                    r27 = AB9.parseFromJson(r48);
                } else if ("countdown_sticker_client_model".equals(A0q)) {
                    bGi = C45635Czl.parseFromJson(r48);
                } else if ("chat_sticker_client_model".equals(A0q)) {
                    uob = C18235Vo2.parseFromJson(r48);
                } else if ("slider_sticker_client_model".equals(A0q)) {
                    bhj = C45648Czy.parseFromJson(r48);
                } else if ("hashtag_sticker_client_model".equals(A0q)) {
                    r23 = C394069xU.parseFromJson(r48);
                } else if ("mention_sticker_client_model".equals(A0q)) {
                    r22 = C394109xY.parseFromJson(r48);
                } else if ("quiz_sticker_client_model".equals(A0q)) {
                    unz = C18125Vlt.parseFromJson(r48);
                } else if ("location_sticker_client_model".equals(A0q)) {
                    r20 = VBB.parseFromJson(r48);
                } else if ("poll_sticker_client_model".equals(A0q)) {
                    aeu = C17041VFp.parseFromJson(r48);
                } else if ("poll_sticker_v2_client_model".equals(A0q)) {
                    waM = C17042VFq.parseFromJson(r48);
                } else if ("clips_end_card_client_model".equals(A0q)) {
                    aer = C393769wy.parseFromJson(r48);
                } else if ("clips_end_card_static_client_model".equals(A0q)) {
                    aes = C393759wx.parseFromJson(r48);
                } else if ("clips_watermark_client_model".equals(A0q)) {
                    aeo = C393829x4.parseFromJson(r48);
                } else if ("loadable_gif_sticker_client_model".equals(A0q)) {
                    r13 = C394099xX.parseFromJson(r48);
                } else if ("reels_visual_replies_model".equals(A0q)) {
                    reelsVisualRepliesModel = VBC.parseFromJson(r48);
                } else if ("i_take_care_sticker_model".equals(A0q)) {
                    aex = C39580A0w.parseFromJson(r48);
                } else if ("subscriptions_sticker_model".equals(A0q)) {
                    subscriptionStickerDict = D06.parseFromJson(r48);
                } else if ("reaction_sticker_model".equals(A0q)) {
                    r9 = AnonymousClass6LG.parseFromJson(r48);
                } else if ("upcoming_event".equals(A0q)) {
                    upcomingEventImpl = C45712D2l.parseFromJson(r48);
                } else if ("share_platform_sticker_model".equals(A0q)) {
                    sharePlatformStickerClientModel = C394209xi.parseFromJson(r48);
                } else if ("before_and_after_sticker_model".equals(A0q)) {
                    storyThenAndNowStickerDict = D01.parseFromJson(r48);
                } else if ("group_mention_sticker_model".equals(A0q)) {
                    storyGroupMentionTappableData = C45641Czr.parseFromJson(r48);
                } else if ("music_pick_sticker_model".equals(A0q)) {
                    storyMusicPickTappableData = C45643Czt.parseFromJson(r48);
                } else if ("secret_sticker_model".equals(A0q)) {
                    aej = AAW.parseFromJson(r48);
                } else if ("bio_product_sticker_model".equals(A0q)) {
                    aeq = C39569A0l.parseFromJson(r48);
                }
                r48.A0z();
            }
            ? obj = new Object();
            if (af1 != null) {
                obj.A0d = af1;
            }
            if (af0 != null) {
                obj.A0e = af0;
            }
            if (r46 != null) {
                obj.A0Y = r46;
            }
            if (waL != null) {
                obj.A0i = waL;
            }
            if (r44 != null) {
                obj.A0U = r44;
            }
            if (ukT != null) {
                obj.A0C = ukT;
            }
            if (uoc != null) {
                obj.A0V = uoc;
            }
            if (r41 != null) {
                obj.A0O = r41;
            }
            if (r40 != null) {
                obj.A0X = r40;
            }
            if (r39 != null) {
                obj.A0D = r39;
            }
            if (r38 != null) {
                obj.A0G = r38;
            }
            if (r37 != null) {
                obj.A0E = r37;
            }
            if (aei != null) {
                obj.A0L = aei;
            }
            if (ael != null) {
                obj.A0P = ael;
            }
            if (aej2 != null) {
                obj.A0M = aej2;
            }
            if (r33 != null) {
                obj.A0W = r33;
            }
            if (aev != null) {
                obj.A0Q = aev;
            }
            if (aep != null) {
                obj.A0T = aep;
            }
            if (unr != null) {
                obj.A00 = unr;
            }
            if (storyPromptTappableData != null) {
                obj.A04 = storyPromptTappableData;
            }
            if (r28 != null) {
                obj.A0H = r28;
            }
            if (r27 != null) {
                obj.A0b = r27;
            }
            if (bGi != null) {
                obj.A01 = bGi;
            }
            if (uob != null) {
                obj.A0a = uob;
            }
            if (bhj != null) {
                obj.A06 = bhj;
            }
            if (r23 != null) {
                obj.A0F = r23;
            }
            if (r22 != null) {
                obj.A0K = r22;
            }
            if (unz != null) {
                obj.A05 = unz;
            }
            if (r20 != null) {
                obj.A0J = r20;
            }
            if (aeu != null) {
                obj.A0f = aeu;
            }
            if (waM != null) {
                obj.A0g = waM;
            }
            if (aer != null) {
                obj.A0A = aer;
            }
            if (aes != null) {
                obj.A09 = aes;
            }
            if (aeo != null) {
                obj.A0B = aeo;
            }
            if (r13 != null) {
                obj.A0I = r13;
            }
            if (reelsVisualRepliesModel != null) {
                obj.A0S = reelsVisualRepliesModel;
            }
            if (aex != null) {
                obj.A0c = aex;
            }
            if (subscriptionStickerDict != null) {
                obj.A08 = subscriptionStickerDict;
            }
            if (r9 != null) {
                obj.A0h = r9;
            }
            if (upcomingEventImpl != null) {
                obj.A0j = upcomingEventImpl;
            }
            if (sharePlatformStickerClientModel != null) {
                obj.A0R = sharePlatformStickerClientModel;
            }
            if (storyThenAndNowStickerDict != null) {
                obj.A07 = storyThenAndNowStickerDict;
            }
            if (storyGroupMentionTappableData != null) {
                obj.A02 = storyGroupMentionTappableData;
            }
            if (storyMusicPickTappableData != null) {
                obj.A03 = storyMusicPickTappableData;
            }
            if (aej != null) {
                obj.A0N = aej;
            }
            if (aeq == null) {
                return obj;
            }
            obj.A0Z = aeq;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r7, AnonymousClass513 r8) {
        String str;
        String str2;
        String str3;
        r7.A0c();
        if (r8.A0d != null) {
            r7.A0q("lyrics_sticker_spec");
            Af1 af1 = r8.A0d;
            r7.A0c();
            af1.BV4();
            r7.A0R("music_sticker_display_type", af1.BV4().A02);
            af1.BUu();
            r7.A0q("music_sticker_model");
            C255673uX.A00(r7, af1.BUu(), true);
            if (af1.A01 != null) {
                r7.A0q("music_asset_lyrics");
                AnonymousClass9SE r1 = af1.A01;
                if (r1 != null) {
                    r7.A0c();
                    if (r1.A00 != null) {
                        16P.A03(r7, "phrases");
                        for (LyricsPhrase lyricsPhrase : r1.A00) {
                            if (lyricsPhrase != null) {
                                r7.A0c();
                                r7.A0P("start_time_in_ms", lyricsPhrase.A00);
                                String str4 = lyricsPhrase.A01;
                                if (str4 != null) {
                                    r7.A0R("phrase", str4);
                                }
                                if (lyricsPhrase.A02 != null) {
                                    16P.A03(r7, "word_offsets");
                                    for (WordOffset wordOffset : lyricsPhrase.A02) {
                                        if (wordOffset != null) {
                                            r7.A0c();
                                            r7.A0P("start_index", wordOffset.A02);
                                            r7.A0P("end_index", wordOffset.A00);
                                            r7.A0P("start_offset_ms", wordOffset.A03);
                                            r7.A0P("end_offset_ms", wordOffset.A01);
                                            r7.A0S("trailing_space", wordOffset.A04);
                                            r7.A0Z();
                                        }
                                    }
                                    r7.A0Y();
                                }
                                r7.A0Z();
                            }
                        }
                        r7.A0Y();
                    }
                    r7.A0Z();
                    r7.A0P("text_color", af1.A00);
                    r7.A0Z();
                }
            }
            str = "musicAssetLyrics";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (r8.A0e != null) {
            r7.A0q("music_overlay_view_model");
            Af0 af0 = r8.A0e;
            r7.A0c();
            r7.A0R("music_sticker_display_type", af0.A03.A02);
            af0.BUu();
            r7.A0q("music_sticker_model");
            C255673uX.A00(r7, af0.BUu(), true);
            r7.A0P("color", af0.A00);
            r7.A0Z();
        }
        if (r8.A0Y != null) {
            r7.A0q("timed_sticker_client_model");
            AnonymousClass5JL r3 = r8.A0Y;
            r7.A0c();
            String str5 = r3.A04;
            if (str5 != null) {
                r7.A0R("sticker_id", str5);
            }
            r7.A0P("start_time_ms", r3.A01);
            r7.A0P("end_time_ms", r3.A00);
            String str6 = r3.A06;
            if (str6 != null) {
                r7.A0R("tts_voice_id", str6);
            }
            String str7 = r3.A07;
            if (str7 != null) {
                r7.A0R("tts_voice_name", str7);
            }
            String str8 = r3.A03;
            if (str8 != null) {
                r7.A0R("tts_sfx", str8);
            }
            String str9 = r3.A05;
            if (str9 != null) {
                r7.A0R("tts_shortwave_id", str9);
            }
            if (r3.A02 != null) {
                r7.A0q("base_sticker_client_model");
                A00(r7, r3.A02);
            }
            r7.A0Z();
        }
        if (r8.A0i != null) {
            r7.A0q("bitmap_sticker_client_model");
            C19473WaL waL = r8.A0i;
            r7.A0c();
            r7.A0R("sticker_id", waL.A04);
            r7.A0R("image_file_path", waL.A05);
            r7.A0P("rect_left", waL.A01);
            r7.A0P("rect_top", waL.A03);
            r7.A0P("rect_right", waL.A02);
            r7.A0P("rect_bottom", waL.A00);
            r7.A0Z();
        }
        if (r8.A0U != null) {
            r7.A0q("igtv_sticker_client_model");
            C3498682d r32 = r8.A0U;
            r7.A0c();
            if (r32.A04 != null) {
                r7.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                User user = r32.A04;
                Parcelable.Creator creator = User.CREATOR;
                1aC.A08(r7, user);
            }
            String str10 = r32.A06;
            if (str10 != null) {
                r7.A0R("original_media_id", str10);
            }
            r7.A0S("is_landscape", r32.A08);
            String str11 = r32.A05;
            if (str11 != null) {
                r7.A0R("media_title", str11);
            }
            r7.A0P("media_duration", r32.A03);
            r7.A0P("container_width", r32.A02);
            r7.A0P("container_height", r32.A01);
            r7.A0O("media_aspect_ratio", r32.A00);
            r7.A0S("is_shoppable", r32.A09);
            r7.A0S("has_collaborators", r32.A07);
            r7.A0Z();
        }
        if (r8.A0C != null) {
            r7.A0q("media_sticker_client_model");
            C15904UkT ukT = r8.A0C;
            r7.A0c();
            String str12 = ukT.A0E;
            if (str12 != null) {
                r7.A0R("media_id", str12);
            }
            String str13 = ukT.A07;
            if (str13 != null) {
                r7.A0R("carousel_child_media_id", str13);
            }
            String str14 = ukT.A0F;
            if (str14 != null) {
                r7.A0R("media_owner_id", str14);
            }
            String str15 = ukT.A0I;
            if (str15 != null) {
                r7.A0R(C46367Ddj.A01(43, 8, 30), str15);
            }
            String str16 = ukT.A0H;
            if (str16 != null) {
                r7.A0R("user_attribution", str16);
            }
            if (ukT.A05 != null) {
                r7.A0q("profile_pic_url");
                16h.A01(r7, ukT.A05);
            }
            r7.A0S("has_product_tags", ukT.A0L);
            r7.A0S("carousel_child_has_product_tags", ukT.A0J);
            r7.A0S("has_collaborators", ukT.A0K);
            r7.A0S("is_media_author_seller", ukT.A0O);
            String str17 = ukT.A0G;
            if (str17 != null) {
                r7.A0R(DialogModule.KEY_TITLE, str17);
            }
            String str18 = ukT.A08;
            if (str18 != null) {
                r7.A0R(TraceFieldType.Duration, str18);
            }
            Long l = ukT.A06;
            if (l != null) {
                r7.A0Q("duration_ms", l.longValue());
            }
            String str19 = ukT.A0A;
            if (str19 != null) {
                r7.A0R(AnonymousClass000.A00(1315), str19);
            }
            String str20 = ukT.A0C;
            if (str20 != null) {
                r7.A0R("event_title", str20);
            }
            String str21 = ukT.A0B;
            if (str21 != null) {
                r7.A0R("event_time", str21);
            }
            String str22 = ukT.A09;
            if (str22 != null) {
                r7.A0R("event_action_button_text", str22);
            }
            r7.A0S("is_autoplay", ukT.A0M);
            r7.A0S("is_carousel", ukT.A0N);
            String str23 = ukT.A0D;
            if (str23 != null) {
                r7.A0R("fundraiser_id", str23);
            }
            r7.A0P(IgReactMediaPickerNativeModule.WIDTH, ukT.A04);
            r7.A0P(IgReactMediaPickerNativeModule.HEIGHT, ukT.A00);
            r7.A0P("padding_x", ukT.A01);
            r7.A0P("padding_y", ukT.A02);
            r7.A0P("repost_pill_width", ukT.A03);
            AAV.A00(r7, ukT);
            r7.A0Z();
        }
        if (r8.A0V != null) {
            r7.A0q("karaoke_caption_client_model");
            UOC uoc = r8.A0V;
            r7.A0c();
            if (uoc.A07 != null) {
                16P.A03(r7, "tokens");
                for (C15092UOk uOk : uoc.A07) {
                    if (uOk != null) {
                        C18191Vn5.A00(r7, uOk);
                    }
                }
                r7.A0Y();
            }
            r7.A0P(TraceFieldType.Duration, uoc.A01);
            C16609Uy5 uy5 = uoc.A02;
            if (uy5 != null) {
                r7.A0R("karaoke_sticker_display_type", uy5.A02);
            }
            r7.A0P("color", uoc.A00);
            C306576Mr r0 = uoc.A03;
            if (r0 != null) {
                r7.A0R("karaoke_sticker_emphasis_state", r0.A00);
            }
            String str24 = uoc.A06;
            if (str24 != null) {
                r7.A0R("sticker_id", str24);
            }
            r7.A0S("is_clips_v2_media", uoc.A08);
            Integer num = uoc.A05;
            if (num != null) {
                r7.A0P("text_color", num.intValue());
            }
            Integer num2 = uoc.A04;
            if (num2 != null) {
                r7.A0P("background_color", num2.intValue());
            }
            r7.A0Z();
        }
        if (r8.A0O != null) {
            r7.A0q("static_sticker_client_model");
            C387329m2 r12 = r8.A0O;
            r7.A0c();
            r12.A00();
            r7.A0q("static_sticker");
            C369248u6.A00(r7, r12.A00());
            AAV.A00(r7, r12);
            r7.A0Z();
        }
        if (r8.A0X != null) {
            r7.A0q("text_sticker_client_model");
            C2802250u r33 = r8.A0X;
            r7.A0c();
            if (r33.A0D != null) {
                r7.A0q("text_metadata");
                C2802450w.A00(r7, r33.A0D);
            }
            Layout.Alignment alignment = r33.A0A;
            if (alignment != null) {
                r7.A0R("text_emphasis", alignment.name());
            }
            r7.A0O("padding_x", r33.A03);
            r7.A0O("padding_y", r33.A04);
            r7.A0P("text_color", r33.A07);
            r7.A0O("text_size", r33.A05);
            if (r33.A0E != null) {
                r7.A0q("shadow_layer");
                C321176th r4 = r33.A0E;
                r7.A0c();
                r7.A0O("shadow_layer_radius", r4.A02);
                r7.A0O("shadow_layer_dx", r4.A00);
                r7.A0O("shadow_layer_dy", r4.A01);
                r7.A0P("shadow_layer_color", r4.A03);
                r7.A0Z();
            }
            r7.A0O("line_spacing_add", r33.A01);
            r7.A0O("line_spacing_mult", r33.A02);
            r7.A0O("letter_spacing", r33.A00);
            r7.A0P("truncation_max_lines", r33.A09);
            String str25 = r33.A0G;
            if (str25 != null) {
                r7.A0R("truncation_suffix", str25);
            }
            r7.A0S("is_animated", r33.A0H);
            r7.A0P("safe_width", r33.A06);
            Integer num3 = r33.A0F;
            if (num3 != null) {
                r7.A0R("drawable_source", AnonymousClass512.A00(num3));
            }
            r7.A0S("is_story_text_drawable", r33.A0I);
            C360728f3 r02 = r33.A0B;
            if (r02 != null) {
                r7.A0R("animation_id", r02.A00);
            }
            C306396Lz r03 = r33.A0C;
            if (r03 != null) {
                r7.A0R("effect_id", r03.A00);
            }
            r7.A0P("text_effect_color", r33.A08);
            r7.A0Z();
        }
        if (r8.A0D != null) {
            r7.A0q("date_time_sticker_client_model");
            C387289ly r13 = r8.A0D;
            r7.A0c();
            r7.A0Q("timestamp_ms", r13.A00);
            AAV.A00(r7, r13);
            r7.A0Z();
        }
        if (r8.A0G != null) {
            r7.A0q("internal_sticker_client_model");
            C387319m1 r34 = r8.A0G;
            r7.A0c();
            r7.A0P("max_width", r34.A00);
            r7.A0S("is_ig_internal_sticker_available", r34.A01);
            r7.A0S("is_meta_internal_sticker_available", r34.A02);
            AAV.A00(r7, r34);
            r7.A0Z();
        }
        if (r8.A0E != null) {
            r7.A0q("gallery_sticker_client_model");
            C387379m7 r35 = r8.A0E;
            r7.A0c();
            r35.A00();
            r7.A0q("medium");
            C353258Gx.A00(r7, r35.A00());
            r7.A0P("max_width", r35.A01);
            r7.A0P("max_height", r35.A00);
            AAV.A00(r7, r35);
            r7.A0Z();
        }
        if (r8.A0L != null) {
            r7.A0q("polaroid_sticker_client_model");
            C40594Aei aei = r8.A0L;
            r7.A0c();
            if (aei.A00 != null) {
                r7.A0q("medium");
                C353258Gx.A00(r7, aei.A00);
            }
            String str26 = aei.A01;
            if (str26 != null) {
                r7.A0R("caption", str26);
            }
            r7.A0Z();
        }
        if (r8.A0P != null) {
            r7.A0q("swappable_gallery_sticker_client_model");
            C40597Ael ael = r8.A0P;
            r7.A0c();
            str = "medium";
            if (ael.A02 != null) {
                r7.A0q(str);
                Medium medium = ael.A02;
                if (medium != null) {
                    C353258Gx.A00(r7, medium);
                    r7.A0P(IgReactMediaPickerNativeModule.WIDTH, ael.A01);
                    r7.A0P(IgReactMediaPickerNativeModule.HEIGHT, ael.A00);
                    r7.A0Z();
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (r8.A0M != null) {
            r7.A0q("secret_sticker_client_model");
            AAW.A00(r7, r8.A0M);
        }
        if (r8.A0W != null) {
            r7.A0q("clips_attribution_sticker_client_model");
            AnonymousClass82f r36 = r8.A0W;
            r7.A0c();
            User user2 = r36.A0B;
            r7.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            Parcelable.Creator creator2 = User.CREATOR;
            1aC.A08(r7, user2);
            User user3 = r36.A0A;
            if (user3 != null) {
                r7.A0q("group_profile");
                1aC.A08(r7, user3);
            }
            r7.A0R("original_media_id", r36.A0C);
            r7.A0P("container_height", r36.A01);
            r7.A0P("container_width", r36.A02);
            r7.A0O("aspect_ratio", r36.A05);
            r7.A0P("media_duration", r36.A06);
            1sP r14 = r36.A09;
            if (r14 != null) {
                r7.A0q("clips_metadata");
                AnonymousClass1rc.A00(r7, r14);
            }
            r7.A0S("is_full_screen", r36.A04);
            r7.A0S("is_video_transcoding_enabled", r36.A0D);
            r7.A0O("full_screen_scale", r36.A00);
            r7.A0Z();
        }
        if (r8.A0Q != null) {
            r7.A0q("video_sticker_client_model");
            C40607Aev aev = r8.A0Q;
            r7.A0c();
            if (aev.A06 != null) {
                r7.A0q("medium");
                C353258Gx.A00(r7, aev.A06);
            }
            C391149sQ r04 = aev.A07;
            if (r04 != null) {
                r7.A0R("product_type", r04.toString());
            }
            r7.A0P("max_width", aev.A02);
            r7.A0P("max_height", aev.A01);
            r7.A0O("volume", aev.A00);
            C391099sL r05 = aev.A08;
            if (r05 != null) {
                r7.A0R("clips_remix_layout_type", r05.toString());
            }
            r7.A0S("is_mirrored", aev.A09);
            r7.A0S("should_use_new_transcoding_flow", aev.A0A);
            if (aev.A05 != null) {
                r7.A0q("corner_radii");
                C376429Hy r37 = aev.A05;
                r7.A0c();
                r7.A0O("top_left", r37.A02);
                r7.A0O("top_right", r37.A03);
                r7.A0O("bottom_right", r37.A01);
                r7.A0O("bottom_left", r37.A00);
                r7.A0Z();
            }
            r7.A0P("time_interval_start_time_ms", aev.A04);
            r7.A0P("time_interval_end_time_ms", aev.A03);
            r7.A0Z();
        }
        if (r8.A0T != null) {
            r7.A0q("dual_photo_client_model");
            C40601Aep aep = r8.A0T;
            r7.A0c();
            String str27 = aep.A04;
            if (str27 != null) {
                r7.A0R("file_path", str27);
            }
            r7.A0P("creation_layout_config_width", aep.A02);
            r7.A0P("creation_layout_config_height", aep.A01);
            r7.A0P("orientation", aep.A03);
            r7.A0P("corner_radius", aep.A00);
            r7.A0Z();
        }
        if (r8.A00 != null) {
            r7.A0q("question_sticker_client_model");
            C18119Vln.A00(r7, r8.A00, true);
        }
        if (r8.A04 != null) {
            r7.A0q("prompt_sticker_client_model");
            C281985Ai.A00(r7, r8.A04, true);
        }
        if (r8.A0H != null) {
            r7.A0q("link_sticker_client_model");
            AnonymousClass6MT r06 = r8.A0H;
            r7.A0c();
            AAV.A00(r7, r06);
            r7.A0Z();
        }
        if (r8.A0b != null) {
            r7.A0q("fundraiser_sticker_client_model");
            AB9.A00(r7, r8.A0b, true);
        }
        if (r8.A01 != null) {
            r7.A0q("countdown_sticker_client_model");
            C45635Czl.A00(r7, r8.A01, true);
        }
        if (r8.A0a != null) {
            r7.A0q("chat_sticker_client_model");
            C18235Vo2.A00(r7, r8.A0a, true);
        }
        if (r8.A06 != null) {
            r7.A0q("slider_sticker_client_model");
            C45648Czy.A00(r7, r8.A06, true);
        }
        if (r8.A0F != null) {
            r7.A0q("hashtag_sticker_client_model");
            C387359m5 r38 = r8.A0F;
            r7.A0c();
            String str28 = r38.A02;
            if (str28 != null) {
                r7.A0R("text", str28);
            }
            r7.A0O("text_size", r38.A00);
            r7.A0P("max_width", r38.A01);
            AAV.A00(r7, r38);
            r7.A0Z();
        }
        if (r8.A0K != null) {
            r7.A0q("mention_sticker_client_model");
            C387369m6 r42 = r8.A0K;
            r7.A0c();
            String str29 = r42.A04;
            if (str29 != null) {
                r7.A0R("text", str29);
            }
            r7.A0O("text_size", r42.A00);
            r7.A0P("max_width", r42.A01);
            if (r42.A03 != null) {
                r7.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                User user4 = r42.A03;
                Parcelable.Creator creator3 = User.CREATOR;
                1aC.A08(r7, user4);
            }
            if (r42.A02 != null) {
                r7.A0q("pics_please_response");
                QP8 qp8 = r42.A02;
                r7.A0c();
                String str30 = qp8.A02;
                if (str30 != null) {
                    r7.A0R("prompt", str30);
                }
                Number number = (Number) qp8.A00;
                if (number != null) {
                    r7.A0P("background_color", number.intValue());
                }
                String str31 = qp8.A01;
                if (str31 != null) {
                    r7.A0R("original_question_id", str31);
                }
                String str32 = qp8.A04;
                if (str32 != null) {
                    r7.A0R("question_response_id", str32);
                }
                String str33 = qp8.A03;
                if (str33 != null) {
                    r7.A0R("question_responder_id", str33);
                }
                r7.A0Z();
            }
            AAV.A00(r7, r42);
            r7.A0Z();
        }
        if (r8.A05 != null) {
            r7.A0q("quiz_sticker_client_model");
            C18125Vlt.A00(r7, r8.A05, true);
        }
        if (r8.A0J != null) {
            r7.A0q("location_sticker_client_model");
            C387349m4 r39 = r8.A0J;
            r7.A0c();
            if (r39.A00 != null) {
                r7.A0q("venue");
                LocationDict locationDict = r39.A00;
                if (locationDict != null) {
                    AnonymousClass41Q.A00(r7, locationDict);
                    Integer num4 = r39.A01;
                    if (num4 != null) {
                        r7.A0P("themed_color", num4.intValue());
                    }
                    AAV.A00(r7, r39);
                    r7.A0Z();
                }
            }
            str = "locationDict";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (r8.A0f != null) {
            r7.A0q("poll_sticker_client_model");
            C40606Aeu aeu = r8.A0f;
            r7.A0c();
            r7.A0R("first_option_string", aeu.A05);
            r7.A0R("second_option_string", aeu.A07);
            r7.A0O("first_option_text_size", aeu.A00);
            r7.A0O("second_option_text_size", aeu.A02);
            String str34 = aeu.A06;
            if (str34 != null) {
                r7.A0R("question", str34);
            }
            r7.A0O("question_text_size", aeu.A01);
            r7.A0P("question_max_width", aeu.A03);
            r7.A0P("question_padding_bottom", aeu.A04);
            r7.A0Z();
        }
        if (r8.A0g != null) {
            r7.A0q("poll_sticker_v2_client_model");
            C19474WaM waM = r8.A0g;
            r7.A0c();
            r7.A0R("poll_id", waM.A03);
            String str35 = waM.A04;
            if (str35 != null) {
                r7.A0R("question", str35);
            }
            Integer num5 = waM.A01;
            if (num5 != null) {
                r7.A0P("viewer_vote", num5.intValue());
            }
            r7.A0S("viewer_can_vote", waM.A07);
            r7.A0S("is_shared_result", waM.A08);
            16P.A03(r7, "tallies");
            for (C272004jw r07 : waM.A06) {
                if (r07 != null) {
                    C271994jv.A00(r7, r07);
                }
            }
            r7.A0Y();
            if (waM.A05 != null) {
                16P.A03(r7, "option_tally_ratios");
                for (Number number2 : waM.A05) {
                    if (number2 != null) {
                        r7.A0g(number2.intValue());
                    }
                }
                r7.A0Y();
            }
            r7.A0R("color", waM.A02);
            r7.A0Z();
        }
        if (r8.A0A != null) {
            r7.A0q("clips_end_card_client_model");
            C40603Aer aer = r8.A0A;
            r7.A0c();
            r7.A0R(C46367Ddj.A00(), aer.A05);
            String str36 = aer.A04;
            if (str36 != null) {
                r7.A0R("attribution_info", str36);
            }
            r7.A0P("container_width", aer.A01);
            r7.A0P("container_height", aer.A00);
            r7.A0Q("video_duration", aer.A03);
            r7.A0P("endcard_video_duration_ms", aer.A02);
            r7.A0Z();
        }
        if (r8.A09 != null) {
            r7.A0q("clips_end_card_static_client_model");
            C40604Aes aes = r8.A09;
            r7.A0c();
            r7.A0R(C46367Ddj.A00(), aes.A06);
            String str37 = aes.A05;
            if (str37 != null) {
                r7.A0R("attribution_info", str37);
            }
            r7.A0P("container_width", aes.A01);
            r7.A0P("container_height", aes.A00);
            r7.A0Q("video_duration", aes.A03);
            r7.A0P("endcard_video_duration_ms", aes.A02);
            if (1 - aes.A04.intValue() != 0) {
                str3 = "last_frame";
            } else {
                str3 = "black_background";
            }
            r7.A0R("background_type", str3);
            r7.A0Z();
        }
        if (r8.A0B != null) {
            r7.A0q("clips_watermark_client_model");
            C40600Aeo aeo = r8.A0B;
            r7.A0c();
            r7.A0R(C46367Ddj.A00(), aeo.A04);
            String str38 = aeo.A03;
            if (str38 != null) {
                r7.A0R("attribution_info", str38);
            }
            r7.A0P("container_width", aeo.A01);
            r7.A0P("container_height", aeo.A00);
            r7.A0P("video_duration", aeo.A02);
            r7.A0Z();
        }
        if (r8.A0I != null) {
            r7.A0q("loadable_gif_sticker_client_model");
            C321096tZ r310 = r8.A0I;
            r7.A0c();
            String str39 = r310.A08;
            if (str39 != null) {
                r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str39);
            }
            String str40 = r310.A09;
            if (str40 != null) {
                r7.A0R("image_url", str40);
            }
            String str41 = r310.A07;
            if (str41 != null) {
                r7.A0R("high_resolution_image_url", str41);
            }
            r7.A0O("progress_bar_width", r310.A00);
            r7.A0P("intrinsic_size", r310.A02);
            r7.A0P(IgReactMediaPickerNativeModule.WIDTH, r310.A05);
            r7.A0P(IgReactMediaPickerNativeModule.HEIGHT, r310.A01);
            r7.A0P("progress_background_colour", r310.A03);
            r7.A0P("progress_foreground_colour", r310.A04);
            r7.A0S("is_background_gif_drawable", r310.A0A);
            Integer num6 = r310.A06;
            if (num6 != null) {
                if (1 - num6.intValue() != 0) {
                    str2 = "VERTICAL";
                } else {
                    str2 = "HORIZONTAL";
                }
                r7.A0R(AnonymousClass000.A00(3922), str2);
            }
            r7.A0Z();
        }
        if (r8.A0S != null) {
            r7.A0q("reels_visual_replies_model");
            ReelsVisualRepliesModel reelsVisualRepliesModel = r8.A0S;
            r7.A0c();
            if (reelsVisualRepliesModel.A00 != null) {
                r7.A0q("media_vcr_tappable_data");
                C45594Cz6.A00(r7, reelsVisualRepliesModel.A00, true);
            }
            AAV.A00(r7, reelsVisualRepliesModel);
            r7.A0Z();
        }
        if (r8.A0c != null) {
            r7.A0q("i_take_care_sticker_model");
            C40609Aex aex = r8.A0c;
            r7.A0c();
            String str42 = aex.A02;
            if (str42 != null) {
                r7.A0R("prompt", str42);
            }
            String str43 = aex.A01;
            if (str43 != null) {
                r7.A0R("hint", str43);
            }
            String str44 = aex.A00;
            if (str44 != null) {
                r7.A0R("help_text", str44);
            }
            String str45 = aex.A03;
            if (str45 != null) {
                r7.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str45);
            }
            r7.A0Z();
        }
        if (r8.A08 != null) {
            r7.A0q("subscriptions_sticker_model");
            D06.A00(r7, r8.A08);
        }
        if (r8.A0h != null) {
            r7.A0q("reaction_sticker_model");
            AnonymousClass6LG.A00(r7, r8.A0h);
        }
        if (r8.A0j != null) {
            r7.A0q("upcoming_event");
            C45712D2l.A00(r7, r8.A0j);
        }
        if (r8.A0R != null) {
            r7.A0q("share_platform_sticker_model");
            SharePlatformStickerClientModel sharePlatformStickerClientModel = r8.A0R;
            r7.A0c();
            if (sharePlatformStickerClientModel.A07 != null) {
                r7.A0q("media_upload_metadata");
                AnonymousClass3QX.A00(r7, sharePlatformStickerClientModel.A07);
            }
            String str46 = sharePlatformStickerClientModel.A09;
            if (str46 != null) {
                r7.A0R("attribution_url", str46);
            }
            String str47 = sharePlatformStickerClientModel.A0A;
            if (str47 != null) {
                r7.A0R("image_path", str47);
            }
            r7.A0P("image_width", sharePlatformStickerClientModel.A03);
            r7.A0P("image_height", sharePlatformStickerClientModel.A02);
            r7.A0P("rotation", sharePlatformStickerClientModel.A04);
            r7.A0P("sticker_width", sharePlatformStickerClientModel.A06);
            r7.A0P("sticker_height", sharePlatformStickerClientModel.A05);
            r7.A0S("should_keep_on_screen", sharePlatformStickerClientModel.A0B);
            C391049sG r08 = sharePlatformStickerClientModel.A08;
            if (r08 != null) {
                r7.A0R("share_platform_type", r08.A00);
            }
            r7.A0O("start_time_ms", sharePlatformStickerClientModel.A01);
            r7.A0O("end_time_ms", sharePlatformStickerClientModel.A00);
            r7.A0Z();
        }
        if (r8.A07 != null) {
            r7.A0q("before_and_after_sticker_model");
            D01.A00(r7, r8.A07, true);
        }
        if (r8.A02 != null) {
            r7.A0q("group_mention_sticker_model");
            C45641Czr.A00(r7, r8.A02);
        }
        if (r8.A03 != null) {
            r7.A0q("music_pick_sticker_model");
            C45643Czt.A00(r7, r8.A03);
        }
        if (r8.A0N != null) {
            r7.A0q("secret_sticker_model");
            AAW.A00(r7, r8.A0N);
        }
        if (r8.A0Z != null) {
            r7.A0q("bio_product_sticker_model");
            C40602Aeq aeq = r8.A0Z;
            r7.A0c();
            String str48 = aeq.A03;
            if (str48 != null) {
                r7.A0R(DialogModule.KEY_TITLE, str48);
            }
            String str49 = aeq.A02;
            if (str49 != null) {
                r7.A0R("price", str49);
            }
            String str50 = aeq.A00;
            if (str50 != null) {
                r7.A0R("coverImagePath", str50);
            }
            String str51 = aeq.A04;
            if (str51 != null) {
                r7.A0R("variants", str51);
            }
            String str52 = aeq.A01;
            if (str52 != null) {
                r7.A0R("currency", str52);
            }
            r7.A0Z();
        }
        r7.A0Z();
    }
}
