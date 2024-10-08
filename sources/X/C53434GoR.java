package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.GoR  reason: case insensitive filesystem */
public final class C53434GoR extends AnonymousClass0T0 implements JSA {
    public final List A00;

    public C53434GoR(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C53434GoR F0d() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53434GoR) && 0qQ.A0K(this.A00, ((C53434GoR) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List Bg6() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioGoDarkEventSchema", HTL.A00(this));
    }
}
