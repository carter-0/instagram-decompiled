package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.3xp  reason: invalid class name and case insensitive filesystem */
public final class C257703xp extends AnonymousClass0T0 implements C257713xq {
    public final Boolean A00;

    public final C257703xp F3Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C257703xp) && 0qQ.A0K(this.A00, ((C257703xp) obj).A00));
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
            linkedHashMap.put(AnonymousClass000.A00(3054), bool);
        }
        return new TreeUpdaterJNI("XDTGestureToActionInfoDict", 0Yt.A0B(linkedHashMap));
    }

    public C257703xp(Boolean bool) {
        this.A00 = bool;
    }
}
