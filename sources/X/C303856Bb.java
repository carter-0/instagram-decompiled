package X;

/* renamed from: X.6Bb  reason: invalid class name and case insensitive filesystem */
public final class C303856Bb extends AnonymousClass0T0 implements C299575vQ {
    public final AnonymousClass9IC A00;
    public final C299505vJ A01;
    public final Integer A02;
    public final AnonymousClass62P A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final String A08;

    public C303856Bb(AnonymousClass9IC r3, C299505vJ r4, Integer num, AnonymousClass62P r6, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(r3, 2);
        0qQ.A0B(r6, 3);
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A02 = num;
        this.A08 = C299615vU.A01(this, "carousel", r4.A03);
    }

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C303856Bb) {
                C303856Bb r5 = (C303856Bb) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || this.A05 != r5.A05 || this.A06 != r5.A06 || this.A04 != r5.A04 || this.A07 != r5.A07 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A08;
    }

    public final C299505vJ Be5() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        Integer num = this.A02;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i8 + hashCode;
    }
}
