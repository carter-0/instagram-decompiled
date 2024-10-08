package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3vM  reason: invalid class name and case insensitive filesystem */
public final class C256183vM extends AnonymousClass0T0 implements C256193vN {
    public final List A00;

    public C256183vM(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C256183vM FDD(1E9 r1) {
        return this;
    }

    public final C256183vM FDE(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C256183vM) && 0qQ.A0K(this.A00, ((C256183vM) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List CHj() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserTagInfosDict", B4S.A00(this));
    }

    public final C256193vN E9W(1E9 r1) {
        return this;
    }
}
