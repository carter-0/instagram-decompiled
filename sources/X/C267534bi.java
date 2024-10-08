package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4bi  reason: invalid class name and case insensitive filesystem */
public final class C267534bi extends AnonymousClass0T0 implements C267544bj {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final C267534bi F2t() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C267534bi) {
                C267534bi r5 = (C267534bi) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.A00;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String AqF() {
        return this.A01;
    }

    public final String Bsz() {
        return this.A02;
    }

    public final String Bt0() {
        return this.A03;
    }

    public final String Bzy() {
        return this.A04;
    }

    public final Integer Bzz() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBPageCallToActionIXLabelBundle", CXU.A00(this));
    }

    public C267534bi(Integer num, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = num;
    }
}
