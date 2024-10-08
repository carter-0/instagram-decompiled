package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Wg8  reason: case insensitive filesystem */
public final class C19827Wg8 implements C59556JOc {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ V3Z A02;
    public final /* synthetic */ C21044XAx A03;
    public final /* synthetic */ C273454mb A04;

    public C19827Wg8(V3Z v3z, C21044XAx xAx, C273454mb r3) {
        this.A03 = xAx;
        this.A02 = v3z;
        this.A04 = r3;
    }

    public final double A00() {
        double d;
        long Atx = (long) this.A04.Atx();
        if (Long.valueOf(Atx) != null) {
            d = (double) Atx;
        } else {
            d = 0.0d;
        }
        return d / 1000.0d;
    }

    public final void DrZ(long j) {
        double d;
        double d2;
        try {
            C21044XAx xAx = this.A03;
            if (xAx != null) {
                V3Z v3z = this.A02;
                C17273VPa vPa = v3z.A00;
                if (j >= 1000 && !this.A00) {
                    if (vPa != null) {
                        long currentPositionMs = (long) vPa.A00.getCurrentPositionMs();
                        if (Long.valueOf(currentPositionMs) != null) {
                            d2 = (double) currentPositionMs;
                        } else {
                            d2 = 0.0d;
                        }
                        xAx.CiM(d2 / 1000.0d, A00());
                    } else {
                        xAx.CiM(-2000.0d / 1000.0d, A00());
                    }
                    this.A00 = true;
                } else if (j >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT && !this.A01) {
                    if (vPa != null) {
                        long currentPositionMs2 = (long) vPa.A00.getCurrentPositionMs();
                        if (Long.valueOf(currentPositionMs2) != null) {
                            d = (double) currentPositionMs2;
                        } else {
                            d = 0.0d;
                        }
                        xAx.CiN(d / 1000.0d, A00());
                    } else {
                        xAx.CiN(-2000.0d / 1000.0d, A00());
                    }
                    this.A01 = true;
                    GVI gvi = v3z.A01;
                    if (gvi != null) {
                        gvi.A00();
                    }
                    v3z.A01 = null;
                    v3z.A00 = null;
                }
            }
        } catch (NullPointerException e) {
            0wb.A06("PlayerProgressTimer", "Can't log progress due to NPE", e);
        }
    }
}
