package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3lb  reason: invalid class name and case insensitive filesystem */
public final class C250533lb extends AnonymousClass0T0 implements C67241sS {
    public final Boolean A00;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final C250533lb F8M() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250533lb) {
                C250533lb r5 = (C250533lb) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07)) {
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
        Double d = this.A01;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.A04;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.A02;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d3 = this.A03;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        List list = this.A07;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode7 + i;
    }

    public final /* bridge */ /* synthetic */ C277094uQ AKN() {
        return new C277094uQ(this);
    }

    public final Boolean B1J() {
        return this.A00;
    }

    public final Double BPU() {
        return this.A01;
    }

    public final String Be8() {
        return this.A04;
    }

    public final String Be9() {
        return this.A05;
    }

    public final Double BeX() {
        return this.A02;
    }

    public final String BiN() {
        return this.A06;
    }

    public final Double C7G() {
        return this.A03;
    }

    public final List CCl() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPushupClientGapRulesClientDict", C51978GAb.A00(this));
    }

    public C250533lb(Boolean bool, Double d, Double d2, Double d3, String str, String str2, String str3, List list) {
        this.A00 = bool;
        this.A01 = d;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = d2;
        this.A06 = str3;
        this.A03 = d3;
        this.A07 = list;
    }
}
