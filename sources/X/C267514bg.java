package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4bg  reason: invalid class name and case insensitive filesystem */
public final class C267514bg extends AnonymousClass0T0 implements C267524bh {
    public final boolean A00;

    public final C267514bg F5I() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C267514bg) && this.A00 == ((C267514bg) obj).A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stories", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIsCallToActionEnabledBySurfaceDict", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C267514bg(boolean z) {
        this.A00 = z;
    }
}
