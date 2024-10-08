package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.9ci  reason: invalid class name and case insensitive filesystem */
public final class C381869ci extends AnonymousClass0T0 implements DSS {
    public final List A00;

    public C381869ci(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C381869ci FDn() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C381869ci) && 0qQ.A0K(this.A00, ((C381869ci) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List Bzf() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateTimedStickersInfo", C393809x2.A00(this));
    }
}
