package X;

import org.webrtc.MediaStreamTrack;

public abstract class O21 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 2:
                return "carousel";
            case 3:
                return "carousel_photo";
            case 4:
                return "carousel_video";
            case 5:
                return "reels";
            case 6:
                return "facebook_video";
            case 7:
                return "unknown";
            default:
                return "photo";
        }
    }
}
