package X;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: X.93e  reason: invalid class name */
public final class AnonymousClass93e implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ 0lg A01;

    public AnonymousClass93e(Handler handler, 0lg r2) {
        this.A01 = r2;
        this.A00 = handler;
    }

    public final void run() {
        C60340gF r0;
        0lg r3 = this.A01;
        try {
            C3729093d.A01 = C3728993c.A00(r3);
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = new 0eQ(th);
        }
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            0KC.A0F("DeviceStatusExtractor", "err in device status", A002);
        }
        this.A00.postDelayed(this, TimeUnit.SECONDS.toMillis(182.A01(0Tu.A05, r3, 36607470848185934L)));
    }
}
