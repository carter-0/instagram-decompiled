package X;

import com.instagram.api.schemas.ClipsTrendType;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.CrS  reason: case insensitive filesystem */
public abstract class C45165CrS {
    public static C45368CvA parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45368CvA cvA = new C45368CvA();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                String str = null;
                if ("trend_id".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("trend_type".equals(A17)) {
                    if (r4.A11() != 16L.A0G) {
                        str = r4.A1P();
                    }
                    ClipsTrendType.A01.get(str);
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A17)) {
                    cvA.A01 = C45162CrP.parseFromJson(r4);
                } else if (AnonymousClass000.A00(2944).equals(A17)) {
                    cvA.A02 = C45166CrT.parseFromJson(r4);
                } else if ("hashtag".equals(A17)) {
                    cvA.A00 = C279594yt.parseFromJson(r4);
                }
                r4.A0z();
            }
            return cvA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
