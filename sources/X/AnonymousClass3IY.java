package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3IY  reason: invalid class name */
public final class AnonymousClass3IY extends AnonymousClass0T0 implements AnonymousClass3IZ {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;

    public final AnonymousClass3IY F7R() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IY) {
                AnonymousClass3IY r5 = (AnonymousClass3IY) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A03;
        int i = 0;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.A05;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A06;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A07;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A08;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A09;
        if (num6 != null) {
            i = num6.hashCode();
        }
        return hashCode9 + i;
    }

    public final Float Aec() {
        return this.A03;
    }

    public final Integer B6l() {
        return this.A04;
    }

    public final Integer BNT() {
        return this.A05;
    }

    public final Integer C01() {
        return this.A06;
    }

    public final Integer CFF() {
        return this.A07;
    }

    public final Integer CFG() {
        return this.A08;
    }

    public final Integer CG6() {
        return this.A09;
    }

    public final Boolean CUf() {
        return this.A00;
    }

    public final Boolean CUh() {
        return this.A01;
    }

    public final Boolean Cd5() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPersonalizationFeatures", CbP.A00(this));
    }

    public AnonymousClass3IY(Boolean bool, Boolean bool2, Boolean bool3, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.A03 = f;
        this.A04 = num;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A05 = num2;
        this.A06 = num3;
        this.A07 = num4;
        this.A08 = num5;
        this.A09 = num6;
    }
}
