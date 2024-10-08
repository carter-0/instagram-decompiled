package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4gn  reason: invalid class name and case insensitive filesystem */
public final class C270474gn extends AnonymousClass0T0 implements C270484go {
    public final List A00;

    public C270474gn(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C270474gn F1Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C270474gn) && 0qQ.A0K(this.A00, ((C270474gn) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List Ach() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsAssetRecommendationInfo", CVX.A00(this));
    }
}
