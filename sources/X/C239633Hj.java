package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.reels.netego.BloksStoryNetegoCTAStyle;

/* renamed from: X.3Hj  reason: invalid class name and case insensitive filesystem */
public final class C239633Hj extends AnonymousClass0T0 implements C239643Hk {
    public final int A00;
    public final C61076JwE A01;
    public final BloksStoryNetegoCTAStyle A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public C239633Hj(C61076JwE jwE, BloksStoryNetegoCTAStyle bloksStoryNetegoCTAStyle, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(bloksStoryNetegoCTAStyle, 3);
        0qQ.A0B(str3, 6);
        0qQ.A0B(jwE, 8);
        0qQ.A0B(str5, 10);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = bloksStoryNetegoCTAStyle;
        this.A00 = i;
        this.A08 = z;
        this.A05 = str3;
        this.A09 = z2;
        this.A01 = jwE;
        this.A06 = str4;
        this.A07 = str5;
    }

    public final C239633Hj FEx() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C239633Hj) {
                C239633Hj r5 = (C239633Hj) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || this.A02 != r5.A02 || this.A00 != r5.A00 || this.A08 != r5.A08 || !0qQ.A0K(this.A05, r5.A05) || this.A09 != r5.A09 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AgB() {
        return this.A03;
    }

    public final String AtC() {
        return this.A04;
    }

    public final BloksStoryNetegoCTAStyle AtP() {
        return this.A02;
    }

    public final boolean B7I() {
        return this.A08;
    }

    public final C61076JwE Bax() {
        return this.A01;
    }

    public final String C9L() {
        return this.A07;
    }

    public final boolean CQv() {
        return this.A09;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBloksStoryNetegoDict", C44894Cmk.A00(this));
    }

    public final int getDuration() {
        return this.A00;
    }

    public final String getId() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A06;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A03.hashCode() * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.A02.hashCode()) * 31) + this.A00) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int hashCode4 = (((hashCode3 + i2) * 31) + this.A05.hashCode()) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int hashCode5 = (((hashCode4 + i3) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A06;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.A07.hashCode();
    }
}
