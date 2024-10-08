package X;

/* renamed from: X.5wP  reason: invalid class name and case insensitive filesystem */
public abstract class C300025wP {
    public static void A00(0xI r5, C254213s7 r6) {
        r5.A0B("max_duration_ms", Long.valueOf(r6.A04));
        r5.A0B("sum_duration_ms", Long.valueOf(r6.A05));
        long j = r6.A02;
        if (j > 500) {
            r5.A0B("legacy_duration_ms", Long.valueOf(j));
        }
    }
}
