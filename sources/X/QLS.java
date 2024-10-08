package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class QLS extends C3722490b {
    public BroadcastReceiver A00;
    public C276264sw A01;
    public C10941S1x A02;
    public ScheduledFuture A03;
    public boolean A04;
    public final Context A05;
    public final AnonymousClass0JP A06;
    public final AnonymousClass0JR A07;
    public final C276244su A08;
    public final C276254sv A09;
    public final ScheduledExecutorService A0A;

    public static void A00(QLS qls) {
        qls.A04 = false;
        qls.A02 = null;
        BroadcastReceiver broadcastReceiver = qls.A00;
        if (broadcastReceiver != null) {
            qls.A05.unregisterReceiver(broadcastReceiver);
            qls.A00 = null;
        }
        ScheduledFuture scheduledFuture = qls.A03;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            qls.A03 = null;
        }
    }

    public QLS(Context context, AnonymousClass0JP r2, AnonymousClass0JR r3, C276264sw r4, C276244su r5, C276254sv r6, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = r4;
        this.A05 = context;
        this.A08 = r5;
        this.A06 = r2;
        this.A09 = r6;
        this.A07 = r3;
        this.A0A = scheduledExecutorService;
    }
}
