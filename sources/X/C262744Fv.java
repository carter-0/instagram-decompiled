package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.4Fv  reason: invalid class name and case insensitive filesystem */
public final class C262744Fv extends AnonymousClass0T0 {
    public final int A00;
    public final Drawable A01;
    public final C376529Ii A02;
    public final C61073JwB A03;
    public final AnonymousClass3W1 A04;
    public final AnonymousClass3VA A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final String A0I;

    public C262744Fv(Drawable drawable, C376529Ii r3, C61073JwB jwB, AnonymousClass3W1 r5, AnonymousClass3VA r6, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        0qQ.A0B(str, 2);
        this.A05 = r6;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = drawable;
        this.A00 = i;
        this.A0H = z;
        this.A0F = z2;
        this.A0E = z3;
        this.A0G = z4;
        this.A0A = z5;
        this.A08 = z6;
        this.A0B = z7;
        this.A09 = z8;
        this.A03 = jwB;
        this.A0I = str3;
        this.A0D = z9;
        this.A0C = z10;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C262744Fv) {
                C262744Fv r5 = (C262744Fv) obj;
                if (!(this.A05 == r5.A05 && 0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A01, r5.A01) && this.A00 == r5.A00 && this.A0H == r5.A0H && this.A0F == r5.A0F && this.A0E == r5.A0E && this.A0G == r5.A0G && this.A0A == r5.A0A && this.A08 == r5.A08 && this.A0B == r5.A0B && this.A09 == r5.A09 && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A0I, r5.A0I) && this.A0D == r5.A0D && this.A0C == r5.A0C && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A05.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31;
        Drawable drawable = this.A01;
        int i = 0;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i2 = (((hashCode2 + hashCode) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A0H) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0F) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0E) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0G) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0A) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A08) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A0B) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A09) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        C61073JwB jwB = this.A03;
        if (jwB != null) {
            i = jwB.hashCode();
        }
        int hashCode3 = (((i18 + i) * 31) + this.A0I.hashCode()) * 31;
        int i19 = 1237;
        if (this.A0D) {
            i19 = 1231;
        }
        int i20 = (hashCode3 + i19) * 31;
        int i21 = 1237;
        if (this.A0C) {
            i21 = 1231;
        }
        return ((((i20 + i21) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode();
    }
}
