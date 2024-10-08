package X;

import android.os.Debug;

/* renamed from: X.XwI  reason: case insensitive filesystem */
public final class C22153XwI implements Y9E {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.XSz, java.lang.Object, X.XIZ] */
    public final /* bridge */ /* synthetic */ C21292XSz BSt() {
        ? obj = new Object();
        try {
            obj.A07 = Debug.getRuntimeStat("art.gc.gc-count-rate-histogram");
            obj.A06 = Debug.getRuntimeStat("art.gc.blocking-gc-count-rate-histogram");
            String runtimeStat = Debug.getRuntimeStat("art.gc.bytes-allocated");
            if (runtimeStat != null) {
                obj.A04 = DbV.A0q(runtimeStat);
            }
            String runtimeStat2 = Debug.getRuntimeStat("art.gc.bytes-freed");
            if (runtimeStat2 != null) {
                obj.A05 = DbV.A0q(runtimeStat2);
            }
            String runtimeStat3 = Debug.getRuntimeStat("art.gc.gc-count");
            if (runtimeStat3 != null) {
                obj.A02 = DbV.A0q(runtimeStat3);
            }
            String runtimeStat4 = Debug.getRuntimeStat("art.gc.gc-time");
            if (runtimeStat4 != null) {
                obj.A03 = DbV.A0q(runtimeStat4);
            }
            String runtimeStat5 = Debug.getRuntimeStat("art.gc.blocking-gc-count");
            if (runtimeStat5 != null) {
                obj.A00 = DbV.A0q(runtimeStat5);
            }
            String runtimeStat6 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
            if (runtimeStat6 != null) {
                obj.A01 = DbV.A0q(runtimeStat6);
                return obj;
            }
        } catch (NumberFormatException e) {
            0KC.A0J("GCStatsMetricsCollector", e.getMessage(), e);
        }
        return obj;
    }
}
