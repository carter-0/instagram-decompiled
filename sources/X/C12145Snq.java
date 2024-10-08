package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* renamed from: X.Snq  reason: case insensitive filesystem */
public final class C12145Snq implements MqttSubscribeListener {
    public final /* synthetic */ MqttSubscribeListener A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;

    public final void onData(String str, byte[] bArr, long j) {
        String str2 = str;
        byte[] bArr2 = bArr;
        AnonymousClass7TG.A1N(str, bArr);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        } else {
            executor.execute(new TK9(this.A00, xplatNativeClientWrapper, str2, bArr2, j));
        }
    }

    public final void onSubscriptionResponse(String str, boolean z, int i) {
        String str2 = str;
        0qQ.A0B(str, 0);
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
        Executor executor = xplatNativeClientWrapper.callbackExecutor;
        if (executor == null) {
            0qQ.A0F("callbackExecutor");
            throw AnonymousClass00P.createAndThrow();
        }
        executor.execute(new TKA(this.A00, xplatNativeClientWrapper, str2, i, z));
    }

    public C12145Snq(MqttSubscribeListener mqttSubscribeListener, XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A01 = xplatNativeClientWrapper;
        this.A00 = mqttSubscribeListener;
    }
}
