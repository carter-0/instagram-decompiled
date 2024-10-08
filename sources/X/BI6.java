package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BI6 extends AnonymousClass0T0 implements C46311DUo {
    public final Float A00;
    public final Float A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final BI6 FD3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BI6) {
                BI6 bi6 = (BI6) obj;
                if (!0qQ.A0K(this.A02, bi6.A02) || !0qQ.A0K(this.A03, bi6.A03) || !0qQ.A0K(this.A04, bi6.A04) || !0qQ.A0K(this.A05, bi6.A05) || !0qQ.A0K(this.A06, bi6.A06) || !0qQ.A0K(this.A00, bi6.A00) || !0qQ.A0K(this.A01, bi6.A01) || !0qQ.A0K(this.A07, bi6.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AZZ() {
        return this.A02;
    }

    public final String AZg() {
        return this.A03;
    }

    public final String AnP() {
        return this.A04;
    }

    public final String AnQ() {
        return this.A05;
    }

    public final String BHm() {
        return this.A06;
    }

    public final Float BLe() {
        return this.A00;
    }

    public final Float BOb() {
        return this.A01;
    }

    public final String CHd() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUserAdditionalBusinessAddressDict", C44560Cgu.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + C41845B3m.A00(this.A07);
    }

    public BI6(Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = str6;
    }
}
