package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.GnS  reason: case insensitive filesystem */
public final class C53395GnS extends AnonymousClass0T0 {
    public final int A00;
    public final C61084JwM A01;
    public final C61084JwM A02;
    public final HLB A03;
    public final I12 A04;
    public final L82 A05;
    public final HMG A06;
    public final Integer A07;
    public final AnonymousClass62P A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53395GnS) {
                C53395GnS gnS = (C53395GnS) obj;
                if (!(this.A06 == gnS.A06 && 0qQ.A0K(this.A04, gnS.A04) && 0qQ.A0K(this.A01, gnS.A01) && 0qQ.A0K(this.A02, gnS.A02) && 0qQ.A0K(this.A05, gnS.A05) && 0qQ.A0K(this.A08, gnS.A08) && this.A0A == gnS.A0A && this.A03 == gnS.A03 && this.A09 == gnS.A09 && this.A0B == gnS.A0B && this.A0C == gnS.A0C && this.A07 == gnS.A07 && this.A00 == gnS.A00 && this.A0G == gnS.A0G && this.A0E == gnS.A0E && this.A0F == gnS.A0F && this.A0D == gnS.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C53395GnS A00(C61084JwM jwM, C61084JwM jwM2, I12 i12, L82 l82, HMG hmg, C53395GnS gnS, Integer num, AnonymousClass62P r27, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3 = i2;
        boolean z9 = z3;
        int i4 = i;
        Integer num2 = num;
        boolean z10 = z2;
        boolean z11 = z;
        AnonymousClass62P r10 = r27;
        L82 l822 = l82;
        C61084JwM jwM3 = jwM2;
        C61084JwM jwM4 = jwM;
        I12 i122 = i12;
        HMG hmg2 = hmg;
        HLB hlb = null;
        C53395GnS gnS2 = gnS;
        if ((i2 & 1) != 0) {
            hmg2 = gnS2.A06;
        }
        if ((i2 & 2) != 0) {
            i122 = gnS2.A04;
        }
        if ((i2 & 4) != 0) {
            jwM4 = gnS2.A01;
        }
        if ((i2 & 8) != 0) {
            jwM3 = gnS2.A02;
        }
        if ((i2 & 16) != 0) {
            l822 = gnS2.A05;
        }
        if ((i2 & 32) != 0) {
            r10 = gnS2.A08;
        }
        if ((i2 & 64) != 0) {
            z11 = gnS2.A0A;
        }
        if ((i3 & 128) != 0) {
            hlb = gnS2.A03;
        }
        if ((i3 & 256) != 0) {
            z10 = gnS2.A09;
        }
        if ((i3 & 512) != 0) {
            z4 = gnS2.A0B;
        } else {
            z4 = false;
        }
        if ((i3 & 1024) != 0) {
            z5 = gnS2.A0C;
        } else {
            z5 = false;
        }
        if ((i3 & C249703kE.FLAG_MOVED) != 0) {
            num2 = gnS2.A07;
        }
        if ((i3 & 4096) != 0) {
            i4 = gnS2.A00;
        }
        if ((i3 & 8192) != 0) {
            z9 = gnS2.A0G;
        }
        if ((i3 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z6 = gnS2.A0E;
        } else {
            z6 = false;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO) != 0) {
            z7 = gnS2.A0F;
        } else {
            z7 = false;
        }
        if ((i2 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            z8 = gnS2.A0D;
        } else {
            z8 = false;
        }
        DbW.A1N(hmg2, 0, r10);
        0qQ.A0B(num2, 11);
        return new C53395GnS(jwM4, jwM3, hlb, i122, l822, hmg2, num2, r10, i4, z11, z10, z4, z5, z9, z6, z7, z8);
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A08, (((((((AnonymousClass7TE.A0K(this.A06) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A09, (AnonymousClass7TF.A09(this.A0A, A072) + AnonymousClass7TE.A0L(this.A03)) * 31));
        return DbS.A06(this.A0D, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0G, (((AnonymousClass7TF.A09(this.A0C, A092) + HYU.A00(this.A07)) * 31) + this.A00) * 31))));
    }

    public C53395GnS(C61084JwM jwM, C61084JwM jwM2, HLB hlb, I12 i12, L82 l82, HMG hmg, Integer num, AnonymousClass62P r9, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A06 = hmg;
        this.A04 = i12;
        this.A01 = jwM;
        this.A02 = jwM2;
        this.A05 = l82;
        this.A08 = r9;
        this.A0A = z;
        this.A03 = hlb;
        this.A09 = z2;
        this.A0B = z3;
        this.A0C = z4;
        this.A07 = num;
        this.A00 = i;
        this.A0G = z5;
        this.A0E = z6;
        this.A0F = z7;
        this.A0D = z8;
    }
}
