package X;

import java.math.BigInteger;

/* renamed from: X.XvZ  reason: case insensitive filesystem */
public final class C22109XvZ implements C13511Tbc {
    public final /* synthetic */ C22121Xvl A00;

    public C22109XvZ(C22121Xvl xvl) {
        this.A00 = xvl;
    }

    public final S5O Br9(long j) {
        C22121Xvl xvl = this.A00;
        long j2 = xvl.A09;
        BigInteger valueOf = BigInteger.valueOf((((long) xvl.A0B.A00) * j) / 1000000);
        long j3 = xvl.A08;
        SJ4 sj4 = new SJ4(j, Math.max(j2, Math.min((j2 + valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(xvl.A05)).longValue()) - 30000, j3 - 1)));
        return new S5O(sj4, sj4);
    }
}
