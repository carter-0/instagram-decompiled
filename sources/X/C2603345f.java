package X;

import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.45f  reason: invalid class name and case insensitive filesystem */
public final class C2603345f implements C2603445g {
    public final /* synthetic */ 26B A00;

    public final void D5j(ConnectionConfig connectionConfig, Integer num) {
        String str;
        AnonymousClass450 r1;
        0qQ.A0B(num, 0);
        switch (num.intValue()) {
            case 0:
                str = "CONNACK_SERVER_UNAVAILABLE";
                break;
            case 1:
                str = "CONNACK_BAD_USERNAME_PASS";
                break;
            case 2:
                str = "CONNACK_BAD_CONNECTION_HASH";
                break;
            case 3:
                str = "CONNACK_AUTH_FAILED";
                break;
            default:
                str = "SERVER_SHEDDING_LOAD";
                break;
        }
        0KC.A0D("XplatMqttClientImpl", 002.A0R("Connection error ", str));
        26B r12 = this.A00;
        if ((num == AnonymousClass05K.A0N || num == AnonymousClass05K.A01) && (r1 = r12.A02) != null) {
            synchronized (r1) {
                r1.A00 = connectionConfig;
            }
            AnonymousClass4Uw r0 = r1.A03;
            26B.A0G.A01(new C12960TFt(r0.A00, r0.A01));
        }
    }

    public final boolean D5p(C2603845k r3) {
        0qQ.A0B(r3, 0);
        26B.A02(r3, this.A00);
        return false;
    }

    public C2603345f(26B r1) {
        this.A00 = r1;
    }

    public final void onMessageDropped(String str, byte[] bArr, long j) {
        26B.A03(this.A00, str, bArr);
    }
}
