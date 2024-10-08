package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;

/* renamed from: X.53S  reason: invalid class name */
public final class AnonymousClass53S extends AnonymousClass0T0 implements C269944fw {
    public final IGAdCreationOptimizationPayloadDict A00;

    public final AnonymousClass53S F4D() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass53S) && 0qQ.A0K(this.A00, ((AnonymousClass53S) obj).A00));
    }

    public final int hashCode() {
        IGAdCreationOptimizationPayloadDict iGAdCreationOptimizationPayloadDict = this.A00;
        if (iGAdCreationOptimizationPayloadDict == null) {
            return 0;
        }
        return iGAdCreationOptimizationPayloadDict.hashCode();
    }

    public final IGAdCreationOptimizationPayloadDict AYz() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGIABAutofillAdsPersonalizationPostClickDataExtensionDict", C44180CYt.A00(this));
    }

    public AnonymousClass53S(IGAdCreationOptimizationPayloadDict iGAdCreationOptimizationPayloadDict) {
        this.A00 = iGAdCreationOptimizationPayloadDict;
    }
}
