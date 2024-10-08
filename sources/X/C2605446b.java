package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.concurrent.Executor;

/* renamed from: X.46b  reason: invalid class name and case insensitive filesystem */
public final class C2605446b implements MqttPublishListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttPublishListener A01;
    public final /* synthetic */ XplatNativeClientWrapper A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public C2605446b(MqttPublishListener mqttPublishListener, XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = mqttPublishListener;
        this.A02 = xplatNativeClientWrapper;
        this.A04 = bArr;
    }

    public final void onFailure(int i, int i2) {
        int i3 = this.A00;
        0fh.A01(002.A0g("mqtt:puback:", this.A03, ":fail"), 669340791);
        MqttPublishListener mqttPublishListener = this.A01;
        if (mqttPublishListener != null) {
            XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
            byte[] bArr = this.A04;
            AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
            Executor executor = xplatNativeClientWrapper.callbackExecutor;
            if (executor == null) {
                0qQ.A0F("callbackExecutor");
                throw AnonymousClass00P.createAndThrow();
            }
            executor.execute(new TK7(mqttPublishListener, xplatNativeClientWrapper, bArr, i3, i2));
        }
        0fh.A00(869379229);
    }

    public final void onSuccess(int i) {
        int i2 = this.A00;
        0fh.A01(002.A0g("mqtt:puback:", this.A03, ":success"), -498907978);
        MqttPublishListener mqttPublishListener = this.A01;
        if (mqttPublishListener != null) {
            XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
            byte[] bArr = this.A04;
            AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
            Executor executor = xplatNativeClientWrapper.callbackExecutor;
            if (executor == null) {
                0qQ.A0F("callbackExecutor");
                throw AnonymousClass00P.createAndThrow();
            }
            executor.execute(new C13047TJd(mqttPublishListener, xplatNativeClientWrapper, bArr, i2));
        }
        0fh.A00(447638920);
    }

    public final void onTimeout(int i, boolean z) {
        int i2 = this.A00;
        0fh.A01(002.A0g("mqtt:puback:", this.A03, ":timeout"), -1984710829);
        MqttPublishListener mqttPublishListener = this.A01;
        if (mqttPublishListener != null) {
            XplatNativeClientWrapper xplatNativeClientWrapper = this.A02;
            byte[] bArr = this.A04;
            AnonymousClass28I r0 = XplatNativeClientWrapper.Companion;
            Executor executor = xplatNativeClientWrapper.callbackExecutor;
            if (executor == null) {
                0qQ.A0F("callbackExecutor");
                throw AnonymousClass00P.createAndThrow();
            }
            executor.execute(new TK8(mqttPublishListener, xplatNativeClientWrapper, bArr, i2, z));
        }
        0fh.A00(1214057830);
    }
}
