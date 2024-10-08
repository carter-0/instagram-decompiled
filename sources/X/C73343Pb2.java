package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pb2  reason: case insensitive filesystem */
public final class C73343Pb2 implements Runnable {
    public final int A00;
    public final MobileConfigManagerHolderImpl A01;
    public final AnonymousClass1AK A02;
    public final ScheduledExecutorService A03;

    public C73343Pb2(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, AnonymousClass1AK r2, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A00 = i;
        this.A01 = mobileConfigManagerHolderImpl;
        this.A02 = r2;
        this.A03 = scheduledExecutorService;
    }

    public final void run() {
        String A002 = C639319c.A00();
        if (!A002.equals("EMPTY_FAMILY_DEVICE_ID")) {
            this.A01.setFamilyDeviceId(A002);
            return;
        }
        int i = this.A00;
        if (i > 0) {
            ScheduledExecutorService scheduledExecutorService = this.A03;
            scheduledExecutorService.schedule(new C73343Pb2(this.A01, this.A02, scheduledExecutorService, i - 1), 100, TimeUnit.MILLISECONDS);
            return;
        }
        0KC.A02(C73343Pb2.class, "Used up all retries. Fail to update configs with non-empty fdid.");
    }
}
