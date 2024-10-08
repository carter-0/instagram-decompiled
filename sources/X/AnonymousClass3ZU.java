package X;

import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.3ZU  reason: invalid class name */
public final class AnonymousClass3ZU extends AnonymousClass0T0 {
    public final C381829cQ A00;
    public final AnonymousClass3ZV A01;
    public final AnonymousClass3ZH A02;
    public final AnonymousClass3ZS A03;
    public final AnonymousClass3W1 A04;
    public final Venue A05;
    public final AnonymousClass3ZT A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;

    public AnonymousClass3ZU(C381829cQ r2, AnonymousClass3ZV r3, AnonymousClass3ZH r4, AnonymousClass3ZS r5, AnonymousClass3W1 r6, Venue venue, AnonymousClass3ZT r8, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(num3, 6);
        this.A0E = z;
        this.A0G = num;
        this.A0H = num2;
        this.A0D = z2;
        this.A01 = r3;
        this.A07 = num3;
        this.A0F = z3;
        this.A0J = str;
        this.A05 = venue;
        this.A0A = list;
        this.A08 = str2;
        this.A0I = str3;
        this.A0C = z4;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r4;
        this.A04 = r6;
        this.A09 = str4;
        this.A0B = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3ZU) {
                AnonymousClass3ZU r5 = (AnonymousClass3ZU) obj;
                if (this.A0E != r5.A0E || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0H, r5.A0H) || this.A0D != r5.A0D || !0qQ.A0K(this.A01, r5.A01) || this.A07 != r5.A07 || this.A0F != r5.A0F || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0I, r5.A0I) || this.A0C != r5.A0C || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A09, r5.A09) || this.A0B != r5.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = 1237;
        if (this.A0E) {
            i = 1231;
        }
        int i2 = i * 31;
        Integer num = this.A0G;
        int i3 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Integer num2 = this.A0H;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        int i6 = 1237;
        if (this.A0D) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        AnonymousClass3ZV r0 = this.A01;
        if (r0 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r0.hashCode();
        }
        int A002 = (((i7 + hashCode3) * 31) + C44746CkF.A00(this.A07)) * 31;
        int i8 = 1237;
        if (this.A0F) {
            i8 = 1231;
        }
        int hashCode8 = (((A002 + i8) * 31) + this.A0J.hashCode()) * 31;
        Venue venue = this.A05;
        if (venue == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = venue.hashCode();
        }
        int hashCode9 = (((hashCode8 + hashCode4) * 31) + this.A0A.hashCode()) * 31;
        String str = this.A08;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i9 = (hashCode9 + hashCode5) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str2.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        int i11 = 1237;
        if (this.A0C) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        C381829cQ r02 = this.A00;
        if (r02 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r02.hashCode();
        }
        int hashCode10 = (((((((((i12 + hashCode7) * 31) + this.A03.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31;
        String str3 = this.A09;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        int i13 = (hashCode10 + i3) * 31;
        int i14 = 1237;
        if (this.A0B) {
            i14 = 1231;
        }
        return i13 + i14;
    }
}
