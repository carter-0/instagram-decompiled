package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CQB extends 17P implements C46267DSw {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.CQB, com.facebook.pando.TreeJNI, X.DSw] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getTitle() != null) {
            C41845B3m.A12(getTitle(), A1H);
        }
        if (getUrl() != null) {
            C41845B3m.A0y(getUrl(), A1H);
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final C42105BHi FCE() {
        return new C42105BHi(A0S(), A0R());
    }

    public final String getTitle() {
        return A0S();
    }

    public final String getUrl() {
        return A0R();
    }
}
