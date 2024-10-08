package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3IT  reason: invalid class name */
public final class AnonymousClass3IT extends AnonymousClass0T0 implements AnonymousClass3IU {
    public final Boolean A00;
    public final Boolean A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final AnonymousClass3IT F8I(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IT) {
                AnonymousClass3IT r5 = (AnonymousClass3IT) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.A02;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.A09;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.A03;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode9 + i;
    }

    public final String AYU() {
        return this.A04;
    }

    public final String Aum() {
        return this.A05;
    }

    public final Long BEY() {
        return this.A02;
    }

    public final String BVq() {
        return this.A06;
    }

    public final String BVt() {
        return this.A07;
    }

    public final String C9L() {
        return this.A08;
    }

    public final List C9t() {
        return this.A09;
    }

    public final Long CAg() {
        return this.A03;
    }

    public final Boolean Cc8() {
        return this.A00;
    }

    public final Boolean Cdn() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPromptsNetegoInStory", C44290CcY.A00(this));
    }

    public AnonymousClass3IT(Boolean bool, Boolean bool2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, List list) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = l;
        this.A00 = bool;
        this.A01 = bool2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = list;
        this.A03 = l2;
    }

    public final AnonymousClass3IU E83(1E9 r1) {
        return this;
    }
}
