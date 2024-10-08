package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.8YF  reason: invalid class name */
public final class AnonymousClass8YF extends AnonymousClass0T0 implements AnonymousClass8YG {
    public final int A00;
    public final AnonymousClass4Hy A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AnonymousClass8YF(AnonymousClass4Hy r2, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(r2, 3);
        0qQ.A0B(str3, 4);
        0qQ.A0B(str6, 8);
        0qQ.A0B(str7, 9);
        0qQ.A0B(str8, 10);
        0qQ.A0B(str9, 11);
        0qQ.A0B(str10, 12);
        0qQ.A0B(str11, 13);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = r2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A00 = i;
        this.A08 = str6;
        this.A09 = str7;
        this.A0A = str8;
        this.A0B = str9;
        this.A0C = str10;
        this.A0D = str11;
        this.A02 = user;
    }

    public final AnonymousClass8YF FGH(1E9 r1) {
        return this;
    }

    public final AnonymousClass8YF FGI(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8YF) {
                AnonymousClass8YF r5 = (AnonymousClass8YF) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || this.A00 != r5.A00 || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int i = 0;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A06;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode3 = (((((((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A00) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31;
        User user = this.A02;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode3 + i;
    }

    public final String Ae8() {
        return this.A03;
    }

    public final String Ais() {
        return this.A04;
    }

    public final AnonymousClass4Hy AqD() {
        return this.A01;
    }

    public final String B8a() {
        return this.A06;
    }

    public final String BEy() {
        return this.A07;
    }

    public final int BZD() {
        return this.A00;
    }

    public final String Bxv() {
        return this.A09;
    }

    public final String C2c() {
        return this.A0B;
    }

    public final String C7r() {
        return this.A0D;
    }

    public final User CCd() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryFundraiserDict", C39573A0p.A00(this));
    }

    public final String getEndBackgroundColor() {
        return this.A05;
    }

    public final String getPk() {
        return this.A08;
    }

    public final String getStartBackgroundColor() {
        return this.A0A;
    }

    public final String getTitle() {
        return this.A0C;
    }

    public final AnonymousClass8YG EAL(1E9 r1) {
        return this;
    }
}
