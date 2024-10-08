package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Snp  reason: case insensitive filesystem */
public final class C12144Snp implements MqttPublishListener {
    public int A00;
    public final int A01 = 1;
    public final Object A02;

    public C12144Snp(C13775Tgq tgq, int i) {
        this.A02 = tgq;
        this.A00 = i;
    }

    public final void onFailure(int i, int i2) {
        if (this.A01 != 0) {
            C13775Tgq tgq = (C13775Tgq) this.A02;
            if (tgq != null) {
                tgq.DET(this.A00, String.valueOf(i2));
                return;
            }
            return;
        }
        ((CountDownLatch) this.A02).countDown();
    }

    public final void onSuccess(int i) {
        if (this.A01 != 0) {
            C13775Tgq tgq = (C13775Tgq) this.A02;
            if (tgq != null) {
                tgq.onSuccess(this.A00);
                return;
            }
            return;
        }
        this.A00 = i;
        ((CountDownLatch) this.A02).countDown();
    }

    public final void onTimeout(int i, boolean z) {
        if (this.A01 != 0) {
            C13775Tgq tgq = (C13775Tgq) this.A02;
            if (tgq != null) {
                tgq.Dat(this.A00);
                return;
            }
            return;
        }
        ((CountDownLatch) this.A02).countDown();
    }

    public C12144Snp(CountDownLatch countDownLatch) {
        this.A02 = countDownLatch;
        this.A00 = -1;
    }
}
