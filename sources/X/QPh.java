package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class QPh extends AnonymousClass0T0 implements C269964fy {
    public final C13899TjM A00;

    public final QPh F4h() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof QPh) && 0qQ.A0K(this.A00, ((QPh) obj).A00));
    }

    public final C13899TjM An7() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (An7() != null) {
            C13899TjM An7 = An7();
            if (An7 != null) {
                treeUpdaterJNI = An7.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("checkoutSetupPayload", treeUpdaterJNI);
        }
        return new TreeUpdaterJNI("XDTIGMetaPaymentsSDKIABPostClickDataExtensionDict", 0Yt.A0B(A1H));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public QPh(C13899TjM tjM) {
        this.A00 = tjM;
    }
}
