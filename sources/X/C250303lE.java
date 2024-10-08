package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3lE  reason: invalid class name and case insensitive filesystem */
public final class C250303lE extends AnonymousClass0T0 implements C250313lF {
    public final Boolean A00;

    public final C250303lE F43() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C250303lE) && 0qQ.A0K(this.A00, ((C250303lE) obj).A00));
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean Bu1() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.A00;
        if (bool != null) {
            linkedHashMap.put("should_disable", bool);
        }
        return new TreeUpdaterJNI("XDTIGBrowserPeekMetadata", 0Yt.A0B(linkedHashMap));
    }

    public C250303lE(Boolean bool) {
        this.A00 = bool;
    }
}
