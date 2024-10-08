package X;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.MediaStreamTrack;

public abstract class OPq {
    public static C376649Iu parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            1Xj r6 = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A17)) {
                    r6 = 1Xj.A00(r7);
                } else if (C41845B3m.A1A(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (r6 != null || !(r7 instanceof 0c9)) {
                return new C376649Iu(r6, str);
            }
            AnonymousClass7TF.A1L(MediaStreamTrack.VIDEO_TRACK_KIND, r7, "DirectIGTVShare");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C376649Iu r2, 17Z r3) {
        r3.A0c();
        1Xj r1 = (1Xj) r2.A00;
        if (r1 != null) {
            r3.A0q(MediaStreamTrack.VIDEO_TRACK_KIND);
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            1Xv.A07(r3, r1);
        }
        C41846B3n.A0z(r3, r2.A01);
        r3.A0Z();
    }
}
