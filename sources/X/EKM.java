package X;

import java.util.List;

public final class EKM extends C48170EaC {
    public C266444Yx A00;
    public final N4R A01;
    public final C61067Jw5 A02;
    public final C61059Jvx A03;
    public final C266444Yx A04;
    public final MQZ A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final Integer A0P;

    public EKM(N4R n4r, C61067Jw5 jw5, C61059Jvx jvx, C266444Yx r8, C266444Yx r9, MQZ mqz, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, List list5, List list6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List list7 = list2;
        AnonymousClass7TF.A1D(str, 1, list7);
        List list8 = list3;
        0qQ.A0B(list8, 8);
        0qQ.A0B(mqz, 14);
        List list9 = list5;
        0qQ.A0B(list9, 15);
        0qQ.A0B(num2, 19);
        this.A0A = str;
        this.A07 = str2;
        this.A0C = list;
        this.A0F = list7;
        this.A08 = str3;
        this.A0B = str4;
        this.A0P = num;
        this.A0D = list8;
        this.A0G = list4;
        this.A00 = r8;
        this.A01 = n4r;
        this.A02 = jw5;
        this.A03 = jvx;
        this.A05 = mqz;
        this.A0E = list9;
        this.A0L = z;
        this.A0N = z2;
        this.A0I = z3;
        this.A06 = num2;
        this.A0K = z4;
        this.A0O = z5;
        this.A0H = list6;
        this.A0J = z6;
        this.A09 = str5;
        this.A04 = r9;
        this.A0M = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EKM) {
                EKM ekm = (EKM) obj;
                if (!0qQ.A0K(this.A0A, ekm.A0A) || !0qQ.A0K(this.A07, ekm.A07) || !0qQ.A0K(this.A0C, ekm.A0C) || !0qQ.A0K(this.A0F, ekm.A0F) || !0qQ.A0K(this.A08, ekm.A08) || !0qQ.A0K(this.A0B, ekm.A0B) || !0qQ.A0K(this.A0P, ekm.A0P) || !0qQ.A0K(this.A0D, ekm.A0D) || !0qQ.A0K(this.A0G, ekm.A0G) || !0qQ.A0K(this.A00, ekm.A00) || !0qQ.A0K(this.A01, ekm.A01) || !0qQ.A0K(this.A02, ekm.A02) || !0qQ.A0K(this.A03, ekm.A03) || !0qQ.A0K(this.A05, ekm.A05) || !0qQ.A0K(this.A0E, ekm.A0E) || this.A0L != ekm.A0L || this.A0N != ekm.A0N || this.A0I != ekm.A0I || this.A06 != ekm.A06 || this.A0K != ekm.A0K || this.A0O != ekm.A0O || !0qQ.A0K(this.A0H, ekm.A0H) || this.A0J != ekm.A0J || !0qQ.A0K(this.A09, ekm.A09) || !0qQ.A0K(this.A04, ekm.A04) || this.A0M != ekm.A0M) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A0C, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A0A)));
        int A073 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A0G, AnonymousClass7TF.A07(this.A0D, (((((AnonymousClass7TF.A07(this.A0F, A072) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A0P)) * 31))));
        int A092 = AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TF.A07(this.A05, (AnonymousClass7TF.A07(this.A02, A073) + AnonymousClass7TG.A0C(this.A03)) * 31)))));
        int intValue = this.A06.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "WITH_DESCRIPTIONS";
        }
        int A074 = AnonymousClass7TF.A07(this.A0H, AnonymousClass7TF.A09(this.A0O, AnonymousClass7TF.A09(this.A0K, (A092 + str.hashCode() + intValue) * 31)));
        return DbS.A06(this.A0M, (((AnonymousClass7TF.A09(this.A0J, A074) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31);
    }
}
