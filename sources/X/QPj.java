package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class QPj extends AnonymousClass0T0 implements C13898TjL {
    public final String A00;
    public final String A01;
    public final List A02;

    public final QPj F4j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPj) {
                QPj qPj = (QPj) obj;
                if (!0qQ.A0K(this.A00, qPj.A00) || !0qQ.A0K(this.A01, qPj.A01) || !0qQ.A0K(this.A02, qPj.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List CDG() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGMetaPaymentsSDKReceiverInfoDict", C9770RgS.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public QPj(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
