package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.5gR  reason: invalid class name and case insensitive filesystem */
public final class C291055gR implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MqttSubscribeListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public C291055gR(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, long j) {
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttSubscribeListener;
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = j;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onData");
        } else {
            this.A01.onData(this.A03, this.A04, this.A00);
        }
    }
}
