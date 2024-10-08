package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.4ig  reason: invalid class name and case insensitive filesystem */
public final class C271334ig implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttSubscribeListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C271334ig(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, int i, boolean z) {
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
            throw new NullPointerException(AnonymousClass000.A00(3692));
        } else {
            this.A01.onSubscriptionResponse(this.A03, this.A04, this.A00);
        }
    }
}
