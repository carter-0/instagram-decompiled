package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4yn  reason: invalid class name and case insensitive filesystem */
public final class C279534yn extends AnonymousClass0T0 implements C279544yo {
    public final List A00;

    public C279534yn(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final C279534yn FDo() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C279534yn) && 0qQ.A0K(this.A00, ((C279534yn) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List C5F() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateTimedTextsInfo", C44626Chy.A00(this));
    }
}
