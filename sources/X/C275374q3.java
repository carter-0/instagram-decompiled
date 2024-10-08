package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4q3  reason: invalid class name and case insensitive filesystem */
public final class C275374q3 extends AnonymousClass0T0 implements C275384q4 {
    public final List A00;

    public final C275374q3 F38(1E9 r1) {
        return this;
    }

    public final C275374q3 F39(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C275374q3) && 0qQ.A0K(this.A00, ((C275374q3) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final List CHj() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedItemProductTagsContainerDict", AnonymousClass91F.A00(this));
    }

    public C275374q3(List list) {
        this.A00 = list;
    }

    public final C275384q4 E7O(1E9 r1) {
        return this;
    }
}
