package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ShowreelNativeClientName;
import java.util.List;

public final class BGP extends AnonymousClass0T0 implements C301005yJ {
    public final ShowreelNativeClientName A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public BGP(ShowreelNativeClientName showreelNativeClientName, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        0qQ.A0B(str, 1);
        AnonymousClass7TG.A1R(showreelNativeClientName, str2);
        0qQ.A0B(str4, 8);
        this.A03 = str;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = showreelNativeClientName;
        this.A04 = str2;
        this.A01 = num;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = num2;
    }

    public final BGP F93() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGP) {
                BGP bgp = (BGP) obj;
                if (!0qQ.A0K(this.A03, bgp.A03) || !0qQ.A0K(this.A07, bgp.A07) || !0qQ.A0K(this.A08, bgp.A08) || this.A00 != bgp.A00 || !0qQ.A0K(this.A04, bgp.A04) || !0qQ.A0K(this.A01, bgp.A01) || !0qQ.A0K(this.A05, bgp.A05) || !0qQ.A0K(this.A06, bgp.A06) || !0qQ.A0K(this.A02, bgp.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Abk() {
        return this.A03;
    }

    public final List Acl() {
        return this.A07;
    }

    public final List Acn() {
        return this.A08;
    }

    public final ShowreelNativeClientName Ane() {
        return this.A00;
    }

    public final String AqT() {
        return this.A04;
    }

    public final Integer BCu() {
        return this.A01;
    }

    public final String BOF() {
        return this.A05;
    }

    public final String C4b() {
        return this.A06;
    }

    public final Integer CGY() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTShowreelNativeAnimation", C44351CdX.A00(this));
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A00, (((AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31);
        return AnonymousClass7TF.A08(this.A06, (((AnonymousClass7TF.A08(this.A04, A072) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
