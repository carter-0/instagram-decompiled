package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import org.webrtc.EglBase14Impl;

/* renamed from: X.2Z6  reason: invalid class name */
public abstract class AnonymousClass2Z6 {
    public static String A00(2Z1 r1) {
        switch (r1.ordinal()) {
            case 3:
                return "manifest_misaligned";
            case 10:
                return "player_warning";
            case 16:
                return "prefetch_canceled";
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
            case 22:
                return "live_video_segment_download";
            case 19:
                return "live_video_frame_displayed";
            case 24:
                return "live_video_custom_live_trace";
            case 28:
                return "prefetch_task_queue_start";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return "prefetch_task_queue_exit";
            case 30:
                return "prefetch_task_queue_complete";
            case 35:
                return "prefetch_task_data_fetch_issued";
            case 36:
                return "prefetch_task_data_fetch_completed";
            case 37:
                return "vod_vps_first_data_segment_cache_check_start";
            case 38:
                return "vod_vps_first_data_segment_cache_check_end";
            case 39:
                return "prefetch_task_cache_check";
            case 40:
                return "prefetch_task_queue_inserted";
            default:
                return null;
        }
    }
}
