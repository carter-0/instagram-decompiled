package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class BE7 extends AnonymousClass0T0 implements C270534gt {
    public final List A00;

    public final BE7 F1V() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BE7) && 0qQ.A0K(this.A00, ((BE7) obj).A00));
    }

    public final List B9M() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTClipsExternalMediaInfo", C44085CVc.A00(this));
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public BE7(List list) {
        this.A00 = list;
    }
}
