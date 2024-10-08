package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.JbY  reason: case insensitive filesystem */
public abstract class C59909JbY {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 1:
                return "photo";
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "mix";
            case 4:
                return "text";
            case 5:
                return "animated_media";
            case 6:
                return "avatar_sticker";
            case 7:
                return "gif";
            case 8:
                return "file";
            default:
                return "spinnable_clip";
        }
    }
}
