package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class QPi extends AnonymousClass0T0 implements C13897TjK {
    public final String A00;
    public final List A01;

    public final QPi F4i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPi) {
                QPi qPi = (QPi) obj;
                if (!0qQ.A0K(this.A00, qPi.A00) || !0qQ.A0K(this.A01, qPi.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Bb5() {
        return this.A00;
    }

    public final List C38() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGMetaPaymentsSDKPaymentConfigDict", C9768RgQ.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public QPi(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
