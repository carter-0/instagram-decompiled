package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public abstract /* synthetic */ class CaJ {
    public static Map A00(DTI dti) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dti.BFv() != null) {
            A1H.put("image", dti.BFv());
        }
        1Xj CDp = dti.CDp();
        if (CDp != null) {
            A1H.put(MediaStreamTrack.VIDEO_TRACK_KIND, CDp.A1C());
        }
        return 0Yt.A0B(A1H);
    }
}
