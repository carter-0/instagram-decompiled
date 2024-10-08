package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.BIa  reason: case insensitive filesystem */
public final class C42122BIa extends AnonymousClass0T0 implements C46303DUg {
    public final C42039BEr A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final C42122BIa FEX() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42122BIa) {
                C42122BIa bIa = (C42122BIa) obj;
                if (!0qQ.A0K(this.A01, bIa.A01) || !0qQ.A0K(this.A00, bIa.A00) || !0qQ.A0K(this.A02, bIa.A02) || !0qQ.A0K(this.A03, bIa.A03) || !0qQ.A0K(this.A04, bIa.A04) || !0qQ.A0K(this.A05, bIa.A05) || !0qQ.A0K(this.A06, bIa.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean Akv() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ DUL AyR() {
        return this.A00;
    }

    public final String AyU() {
        return this.A02;
    }

    public final String AyV() {
        return this.A03;
    }

    public final String Bfj() {
        return this.A04;
    }

    public final String Bgt() {
        return this.A05;
    }

    public final String CHX() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTFundRaiserConsumptionSheetConfig", C44857Cm8.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A06);
    }

    public C42122BIa(C42039BEr bEr, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A01 = bool;
        this.A00 = bEr;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
