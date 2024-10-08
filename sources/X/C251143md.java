package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3md  reason: invalid class name and case insensitive filesystem */
public final class C251143md implements C61110lV {
    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1804859886);
        C67791wu.A00();
        if (2QF.A00().A07().A00() && 2QF.A00().A05() != null) {
            C252693pW A05 = 2QF.A00().A05();
            synchronized (A05) {
                synchronized (2QF.A00()) {
                }
                C252713pY r5 = A05.A00;
                synchronized (r5) {
                    Class<C252713pY> cls = C252713pY.class;
                    0KC.A0A(cls, "onUserLeftApp mSweepFuture=%s", new Object[]{r5.A03});
                    if (r5.A03 == null) {
                        0KC.A0A(cls, "Scheduling memory leak check in %d ms ", new Object[]{Long.valueOf(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT)});
                        r5.A03 = r5.A05.schedule(r5.A04, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(846683642, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(23289232);
        C67791wu.A00();
        if (2QF.A00().A07().A00() && 2QF.A00().A05() != null) {
            C252693pW A05 = 2QF.A00().A05();
            synchronized (2QF.A00()) {
            }
            C252713pY r2 = A05.A00;
            synchronized (r2) {
                ScheduledFuture scheduledFuture = r2.A03;
                if (scheduledFuture != null && !scheduledFuture.isCancelled() && !r2.A03.isDone()) {
                    r2.A03.cancel(false);
                    r2.A03 = null;
                }
            }
        }
        AnonymousClass0fD.A0A(581108592, A03);
    }
}
