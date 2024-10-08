package X;

import android.content.Context;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;

/* renamed from: X.3m2  reason: invalid class name and case insensitive filesystem */
public interface C250773m2 {
    boolean cancelPublish(int i);

    void kickOffConnection();

    void onNetworkAvailable();

    void onNetworkInterfaceChanged(int i);

    void onNetworkUnavailable();

    int publish(String str, byte[] bArr, C2605346a r3, MqttPublishListener mqttPublishListener);

    void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener);

    boolean start(Context context, ConnectionConfig connectionConfig, C2603445g r3, MqttSubscribeListener mqttSubscribeListener);

    void stop();

    boolean subscribe(String str, C2605346a r2, MqttSubscribeListener mqttSubscribeListener);

    boolean unsubscribe(List list);

    boolean verifyAuthToken(String str);
}
