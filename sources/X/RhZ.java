package X;

import java.util.ArrayList;
import org.webrtc.CameraVideoCapturer;

public abstract class RhZ {
    public static void A00(C276544tV r4) {
        C276634te r42 = r4.A01;
        if (r42 != null) {
            C276634te r0 = r42;
            ArrayList arrayList = null;
            while (true) {
                S5V AgN = r0.AgN();
                if (AgN != null) {
                    if (arrayList == null) {
                        arrayList = AnonymousClass7TE.A1C();
                    }
                    arrayList.add(AgN.A01);
                    r0 = AgN.A00;
                    if (r0 == null) {
                        break;
                    }
                } else if (arrayList == null) {
                    return;
                }
            }
            String A00 = 0LE.A00(DbT.A0z("\n", arrayList, (0sP) null), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            0qQ.A07(A00);
            0LA.A05(AnonymousClass0LO.A4h, A00);
            String BOB = r42.BOB();
            if (BOB != null) {
                0LA.A05(AnonymousClass0LO.A4g, BOB);
            }
        }
    }
}
