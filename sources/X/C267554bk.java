package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4bk  reason: invalid class name and case insensitive filesystem */
public final class C267554bk extends AnonymousClass0T0 implements C267564bl {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C267554bk(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = i;
    }

    public final C267554bk F72() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C267554bk) {
                C267554bk r5 = (C267554bk) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || this.A05 != r5.A05 || this.A06 != r5.A06 || this.A07 != r5.A07 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Afn() {
        return this.A01;
    }

    public final String Afq() {
        return this.A02;
    }

    public final boolean Aqa() {
        return this.A05;
    }

    public final String Bh8() {
        return this.A04;
    }

    public final int BrZ() {
        return this.A00;
    }

    public final boolean COl() {
        return this.A06;
    }

    public final boolean Ca2() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOpalInfo", Cb7.A00(this));
    }

    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (hashCode3 + i2) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i8 + i) * 31) + this.A00;
    }
}
