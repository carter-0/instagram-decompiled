package X;

import android.database.Cursor;
import android.graphics.RectF;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.4IV  reason: invalid class name */
public final class AnonymousClass4IV implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ 2NU A01;

    public AnonymousClass4IV(1WY r1, 2NU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1WY r184;
        Cursor query;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        AnonymousClass3QO r126;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        C357588Yu r119;
        String str22;
        C388649oA r121;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        C381689cA r109;
        LMS lms;
        C381639c5 r5;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        2NU r14 = this.A01;
        C251983oI r185 = r14.A02;
        r185.beginTransaction();
        try {
            1WY r0 = this.A00;
            r184 = r0;
            query = r185.query((AnonymousClass1WA) r0, (CancellationSignal) null);
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, "clips_creation_type");
            int A014 = 1Wd.A01(query, "last_user_save_time");
            int A015 = 1Wd.A01(query, "last_save_time");
            int A016 = 1Wd.A01(query, "created_at_time");
            int A017 = 1Wd.A01(query, "last_pre_capture_save_time");
            int A018 = 1Wd.A01(query, "was_last_save_user_initiated");
            int A019 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            int A0110 = 1Wd.A01(query, "video_segments");
            int A0111 = 1Wd.A01(query, "retake_video_segments");
            int A0112 = 1Wd.A01(query, "audio_Track");
            int A0113 = 1Wd.A01(query, "attriubtion_only_audio_track");
            int A0114 = 1Wd.A01(query, "pending_media_key");
            int A0115 = 1Wd.A01(query, "post_capture_media_edits");
            int A0116 = 1Wd.A01(query, "logging_info");
            int A0117 = 1Wd.A01(query, "remix_info");
            int A0118 = 1Wd.A01(query, "original_destination_type");
            int A0119 = 1Wd.A01(query, "caption");
            int A0120 = 1Wd.A01(query, "cover_photo_file_uri");
            int A0121 = 1Wd.A01(query, "is_share_to_feed");
            int A0122 = 1Wd.A01(query, "funded_content_deal_id");
            int A0123 = 1Wd.A01(query, "people_tags");
            int A0124 = 1Wd.A01(query, "comment_poll");
            int A0125 = 1Wd.A01(query, "audience");
            int A0126 = 1Wd.A01(query, "collaborator_id");
            int A0127 = 1Wd.A01(query, "collaborator_ids");
            int A0128 = 1Wd.A01(query, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int A0129 = 1Wd.A01(query, "location");
            int A0130 = 1Wd.A01(query, "original_audio_title");
            int A0131 = 1Wd.A01(query, "multiple_audio_tracks");
            int A0132 = 1Wd.A01(query, "clips_sound_effects");
            int A0133 = 1Wd.A01(query, "clips_template_info");
            int A0134 = 1Wd.A01(query, "template_disabled");
            int A0135 = 1Wd.A01(query, "clips_multiple_audio_segments");
            int A0136 = 1Wd.A01(query, "upcoming_event");
            int A0137 = 1Wd.A01(query, "linked_highlight_id");
            int A0138 = 1Wd.A01(query, "highlight_media_id");
            int A0139 = 1Wd.A01(query, "media_id");
            int A0140 = 1Wd.A01(query, "voice_effect");
            int A0141 = 1Wd.A01(query, "audio_enhancement_effect");
            int A0142 = 1Wd.A01(query, "clips_draft_info_version");
            int A0143 = 1Wd.A01(query, "has_published_clip");
            int A0144 = 1Wd.A01(query, "branded_content_tags_model");
            int A0145 = 1Wd.A01(query, "clips_shopping_metadata");
            int A0146 = 1Wd.A01(query, "is_comment_disabled");
            int A0147 = 1Wd.A01(query, "is_caption_enabled");
            int A0148 = 1Wd.A01(query, "is_like_and_view_counts_disabled");
            int A0149 = 1Wd.A01(query, "is_share_count_disabled");
            int A0150 = 1Wd.A01(query, "is_gifts_allowed");
            int A0151 = 1Wd.A01(query, "interest_topics");
            int A0152 = 1Wd.A01(query, "stacked_timeline_actions");
            int A0153 = 1Wd.A01(query, "org_cta_type");
            int A0154 = 1Wd.A01(query, "max_duration_in_ms");
            int A0155 = 1Wd.A01(query, "hide_from_profile_grid");
            int A0156 = 1Wd.A01(query, "meta_verified_added_link");
            int A0157 = 1Wd.A01(query, "metagallery_media_id");
            int A0158 = 1Wd.A01(query, "bio_product");
            int A0159 = 1Wd.A01(query, "content_scheduling_metadata");
            int A0160 = 1Wd.A01(query, "trial_params");
            int A0161 = 1Wd.A01(query, "has_comment_prompt");
            int A0162 = 1Wd.A01(query, "gen_ai_detection_method");
            int A0163 = 1Wd.A01(query, "is_pinned");
            int A0164 = 1Wd.A01(query, "third_party_downloads_enabled");
            int A0165 = 1Wd.A01(query, "cropcords_cropLeft");
            int A0166 = 1Wd.A01(query, "cropcords_cropTop");
            int A0167 = 1Wd.A01(query, "cropcords_cropRight");
            int A0168 = 1Wd.A01(query, "cropcords_cropBottom");
            int A0169 = 1Wd.A01(query, "feedmetadata_title");
            int A0170 = 1Wd.A01(query, "feedmetadata_previewCropCoordinates");
            int A0171 = 1Wd.A01(query, "feedmetadata_isInternal");
            int A0172 = 1Wd.A01(query, "feedmetadata_shareToFacebook");
            int A0173 = 1Wd.A01(query, "feedmetadata_seriesId");
            int A0174 = 1Wd.A01(query, "feedmetadata_shoppingMetadata");
            int A0175 = 1Wd.A01(query, "feedmetadata_isUnifiedvideo");
            int A0176 = 1Wd.A01(query, "feedmetadata_coverIsCustom");
            int A0177 = 1Wd.A01(query, "feedmetadata_coverWidth");
            int A0178 = 1Wd.A01(query, "feedmetadata_coverHeight");
            int A0179 = 1Wd.A01(query, "feedmetadata_coverFromVideoTimeMs");
            int A0180 = 1Wd.A01(query, "feedmetadata_coverIsFromVideoEdited");
            int A0181 = 1Wd.A01(query, "feedmetadata_areCaptionsEnabled");
            int A0182 = 1Wd.A01(query, "feedmetadata_areCommentsDisabled");
            int A0183 = 1Wd.A01(query, "feedmetadata_isFundedContentDeal");
            int A0184 = 1Wd.A01(query, "feedmetadata_isPaidPartnership");
            int A0185 = 1Wd.A01(query, "feedmetadata_brandedContentTags");
            int A0186 = 1Wd.A01(query, "feedmetadata_partnerBoostEnabled");
            int A0187 = 1Wd.A01(query, "feedmetadata_isLikeAndViewCountsDisabled");
            int A0188 = 1Wd.A01(query, "feedmetadata_filterId");
            int A0189 = 1Wd.A01(query, "feedmetadata_filterStrength");
            int A0190 = 1Wd.A01(query, "feedmetadata_postCropAspectRatio");
            int A0191 = 1Wd.A01(query, "feedmetadata_isLandscape");
            int A0192 = 1Wd.A01(query, "videocrop_width");
            int A0193 = 1Wd.A01(query, "videocrop_height");
            int A0194 = 1Wd.A01(query, "videocrop_rectF");
            int A0195 = 1Wd.A01(query, "mediadraft_version");
            int A0196 = 1Wd.A01(query, "mediadraft_stickers");
            int A0197 = 1Wd.A01(query, "mediadraft_unschematized_compositions");
            int A0198 = 1Wd.A01(query, "mediadraft_media_type");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(A012);
                C2801950r A002 = JUQ.A00(query.getString(A013));
                long j = query.getLong(A014);
                long j2 = query.getLong(A015);
                long j3 = query.getLong(A016);
                long j4 = query.getLong(A017);
                boolean z = false;
                if (query.getInt(A018) != 0) {
                    z = true;
                }
                if (query.isNull(A019)) {
                    str = null;
                } else {
                    str = query.getString(A019);
                }
                List A003 = JUP.A00(query.getString(A0110));
                if (query.isNull(A0111)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A0111);
                }
                List A004 = JUP.A00(str2);
                if (query.isNull(A0112)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A0112);
                }
                AudioOverlayTrack A005 = 2NV.A00(str3);
                if (query.isNull(A0113)) {
                    str4 = null;
                } else {
                    str4 = query.getString(A0113);
                }
                AudioOverlayTrack A006 = 2NV.A00(str4);
                if (query.isNull(A0114)) {
                    str5 = null;
                } else {
                    str5 = query.getString(A0114);
                }
                if (query.isNull(A0115)) {
                    str6 = null;
                } else {
                    str6 = query.getString(A0115);
                }
                C370018vh A007 = AnonymousClass9OZ.A00(str6);
                if (query.isNull(A0116)) {
                    str7 = null;
                } else {
                    str7 = query.getString(A0116);
                }
                ShareMediaLoggingInfo A008 = JUS.A00(str7);
                if (query.isNull(A0117)) {
                    str8 = null;
                } else {
                    str8 = query.getString(A0117);
                }
                AnonymousClass9P8 A009 = JUR.A00(str8);
                if (!query.isNull(A0118)) {
                    query.getString(A0118);
                }
                String string2 = query.getString(A0119);
                if (query.isNull(A0120)) {
                    str9 = null;
                } else {
                    str9 = query.getString(A0120);
                }
                boolean z2 = false;
                if (query.getInt(A0121) != 0) {
                    z2 = true;
                }
                if (query.isNull(A0122)) {
                    str10 = null;
                } else {
                    str10 = query.getString(A0122);
                }
                List A0010 = C59698JUf.A00(query.getString(A0123));
                if (query.isNull(A0124)) {
                    str11 = null;
                } else {
                    str11 = query.getString(A0124);
                }
                C272024jy A0011 = C59697JUe.A00(str11);
                if (query.isNull(A0125)) {
                    r126 = null;
                } else {
                    r126 = 2NU.A00(query.getString(A0125));
                }
                if (query.isNull(A0126)) {
                    str12 = null;
                } else {
                    str12 = query.getString(A0126);
                }
                List A0199 = JUT.A01(query.getString(A0127));
                if (query.isNull(A0128)) {
                    str13 = null;
                } else {
                    str13 = query.getString(A0128);
                }
                if (query.isNull(A0129)) {
                    str14 = null;
                } else {
                    str14 = query.getString(A0129);
                }
                Venue A0012 = C59699JUg.A00(str14);
                if (query.isNull(A0130)) {
                    str15 = null;
                } else {
                    str15 = query.getString(A0130);
                }
                List A01100 = r14.A0A.A01(query.getString(A0131));
                List A0013 = r14.A0B.A00(query.getString(A0132));
                if (query.isNull(A0133)) {
                    str16 = null;
                } else {
                    str16 = query.getString(A0133);
                }
                C279584ys A0014 = JUW.A00(str16);
                boolean z3 = false;
                if (query.getInt(A0134) != 0) {
                    z3 = true;
                }
                List A01101 = JUT.A01(query.getString(A0135));
                if (query.isNull(A0136)) {
                    str17 = null;
                } else {
                    str17 = query.getString(A0136);
                }
                UpcomingEventImpl A0015 = JUV.A00(str17);
                if (query.isNull(A0137)) {
                    str18 = null;
                } else {
                    str18 = query.getString(A0137);
                }
                if (query.isNull(A0138)) {
                    str19 = null;
                } else {
                    str19 = query.getString(A0138);
                }
                if (query.isNull(A0139)) {
                    str20 = null;
                } else {
                    str20 = query.getString(A0139);
                }
                if (query.isNull(A0140)) {
                    str21 = null;
                } else {
                    str21 = query.getString(A0140);
                }
                if (str21 != null) {
                    try {
                        r119 = C357588Yu.valueOf(str21);
                    } catch (IllegalArgumentException unused) {
                        r119 = null;
                    }
                } else {
                    r119 = null;
                }
                if (query.isNull(A0141)) {
                    str22 = null;
                } else {
                    str22 = query.getString(A0141);
                }
                if (str22 != null) {
                    try {
                        r121 = C394889yr.parseFromJson(16P.A00(str22));
                    } catch (IllegalArgumentException unused2) {
                        r121 = null;
                    }
                } else {
                    r121 = null;
                }
                if (!query.isNull(A0142)) {
                    query.getInt(A0142);
                }
                boolean z4 = false;
                if (query.getInt(A0143) != 0) {
                    z4 = true;
                }
                if (query.isNull(A0144)) {
                    str23 = null;
                } else {
                    str23 = query.getString(A0144);
                }
                C63815L7w A0016 = JUY.A00(str23);
                if (query.isNull(A0145)) {
                    str24 = null;
                } else {
                    str24 = query.getString(A0145);
                }
                C61062Jw0 A0017 = JUX.A00(str24);
                boolean z5 = false;
                if (query.getInt(A0146) != 0) {
                    z5 = true;
                }
                boolean z6 = false;
                if (query.getInt(A0147) != 0) {
                    z6 = true;
                }
                boolean z7 = false;
                if (query.getInt(A0148) != 0) {
                    z7 = true;
                }
                boolean z8 = false;
                if (query.getInt(A0149) != 0) {
                    z8 = true;
                }
                boolean z9 = false;
                if (query.getInt(A0150) != 0) {
                    z9 = true;
                }
                List A01102 = JUT.A01(query.getString(A0151));
                List A0018 = JUU.A00(query.getString(A0152));
                if (query.isNull(A0153)) {
                    str25 = null;
                } else {
                    str25 = query.getString(A0153);
                }
                int i = query.getInt(A0154);
                boolean z10 = false;
                if (query.getInt(A0155) != 0) {
                    z10 = true;
                }
                if (query.isNull(A0156)) {
                    str26 = null;
                } else {
                    str26 = query.getString(A0156);
                }
                if (query.isNull(A0157)) {
                    str27 = null;
                } else {
                    str27 = query.getString(A0157);
                }
                if (query.isNull(A0158)) {
                    str28 = null;
                } else {
                    str28 = query.getString(A0158);
                }
                C61000Juw A0019 = JUZ.A00(str28);
                if (query.isNull(A0159)) {
                    str29 = null;
                } else {
                    str29 = query.getString(A0159);
                }
                C61100JxB A0020 = C59694JUb.A00(str29);
                if (query.isNull(A0160)) {
                    str30 = null;
                } else {
                    str30 = query.getString(A0160);
                }
                C61080JwI A0021 = C59693JUa.A00(str30);
                boolean z11 = false;
                if (query.getInt(A0161) != 0) {
                    z11 = true;
                }
                if (query.isNull(A0162)) {
                    str31 = null;
                } else {
                    str31 = query.getString(A0162);
                }
                if (str31 == null) {
                    mediaGenAIDetectionMethod = null;
                } else {
                    mediaGenAIDetectionMethod = C252913pu.A00(str31);
                }
                boolean z12 = false;
                if (query.getInt(A0163) != 0) {
                    z12 = true;
                }
                boolean z13 = false;
                if (query.getInt(A0164) != 0) {
                    z13 = true;
                }
                if (!query.isNull(A0165) || !query.isNull(A0166) || !query.isNull(A0167) || !query.isNull(A0168)) {
                    r109 = new C381689cA(2, query.getFloat(A0165), query.getFloat(A0166), query.getFloat(A0167), query.getFloat(A0168));
                } else {
                    r109 = null;
                }
                if (!query.isNull(A0169) || !query.isNull(A0170) || !query.isNull(A0171) || !query.isNull(A0172) || !query.isNull(A0173) || !query.isNull(A0174) || !query.isNull(A0175) || !query.isNull(A0176) || !query.isNull(A0177) || !query.isNull(A0178) || !query.isNull(A0179) || !query.isNull(A0180) || !query.isNull(A0181) || !query.isNull(A0182) || !query.isNull(A0183) || !query.isNull(A0184) || !query.isNull(A0185) || !query.isNull(A0186) || !query.isNull(A0187) || !query.isNull(A0188) || !query.isNull(A0189) || !query.isNull(A0190) || !query.isNull(A0191)) {
                    String string3 = query.getString(A0169);
                    if (query.isNull(A0170)) {
                        str34 = null;
                    } else {
                        str34 = query.getString(A0170);
                    }
                    RectF A0022 = LPY.A00(str34);
                    query.getInt(A0171);
                    query.getInt(A0172);
                    if (!query.isNull(A0173)) {
                        query.getString(A0173);
                    }
                    if (query.isNull(A0174)) {
                        str35 = null;
                    } else {
                        str35 = query.getString(A0174);
                    }
                    IGTVShoppingMetadata A0023 = LJ7.A00(str35);
                    query.getInt(A0175);
                    query.getInt(A0176);
                    query.getInt(A0177);
                    query.getInt(A0178);
                    query.getInt(A0179);
                    query.getInt(A0180);
                    query.getInt(A0181);
                    query.getInt(A0182);
                    query.getInt(A0183);
                    query.getInt(A0184);
                    if (query.isNull(A0185)) {
                        str36 = null;
                    } else {
                        str36 = query.getString(A0185);
                    }
                    IGTVBrandedContentTags A0024 = LPZ.A00(str36);
                    query.getInt(A0186);
                    query.getInt(A0187);
                    query.getInt(A0188);
                    query.getInt(A0189);
                    query.getFloat(A0190);
                    query.getInt(A0191);
                    lms = new LMS(A0022, A0024, A0023, string3);
                } else {
                    lms = null;
                }
                if (!query.isNull(A0192) || !query.isNull(A0193) || !query.isNull(A0194)) {
                    int i2 = query.getInt(A0192);
                    int i3 = query.getInt(A0193);
                    if (query.isNull(A0194)) {
                        str33 = null;
                    } else {
                        str33 = query.getString(A0194);
                    }
                    RectF A0025 = JUT.A00(str33);
                    if (A0025 != null) {
                        r5 = new C381639c5(A0025, i2, i3);
                    } else {
                        throw new IllegalStateException(C273654mx.A00(483));
                    }
                } else {
                    r5 = null;
                }
                int i4 = query.getInt(A0195);
                if (query.isNull(A0196)) {
                    str32 = null;
                } else {
                    str32 = query.getString(A0196);
                }
                List A01103 = C59695JUc.A01(str32);
                List A0026 = C59705JUn.A00(query.getString(A0197));
                JYL jyl = (JYL) JYL.A01.get(Integer.valueOf(query.getInt(A0198)));
                if (jyl == null) {
                    jyl = JYL.VIDEO;
                }
                arrayList.add(new AnonymousClass9OY(r109, A0021, A0017, A0020, mediaGenAIDetectionMethod, A0014, A008, A007, A0016, A009, r119, A002, r121, A0019, lms, new C377999Ob(jyl, A01103, A0026, i4), r5, r126, A0012, A005, A006, A0011, A0015, string, str, str5, string2, str9, str10, str12, str13, str15, str18, str19, str20, str25, str26, str27, A003, A004, A0010, A0199, A01100, A0013, A01101, A01102, A0018, i, j, j2, j3, j4, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13));
            }
            r185.setTransactionSuccessful();
            query.close();
            r184.A00();
            r185.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            r185.endTransaction();
            throw th;
        }
    }
}
