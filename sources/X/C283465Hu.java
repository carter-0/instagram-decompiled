package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5Hu  reason: invalid class name and case insensitive filesystem */
public final class C283465Hu implements MobileConfigUpdateConfigsCallback {
    public final /* synthetic */ MobileConfigManagerHolderImpl A00;
    public final /* synthetic */ C59450Ty A01;

    public C283465Hu(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, C59450Ty r2) {
        this.A00 = mobileConfigManagerHolderImpl;
        this.A01 = r2;
    }

    public final void onNetworkComplete(boolean z) {
        ScheduledExecutorService scheduledExecutorService;
        AnonymousClass1AK r1;
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = this.A01.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(z);
        }
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A00;
        if (mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs() && (scheduledExecutorService = mobileConfigManagerHolderImpl.mScheduledExecutor) != null && (r1 = mobileConfigManagerHolderImpl.mFamilyDeviceIdProvider) != null) {
            scheduledExecutorService.schedule(new C73344Pb3(mobileConfigManagerHolderImpl, r1, scheduledExecutorService, 30), 0, TimeUnit.MILLISECONDS);
        }
    }
}
