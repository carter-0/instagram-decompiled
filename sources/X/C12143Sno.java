package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Sno  reason: case insensitive filesystem */
public final class C12143Sno implements MqttPublishListener {
    public AtomicBoolean A00 = new AtomicBoolean(false);
    public final int A01;
    public final C2605346a A02;
    public final String A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final byte[] A05;
    public final MqttPublishListener A06;
    public final /* synthetic */ C2602244t A07;

    public C12143Sno(MqttPublishListener mqttPublishListener, C2602244t r4, C2605346a r5, String str, byte[] bArr, int i) {
        this.A07 = r4;
        this.A03 = str;
        this.A05 = bArr;
        this.A02 = r5;
        this.A06 = mqttPublishListener;
        this.A01 = i;
    }

    public final void onFailure(int i, int i2) {
        MqttPublishListener mqttPublishListener;
        if (this.A04.compareAndSet(false, true) && (mqttPublishListener = this.A06) != null) {
            mqttPublishListener.onFailure(this.A01, i2);
        }
    }

    public final void onSuccess(int i) {
        MqttPublishListener mqttPublishListener;
        if (this.A04.compareAndSet(false, true) && (mqttPublishListener = this.A06) != null) {
            mqttPublishListener.onSuccess(this.A01);
        }
    }

    public final void onTimeout(int i, boolean z) {
        MqttPublishListener mqttPublishListener;
        if (this.A04.compareAndSet(false, true) && (mqttPublishListener = this.A06) != null) {
            mqttPublishListener.onTimeout(this.A01, z);
        }
    }
}
