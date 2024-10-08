package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.api.tigon.IGTigonQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.9N7  reason: invalid class name */
public final class AnonymousClass9N7 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N7(Object obj, Object obj2, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i2;
        switch (this.A00) {
            case 0:
                i = ((Number) obj).intValue();
                lightweightQuickPerformanceLogger = ((IGTigonQuickPerformanceLogger) this.A02).logger;
                i2 = this.A01.hashCode();
                break;
            case 1:
                C333867aH r7 = (C333867aH) obj;
                0qQ.A0B(r7, 0);
                return C335067cK.A06(r7, this.A04, this.A03, new C59101J6j(26, this.A02, this.A01));
            case 2:
                i = ((Number) obj).intValue();
                lightweightQuickPerformanceLogger = ((CacheBehaviorLogger) this.A02).logger;
                i2 = ((1QS) this.A01).A04;
                break;
            default:
                ((CacheBehaviorLogger) this.A02).logger.markerPoint(((Number) obj).intValue(), ((1QS) this.A01).A04, this.A03, this.A04);
                break;
        }
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, this.A03, this.A04);
        return C60340gF.A00;
    }
}
