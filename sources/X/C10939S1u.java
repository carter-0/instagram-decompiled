package X;

import java.util.HashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.S1u  reason: case insensitive filesystem */
public final class C10939S1u {
    public long A00;
    public final C13886Tj9 A01;
    public final Map A02;

    public C10939S1u(C13886Tj9 tj9, C11354SOn sOn, Map map) {
        0qQ.A0B(tj9, 3);
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A02 = A1E;
        if (map != null) {
            A1E.putAll(map);
        }
        if (!A1E.containsKey("media_type")) {
            A1E.put("media_type", MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        if (sOn != null) {
            HashMap A1E2 = AnonymousClass7TE.A1E();
            int i = sOn.A0C;
            if (i != 0) {
                A1E2.put("target_width", String.valueOf((long) i));
            }
            int i2 = sOn.A0A;
            if (i2 != 0) {
                A1E2.put("target_height", String.valueOf((long) i2));
            }
            if (sOn.A01() != 0) {
                A1E2.put("target_bit_rate", String.valueOf((long) sOn.A01()));
            }
            A1E2.put("target_rotation_angle", String.valueOf((long) sOn.A05));
            A1E.putAll(A1E2);
        }
        this.A01 = tj9;
    }

    public final void A00(Exception exc) {
        C13886Tj9 tj9 = this.A01;
        Exception exc2 = exc;
        C9596Rda.A00(tj9, exc2, "media_upload_process_failure", this.A02, C13886Tj9.A00(tj9, this.A00));
    }
}
