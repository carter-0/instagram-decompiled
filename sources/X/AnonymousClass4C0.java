package X;

import com.facebook.mqtt.service.MqttSubscribeListener;

/* renamed from: X.4C0  reason: invalid class name */
public final class AnonymousClass4C0 implements MqttSubscribeListener {
    public final /* synthetic */ 26B A00;

    public final void onData(String str, byte[] bArr, long j) {
        0qQ.A0B(str, 0);
        0qQ.A0B(bArr, 1);
        26B.A03(this.A00, str, bArr);
    }

    public final void onSubscriptionResponse(String str, boolean z, int i) {
        0qQ.A0B(str, 0);
    }

    public AnonymousClass4C0(26B r1) {
        this.A00 = r1;
    }
}
