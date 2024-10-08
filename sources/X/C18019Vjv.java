package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Vjv  reason: case insensitive filesystem */
public final class C18019Vjv {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final int A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public C18019Vjv(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, double d, double d2, double d3, double d4, int i, int i2, boolean z) {
        this.A00 = d;
        this.A01 = d2;
        this.A04 = i;
        C11367SPk.A03(str, "mapAddress");
        this.A08 = str;
        this.A0B = z;
        this.A02 = d3;
        this.A03 = d4;
        C11367SPk.A03(immutableList, "pointOfInterestViewModels");
        this.A06 = immutableList;
        this.A05 = i2;
        this.A09 = str2;
        C11367SPk.A03(immutableList2, "sharerViewModels");
        this.A07 = immutableList2;
        C11367SPk.A03(str3, "userId");
        this.A0A = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18019Vjv) {
                C18019Vjv vjv = (C18019Vjv) obj;
                if (!(this.A00 == vjv.A00 && this.A01 == vjv.A01 && this.A04 == vjv.A04 && 0qQ.A0K(this.A08, vjv.A08) && this.A0B == vjv.A0B && this.A02 == vjv.A02 && this.A03 == vjv.A03 && 0qQ.A0K(this.A06, vjv.A06) && this.A05 == vjv.A05 && 0qQ.A0K(this.A09, vjv.A09) && 0qQ.A0K(this.A07, vjv.A07) && 0qQ.A0K(this.A0A, vjv.A0A))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((C11367SPk.A00(((((((C51968G9o.A03(Double.doubleToLongBits(this.A00)) + 31) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A01))) * 31) + this.A04) * 31) + C51971G9r.A0E(this.A08), this.A0B) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A02))) * 31) + C51968G9o.A03(Double.doubleToLongBits(this.A03))) * 31) + C51971G9r.A0E(this.A06)) * 31) + this.A05) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A0A);
    }
}
