package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.8nw  reason: invalid class name and case insensitive filesystem */
public abstract class C365948nw {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "photo";
            case 1:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            default:
                return "photo_and_video";
        }
    }
}
