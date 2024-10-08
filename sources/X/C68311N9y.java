package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.util.Map;

/* renamed from: X.N9y  reason: case insensitive filesystem */
public final class C68311N9y extends 1AY implements C60400gq {
    public final long[][] A00;

    public final Map B0o() {
        return null;
    }

    public final double A01(double d, long j, boolean z) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return d;
        }
        return C68311N9y.super.A01(d, A01, z);
    }

    public final long A02(long j, long j2, boolean z) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return j2;
        }
        return C68311N9y.super.A02(A01, j2, z);
    }

    public final 0U0 A03(long j) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return new 0U0(MobileConfigValueSource.DEFAULT__INVALID_CONFIG_PARAM_NAME);
        }
        return C68311N9y.super.A03(A01);
    }

    public final String A04(String str, long j, boolean z) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return str;
        }
        return C68311N9y.super.A04(str, A01, z);
    }

    public final boolean A05(long j, boolean z, boolean z2) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return z;
        }
        return C68311N9y.super.A05(A01, z, z2);
    }

    public final String BOC(long j) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return null;
        }
        return C68311N9y.super.BOC(A01);
    }

    public final int BOH(long j) {
        long A01 = 0UG.A01(this.A00, j);
        if (A01 == 0) {
            return 0;
        }
        return C68311N9y.super.BOH(A01);
    }

    public C68311N9y(AnonymousClass18N r1, 18J r2, 0Tv r3, AnonymousClass1A5 r4, long[][] jArr) {
        super(r1, r2, r3, r4);
        this.A00 = jArr;
    }
}
