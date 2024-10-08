package X;

import com.instagram.realtimeclient.RealtimeClientManager$Observer;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.5D8  reason: invalid class name */
public final class AnonymousClass5D8 implements RealtimeClientManager$Observer {
    public final AnonymousClass5D7 A00;
    public final C62710vD A01;

    public AnonymousClass5D8(C62710vD r2, AnonymousClass5D7 r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final void onConnectionChanged(AnonymousClass46J r1) {
    }

    public final void onMessage(C291065gS r1) {
    }

    public final void onSendPayload(String str, byte[] bArr, String str2, Long l) {
    }

    public final void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        if (0qQ.A0K(str, RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE)) {
            this.A01.ATE(new C68659NRr(this, str2));
        }
    }
}
