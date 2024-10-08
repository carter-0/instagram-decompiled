package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3IB  reason: invalid class name */
public final class AnonymousClass3IB extends AnonymousClass0T0 implements AnonymousClass3IC {
    public final C42123BIb A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public final AnonymousClass3IB FEh() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IB) {
                AnonymousClass3IB r5 = (AnonymousClass3IB) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08)) {
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
        Boolean bool = this.A01;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C42123BIb bIb = this.A00;
        int hashCode3 = (hashCode2 + (bIb == null ? 0 : bIb.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.A09;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode7 = (((((hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31;
        String str3 = this.A08;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode7 + i;
    }

    public AnonymousClass3IB(C42123BIb bIb, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, List list) {
        0qQ.A0B(str3, 8);
        0qQ.A0B(str4, 9);
        this.A04 = str;
        this.A01 = bool;
        this.A00 = bIb;
        this.A05 = str2;
        this.A09 = list;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
    }

    public final String AZ4() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ DTZ BMG() {
        return this.A00;
    }

    public final String Bfc() {
        return this.A05;
    }

    public final List Bip() {
        return this.A09;
    }

    public final Boolean Bvm() {
        return this.A02;
    }

    public final Boolean Bvs() {
        return this.A03;
    }

    public final String C3P() {
        return this.A06;
    }

    public final String C3Q() {
        return this.A07;
    }

    public final String C9L() {
        return this.A08;
    }

    public final Boolean CRL() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTResearchSurvey", C44870CmM.A00(this));
    }
}
