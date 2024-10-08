package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class CNk extends 17P implements C46259DSo {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.CNk, X.DSo] */
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

    public final BG7 F8N() {
        return new BG7(A0Y(), A0V());
    }

    public final String getTitle() {
        return A0Y();
    }

    public final String getUrl() {
        return A0V();
    }
}
