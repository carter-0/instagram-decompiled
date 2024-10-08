package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.7oA  reason: invalid class name and case insensitive filesystem */
public abstract class C342177oA {
    public static String A00(int i) {
        switch (i) {
            case 0:
                return "marker_start_zero";
            case 1:
                return "effect_fetched";
            case 2:
                return "effect_setting_started";
            case 3:
                return "effect_setting_finished";
            case 4:
                return "effect_first_frame_started";
            case 5:
                return "effect_first_frame_finished";
            case 6:
                return "effect_first_frame_async";
            case 7:
                return "effect_deselecting_started";
            case 8:
                return "new_effect_selected";
            case 9:
                return "new_effect_selection_requested";
            case 10:
                return "low_on_memory";
            case 11:
                return "camera_connect_started";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "camera_connect_finished";
            case 13:
                return "camera_swipe_to_open_finished";
            case 14:
                return "recording_start_finished";
            case 15:
                return "recording_camera_switch";
            default:
                return "recording_stop_requested";
        }
    }
}
