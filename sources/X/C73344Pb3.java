package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Pb3  reason: case insensitive filesystem */
public final class C73344Pb3 implements Runnable {
    public final int A00;
    public final MobileConfigManagerHolderImpl A01;
    public final AnonymousClass1AK A02;
    public final ScheduledExecutorService A03;

    public C73344Pb3(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, AnonymousClass1AK r2, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A00 = i;
        this.A01 = mobileConfigManagerHolderImpl;
        this.A03 = scheduledExecutorService;
        this.A02 = r2;
    }

    public final void run() {
        String A002 = C639319c.A00();
        if (!A002.equals("EMPTY_FAMILY_DEVICE_ID")) {
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A01;
            mobileConfigManagerHolderImpl.setFamilyDeviceId(A002);
            mobileConfigManagerHolderImpl.updateConfigs(new C59450Ty());
            return;
        }
        int i = this.A00;
        if (i > 0) {
            ScheduledExecutorService scheduledExecutorService = this.A03;
            scheduledExecutorService.schedule(new C73344Pb3(this.A01, this.A02, scheduledExecutorService, i - 1), 100, TimeUnit.MILLISECONDS);
            return;
        }
        0KC.A02(C73344Pb3.class, "Used up all retries. Fail to update configs with non-empty fdid.");
    }
}
