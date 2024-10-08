package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3Op  reason: invalid class name and case insensitive filesystem */
public final class C241283Op extends AnonymousClass0T0 implements C241293Oq {
    public final C270814hL A00;
    public final C241273Oo A01;
    public final User A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Float A06;
    public final Float A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;

    public C241283Op(C270814hL r2, C241273Oo r3, User user, Boolean bool, Boolean bool2, Boolean bool3, Float f, Float f2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, List list5) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str5, 15);
        0qQ.A0B(user, 18);
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A01 = r3;
        this.A03 = bool;
        this.A04 = bool2;
        this.A0C = str4;
        this.A05 = bool3;
        this.A0F = list;
        this.A08 = num;
        this.A0G = list2;
        this.A0H = list3;
        this.A00 = r2;
        this.A06 = f;
        this.A0D = str5;
        this.A0I = list4;
        this.A0J = list5;
        this.A02 = user;
        this.A0E = str6;
        this.A07 = f2;
    }

    public final C241283Op FC4(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C241283Op) {
                C241283Op r5 = (C241283Op) obj;
                if (!0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A09.hashCode() * 31;
        String str = this.A0A;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0B;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C241273Oo r0 = this.A01;
        int hashCode4 = (hashCode3 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A04;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A0C;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.A05;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.A0F;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A08;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.A0G;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A0H;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C270814hL r02 = this.A00;
        int hashCode13 = (hashCode12 + (r02 == null ? 0 : r02.hashCode())) * 31;
        Float f = this.A06;
        int hashCode14 = (((hashCode13 + (f == null ? 0 : f.hashCode())) * 31) + this.A0D.hashCode()) * 31;
        List list4 = this.A0I;
        int hashCode15 = (hashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.A0J;
        int hashCode16 = (((hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31) + this.A02.hashCode()) * 31;
        String str4 = this.A0E;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f2 = this.A07;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode17 + i;
    }

    public final String Aeo() {
        return this.A0A;
    }

    public final String AlL() {
        return this.A0B;
    }

    public final C241273Oo Aux() {
        return this.A01;
    }

    public final Boolean B6t() {
        return this.A03;
    }

    public final Boolean BCB() {
        return this.A04;
    }

    public final String BE9() {
        return this.A0C;
    }

    public final List BKX() {
        return this.A0F;
    }

    public final Integer BPt() {
        return this.A08;
    }

    public final List BQJ() {
        return this.A0G;
    }

    public final List BQO() {
        return this.A0H;
    }

    public final /* bridge */ /* synthetic */ C270824hM Bf3() {
        return this.A00;
    }

    public final Float Bpp() {
        return this.A06;
    }

    public final String BxN() {
        return this.A0D;
    }

    public final List BxQ() {
        return this.A0I;
    }

    public final List C76() {
        return this.A0J;
    }

    public final User CCd() {
        return this.A02;
    }

    public final String CDC() {
        return this.A0E;
    }

    public final Float CDL() {
        return this.A07;
    }

    public final Boolean CYE() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSuggestedUserDict", C44481Cfd.A00(this));
    }

    public final String getAlgorithm() {
        return this.A09;
    }

    public final C241293Oq E9F(1E9 r1) {
        return this;
    }
}
