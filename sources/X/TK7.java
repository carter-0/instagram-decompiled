package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

public final class TK7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MqttPublishListener A02;
    public final /* synthetic */ XplatNativeClientWrapper A03;
    public final /* synthetic */ byte[] A04;

    public TK7(MqttPublishListener mqttPublishListener, XplatNativeClientWrapper xplatNativeClientWrapper, byte[] bArr, int i, int i2) {
        this.A03 = xplatNativeClientWrapper;
        this.A02 = mqttPublishListener;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = bArr;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A03;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onPublish");
        } else {
            this.A02.onFailure(this.A01, this.A00);
        }
    }
}
