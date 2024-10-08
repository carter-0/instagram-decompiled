package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3y9  reason: invalid class name and case insensitive filesystem */
public final class C257903y9 extends AnonymousClass0T0 implements C257913yA {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;

    public C257903y9(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4) {
        0qQ.A0B(str2, 4);
        this.A09 = list;
        this.A04 = str;
        this.A00 = num;
        this.A05 = str2;
        this.A01 = num2;
        this.A06 = str3;
        this.A0A = list2;
        this.A02 = num3;
        this.A03 = num4;
        this.A07 = str4;
        this.A0B = list3;
        this.A0C = list4;
        this.A08 = str5;
    }

    public final C257903y9 FGZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257903y9) {
                C257903y9 r5 = (C257903y9) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A09;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.A05.hashCode()) * 31;
        Integer num2 = this.A01;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A0A;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A03;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list3 = this.A0B;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A0C;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.A08;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode11 + i;
    }

    public final List Agl() {
        return this.A09;
    }

    public final String Ald() {
        return this.A04;
    }

    public final Integer Aw5() {
        return this.A00;
    }

    public final Integer BG7() {
        return this.A01;
    }

    public final String BGL() {
        return this.A06;
    }

    public final List BGN() {
        return this.A0A;
    }

    public final Integer BGQ() {
        return this.A02;
    }

    public final Integer BSy() {
        return this.A03;
    }

    public final String C27() {
        return this.A07;
    }

    public final List C2d() {
        return this.A0B;
    }

    public final List C7t() {
        return this.A0C;
    }

    public final String C7u() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelsAdMidSceneInfoDict", C55156Hd8.A00(this));
    }

    public final String getFormat() {
        return this.A05;
    }
}
