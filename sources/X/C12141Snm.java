package X;

import com.facebook.mqtt.service.MqttPublishListener;

/* renamed from: X.Snm  reason: case insensitive filesystem */
public final class C12141Snm implements MqttPublishListener {
    public final /* synthetic */ C13775Tgq A00;

    public C12141Snm(C13775Tgq tgq) {
        this.A00 = tgq;
    }

    public final void onFailure(int i, int i2) {
        C13775Tgq tgq = this.A00;
        if (tgq != null) {
            tgq.DET(i, String.valueOf(i2));
        }
    }

    public final void onSuccess(int i) {
        C13775Tgq tgq = this.A00;
        if (tgq != null) {
            tgq.onSuccess(i);
        }
    }

    public final void onTimeout(int i, boolean z) {
        C13775Tgq tgq = this.A00;
        if (tgq != null) {
            tgq.Dat(i);
        }
    }
}
