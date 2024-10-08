package X;

import com.instagram.model.shopping.ProductSource;
import java.util.List;
import java.util.Set;

/* renamed from: X.Tpd  reason: case insensitive filesystem */
public final class C14087Tpd extends AnonymousClass0T0 {
    public final ProductSource A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final Set A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14087Tpd) {
                C14087Tpd tpd = (C14087Tpd) obj;
                if (!0qQ.A0K(this.A02, tpd.A02) || !0qQ.A0K(this.A04, tpd.A04) || !0qQ.A0K(this.A00, tpd.A00) || !0qQ.A0K(this.A05, tpd.A05) || !0qQ.A0K(this.A06, tpd.A06) || !0qQ.A0K(this.A03, tpd.A03) || this.A0A != tpd.A0A || this.A08 != tpd.A08 || this.A07 != tpd.A07 || this.A09 != tpd.A09 || !0qQ.A0K(this.A01, tpd.A01) || this.A0B != tpd.A0B || this.A0C != tpd.A0C) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C14087Tpd A00(ProductSource productSource, C14087Tpd tpd, String str, String str2, List list, List list2, Set set, Set set2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        int i2 = i;
        boolean z7 = z4;
        String str3 = str2;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        List list3 = list2;
        Set set3 = set2;
        Set set4 = set;
        ProductSource productSource2 = productSource;
        List list4 = list;
        String str4 = str;
        C14087Tpd tpd2 = tpd;
        if ((i & 1) != 0) {
            str4 = tpd2.A02;
        }
        if ((i & 2) != 0) {
            list4 = tpd2.A04;
        }
        if ((i & 4) != 0) {
            productSource2 = tpd2.A00;
        }
        if ((i & 8) != 0) {
            set4 = tpd2.A05;
        }
        if ((i & 16) != 0) {
            set3 = tpd2.A06;
        }
        if ((i & 32) != 0) {
            list3 = tpd2.A03;
        }
        if ((i & 64) != 0) {
            z10 = tpd2.A0A;
        }
        if ((i2 & 128) != 0) {
            z9 = tpd2.A08;
        }
        if ((i2 & 256) != 0) {
            z8 = tpd2.A07;
        }
        if ((i2 & 512) != 0) {
            z5 = tpd2.A09;
        } else {
            z5 = false;
        }
        if ((i2 & 1024) != 0) {
            str3 = tpd2.A01;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            z6 = tpd2.A0B;
        } else {
            z6 = false;
        }
        if ((i2 & 4096) != 0) {
            z7 = tpd2.A0C;
        }
        AnonymousClass7TG.A1N(str4, list4);
        C51973G9u.A0r(3, set4, set3, list3);
        return new C14087Tpd(productSource2, str4, str3, list4, list3, set4, set3, z10, z9, z8, z5, z6, z7);
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        int A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A05, (AnonymousClass7TF.A07(this.A04, A0O) + AnonymousClass7TG.A0C(this.A00)) * 31))))));
        return DbS.A06(this.A0C, AnonymousClass7TF.A09(this.A0B, (AnonymousClass7TF.A09(this.A09, A092) + C41845B3m.A00(this.A01)) * 31));
    }

    public C14087Tpd(ProductSource productSource, String str, String str2, List list, List list2, Set set, Set set2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = str;
        this.A04 = list;
        this.A00 = productSource;
        this.A05 = set;
        this.A06 = set2;
        this.A03 = list2;
        this.A0A = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A09 = z4;
        this.A01 = str2;
        this.A0B = z5;
        this.A0C = z6;
    }
}
