package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.Dsb  reason: case insensitive filesystem */
public final class C47189Dsb extends AnonymousClass0T0 implements C51947G8q {
    public final List A00;

    public C47189Dsb(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C47189Dsb F0o() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47189Dsb) && 0qQ.A0K(this.A00, ((C47189Dsb) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List BIP() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTBioInterestsResponse", C48322Ecf.A00(this));
    }
}
