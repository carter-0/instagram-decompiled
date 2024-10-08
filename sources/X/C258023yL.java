package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3yL  reason: invalid class name and case insensitive filesystem */
public final class C258023yL extends AnonymousClass0T0 implements C258033yM {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final C258023yL FFE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C258023yL) {
                C258023yL r5 = (C258023yL) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.A05;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A06;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0A;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.A03;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A04;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode10 + i;
    }

    public final Integer B1a() {
        return this.A01;
    }

    public final Long B6w() {
        return this.A05;
    }

    public final String BEL() {
        return this.A06;
    }

    public final String BEP() {
        return this.A07;
    }

    public final Integer BFy() {
        return this.A02;
    }

    public final String BJi() {
        return this.A08;
    }

    public final String BfV() {
        return this.A09;
    }

    public final Integer C3T() {
        return this.A03;
    }

    public final Integer C3U() {
        return this.A04;
    }

    public final Boolean CZz() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryEndSceneDict", C44908Cmy.A00(this));
    }

    public final String getSubtitle() {
        return this.A0A;
    }

    public C258023yL(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A01 = num;
        this.A05 = l;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = num2;
        this.A00 = bool;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A03 = num3;
        this.A04 = num4;
    }
}
