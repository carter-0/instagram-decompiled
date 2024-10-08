package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1;
import com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy;

/* renamed from: X.Snr  reason: case insensitive filesystem */
public final class C12146Snr implements MqttSubscribeListener {
    public final /* synthetic */ XplatServiceDelegate$remoteBinder$1 A00;
    public final /* synthetic */ IMqttSubscribeListener$Stub$Proxy A01;

    public final void onData(String str, byte[] bArr, long j) {
        AnonymousClass7TF.A1H(str, bArr);
        XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1 = this.A00;
        IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy = this.A01;
        xplatServiceDelegate$remoteBinder$1.A00(new C58209IoD(iMqttSubscribeListener$Stub$Proxy, bArr, str, 0, j));
    }

    public final void onSubscriptionResponse(String str, boolean z, int i) {
        0qQ.A0B(str, 0);
        this.A00.A00(new TTT(this.A01, str, i, 0, z));
    }

    public C12146Snr(XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1, IMqttSubscribeListener$Stub$Proxy iMqttSubscribeListener$Stub$Proxy) {
        this.A00 = xplatServiceDelegate$remoteBinder$1;
        this.A01 = iMqttSubscribeListener$Stub$Proxy;
    }
}
