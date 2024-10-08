package X;

import com.facebook.mqtt.service.MqttPublishExtListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* renamed from: X.TKn  reason: case insensitive filesystem */
public final class C13081TKn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ MqttPublishExtListener A06;
    public final /* synthetic */ XplatNativeClientWrapper A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    public C13081TKn(MqttPublishExtListener mqttPublishExtListener, XplatNativeClientWrapper xplatNativeClientWrapper, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.A07 = xplatNativeClientWrapper;
        this.A06 = mqttPublishExtListener;
        this.A02 = i;
        this.A00 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A08 = z;
        this.A05 = i6;
        this.A09 = bArr;
    }

    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A07;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onPublish");
        } else {
            this.A06.onPublishCompleted(this.A02, this.A00, this.A04, this.A03, this.A01, this.A08, this.A05);
        }
    }
}
