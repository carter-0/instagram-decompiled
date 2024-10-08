package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.55I  reason: invalid class name */
public final class AnonymousClass55I extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1CY A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55I(1CY r4, String str, String str2, int i, long j) {
        super(718, 5, false, false);
        this.A02 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A00 = i;
    }

    public final void run() {
        1CY r3 = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        long j = this.A01;
        int i = this.A00;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = r3.A04;
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "LOAD_SOURCE", str);
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "END_STATUS", str2);
        lightweightQuickPerformanceLogger.markerEnd(23396353, i, 467, j, TimeUnit.MILLISECONDS);
        r3.A05.remove(Integer.valueOf(i));
        String str3 = "memory";
        if (0qQ.A0K(str, str3)) {
            1wo.A00().A01(i, "DISK", j);
        }
        int hashCode = str.hashCode();
        if (hashCode != -1077756671) {
            if (hashCode != 3083677) {
                if (hashCode == 1843485230 && str.equals("network")) {
                    str = "NETWORK";
                }
                1wo.A00().A02(i, str, j);
            }
            str3 = "disk";
        }
        if (str.equals(str3)) {
            str = "DISK";
        }
        1wo.A00().A02(i, str, j);
    }
}
