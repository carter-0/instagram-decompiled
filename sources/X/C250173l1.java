package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3l1  reason: invalid class name and case insensitive filesystem */
public final class C250173l1 extends AnonymousClass0T0 implements C250183l2 {
    public final C269884fq A00;
    public final C269884fq A01;
    public final C269894fr A02;
    public final C269904fs A03;
    public final C269914ft A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;

    public final C250173l1 F0M() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250173l1) {
                C250173l1 r5 = (C250173l1) obj;
                if (!0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A08;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C269884fq r0 = this.A00;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        C269884fq r02 = this.A01;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C269894fr r03 = this.A02;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        C269904fs r04 = this.A03;
        int hashCode5 = (hashCode4 + (r04 == null ? 0 : r04.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C269914ft r05 = this.A04;
        if (r05 != null) {
            i = r05.hashCode();
        }
        return hashCode8 + i;
    }

    public final String Aa8() {
        return this.A08;
    }

    public final C269884fq B5D() {
        return this.A00;
    }

    public final C269884fq B5N() {
        return this.A01;
    }

    public final C269894fr B5T() {
        return this.A02;
    }

    public final C269904fs BIQ() {
        return this.A03;
    }

    public final C269914ft C0O() {
        return this.A04;
    }

    public final Boolean CTV() {
        return this.A05;
    }

    public final Boolean CTY() {
        return this.A06;
    }

    public final Boolean CaW() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAfiInfoDict", C52479GUh.A00(this));
    }

    public C250173l1(C269884fq r1, C269884fq r2, C269894fr r3, C269904fs r4, C269914ft r5, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.A08 = str;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A04 = r5;
    }
}
