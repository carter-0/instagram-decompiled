package X;

import android.content.Context;
import com.facebook.mqtt.service.ConnectionConfig;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.45W  reason: invalid class name */
public final class AnonymousClass45W implements Runnable {
    public final /* synthetic */ ConnectionConfig A00;
    public final /* synthetic */ 26B A01;
    public final /* synthetic */ CountDownLatch A02;

    public AnonymousClass45W(ConnectionConfig connectionConfig, 26B r2, CountDownLatch countDownLatch) {
        this.A01 = r2;
        this.A00 = connectionConfig;
        this.A02 = countDownLatch;
    }

    public final void run() {
        C2603145d r2;
        try {
            26B r7 = this.A01;
            ConnectionConfig connectionConfig = this.A00;
            C2602044r r6 = r7.A00;
            if (r6 != null) {
                26N r4 = 26B.A0G;
                C2603045c r0 = new C2603045c(r4, new C2602845a(r7), AnonymousClass45U.A00, C2602945b.A00);
                Context context = r6.A04;
                r2 = new C2603145d(context, r4, r0);
                if (r2.start(context, connectionConfig, new C2603345f(r7), r7.A06)) {
                    r7.A04.A02(r2);
                    r7.A05.A01(r2);
                    r7.A0F = r2;
                }
            }
            r2 = null;
            r7.A0F = r2;
        } finally {
            this.A02.countDown();
        }
    }
}
