package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Ryc  reason: case insensitive filesystem */
public final class C10816Ryc {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SBV A01;
    public final /* synthetic */ C10676RwF A02;
    public final /* synthetic */ C10970S3c A03;
    public final /* synthetic */ C10861RzM A04;
    public final /* synthetic */ C10937S1q A05;
    public final /* synthetic */ ExecutorService A06;
    public final /* synthetic */ ScheduledExecutorService A07;
    public final /* synthetic */ boolean A08;

    public C10816Ryc(Context context, SBV sbv, C10676RwF rwF, C10970S3c s3c, C10861RzM rzM, C10937S1q s1q, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.A03 = s3c;
        this.A04 = rzM;
        this.A08 = z;
        this.A02 = rwF;
        this.A07 = scheduledExecutorService;
        this.A05 = s1q;
        this.A00 = context;
        this.A01 = sbv;
        this.A06 = executorService;
    }
}
