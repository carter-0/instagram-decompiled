package X;

import com.facebook.pando.TreeUpdaterJNI;

public final class BIA extends AnonymousClass0T0 implements DT3 {
    public final String A00;
    public final boolean A01;

    public BIA(boolean z, String str) {
        0qQ.A0B(str, 2);
        this.A01 = z;
        this.A00 = str;
    }

    public final BIA FDF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIA) {
                BIA bia = (BIA) obj;
                if (this.A01 != bia.A01 || !0qQ.A0K(this.A00, bia.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String CDt() {
        return this.A00;
    }

    public final boolean CQ3() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTVideoChatCaptureInfo", C44571Ch5.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return C41845B3m.A01(this.A00, i * 31);
    }
}
