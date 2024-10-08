package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4bI  reason: invalid class name and case insensitive filesystem */
public final class C267274bI extends AnonymousClass0T0 implements C267284bJ {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C267274bI(User user, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, boolean z) {
        0qQ.A0B(str3, 7);
        0qQ.A0B(user, 11);
        this.A05 = str;
        this.A01 = bool;
        this.A0A = z;
        this.A02 = bool2;
        this.A06 = str2;
        this.A03 = num;
        this.A07 = str3;
        this.A04 = num2;
        this.A08 = str4;
        this.A09 = list;
        this.A00 = user;
    }

    public final C267274bI FDr(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C267274bI) {
                C267274bI r5 = (C267274bI) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || this.A0A != r5.A0A || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B7i() {
        return this.A05;
    }

    public final Boolean BP3() {
        return this.A02;
    }

    public final Integer BWT() {
        return this.A03;
    }

    public final Integer Bfn() {
        return this.A04;
    }

    public final List BwG() {
        return this.A09;
    }

    public final User CCd() {
        return this.A00;
    }

    public final Boolean CWC() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMashupOriginalMediaInfo", C41877B4v.A00(this));
    }

    public final String getMediaType() {
        return this.A06;
    }

    public final String getPk() {
        return this.A07;
    }

    public final String getProductType() {
        return this.A08;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.A01;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A0A) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int hashCode8 = (((i7 + hashCode5) * 31) + this.A07.hashCode()) * 31;
        Integer num2 = this.A04;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i8 = (hashCode8 + hashCode6) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        List list = this.A09;
        if (list != null) {
            i = list.hashCode();
        }
        return ((i9 + i) * 31) + this.A00.hashCode();
    }

    public final boolean isPivotPageAvailable() {
        return this.A0A;
    }

    public final C267284bJ E9c(1E9 r1) {
        return this;
    }
}
