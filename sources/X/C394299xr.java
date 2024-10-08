package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9xr  reason: invalid class name and case insensitive filesystem */
public abstract class C394299xr {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "audio_editor_change_audio";
            case 1:
                return "clips_gallery_destination_bar";
            case 2:
                return "clips_pre_cap_audio_button";
            case 3:
                return "clips_post_cap_audio_button";
            case 4:
                return "clips_post_cap_audio_pill";
            case 5:
                return "clips_stacked_timeline_audio_button";
            case 6:
                return "clips_stacked_timeline_ghost_audio_track";
            case 7:
                return "clips_stacked_timeline_audio_replace_button";
            case 8:
                return "clips_sharesheet_replace_music";
            case 9:
                return "post_capture_audio_browse";
            case 10:
                return "post_music_button";
            case 11:
                return "post_sharesheet_music_button";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "post_edit_add_music";
            case 13:
                return "post_edit_replace_music";
            case 14:
                return "story_music_button";
            case 15:
                return "story_music_sticker";
            case 16:
                return AnonymousClass000.A00(3637);
            case 17:
                return C66579MXk.A00(367);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return AnonymousClass000.A00(2197);
            case 19:
                return AnonymousClass000.A00(901);
            default:
                return "IGNORE_search_back";
        }
    }
}
