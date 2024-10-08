package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class QPg extends AnonymousClass0T0 implements C13896TjJ {
    public final Boolean A00;
    public final List A01;

    public final QPg F4g() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPg) {
                QPg qPg = (QPg) obj;
                if (!0qQ.A0K(this.A01, qPg.A01) || !0qQ.A0K(this.A00, qPg.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List AeA() {
        return this.A01;
    }

    public final Boolean CPB() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGMetaPaymentsSDKAvailabilityDict", C9766RgO.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public QPg(Boolean bool, List list) {
        this.A01 = list;
        this.A00 = bool;
    }
}
