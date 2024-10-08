package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

public final class TKA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttSubscribeListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public TKA(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, int i, boolean z) {
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttSubscribeListener;
        this.A03 = str;
        this.A04 = z;
        this.A00 = i;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11(AnonymousClass000.A00(3692));
        } else {
            this.A01.onSubscriptionResponse(this.A03, this.A04, this.A00);
        }
    }
}
