package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BIL extends AnonymousClass0T0 implements C270554gv {
    public final int A00;
    public final long A01;

    public final BIL FDl() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BIL) {
                BIL bil = (BIL) obj;
                if (!(this.A00 == bil.A00 && this.A01 == bil.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int BHe() {
        return this.A00;
    }

    public final long BiS() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BHe();
        A1H.put("insert_position_idx", Integer.valueOf(BHe()));
        BiS();
        return C41845B3m.A0T("XDTClipNuxInfo", C41845B3m.A0u("qp_id", Long.valueOf(BiS()), A1H));
    }

    public final int hashCode() {
        long j = this.A01;
        return (this.A00 * 31) + ((int) (j ^ (j >>> 32)));
    }

    public BIL(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
