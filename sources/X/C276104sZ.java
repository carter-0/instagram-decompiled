package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4sZ  reason: invalid class name and case insensitive filesystem */
public final class C276104sZ extends AnonymousClass0T0 implements C276114sa {
    public final String A00;
    public final boolean A01;

    public final C276104sZ F7P() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C276104sZ) {
                C276104sZ r5 = (C276104sZ) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BP8() {
        return this.A00;
    }

    public final boolean BU8() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPagingInfo", HU1.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C276104sZ(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
