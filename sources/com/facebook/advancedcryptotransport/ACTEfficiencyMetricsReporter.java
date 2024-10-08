package com.facebook.advancedcryptotransport;

import X.0a1;
import X.AnonymousClass0Bn;

public class ACTEfficiencyMetricsReporter {
    public static void addBytesReadCount(int i) {
        AnonymousClass0Bn r7 = AnonymousClass0Bn.A01;
        long j = (long) i;
        synchronized (r7) {
            0a1 r4 = r7.A00;
            r4.A07 += j;
            r4.A08++;
            long now = AnonymousClass0Bn.A03.now();
            AnonymousClass0Bn.A02.A00(now - 5, now);
        }
    }

    public static void addBytesWrittenCount(int i) {
        AnonymousClass0Bn r7 = AnonymousClass0Bn.A01;
        long j = (long) i;
        synchronized (r7) {
            0a1 r4 = r7.A00;
            r4.A09 += j;
            r4.A0A++;
            long now = AnonymousClass0Bn.A03.now();
            AnonymousClass0Bn.A02.A00(now - 5, now);
        }
    }
}
