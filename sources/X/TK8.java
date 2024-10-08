package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

public final class TK8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttPublishListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public TK8(MqttPublishListener mqttPublishListener, XplatNativeClientWrapper xplatNativeClientWrapper, byte[] bArr, int i, boolean z) {
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttPublishListener;
        this.A00 = i;
        this.A03 = z;
        this.A04 = bArr;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onPublish");
        } else {
            this.A01.onTimeout(this.A00, this.A03);
        }
    }
}
