package X;

import com.instagram.video.common.events.IgVideoRealtimeEventPayload$Type;

/* renamed from: X.Cwp  reason: case insensitive filesystem */
public final class C45458Cwp {
    public ULZ A00;
    public C45383CvP A01;
    public IgVideoRealtimeEventPayload$Type A02;
    public String A03;
    public String A04;

    public final IgVideoRealtimeEventPayload$Type A00() {
        IgVideoRealtimeEventPayload$Type igVideoRealtimeEventPayload$Type = this.A02;
        if (igVideoRealtimeEventPayload$Type != null) {
            return igVideoRealtimeEventPayload$Type;
        }
        0qQ.A0F("messageType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String toString() {
        String str;
        String str2 = this.A03;
        String str3 = this.A04;
        IgVideoRealtimeEventPayload$Type A002 = A00();
        ULZ ulz = this.A00;
        if (ulz != null) {
            str = ulz.A08;
        } else {
            str = null;
        }
        return 0mp.A06("IgVideoRealtimeEventPayload[broadcast=%s, videocallId=%s, type=%s, transaction=%s]", new Object[]{str2, str3, A002, str});
    }
}
