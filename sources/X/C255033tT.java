package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3tT  reason: invalid class name and case insensitive filesystem */
public final class C255033tT extends AnonymousClass0T0 implements C255043tU {
    public final Boolean A00;

    public final C255033tT F4s() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C255033tT) && 0qQ.A0K(this.A00, ((C255033tT) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("should_disable", bool);
        }
        return new TreeUpdaterJNI("XDTIGPersistentIABMetadata", 0Yt.A0B(linkedHashMap));
    }

    public C255033tT(Boolean bool) {
        this.A00 = bool;
    }
}
