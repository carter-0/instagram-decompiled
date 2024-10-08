package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* renamed from: X.NBq  reason: case insensitive filesystem */
public final class C68354NBq extends AnonymousClass45Y {
    public final /* synthetic */ MqttNetworkSessionPlugin A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ byte[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68354NBq(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, String str, byte[] bArr) {
        super("onMqttPublishReceived");
        this.A00 = mqttNetworkSessionPlugin;
        this.A01 = str;
        this.A02 = bArr;
    }

    public final void run() {
        this.A00.onMqttPublishReceived(this.A01, this.A02);
    }
}
