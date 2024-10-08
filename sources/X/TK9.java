package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

public final class TK9 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MqttSubscribeListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public TK9(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, long j) {
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
            throw AnonymousClass7TE.A11("onData");
        } else {
            this.A01.onData(this.A03, this.A04, this.A00);
        }
    }
}
