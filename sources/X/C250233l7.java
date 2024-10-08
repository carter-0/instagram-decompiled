package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3l7  reason: invalid class name and case insensitive filesystem */
public final class C250233l7 extends AnonymousClass0T0 implements C250243l8 {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final C250233l7 F1L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250233l7) {
                C250233l7 r5 = (C250233l7) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A01;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public final String Amm() {
        return this.A02;
    }

    public final String BEx() {
        return this.A03;
    }

    public final String BIn() {
        return this.A04;
    }

    public final Integer BXU() {
        return this.A01;
    }

    public final Boolean Bus() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClickToJoinAdsInfo", C41881B4z.A00(this));
    }

    public C250233l7(Boolean bool, Integer num, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = num;
        this.A00 = bool;
    }
}
