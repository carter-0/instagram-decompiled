package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.CIt  reason: case insensitive filesystem */
public final class C43917CIt extends 17P implements DSW {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CIt, X.DSW] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        getEffectId();
        A1H.put("effect_id", Long.valueOf(getEffectId()));
        getSegmentIndex();
        return C41845B3m.A0S(this, C41845B3m.A0u("segment_index", Integer.valueOf(getSegmentIndex()), A1H));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.pando.TreeJNI, X.CIt, X.17P] */
    public final BEH F1k() {
        return new BEH(A03(-1468661111), getIntValueByHashCode(-614025018));
    }

    public final long getEffectId() {
        return A03(-1468661111);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CIt] */
    public final int getSegmentIndex() {
        return getIntValueByHashCode(-614025018);
    }
}
