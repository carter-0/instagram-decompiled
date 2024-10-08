package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import kotlin.Deprecated;
import org.webrtc.EglBase14Impl;

@Deprecated(message = "")
/* renamed from: X.Jb5  reason: case insensitive filesystem */
public abstract class C59882Jb5 {
    public static final void A01(UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 0);
        DbU.A1R(A00(num), userSession);
    }

    public static final 0xI A00(Integer num) {
        String A00;
        1Q9 A01 = 1Q9.A01("capture_flow");
        switch (num.intValue()) {
            case 3:
                A00 = AnonymousClass000.A00(3969);
                break;
            case 4:
                A00 = "media_upload";
                break;
            case 5:
                A00 = "filter_finished";
                break;
            case 6:
                A00 = "share_successful";
                break;
            case 7:
                A00 = "capture_flow_canceled";
                break;
            case 8:
                A00 = "drafts_dialog";
                break;
            case 9:
                A00 = "drafts_shown_in_gallery";
                break;
            case 10:
                A00 = "inline_gallery_launch";
                break;
            case 11:
                A00 = "inline_gallery_media_selected";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A00 = "inline_gallery_launch_full_creation_flow";
                break;
            case 13:
                A00 = "inline_gallery_dismiss";
                break;
            case 14:
                A00 = "click_folder_in_picker";
                break;
            case 15:
                A00 = "click_preview_media_in_picker";
                break;
            case 16:
                A00 = "crop_adjustment_gesture";
                break;
            case 17:
                A00 = "crop_media_toggle_tap";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                A00 = "select_media_in_picker";
                break;
            case 19:
                A00 = "picker_tab_opened";
                break;
            case 20:
                A00 = "photo_camera_tab_opened";
                break;
            case 21:
                A00 = "video_camera_tab_opened";
                break;
            case 22:
                A00 = "shutter_click_in_camera";
                break;
            case 23:
                A00 = "shutter_long_press_in_camera";
                break;
            case 24:
                A00 = "shutter_press_in_video";
                break;
            case 25:
                A00 = "open_photo_gallery";
                break;
            case 26:
                A00 = "picker_opened_from_photo";
                break;
            case 27:
                A00 = "built_in_camera";
                break;
            case 28:
                A00 = "share_intent_photo_import";
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                A00 = "crop_photo";
                break;
            case 30:
                A00 = "crop_finished";
                break;
            case 31:
                A00 = "photo_filter_tried";
                break;
            case 32:
                A00 = "filter_photo";
                break;
            case 33:
                A00 = "filter_photo_error";
                break;
            case 34:
                A00 = "high_quality_resize";
                break;
            case 35:
                A00 = "basic_resize_fallback";
                break;
            case 36:
                A00 = "basic_resize_preference";
                break;
            case 37:
                A00 = "built_in_video";
                break;
            case 38:
                A00 = "open_video_gallery";
                break;
            case 39:
                A00 = "picker_opened_from_video";
                break;
            case 40:
                A00 = "share_intent_video_import";
                break;
            case Seq.NULL_REFNUM:
                A00 = "video_filter_tried";
                break;
            case Seq.RefTracker.REF_OFFSET:
                A00 = "filter_video";
                break;
            case 43:
                A00 = "trim_video";
                break;
            case 44:
                A00 = "choose_video_cover";
                break;
            case 45:
                A00 = "share_button_click";
                break;
            case 46:
                A00 = "filter_drag_start";
                break;
            case 47:
                A00 = "filter_drag_place";
                break;
            case 48:
                A00 = "filter_drag_hide";
                break;
            case 49:
                A00 = "filter_visibility";
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                A00 = "filter_tray_order";
                break;
            case 51:
                A00 = "boomerang_modal_nux_displayed";
                break;
            case 52:
                A00 = "boomerang_modal_nux_launch_play_store";
                break;
            case 53:
                A00 = "boomerang_installed_from_playstore";
                break;
            case 54:
                A00 = "boomerang_modal_nux_app_switch";
                break;
            case 55:
                A00 = "boomerang_attribution_app_switch";
                break;
            case 56:
                A00 = "profile_picture_launch";
                break;
            case 57:
                A00 = AnonymousClass000.A00(1718);
                break;
            case 58:
                A00 = "edit_profile";
                break;
            case 59:
                A00 = "profile_highlights_choose_camera_roll_cover_photo";
                break;
            case 60:
                A00 = "edit_group_avatar";
                break;
            default:
                A00 = "bloks_profile_pic";
                break;
        }
        return A01.A04(A00);
    }
}
