package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.ImmutablePandoIGAdCreationOptimizationPayloadDict;

public final class CKz extends 17P implements C269944fw {
    public final IGAdCreationOptimizationPayloadDict AYz() {
        return (IGAdCreationOptimizationPayloadDict) A05(-82262769, ImmutablePandoIGAdCreationOptimizationPayloadDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CKz, X.4fw] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44180CYt.A00(this));
    }

    public final AnonymousClass53S F4D() {
        IGAdCreationOptimizationPayloadDictImpl iGAdCreationOptimizationPayloadDictImpl;
        IGAdCreationOptimizationPayloadDict AYz = AYz();
        if (AYz != null) {
            iGAdCreationOptimizationPayloadDictImpl = AYz.F3m();
        } else {
            iGAdCreationOptimizationPayloadDictImpl = null;
        }
        return new AnonymousClass53S(iGAdCreationOptimizationPayloadDictImpl);
    }
}
