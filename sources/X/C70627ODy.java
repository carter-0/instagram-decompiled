package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.instagram.realtimeclient.RealtimeClientManager;
import kotlin.Deprecated;

@Deprecated(message = "For supporting multi-instances, we disabled the mqtt in msys.")
/* renamed from: X.ODy  reason: case insensitive filesystem */
public final class C70627ODy {
    public int A00 = -1;
    public final MqttNetworkSessionPlugin A01;
    public final RealtimeClientManager A02;

    public C70627ODy(MqttNetworkSessionPlugin mqttNetworkSessionPlugin, RealtimeClientManager realtimeClientManager) {
        this.A02 = realtimeClientManager;
        this.A01 = mqttNetworkSessionPlugin;
    }
}
