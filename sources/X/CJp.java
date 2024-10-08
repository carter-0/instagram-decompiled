package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CJp extends 17P implements C46245DSa {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.DSa, X.CJp] */
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

    public final C42029BEe F2l() {
        return new C42029BEe(A0g(), A0P());
    }

    public final String getId() {
        return A0g();
    }

    public final String getText() {
        return A0P();
    }
}
