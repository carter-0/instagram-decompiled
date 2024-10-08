package X;

/* renamed from: X.Vs3  reason: case insensitive filesystem */
public final class C18455Vs3 {
    public long A00 = 0;
    public long A01 = 0;
    public volatile long A02;

    public static void A00(C18455Vs3 vs3) {
        if (vs3.A01 == 0) {
            0KC.A0C("AnomalyDetector", "Detected Anomaly - all outputs disabled");
            vs3.A02++;
        }
        long j = vs3.A01;
        long j2 = vs3.A00;
        if (j > j2) {
            0KC.A0O("AnomalyDetector", "Detected Anomaly - didn't complete all draws to output %d > %d", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
            vs3.A02++;
        }
        vs3.A01 = 0;
        vs3.A00 = 0;
    }
}
