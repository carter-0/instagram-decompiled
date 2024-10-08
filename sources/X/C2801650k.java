package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.50k  reason: invalid class name and case insensitive filesystem */
public final class C2801650k extends AnonymousClass0T0 implements C2801750l {
    public final List A00;

    public final C2801650k F3i() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2801650k) && 0qQ.A0K(this.A00, ((C2801650k) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final List AZX() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHighlightsInfoDict", B6P.A00(this));
    }

    public C2801650k(List list) {
        this.A00 = list;
    }
}
