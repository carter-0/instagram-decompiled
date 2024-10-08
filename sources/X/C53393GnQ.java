package X;

import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;

/* renamed from: X.GnQ  reason: case insensitive filesystem */
public final class C53393GnQ extends AnonymousClass0T0 {
    public final C54672HOd A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final HM5 A04;
    public final HM6 A05;
    public final C54635HLs A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53393GnQ) {
                C53393GnQ gnQ = (C53393GnQ) obj;
                if (!0qQ.A0K(this.A09, gnQ.A09) || !0qQ.A0K(this.A0D, gnQ.A0D) || this.A05 != gnQ.A05 || !0qQ.A0K(this.A07, gnQ.A07) || !0qQ.A0K(this.A08, gnQ.A08) || !0qQ.A0K(this.A02, gnQ.A02) || !0qQ.A0K(this.A03, gnQ.A03) || !0qQ.A0K(this.A0C, gnQ.A0C) || !0qQ.A0K(this.A0B, gnQ.A0B) || !0qQ.A0K(this.A0A, gnQ.A0A) || this.A0F != gnQ.A0F || this.A04 != gnQ.A04 || this.A06 != gnQ.A06 || this.A0G != gnQ.A0G || !0qQ.A0K(this.A0E, gnQ.A0E) || this.A00 != gnQ.A00 || !0qQ.A0K(this.A01, gnQ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C53393GnQ(C54672HOd hOd, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, HM5 hm5, HM6 hm6, C54635HLs hLs, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        0qQ.A0B(str4, 9);
        String str7 = str6;
        C51973G9u.A0v(13, hLs, str7, hOd);
        this.A09 = str;
        this.A0D = str2;
        this.A05 = hm6;
        this.A07 = num;
        this.A08 = num2;
        this.A02 = immutableList;
        this.A03 = immutableList2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0A = str5;
        this.A0F = z;
        this.A04 = hm5;
        this.A06 = hLs;
        this.A0G = z2;
        this.A0E = str7;
        this.A00 = hOd;
        this.A01 = immutableList3;
    }

    public static /* synthetic */ C53393GnQ A00(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, HM5 hm5, HM6 hm6, C54635HLs hLs, C53393GnQ gnQ, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        boolean z2;
        String str6;
        ImmutableList immutableList4 = immutableList3;
        int i2 = i;
        String str7 = str;
        String str8 = str2;
        HM6 hm62 = hm6;
        Integer num3 = num;
        Integer num4 = num2;
        ImmutableList immutableList5 = immutableList;
        String str9 = str5;
        ImmutableList immutableList6 = immutableList2;
        String str10 = str3;
        String str11 = str4;
        boolean z3 = z;
        HM5 hm52 = hm5;
        C54635HLs hLs2 = hLs;
        C54672HOd hOd = null;
        C53393GnQ gnQ2 = gnQ;
        if ((i & 1) != 0) {
            str7 = gnQ2.A09;
        }
        if ((i & 2) != 0) {
            str8 = gnQ2.A0D;
        }
        if ((i & 4) != 0) {
            hm62 = gnQ2.A05;
        }
        if ((i & 8) != 0) {
            num3 = gnQ2.A07;
        }
        if ((i & 16) != 0) {
            num4 = gnQ2.A08;
        }
        if ((i & 32) != 0) {
            immutableList5 = gnQ2.A02;
        }
        if ((i & 64) != 0) {
            immutableList6 = gnQ2.A03;
        }
        if ((i2 & 128) != 0) {
            str10 = gnQ2.A0C;
        }
        if ((i2 & 256) != 0) {
            str11 = gnQ2.A0B;
        }
        if ((i2 & 512) != 0) {
            str9 = gnQ2.A0A;
        }
        if ((i2 & 1024) != 0) {
            z3 = gnQ2.A0F;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            hm52 = gnQ2.A04;
        }
        if ((i2 & 4096) != 0) {
            hLs2 = gnQ2.A06;
        }
        if ((i2 & 8192) != 0) {
            z2 = gnQ2.A0G;
        } else {
            z2 = false;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str6 = gnQ2.A0E;
        } else {
            str6 = null;
        }
        if ((i & Constants.LOAD_RESULT_PGO) != 0) {
            hOd = gnQ2.A00;
        }
        if ((i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            immutableList4 = gnQ2.A01;
        }
        AnonymousClass7TG.A1S(immutableList5, immutableList6);
        DbW.A1P(str11, 8, hLs2);
        C51973G9u.A0v(14, str6, hOd, immutableList4);
        return new C53393GnQ(hOd, immutableList5, immutableList6, immutableList4, hm52, hm62, hLs2, num3, num4, str7, str8, str10, str11, str9, str6, z3, z2);
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, ((((((((AnonymousClass7TG.A0E(this.A09) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31);
        String str = this.A0B;
        boolean z = this.A0F;
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A0E, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A07(this.A06, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A07(this.A03, A072) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31)))));
    }

    public static void A03(0Df r2, 05G r3) {
        0Df.A00(r2, ((C53393GnQ) r3.getValue()).A0E, "waterfall_id");
    }
}
