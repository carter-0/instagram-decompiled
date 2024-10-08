package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3Hs  reason: invalid class name and case insensitive filesystem */
public final class C239713Hs extends AnonymousClass0T0 implements C239723Ht {
    public final List A00;

    public final C239713Hs FEm(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C239713Hs) && 0qQ.A0K(this.A00, ((C239713Hs) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final List B0x() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTEmptyStoryStateMediaData", C44880CmW.A00(this));
    }

    public C239713Hs(List list) {
        this.A00 = list;
    }

    public final C239723Ht E9u(1E9 r1) {
        return this;
    }
}
