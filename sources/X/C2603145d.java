package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.DeadObjectException;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;
import org.webrtc.NetworkMonitor;

/* renamed from: X.45d  reason: invalid class name and case insensitive filesystem */
public final class C2603145d implements C250773m2 {
    public C250773m2 A00;
    public C2604945w A01;
    public final Context A02;
    public final 26N A03;
    public final C250773m2 A04;
    public final C2603245e A05 = new C2603245e(this);

    public C2603145d(Context context, 26N r3, C250773m2 r4) {
        0qQ.A0B(r3, 2);
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = context;
    }

    public final void onNetworkAvailable() {
    }

    public final void onNetworkInterfaceChanged(int i) {
    }

    public final void onNetworkUnavailable() {
    }

    public final boolean start(Context context, ConnectionConfig connectionConfig, C2603445g r11, MqttSubscribeListener mqttSubscribeListener) {
        String str;
        0qQ.A0B(context, 0);
        C250773m2 r1 = this.A04;
        if (!r1.start(context, connectionConfig, r11, mqttSubscribeListener)) {
            return false;
        }
        this.A00 = r1;
        C2604845v r3 = new C2604845v(this.A05);
        try {
            Object systemService = context.getSystemService("connectivity");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).addTransportType(4).addTransportType(2).build(), r3.A00);
        } catch (SecurityException e) {
            e = e;
            str = "Error listening for network updates. Updates will not be reported";
        } catch (IllegalArgumentException e2) {
            e = e2;
            str = "Illegal arguments. Updates will not be reported";
        } catch (RuntimeException e3) {
            e = e3;
            str = "Too many listeners. Updates will not be reported";
        }
        this.A01 = r3;
        return true;
        0KC.A0F(NetworkMonitor.TAG, str, e);
        this.A01 = r3;
        return true;
    }

    public final void stop() {
        String str;
        this.A00 = null;
        C2604945w r3 = this.A01;
        if (r3 != null) {
            C2604845v r32 = (C2604845v) r3;
            try {
                Object systemService = this.A02.getSystemService("connectivity");
                0qQ.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).unregisterNetworkCallback(r32.A00);
            } catch (SecurityException e) {
                e = e;
                str = "Error stopping listening for network updates.";
            } catch (IllegalArgumentException e2) {
                e = e2;
                str = "Invalid argument when stopping listening for network updates.";
            } catch (RuntimeException e3) {
                e = e3;
                if (e.getCause() instanceof DeadObjectException) {
                    str = "Too many listeners. Updates will not be reported";
                } else {
                    throw e;
                }
            }
        }
        this.A01 = null;
        this.A04.stop();
        0KC.A0F(NetworkMonitor.TAG, str, e);
        this.A01 = null;
        this.A04.stop();
    }

    public final boolean subscribe(String str, C2605346a r3, MqttSubscribeListener mqttSubscribeListener) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(mqttSubscribeListener, 2);
        return this.A04.subscribe(str, r3, mqttSubscribeListener);
    }

    public final boolean verifyAuthToken(String str) {
        0qQ.A0B(str, 0);
        return this.A04.verifyAuthToken(str);
    }

    public final boolean cancelPublish(int i) {
        return this.A04.cancelPublish(i);
    }

    public final void kickOffConnection() {
        this.A04.kickOffConnection();
    }

    public final int publish(String str, byte[] bArr, C2605346a r4, MqttPublishListener mqttPublishListener) {
        return this.A04.publish(str, bArr, r4, mqttPublishListener);
    }

    public final void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        this.A04.setForeground(z, bArr, mqttPublishListener);
    }

    public final boolean unsubscribe(List list) {
        return this.A04.unsubscribe(list);
    }
}
