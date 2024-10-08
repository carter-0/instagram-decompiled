package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4w5  reason: invalid class name and case insensitive filesystem */
public final class C278004w5 extends AnonymousClass0T0 implements C278014w6 {
    public final C278024w7 A00;
    public final C46269DSy A01;
    public final C46269DSy A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final C278004w5 F13() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C278004w5) {
                C278004w5 r5 = (C278004w5) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A05;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A07;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A06;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A03;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C278024w7 r0 = this.A00;
        int hashCode6 = (hashCode5 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Boolean bool2 = this.A04;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C46269DSy dSy = this.A01;
        int hashCode9 = (hashCode8 + (dSy == null ? 0 : dSy.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C46269DSy dSy2 = this.A02;
        if (dSy2 != null) {
            i = dSy2.hashCode();
        }
        return hashCode10 + i;
    }

    public final Integer AYG() {
        return this.A05;
    }

    public final Integer Aiw() {
        return this.A06;
    }

    public final Boolean BAn() {
        return this.A03;
    }

    public final String BCq() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ C278034w8 BE7() {
        return this.A00;
    }

    public final C46269DSy Bqj() {
        return this.A01;
    }

    public final C46269DSy C53() {
        return this.A02;
    }

    public final Boolean Cd6() {
        return this.A04;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTButtonSpec", HTQ.A00(this));
    }

    public final String getActionUrl() {
        return this.A07;
    }

    public final String getSecondaryText() {
        return this.A09;
    }

    public final String getText() {
        return this.A0A;
    }

    public C278004w5(C278024w7 r1, C46269DSy dSy, C46269DSy dSy2, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.A05 = num;
        this.A07 = str;
        this.A06 = num2;
        this.A03 = bool;
        this.A08 = str2;
        this.A00 = r1;
        this.A04 = bool2;
        this.A09 = str3;
        this.A01 = dSy;
        this.A0A = str4;
        this.A02 = dSy2;
    }
}
