package X;

import org.webrtc.MediaStreamTrack;

public abstract class LJI {
    public static String A01(1iA r2) {
        if (r2 == 1iA.A0Q) {
            return "photo";
        }
        if (r2 == 1iA.A0a) {
            return MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        if (r2 == 1iA.A09) {
            return "album";
        }
        if (r2 == 1iA.A06) {
            return "animated_media";
        }
        if (r2 == 1iA.A08) {
            return "avatar_sticker";
        }
        if (r2 == 1iA.A0E) {
            return "file";
        }
        throw AnonymousClass7TE.A15(002.A0R(AnonymousClass000.A00(483), r2.toString()));
    }

    public static 1iA A00(16F r1) {
        String A1P = r1.A1P();
        if ("photo".equals(A1P)) {
            return 1iA.A0Q;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A1P)) {
            return 1iA.A0a;
        }
        if ("album".equals(A1P)) {
            return 1iA.A09;
        }
        if ("avatar_sticker".equals(A1P)) {
            return 1iA.A08;
        }
        if ("file".equals(A1P)) {
            return 1iA.A0E;
        }
        throw AnonymousClass7TE.A15(002.A0R(AnonymousClass000.A00(483), A1P));
    }
}
