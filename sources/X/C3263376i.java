package X;

import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* renamed from: X.76i  reason: invalid class name and case insensitive filesystem */
public abstract class C3263376i {
    public static final DirectThreadAnalyticsParams A00(AnonymousClass7SD r5, boolean z) {
        long j;
        String C6k;
        Long A0n;
        0qQ.A0B(r5, 0);
        long j2 = 1 + ((long) r5.A03);
        C3263576k A00 = C3263476j.A00(z, r5.A0r);
        AnonymousClass2Ep r0 = r5.A0K;
        if (r0 == null || (C6k = r0.C6k()) == null || (A0n = 00y.A0n(10, C6k)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        return new DirectThreadAnalyticsParams(A00, j2, j);
    }

    public static final DirectThreadAnalyticsParams A01(AnonymousClass2Ep r5, boolean z) {
        long j;
        Long A0n;
        long BRT = (long) r5.BRT();
        C3263576k A00 = C3263476j.A00(z, r5.CUG());
        String C6k = r5.C6k();
        if (C6k == null || (A0n = 00y.A0n(10, C6k)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        return new DirectThreadAnalyticsParams(A00, BRT, j);
    }
}
