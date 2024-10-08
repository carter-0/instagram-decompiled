package X;

import org.webrtc.MediaStreamTrack;

public abstract class OX6 {
    public static final String A01(Integer num) {
        0qQ.A0B(num, 0);
        C48806EkU ekU = C48806EkU.$redex_init_class;
        int intValue = num.intValue();
        if (intValue == 0) {
            return "chat_thread";
        }
        if (intValue == 2) {
            return "thread_details";
        }
        if (intValue != 1) {
            return "unknown";
        }
        return "full_view";
    }

    public static final String A02(Integer num) {
        0qQ.A0B(num, 0);
        C48806EkU ekU = C48806EkU.$redex_init_class;
        switch (num.intValue()) {
            case 0:
                return "audio_music";
            case 1:
                return "audio_note";
            case 2:
                return "audio_voice_message";
            case 3:
                return "ephemeral_video";
            case 4:
                return "feed_video_reshare";
            case 5:
                return "other";
            case 6:
                return "permanent_video";
            case 7:
                return AnonymousClass000.A00(1745);
            case 8:
                return "story_other";
            case 9:
                return C273654mx.A00(974);
            default:
                return "unknown";
        }
    }

    public static final String A00(1iA r1) {
        if (r1 == null) {
            return "unknown";
        }
        C48806EkU ekU = C48806EkU.$redex_init_class;
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (ordinal == 7) {
            return MediaStreamTrack.AUDIO_TRACK_KIND;
        }
        return "unknown";
    }
}
