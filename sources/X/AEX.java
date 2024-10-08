package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.assetpicker.shareplatform.model.SharePlatformStickerClientModel;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class AEX {
    public static final Bundle A01(28D r65, 293 r66, C279584ys r67, C2801950r r68, AnonymousClass8JI r69, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, String str, String str2, String str3, String str4, String str5, String str6, List list, Set set, boolean z, boolean z2, boolean z3) {
        return A00(r65, r66, (AnonymousClass8ZN) null, (ClipsCameraCommandAction) null, (AnonymousClass84B) null, AnonymousClass8JL.NONE, r67, (ImageUrl) null, (C279284yO) null, (SharePlatformStickerClientModel) null, (ReelsVisualRepliesModel) null, r68, r69, (DirectCameraViewModel) null, musicAttributionConfig, (AudioOverlayTrack) null, (InstagramAudioApplySource) null, pendingRecipient, (PromptStickerModel) null, (QuestionResponseReshareModel) null, (Boolean) null, (Integer) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null, str4, str5, str6, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, list, (List) null, (List) null, (List) null, (List) null, set, z, false, false, false, false, false, false, false, false, false, false, z2, false, false, false, false, z3);
    }

    public static final Bundle A02(28D r75, AnonymousClass8ZN r76, C279584ys r77, C2801950r r78, AnonymousClass8JI r79, MusicAttributionConfig musicAttributionConfig, PendingRecipient pendingRecipient, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set, boolean z, boolean z2) {
        return A00(r75, (293) null, r76, (ClipsCameraCommandAction) null, (AnonymousClass84B) null, AnonymousClass8JL.NONE, r77, (ImageUrl) null, (C279284yO) null, (SharePlatformStickerClientModel) null, (ReelsVisualRepliesModel) null, r78, r79, (DirectCameraViewModel) null, musicAttributionConfig, (AudioOverlayTrack) null, (InstagramAudioApplySource) null, pendingRecipient, (PromptStickerModel) null, (QuestionResponseReshareModel) null, (Boolean) null, (Integer) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null, str4, str5, str6, (String) null, (String) null, (String) null, (String) null, str7, (String) null, (String) null, (String) null, str8, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, set, z, false, false, false, false, false, false, false, false, false, false, z2, false, false, false, false, true);
    }

    public static final Bundle A00(28D r7, 293 r8, AnonymousClass8ZN r9, ClipsCameraCommandAction clipsCameraCommandAction, AnonymousClass84B r11, AnonymousClass8JL r12, C279584ys r13, ImageUrl imageUrl, C279284yO r15, SharePlatformStickerClientModel sharePlatformStickerClientModel, ReelsVisualRepliesModel reelsVisualRepliesModel, C2801950r r18, AnonymousClass8JI r19, DirectCameraViewModel directCameraViewModel, MusicAttributionConfig musicAttributionConfig, AudioOverlayTrack audioOverlayTrack, InstagramAudioApplySource instagramAudioApplySource, PendingRecipient pendingRecipient, PromptStickerModel promptStickerModel, QuestionResponseReshareModel questionResponseReshareModel, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, List list, List list2, List list3, List list4, List list5, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        ArrayList A1D;
        ArrayList A1D2;
        ArrayList A1D3;
        List list6 = list3;
        List list7 = list2;
        List list8 = list;
        0qQ.A0B(r12, 52);
        C360908fL.A00(r7);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(23), str);
        A0a.putString("ClipsConstants.ARG_CLIPS_DRAFT_COVER_PHOTO_FILE_URI", str2);
        A0a.putString(C273654mx.A00(33), (String) null);
        A0a.putString(C273654mx.A00(471), (String) null);
        A0a.putStringArrayList(AnonymousClass000.A00(209), (ArrayList) null);
        A0a.putParcelable(AnonymousClass000.A00(888), (Parcelable) null);
        A0a.putString(C273654mx.A00(211), (String) null);
        A0a.putString("ClipsConstants.ARG_PIVOT_PAGE_SESSION_ID", str23);
        A0a.putSerializable("ClipsConstants.ARG_PIVOT_PAGE_ENTRY_POINT", r9);
        A0a.putParcelable("ARGS_TARGET_GROUP_PROFILE", pendingRecipient);
        A0a.putParcelable("ARGS_MUSIC_ATTRIBUTION_CONFIG", musicAttributionConfig);
        A0a.putString("ARGS_SONG_ISRC", str10);
        A0a.putString("ARGS_AUDIO_PLATFORM_APP_ID", str11);
        A0a.putParcelable("ARGS_AUDIO_APPLY_SOURCE", instagramAudioApplySource);
        A0a.putString("ARGS_EFFECT_ID", str3);
        A0a.putString("ARGS_EFFECT_ATTRIBUTION_USER_ID", str4);
        if (bool != null) {
            A0a.putBoolean("ARGS_EFFECT_SUPPORTED", bool.booleanValue());
        }
        A0a.putString("ARGS_EFFECT_NAME", str5);
        A0a.putString("ARGS_EFFECT_AUTHOR_NAME", str6);
        A0a.putParcelable("ARGS_EFFECT_THUMBNAIL_URL", imageUrl);
        A0a.putString("ARGS_PRELOAD_EFFECT_COLLECTION_NAME", (String) null);
        A0a.putString("ARGS_CAMERA_TOOL_NAME", str7);
        A0a.putString("ARGS_CAMERA_TOOL_ID", str8);
        A0a.putString("ARGS_AUDIO_ID", str9);
        A0a.putString("ARGS_AUDIO_OR_EFFECT_MEDIA_ID", str12);
        A0a.putString("ARGS_AUDIO_OR_EFFECT_MEDIA_RANKING_TOKEN", str13);
        A0a.putString("ARGS_SOURCE_MEDIA_USER_NAME", str17);
        A0a.putString("ARGS_SOURCE_MEDIA_ID", str18);
        A0a.putSerializable("ARGS_SUGGESTED_CAMERA_SETTINGS", r12);
        A0a.putSerializable(AnonymousClass000.A00(96), r7);
        A0a.putBoolean(AnonymousClass000.A00(407), z);
        A0a.putString("ARGS_VISUAL_SOURCE_ORIGINAL_MEDIA_ID", str14);
        A0a.putSerializable("ARGS_VISUAL_SOURCE_CREATION_STATE", r19);
        A0a.putParcelable("ARGS_REELS_VISUAL_REPLIES", reelsVisualRepliesModel);
        if (list != null) {
            boolean z18 = list8 instanceof ArrayList;
            String A00 = C273654mx.A00(32);
            if (z18) {
                A1D3 = (ArrayList) list8;
            } else {
                A1D3 = AnonymousClass7TE.A1D(list8);
            }
            A0a.putParcelableArrayList(A00, A1D3);
        }
        if (list2 != null) {
            boolean z19 = list7 instanceof ArrayList;
            String A002 = C273654mx.A00(210);
            if (z19) {
                A1D2 = (ArrayList) list7;
            } else {
                A1D2 = AnonymousClass7TE.A1D(list7);
            }
            A0a.putParcelableArrayList(A002, A1D2);
        }
        A0a.putString(AnonymousClass000.A00(424), str30);
        if (list3 != null) {
            if (list6 instanceof ArrayList) {
                A1D = (ArrayList) list6;
            } else {
                A1D = AnonymousClass7TE.A1D(list6);
            }
            A0a.putStringArrayList("ClipsConstants.ARGS_PREFILL_MEDIA_ID_LIST", A1D);
        }
        A0a.putParcelable("ARGS_PREFILL_MEDIUM_CROP_INFO", (Parcelable) null);
        A0a.putString("ARGS_LINKED_HIGHLIGHT_ID", str15);
        A0a.putString("ARGS_HIGHLIGHT_MEDIA_ID", str16);
        A0a.putString("ARGS_PRELOAD_CAPTION", str20);
        A0a.putBoolean("ARGS_HIDE_UNSAVED_DRAFT", z2);
        A0a.putBoolean("ARGS_AUTO_LOAD_UNSAVED_DRAFT", z3);
        A0a.putBoolean("ARGS_IS_EXCLUSIVE_BY_DEFAULT", z4);
        A0a.putBoolean("ARGS_IS_FAN_CLUB_PROMO_VIDEO", z5);
        A0a.putBoolean("ARGS_IS_FAN_CLUB_WELCOME_VIDEO", z6);
        A0a.putString("ARGS_SOURCE_AUDIO_TRACK", str19);
        A0a.putString("ARGS_MEDIA_PRIOR_TO_CAMERA_ID", str21);
        A0a.putString("ARGS_MEDIA_PRIOR_TO_CAMERA_RANKING_TOKEN", str22);
        A0a.putSerializable(C273654mx.A00(19), r18);
        A0a.putSerializable("ARGS_EFFECT_SOURCE", r11);
        A0a.putBoolean("ARGS_IS_LOADED_FROM_DRAFT", z7);
        if (set != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A0r.add(((C279284yO) it.next()).A02);
            }
            A0a.putStringArrayList("ARGS_ADDITIONAL_CAMERA_DESTINATION", AnonymousClass7TE.A1D(A0r));
        }
        if (r15 != null) {
            A0a.putString("ARGS_CAMERA_CONFIGURATION_DESTINATION", r15.A02);
        }
        if (num != null) {
            A0a.putInt("ARGS_CAMERA_SUB_SCREEN_DESTINATION", num.intValue());
        }
        if (r13 != null) {
            try {
                A0a.putString("ARGS_CLIPS_TEMPLATE_INFO", C67211sN.A00(r13));
            } catch (IOException unused) {
                0f9 AEf = 0wj.A01.AEf(C378609Qm.__redex_internal_original_name, 817902720);
                AEf.ABQ(DialogModule.KEY_MESSAGE, "Error setting json parameters");
                AEf.report();
            }
        }
        if (list4 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                C248883ik FDp = ((C248923io) it2.next()).FDp();
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                AnonymousClass3i0.A00(A0A, FDp);
                A0A.close();
                A1C.add(stringWriter.toString());
            }
            A0a.putStringArrayList("REUSABLE_TEXT_INFO", A1C);
        }
        if (r8 != null) {
            A0a.putSerializable("ARGS_TEMPLATE_BROWSER_ENTRY_POINT", r8);
        }
        if (promptStickerModel != null) {
            A0a.putParcelable("ARGS_CLIPS_PROMP_STICKER", promptStickerModel.A02());
        }
        SharePlatformStickerClientModel sharePlatformStickerClientModel2 = sharePlatformStickerClientModel;
        if (sharePlatformStickerClientModel != null) {
            A0a.putParcelable("ARGS_CLIPS_SHARE_PLATFORM_STICKER", sharePlatformStickerClientModel2);
        }
        QuestionResponseReshareModel questionResponseReshareModel2 = questionResponseReshareModel;
        if (questionResponseReshareModel != null) {
            A0a.putParcelable("ARGS_CLIPS_QUESTION_RESPONSE_RESHARE_STICKER", questionResponseReshareModel2);
        }
        A0a.putBoolean("ClipsConstants.ARG_SHOULD_RETAIN_AUDIO_AFTER_RESTART_CAPTURE", z8);
        A0a.putString("ARGS_APP_ATTRIBUTION_NAMESPACE", str24);
        A0a.putBoolean("ClipsConstants.ARG_CLIPS_IS_OPEN_FROM_CAMERA_GALLERY", z9);
        A0a.putBoolean(C66579MXk.A00(213), z10);
        A0a.putBoolean("ClipsConstants.ARG_SHOULD_SKIP_TO_POST_CAPTURE", z11);
        DirectCameraViewModel directCameraViewModel2 = directCameraViewModel;
        if (directCameraViewModel != null) {
            A0a.putParcelable("DIRECT_CAMERA_VIEW_MODEL", directCameraViewModel2);
        }
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        if (audioOverlayTrack != null) {
            A0a.putParcelable("ClipsConstants.ARG_CLIPS_ATTRIBUTION_ONLY_AUDIO_OVERLAY_TRACK", audioOverlayTrack2);
        }
        String str31 = str25;
        if (str25 != null) {
            A0a.putString("ARGS_DEFAULT_FOLDER_NAME", str31);
        }
        if (clipsCameraCommandAction != null) {
            A0a.putSerializable("ClipsConstants.ARGS_CLIPS_CAMERA_COMMAND_ACTION", clipsCameraCommandAction);
        }
        A0a.putBoolean("ClipsConstants.ARGS_REINITIALIZE_DRAFTS_REPOSITORY", z12);
        if (list5 != null) {
            A0a.putIntegerArrayList("ClipsConstants.ARGS_PREDEFINED_HIGHLIGHTS_START_TIME_IN_MS", AnonymousClass7TE.A1D(list5));
        }
        A0a.putBoolean("ARGS_GALLERY_FIRST_ENABLED", z13);
        A0a.putString("ARGS_GALLERY_TITLE", str26);
        A0a.putString("ARGS_GALLERY_SUBTITLE", str27);
        A0a.putString("ARGS_HIGHLIGHTED_CREATION_TOOL", str28);
        A0a.putBoolean("ARGS_HIDE_GALLERY_DESTINATION_BAR", z14);
        A0a.putBoolean("ARGS_HIDE_CAMERA_DESTINATION_PICKER", z15);
        A0a.putBoolean("ARGS_SHOW_COLLAB_EDUCATION_FLOW", z16);
        String str32 = str29;
        if (str29 != null) {
            A0a.putString("ARGS_PRELOAD_CUTOUT_STICKER_SOURCE_MEDIA_ID", str32);
        }
        A0a.putBoolean("ARGS_SHOULD_EXIT_CREATION_AFTER_CLIPS_DRAFT_EDIT", z17);
        return A0a;
    }
}
