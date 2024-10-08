package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.48G  reason: invalid class name */
public final class AnonymousClass48G extends AnonymousClass0T0 implements AnonymousClass48H {
    public final String A00;
    public final String A01;

    public final AnonymousClass48G F1G() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass48G) {
                AnonymousClass48G r5 = (AnonymousClass48G) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String Bxz() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTChainingInfo", B5Y.A00(this));
    }

    public final String getAlgorithm() {
        return this.A00;
    }

    public AnonymousClass48G(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
