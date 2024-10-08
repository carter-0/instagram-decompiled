package X;

import com.instagram.realtimeclient.RealtimeClientManager$Observer;

public final class PJF implements RealtimeClientManager$Observer {
    public final /* synthetic */ C69241Nhv A00;

    public final void onMessage(C291065gS r1) {
    }

    public final void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
    }

    public final void onSendPayload(String str, byte[] bArr, String str2, Long l) {
    }

    public PJF(C69241Nhv nhv) {
        this.A00 = nhv;
    }

    public final void onConnectionChanged(AnonymousClass46J r6) {
        Integer num;
        String str;
        C69241Nhv nhv = this.A00;
        nhv.updateExtras(nhv.A03);
        if (r6 != null) {
            Integer num2 = r6.A00;
            int intValue = num2.intValue();
            if (intValue == 1) {
                nhv.A0G(nhv.A09, "mqtt_connected", (String) null);
                nhv.A08.A02(true);
                nhv.maybeEndFlowSuccess("mqtt_connection");
            } else if (intValue == 0 || intValue == 2) {
                if (num2 == AnonymousClass05K.A00) {
                    num = AnonymousClass05K.A0Y;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                if (3 - num.intValue() != 0) {
                    str = "mqtt_connecting";
                } else {
                    str = "mqtt_disconnected";
                }
                nhv.A0G(nhv.A09, str, (String) null);
                nhv.A08.A02(false);
            }
        }
    }
}
