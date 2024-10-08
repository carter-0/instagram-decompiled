package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
public final class C239593Hb extends AnonymousClass0T0 implements C239603Hc {
    public final C67241sS A00;
    public final C270864hR A01;
    public final C257593xe A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final C239593Hb FEw() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239593Hb) {
                C239593Hb r5 = (C239593Hb) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C257593xe r0 = this.A02;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C67241sS r02 = this.A00;
        int hashCode6 = (hashCode5 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C270864hR r03 = this.A01;
        int hashCode7 = (hashCode6 + (r03 == null ? 0 : r03.hashCode())) * 31;
        String str4 = this.A08;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A09;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0A;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.A04;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode10 + i;
    }

    public final String AYU() {
        return this.A05;
    }

    public final C257593xe AgG() {
        return this.A02;
    }

    public final String Aro() {
        return this.A06;
    }

    public final Integer B9V() {
        return this.A03;
    }

    public final C67241sS BJN() {
        return this.A00;
    }

    public final C270864hR BLm() {
        return this.A01;
    }

    public final String C9L() {
        return this.A0A;
    }

    public final Integer CEl() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAd4ad", C44891Cmh.A00(this));
    }

    public final String getId() {
        return this.A07;
    }

    public final String getMessage() {
        return this.A08;
    }

    public final String getTitle() {
        return this.A09;
    }

    public C239593Hb(C67241sS r1, C270864hR r2, C257593xe r3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A02 = r3;
        this.A06 = str2;
        this.A03 = num;
        this.A07 = str3;
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A04 = num2;
    }
}
