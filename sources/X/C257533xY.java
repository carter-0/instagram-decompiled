package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3xY  reason: invalid class name and case insensitive filesystem */
public final class C257533xY extends AnonymousClass0T0 implements C257543xZ {
    public final String A00;
    public final String A01;
    public final String A02;

    public final C257533xY FF9() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257533xY) {
                C257533xY r5 = (C257533xY) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdDisclaimerInfoDict", C55056HbR.A00(this));
    }

    public final String getText() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A01;
    }

    public final String getUrl() {
        return this.A02;
    }

    public C257533xY(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
