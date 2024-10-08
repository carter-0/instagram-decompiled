package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4va  reason: invalid class name and case insensitive filesystem */
public final class C277694va extends AnonymousClass0T0 implements C277704vb {
    public final boolean A00;

    public final C277694va F4P() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277694va) && this.A00 == ((C277694va) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("badges_always_on_enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveBadgesUFI", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277694va(boolean z) {
        this.A00 = z;
    }
}
