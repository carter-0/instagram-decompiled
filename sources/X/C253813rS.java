package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3rS  reason: invalid class name and case insensitive filesystem */
public final class C253813rS extends AnonymousClass0T0 implements C253823rT {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final C253813rS F89() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C253813rS) {
                C253813rS r5 = (C253813rS) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A02, r5.A02) || this.A01 != r5.A01 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        String str = this.A02;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.A01) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final int B1Q() {
        return this.A00;
    }

    public final int Byb() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileContextLink", C41870B4o.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getUsername() {
        return this.A03;
    }

    public C253813rS(int i, String str, int i2, String str2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
        this.A03 = str2;
    }
}
