package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4g1  reason: invalid class name and case insensitive filesystem */
public final class C269994g1 extends AnonymousClass0T0 implements C270004g2 {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public final C269994g1 F22() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C269994g1) {
                C269994g1 r5 = (C269994g1) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
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
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String BVU() {
        return this.A01;
    }

    public final String Bt5() {
        return this.A02;
    }

    public final Boolean CQ8() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommerceOnboardingConfig", CWC.A00(this));
    }

    public C269994g1(Boolean bool, String str, String str2) {
        this.A00 = bool;
        this.A01 = str;
        this.A02 = str2;
    }
}
