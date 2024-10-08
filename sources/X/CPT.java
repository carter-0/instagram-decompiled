package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CPT extends 17P implements C46262DSr {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.DSr, X.CPT] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getId() != null) {
            C41845B3m.A0x(getId(), A1H);
        }
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final BHB FAz() {
        return new BHB(A0e(), A0X());
    }

    public final String getId() {
        return A0e();
    }

    public final String getText() {
        return A0X();
    }
}
