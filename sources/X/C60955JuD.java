package X;

import java.util.Currency;

/* renamed from: X.JuD  reason: case insensitive filesystem */
public final class C60955JuD extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Currency A07;

    public C60955JuD(String str, String str2, String str3, String str4, Currency currency, int i, int i2, int i3) {
        0qQ.A0B(currency, 4);
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A07 = currency;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60955JuD) {
                C60955JuD juD = (C60955JuD) obj;
                if (!0qQ.A0K(this.A06, juD.A06) || !0qQ.A0K(this.A05, juD.A05) || this.A00 != juD.A00 || !0qQ.A0K(this.A07, juD.A07) || this.A01 != juD.A01 || this.A02 != juD.A02 || !0qQ.A0K(this.A03, juD.A03) || !0qQ.A0K(this.A04, juD.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A07, (((AnonymousClass7TE.A0O(this.A06) + AnonymousClass7TG.A0E(this.A05)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }
}
