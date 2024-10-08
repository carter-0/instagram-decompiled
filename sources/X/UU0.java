package X;

import android.os.Looper;
import com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate;

public final class UU0 extends C14696U1w {
    public final /* synthetic */ MqttBackgroundServiceDelegate A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UU0(Looper looper, MqttBackgroundServiceDelegate mqttBackgroundServiceDelegate) {
        super(looper, mqttBackgroundServiceDelegate);
        this.A00 = mqttBackgroundServiceDelegate;
    }
}
