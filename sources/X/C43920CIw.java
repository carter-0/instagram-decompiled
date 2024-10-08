package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CIw  reason: case insensitive filesystem */
public final class C43920CIw extends 17P implements DSI {
    public final List CEY() {
        return A0o(713258463, ImmutablePandoVideoVersion.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIw, X.DSI] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44098CVp.A00(this));
    }

    public final BEI F1n() {
        List CEY = CEY();
        ArrayList A0r = AnonymousClass7TG.A0r(CEY);
        Iterator it = CEY.iterator();
        while (it.hasNext()) {
            C41847B3o.A1Z(A0r, it);
        }
        return new BEI(A0r);
    }
}
