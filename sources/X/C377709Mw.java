package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.9Mw  reason: invalid class name and case insensitive filesystem */
public final class C377709Mw extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377709Mw(Object obj, Object obj2, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int hashCode;
        int i = this.A00;
        int intValue = ((Number) obj).intValue();
        if (i != 0) {
            lightweightQuickPerformanceLogger = ((CacheBehaviorLogger) this.A03).logger;
            hashCode = ((1QS) this.A02).A04;
        } else {
            lightweightQuickPerformanceLogger = ((IGTigonQuickPerformanceLogger) this.A03).logger;
            hashCode = this.A02.hashCode();
        }
        lightweightQuickPerformanceLogger.markerAnnotate(intValue, hashCode, this.A04, this.A01);
        return C60340gF.A00;
    }
}
