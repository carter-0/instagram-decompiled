package X;

import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Im  reason: invalid class name and case insensitive filesystem */
public final class C239843Im extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ IGTigonQuickPerformanceLogger A01;
    public final /* synthetic */ 1QS A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ TimeUnit A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C239843Im(IGTigonQuickPerformanceLogger iGTigonQuickPerformanceLogger, 1QS r3, String str, TimeUnit timeUnit, long j) {
        super(1);
        this.A01 = iGTigonQuickPerformanceLogger;
        this.A02 = r3;
        this.A03 = str;
        this.A00 = j;
        this.A04 = timeUnit;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.A01.logger.markerPoint(((Number) obj).intValue(), this.A02.hashCode(), this.A03, this.A00, this.A04);
        return C60340gF.A00;
    }
}
