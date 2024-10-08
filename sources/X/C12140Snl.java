package X;

import com.facebook.mqtt.service.MqttPublishExtListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* renamed from: X.Snl  reason: case insensitive filesystem */
public final class C12140Snl implements MqttPublishExtListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttPublishExtListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public C12140Snl(MqttPublishExtListener mqttPublishExtListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, int i) {
        this.A03 = str;
        this.A02 = xplatNativeClientWrapper;
        this.A01 = mqttPublishExtListener;
        this.A00 = i;
        this.A04 = bArr;
    }

    public final void onPublishAttempt(int i, int i2, int i3, int i4, int i5) {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new TKX(this.A01, this.A00, i2, i3, i4, i5));
        }
    }

    public final void onPublishCompleted(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        String A0g;
        int i7;
        String str = this.A03;
        boolean z2 = z;
        if (z) {
            A0g = 002.A0g("mqtt:puback:", str, ":success");
            i7 = 1339573902;
        } else {
            A0g = 002.A0g("mqtt:puback:", str, ":fail");
            i7 = -361391219;
        }
        0fh.A01(A0g, i7);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        }
        executor.execute(new C13081TKn(this.A01, xplatNativeClientWrapper, this.A04, this.A00, i2, i3, i4, i5, i6, z2));
        0fh.A00(-1629706810);
    }
}
