package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.Up0  reason: case insensitive filesystem */
public final class C16122Up0 extends 17P implements XAK {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.Up0, X.17P] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (A0e() != null) {
            C41845B3m.A0x(A0e(), linkedHashMap);
        }
        return new TreeUpdaterJNI(0Yt.A0B(linkedHashMap), this);
    }

    public final C15064UNh FCV() {
        return new C15064UNh(A0e());
    }
}
