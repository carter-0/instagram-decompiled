package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4l0  reason: invalid class name and case insensitive filesystem */
public final class C272594l0 {
    public final LightweightQuickPerformanceLogger A00;
    public final Set A01;
    public final CopyOnWriteArraySet A02;
    public final int[] A03;
    public final int[] A04;

    public C272594l0(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A00 = lightweightQuickPerformanceLogger;
        01s r4 = new 01s(10);
        int A002 = r4.A00();
        int[] iArr = new int[A002];
        for (int i = 0; i < A002; i++) {
            iArr[i] = r4.A01(i);
        }
        this.A04 = iArr;
        01s r42 = new 01s(10);
        int A003 = r42.A00();
        int[] iArr2 = new int[A003];
        for (int i2 = 0; i2 < A003; i2++) {
            iArr2[i2] = r42.A01(i2);
        }
        this.A03 = iArr2;
        this.A02 = new CopyOnWriteArraySet();
        this.A01 = new HashSet();
    }
}
