package X;

import org.webrtc.MediaStreamTrack;

/* renamed from: X.Rdj  reason: case insensitive filesystem */
public abstract class C9605Rdj {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "image";
            case 2:
                return "image_photo";
            default:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
        }
    }
}
