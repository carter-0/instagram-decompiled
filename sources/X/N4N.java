package X;

import com.facebook.common.dextricks.Constants;
import java.util.List;
import java.util.Map;

public final class N4N extends AnonymousClass0T0 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final C15051ULh A05;
    public final C61041Jvf A06;
    public final N3M A07;
    public final 1Xj A08;
    public final OEW A09;
    public final C69628NpA A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final Map A0I;
    public final Map A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final String A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N4N) {
                N4N n4n = (N4N) obj;
                if (!0qQ.A0K(this.A0H, n4n.A0H) || !0qQ.A0K(this.A07, n4n.A07) || !0qQ.A0K(this.A09, n4n.A09) || this.A0C != n4n.A0C || !0qQ.A0K(this.A0A, n4n.A0A) || !0qQ.A0K(this.A0F, n4n.A0F) || this.A04 != n4n.A04 || this.A0K != n4n.A0K || !0qQ.A0K(this.A0J, n4n.A0J) || this.A03 != n4n.A03 || this.A0M != n4n.A0M || !0qQ.A0K(this.A00, n4n.A00) || !0qQ.A0K(this.A0D, n4n.A0D) || !0qQ.A0K(this.A0O, n4n.A0O) || !0qQ.A0K(this.A0G, n4n.A0G) || !0qQ.A0K(this.A0E, n4n.A0E) || !0qQ.A0K(this.A05, n4n.A05) || !0qQ.A0K(this.A0B, n4n.A0B) || !0qQ.A0K(this.A08, n4n.A08) || !0qQ.A0K(this.A0I, n4n.A0I) || this.A01 != n4n.A01 || this.A0N != n4n.A0N || this.A02 != n4n.A02 || this.A0L != n4n.A0L || !0qQ.A0K(this.A06, n4n.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K2 = (((AnonymousClass7TE.A0K(this.A0H) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31;
        int intValue = this.A0C.intValue();
        switch (intValue) {
            case 1:
                str = "Idle";
                break;
            case 2:
                str = "Loading";
                break;
            case 3:
                str = "Error";
                break;
            default:
                str = "Start";
                break;
        }
        int A0F2 = C51971G9r.A0F(str, intValue, A0K2);
        int A092 = AnonymousClass7TF.A09(this.A0K, (((AnonymousClass7TF.A07(this.A0A, A0F2) + AnonymousClass7TG.A0E(this.A0F)) * 31) + this.A04) * 31);
        boolean z = this.A0M;
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A07(this.A0I, (((((((((((((((AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A0J, A092) + this.A03) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0O)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A08)) * 31))))));
    }

    public N4N(C15051ULh uLh, C61041Jvf jvf, N3M n3m, 1Xj r5, OEW oew, C69628NpA npA, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, Map map2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0H = list;
        this.A07 = n3m;
        this.A09 = oew;
        this.A0C = num;
        this.A0A = npA;
        this.A0F = str;
        this.A04 = i;
        this.A0K = z;
        this.A0J = map;
        this.A03 = i2;
        this.A0M = z2;
        this.A00 = str2;
        this.A0D = str3;
        this.A0O = str4;
        this.A0G = str5;
        this.A0E = str6;
        this.A05 = uLh;
        this.A0B = num2;
        this.A08 = r5;
        this.A0I = map2;
        this.A01 = z3;
        this.A0N = z4;
        this.A02 = z5;
        this.A0L = z6;
        this.A06 = jvf;
    }

    public static /* synthetic */ N4N A00(C15051ULh uLh, C61041Jvf jvf, N3M n3m, 1Xj r25, OEW oew, C69628NpA npA, N4N n4n, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, Map map, Map map2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C61041Jvf jvf2 = jvf;
        int i4 = i3;
        boolean z7 = z6;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        Map map3 = map2;
        Integer num3 = num2;
        C15051ULh uLh2 = uLh;
        1Xj r21 = r25;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        N3M n3m2 = n3m;
        Map map4 = map;
        OEW oew2 = oew;
        int i5 = i;
        Integer num4 = num;
        boolean z11 = z;
        C69628NpA npA2 = npA;
        int i6 = i2;
        String str8 = str;
        boolean z12 = z2;
        String str9 = str2;
        String str10 = str3;
        String str11 = null;
        N4N n4n2 = n4n;
        if ((i4 & 1) != 0) {
            list2 = n4n2.A0H;
        }
        if ((i4 & 2) != 0) {
            n3m2 = n4n2.A07;
        }
        if ((i4 & 4) != 0) {
            oew2 = n4n2.A09;
        }
        if ((i4 & 8) != 0) {
            num4 = n4n2.A0C;
        }
        if ((i4 & 16) != 0) {
            npA2 = n4n2.A0A;
        }
        if ((i4 & 32) != 0) {
            str8 = n4n2.A0F;
        }
        if ((i4 & 64) != 0) {
            i5 = n4n2.A04;
        }
        if ((i4 & 128) != 0) {
            z11 = n4n2.A0K;
        }
        if ((i4 & 256) != 0) {
            map4 = n4n2.A0J;
        }
        if ((i4 & 512) != 0) {
            i6 = n4n2.A03;
        }
        if ((i4 & 1024) != 0) {
            z12 = n4n2.A0M;
        }
        if ((i4 & C249703kE.FLAG_MOVED) != 0) {
            str9 = n4n2.A00;
        }
        if ((i4 & 4096) != 0) {
            str10 = n4n2.A0D;
        }
        if ((i4 & 8192) != 0) {
            str11 = n4n2.A0O;
        }
        if ((i4 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str7 = n4n2.A0G;
        }
        if ((32768 & i4) != 0) {
            str6 = n4n2.A0E;
        }
        if ((65536 & i4) != 0) {
            uLh2 = n4n2.A05;
        }
        if ((131072 & i4) != 0) {
            num3 = n4n2.A0B;
        }
        if ((262144 & i4) != 0) {
            r21 = n4n2.A08;
        }
        if ((524288 & i4) != 0) {
            map3 = n4n2.A0I;
        }
        if ((1048576 & i4) != 0) {
            z10 = n4n2.A01;
        }
        if ((2097152 & i4) != 0) {
            z9 = n4n2.A0N;
        }
        if ((4194304 & i4) != 0) {
            z8 = n4n2.A02;
        }
        if ((8388608 & i4) != 0) {
            z7 = n4n2.A0L;
        }
        if ((i4 & 16777216) != 0) {
            jvf2 = n4n2.A06;
        }
        AnonymousClass7TG.A0w(0, list2, num4, npA2);
        C66581MXm.A1P(map4, 8, map3);
        0qQ.A0B(jvf2, 24);
        return new N4N(uLh2, jvf2, n3m2, r21, oew2, npA2, num4, num3, str8, str9, str10, str11, str7, str6, list2, map4, map3, i5, i6, z11, z12, z10, z9, z8, z7);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N4N() {
        /*
            r26 = this;
            r1 = 0
            X.0sn r15 = X.0sn.A00
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.Nfx r6 = X.C69174Nfx.A00
            r18 = 0
            X.0sm r16 = X.0Yt.A0E()
            java.util.LinkedHashMap r17 = X.AnonymousClass7TE.A1H()
            X.Jvf r2 = new X.Jvf
            r2.<init>()
            r0 = r26
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4N.<init>():void");
    }
}
