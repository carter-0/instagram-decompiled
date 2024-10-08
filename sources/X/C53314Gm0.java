package X;

import com.instagram.schools.management.data.SchoolAddress;

/* renamed from: X.Gm0  reason: case insensitive filesystem */
public final class C53314Gm0 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final SchoolAddress A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final AnonymousClass62P A06;
    public final AnonymousClass62P A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53314Gm0) {
                C53314Gm0 gm0 = (C53314Gm0) obj;
                if (!0qQ.A0K(this.A04, gm0.A04) || !0qQ.A0K(this.A02, gm0.A02) || this.A00 != gm0.A00 || this.A01 != gm0.A01 || !0qQ.A0K(this.A06, gm0.A06) || !0qQ.A0K(this.A05, gm0.A05) || this.A09 != gm0.A09 || this.A08 != gm0.A08 || !0qQ.A0K(this.A03, gm0.A03) || !0qQ.A0K(this.A07, gm0.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A04);
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A08(this.A05, (((((AnonymousClass7TF.A07(this.A02, A0O) + this.A00) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31)))) + AnonymousClass7TE.A0L(this.A07);
    }

    public C53314Gm0(SchoolAddress schoolAddress, String str, String str2, String str3, AnonymousClass62P r5, AnonymousClass62P r6, int i, int i2, boolean z, boolean z2) {
        this.A04 = str;
        this.A02 = schoolAddress;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r5;
        this.A05 = str2;
        this.A09 = z;
        this.A08 = z2;
        this.A03 = str3;
        this.A07 = r6;
    }
}
