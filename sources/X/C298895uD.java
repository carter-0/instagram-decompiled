package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5uD  reason: invalid class name and case insensitive filesystem */
public final class C298895uD extends AnonymousClass0T0 implements C298905uE {
    public final int A00;
    public final String A01;
    public final String A02;

    public C298895uD(int i, String str, String str2) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public final C298895uD F8r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C298895uD) {
                C298895uD r5 = (C298895uD) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00 * 31) + this.A01.hashCode()) * 31;
        String str = this.A02;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final int B9j() {
        return this.A00;
    }

    public final String Bpj() {
        return this.A01;
    }

    public final String Bpk() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSchoolsBadgeMetadataDict", C44332CdE.A00(this));
    }
}
