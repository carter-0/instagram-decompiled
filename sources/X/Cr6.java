package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;
import java.io.IOException;

public abstract class Cr6 {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cwp, java.lang.Object] */
    public static C45458Cwp parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("messageType".equals(A17)) {
                    IgVideoRealtimeEventPayload$Type fromServerValue = IgVideoRealtimeEventPayload$Type.fromServerValue(r4.A1P());
                    0qQ.A0B(fromServerValue, 0);
                    obj.A02 = fromServerValue;
                } else if ("sessionName".equals(A17)) {
                    C41846B3n.A1A(r4);
                } else if ("broadcastId".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("videoCallId".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("body".equals(A17)) {
                    obj.A01 = C44819ClV.parseFromJson(r4);
                } else if ("header".equals(A17)) {
                    obj.A00 = Cr8.parseFromJson(r4);
                }
                r4.A0z();
            }
            if (obj.A02 != null) {
                return obj;
            }
            IgVideoRealtimeEventPayload$Type igVideoRealtimeEventPayload$Type = IgVideoRealtimeEventPayload$Type.UNKNOWN;
            0qQ.A0B(igVideoRealtimeEventPayload$Type, 0);
            obj.A02 = igVideoRealtimeEventPayload$Type;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
