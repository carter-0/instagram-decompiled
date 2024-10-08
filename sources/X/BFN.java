package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BFN extends AnonymousClass0T0 implements DSK {
    public final List A00;

    public BFN(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final BFN F5g() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BFN) && 0qQ.A0K(this.A00, ((BFN) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List BwO() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTLumenLoggingInfo", Ca4.A00(this));
    }
}
