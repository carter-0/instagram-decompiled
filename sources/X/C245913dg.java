package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3dg  reason: invalid class name and case insensitive filesystem */
public final class C245913dg extends AnonymousClass0T0 implements C245923dh {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final C245913dg F2n() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C245913dg) {
                C245913dg r5 = (C245913dg) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.A06;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A07;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A08;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A09;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode9 + i;
    }

    public final String AYn() {
        return this.A01;
    }

    public final String B2q() {
        return this.A02;
    }

    public final String B2v() {
        return this.A03;
    }

    public final String BIL() {
        return this.A04;
    }

    public final String BIM() {
        return this.A05;
    }

    public final String Bxw() {
        return this.A06;
    }

    public final String C7s() {
        return this.A08;
    }

    public final String C8V() {
        return this.A09;
    }

    public final Boolean CSs() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTExploreDict", C51977GAa.A00(this));
    }

    public final String getTitle() {
        return this.A07;
    }

    public C245913dg(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A00 = bool;
        this.A06 = str6;
        this.A07 = str7;
        this.A08 = str8;
        this.A09 = str9;
    }
}
