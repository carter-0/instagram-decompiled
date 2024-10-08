package X;

import java.util.List;

/* renamed from: X.BFg  reason: case insensitive filesystem */
public final class C42053BFg extends AnonymousClass0T0 implements DV1 {
    public final C41936B7n A00;
    public final C233492vo A01;
    public final long A02;
    public final 1Xj A03;
    public final Boolean A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;

    public final C42053BFg F6m(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42053BFg) {
                C42053BFg bFg = (C42053BFg) obj;
                if (!0qQ.A0K(this.A03, bFg.A03) || !0qQ.A0K(this.A05, bFg.A05) || !0qQ.A0K(this.A06, bFg.A06) || !0qQ.A0K(this.A07, bFg.A07) || !0qQ.A0K(this.A08, bFg.A08) || !0qQ.A0K(this.A01, bFg.A01) || !0qQ.A0K(this.A0F, bFg.A0F) || !0qQ.A0K(this.A04, bFg.A04) || this.A0G != bFg.A0G || !0qQ.A0K(this.A09, bFg.A09) || this.A02 != bFg.A02 || !0qQ.A0K(this.A0A, bFg.A0A) || !0qQ.A0K(this.A0B, bFg.A0B) || !0qQ.A0K(this.A00, bFg.A00) || !0qQ.A0K(this.A0C, bFg.A0C) || !0qQ.A0K(this.A0D, bFg.A0D) || !0qQ.A0K(this.A0E, bFg.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final 1Xj Aep() {
        return this.A03;
    }

    public final Long AiI() {
        return this.A05;
    }

    public final String Aij() {
        return this.A06;
    }

    public final String Aik() {
        return this.A07;
    }

    public final String Air() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ C233502vp Ana() {
        return this.A01;
    }

    public final boolean BAv() {
        return this.A0G;
    }

    public final long BJY() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ DSL BVo() {
        return this.A00;
    }

    public final String BVt() {
        return this.A0C;
    }

    public final String C9L() {
        return this.A0E;
    }

    public final String getMediaId() {
        return this.A0A;
    }

    public final String getMessage() {
        return this.A0B;
    }

    public final String getTitle() {
        return this.A0D;
    }

    public final int hashCode() {
        C233492vo r0 = this.A01;
        boolean z = this.A0G;
        int A012 = AnonymousClass7TF.A01(this.A02, (AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A07(r0, ((((((((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31);
        String str = this.A0C;
        return C41845B3m.A01(this.A0E, (AnonymousClass7TF.A08(str, (((AnonymousClass7TF.A08(this.A0A, A012) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A0D)) * 31);
    }

    public final DV1 E7l(1E9 r1) {
        return this;
    }

    public C42053BFg(C41936B7n b7n, 1Xj r5, C233492vo r6, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j, boolean z) {
        0qQ.A0B(r6, 6);
        0qQ.A0B(str5, 12);
        0qQ.A0B(str7, 15);
        String str10 = str9;
        0qQ.A0B(str10, 17);
        this.A03 = r5;
        this.A05 = l;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = r6;
        this.A0F = list;
        this.A04 = bool;
        this.A0G = z;
        this.A09 = str4;
        this.A02 = j;
        this.A0A = str5;
        this.A0B = str6;
        this.A00 = b7n;
        this.A0C = str7;
        this.A0D = str8;
        this.A0E = str10;
    }
}
