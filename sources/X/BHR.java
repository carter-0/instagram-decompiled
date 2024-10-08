package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class BHR extends AnonymousClass0T0 implements C46263DSs {
    public final int A00;
    public final int A01;

    public final BHR FBj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHR) {
                BHR bhr = (BHR) obj;
                if (!(this.A00 == bhr.A00 && this.A01 == bhr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final int B1Q() {
        return this.A00;
    }

    public final int Byb() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        B1Q();
        A1H.put("end", Integer.valueOf(B1Q()));
        Byb();
        return C41845B3m.A0T("XDTStoryTextAttributionBoldRange", C41845B3m.A0u("start", Integer.valueOf(Byb()), A1H));
    }

    public BHR(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
