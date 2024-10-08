package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.58s  reason: invalid class name and case insensitive filesystem */
public final class C2816158s extends AnonymousClass0T0 implements C2816258t {
    public final String A00;
    public final String A01;

    public C2816158s(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final C2816158s F5Y() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2816158s) {
                C2816158s r5 = (C2816158s) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String Aiu() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveUserPayPinnedRowConfig", C63019KqA.A00(this));
    }

    public final String getDescription() {
        return this.A01;
    }
}
