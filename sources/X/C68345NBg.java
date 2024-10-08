package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;

/* renamed from: X.NBg  reason: case insensitive filesystem */
public final class C68345NBg extends AnonymousClass45Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttNetworkSessionPlugin A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68345NBg(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, int i) {
        super("onMqttPubAckTimeout");
        this.A01 = mqttNetworkSessionPlugin;
        this.A00 = i;
    }

    public final void run() {
        this.A01.onMqttPubAckTimeout(this.A00);
    }
}
