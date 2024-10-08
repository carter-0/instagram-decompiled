package X;

/* renamed from: X.8vc  reason: invalid class name and case insensitive filesystem */
public final class C369968vc extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass9P8 A03;
    public final C2801950r A04;
    public final AnonymousClass51R A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C369968vc(AnonymousClass9P8 r2, C2801950r r3, AnonymousClass51R r4, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A09 = str;
        this.A04 = r3;
        this.A02 = j;
        this.A0C = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A0A = str5;
        this.A05 = r4;
        this.A00 = i;
        this.A03 = r2;
        this.A0E = z;
        this.A01 = j2;
        this.A0B = str6;
        this.A06 = l;
        this.A0G = z2;
        this.A0F = z3;
        if (str4 == null) {
            if (r4 != null) {
                str4 = r4.A0E;
            } else {
                str4 = null;
            }
        }
        this.A0D = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C369968vc) {
                C369968vc r8 = (C369968vc) obj;
                if (!0qQ.A0K(this.A09, r8.A09) || this.A04 != r8.A04 || this.A02 != r8.A02 || !0qQ.A0K(this.A0C, r8.A0C) || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A0A, r8.A0A) || !0qQ.A0K(this.A05, r8.A05) || this.A00 != r8.A00 || !0qQ.A0K(this.A03, r8.A03) || this.A0E != r8.A0E || this.A01 != r8.A01 || !0qQ.A0K(this.A0B, r8.A0B) || !0qQ.A0K(this.A06, r8.A06) || this.A0G != r8.A0G || this.A0F != r8.A0F) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        C2801950r r2 = this.A04;
        if (r2 == C2801950r.FEED_POST || r2 == C2801950r.CLIPS) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        long j = this.A02;
        int hashCode8 = ((((this.A09.hashCode() * 31) + this.A04.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.A0C;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.A07;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A0A;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        AnonymousClass51R r0 = this.A05;
        if (r0 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r0.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.A00) * 31;
        AnonymousClass9P8 r02 = this.A03;
        if (r02 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r02.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        int i8 = 1237;
        if (this.A0E) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        long j2 = this.A01;
        int i10 = (i9 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str5 = this.A0B;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        Long l = this.A06;
        if (l != null) {
            i = l.hashCode();
        }
        int i12 = (i11 + i) * 31;
        int i13 = 1237;
        if (this.A0G) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0F) {
            i15 = 1231;
        }
        return i14 + i15;
    }
}
