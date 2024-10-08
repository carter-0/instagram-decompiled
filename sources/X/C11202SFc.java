package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.SFc  reason: case insensitive filesystem */
public final class C11202SFc {
    public static final Integer A07 = AnonymousClass05K.A01;
    public S0D A00;
    public C10815Ryb A01;
    public C276224ss A02;
    public C10941S1x A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C11202SFc(S0D s0d, C10815Ryb ryb, C276224ss r25, C10941S1x s1x, String str, boolean z, boolean z2) {
        S0D s0d2 = s0d;
        C276224ss r7 = r25;
        C10941S1x s1x2 = s1x;
        this.A01 = ryb == null ? new C10815Ryb((Float) null, A07, 30000L, 100.0f, 0.6666667f, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, 120000, 500, 10000) : ryb;
        this.A03 = s1x == null ? new C10941S1x(10000, 30000) : s1x2;
        this.A02 = r25 == null ? C276224ss.A00() : r7;
        this.A05 = z;
        this.A00 = s0d == null ? new S0D(50) : s0d2;
        this.A06 = z2;
        this.A04 = str;
    }
}
