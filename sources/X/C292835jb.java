package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5jb  reason: invalid class name and case insensitive filesystem */
public final class C292835jb implements C61110lV {
    public static C292835jb A0A;
    public long A00 = 0;
    public long A01;
    public ScheduledFuture A02;
    public final 0Gb A03;
    public final 0JN A04;
    public final LightweightQuickPerformanceLogger A05;
    public final Runnable A06;
    public final Map A07;
    public final ScheduledExecutorService A08;
    public final AtomicBoolean A09;

    public final synchronized void A00() {
        if (this.A02 == null) {
            this.A02 = this.A08.scheduleAtFixedRate(this.A06, 0, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, TimeUnit.MILLISECONDS);
        }
    }

    public C292835jb(QuickPerformanceLogger quickPerformanceLogger) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
        0JN A012 = 0JN.A01();
        0wb r0 = 0wb.A01;
        this.A08 = scheduledThreadPoolExecutor;
        this.A04 = A012;
        this.A03 = r0;
        this.A05 = quickPerformanceLogger;
        this.A07 = new HashMap();
        this.A06 = new C73048PUf(this);
        this.A09 = new AtomicBoolean(false);
        this.A01 = 0;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1434328503);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.A02;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A02 = null;
            }
        }
        AnonymousClass0fD.A0A(-1646835154, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(1827526975);
        A00();
        AnonymousClass0fD.A0A(-286602931, A032);
    }
}
