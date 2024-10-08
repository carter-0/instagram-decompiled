package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4xH  reason: invalid class name and case insensitive filesystem */
public final class C278634xH extends AnonymousClass0T0 implements C278644xI {
    public final List A00;

    public C278634xH(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C278634xH F4B() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C278634xH) && 0qQ.A0K(this.A00, ((C278634xH) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List AiA() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGConsiderAndBrowseOptions", C44178CYr.A00(this));
    }
}
