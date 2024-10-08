package X;

import com.facebook.mqtt.service.ConnectionConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.45P  reason: invalid class name */
public final class AnonymousClass45P implements Runnable {
    public final /* synthetic */ ConnectionConfig A00;
    public final /* synthetic */ 26B A01;
    public final /* synthetic */ Integer A02;

    public AnonymousClass45P(ConnectionConfig connectionConfig, 26B r2, Integer num) {
        this.A01 = r2;
        this.A02 = num;
        this.A00 = connectionConfig;
    }

    public final void run() {
        26B r6 = this.A01;
        if (r6.A0F == null) {
            0qQ.A0B(this.A02, 0);
            C2602044r r5 = r6.A00;
            if (r5 != null) {
                ConnectionConfig connectionConfig = this.A00;
                if (connectionConfig == null) {
                    AnonymousClass450 r3 = r6.A02;
                    if (r3 != null) {
                        connectionConfig = r3.A05(r6.A03, r5, r6.A07, 26B.A0H);
                    } else {
                        connectionConfig = null;
                    }
                }
                r6.A01 = connectionConfig;
            }
            ConnectionConfig connectionConfig2 = r6.A01;
            if (connectionConfig2 != null) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AnonymousClass45U.A00.execute(new AnonymousClass45W(connectionConfig2, r6, countDownLatch));
                try {
                    countDownLatch.await(10, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    0KC.A0G("XplatMqttClientImpl", "Error waiting for client start", e);
                }
            }
        } else {
            0qQ.A0B(AnonymousClass05K.A0N, 0);
            C250773m2 r0 = r6.A0F;
            if (r0 != null) {
                r0.kickOffConnection();
            }
        }
    }
}
