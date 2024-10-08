package X;

import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1;
import com.facebook.mqtt.service.ipc.IMqttPublishListener;

/* renamed from: X.Snn  reason: case insensitive filesystem */
public final class C12142Snn implements MqttPublishListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C12142Snn(XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1, IMqttPublishListener iMqttPublishListener, int i) {
        this.A00 = i;
        this.A02 = xplatServiceDelegate$remoteBinder$1;
        this.A01 = iMqttPublishListener;
    }

    public final void onFailure(int i, int i2) {
        int i3;
        int i4 = this.A00;
        XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1 = (XplatServiceDelegate$remoteBinder$1) this.A02;
        Object obj = this.A01;
        if (i4 != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        xplatServiceDelegate$remoteBinder$1.A00(new C52061GDh(obj, i, i2, i3));
    }

    public final void onSuccess(int i) {
        int i2;
        int i3 = this.A00;
        XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1 = (XplatServiceDelegate$remoteBinder$1) this.A02;
        Object obj = this.A01;
        if (i3 != 0) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        xplatServiceDelegate$remoteBinder$1.A00(new MJ3(i, i2, obj));
    }

    public final void onTimeout(int i, boolean z) {
        int i2;
        int i3 = this.A00;
        XplatServiceDelegate$remoteBinder$1 xplatServiceDelegate$remoteBinder$1 = (XplatServiceDelegate$remoteBinder$1) this.A02;
        Object obj = this.A01;
        if (i3 != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        xplatServiceDelegate$remoteBinder$1.A00(new C73671Phk(obj, i, i2, z));
    }
}
