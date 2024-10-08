package X;

/* renamed from: X.RQw  reason: case insensitive filesystem */
public abstract class C9145RQw {
    public final long A00(RE0 re0, int i, long j) {
        long j2;
        C8314Qnu qnu = (C8314Qnu) this;
        long C7E = j - qnu.A00.C7E();
        C8313Qnt qnt = (C8313Qnt) ((RLs) qnu.A01.get(re0));
        long j3 = qnt.A00;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) j3) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2))))), C7E), qnt.A01);
    }
}
