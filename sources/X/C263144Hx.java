package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4Hx  reason: invalid class name and case insensitive filesystem */
public final class C263144Hx extends AnonymousClass0T0 implements AnonymousClass4Hy {
    public final C263134Hw A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final C263144Hx FEU() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C263144Hx) {
                C263144Hx r5 = (C263144Hx) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A01;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C263134Hw r0 = this.A00;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A08;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public final Boolean Akv() {
        return this.A01;
    }

    public final C263134Hw AyS() {
        return this.A00;
    }

    public final String AyU() {
        return this.A04;
    }

    public final String AyV() {
        return this.A05;
    }

    public final Boolean BCQ() {
        return this.A02;
    }

    public final String Bfj() {
        return this.A06;
    }

    public final String Bgt() {
        return this.A07;
    }

    public final String CHX() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTConsumptionSheetConfig", C41883B5b.A00(this));
    }

    public final String getCurrency() {
        return this.A03;
    }

    public C263144Hx(C263134Hw r1, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = bool;
        this.A03 = str;
        this.A00 = r1;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool2;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
    }
}
