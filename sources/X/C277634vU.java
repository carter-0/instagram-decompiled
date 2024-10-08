package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vU  reason: invalid class name and case insensitive filesystem */
public final class C277634vU extends AnonymousClass0T0 implements C277644vV {
    public final boolean A00;

    public final C277634vU F4U() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277634vU) && this.A00 == ((C277634vU) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_enabled_for_broadcast", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveFriendChat", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277634vU(boolean z) {
        this.A00 = z;
    }
}
