package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4oI  reason: invalid class name and case insensitive filesystem */
public final class C274424oI extends AnonymousClass0T0 implements C274434oJ {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;

    public final C274424oI FCf() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274424oI) {
                C274424oI r5 = (C274424oI) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A04;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A05;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A06;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A07;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str = this.A08;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A09;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode9 + i;
    }

    public final Boolean Akx() {
        return this.A00;
    }

    public final Boolean Aky() {
        return this.A01;
    }

    public final Boolean Al6() {
        return this.A02;
    }

    public final Boolean Al7() {
        return this.A03;
    }

    public final Boolean BBX() {
        return this.A04;
    }

    public final Boolean Bac() {
        return this.A07;
    }

    public final String Bad() {
        return this.A08;
    }

    public final String Bae() {
        return this.A09;
    }

    public final Boolean CZF() {
        return this.A05;
    }

    public final Boolean CZG() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppPinnedPostInfo", C16845V8a.A00(this));
    }

    public C274424oI(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str, String str2) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
        this.A04 = bool5;
        this.A05 = bool6;
        this.A06 = bool7;
        this.A07 = bool8;
        this.A08 = str;
        this.A09 = str2;
    }
}
