package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.LaG  reason: case insensitive filesystem */
public final class C64341LaG implements AnonymousClass08X {
    public final /* synthetic */ ClipsSharingDraftViewModel A00;

    public C64341LaG(ClipsSharingDraftViewModel clipsSharingDraftViewModel) {
        this.A00 = clipsSharingDraftViewModel;
    }

    public final Bundle EKB() {
        C348917zG r0 = (C348917zG) this.A00.A00.A02();
        if (r0 == null) {
            return AnonymousClass7TE.A0a();
        }
        C293505kq r4 = r0.A01;
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        String str = r4.A0T;
        if (str != null) {
            A0K.A0R(C39829ABa.A00(0, 10, 18), str);
        }
        List list = r4.A0v;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(A0K, "video_segments", list);
            while (A0s.hasNext()) {
                AnonymousClass51M A0g = JTO.A0g(A0s);
                if (A0g != null) {
                    AnonymousClass51L.A00(A0K, A0g);
                }
            }
            A0K.A0Y();
        }
        JXu jXu = r4.A0G;
        if (jXu != null) {
            EnumEntries enumEntries = JXu.A00;
            A0K.A0R("draft_save_state", jXu.toString());
        }
        L6N l6n = r4.A0F;
        if (l6n != null) {
            A0K.A0q("draft_save_metadata");
            A0K.A0c();
            A0K.A0Q("last_save_time", l6n.A01);
            A0K.A0Q("last_user_save_time", l6n.A02);
            A0K.A0Q("last_precapture_save_time", l6n.A00);
            A0K.A0Z();
        }
        C2801950r r02 = r4.A0H;
        if (r02 != null) {
            A0K.A0R("clips_creation_type", r02.A00);
        }
        String str2 = r4.A0S;
        if (str2 != null) {
            A0K.A0R("caption", str2);
        }
        A0K.A0S("is_share_to_feed", r4.A17);
        String str3 = r4.A0i;
        if (str3 != null) {
            A0K.A0R(AnonymousClass000.A00(1673), str3);
        }
        C370018vh r1 = r4.A0C;
        if (r1 != null) {
            A0K.A0q("post_capture_edits");
            C370008vg.A00(A0K, r1);
        }
        List list2 = r4.A0s;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(A0K, "sticker_list", list2);
            while (A0s2.hasNext()) {
                X5I x5i = (X5I) A0s2.next();
                if (x5i != null) {
                    W3F.A05(A0K, x5i);
                }
            }
            A0K.A0Y();
        }
        List list3 = r4.A0u;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(A0K, "unschematized_compositions", list3);
            while (A0s3.hasNext()) {
                Jv8 jv8 = (Jv8) A0s3.next();
                if (jv8 != null) {
                    C59706JUo.A00(A0K, jv8);
                }
            }
            A0K.A0Y();
        }
        JYL jyl = r4.A0P;
        if (jyl != null) {
            A0K.A0P("media_type", jyl.A00);
        }
        ShareMediaLoggingInfo shareMediaLoggingInfo = r4.A0B;
        if (shareMediaLoggingInfo != null) {
            A0K.A0q("logging_info");
            C63999LHz.A00(A0K, shareMediaLoggingInfo);
        }
        AudioOverlayTrack audioOverlayTrack = r4.A0N;
        if (audioOverlayTrack != null) {
            A0K.A0q("audio_overlay_track");
            C59707JUp.A00(A0K, audioOverlayTrack);
        }
        AudioOverlayTrack audioOverlayTrack2 = r4.A0M;
        if (audioOverlayTrack2 != null) {
            A0K.A0q("attribution_only_audio_overlay_track");
            C59707JUp.A00(A0K, audioOverlayTrack2);
        }
        AnonymousClass9P8 r12 = r4.A0E;
        if (r12 != null) {
            A0K.A0q("remix_model");
            AnonymousClass9P7.A00(A0K, r12);
        }
        String str4 = r4.A0h;
        if (str4 != null) {
            A0K.A0R("original_destination_type", str4);
        }
        String str5 = r4.A0V;
        if (str5 != null) {
            A0K.A0R("cover_photo_path", str5);
        }
        MediaCroppingCoordinates mediaCroppingCoordinates = r4.A06;
        if (mediaCroppingCoordinates != null) {
            A0K.A0q("crop_coordinates");
            1qm.A01(A0K, mediaCroppingCoordinates);
        }
        String str6 = r4.A0X;
        if (str6 != null) {
            A0K.A0R("funded_content_deal_id", str6);
        }
        List list4 = r4.A0q;
        if (list4 != null) {
            Iterator A0s4 = C41845B3m.A0s(A0K, "people_tags", list4);
            while (A0s4.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) A0s4.next();
                if (peopleTag != null) {
                    LJJ.A00(A0K, peopleTag);
                }
            }
            A0K.A0Y();
        }
        C272024jy r13 = r4.A0O;
        if (r13 != null) {
            A0K.A0q("comment_poll");
            C271984ju.A00(A0K, r13, true);
        }
        AnonymousClass3QO r03 = r4.A0K;
        if (r03 != null) {
            A0K.A0R("audience", r03.A00);
        }
        LocationDict locationDict = r4.A0L;
        if (locationDict != null) {
            A0K.A0q("location");
            AnonymousClass41Q.A00(A0K, locationDict);
        }
        List list5 = r4.A0o;
        if (list5 != null) {
            Iterator A0s5 = C41845B3m.A0s(A0K, "interest_topics", list5);
            while (A0s5.hasNext()) {
                C41846B3n.A18(A0K, A0s5);
            }
            A0K.A0Y();
        }
        String str7 = r4.A0U;
        if (str7 != null) {
            A0K.A0R("collaborator_id", str7);
        }
        List list6 = r4.A0n;
        if (list6 != null) {
            Iterator A0s6 = C41845B3m.A0s(A0K, "collaborator_ids", list6);
            while (A0s6.hasNext()) {
                C41846B3n.A18(A0K, A0s6);
            }
            A0K.A0Y();
        }
        String str8 = r4.A0W;
        if (str8 != null) {
            A0K.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str8);
        }
        String str9 = r4.A0g;
        if (str9 != null) {
            A0K.A0R("original_audio_title", str9);
        }
        List list7 = r4.A0p;
        if (list7 != null) {
            Iterator A0s7 = C41845B3m.A0s(A0K, "multiple_audio_tracks", list7);
            while (A0s7.hasNext()) {
                AudioOverlayTrack audioOverlayTrack3 = (AudioOverlayTrack) A0s7.next();
                if (audioOverlayTrack3 != null) {
                    C59707JUp.A00(A0K, audioOverlayTrack3);
                }
            }
            A0K.A0Y();
        }
        List list8 = r4.A0l;
        if (list8 != null) {
            Iterator A0s8 = C41845B3m.A0s(A0K, "clips_sound_effects", list8);
            while (A0s8.hasNext()) {
                C381669c8 r04 = (C381669c8) A0s8.next();
                if (r04 != null) {
                    C39811AAi.A00(A0K, r04);
                }
            }
            A0K.A0Y();
        }
        C279584ys r14 = r4.A08;
        if (r14 != null) {
            A0K.A0q("clips_template_info");
            C67211sN.A01(A0K, r14);
        }
        A0K.A0S("template_disabled", r4.A19);
        List list9 = r4.A0k;
        if (list9 != null) {
            Iterator A0s9 = C41845B3m.A0s(A0K, "clips_multiple_audio_segments", list9);
            while (A0s9.hasNext()) {
                C41846B3n.A18(A0K, A0s9);
            }
            A0K.A0Y();
        }
        List list10 = r4.A0j;
        if (list10 != null) {
            Iterator A0s10 = C41845B3m.A0s(A0K, "audio_effects", list10);
            while (A0s10.hasNext()) {
                if (A0s10.next() != null) {
                    A0K.A0c();
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        UpcomingEventImpl upcomingEventImpl = r4.A0Q;
        if (upcomingEventImpl != null) {
            A0K.A0q("upcoming_event");
            C45712D2l.A00(A0K, upcomingEventImpl);
        }
        String str10 = r4.A0b;
        if (str10 != null) {
            A0K.A0R("media_id", str10);
        }
        CropInfo cropInfo = r4.A0A;
        if (cropInfo != null) {
            A0K.A0q("video_crop_info");
            AnonymousClass9SO.A00(A0K, cropInfo);
        }
        C63815L7w l7w = r4.A0D;
        if (l7w != null) {
            A0K.A0q("branded_content_tags_model");
            LID.A00(A0K, l7w);
        }
        C61062Jw0 jw0 = r4.A04;
        if (jw0 != null) {
            A0K.A0q("clips_shopping_metadata");
            C45890D9t.A01(jw0, A0K);
        }
        LFS lfs = r4.A09;
        if (lfs != null) {
            A0K.A0q("facebook_cross_posting_model");
            A0K.A0c();
            A0K.A0S("enabled", lfs.A05);
            A0K.A0S("is_account_linked", lfs.A06);
            String str11 = lfs.A01;
            if (str11 != null) {
                A0K.A0R("account_id", str11);
            }
            String str12 = lfs.A03;
            if (str12 != null) {
                A0K.A0R("posting_type", str12);
            }
            String str13 = lfs.A02;
            if (str13 != null) {
                A0K.A0R("page_name", str13);
            }
            A0K.A0S("reels_share_to_facebook", lfs.A08);
            String str14 = lfs.A04;
            if (str14 != null) {
                A0K.A0R("reels_destination_id", str14);
            }
            Integer num = lfs.A00;
            if (num != null) {
                A0K.A0R("reels_cross_app_share_type", C63425Kwl.A00(num));
            }
            A0K.A0S("reels_cross_app_share_fb_validation_check_bypass", lfs.A07);
            A0K.A0Z();
        }
        List list11 = r4.A0t;
        if (list11 != null) {
            Iterator A0s11 = C41845B3m.A0s(A0K, "target_profiles", list11);
            while (A0s11.hasNext()) {
                PendingRecipient pendingRecipient = (PendingRecipient) A0s11.next();
                if (pendingRecipient != null) {
                    C330927Ou.A00(A0K, pendingRecipient);
                }
            }
            A0K.A0Y();
        }
        A0K.A0S("is_draft_for_posted_clip", r4.A12);
        A0K.A0S("is_vcr_sticker_added", r4.A18);
        String str15 = r4.A0a;
        if (str15 != null) {
            A0K.A0R("linked_highlight_id", str15);
        }
        String str16 = r4.A0Z;
        if (str16 != null) {
            A0K.A0R("highlight_media_id", str16);
        }
        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = r4.A0R;
        if (existingStandaloneFundraiserForFeedModel != null) {
            A0K.A0q("existing_fundraiser_to_attach");
            LKQ.A00(A0K, existingStandaloneFundraiserForFeedModel);
        }
        String str17 = r4.A0Y;
        if (str17 != null) {
            A0K.A0R("fundraiser_user_id", str17);
        }
        NewFundraiserInfo newFundraiserInfo = r4.A0J;
        if (newFundraiserInfo != null) {
            A0K.A0q("new_fundraiser_model");
            C64130LPe.A01(A0K, newFundraiserInfo);
        }
        A0K.A0S("is_comment_disabled", r4.A11);
        A0K.A0S("is_caption_disabled", r4.A0z);
        A0K.A0S("is_like_and_view_counts_disabled", r4.A14);
        A0K.A0S("is_share_count_disabled", r4.A16);
        A0K.A0S("is_gifting_enabled", r4.A13);
        List list12 = r4.A0r;
        if (list12 != null) {
            Iterator A0s12 = C41845B3m.A0s(A0K, "stacked_timeline_actions", list12);
            while (A0s12.hasNext()) {
                C61015JvF jvF = (C61015JvF) A0s12.next();
                if (jvF != null) {
                    LIP.A00(A0K, jvF);
                }
            }
            A0K.A0Y();
        }
        String str18 = r4.A0f;
        if (str18 != null) {
            A0K.A0R("org_cta_type", str18);
        }
        A0K.A0P("max_duration_in_ms", r4.A00);
        A0K.A0Q("created_at_time", r4.A01);
        A0K.A0S("hide_from_profile_grid", r4.A0y);
        A0K.A0S(C273654mx.A00(671), r4.A0w);
        String str19 = r4.A0d;
        if (str19 != null) {
            A0K.A0R("meta_verified_added_link", str19);
        }
        String str20 = r4.A0c;
        if (str20 != null) {
            A0K.A0R("metagallery_media_id", str20);
        }
        String str21 = r4.A0e;
        if (str21 != null) {
            A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str21);
        }
        List list13 = r4.A0m;
        if (list13 != null) {
            Iterator A0s13 = C41845B3m.A0s(A0K, "clips_spin_swappable_text_list", list13);
            while (A0s13.hasNext()) {
                BEE bee = (BEE) A0s13.next();
                if (bee != null) {
                    C45524Cxy.A00(A0K, bee);
                }
            }
            A0K.A0Y();
        }
        C61000Juw juw = r4.A0I;
        if (juw != null) {
            A0K.A0q("bio_product");
            LPS.A01(A0K, juw);
        }
        C61066Jw4 jw4 = r4.A03;
        if (jw4 != null) {
            A0K.A0q(AnonymousClass000.A00(2674));
            LHn.A00(jw4, A0K);
        }
        C61080JwI jwI = r4.A02;
        if (jwI != null) {
            A0K.A0q("trial_params");
            C45664D0o.A00(jwI, A0K);
        }
        C61100JxB jxB = r4.A05;
        if (jxB != null) {
            A0K.A0q("content_scheduling_metadata");
            C63980LGx.A00(A0K, jxB);
        }
        A0K.A0S("has_comment_prompt", r4.A0x);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = r4.A07;
        if (mediaGenAIDetectionMethod != null) {
            A0K.A0R("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        A0K.A0S("is_pinned", r4.A15);
        A0K.A0S("is_closed_captions_toggle_enabled", r4.A10);
        A0K.A0S("third_party_downloads_enabled", r4.A1A);
        return DbY.A0B("key_serialized_draft", AnonymousClass7TG.A0k(A0K, A0v));
    }
}
